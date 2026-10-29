/* 7ff70c932ee0 FUN_7ff70c932ee0 */

void FUN_7ff70c932ee0(longlong *param_1)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  
  if (((char)param_1[3] == '\x01') && (lVar2 = *param_1, lVar2 != 0)) {
    uVar3 = param_1[2] - lVar2;
    if (0xfff < uVar3) {
      if (0x1f < (ulonglong)((lVar2 + -8) - *(longlong *)(lVar2 + -8))) {
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar3 = uVar3 + 0x27;
      lVar2 = *(longlong *)(lVar2 + -8);
    }
    thunk_FUN_7ff70ca90250(lVar2,uVar3);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}


