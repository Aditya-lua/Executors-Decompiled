
void FUN_0061f370(long param_1,long *param_2)

{
  long *unaff_x19;
  long unaff_x20;
  
  *param_2 = param_1 + 0x10;
  func_0x005edf2c(param_2 + 1,1);
  unaff_x19[5] = 0;
  unaff_x19[6] = 0;
  unaff_x19[4] = -1;
  unaff_x19[9] = 0;
  unaff_x19[10] = 0;
  unaff_x19[8] = -1;
  *unaff_x19 = (long)&UNK_009f9ab0;
  unaff_x19[1] = (long)&UNK_009f9ba0;
  unaff_x19[2] = 0;
  func_0x005ee574();
  unaff_x19[2] = unaff_x20;
  (**(code **)(*unaff_x19 + 0x98))();
  return;
}

