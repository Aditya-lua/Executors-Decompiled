
void FUN_00678d8c(void)

{
  long lVar1;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong in_stack_00000008;
  
  func_0x006108a0();
  if (unaff_x20 == 0) {
    *(undefined8 *)(unaff_x21 + 0x18) = 0;
    if (unaff_x19 == 0) goto LAB_00678db8;
  }
  else {
    lVar1 = func_0x006115d0(unaff_x20 << 3);
    *(long *)(unaff_x21 + 0x18) = lVar1;
    if (lVar1 == unaff_x19) goto LAB_00678db8;
  }
  _memcpy();
LAB_00678db8:
  if (unaff_x20 <= in_stack_00000008) {
    in_stack_00000008 = unaff_x20;
  }
  if (unaff_x19 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined8 *)(unaff_x19 + -8 + in_stack_00000008 * 8) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644();
  }
  return;
}

