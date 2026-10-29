/* 7ff70c9190e0 Unwind@7ff70c9190e0 */

void Unwind_7ff70c9190e0(undefined8 param_1,longlong param_2)

{
  byte bVar1;
  undefined8 uVar2;
  ulonglong uVar3;
  longlong lVar4;
  code *pcVar5;
  ulonglong uVar6;
  longlong lVar7;
  
  bVar1 = *(byte *)(param_2 + 0x236);
  uVar2 = *(undefined8 *)(param_2 + 0x140);
  uVar3 = *(ulonglong *)(param_2 + 0x138);
  if (0xf < uVar3) {
    lVar4 = *(longlong *)(param_2 + 0x120);
    uVar6 = uVar3 + 1;
    lVar7 = lVar4;
    if (0xfff < uVar6) {
      lVar7 = *(longlong *)(lVar4 + -8);
      if (0x1f < (ulonglong)((lVar4 + -8) - lVar7)) {
                    /* WARNING: Does not return */
        pcVar5 = (code *)invalidInstructionException();
        (*pcVar5)();
      }
      uVar6 = uVar3 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar6);
  }
  *(undefined8 *)(param_2 + 0x130) = 0;
  *(undefined8 *)(param_2 + 0x138) = 0xf;
  *(undefined1 *)(param_2 + 0x120) = 0;
  *(undefined8 *)(param_2 + 0x228) = uVar2;
  *(byte *)(param_2 + 0x237) = bVar1 & 1;
  return;
}


