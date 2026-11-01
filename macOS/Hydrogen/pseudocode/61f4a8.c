
void FUN_0061f4a8(undefined8 param_1,undefined8 *param_2)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  
  *param_2 = param_1;
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
  func_0x005ee684();
  unaff_x19[2] = unaff_x22;
  (**(code **)(*unaff_x19 + 0x98))();
  (**(code **)(*unaff_x19 + 0x90))();
  iVar1 = (**(code **)(*unaff_x19 + 0x40))();
  if (iVar1 < 4) {
    (**(code **)(*unaff_x19 + 0x60))();
  }
  return;
}

