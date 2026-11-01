
void FUN_005a4d20(undefined1 *param_1)

{
  undefined1 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x24;
  long unaff_x25;
  undefined1 *unaff_x26;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack0000000000000018;
  
  do {
    puVar1 = param_1 + 1;
    *(undefined1 *)(unaff_x21 + unaff_x25) = *param_1;
    unaff_x25 = unaff_x25 + 1;
    param_1 = puVar1;
  } while (puVar1 != unaff_x26);
  lStack0000000000000018 = unaff_x25;
  if (unaff_x24 != 0) {
    func_0x00187bd4();
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = lStack0000000000000018;
  return;
}

