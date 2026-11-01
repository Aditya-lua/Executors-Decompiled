
undefined4 FUN_00609e60(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  undefined4 uVar3;
  long in_x9;
  uint in_w10;
  long lVar4;
  long in_x11;
  long in_x12;
  
  while ((in_x12 != 0 && (in_x12 = in_x11 + -1, *(long *)(in_x9 + in_x11 * 8) == 0))) {
    in_x11 = in_x12;
  }
  if (in_w10 != (uint)in_x11) {
    uVar3 = 0xffffffff;
    if ((uint)in_x11 < in_w10) {
      uVar3 = 1;
    }
    return uVar3;
  }
  lVar4 = (ulong)in_w10 << 3;
  while( true ) {
    if (lVar4 == 0) {
      return 0;
    }
    puVar1 = (ulong *)(param_1 + lVar4);
    puVar2 = (ulong *)(in_x9 + lVar4);
    if (*puVar2 < *puVar1) break;
    lVar4 = lVar4 + -8;
    if (*puVar1 < *puVar2) {
      return 0xffffffff;
    }
  }
  return 1;
}

