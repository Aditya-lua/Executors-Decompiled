
/* WARNING: Possible PIC construction at 0x005a9114: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a9118) */

void FUN_005a8cac(undefined8 *param_1)

{
  undefined8 uVar1;
  
  uVar1 = *param_1;
  func_0x005a8ab4(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

