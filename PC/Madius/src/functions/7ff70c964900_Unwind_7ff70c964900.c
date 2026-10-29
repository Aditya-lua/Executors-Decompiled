/* 7ff70c964900 Unwind@7ff70c964900 */

void Unwind_7ff70c964900(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  
  func_0x7ff70cb12840(param_2 + 0xc0);
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
  }
  return;
}


