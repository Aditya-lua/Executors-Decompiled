
/* WARNING: Possible PIC construction at 0x001bf374: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001bf378) */
/* WARNING: Removing unreachable block (ram,0x001bf394) */
/* WARNING: Removing unreachable block (ram,0x001bf380) */

void FUN_001bf34c(long param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x18);
  func_0x002d8de8(*(undefined8 *)(lVar1 + 8));
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,0x10,8);
  return;
}

