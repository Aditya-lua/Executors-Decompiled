
/* WARNING: Possible PIC construction at 0x0053de08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0053de0c) */
/* WARNING: Removing unreachable block (ram,0x0053de14) */
/* WARNING: Removing unreachable block (ram,0x0053de20) */
/* WARNING: Removing unreachable block (ram,0x0053de2c) */
/* WARNING: Removing unreachable block (ram,0x0053de44) */
/* WARNING: Removing unreachable block (ram,0x0053de6c) */
/* WARNING: Removing unreachable block (ram,0x0053de4c) */
/* WARNING: Removing unreachable block (ram,0x0053de34) */

void FUN_0053dde4(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 0x30);
  func_0x0053ceac(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

