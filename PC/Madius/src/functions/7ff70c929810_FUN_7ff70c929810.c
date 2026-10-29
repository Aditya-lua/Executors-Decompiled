/* 7ff70c929810 FUN_7ff70c929810 */

void FUN_7ff70c929810(longlong param_1)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  
  if (*(char *)(param_1 + 0xa8) == '\x01') {
    lVar1 = *(longlong *)(param_1 + 0x90);
    uVar4 = *(longlong *)(param_1 + 0xa0) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) goto LAB_7ff70c92998c;
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
  }
  if (*(char *)(param_1 + 0x88) == '\x01') {
    lVar1 = *(longlong *)(param_1 + 0x78);
    uVar4 = *(longlong *)(param_1 + 0x80) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) goto LAB_7ff70c92998c;
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
  }
  if (*(char *)(param_1 + 0x70) == '\x01') {
    lVar1 = *(longlong *)(param_1 + 0x60);
    uVar4 = *(longlong *)(param_1 + 0x68) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) goto LAB_7ff70c92998c;
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
  }
  if (*(char *)(param_1 + 0x58) == '\x01') {
    lVar1 = *(longlong *)(param_1 + 0x48);
    uVar4 = *(longlong *)(param_1 + 0x50) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) goto LAB_7ff70c92998c;
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
  }
  if (*(char *)(param_1 + 0x38) == '\x01') {
    lVar1 = *(longlong *)(param_1 + 0x28);
    uVar4 = *(longlong *)(param_1 + 0x30) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) goto LAB_7ff70c92998c;
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
  }
  if (*(char *)(param_1 + 0x20) != '\x01') {
    return;
  }
  lVar1 = *(longlong *)(param_1 + 0x10);
  uVar4 = *(longlong *)(param_1 + 0x18) - lVar1;
  lVar3 = lVar1;
  if (0xfff < uVar4) {
    lVar3 = *(longlong *)(lVar1 + -8);
    if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) {
LAB_7ff70c92998c:
                    /* WARNING: Does not return */
      pcVar2 = (code *)invalidInstructionException();
      (*pcVar2)();
    }
    uVar4 = uVar4 + 0x27;
  }
  thunk_FUN_7ff70ca90250(lVar3,uVar4);
  return;
}


