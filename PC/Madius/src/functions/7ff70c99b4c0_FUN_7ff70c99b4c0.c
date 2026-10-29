/* 7ff70c99b4c0 FUN_7ff70c99b4c0 */

undefined8 * FUN_7ff70c99b4c0(undefined8 *param_1,longlong *param_2)

{
  longlong lVar1;
  ulonglong uVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  longlong lVar8;
  ulonglong uVar9;
  longlong lVar10;
  longlong *plVar11;
  longlong *plVar12;
  longlong *plVar13;
  
  param_1[1] = 0;
  param_1[2] = 0;
  *param_1 = &UNK_7ff70cb6d898;
  lVar1 = param_2[2];
  plVar12 = param_2;
  if ((ulonglong)(param_2[3] - lVar1) < 0x19) {
    param_2 = (longlong *)
              FUN_7ff70ca6f040(param_2,0x19,lVar1,0,&UNK_7ff70cb90ae8,0x19,param_1 + 1,param_1,
                               param_2,0xfffffffffffffffe);
  }
  else {
    param_2[2] = lVar1 + 0x19;
    plVar11 = (longlong *)*param_2;
    if ((ulonglong)param_2[3] < 0x10) {
      plVar11 = param_2;
    }
    plVar13 = (longlong *)0x19;
    if ((&UNK_7ff70cb90ae7 < (undefined1 *)((longlong)plVar11 + lVar1) &&
         plVar11 < &UNK_7ff70cb90b01) &&
       (plVar13 = plVar11 + -0xffee197215d,
       plVar11 < &UNK_7ff70cb90ae8 || plVar13 == (longlong *)0x0)) {
      plVar13 = (longlong *)0x0;
    }
    FUN_7ff70cb12b70((undefined1 *)((longlong)plVar11 + 0x19),plVar11,lVar1 + 1);
    FUN_7ff70cb12b60(plVar11,&UNK_7ff70cb90ae8,plVar13);
    FUN_7ff70cb12b60((undefined1 *)((longlong)plVar11 + (longlong)plVar13),
                     (undefined1 *)((longlong)plVar13 + 0x7ff70cb90b01),0x19 - (longlong)plVar13);
  }
  lVar1 = *param_2;
  uVar4 = *(undefined4 *)((longlong)param_2 + 4);
  lVar10 = param_2[1];
  uVar5 = *(undefined4 *)((longlong)param_2 + 0xc);
  uVar6 = *(undefined4 *)((longlong)param_2 + 0x14);
  lVar8 = param_2[3];
  uVar7 = *(undefined4 *)((longlong)param_2 + 0x1c);
  *(int *)(param_1 + 5) = (int)param_2[2];
  *(undefined4 *)((longlong)param_1 + 0x2c) = uVar6;
  *(int *)(param_1 + 6) = (int)lVar8;
  *(undefined4 *)((longlong)param_1 + 0x34) = uVar7;
  *(int *)(param_1 + 3) = (int)lVar1;
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar4;
  *(int *)(param_1 + 4) = (int)lVar10;
  *(undefined4 *)((longlong)param_1 + 0x24) = uVar5;
  param_2[2] = 0;
  param_2[3] = 0xf;
  *(undefined1 *)param_2 = 0;
  uVar2 = plVar12[3];
  if (0xf < uVar2) {
    lVar1 = *plVar12;
    uVar9 = uVar2 + 1;
    lVar10 = lVar1;
    if (0xfff < uVar9) {
      lVar10 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar10)) {
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar9 = uVar2 + 0x28;
    }
    thunk_FUN_7ff70ca90250(lVar10,uVar9);
  }
  return param_1;
}


