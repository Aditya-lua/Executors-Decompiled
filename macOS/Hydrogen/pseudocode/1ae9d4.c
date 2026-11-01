
void __ZN89__LT_rustls__msgs__handshake__PresharedKeyOffer_u20_as_u20_rustls__msgs__codec__Codec_GT_4read17h578bdb25b6010cb0E
               (long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  int aiStack_60 [2];
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  func_0x001a8918(aiStack_60);
  lVar4 = lStack_48;
  lVar2 = lStack_50;
  lVar1 = lStack_58;
  if (aiStack_60[0] == 1) {
    param_1[2] = lStack_50;
    param_1[1] = lStack_58;
    param_1[3] = lStack_48;
    *param_1 = -0x8000000000000000;
  }
  else {
    func_0x001a8218(aiStack_60,param_2);
    if (aiStack_60[0] == 1) {
      param_1[2] = lStack_50;
      param_1[1] = lStack_58;
      param_1[3] = lStack_48;
      *param_1 = -0x8000000000000000;
      if (lVar4 != 0) {
        puVar3 = (undefined8 *)(lVar2 + 8);
        do {
          if (puVar3[-1] != 0) {
            func_0x00187bd4(*puVar3,puVar3[-1],1);
          }
          puVar3 = puVar3 + 4;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
      }
      if (lVar1 != 0) {
        func_0x00187bd4(lVar2,lVar1 << 5,8);
      }
    }
    else {
      param_1[1] = lVar2;
      *param_1 = lVar1;
      param_1[3] = lStack_58;
      param_1[2] = lVar4;
      param_1[5] = lStack_48;
      param_1[4] = lStack_50;
    }
  }
  return;
}

