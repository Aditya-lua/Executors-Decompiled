
void FUN_0061f4c8(void)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  
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

