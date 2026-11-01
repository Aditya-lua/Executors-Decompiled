
void FUN_0061fb04(long param_1)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  
  unaff_x19[5] = 0;
  unaff_x19[6] = 0;
  unaff_x19[4] = param_1;
  unaff_x19[9] = 0;
  unaff_x19[10] = 0;
  unaff_x19[8] = param_1;
  unaff_x19[0xd] = 0;
  unaff_x19[0xe] = 0;
  unaff_x19[0xc] = param_1;
  *unaff_x19 = (long)&UNK_009f9c38;
  unaff_x19[1] = (long)&UNK_009f9d28;
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

