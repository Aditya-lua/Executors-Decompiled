/* 7ff70c9279d0 FUN_7ff70c9279d0 */

void FUN_7ff70c9279d0(longlong param_1,longlong param_2,longlong param_3,longlong *param_4)

{
  undefined4 *puVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  longlong lVar9;
  int iVar10;
  longlong lVar11;
  ulonglong uVar12;
  undefined4 *puVar13;
  longlong *plVar14;
  
  while (lVar3 = param_2, param_3 < lVar3) {
    plVar14 = param_4;
    if (0xf < (ulonglong)param_4[3]) {
      plVar14 = (longlong *)*param_4;
    }
    param_2 = lVar3 + -1 >> 1;
    lVar11 = param_2 * 0x20;
    puVar1 = (undefined4 *)(param_1 + lVar11);
    puVar13 = puVar1;
    if (0xf < *(ulonglong *)(param_1 + 0x18 + lVar11)) {
      puVar13 = *(undefined4 **)(param_1 + lVar11);
    }
    uVar2 = *(ulonglong *)(param_1 + 0x10 + lVar11);
    if ((uVar2 <= (ulonglong)param_4[2]) &&
       ((uVar2 != param_4[2] || (iVar10 = FUN_7ff70cb12b50(puVar13,plVar14), -1 < iVar10)))) break;
    if (lVar3 != param_2) {
      plVar14 = (longlong *)(lVar3 * 0x20 + param_1);
      uVar2 = plVar14[3];
      if (0xf < uVar2) {
        lVar3 = *plVar14;
        uVar12 = uVar2 + 1;
        lVar11 = lVar3;
        if (0xfff < uVar12) {
          lVar11 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar11)) goto LAB_7ff70c927b71;
          uVar12 = uVar2 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar11,uVar12);
      }
      plVar14[2] = 0;
      plVar14[3] = 0xf;
      *(undefined1 *)plVar14 = 0;
      uVar5 = *puVar1;
      uVar6 = puVar1[1];
      uVar7 = puVar1[2];
      uVar8 = puVar1[3];
      lVar3 = *(longlong *)(puVar1 + 6);
      plVar14[2] = *(longlong *)(puVar1 + 4);
      plVar14[3] = lVar3;
      *(undefined4 *)plVar14 = uVar5;
      *(undefined4 *)((longlong)plVar14 + 4) = uVar6;
      *(undefined4 *)(plVar14 + 1) = uVar7;
      *(undefined4 *)((longlong)plVar14 + 0xc) = uVar8;
      *(undefined8 *)(puVar1 + 4) = 0;
      *(undefined8 *)(puVar1 + 6) = 0xf;
      *(undefined1 *)puVar1 = 0;
    }
  }
  plVar14 = (longlong *)(param_1 + lVar3 * 0x20);
  if (plVar14 != param_4) {
    uVar2 = plVar14[3];
    if (0xf < uVar2) {
      lVar3 = *plVar14;
      uVar12 = uVar2 + 1;
      lVar11 = lVar3;
      if (0xfff < uVar12) {
        lVar11 = *(longlong *)(lVar3 + -8);
        if (0x1f < (ulonglong)((lVar3 + -8) - lVar11)) {
LAB_7ff70c927b71:
                    /* WARNING: Does not return */
          pcVar4 = (code *)invalidInstructionException();
          (*pcVar4)();
        }
        uVar12 = uVar2 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar11,uVar12);
    }
    plVar14[2] = 0;
    plVar14[3] = 0xf;
    *(undefined1 *)plVar14 = 0;
    lVar3 = *param_4;
    lVar11 = param_4[1];
    lVar9 = param_4[3];
    plVar14[2] = param_4[2];
    plVar14[3] = lVar9;
    *plVar14 = lVar3;
    plVar14[1] = lVar11;
    param_4[2] = 0;
    param_4[3] = 0xf;
    *(undefined1 *)param_4 = 0;
  }
  return;
}


