
void FUN_0061f5a8(long param_1)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  
  unaff_x19[4] = param_1;
  unaff_x19[9] = 0;
  unaff_x19[10] = 0;
  unaff_x19[8] = param_1;
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

