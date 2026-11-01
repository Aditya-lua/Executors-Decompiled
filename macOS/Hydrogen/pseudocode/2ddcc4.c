
long FUN_002ddcc4(long *param_1,long param_2,ulong param_3,long param_4)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  
  uVar2 = (uint)*(byte *)(param_1 + 0x53);
  if (*(byte *)(param_1 + 0x53) - 3 < 2) {
    uVar2 = 1;
    *(undefined1 *)(param_1 + 0x53) = 1;
  }
  if ((param_2 == 0) && (uVar2 == 1)) {
    if ((param_4 == 0) || (*param_1 == param_4)) {
      return 1;
    }
  }
  else if ((param_4 == 0) || ((uVar2 != 0 && (*param_1 == param_4)))) {
    if (1 < uVar2 - 1) {
      return 0;
    }
    plVar4 = (long *)param_1[1];
    uVar2 = *(uint *)(*plVar4 + 0x28);
    goto joined_r0x002ddee4;
  }
  func_0x00373e9c(0xa295e8,&DAT_0031c068);
  plVar4 = (long *)0xa3b258;
  if (((((lRam0000000000a3b258 != param_4) &&
        (plVar4 = (long *)0xa3b290, lRam0000000000a3b290 != param_4)) &&
       (plVar4 = (long *)0xa3b2c8, lRam0000000000a3b2c8 != param_4)) &&
      ((plVar4 = (long *)0xa3b300, lRam0000000000a3b300 != param_4 &&
       (plVar4 = (long *)0xa3b338, lRam0000000000a3b338 != param_4)))) &&
     ((plVar4 = (long *)0xa3b370, lRam0000000000a3b370 != param_4 &&
      ((plVar4 = (long *)0xa3b3a8, lRam0000000000a3b3a8 != param_4 &&
       (plVar4 = (long *)0xa3b3e0, lRam0000000000a3b3e0 != param_4)))))) {
    param_1[1] = 0;
    return 0;
  }
  *param_1 = param_4;
  param_1[1] = (long)plVar4;
  uVar2 = *(uint *)(param_4 + 0x28);
joined_r0x002ddee4:
  if (uVar2 < 0x81) {
    lVar5 = plVar4[1];
    uVar3 = lVar5 * 2;
    if (0x80 < uVar3) {
      func_0x0079ebf0();
      lVar5 = func_0x0036e274();
      if (lVar5 != 0) {
        _bzero(lVar5,0x2a0);
      }
      return lVar5;
    }
    if (uVar3 != param_3) {
      return 0;
    }
    if (param_2 == 0) {
      func_0x0028f83c(0x1c,0,100,"/aws-lc/crypto/fipsmodule/hmac/hmac.c",0x256);
      return 0;
    }
    iVar1 = (*(code *)plVar4[5])(param_1 + 0x1d,param_2,(ulong)uVar2 << 3);
    if ((iVar1 != 0) &&
       (iVar1 = (*(code *)plVar4[5])(param_1 + 0x38,param_2 + lVar5,(ulong)uVar2 << 3), iVar1 != 0))
    {
      param_1[0x17] = param_1[0x32];
      param_1[0x16] = param_1[0x31];
      param_1[0x19] = param_1[0x34];
      param_1[0x18] = param_1[0x33];
      param_1[0x1b] = param_1[0x36];
      param_1[0x1a] = param_1[0x35];
      param_1[0x1c] = param_1[0x37];
      param_1[0xf] = param_1[0x2a];
      param_1[0xe] = param_1[0x29];
      param_1[0x11] = param_1[0x2c];
      param_1[0x10] = param_1[0x2b];
      param_1[0x13] = param_1[0x2e];
      param_1[0x12] = param_1[0x2d];
      param_1[0x15] = param_1[0x30];
      param_1[0x14] = param_1[0x2f];
      param_1[7] = param_1[0x22];
      param_1[6] = param_1[0x21];
      param_1[9] = param_1[0x24];
      param_1[8] = param_1[0x23];
      param_1[0xb] = param_1[0x26];
      param_1[10] = param_1[0x25];
      param_1[0xd] = param_1[0x28];
      param_1[0xc] = param_1[0x27];
      param_1[3] = param_1[0x1e];
      param_1[2] = param_1[0x1d];
      param_1[5] = param_1[0x20];
      param_1[4] = param_1[0x1f];
      *(undefined1 *)(param_1 + 0x53) = 1;
      return 1;
    }
  }
  else {
    func_0x0079ebc8();
  }
  func_0x0036e464(param_1,0x2a0);
  return 0;
}

