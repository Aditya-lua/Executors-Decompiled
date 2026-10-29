/* 7ff70c927780 FUN_7ff70c927780 */

void FUN_7ff70c927780(longlong param_1,ulonglong param_2,ulonglong param_3,undefined8 param_4)

{
  ulonglong uVar1;
  ulonglong uVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  int iVar8;
  undefined4 *puVar9;
  longlong lVar10;
  ulonglong uVar11;
  longlong lVar12;
  longlong lVar13;
  longlong *plVar14;
  ulonglong uVar15;
  longlong lVar16;
  ulonglong uVar17;
  ulonglong uVar18;
  bool bVar19;
  
  uVar1 = param_3 - 1;
  uVar17 = (longlong)uVar1 >> 1;
  uVar18 = param_2;
  while (uVar15 = uVar18, (longlong)uVar15 < (longlong)uVar17) {
    lVar10 = uVar15 * 0x40;
    if (*(ulonglong *)(param_1 + 0x38 + lVar10) < 0x10) {
      lVar13 = param_1 + lVar10 + 0x20;
    }
    else {
      lVar13 = *(longlong *)(param_1 + 0x20 + lVar10);
    }
    uVar18 = uVar15 * 2 + 2;
    lVar16 = uVar18 * 0x20;
    if (*(ulonglong *)(param_1 + 0x18 + lVar16) < 0x10) {
      lVar12 = param_1 + lVar16;
      uVar11 = *(ulonglong *)(param_1 + 0x30 + lVar10);
      uVar2 = *(ulonglong *)(param_1 + 0x10 + lVar16);
      bVar19 = uVar2 == uVar11;
      if (uVar2 <= uVar11) goto LAB_7ff70c927888;
LAB_7ff70c9278a0:
      uVar18 = uVar15 * 2 | 1;
    }
    else {
      lVar12 = *(longlong *)(param_1 + lVar16);
      uVar11 = *(ulonglong *)(param_1 + 0x30 + lVar10);
      uVar2 = *(ulonglong *)(param_1 + 0x10 + lVar16);
      bVar19 = uVar2 == uVar11;
      if (uVar11 < uVar2) goto LAB_7ff70c9278a0;
LAB_7ff70c927888:
      if ((bVar19) && (iVar8 = FUN_7ff70cb12b50(lVar12,lVar13), iVar8 < 0)) goto LAB_7ff70c9278a0;
    }
    if (uVar15 != uVar18) {
      plVar14 = (longlong *)(uVar15 * 0x20 + param_1);
      uVar15 = plVar14[3];
      if (0xf < uVar15) {
        lVar10 = *plVar14;
        uVar11 = uVar15 + 1;
        lVar13 = lVar10;
        if (0xfff < uVar11) {
          lVar13 = *(longlong *)(lVar10 + -8);
          if (0x1f < (ulonglong)((lVar10 + -8) - lVar13)) goto LAB_7ff70c9279c7;
          uVar11 = uVar15 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar13,uVar11);
      }
      puVar9 = (undefined4 *)(uVar18 * 0x20 + param_1);
      plVar14[2] = 0;
      plVar14[3] = 0xf;
      *(undefined1 *)plVar14 = 0;
      uVar4 = *puVar9;
      uVar5 = puVar9[1];
      uVar6 = puVar9[2];
      uVar7 = puVar9[3];
      lVar10 = *(longlong *)(puVar9 + 6);
      plVar14[2] = *(longlong *)(puVar9 + 4);
      plVar14[3] = lVar10;
      *(undefined4 *)plVar14 = uVar4;
      *(undefined4 *)((longlong)plVar14 + 4) = uVar5;
      *(undefined4 *)(plVar14 + 1) = uVar6;
      *(undefined4 *)((longlong)plVar14 + 0xc) = uVar7;
      *(undefined8 *)(puVar9 + 4) = 0;
      *(undefined8 *)(puVar9 + 6) = 0xf;
      *(undefined1 *)puVar9 = 0;
    }
  }
  if ((((param_3 & 1) == 0) && (uVar15 == uVar17)) && (uVar15 = uVar1, uVar17 != uVar1)) {
    plVar14 = (longlong *)(uVar17 * 0x20 + param_1);
    uVar18 = plVar14[3];
    if (0xf < uVar18) {
      lVar10 = *plVar14;
      uVar17 = uVar18 + 1;
      lVar13 = lVar10;
      if (0xfff < uVar17) {
        lVar13 = *(longlong *)(lVar10 + -8);
        if (0x1f < (ulonglong)((lVar10 + -8) - lVar13)) {
LAB_7ff70c9279c7:
                    /* WARNING: Does not return */
          pcVar3 = (code *)invalidInstructionException();
          (*pcVar3)();
        }
        uVar17 = uVar18 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar13,uVar17);
    }
    puVar9 = (undefined4 *)(uVar1 * 0x20 + param_1);
    plVar14[2] = 0;
    plVar14[3] = 0xf;
    *(undefined1 *)plVar14 = 0;
    uVar4 = *puVar9;
    uVar5 = puVar9[1];
    uVar6 = puVar9[2];
    uVar7 = puVar9[3];
    lVar10 = *(longlong *)(puVar9 + 6);
    plVar14[2] = *(longlong *)(puVar9 + 4);
    plVar14[3] = lVar10;
    *(undefined4 *)plVar14 = uVar4;
    *(undefined4 *)((longlong)plVar14 + 4) = uVar5;
    *(undefined4 *)(plVar14 + 1) = uVar6;
    *(undefined4 *)((longlong)plVar14 + 0xc) = uVar7;
    *(undefined8 *)(puVar9 + 4) = 0;
    *(undefined8 *)(puVar9 + 6) = 0xf;
    *(undefined1 *)puVar9 = 0;
  }
  FUN_7ff70c9279d0(param_1,uVar15,param_2,param_4);
  return;
}


