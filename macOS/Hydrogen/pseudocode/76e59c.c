
undefined4
FUN_0076e59c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4)

{
  undefined4 uVar1;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000000;
  
  uStack0000000000000000 = param_1;
  func_0x0073c9e4();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return 0x38;
  }
  auVar2 = ___stack_chk_fail(0x38);
  *param_4 = *(undefined4 *)(*(long *)(auVar2._0_8_ + 0x18) + 0x238);
  uVar1 = 0x10000;
  if (*(long *)(auVar2._8_8_ + 0x18) == 0) {
    uVar1 = 1;
  }
  return uVar1;
}

