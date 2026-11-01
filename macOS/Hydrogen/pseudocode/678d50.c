
void FUN_00678d50(undefined8 *param_1)

{
  long lVar1;
  ulong in_x9;
  long in_x10;
  long in_x11;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong in_stack_00000008;
  
  lVar1 = in_x11;
  do {
    param_1[-3] = 0;
    param_1[-4] = 0;
    param_1[-1] = 0;
    param_1[-2] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    lVar1 = lVar1 + -8;
    param_1 = param_1 + 8;
  } while (lVar1 != 0);
  if (in_x10 != in_x11) {
    do {
      *(undefined8 *)(unaff_x19 + in_x9 * 8) = 0;
      in_x9 = in_x9 + 1;
    } while (in_x9 < unaff_x20);
  }
  *(undefined8 *)(unaff_x21 + 8) = 0x1fffffffffffffff;
  *(ulong *)(unaff_x21 + 0x10) = unaff_x20;
  func_0x006108a0();
  if (unaff_x20 == 0) {
    *(undefined8 *)(unaff_x21 + 0x18) = 0;
    if (unaff_x19 == 0) goto code_r0x00678db8;
  }
  else {
    lVar1 = func_0x006115d0(unaff_x20 << 3);
    *(long *)(unaff_x21 + 0x18) = lVar1;
    if (lVar1 == unaff_x19) goto code_r0x00678db8;
  }
  _memcpy();
code_r0x00678db8:
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

