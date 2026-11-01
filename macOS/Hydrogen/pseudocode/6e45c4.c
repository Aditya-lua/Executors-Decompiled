
void FUN_006e45c4(ulong param_1,undefined8 param_2,int param_3)

{
  char in_NG;
  char in_OV;
  long unaff_x19;
  undefined4 uStack000000000000000c;
  
  if (in_NG == in_OV) {
    if (*(ulong *)(unaff_x19 + 8) <= *(long *)(unaff_x19 + 0x10) + (param_1 & 0xffffffff) * 0x10) {
      __dyld_get_image_header(0);
    }
  }
  else if (param_3 < -9999) {
    func_0x006e60a0();
  }
  _strlen();
  func_0x006f6ef8();
  uStack000000000000000c = 5;
  func_0x0070256c();
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

