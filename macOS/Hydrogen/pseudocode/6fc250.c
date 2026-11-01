
ulong FUN_006fc250(ulong param_1,ulong param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  long in_x9;
  long lVar5;
  ulong in_x10;
  long unaff_x19;
  int unaff_w20;
  
  if (*(int *)(in_x9 + (in_x10 & 0xffffffff) * 0x10 + 0xc) == 0) {
    uVar4 = (uint)param_1;
    if ((int)uVar4 < 1) {
      return param_1;
    }
    lVar5 = *(long *)(unaff_x19 + 0x18);
    lVar3 = lVar5;
    if (*(int *)(lVar5 + (ulong)(uVar4 - 1) * 0x10 + 0xc) == 0) {
      while (1 < uVar4) {
        iVar1 = (int)param_1 >> 1;
        lVar2 = 0;
        if (*(int *)(lVar3 + (long)iVar1 * 0x10 + 0xc) != 0) {
          lVar2 = (long)(param_1 << 0x20) >> 0x21;
        }
        uVar4 = (int)param_1 - iVar1;
        param_1 = (ulong)uVar4;
        lVar3 = lVar3 + lVar2 * 0x10;
      }
      uVar4 = (uint)((ulong)(lVar3 - lVar5) >> 4);
      if (*(int *)(lVar3 + 0xc) != 0) {
        uVar4 = uVar4 + 1;
      }
      param_1 = (ulong)uVar4;
      if (*(int *)(unaff_x19 + 0xc) < 1) {
        *(uint *)(unaff_x19 + 0xc) = -uVar4;
        return param_1;
      }
    }
  }
  else {
    param_1 = param_2;
    if (*(int *)(unaff_x19 + 0xc) < 1) {
      *(int *)(unaff_x19 + 0xc) = 1 - unaff_w20;
      return param_2;
    }
  }
  return param_1;
}

