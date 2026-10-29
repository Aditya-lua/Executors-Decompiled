/* 7ff70c917876 Unwind@7ff70c917876 */

void Unwind_7ff70c917876(undefined8 param_1,longlong param_2)

{
  byte bVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  
  bVar1 = *(byte *)(param_2 + 0x444);
  lVar8 = *(longlong *)(param_2 + 0x3d8);
  lVar7 = *(longlong *)(param_2 + 0x3e0);
  if ((param_2 + 0x2c0 != lVar8 & *(byte *)(param_2 + 0x445)) == 1) {
    do {
      uVar2 = *(ulonglong *)(lVar8 + -8);
      if (0xf < uVar2) {
        lVar3 = *(longlong *)(lVar8 + -0x20);
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
      *(undefined8 *)(lVar8 + -0x10) = 0;
      *(undefined8 *)(lVar8 + -8) = 0xf;
      *(undefined1 *)(lVar8 + -0x20) = 0;
      lVar8 = lVar8 + -0x30;
    } while (lVar8 != param_2 + 0x2c0);
  }
  if ((bVar1 & param_2 + 0x360 != lVar7) == 1) {
    do {
      lVar8 = lVar7 + -0x28;
      func_0x7ff70c91d040(lVar7 + -0x20);
      lVar7 = lVar8;
    } while (lVar8 != param_2 + 0x360);
  }
  func_0x7ff70c91d040(param_2 + 0x228);
  return;
}


