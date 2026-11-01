
undefined8 FUN_002c8df4(undefined1 param_1 [16],undefined1 param_2 [16])

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(unaff_x20 + 0xd8);
  uVar1 = *(undefined8 *)(unaff_x20 + 0xd0);
  *(undefined8 *)(unaff_x19 + 0xd8) = *(undefined8 *)(unaff_x20 + 0xe0);
  *(undefined8 *)(unaff_x19 + 0xd0) = uVar2;
  *(undefined8 *)(unaff_x19 + 200) = uVar1;
  *(long *)(unaff_x19 + 0xc0) = param_2._8_8_;
  *(long *)(unaff_x19 + 0xb8) = param_2._0_8_;
  *(long *)(unaff_x19 + 0xb0) = param_1._8_8_;
  *(long *)(unaff_x19 + 0xa8) = param_1._0_8_;
  return 1;
}

