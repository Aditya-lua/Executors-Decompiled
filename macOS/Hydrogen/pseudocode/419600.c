
undefined8 FUN_00419600(void)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  
  func_0x007a0000();
  lVar1 = *(long *)(unaff_x20 + 0x10);
  _memcpy(*(long *)(unaff_x20 + 8) + lVar1);
  *(long *)(unaff_x20 + 0x10) = lVar1 + unaff_x19;
  return 0;
}

