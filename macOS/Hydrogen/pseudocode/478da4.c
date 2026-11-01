
uint FUN_00478da4(long param_1,int param_2)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  
  uVar2 = param_2 * 0x800;
  if ((uint)(*(int *)(&UNK_00897ca0 + (param_1 + 5) * 4) << 0xb) <= uVar2) {
    param_1 = param_1 + 5;
  }
  if ((uint)(*(int *)(&UNK_00897ca0 + (param_1 + 3) * 4) << 0xb) <= uVar2) {
    param_1 = param_1 + 3;
  }
  if ((uint)(*(int *)(&UNK_00897ca0 + (param_1 + 1) * 4) << 0xb) <= uVar2) {
    param_1 = param_1 + 1;
  }
  if ((uint)(*(int *)(&UNK_00897ca0 + (param_1 + 1) * 4) << 0xb) <= uVar2) {
    param_1 = param_1 + 1;
  }
  uVar4 = (ulong)(*(int *)(&UNK_00897ca0 + param_1 * 4) * 0x800 == uVar2);
  if ((uint)(*(int *)(&UNK_00897ca0 + param_1 * 4) * 0x800) < uVar2) {
    uVar4 = uVar4 + 1;
  }
  uVar4 = uVar4 + param_1;
  lVar1 = uVar4 * 4;
  uVar3 = (ulong)(*(uint *)(&UNK_00897ca0 + lVar1) >> 0x15);
  if (uVar4 < 0x15) {
    uVar5 = (ulong)(*(uint *)(&UNK_00897ca4 + lVar1) >> 0x15);
    if (uVar4 == 0) {
      lVar1 = uVar5 + ~uVar3;
      uVar2 = 0;
      goto joined_r0x00478e4c;
    }
  }
  else {
    uVar5 = 0x13f;
  }
  uVar2 = *(uint *)(&UNK_00897c9c + lVar1) & 0x1fffff;
  lVar1 = uVar5 + ~uVar3;
joined_r0x00478e4c:
  if (lVar1 != 0) {
    uVar6 = 0;
    do {
      uVar6 = uVar6 + (byte)(&UNK_00891d14)[uVar3];
      if (param_2 - uVar2 < uVar6) break;
      uVar3 = uVar3 + 1;
    } while (uVar5 - 1 != uVar3);
  }
  return (uint)uVar3 & 1;
}

