
/* WARNING: Removing unreachable block (ram,0x00767544) */

undefined8 FUN_00767264(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  long extraout_x1;
  long unaff_x29;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return 0x3f;
  }
  ___stack_chk_fail();
  *param_3 = *(undefined4 *)(extraout_x1 + 0x238);
  return 1;
}

