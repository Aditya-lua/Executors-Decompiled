/* 7ff70c929e50 FUN_7ff70c929e50 */

void FUN_7ff70c929e50(ulonglong *param_1,ulonglong *param_2,ulonglong *param_3,ulonglong param_4)

{
  ulonglong uVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  
  if (param_4 != 0) {
    uVar1 = param_4 * 8;
    uVar5 = (ulonglong)((uint)*param_2 & 7);
    uVar4 = 8 - uVar5;
    if (uVar5 == 0) {
      uVar4 = 0;
    }
    if (uVar1 <= *param_3 - uVar4 && uVar4 <= *param_3) {
      *param_2 = *param_2 + uVar4;
      *param_3 = *param_3 - uVar4;
      uVar4 = *param_2;
      if (uVar4 != 0) {
        FUN_7ff70cb12b80(uVar4,0,uVar1);
        *(undefined1 *)(param_1 + 2) = 0;
        *param_1 = uVar4;
        param_1[1] = uVar4 + param_4 * 8;
        *param_2 = *param_2 + uVar1;
        *param_3 = *param_3 + param_4 * -8;
        return;
      }
    }
    if (param_4 >> 0x3d != 0) {
      FUN_7ff70cb12980(0xc);
LAB_7ff70c929f56:
      FUN_7ff70ca007a0();
      pcVar2 = (code *)swi(3);
      (*pcVar2)();
      return;
    }
    if (param_4 < 0x200) {
      uVar4 = FUN_7ff70ca8ff40(uVar1);
    }
    else {
      if (0x1ffffffffffffffb < param_4) goto LAB_7ff70c929f56;
      lVar3 = FUN_7ff70ca8ff40(uVar1 + 0x27);
      uVar4 = lVar3 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar4 - 8) = lVar3;
    }
    FUN_7ff70cb12b80(uVar4,0,uVar1);
    param_1[1] = uVar4 + param_4 * 8;
    *(undefined1 *)(param_1 + 2) = 1;
    *param_1 = uVar4;
  }
  return;
}


