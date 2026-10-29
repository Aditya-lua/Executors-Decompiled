/* 7ff70c91db10 FUN_7ff70c91db10 */

void FUN_7ff70c91db10(longlong *param_1)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  
  param_1 = (longlong *)*param_1;
  if (param_1 == (longlong *)0x0) {
    return;
  }
  if ((char)param_1[3] != -1) {
    if ((char)param_1[3] == '\x01') {
      FUN_7ff70c921570(param_1);
    }
    else {
      lVar1 = *param_1;
      if (lVar1 != 0) {
        uVar4 = param_1[2] - lVar1;
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
    }
  }
  thunk_FUN_7ff70ca90250(param_1,0x20);
  return;
}


