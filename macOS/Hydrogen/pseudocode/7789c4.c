
undefined8 FUN_007789c4(undefined8 param_1)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 unaff_x21;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000000;
  
  *(undefined8 *)(unaff_x19 + 0xa28) = param_1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return unaff_x21;
  }
  auVar2 = ___stack_chk_fail();
  if (auVar2._0_8_ == 0) {
    return 0x2b;
  }
  uVar1 = func_0x00776054(auVar2._0_8_,auVar2._8_8_,&uStack0000000000000000);
  return uVar1;
}

