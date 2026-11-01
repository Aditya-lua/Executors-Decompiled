
ulong FUN_006fc288(ulong param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  char in_NG;
  char in_OV;
  uint uVar4;
  long lVar5;
  ulong in_x10;
  long unaff_x19;
  
  if (in_NG != in_OV) {
    return param_1;
  }
  lVar5 = *(long *)(unaff_x19 + 0x18);
  if (*(int *)(lVar5 + (in_x10 & 0xffffffff) * 0x10 + 0xc) == 0) {
    uVar4 = (uint)param_1;
    lVar1 = lVar5;
    while (1 < uVar4) {
      iVar2 = (int)param_1 >> 1;
      lVar3 = 0;
      if (*(int *)(lVar1 + (long)iVar2 * 0x10 + 0xc) != 0) {
        lVar3 = (long)(param_1 << 0x20) >> 0x21;
      }
      lVar1 = lVar1 + lVar3 * 0x10;
      uVar4 = (int)param_1 - iVar2;
      param_1 = (ulong)uVar4;
    }
    uVar4 = (uint)((ulong)(lVar1 - lVar5) >> 4);
    if (*(int *)(lVar1 + 0xc) != 0) {
      uVar4 = uVar4 + 1;
    }
    param_1 = (ulong)uVar4;
    if (*(int *)(unaff_x19 + 0xc) < 1) {
      *(uint *)(unaff_x19 + 0xc) = -uVar4;
      return param_1;
    }
  }
  return param_1;
}

