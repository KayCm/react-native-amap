import { getHostComponent, type HybridRef } from 'react-native-nitro-modules'
import NitroAmapConfig from '../nitrogen/generated/shared/json/NitroAmapConfig.json'
import type {
  NitroAmapProps,
  NitroAmapMethods,
} from './specs/nitro-amap.nitro'


export const NitroAmap = getHostComponent<NitroAmapProps, NitroAmapMethods>(
  'NitroAmap',
  () => NitroAmapConfig
)

export type NitroAmapRef = HybridRef<NitroAmapProps, NitroAmapMethods>
