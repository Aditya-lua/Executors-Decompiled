
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00767470(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  undefined8 uVar1;
  long extraout_x1;
  long unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  
  func_0x007406b0();
  if (*(char *)(unaff_x23 + 0x928) == '\x01') {
    uVar1 = func_0x0076759c();
    if ((int)uVar1 == 0) {
      uVar1 = func_0x00767824();
      *unaff_x20 = 1;
    }
    *(undefined4 *)(unaff_x24 + 0x3ec) = 0;
  }
  else {
    uVar1 = func_0x007678f4();
    if ((int)uVar1 == 0) {
      *(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 1000) = _UNK_008cd8a0;
      goto LAB_00767548;
    }
  }
  if ((int)uVar1 == 0x51) {
    uVar1 = 0;
  }
LAB_00767548:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar1;
  }
  ___stack_chk_fail();
  *param_3 = *(undefined4 *)(extraout_x1 + 0x238);
  return 1;
}

