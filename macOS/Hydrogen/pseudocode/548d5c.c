
/* WARNING: Possible PIC construction at 0x005490a0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005490a4) */
/* WARNING: Removing unreachable block (ram,0x005490b0) */
/* WARNING: Removing unreachable block (ram,0x005490c8) */
/* WARNING: Removing unreachable block (ram,0x005490f0) */
/* WARNING: Removing unreachable block (ram,0x005490d0) */
/* WARNING: Removing unreachable block (ram,0x005490b8) */

void FUN_00548d5c(void)

{
  long lVar1;
  undefined8 uVar2;
  
  func_0x005d2c74();
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar2 = *(undefined8 *)(lVar1 + 0x18);
  func_0x005483f4(uVar2);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
  return;
}

