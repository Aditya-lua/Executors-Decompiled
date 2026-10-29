/* 7ff70c9e66d0 Catch@7ff70c9e66d0 */

undefined * Catch_7ff70c9e66d0(undefined8 param_1,longlong param_2)

{
  code *pcVar1;
  int iVar2;
  uint uVar3;
  undefined8 uVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  longlong lVar8;
  ulonglong uVar9;
  
  uVar4 = (**(code **)(**(longlong **)(param_2 + 0x90) + 8))();
  *(undefined8 *)(param_2 + 0x38) = uVar4;
  lVar5 = func_0x7ff70cb12a90(*(undefined8 *)(param_2 + 0x90));
  uVar4 = func_0x7ff70cb12b10(lVar5 + 8,0x7ff70cc1ab30);
  *(undefined8 *)(param_2 + 0x40) = 0;
  *(undefined8 *)(param_2 + 0x48) = 0;
  uVar6 = func_0x7ff70cb12e80(uVar4);
  if ((longlong)uVar6 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_7ff70ca00780();
  }
  if (uVar6 < 0x10) {
    uVar7 = param_2 + 0x40;
    uVar9 = 0xf;
  }
  else {
    uVar7 = uVar6 | 0xf;
    uVar9 = 0x16;
    if (0x16 < uVar7) {
      uVar9 = uVar7;
    }
    if (uVar7 < 0xfff) {
      uVar7 = func_0x7ff70ca8ff40(uVar9 + 1);
    }
    else {
      lVar5 = func_0x7ff70ca8ff40(uVar9 + 0x28);
      uVar7 = lVar5 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar7 - 8) = lVar5;
    }
    *(ulonglong *)(param_2 + 0x40) = uVar7;
  }
  *(ulonglong *)(param_2 + 0x50) = uVar6;
  *(ulonglong *)(param_2 + 0x58) = uVar9;
  func_0x7ff70cb12b60(uVar7,uVar4,uVar6);
  *(undefined1 *)(uVar7 + uVar6) = 0;
  func_0x7ff70c99f570(param_2 + 0x60,param_2 + 0x40,0);
  iVar2 = func_0x7ff70d73026e(2);
  uVar3 = iVar2 + 0x158d4890;
  func_0x7ff70c9e6d00(CONCAT31((int3)(uVar3 >> 8),
                               ((byte)uVar3 - *(char *)(ulonglong)uVar3) - ((byte)uVar3 < 0xa5)));
  uVar6 = *(ulonglong *)(param_2 + 0x78);
  if (0xf < uVar6) {
    lVar5 = *(longlong *)(param_2 + 0x60);
    uVar9 = uVar6 + 1;
    lVar8 = lVar5;
    if (0xfff < uVar9) {
      lVar8 = *(longlong *)(lVar5 + -8);
      if (0x1f < (ulonglong)((lVar5 + -8) - lVar8)) goto LAB_7ff70c9e687d;
      uVar9 = uVar6 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar9);
  }
  *(undefined8 *)(param_2 + 0x70) = 0;
  *(undefined8 *)(param_2 + 0x78) = 0xf;
  *(undefined1 *)(param_2 + 0x60) = 0;
  uVar6 = *(ulonglong *)(param_2 + 0x58);
  if (0xf < uVar6) {
    lVar5 = *(longlong *)(param_2 + 0x40);
    uVar9 = uVar6 + 1;
    lVar8 = lVar5;
    if (0xfff < uVar9) {
      lVar8 = *(longlong *)(lVar5 + -8);
      if (0x1f < (ulonglong)((lVar5 + -8) - lVar8)) {
LAB_7ff70c9e687d:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar9 = uVar6 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar8,uVar9);
  }
  func_0x7ff70c9e62c0();
  return &UNK_7ff70c9e642f;
}


