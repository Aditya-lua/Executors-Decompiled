
undefined1  [16] FUN_00428c30(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined4 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined4 in_stack_00000028;
  
  _uStack0000000000000008 = param_2;
  uStack0000000000000010 = param_3;
  func_0x0043065c(&uStack0000000000000018,param_1,&uStack0000000000000008);
  uVar1 = 0;
  if (uStack0000000000000018 == 0) {
    uVar1 = in_stack_00000028;
  }
  uVar2 = 0;
  if (uStack0000000000000018 == 0) {
    uVar2 = in_stack_00000020;
  }
  auVar3._8_4_ = uVar1;
  auVar3._0_8_ = uVar2;
  auVar3._12_4_ = 0;
  return auVar3;
}

