/* 7ff70c8f8fd0 Unwind@7ff70c8f8fd0 */

void Unwind_7ff70c8f8fd0(undefined8 param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  
  uVar1 = *(ulonglong *)(param_2 + 0xf0);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0xd8);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f916b;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0xe8) = 0;
  *(undefined8 *)(param_2 + 0xf0) = 0xf;
  *(undefined1 *)(param_2 + 0xd8) = 0;
  uVar1 = *(ulonglong *)(param_2 + 200);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0xb0);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f916b;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0xc0) = 0;
  *(undefined8 *)(param_2 + 200) = 0xf;
  *(undefined1 *)(param_2 + 0xb0) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0xa0);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x88);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f916b;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0x98) = 0;
  *(undefined8 *)(param_2 + 0xa0) = 0xf;
  *(undefined1 *)(param_2 + 0x88) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0x78);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x60);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f916b;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0x70) = 0;
  *(undefined8 *)(param_2 + 0x78) = 0xf;
  *(undefined1 *)(param_2 + 0x60) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0x50);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x38);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) {
LAB_7ff70c8f916b:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  return;
}


