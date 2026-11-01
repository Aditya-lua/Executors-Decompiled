
/* WARNING: Possible PIC construction at 0x005cdfe8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005cdfec) */
/* WARNING: Removing unreachable block (ram,0x005cdff4) */
/* WARNING: Removing unreachable block (ram,0x005ce000) */
/* WARNING: Removing unreachable block (ram,0x005ce008) */
/* WARNING: Removing unreachable block (ram,0x005ce020) */
/* WARNING: Removing unreachable block (ram,0x005ce058) */
/* WARNING: Removing unreachable block (ram,0x005ce028) */
/* WARNING: Removing unreachable block (ram,0x005ce010) */

void FUN_005cdfd0(void)

{
  long unaff_x19;
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(unaff_x19 + 0x38);
  func_0x005cdd10(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

