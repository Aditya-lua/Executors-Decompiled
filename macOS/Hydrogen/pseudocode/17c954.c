
/* WARNING: Possible PIC construction at 0x0017c964: Changing call to branch */

void FUN_0017c954(void)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long *unaff_x19;
  
  lVar3 = *unaff_x19;
  if (lVar3 == 0) {
    plVar2 = (long *)__Unwind_Resume();
    lVar3 = *plVar2;
    if (lVar3 == 0) {
      return;
    }
    lVar1 = plVar2[1];
  }
  else {
    lVar1 = unaff_x19[1];
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3,1);
  return;
}

