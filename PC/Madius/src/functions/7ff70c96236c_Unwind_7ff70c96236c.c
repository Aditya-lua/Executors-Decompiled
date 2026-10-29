/* 7ff70c96236c Unwind@7ff70c96236c */

void Unwind_7ff70c96236c(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  
  lVar1 = *(longlong *)(param_2 + 0xe0);
  if (lVar1 != 0) {
    uVar4 = *(longlong *)(param_2 + 0xf0) - lVar1;
    lVar3 = lVar1;
    if (0xfff < uVar4) {
      lVar3 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar3)) {
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar4 = uVar4 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar4);
    *(undefined8 *)(param_2 + 0xe0) = 0;
    *(undefined8 *)(param_2 + 0xe8) = 0;
    *(undefined8 *)(param_2 + 0xf0) = 0;
  }
  return;
}


