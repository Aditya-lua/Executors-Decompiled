/* 7ff70c917731 Unwind@7ff70c917731 */

void Unwind_7ff70c917731(undefined8 param_1,longlong param_2)

{
  byte bVar1;
  undefined8 uVar2;
  ulonglong uVar3;
  longlong lVar4;
  code *pcVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  
  bVar1 = *(byte *)(param_2 + 0x447);
  uVar2 = *(undefined8 *)(param_2 + 0x3f8);
  lVar8 = 0;
  do {
    uVar3 = *(ulonglong *)(param_2 + 0x318 + lVar8);
    if (0xf < uVar3) {
      lVar4 = *(longlong *)(param_2 + 0x300 + lVar8);
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
    *(undefined8 *)(param_2 + 0x310 + lVar8) = 0;
    *(undefined8 *)(param_2 + 0x318 + lVar8) = 0xf;
    *(undefined1 *)(param_2 + 0x300 + lVar8) = 0;
    lVar8 = lVar8 + -0x30;
  } while (lVar8 != -0x60);
  *(undefined8 *)(param_2 + 800) = uVar2;
  *(undefined1 *)(param_2 + 0x440) = 0;
  *(byte *)(param_2 + 0x43f) = bVar1 & 1;
  return;
}


