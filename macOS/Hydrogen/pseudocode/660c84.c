
void FUN_00660c84(void)

{
  long lVar1;
  long *unaff_x20;
  long *unaff_x21;
  
  func_0x00633de0();
  lVar1 = *unaff_x21;
  *unaff_x20 = lVar1;
  unaff_x20[1] = unaff_x21[0xe];
  unaff_x20[2] = unaff_x21[0xf];
  *(long *)((long)unaff_x20 + *(long *)(lVar1 + -0x18)) = unaff_x21[0x10];
  func_0x005fdd18(unaff_x20 + 0x3b);
  return;
}

