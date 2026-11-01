
void FUN_0061e068(long param_1)

{
  long in_x9;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  unaff_x19[1] = in_x9;
  unaff_x19[2] = 0;
  unaff_x19[6] = 0;
  unaff_x19[7] = param_1 + 0x1b0;
  func_0x005edf2c(unaff_x19 + 0xc,1);
  unaff_x19[0xe] = unaff_x21;
  unaff_x19[0xf] = 0;
  unaff_x19[0x10] = 0;
  unaff_x19[0x11] = 0;
  *unaff_x19 = (long)&UNK_009f9348;
  unaff_x19[1] = (long)&UNK_009f94a0;
  unaff_x19[7] = (long)&UNK_009f9538;
  unaff_x19[0xc] = (long)&UNK_009f95b8;
  func_0x005ee574();
  unaff_x19[2] = unaff_x20;
  (**(code **)(*unaff_x19 + 0x98))();
  return;
}

