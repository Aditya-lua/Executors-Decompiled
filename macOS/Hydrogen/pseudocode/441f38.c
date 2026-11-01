
void FUN_00441f38(undefined8 *param_1,long *param_2)

{
  undefined1 auVar1 [16];
  undefined8 uVar2;
  long in_x9;
  undefined8 uVar3;
  long in_x10;
  undefined8 *in_x11;
  uint uVar4;
  
  uVar2 = in_x11[1];
  uVar3 = *in_x11;
  *param_2 = (long)in_x11 + 0x14;
  param_2[1] = in_x10;
  auVar1._4_4_ = -(uint)((int)((ulong)uVar3 >> 0x20) != 0);
  auVar1._0_4_ = -(uint)((int)uVar3 != 0);
  auVar1._8_4_ = -(uint)((int)uVar2 != 0);
  auVar1._12_4_ = -(uint)((int)((ulong)uVar2 >> 0x20) != 0);
  uVar4 = NEON_umaxv(auVar1,4);
  if (((uVar4 & 1) == 0) && (*(int *)(in_x9 + 0x10) == 0)) {
    uVar3 = 0;
    *(undefined1 *)(param_2 + 2) = 1;
  }
  else {
    param_1[1] = 0;
    param_1[2] = in_x9;
    uVar3 = 1;
  }
  *param_1 = uVar3;
  return;
}

