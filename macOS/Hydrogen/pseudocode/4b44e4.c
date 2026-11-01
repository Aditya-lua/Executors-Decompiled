
void FUN_004b44e4(undefined1 param_1 [16])

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  undefined8 in_stack_00000010;
  
  *(long *)(unaff_x19 + 0x10) = param_1._8_8_;
  *(long *)(unaff_x19 + 8) = param_1._0_8_;
  *(undefined8 *)(unaff_x19 + 0x18) = in_stack_00000010;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x20);
  *(undefined8 *)(unaff_x19 + 0x28) = *(undefined8 *)(unaff_x20 + 0x28);
  *(undefined8 *)(unaff_x19 + 0x20) = uVar1;
  return;
}

