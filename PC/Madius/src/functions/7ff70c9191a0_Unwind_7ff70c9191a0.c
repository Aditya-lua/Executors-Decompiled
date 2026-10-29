/* 7ff70c9191a0 Unwind@7ff70c9191a0 */

void Unwind_7ff70c9191a0(undefined8 param_1,longlong param_2)

{
  byte bVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  
  bVar1 = *(byte *)(param_2 + 0x237);
  lVar7 = *(longlong *)(param_2 + 0x228);
  uVar2 = *(ulonglong *)(param_2 + 0x218);
  if (0xf < uVar2) {
    lVar3 = *(longlong *)(param_2 + 0x200);
    uVar5 = uVar2 + 1;
    lVar6 = lVar3;
    if (0xfff < uVar5) {
      lVar6 = *(longlong *)(lVar3 + -8);
      if (0x1f < (ulonglong)((lVar3 + -8) - lVar6)) {
                    /* WARNING: Does not return */
        pcVar4 = (code *)invalidInstructionException();
        (*pcVar4)();
      }
      uVar5 = uVar2 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar5);
  }
  if ((bVar1 & param_2 + 0x150 != lVar7) == 1) {
    do {
      lVar3 = lVar7 + -0x28;
      func_0x7ff70c91d040(lVar7 + -0x20);
      lVar7 = lVar3;
    } while (lVar3 != param_2 + 0x150);
  }
  return;
}


