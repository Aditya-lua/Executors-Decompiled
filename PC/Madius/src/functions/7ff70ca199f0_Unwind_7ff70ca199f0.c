/* 7ff70ca199f0 Unwind@7ff70ca199f0 */

void Unwind_7ff70ca199f0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong *plVar7;
  
  plVar7 = *(longlong **)(param_2 + 0x860);
  if ((longlong *)(param_2 + 0x9b0) != *(longlong **)(param_2 + 0x860) &&
      (*(byte *)(param_2 + 0xc37) & 1) == 0) {
    do {
      uVar2 = plVar7[-1];
      if (0xf < uVar2) {
        lVar3 = plVar7[-4];
        uVar5 = uVar2 + 1;
        lVar6 = lVar3;
        if (0xfff < uVar5) {
          lVar6 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar6)) goto LAB_7ff70ca19af6;
          uVar5 = uVar2 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar6,uVar5);
      }
      plVar1 = plVar7 + -8;
      plVar7[-2] = 0;
      plVar7[-1] = 0xf;
      *(undefined1 *)(plVar7 + -4) = 0;
      uVar2 = plVar7[-5];
      if (0xf < uVar2) {
        lVar3 = *plVar1;
        uVar5 = uVar2 + 1;
        lVar6 = lVar3;
        if (0xfff < uVar5) {
          lVar6 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar6)) {
LAB_7ff70ca19af6:
                    /* WARNING: Does not return */
            pcVar4 = (code *)invalidInstructionException();
            (*pcVar4)();
          }
          uVar5 = uVar2 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar6,uVar5);
      }
      plVar7[-6] = 0;
      plVar7[-5] = 0xf;
      *(undefined1 *)(plVar7 + -8) = 0;
      plVar7 = plVar1;
    } while (plVar1 != (longlong *)(param_2 + 0x9b0));
  }
  return;
}


