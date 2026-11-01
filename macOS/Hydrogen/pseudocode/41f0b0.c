
undefined8 FUN_0041f0b0(undefined8 param_1,undefined8 param_2)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  
  func_0x007a0000();
  lVar1 = *(long *)(unaff_x20 + 0x10);
  _memcpy(*(long *)(unaff_x20 + 8) + lVar1,param_2);
  *(long *)(unaff_x20 + 0x10) = lVar1 + unaff_x19;
  return 0;
}

