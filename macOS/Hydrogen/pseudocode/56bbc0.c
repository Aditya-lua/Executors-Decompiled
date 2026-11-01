
void FUN_0056bbc0(undefined8 *param_1)

{
  int iVar1;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined4 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  iVar1 = func_0x00566a14();
  if (iVar1 == 0) {
    *param_1 = 0;
  }
  else {
    func_0x0046b8d0(&uStack0000000000000008,*(undefined8 *)(unaff_x21 + 0x10),
                    *(undefined8 *)(unaff_x21 + 0x18));
    if ((uStack0000000000000008 & 1) == 0) {
      param_1[1] = in_stack_00000010;
      param_1[2] = in_stack_00000018;
    }
    else {
      unaff_x20 = 0;
    }
    *param_1 = unaff_x20;
  }
  return;
}

