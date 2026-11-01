
void FUN_0059cb4c(long *param_1)

{
  long *plVar1;
  long lVar2;
  long *plVar3;
  
  plVar1 = (long *)param_1[1];
  plVar3 = plVar1;
  for (lVar2 = param_1[2]; lVar2 != 0; lVar2 = lVar2 + -1) {
    if (*plVar3 != 0xc) {
      func_0x0059ce88(plVar3);
    }
    func_0x0059ce88(plVar3 + 8);
    plVar3 = plVar3 + 0x10;
  }
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar1,*param_1 << 7,8);
  return;
}

