
void FUN_0061e1ac(void)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  
  func_0x005edf2c();
  unaff_x19[4] = -1;
  unaff_x19[5] = 0;
  unaff_x19[10] = 0;
  unaff_x19[0xb] = 0;
  unaff_x19[9] = -1;
  *unaff_x19 = (long)&UNK_009b4968;
  unaff_x19[1] = (long)&UNK_009b4a80;
  unaff_x19[2] = 0;
  unaff_x19[6] = 0;
  unaff_x19[7] = (long)&UNK_009b4b18;
  func_0x005edf2c(unaff_x19 + 0xc,1);
  unaff_x19[0xe] = -1;
  unaff_x19[0xf] = 0;
  unaff_x19[0x10] = 0;
  unaff_x19[0x11] = 0;
  *unaff_x19 = (long)&UNK_009f9348;
  unaff_x19[1] = (long)&UNK_009f94a0;
  unaff_x19[7] = (long)&UNK_009f9538;
  unaff_x19[0xc] = (long)&UNK_009f95b8;
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

