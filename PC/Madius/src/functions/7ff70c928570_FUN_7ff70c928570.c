/* 7ff70c928570 FUN_7ff70c928570 */

undefined8 *
FUN_7ff70c928570(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                undefined4 param_5)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  undefined8 ***pppuVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  undefined8 ****ppppuVar7;
  undefined1 auStack_80 [8];
  undefined8 ***pppuStack_78;
  undefined8 uStack_70;
  ulonglong uStack_68;
  ulonglong uStack_60;
  undefined8 *puStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  pppuStack_78 = (undefined8 ****)0x0;
  uStack_70 = 0;
  puStack_50 = param_1;
  uVar2 = FUN_7ff70cb12e80(param_4);
  if ((longlong)uVar2 < 0) {
    FUN_7ff70ca00780();
LAB_7ff70c9286cf:
                    /* WARNING: Does not return */
    pcVar1 = (code *)invalidInstructionException();
    (*pcVar1)();
  }
  if (uVar2 < 0x10) {
    ppppuVar7 = &pppuStack_78;
    uVar6 = 0xf;
  }
  else {
    uVar3 = uVar2 | 0xf;
    uVar6 = 0x16;
    if (0x16 < uVar3) {
      uVar6 = uVar3;
    }
    if (uVar3 < 0xfff) {
      ppppuVar7 = (undefined8 ****)FUN_7ff70ca8ff40(uVar6 + 1);
      pppuStack_78 = ppppuVar7;
    }
    else {
      pppuVar4 = (undefined8 ***)FUN_7ff70ca8ff40(uVar6 + 0x28);
      ppppuVar7 = (undefined8 ****)((longlong)pppuVar4 + 0x27U & 0xffffffffffffffe0);
      ppppuVar7[-1] = pppuVar4;
      pppuStack_78 = ppppuVar7;
    }
  }
  uStack_68 = uVar2;
  uStack_60 = uVar6;
  FUN_7ff70cb12b60(ppppuVar7,param_4,uVar2);
  *(undefined1 *)((longlong)ppppuVar7 + uVar2) = 0;
  puVar5 = param_2;
  if (0xf < (ulonglong)param_2[3]) {
    puVar5 = (undefined8 *)*param_2;
  }
  FUN_7ff70c928760(auStack_80,puStack_50,puVar5,param_2[2] + (longlong)puVar5,param_3,&pppuStack_78,
                   param_5);
  if (0xf < uStack_60) {
    uVar2 = uStack_60 + 1;
    ppppuVar7 = (undefined8 ****)pppuStack_78;
    if (0xfff < uVar2) {
      ppppuVar7 = (undefined8 ****)pppuStack_78[-1];
      if (0x1f < (ulonglong)((longlong)pppuStack_78 + (-8 - (longlong)ppppuVar7)))
      goto LAB_7ff70c9286cf;
      uVar2 = uStack_60 + 0x28;
    }
    thunk_FUN_7ff70ca90250(ppppuVar7,uVar2);
  }
  return puStack_50;
}


