/* 7ff70c78e3f0 FUN_7ff70c78e3f0 */

void FUN_7ff70c78e3f0(longlong param_1)

{
  longlong *plVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  ulonglong uVar5;
  
  FUN_7ff70ca38e00(param_1 + 0xc0,*(undefined1 *)(param_1 + 0xb8));
  plVar1 = *(longlong **)(param_1 + 0xa8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_1 + 0x70));
    *(undefined8 *)(param_1 + 0xa8) = 0;
  }
  lVar2 = *(longlong *)(param_1 + 0x40);
  if (lVar2 != 0) {
    uVar5 = *(longlong *)(param_1 + 0x50) - lVar2;
    lVar4 = lVar2;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar4)) goto LAB_7ff70c78e526;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x48) = 0;
    *(undefined8 *)(param_1 + 0x50) = 0;
  }
  lVar2 = *(longlong *)(param_1 + 0x20);
  if (lVar2 != 0) {
    uVar5 = *(longlong *)(param_1 + 0x30) - lVar2;
    lVar4 = lVar2;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar4)) goto LAB_7ff70c78e526;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    *(undefined8 *)(param_1 + 0x20) = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
    *(undefined8 *)(param_1 + 0x30) = 0;
  }
  lVar2 = *(longlong *)(param_1 + 8);
  if (lVar2 != 0) {
    uVar5 = *(longlong *)(param_1 + 0x18) - lVar2;
    lVar4 = lVar2;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar4)) {
LAB_7ff70c78e526:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    *(undefined8 *)(param_1 + 8) = 0;
    *(undefined8 *)(param_1 + 0x10) = 0;
    *(undefined8 *)(param_1 + 0x18) = 0;
  }
  return;
}


