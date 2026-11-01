
void FUN_00441e64(undefined8 *param_1,long *param_2)

{
  undefined1 auVar1 [16];
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  uint uVar5;
  
  if ((*(byte *)(param_2 + 2) & 1) != 0) {
code_r0x00441e70:
    *param_1 = 0;
    param_1[1] = 0;
    return;
  }
  if ((ulong)param_2[1] < 0x14) {
    *param_2 = 1;
    param_2[1] = 0;
    *(undefined1 *)(param_2 + 2) = 1;
    *param_1 = &UNK_00888a2c;
    param_1[1] = 0x21;
  }
  else {
    puVar4 = (undefined8 *)*param_2;
    uVar3 = puVar4[1];
    uVar2 = *puVar4;
    *param_2 = (long)puVar4 + 0x14;
    param_2[1] = param_2[1] - 0x14;
    auVar1._4_4_ = -(uint)((int)((ulong)uVar2 >> 0x20) != 0);
    auVar1._0_4_ = -(uint)((int)uVar2 != 0);
    auVar1._8_4_ = -(uint)((int)uVar3 != 0);
    auVar1._12_4_ = -(uint)((int)((ulong)uVar3 >> 0x20) != 0);
    uVar5 = NEON_umaxv(auVar1,4);
    if (((uVar5 & 1) == 0) && (*(int *)(puVar4 + 2) == 0)) {
      *(undefined1 *)(param_2 + 2) = 1;
      goto code_r0x00441e70;
    }
    *param_1 = 0;
    param_1[1] = puVar4;
  }
  return;
}

