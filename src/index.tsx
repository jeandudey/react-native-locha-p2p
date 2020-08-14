import { NativeModules } from 'react-native';

type LochaP2PType = {
  hello(input: string): string;
};

const { LochaP2P } = NativeModules;

export default LochaP2P as LochaP2PType;