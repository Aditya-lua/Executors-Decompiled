/* 7ff70c7a8540 FUN_7ff70c7a8540 */

void FUN_7ff70c7a8540(longlong param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  longlong lVar8;
  
  if (*(char *)(param_1 + 0x40) == '\x02') {
    if (param_1 + 0x18 != param_2) {
      uVar1 = *(ulonglong *)(param_1 + 0x38);
      if (0xf < uVar1) {
        lVar2 = *(longlong *)(param_1 + 0x20);
        uVar7 = uVar1 + 1;
        lVar8 = lVar2;
        if (0xfff < uVar7) {
          lVar8 = *(longlong *)(lVar2 + -8);
          if (0x1f < (ulonglong)((lVar2 + -8) - lVar8)) {
                    /* WARNING: Does not return */
            pcVar3 = (code *)invalidInstructionException();
            (*pcVar3)();
          }
          uVar7 = uVar1 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar8,uVar7);
      }
      *(undefined8 *)(param_1 + 0x30) = 0;
      *(undefined8 *)(param_1 + 0x38) = 0xf;
      *(undefined1 *)(param_1 + 0x20) = 0;
      lVar2 = *(longlong *)(param_2 + 8);
      uVar4 = *(undefined8 *)(param_2 + 0x10);
      uVar5 = *(undefined8 *)(param_2 + 0x20);
      *(undefined8 *)(param_1 + 0x30) = *(undefined8 *)(param_2 + 0x18);
      *(undefined8 *)(param_1 + 0x38) = uVar5;
      *(longlong *)(param_1 + 0x20) = lVar2;
      *(undefined8 *)(param_1 + 0x28) = uVar4;
      *(undefined8 *)(param_2 + 0x18) = 0;
      *(undefined8 *)(param_2 + 0x20) = 0xf;
      *(undefined1 *)(param_2 + 8) = 0;
    }
  }
  else {
    FUN_7ff70ca3df20();
    *(undefined1 *)(param_1 + 0x40) = 0xff;
    *(undefined **)(param_1 + 0x18) = &UNK_7ff70cb743a8;
    *(undefined8 *)(param_1 + 0x30) = 0;
    *(undefined8 *)(param_1 + 0x38) = 0;
    *(undefined8 *)(param_1 + 0x20) = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
    uVar4 = *(undefined8 *)(param_2 + 8);
    uVar5 = *(undefined8 *)(param_2 + 0x10);
    uVar6 = *(undefined8 *)(param_2 + 0x20);
    *(undefined8 *)(param_1 + 0x30) = *(undefined8 *)(param_2 + 0x18);
    *(undefined8 *)(param_1 + 0x38) = uVar6;
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    *(undefined8 *)(param_1 + 0x28) = uVar5;
    *(undefined8 *)(param_2 + 0x18) = 0;
    *(undefined8 *)(param_2 + 0x20) = 0xf;
    *(undefined1 *)(param_2 + 8) = 0;
    *(undefined **)(param_1 + 0x18) = &UNK_7ff70cb74398;
    *(undefined1 *)(param_1 + 0x40) = 2;
  }
  return;
}


