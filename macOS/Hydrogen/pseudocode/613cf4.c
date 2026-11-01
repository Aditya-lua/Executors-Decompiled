
/* WARNING: Possible PIC construction at 0x00613de0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00613de4) */

undefined8 * FUN_00613cf4(long param_1,undefined8 *param_2)

{
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return param_2;
  }
  ___stack_chk_fail();
  uStack0000000000000008 = &UNK_009f7578;
  func_0x00698f0c(in_stack_00000010);
  return &uStack0000000000000008;
}

