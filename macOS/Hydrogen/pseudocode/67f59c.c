
void FUN_0067f59c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 auStack_d8 [168];
  
  auVar2 = __Unwind_Resume();
  uVar1 = (**(code **)(*auVar2._0_8_ + 0xa0))();
  func_0x00653bcc(auStack_d8,uVar1);
  func_0x0060cde8(auStack_d8,auVar2._8_8_,param_3,param_4,param_5);
  func_0x0060d3b0(auStack_d8);
  return;
}

