
uint FUN_00478e10(ulong param_1,int param_2)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  uint uVar4;
  long in_x10;
  ulong in_x11;
  
  param_1 = param_1 >> 0x15;
  if (in_x11 < 0x15) {
    uVar3 = (ulong)(*(uint *)(in_x10 + 4) >> 0x15);
    if (in_x11 == 0) {
      lVar2 = uVar3 + ~param_1;
      uVar1 = 0;
      goto joined_r0x00478e4c;
    }
  }
  else {
    uVar3 = 0x13f;
  }
  uVar1 = *(uint *)(in_x10 + -4) & 0x1fffff;
  lVar2 = uVar3 + ~param_1;
joined_r0x00478e4c:
  if (lVar2 != 0) {
    uVar4 = 0;
    do {
      uVar4 = uVar4 + (byte)(&UNK_00891d14)[param_1];
      if (param_2 - uVar1 < uVar4) break;
      param_1 = param_1 + 1;
    } while (uVar3 - 1 != param_1);
  }
  return (uint)param_1 & 1;
}

