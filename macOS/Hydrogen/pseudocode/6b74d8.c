
undefined8 FUN_006b74d8(long param_1)

{
  undefined8 uVar1;
  undefined8 in_x10;
  undefined8 *unaff_x19;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  
  *unaff_x19 = in_x10;
  unaff_x19[1] = in_stack_00000018;
  uVar1 = unaff_x19[2];
  unaff_x19[2] = in_stack_00000020;
  _uStack0000000000000008 = param_1;
  lStack0000000000000010 = param_1;
  in_stack_00000020 = uVar1;
  func_0x006b71e4(&uStack0000000000000008,param_1);
  if (_uStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return in_stack_00000018;
}

