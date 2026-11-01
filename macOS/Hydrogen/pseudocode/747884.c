
undefined8 FUN_00747884(long param_1)

{
  long in_x9;
  uint unaff_w20;
  long unaff_x21;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000000 = *(undefined8 *)(in_x9 + param_1 * 8);
  uStack0000000000000008 = *(undefined8 *)(in_x9 + (ulong)unaff_w20 * 8);
  func_0x0073cfbc();
  *(char *)(unaff_x21 + 0x4f6) = (char)unaff_w20;
  return 0;
}

