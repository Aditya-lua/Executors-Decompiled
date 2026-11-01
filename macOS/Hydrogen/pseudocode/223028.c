
void FUN_00223028(void)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  
  plVar2 = (long *)__Unwind_Resume();
  lVar1 = plVar2[1];
  lVar4 = plVar2[2] + 1;
  lVar3 = lVar1;
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x001a08c4(lVar3);
    lVar3 = lVar3 + 0x98;
  }
  if (*plVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*plVar2 * 0x98,8);
  return;
}

