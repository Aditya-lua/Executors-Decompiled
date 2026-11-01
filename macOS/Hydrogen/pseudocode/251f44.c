
void FUN_00251f44(undefined1 *param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  long unaff_x22;
  undefined8 unaff_x25;
  undefined1 *unaff_x26;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    *param_1 = 0;
    param_1 = param_1 + 1;
  }
  uStack0000000000000020 = 0;
  for (lVar1 = in_stack_00000010; lVar1 != 0; lVar1 = lVar1 + -1) {
    *unaff_x26 = 0;
    unaff_x26 = unaff_x26 + 1;
  }
  if (in_stack_00000010 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000010,1);
  }
  *unaff_x19 = unaff_x25;
  return;
}

