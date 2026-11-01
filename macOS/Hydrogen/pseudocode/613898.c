
/* WARNING: Possible PIC construction at 0x00613de0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00613de4) */

undefined8 * FUN_00613898(long *param_1)

{
  undefined8 *puVar1;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
                    /* WARNING: Could not recover jumptable at 0x006138e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    puVar1 = (undefined8 *)(**(code **)(*param_1 + 0x38))();
    return puVar1;
  }
  ___stack_chk_fail();
  uStack0000000000000008 = &UNK_009f7578;
  func_0x00698f0c(in_stack_00000010);
  return &uStack0000000000000008;
}

