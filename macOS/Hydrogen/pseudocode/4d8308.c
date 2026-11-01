
/* WARNING: Possible PIC construction at 0x004d866c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004d8670) */
/* WARNING: Removing unreachable block (ram,0x004d867c) */
/* WARNING: Removing unreachable block (ram,0x004d8694) */
/* WARNING: Removing unreachable block (ram,0x004d86bc) */
/* WARNING: Removing unreachable block (ram,0x004d869c) */
/* WARNING: Removing unreachable block (ram,0x004d8684) */

void FUN_004d8308(void)

{
  long lVar1;
  undefined8 uVar2;
  
  func_0x005d2c74();
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar2 = *(undefined8 *)(lVar1 + 0x18);
  func_0x004d7924(uVar2);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
  return;
}

