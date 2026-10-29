/* 7ff70c9e6880 Catch_All@7ff70c9e6880 */

undefined * Catch_All_7ff70c9e6880(undefined8 param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  undefined8 uVar4;
  ulonglong uVar5;
  longlong lVar6;
  
  *(undefined8 *)(param_2 + 0x68) = 0;
  *(undefined8 *)(param_2 + 0x70) = 9;
  *(undefined8 *)(param_2 + 0x78) = 0xf;
  *(undefined8 *)(param_2 + 0x60) = 0x6e776f6e6b6e753c;
  *(undefined1 *)(param_2 + 0x68) = 0x3e;
  uVar4 = func_0x7ff70d97268d(2);
  func_0x7ff70c9e6bf0(uVar4,&UNK_7ff70cb90c4a,param_2 + 0x60);
  uVar1 = *(ulonglong *)(param_2 + 0x78);
  if (0xf < uVar1) {
    lVar2 = *(longlong *)(param_2 + 0x60);
    uVar5 = uVar1 + 1;
    lVar6 = lVar2;
    if (0xfff < uVar5) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) {
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar5 = uVar1 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar5);
  }
  func_0x7ff70c9e62c0();
  return &UNK_7ff70c9e642f;
}


