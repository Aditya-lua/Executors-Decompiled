
/* WARNING: Possible PIC construction at 0x002229dc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002229e0) */

void FUN_00222998(void)

{
  int iVar1;
  long lVar2;
  long extraout_x8;
  code *pcVar3;
  long unaff_x19;
  long *plVar4;
  long unaff_x21;
  long unaff_x22;
  undefined1 auVar5 [16];
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0016ad38(unaff_x21);
    unaff_x21 = unaff_x21 + 0x20;
  }
  lVar2 = *(long *)(unaff_x19 + 0x20);
  if (lVar2 == 0) {
    __Unwind_Resume();
    lVar2 = extraout_x8;
  }
  func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x28),lVar2 << 5,8);
  __Unwind_Resume();
  lVar2 = func_0x007a2668();
  lVar2 = *(long *)(lVar2 + 8);
  if ((lVar2 == 0) || (iVar1 = func_0x00370810(), iVar1 == 0)) {
    return;
  }
  if ((*(long *)(lVar2 + 0x10) != 0) &&
     (pcVar3 = *(code **)(*(long *)(lVar2 + 0x10) + 0xa0), pcVar3 != (code *)0x0)) {
    (*pcVar3)(lVar2);
    *(undefined8 *)(lVar2 + 8) = 0;
    *(undefined4 *)(lVar2 + 4) = 0;
  }
  if (lVar2 == 0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar4 = (long *)(lVar2 + -8);
    if (*plVar4 + 8 != 0) {
      _bzero(plVar4,*plVar4 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar4);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)(lVar2,"",0);
    return;
  }
  auVar5 = func_0x0079fc90();
  if (auVar5._8_8_ != 0) {
    _bzero(auVar5._0_8_);
  }
  return;
}

