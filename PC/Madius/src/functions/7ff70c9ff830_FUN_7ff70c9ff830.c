/* 7ff70c9ff830 FUN_7ff70c9ff830 */

void FUN_7ff70c9ff830(longlong *param_1)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  
  uVar1 = param_1[3];
  if (7 < uVar1) {
    lVar2 = *param_1;
    uVar4 = uVar1 * 2 + 2;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) {
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar4 = uVar1 * 2 + 0x29;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  param_1[2] = 0;
  param_1[3] = 7;
  *(undefined2 *)param_1 = 0;
  return;
}


