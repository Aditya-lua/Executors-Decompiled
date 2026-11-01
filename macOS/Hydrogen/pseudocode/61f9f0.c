
long * FUN_0061f9f0(long *param_1)

{
  int iVar1;
  long unaff_x22;
  
  *param_1 = (long)&UNK_009f46d8;
  func_0x005edf2c(param_1 + 1,1);
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[4] = -1;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[8] = -1;
  param_1[0xd] = 0;
  param_1[0xe] = 0;
  param_1[0xc] = -1;
  *param_1 = (long)&UNK_009f9c38;
  param_1[1] = (long)&UNK_009f9d28;
  param_1[2] = 0;
  func_0x005ee684(param_1);
  param_1[2] = unaff_x22;
  (**(code **)(*param_1 + 0x98))(param_1);
  (**(code **)(*param_1 + 0x90))(param_1);
  iVar1 = (**(code **)(*param_1 + 0x40))(param_1);
  if (iVar1 < 4) {
    (**(code **)(*param_1 + 0x60))(param_1);
  }
  return param_1;
}

