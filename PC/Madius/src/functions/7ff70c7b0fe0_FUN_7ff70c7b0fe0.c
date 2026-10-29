/* 7ff70c7b0fe0 FUN_7ff70c7b0fe0 */

void FUN_7ff70c7b0fe0(undefined8 *param_1)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  
  *param_1 = &UNK_7ff70cb14c68;
  FUN_7ff70c7b35e0(param_1 + 1);
  FUN_7ff70c7b35e0(param_1 + 5);
  uVar1 = param_1[8];
  if (0xf < uVar1) {
    lVar2 = param_1[5];
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c7b10c1;
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  param_1[7] = 0;
  param_1[8] = 0xf;
  *(undefined1 *)(param_1 + 5) = 0;
  uVar1 = param_1[4];
  if (0xf < uVar1) {
    lVar2 = param_1[1];
    uVar4 = uVar1 + 1;
    lVar5 = lVar2;
    if (0xfff < uVar4) {
      lVar5 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) {
LAB_7ff70c7b10c1:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar4 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar4);
  }
  param_1[3] = 0;
  param_1[4] = 0xf;
  *(undefined1 *)(param_1 + 1) = 0;
  return;
}


