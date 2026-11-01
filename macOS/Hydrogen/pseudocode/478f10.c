
uint FUN_00478f10(long param_1,int param_2)

{
  uint *puVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  int in_w9;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  long in_x10;
  uint in_w12;
  
  if ((uint)(in_w9 << 0xb) <= in_w12) {
    param_1 = param_1 + 1;
  }
  if ((uint)(*(int *)(in_x10 + (param_1 + 1) * 4) << 0xb) <= in_w12) {
    param_1 = param_1 + 1;
  }
  uVar3 = *(int *)(in_x10 + param_1 * 4) * 0x800;
  uVar5 = (ulong)(uVar3 == in_w12);
  if (uVar3 < in_w12) {
    uVar5 = uVar5 + 1;
  }
  uVar5 = uVar5 + param_1;
  puVar1 = (uint *)(in_x10 + uVar5 * 4);
  uVar4 = (ulong)(*puVar1 >> 0x15);
  if (uVar5 < 0x21) {
    uVar6 = (ulong)(puVar1[1] >> 0x15);
    if (uVar5 == 0) {
      lVar2 = uVar6 + ~uVar4;
      uVar3 = 0;
      goto joined_r0x00478f84;
    }
  }
  else {
    uVar6 = 0x2ef;
  }
  uVar3 = puVar1[-1] & 0x1fffff;
  lVar2 = uVar6 + ~uVar4;
joined_r0x00478f84:
  if (lVar2 != 0) {
    uVar7 = 0;
    do {
      uVar7 = uVar7 + (byte)(&UNK_00891e53)[uVar4];
      if (param_2 - uVar3 < uVar7) break;
      uVar4 = uVar4 + 1;
    } while (uVar6 - 1 != uVar4);
  }
  return (uint)uVar4 & 1;
}

