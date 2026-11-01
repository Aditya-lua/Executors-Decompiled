
/* WARNING: Possible PIC construction at 0x004b6eec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004b6ef0) */
/* WARNING: Removing unreachable block (ram,0x004b6efc) */
/* WARNING: Removing unreachable block (ram,0x004b6f14) */
/* WARNING: Removing unreachable block (ram,0x004b6f3c) */
/* WARNING: Removing unreachable block (ram,0x004b6f1c) */
/* WARNING: Removing unreachable block (ram,0x004b6f04) */

void FUN_004b6814(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x18);
  func_0x004b6240(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

