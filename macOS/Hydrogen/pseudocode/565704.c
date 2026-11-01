
/* WARNING: Possible PIC construction at 0x0056571c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00565720) */
/* WARNING: Removing unreachable block (ram,0x0056572c) */
/* WARNING: Removing unreachable block (ram,0x00565744) */
/* WARNING: Removing unreachable block (ram,0x0056576c) */
/* WARNING: Removing unreachable block (ram,0x0056574c) */
/* WARNING: Removing unreachable block (ram,0x00565734) */

void FUN_00565704(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x18);
  func_0x005649d4(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

