
undefined8 FUN_0076e288(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long unaff_x19;
  undefined1 auVar4 [16];
  long in_stack_00000008;
  
  lVar1 = func_0x00156654();
  uVar2 = func_0x00740a58();
  uVar3 = func_0x007321fc();
  if ((int)uVar3 == 0x51) {
    in_stack_00000008 = 0;
  }
  else if ((int)uVar3 != 0) {
    return uVar3;
  }
  func_0x0073c8fc();
  if (lVar1 - in_stack_00000008 == 0) {
    *(undefined8 *)(unaff_x19 + 0x10) = 0;
    *(undefined8 *)(unaff_x19 + 0x18) = 0;
    *(undefined8 *)(unaff_x19 + 0x20) = 0;
    auVar4 = func_0x00782d28();
    *(undefined1 (*) [16])(unaff_x19 + 0x28) = auVar4;
    return 0;
  }
  *(long *)(unaff_x19 + 0x18) = lVar1 - in_stack_00000008;
  *(long *)(unaff_x19 + 0x20) = lVar1;
  *(undefined8 *)(unaff_x19 + 0x10) = uVar2;
  return 0;
}

