
void FUN_00373584(long param_1)

{
  long *plVar1;
  undefined1 auVar2 [16];
  
  if (param_1 == 0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar1 = (long *)(param_1 + -8);
    if (*plVar1 + 8 != 0) {
      _bzero(plVar1,*plVar1 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar1);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)(param_1,"",0);
    return;
  }
  auVar2 = func_0x0079fc90();
  if (auVar2._8_8_ != 0) {
    _bzero(auVar2._0_8_);
  }
  return;
}

