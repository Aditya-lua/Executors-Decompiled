
void FUN_00639ea0(long param_1,long *param_2,long param_3)

{
  long lVar1;
  undefined8 in_x9;
  long *unaff_x19;
  long *unaff_x22;
  
  *(undefined8 *)((long)param_2 + param_1) = in_x9;
  lVar1 = *(long *)(param_3 + 0x18);
  *param_2 = lVar1;
  *(undefined8 *)((long)param_2 + *(long *)(lVar1 + -0x70)) = *(undefined8 *)(param_3 + 0x30);
  lVar1 = *(long *)(param_3 + 0x10);
  *param_2 = lVar1;
  *(undefined8 *)((long)param_2 + *(long *)(lVar1 + -0x70)) = *(undefined8 *)(param_3 + 0x38);
  *(undefined4 *)(param_2 + 1) = 0;
  lVar1 = *(long *)(param_3 + 8);
  *param_2 = lVar1;
  *(undefined8 *)((long)param_2 + *(long *)(lVar1 + -0x70)) = *(undefined8 *)(param_3 + 0x40);
  param_2[2] = (long)&UNK_00a09b58;
  func_0x00655478(param_2 + 3);
  func_0x00630464(unaff_x19 + 0x18);
  lVar1 = *unaff_x22;
  *unaff_x19 = lVar1;
  *(long *)((long)unaff_x19 + *(long *)(lVar1 + -0x70)) = unaff_x22[9];
  unaff_x19[0x2d] = (long)&UNK_009f6678;
  unaff_x19[0x2e] = 0;
  unaff_x19[0x2f] = 0;
  unaff_x19[0x30] = 0;
  func_0x005fdd18(unaff_x19 + 0x31);
  func_0x005fdd18(unaff_x19 + 0x37);
  *(undefined2 *)(unaff_x19 + 0x3d) = 0x100;
  func_0x00639fd4();
  return;
}

