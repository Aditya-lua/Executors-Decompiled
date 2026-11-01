
void FUN_0061f930(long param_1)

{
  long *unaff_x19;
  long unaff_x20;
  
  unaff_x19[8] = param_1;
  unaff_x19[0xd] = 0;
  unaff_x19[0xe] = 0;
  unaff_x19[0xc] = param_1;
  *unaff_x19 = (long)&UNK_009f9c38;
  unaff_x19[1] = (long)&UNK_009f9d28;
  unaff_x19[2] = 0;
  func_0x005ee574();
  unaff_x19[2] = unaff_x20;
  (**(code **)(*unaff_x19 + 0x98))();
  return;
}

