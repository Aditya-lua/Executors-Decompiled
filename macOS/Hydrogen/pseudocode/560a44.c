
/* WARNING: Possible PIC construction at 0x00560a48: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00560a4c) */
/* WARNING: Removing unreachable block (ram,0x00560c8c) */

void FUN_00560a44(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long lVar3;
  
  lVar1 = *(long *)(unaff_x19 + 0x18);
  lVar3 = *(long *)(unaff_x19 + 0x20) + 1;
  lVar2 = lVar1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x00553cb8(lVar2);
    lVar2 = lVar2 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x10) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*(long *)(unaff_x19 + 0x10) << 6,8);
  return;
}

