
void FUN_004b44b8(void)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 unaff_w21;
  undefined8 uVar1;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined7 uStack0000000000000039;
  
  func_0x0048c31c(&uStack0000000000000020);
  *unaff_x19 = uStack0000000000000020;
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[1] = in_stack_00000028;
  unaff_x19[3] = CONCAT71(uStack0000000000000039,unaff_w21);
  uVar1 = *(undefined8 *)(unaff_x20 + 0x20);
  unaff_x19[5] = *(undefined8 *)(unaff_x20 + 0x28);
  unaff_x19[4] = uVar1;
  return;
}

