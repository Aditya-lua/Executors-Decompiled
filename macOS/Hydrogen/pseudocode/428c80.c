
undefined1  [16]
FUN_00428c80(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined4 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined4 in_stack_00000028;
  
  _uStack0000000000000008 = param_3;
  uStack0000000000000010 = param_4;
  func_0x0043065c(&uStack0000000000000018,param_1,&uStack0000000000000008);
  uVar1 = 1000000000;
  if (uStack0000000000000018 == 0) {
    uVar1 = in_stack_00000028;
  }
  auVar2._8_4_ = uVar1;
  auVar2._0_8_ = in_stack_00000020;
  auVar2._12_4_ = 0;
  return auVar2;
}

