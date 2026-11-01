
undefined1  [16]
FUN_0027b620(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,ulong param_4,
            undefined8 param_5,ulong param_6,undefined8 param_7,undefined8 param_8,
            undefined8 param_9,ulong param_10)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  
  lVar3 = func_0x002da7a0(*param_1,0);
  if (lVar3 == 0) {
    param_5 = 0;
    goto LAB_0027b6e8;
  }
  iVar2 = func_0x002dabb0();
  if ((iVar2 == 1) &&
     (uVar4 = func_0x0027b990(lVar3,*param_2,param_2[1],param_7,param_8), (uVar4 & 1) == 0)) {
    param_10 = param_6;
    iVar2 = func_0x002dac08(lVar3,param_5,&param_10,param_3,param_4);
    if (iVar2 != 1) goto LAB_0027b6d4;
    param_4 = param_10;
    if (param_6 < param_10) {
      func_0x007a28b0(param_10,param_6,&UNK_009cdaa0);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x27b6d4);
      (*pcVar1)();
    }
  }
  else {
LAB_0027b6d4:
    param_5 = 0;
  }
  func_0x002d8d08(lVar3);
LAB_0027b6e8:
  auVar5._8_8_ = param_4;
  auVar5._0_8_ = param_5;
  return auVar5;
}

