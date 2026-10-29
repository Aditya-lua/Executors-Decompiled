/* 7ff70c929b00 FUN_7ff70c929b00 */

void FUN_7ff70c929b00(ulonglong *param_1,ulonglong *param_2,ulonglong *param_3,ulonglong param_4)

{
  code *pcVar1;
  ulonglong uVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  
  if (param_4 != 0) {
    uVar2 = param_4 * 0x18;
    uVar5 = (ulonglong)((uint)*param_2 & 7);
    uVar4 = 8 - uVar5;
    if (uVar5 == 0) {
      uVar4 = 0;
    }
    if (uVar2 <= *param_3 - uVar4 && uVar4 <= *param_3) {
      *param_2 = *param_2 + uVar4;
      *param_3 = *param_3 - uVar4;
      uVar4 = *param_2;
      if (uVar4 != 0) {
        FUN_7ff70cb12b80(uVar4,0,((uVar2 - 0x18) / 0x18) * 0x18 + 0x18);
        *(undefined1 *)(param_1 + 2) = 0;
        *param_1 = uVar4;
        param_1[1] = uVar4 + uVar2;
        *param_2 = *param_2 + uVar2;
        *param_3 = *param_3 + param_4 * -0x18;
        return;
      }
    }
    if (0xaaaaaaaaaaaaaaa < param_4) {
      FUN_7ff70cb12980(0xc);
LAB_7ff70c929c27:
      FUN_7ff70ca007a0();
      pcVar1 = (code *)swi(3);
      (*pcVar1)();
      return;
    }
    if (param_4 < 0xab) {
      uVar4 = FUN_7ff70ca8ff40(uVar2);
    }
    else {
      if (param_4 == 0xaaaaaaaaaaaaaaa) goto LAB_7ff70c929c27;
      lVar3 = FUN_7ff70ca8ff40(uVar2 + 0x27);
      uVar4 = lVar3 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar4 - 8) = lVar3;
    }
    FUN_7ff70cb12b80(uVar4,0,uVar2);
    param_1[1] = uVar2 + uVar4;
    *(undefined1 *)(param_1 + 2) = 1;
    *param_1 = uVar4;
  }
  return;
}


