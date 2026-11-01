
/* WARNING: Possible PIC construction at 0x005a8d78: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a8d7c) */
/* WARNING: Removing unreachable block (ram,0x005a8d84) */
/* WARNING: Removing unreachable block (ram,0x005a8e4c) */
/* WARNING: Removing unreachable block (ram,0x005a8e5c) */
/* WARNING: Removing unreachable block (ram,0x005a8e54) */
/* WARNING: Removing unreachable block (ram,0x005a8e30) */
/* WARNING: Removing unreachable block (ram,0x005a8d8c) */

void FUN_005a8d60(void)

{
  long unaff_x19;
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(unaff_x19 + 0x28);
  func_0x005a8ab4(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

