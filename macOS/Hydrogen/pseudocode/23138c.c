
void FUN_0023138c(void)

{
  long lVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  
  lVar1 = __Unwind_Resume();
  plVar2 = *(long **)(lVar1 + 8);
  if (plVar2 == (long *)0x0) {
    return;
  }
  if (*plVar2 != 0) {
    (**(code **)(*plVar2 + 0x20))(plVar2);
    *plVar2 = 0;
  }
  if (plVar2 == (long *)0x0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar2 = plVar2 + -1;
    if (*plVar2 + 8 != 0) {
      _bzero(plVar2,*plVar2 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar2);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)(plVar2,"",0);
    return;
  }
  auVar3 = func_0x0079fc90();
  if (auVar3._8_8_ != 0) {
    _bzero(auVar3._0_8_);
  }
  return;
}

