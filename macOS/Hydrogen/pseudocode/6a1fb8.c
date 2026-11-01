
void FUN_006a1fb8(void)

{
  int in_w8;
  int in_w9;
  int in_w10;
  int in_w11;
  int in_w12;
  uint in_w15;
  long unaff_x26;
  int iStack0000000000000020;
  int iStack0000000000000024;
  int in_stack_00000028;
  
  *(int *)(unaff_x26 + 0x18) = in_w10 + in_w11 + in_w9;
  *(int *)(unaff_x26 + 0x1c) = iStack0000000000000024 + in_w12;
  *(uint *)(unaff_x26 + 0x20) = (in_w15 >> 0x16 | in_w15 << 10) + iStack0000000000000020;
  *(int *)(unaff_x26 + 0x24) = in_w8 + in_stack_00000028;
  return;
}

