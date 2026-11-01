
undefined * FUN_0042f5b4(undefined8 param_1,undefined8 param_2)

{
  undefined1 *puVar1;
  long lVar2;
  undefined *puVar3;
  undefined8 uStack00000000000001a0;
  undefined1 *in_stack_000001a8;
  long in_stack_000001b0;
  
  func_0x00459450(&uStack00000000000001a0,param_2);
  lVar2 = in_stack_000001b0;
  puVar1 = in_stack_000001a8;
  if (uStack00000000000001a0 == -0x8000000000000000) {
    puVar3 = (undefined *)(*(code *)&DAT_0042f618)(1,in_stack_000001a8,in_stack_000001b0);
    *puVar1 = 0;
    if (lVar2 != 0) {
      func_0x00187bd4(puVar1,lVar2,1);
    }
  }
  else {
    if (uStack00000000000001a0 != 0) {
      func_0x00187bd4(in_stack_000001a8,uStack00000000000001a0,1);
    }
    puVar3 = &UNK_009dae48;
  }
  return puVar3;
}

