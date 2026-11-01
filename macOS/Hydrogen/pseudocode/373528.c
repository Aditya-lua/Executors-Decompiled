
/* WARNING: Possible PIC construction at 0x0037357c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00373580) */

void FUN_00373528(ulong *param_1,code *param_2,undefined8 param_3)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  uVar1 = *param_1;
  if (uVar1 != 0) {
    uVar3 = 0;
    do {
      if (*(long *)(param_1[1] + uVar3 * 8) != 0) {
        (*param_2)(param_3);
        uVar1 = *param_1;
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < uVar1);
  }
  uVar1 = param_1[1];
  if (uVar1 == 0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar2 = (long *)(uVar1 - 8);
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
    (*pcRam0000000000a3bef0)(uVar1,"",0);
    return;
  }
  auVar4 = func_0x0079fc90();
  if (auVar4._8_8_ != 0) {
    _bzero(auVar4._0_8_);
  }
  return;
}

