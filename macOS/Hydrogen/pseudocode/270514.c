
undefined8 FUN_00270514(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  uStack0000000000000038 = 1;
  uStack0000000000000040 = 0;
  uStack0000000000000030 = param_1;
  func_0x00459f08(&uStack0000000000000008,&uStack0000000000000020);
  uVar1 = in_stack_00000010;
  uVar2 = func_0x0046920c();
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(uVar1,uStack0000000000000008,1);
  }
  return uVar2;
}

