
undefined * FUN_00432a2c(undefined8 param_1,undefined8 param_2,undefined8 param_3,code *param_4)

{
  undefined1 *puVar1;
  long lVar2;
  undefined *puVar3;
  undefined8 uStack0000000000000180;
  undefined1 *in_stack_00000188;
  long in_stack_00000190;
  
  func_0x00459450(&uStack0000000000000180);
  lVar2 = in_stack_00000190;
  puVar1 = in_stack_00000188;
  if (uStack0000000000000180 == -0x8000000000000000) {
    puVar3 = (undefined *)(*param_4)(param_3,in_stack_00000188,in_stack_00000190);
    *puVar1 = 0;
    if (lVar2 != 0) {
      func_0x00187bd4(puVar1,lVar2,1);
    }
  }
  else {
    if (uStack0000000000000180 != 0) {
      func_0x00187bd4(in_stack_00000188,uStack0000000000000180,1);
    }
    puVar3 = &UNK_009dae48;
  }
  return puVar3;
}

