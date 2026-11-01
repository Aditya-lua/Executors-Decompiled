
/* WARNING: Possible PIC construction at 0x004b6eec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004b6ef0) */
/* WARNING: Removing unreachable block (ram,0x004b6efc) */
/* WARNING: Removing unreachable block (ram,0x004b6f14) */
/* WARNING: Removing unreachable block (ram,0x004b6f3c) */
/* WARNING: Removing unreachable block (ram,0x004b6f1c) */
/* WARNING: Removing unreachable block (ram,0x004b6f04) */

void thunk_FUN_004b6eac(void)

{
  long lVar1;
  undefined8 uVar2;
  
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar2 = *(undefined8 *)(lVar1 + 0x18);
  func_0x004b6240(uVar2);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
  return;
}

