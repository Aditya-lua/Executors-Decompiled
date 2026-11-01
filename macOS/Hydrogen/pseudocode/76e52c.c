
undefined4 FUN_0076e52c(long param_1,undefined8 param_2,undefined4 *param_3)

{
  undefined4 uVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x27;
  long unaff_x29;
  undefined1 auVar2 [16];
  
  unaff_x19[0x10] = param_1 - unaff_x27;
  *unaff_x20 = *unaff_x19;
  *unaff_x19 = 0;
  *(undefined1 *)(unaff_x19 + 1) = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return 0;
  }
  auVar2 = ___stack_chk_fail(0);
  *param_3 = *(undefined4 *)(*(long *)(auVar2._0_8_ + 0x18) + 0x238);
  uVar1 = 0x10000;
  if (*(long *)(auVar2._8_8_ + 0x18) == 0) {
    uVar1 = 1;
  }
  return uVar1;
}

