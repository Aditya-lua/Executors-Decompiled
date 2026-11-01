
/* WARNING: Possible PIC construction at 0x005c9bfc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c9c40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005c9c00) */
/* WARNING: Removing unreachable block (ram,0x005c9c10) */
/* WARNING: Removing unreachable block (ram,0x005c9c2c) */
/* WARNING: Removing unreachable block (ram,0x005c9c44) */
/* WARNING: Removing unreachable block (ram,0x005c9c30) */
/* WARNING: Removing unreachable block (ram,0x005c9c18) */

void FUN_005c9bd0(void)

{
  long *plVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long lVar3;
  
  do {
    func_0x0059dd3c(unaff_x22);
    unaff_x23 = unaff_x23 + -1;
    unaff_x22 = unaff_x22 + 0x30;
  } while (unaff_x23 != 0);
  if (*(long *)(unaff_x19 + 0x18) == 0) {
    __Unwind_Resume();
    func_0x007a2668();
    plVar1 = (long *)func_0x007a2668();
    lVar3 = plVar1[2] + 1;
    lVar2 = plVar1[1];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059ce88(lVar2);
      lVar2 = lVar2 + 0x40;
    }
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

