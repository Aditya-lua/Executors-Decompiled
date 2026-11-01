
void FUN_0072272c(undefined8 param_1)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x26;
  undefined8 unaff_x27;
  undefined8 uVar2;
  long *in_stack_00000018;
  long in_stack_00000020;
  
  *(undefined8 *)(unaff_x23 + 0x10) = param_1;
  *(undefined8 *)(unaff_x23 + 0x18) = unaff_x27;
  if (*(int *)(unaff_x19 + 0x80) == 0x3e) {
    *(undefined8 *)(unaff_x23 + 0x28) = *unaff_x26;
  }
  if (unaff_x22 != (undefined8 *)0x0) {
    uVar2 = *unaff_x26;
    unaff_x22[1] = unaff_x26[1];
    *unaff_x22 = uVar2;
  }
  if (*(int *)(unaff_x19 + 0x80) == 0x3e) {
    func_0x00710d48();
  }
  else {
    func_0x00721808();
    func_0x007244d4();
  }
  lVar1 = *in_stack_00000018 + in_stack_00000020 * 8;
  if (lVar1 != in_stack_00000018[1]) {
    in_stack_00000018[1] = lVar1;
  }
  return;
}

