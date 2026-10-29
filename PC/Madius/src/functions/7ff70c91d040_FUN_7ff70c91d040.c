/* 7ff70c91d040 FUN_7ff70c91d040 */

void FUN_7ff70c91d040(longlong *param_1)

{
  longlong lVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong lVar7;
  
  lVar7 = *param_1;
  if (lVar7 != 0) {
    lVar1 = param_1[1];
    if (lVar7 == lVar1) {
      uVar6 = param_1[2] - lVar7;
    }
    else {
      do {
        uVar6 = *(ulonglong *)(lVar7 + 0x28);
        if (0xf < uVar6) {
          lVar2 = *(longlong *)(lVar7 + 0x10);
          uVar4 = uVar6 + 1;
          lVar5 = lVar2;
          if (0xfff < uVar4) {
            lVar5 = *(longlong *)(lVar2 + -8);
            if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c91d123;
            uVar4 = uVar6 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar5,uVar4);
        }
        *(undefined8 *)(lVar7 + 0x20) = 0;
        *(undefined8 *)(lVar7 + 0x28) = 0xf;
        *(undefined1 *)(lVar7 + 0x10) = 0;
        lVar7 = lVar7 + 0x30;
      } while (lVar7 != lVar1);
      lVar7 = *param_1;
      uVar6 = param_1[2] - lVar7;
    }
    if (0xfff < uVar6) {
      if (0x1f < (ulonglong)((lVar7 + -8) - *(longlong *)(lVar7 + -8))) {
LAB_7ff70c91d123:
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar6 = uVar6 + 0x27;
      lVar7 = *(longlong *)(lVar7 + -8);
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar6);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}


