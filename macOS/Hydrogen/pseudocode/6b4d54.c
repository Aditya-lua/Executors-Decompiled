
void FUN_006b4d54(void)

{
  long lVar1;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x23;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000058;
  
  lVar1 = *(long *)(unaff_x26 + 0x40);
  *(undefined8 *)(unaff_x26 + 0x38) = in_stack_00000040;
  *(undefined8 *)(unaff_x26 + 0x40) = unaff_x20;
  uStack0000000000000058 = *(undefined8 *)(unaff_x26 + 0x50);
  *(undefined8 *)(unaff_x26 + 0x48) = unaff_x23;
  *(undefined8 *)(unaff_x26 + 0x50) = unaff_x21;
  if (lVar1 != 0) {
    __ZdlPv();
  }
  if (unaff_x28 != 0) {
    __ZdlPv();
  }
  if (*(long *)(unaff_x29 + -0x68) != 0) {
    __ZdlPv();
  }
  return;
}

