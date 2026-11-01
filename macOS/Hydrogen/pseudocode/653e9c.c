
void FUN_00653e9c(long param_1,long *param_2)

{
  long unaff_x19;
  
  *param_2 = param_1 + 0xd0;
  param_2[1] = param_1 + 400;
  param_2[2] = 0;
  func_0x005fdd18(param_2 + 3);
  func_0x005fdd18(unaff_x19 + 0x48);
  *(undefined **)(unaff_x19 + 0x78) = &UNK_00a09a40;
  func_0x005fdd18(unaff_x19 + 0x80);
  func_0x005fdd18(unaff_x19 + 0xb0);
  *(undefined1 *)(unaff_x19 + 0xe0) = 1;
  return;
}

