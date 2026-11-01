
void FUN_00441efc(undefined8 *param_1,long *param_2)

{
  undefined1 auVar1 [16];
  undefined8 uVar2;
  ulong in_x9;
  undefined8 *puVar3;
  undefined8 uVar4;
  uint uVar5;
  
  if (in_x9 < 0x14) {
    *param_2 = 1;
    param_2[1] = 0;
    *(undefined1 *)(param_2 + 2) = 1;
    param_1[1] = &UNK_00888a2c;
    param_1[2] = 0x21;
    *param_1 = 1;
    return;
  }
  puVar3 = (undefined8 *)*param_2;
  uVar2 = puVar3[1];
  uVar4 = *puVar3;
  *param_2 = (long)puVar3 + 0x14;
  param_2[1] = in_x9 - 0x14;
  auVar1._4_4_ = -(uint)((int)((ulong)uVar4 >> 0x20) != 0);
  auVar1._0_4_ = -(uint)((int)uVar4 != 0);
  auVar1._8_4_ = -(uint)((int)uVar2 != 0);
  auVar1._12_4_ = -(uint)((int)((ulong)uVar2 >> 0x20) != 0);
  uVar5 = NEON_umaxv(auVar1,4);
  if (((uVar5 & 1) == 0) && (*(int *)(puVar3 + 2) == 0)) {
    uVar4 = 0;
    *(undefined1 *)(param_2 + 2) = 1;
  }
  else {
    param_1[1] = 0;
    param_1[2] = puVar3;
    uVar4 = 1;
  }
  *param_1 = uVar4;
  return;
}

