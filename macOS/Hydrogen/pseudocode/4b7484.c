
void FUN_004b7484(void)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  
  __Unwind_Resume();
  func_0x007a2668();
  plVar2 = (long *)func_0x007a2668();
  lVar1 = plVar2[1];
  lVar4 = plVar2[2] + 1;
  lVar3 = lVar1;
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x00488078(lVar3);
    lVar3 = lVar3 + 0x40;
  }
  if (*plVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,*plVar2 << 6,8);
  return;
}

