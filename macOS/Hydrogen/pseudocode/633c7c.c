
long * FUN_00633c7c(long *param_1,long *param_2)

{
  long lVar1;
  
  lVar1 = param_2[4];
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[5];
  lVar1 = param_2[3];
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[6];
  lVar1 = param_2[2];
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[7];
  *(undefined4 *)(param_1 + 1) = 0;
  lVar1 = param_2[1];
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[8];
  param_1[3] = 0;
  param_1[2] = (long)&UNK_00a09aa0;
  param_1[4] = 0;
  func_0x00631da4(param_1 + 5);
  lVar1 = *param_2;
  *param_1 = lVar1;
  *(long *)((long)param_1 + *(long *)(lVar1 + -0x70)) = param_2[9];
  param_1[0x1e] = (long)&UNK_009f6678;
  param_1[0x1f] = 0;
  param_1[0x20] = 0;
  param_1[0x21] = 0;
  func_0x005fdd18(param_1 + 0x22);
  func_0x005fdd18(param_1 + 0x28);
  *(undefined2 *)(param_1 + 0x2e) = 0x100;
  return param_1;
}

