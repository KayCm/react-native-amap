import type {
  HybridView,
  HybridViewProps,
  HybridViewMethods,
} from 'react-native-nitro-modules'

export interface NitroAmapProps extends HybridViewProps {
   isRed: boolean
}

export interface NitroAmapMethods extends HybridViewMethods {}

export type NitroAmap = HybridView<NitroAmapProps, NitroAmapMethods, { ios: 'swift', android: 'kotlin' }>