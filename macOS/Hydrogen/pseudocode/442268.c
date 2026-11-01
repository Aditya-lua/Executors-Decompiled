
void FUN_00442268(undefined8 *param_1,long *param_2)

{
  undefined1 auVar1 [16];
  undefined8 *puVar2;
  uint uVar3;
  
  if ((ulong)param_2[1] < 0x20) {
    *param_2 = 1;
    param_2[1] = 0;
    *(undefined1 *)(param_2 + 2) = 1;
    *param_1 = &UNK_00888ac5;
    param_1[1] = 0x2c;
  }
  else {
    puVar2 = (undefined8 *)*param_2;
    *param_2 = (long)(puVar2 + 4);
    param_2[1] = param_2[1] - 0x20;
    auVar1._4_4_ = -(uint)((int)((ulong)*puVar2 >> 0x20) != 0);
    auVar1._0_4_ = -(uint)((int)*puVar2 != 0);
    auVar1._8_4_ = -(uint)((int)puVar2[1] != 0);
    auVar1._12_4_ = -(uint)((int)((ulong)puVar2[1] >> 0x20) != 0);
    uVar3 = NEON_umaxv(auVar1,4);
    if ((((uVar3 & 1) == 0) &&
        ((*(int *)((long)puVar2 + 0x14) == 0 && *(int *)(puVar2 + 2) == 0) &&
         *(int *)(puVar2 + 3) == 0)) && (*(int *)((long)puVar2 + 0x1c) == 0)) {
      *(undefined1 *)(param_2 + 2) = 1;
      *param_1 = 0;
      param_1[1] = 0;
      return;
    }
    *param_1 = 0;
    param_1[1] = puVar2;
  }
  return;
}

