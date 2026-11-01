
long FUN_00074468(void)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  func_0x0002f53c();
  *(long *)(*(long *)(unaff_x21 + 0x38) + 8) = unaff_x20;
  *(long *)(unaff_x21 + 0x38) = unaff_x20;
  *(uint *)(unaff_x20 + 0xa0) = *(uint *)(unaff_x20 + 0xa0) | 0x4000;
  return unaff_x19 + 1;
}

