/* 7ff70c9e64c0 Catch@7ff70c9e64c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * Catch_7ff70c9e64c0(undefined8 param_1,longlong param_2)

{
  code *pcVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  longlong lVar7;
  ulonglong uVar8;
  
  uVar3 = (**(code **)(**(longlong **)(param_2 + 0x98) + 0x10))();
  *(undefined8 *)(param_2 + 0x38) = uVar3;
  lVar4 = func_0x7ff70cb12a90(*(undefined8 *)(param_2 + 0x98));
  uVar3 = func_0x7ff70cb12b10(lVar4 + 8,0x7ff70cc1ab30);
  *(undefined8 *)(param_2 + 0x40) = 0;
  *(undefined8 *)(param_2 + 0x48) = 0;
  uVar5 = func_0x7ff70cb12e80(uVar3);
  if ((longlong)uVar5 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_7ff70ca00780();
  }
  if (uVar5 < 0x10) {
    uVar6 = param_2 + 0x40;
    uVar8 = 0xf;
  }
  else {
    uVar6 = uVar5 | 0xf;
    uVar8 = 0x16;
    if (0x16 < uVar6) {
      uVar8 = uVar6;
    }
    if (uVar6 < 0xfff) {
      uVar6 = func_0x7ff70ca8ff40(uVar8 + 1);
    }
    else {
      lVar4 = func_0x7ff70ca8ff40(uVar8 + 0x28);
      uVar6 = lVar4 + 0x27U & 0xffffffffffffffe0;
      *(longlong *)(uVar6 - 8) = lVar4;
    }
    *(ulonglong *)(param_2 + 0x40) = uVar6;
  }
  *(ulonglong *)(param_2 + 0x50) = uVar5;
  *(ulonglong *)(param_2 + 0x58) = uVar8;
  func_0x7ff70cb12b60(uVar6,uVar3,uVar5);
  *(undefined1 *)(uVar6 + uVar5) = 0;
  func_0x7ff70c99f570(param_2 + 0x60,param_2 + 0x40,0);
  uVar3 = FUN_7ff70d75c599(2);
  func_0x7ff70c9e6d00(uVar3,&UNK_7ff70cb90d02,param_2 + 0x60,param_2 + 0x38);
  uVar5 = *(ulonglong *)(param_2 + 0x78);
  if (0xf < uVar5) {
    lVar4 = *(longlong *)(param_2 + 0x60);
    uVar8 = uVar5 + 1;
    lVar7 = lVar4;
    if (0xfff < uVar8) {
      lVar7 = *(longlong *)(lVar4 + -8);
      if (0x1f < (ulonglong)((lVar4 + -8) - lVar7)) goto LAB_7ff70c9e6696;
      uVar8 = uVar5 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar8);
  }
  *(undefined8 *)(param_2 + 0x70) = 0;
  *(undefined8 *)(param_2 + 0x78) = 0xf;
  *(undefined1 *)(param_2 + 0x60) = 0;
  uVar5 = *(ulonglong *)(param_2 + 0x58);
  if (0xf < uVar5) {
    lVar4 = *(longlong *)(param_2 + 0x40);
    uVar8 = uVar5 + 1;
    lVar7 = lVar4;
    if (0xfff < uVar8) {
      lVar7 = *(longlong *)(lVar4 + -8);
      if (0x1f < (ulonglong)((lVar4 + -8) - lVar7)) {
LAB_7ff70c9e6696:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar8 = uVar5 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar7,uVar8);
  }
  uVar3 = (**(code **)(**(longlong **)(param_2 + 0x98) + 0x18))();
  uVar2 = FUN_7ff70c9ee7e0(_DAT_7ff70cc1b0f0);
  func_0x7ff70c960ca0(uVar3,_DAT_7ff70cb95d18,uVar2);
  return &UNK_7ff70c9e642f;
}


