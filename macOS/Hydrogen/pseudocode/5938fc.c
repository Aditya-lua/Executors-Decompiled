
void FUN_005938fc(void)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  
  plVar1 = (long *)__Unwind_Resume();
  lVar2 = plVar1[1];
  if (lVar2 == 0) {
    return;
  }
  uVar3 = (plVar1[5] + plVar1[4] + plVar1[4] * lVar2) - 1U & -plVar1[5];
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*plVar1 - uVar3,lVar2 + uVar3 + 9);
  return;
}

