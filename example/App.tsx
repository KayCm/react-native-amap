import React from 'react';
import { View, StyleSheet } from 'react-native';
import { NitroAmap } from 'react-native-nitro-amap';

function App(): React.JSX.Element {
  return (<View style={styles.container}>
        <NitroAmap isRed={true} style={styles.view} testID="nitro-amap" />
    </View>);
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  view: {
    width: 300,
    height: 300,
    // backgroundColor:'#789000'
  }});

export default App;
