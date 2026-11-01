
void FUN_00467aa4(long param_1,long param_2,long param_3,long *param_4,long param_5)

{
  undefined2 *puVar1;
  uint uVar2;
  uint uVar3;
  long in_x9;
  long lVar4;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  uint in_w15;
  uint in_w16;
  long in_x17;
  
  lVar4 = in_x9 + -0x10;
  *param_4 = lVar4;
  puVar1 = (undefined2 *)(param_3 + lVar4);
  *puVar1 = *(undefined2 *)(param_1 + in_x12 * 2);
  puVar1[2] = *(undefined2 *)(param_1 + (ulong)in_w15 * 2);
  puVar1[3] = *(undefined2 *)(param_1 + (ulong)in_w16 * 2);
  puVar1[4] = *(undefined2 *)(param_1 + in_x17 * 2);
  puVar1[5] = *(undefined2 *)(param_1 + param_2 * 2);
  puVar1[6] = *(undefined2 *)(param_1 + in_x14 * 2);
  puVar1[7] = *(undefined2 *)(param_1 + (in_x11 - param_5 * in_x13) * 2);
  uVar3 = (uint)in_x10;
  if (uVar3 < 100) {
    uVar2 = uVar3;
    uVar3 = uVar3 & 0xffff;
  }
  else {
    uVar2 = (uVar3 >> 2 & 0x3fff) / 0x19;
    in_x10 = (ulong)uVar2;
    lVar4 = in_x9 + -0x12;
    *(undefined2 *)(param_3 + lVar4) =
         *(undefined2 *)(param_1 + ((ulong)(uVar3 + uVar2 * -100) & 0xffff) * 2);
    uVar3 = uVar2;
  }
  if (uVar3 < 10) {
    *(byte *)(param_3 + lVar4 + -1) = (byte)uVar2 | 0x30;
    *param_4 = lVar4 + -1;
    return;
  }
  *(undefined2 *)(param_3 + lVar4 + -2) = *(undefined2 *)(param_1 + (in_x10 & 0xffff) * 2);
  *param_4 = lVar4 + -2;
  return;
}

