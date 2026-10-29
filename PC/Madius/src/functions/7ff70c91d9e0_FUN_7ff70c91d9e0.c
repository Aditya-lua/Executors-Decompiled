/* 7ff70c91d9e0 FUN_7ff70c91d9e0 */

ulonglong * FUN_7ff70c91d9e0(ulonglong *param_1,longlong *param_2)

{
  code *pcVar1;
  ulonglong uVar2;
  longlong lVar3;
  longlong lVar4;
  
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  lVar4 = param_2[1] - *param_2;
  if (lVar4 != 0) {
    uVar2 = param_2[1] - *param_2 >> 3;
    if (uVar2 >> 0x3d != 0) {
      FUN_7ff70c7ac850();
      goto LAB_7ff70c91dadc;
    }
    if (uVar2 < 0x200) {
      uVar2 = FUN_7ff70ca8ff40(lVar4);
    }
    else {
      lVar3 = FUN_7ff70ca8ff40(lVar4 + 0x27);
      uVar2 = lVar3 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar2 - 8) = lVar3;
    }
    *param_1 = uVar2;
    param_1[1] = uVar2;
    param_1[2] = lVar4 + uVar2;
    lVar4 = param_2[1] - *param_2;
    FUN_7ff70cb12b60(uVar2,*param_2,lVar4);
    param_1[1] = lVar4 + uVar2;
  }
  *(undefined1 *)(param_1 + 3) = 0;
  lVar4 = *param_2;
  if (lVar4 != 0) {
    uVar2 = param_2[2] - lVar4;
    lVar3 = lVar4;
    if (0xfff < uVar2) {
      lVar3 = *(longlong *)(lVar4 + -8);
      if (0x1f < (ulonglong)((lVar4 + -8) - lVar3)) {
LAB_7ff70c91dadc:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar2 = uVar2 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar3,uVar2);
  }
  return param_1;
}


