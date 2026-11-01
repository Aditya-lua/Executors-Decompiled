
/* WARNING: Possible PIC construction at 0x004d866c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004d8670) */
/* WARNING: Removing unreachable block (ram,0x004d867c) */
/* WARNING: Removing unreachable block (ram,0x004d8694) */
/* WARNING: Removing unreachable block (ram,0x004d86bc) */
/* WARNING: Removing unreachable block (ram,0x004d869c) */
/* WARNING: Removing unreachable block (ram,0x004d8684) */

void FUN_004d8644(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x18);
  func_0x004d7924(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

