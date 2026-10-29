/* 7ff70c929c30 FUN_7ff70c929c30 */

void FUN_7ff70c929c30(ulonglong *param_1,ulonglong *param_2,ulonglong *param_3,ulonglong param_4)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  
  if (param_4 != 0) {
    uVar4 = param_4 * 0x10;
    uVar5 = (ulonglong)((uint)*param_2 & 7);
    uVar3 = 8 - uVar5;
    if (uVar5 == 0) {
      uVar3 = 0;
    }
    if (uVar4 <= *param_3 - uVar3 && uVar3 <= *param_3) {
      *param_2 = *param_2 + uVar3;
      *param_3 = *param_3 - uVar3;
      uVar3 = *param_2;
      if (uVar3 != 0) {
        FUN_7ff70cb12b80(uVar3,0,uVar4);
        *(undefined1 *)(param_1 + 2) = 0;
        *param_1 = uVar3;
        param_1[1] = uVar3 + uVar4;
        *param_2 = *param_2 + uVar4;
        *param_3 = *param_3 + param_4 * -0x10;
        return;
      }
    }
    if (param_4 >> 0x3c != 0) {
      FUN_7ff70cb12980(0xc);
LAB_7ff70c929d2b:
      FUN_7ff70ca007a0();
      pcVar1 = (code *)swi(3);
      (*pcVar1)();
      return;
    }
    if (param_4 < 0x100) {
      uVar3 = FUN_7ff70ca8ff40(uVar4);
    }
    else {
      if (0xffffffffffffffd < param_4) goto LAB_7ff70c929d2b;
      lVar2 = FUN_7ff70ca8ff40(uVar4 + 0x27);
      uVar3 = lVar2 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar3 - 8) = lVar2;
    }
    FUN_7ff70cb12b80(uVar3,0,uVar4);
    param_1[1] = uVar4 + uVar3;
    *(undefined1 *)(param_1 + 2) = 1;
    *param_1 = uVar3;
  }
  return;
}


