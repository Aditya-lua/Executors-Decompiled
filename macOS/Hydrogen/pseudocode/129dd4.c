
long FUN_00129dd4(void)

{
  int in_w8;
  int *in_x9;
  long unaff_x19;
  int unaff_w20;
  
  if (unaff_w20 == 0) {
    *in_x9 = -1;
    return 0;
  }
  *in_x9 = in_w8;
  *(int *)(unaff_x19 + 0xe04) = in_w8 + unaff_w20;
  return unaff_x19 + (long)in_w8 * 2 + 0x630;
}

