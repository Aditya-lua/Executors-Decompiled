/* 7ff70ca19810 Unwind@7ff70ca19810 */

void Unwind_7ff70ca19810(undefined8 param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  
  uVar1 = *(ulonglong *)(param_2 + 0xa28);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0xa10);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70ca199e0;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0xa20) = 0;
  *(undefined8 *)(param_2 + 0xa28) = 0xf;
  *(undefined1 *)(param_2 + 0xa10) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0xa08);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x9f0);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70ca199e0;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0xa00) = 0;
  *(undefined8 *)(param_2 + 0xa08) = 0xf;
  *(undefined1 *)(param_2 + 0x9f0) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0x9e8);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x9d0);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70ca199e0;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0x9e0) = 0;
  *(undefined8 *)(param_2 + 0x9e8) = 0xf;
  *(undefined1 *)(param_2 + 0x9d0) = 0;
  uVar1 = *(ulonglong *)(param_2 + 0x9c8);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x9b0);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) {
LAB_7ff70ca199e0:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  *(undefined8 *)(param_2 + 0x9c0) = 0;
  *(undefined8 *)(param_2 + 0x9c8) = 0xf;
  *(undefined1 *)(param_2 + 0x9b0) = 0;
  *(undefined1 *)(param_2 + 0xc37) = 1;
  *(longlong *)(param_2 + 0x860) = param_2 + 0x9f0;
  return;
}


