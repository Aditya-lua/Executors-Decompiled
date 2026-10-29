/* 7ff70c9174b3 Unwind@7ff70c9174b3 */

void Unwind_7ff70c9174b3(undefined8 param_1,longlong param_2)

{
  byte bVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  
  bVar1 = *(byte *)(param_2 + 0x443);
  uVar2 = *(ulonglong *)(param_2 + 0x388);
  if (0xf < uVar2) {
    lVar3 = *(longlong *)(param_2 + 0x370);
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
  *(undefined8 *)(param_2 + 0x380) = 0;
  *(undefined8 *)(param_2 + 0x388) = 0xf;
  *(undefined1 *)(param_2 + 0x370) = 0;
  *(byte *)(param_2 + 0x442) = bVar1 & 1;
  return;
}


