import { NativeModules } from 'react-native';

type LochaP2pType = {
  multiply(a: number, b: number): Promise<number>;
};

const { LochaP2p } = NativeModules;

export default LochaP2p as LochaP2pType;
