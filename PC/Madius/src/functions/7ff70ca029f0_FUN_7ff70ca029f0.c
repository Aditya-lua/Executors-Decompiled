/* 7ff70ca029f0 FUN_7ff70ca029f0 */

void FUN_7ff70ca029f0(longlong *param_1)

{
  longlong lVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  ulonglong uVar5;
  
  lVar1 = param_1[10];
  if (lVar1 != 0) {
    uVar5 = param_1[0xc] - lVar1;
    lVar4 = lVar1;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70ca02b2a;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[0xc] = 0;
  }
  uVar5 = param_1[9];
  if (0xf < uVar5) {
    lVar1 = param_1[6];
    uVar3 = uVar5 + 1;
    lVar4 = lVar1;
    if (0xfff < uVar3) {
      lVar4 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70ca02b2a;
      uVar3 = uVar5 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar3);
  }
  param_1[8] = 0;
  param_1[9] = 0xf;
  *(undefined1 *)(param_1 + 6) = 0;
  lVar1 = param_1[3];
  if (lVar1 != 0) {
    uVar5 = param_1[5] - lVar1;
    lVar4 = lVar1;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) goto LAB_7ff70ca02b2a;
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    param_1[3] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
  }
  lVar1 = *param_1;
  if (lVar1 != 0) {
    uVar5 = param_1[2] - lVar1;
    lVar4 = lVar1;
    if (0xfff < uVar5) {
      lVar4 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar4)) {
LAB_7ff70ca02b2a:
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar5 = uVar5 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar5);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}


