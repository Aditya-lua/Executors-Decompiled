
/* WARNING: Possible PIC construction at 0x00591c2c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00591c30) */
/* WARNING: Removing unreachable block (ram,0x00591c3c) */
/* WARNING: Removing unreachable block (ram,0x00591c54) */
/* WARNING: Removing unreachable block (ram,0x00591c7c) */
/* WARNING: Removing unreachable block (ram,0x00591c5c) */
/* WARNING: Removing unreachable block (ram,0x00591c44) */

void FUN_00591be8(void)

{
  long lVar1;
  undefined8 uVar2;
  
  func_0x00590e80();
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar2 = *(undefined8 *)(lVar1 + 0x18);
  func_0x00590e80(uVar2);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
  return;
}

