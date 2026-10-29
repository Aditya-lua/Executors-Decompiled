/* 7ff70ca19670 Unwind@7ff70ca19670 */

void Unwind_7ff70ca19670(undefined8 param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  
  uVar1 = *(ulonglong *)(param_2 + 0x2c0);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x2a8);
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) {
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


