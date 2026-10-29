/* 7ff70c937c50 FUN_7ff70c937c50 */

undefined8 FUN_7ff70c937c50(undefined8 param_1)

{
  code *pcVar1;
  ulonglong uVar2;
  longlong lVar3;
  longlong alStack_78 [3];
  ulonglong uStack_60;
  longlong alStack_58 [3];
  ulonglong uStack_40;
  longlong alStack_38 [2];
  longlong lStack_28;
  ulonglong uStack_20;
  undefined8 uStack_18;
  
  uStack_18 = 0xfffffffffffffffe;
  FUN_7ff70c93e770(alStack_38);
  if (lStack_28 == 0) {
    FUN_7ff70c93cdb0(param_1,&UNK_7ff70cb92910);
  }
  else {
    FUN_7ff70c937870(alStack_78);
    FUN_7ff70c93ceb0(alStack_58,alStack_38,&UNK_7ff70cb927d0);
    FUN_7ff70c93e580(param_1);
    if (7 < uStack_40) {
      uVar2 = uStack_40 * 2 + 2;
      lVar3 = alStack_58[0];
      if (0xfff < uVar2) {
        lVar3 = *(longlong *)(alStack_58[0] + -8);
        if (0x1f < (ulonglong)((alStack_58[0] + -8) - lVar3)) goto LAB_7ff70c937d99;
        uVar2 = uStack_40 * 2 + 0x29;
      }
      thunk_FUN_7ff70ca90250(lVar3,uVar2);
    }
    if (7 < uStack_60) {
      uVar2 = uStack_60 * 2 + 2;
      lVar3 = alStack_78[0];
      if (0xfff < uVar2) {
        lVar3 = *(longlong *)(alStack_78[0] + -8);
        if (0x1f < (ulonglong)((alStack_78[0] + -8) - lVar3)) goto LAB_7ff70c937d99;
        uVar2 = uStack_60 * 2 + 0x29;
      }
      thunk_FUN_7ff70ca90250(lVar3,uVar2);
    }
  }
  if (7 < uStack_20) {
    uVar2 = uStack_20 * 2 + 2;
    lVar3 = alStack_38[0];
    if (0xfff < uVar2) {
      lVar3 = *(longlong *)(alStack_38[0] + -8);
      if (0x1f < (ulonglong)((alStack_38[0] + -8) - lVar3)) {
LAB_7ff70c937d99:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar2 = uStack_20 * 2 + 0x29;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar2);
  }
  return param_1;
}


