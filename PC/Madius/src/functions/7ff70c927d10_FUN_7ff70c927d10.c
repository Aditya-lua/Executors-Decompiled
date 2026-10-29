/* 7ff70c927d10 FUN_7ff70c927d10 */

void FUN_7ff70c927d10(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,
                     undefined8 *param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  int iVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulonglong uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  ulonglong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  bool bVar19;
  undefined8 *puStack_90;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  
  puStack_90 = param_3;
  if (param_2 < param_3) {
    puVar15 = (undefined8 *)*param_3;
    puVar11 = param_3;
    puVar8 = param_3;
    while( true ) {
      puVar10 = puVar8 + -4;
      puVar18 = puVar15;
      if ((ulonglong)puVar8[3] < 0x10) {
        puVar18 = puVar8;
      }
      uVar16 = puVar8[2];
      puVar15 = (undefined8 *)*puVar10;
      uVar13 = puVar8[-2];
      puVar17 = puVar10;
      if (0xf < (ulonglong)puVar8[-1]) {
        puVar17 = puVar15;
      }
      puStack_90 = puVar11;
      if (uVar13 >= uVar16 && uVar13 != uVar16) break;
      if (uVar13 != uVar16) {
        if (uVar13 < uVar16) break;
      }
      else {
        iVar9 = FUN_7ff70cb12b50(puVar17,puVar18,uVar16);
        if ((iVar9 < 0) ||
           (iVar9 = FUN_7ff70cb12b50(puVar18,puVar17,uVar16), puStack_90 = puVar8, iVar9 < 0))
        break;
      }
      puStack_90 = puVar10;
      puVar11 = puVar11 + -4;
      puVar8 = puVar10;
      if (puVar10 <= param_2) break;
    }
  }
  param_3 = param_3 + 4;
  puVar8 = param_3;
  puVar15 = puStack_90;
  if (param_3 < param_4) {
    puVar11 = puStack_90;
    if (0xf < (ulonglong)puStack_90[3]) {
      puVar11 = (undefined8 *)*puStack_90;
    }
    uVar16 = puStack_90[2];
    while( true ) {
      puVar18 = param_3;
      if (0xf < (ulonglong)param_3[3]) {
        puVar18 = (undefined8 *)*param_3;
      }
      uVar13 = param_3[2];
      puVar8 = param_3;
      if (uVar13 >= uVar16 && uVar13 != uVar16) break;
      if (uVar13 != uVar16) {
        if (uVar13 < uVar16) break;
      }
      else {
        iVar9 = FUN_7ff70cb12b50(puVar18,puVar11,uVar16);
        if ((iVar9 < 0) || (iVar9 = FUN_7ff70cb12b50(puVar11,puVar18,uVar16), iVar9 < 0)) break;
      }
      param_3 = param_3 + 4;
      puVar8 = param_3;
      if (param_4 <= param_3) break;
    }
  }
LAB_7ff70c927e78:
  do {
    puVar10 = puVar8;
    puVar8 = puStack_90;
    puVar11 = puStack_90;
    puVar18 = puVar15;
    if (param_3 < param_4) {
      if ((ulonglong)param_3[3] < 0x10) {
        puVar17 = param_3;
        if ((ulonglong)puVar15[3] < 0x10) goto LAB_7ff70c927e95;
LAB_7ff70c927ebe:
        uVar16 = param_3[2];
        uVar13 = puVar15[2];
        bVar19 = uVar13 == uVar16;
        puVar14 = (undefined8 *)*puVar15;
        if (uVar13 <= uVar16) goto LAB_7ff70c927ecf;
      }
      else {
        puVar17 = (undefined8 *)*param_3;
        if (0xf < (ulonglong)puVar15[3]) goto LAB_7ff70c927ebe;
LAB_7ff70c927e95:
        uVar16 = param_3[2];
        uVar13 = puVar15[2];
        bVar19 = uVar13 == uVar16;
        puVar14 = puVar15;
        if (uVar13 <= uVar16) {
LAB_7ff70c927ecf:
          if ((!bVar19) || (iVar9 = FUN_7ff70cb12b50(puVar14,puVar17,uVar16), -1 < iVar9)) {
            if ((uVar13 < uVar16) || (iVar9 = FUN_7ff70cb12b50(puVar17,puVar14,uVar16), iVar9 < 0))
            goto joined_r0x7ff70c927f4f;
            if (param_3 != puVar10) {
              uVar1 = *puVar10;
              uVar2 = puVar10[1];
              uVar3 = puVar10[2];
              uVar4 = puVar10[3];
              uVar5 = *param_3;
              uVar6 = param_3[1];
              uVar7 = param_3[3];
              puVar10[2] = param_3[2];
              puVar10[3] = uVar7;
              *puVar10 = uVar5;
              puVar10[1] = uVar6;
              uStack_88 = (undefined4)uVar1;
              uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
              uStack_80 = (undefined4)uVar2;
              uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
              param_3[2] = uVar3;
              param_3[3] = uVar4;
              *(undefined4 *)param_3 = uStack_88;
              *(undefined4 *)((longlong)param_3 + 4) = uStack_84;
              *(undefined4 *)(param_3 + 1) = uStack_80;
              *(undefined4 *)((longlong)param_3 + 0xc) = uStack_7c;
            }
            puVar10 = puVar10 + 4;
          }
        }
      }
      param_3 = param_3 + 4;
      puVar8 = puVar10;
      goto LAB_7ff70c927e78;
    }
joined_r0x7ff70c927f4f:
    while (puStack_90 = puVar11, param_2 < puVar11) {
      puVar17 = puVar11 + -4;
      puVar15 = puVar18;
      if (0xf < (ulonglong)puVar18[3]) {
        puVar15 = (undefined8 *)*puVar18;
      }
      puVar14 = puVar17;
      if (0xf < (ulonglong)puVar11[-1]) {
        puVar14 = (undefined8 *)*puVar17;
      }
      uVar16 = puVar18[2];
      uVar13 = puVar11[-2];
      puVar12 = puVar18;
      if ((uVar13 <= uVar16) &&
         ((uVar13 != uVar16 || (iVar9 = FUN_7ff70cb12b50(puVar14,puVar15,uVar16), -1 < iVar9)))) {
        puStack_90 = puVar8;
        if ((uVar13 < uVar16) ||
           (iVar9 = FUN_7ff70cb12b50(puVar15,puVar14,uVar16), puStack_90 = puVar11, iVar9 < 0))
        break;
        puVar12 = puVar18 + -4;
        if (puVar11 != puVar18) {
          uVar1 = *puVar12;
          uVar2 = puVar18[-3];
          uVar3 = puVar18[-2];
          uVar4 = puVar18[-1];
          uVar5 = *puVar17;
          uVar6 = puVar11[-3];
          uVar7 = puVar11[-1];
          puVar18[-2] = puVar11[-2];
          puVar18[-1] = uVar7;
          *puVar12 = uVar5;
          puVar18[-3] = uVar6;
          uStack_88 = (undefined4)uVar1;
          uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
          uStack_80 = (undefined4)uVar2;
          uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
          puVar11[-2] = uVar3;
          puVar11[-1] = uVar4;
          *(undefined4 *)puVar17 = uStack_88;
          *(undefined4 *)((longlong)puVar11 + -0x1c) = uStack_84;
          *(undefined4 *)(puVar11 + -3) = uStack_80;
          *(undefined4 *)((longlong)puVar11 + -0x14) = uStack_7c;
        }
      }
      puVar8 = puVar8 + -4;
      puVar11 = puVar17;
      puVar18 = puVar12;
    }
    if ((param_3 == param_4) && (puStack_90 == param_2)) {
      *param_1 = puVar18;
      param_1[1] = puVar10;
      return;
    }
    if (puStack_90 == param_2) {
      if ((puVar10 != param_3) && (puVar18 != puVar10)) {
        uVar1 = *puVar18;
        uVar2 = puVar18[1];
        uVar3 = puVar18[2];
        uVar4 = puVar18[3];
        uVar5 = *puVar10;
        uVar6 = puVar10[1];
        uVar7 = puVar10[3];
        puVar18[2] = puVar10[2];
        puVar18[3] = uVar7;
        *puVar18 = uVar5;
        puVar18[1] = uVar6;
        uStack_88 = (undefined4)uVar1;
        uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
        uStack_80 = (undefined4)uVar2;
        uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
        puVar10[2] = uVar3;
        puVar10[3] = uVar4;
        *(undefined4 *)puVar10 = uStack_88;
        *(undefined4 *)((longlong)puVar10 + 4) = uStack_84;
        *(undefined4 *)(puVar10 + 1) = uStack_80;
        *(undefined4 *)((longlong)puVar10 + 0xc) = uStack_7c;
      }
      if (puVar18 != param_3) {
        uVar1 = *puVar18;
        uVar2 = puVar18[1];
        uVar3 = puVar18[2];
        uVar4 = puVar18[3];
        uVar5 = *param_3;
        uVar6 = param_3[1];
        uVar7 = param_3[3];
        puVar18[2] = param_3[2];
        puVar18[3] = uVar7;
        *puVar18 = uVar5;
        puVar18[1] = uVar6;
        uStack_88 = (undefined4)uVar1;
        uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
        uStack_80 = (undefined4)uVar2;
        uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
        param_3[2] = uVar3;
        param_3[3] = uVar4;
        *(undefined4 *)param_3 = uStack_88;
        *(undefined4 *)((longlong)param_3 + 4) = uStack_84;
        *(undefined4 *)(param_3 + 1) = uStack_80;
        *(undefined4 *)((longlong)param_3 + 0xc) = uStack_7c;
      }
      param_3 = param_3 + 4;
      puVar8 = puVar10 + 4;
      puVar15 = puVar18 + 4;
    }
    else {
      puVar11 = puStack_90 + -4;
      if (param_3 == param_4) {
        puVar15 = puVar18 + -4;
        if (puStack_90 != puVar18) {
          uVar1 = *puVar11;
          uVar2 = puStack_90[-3];
          uVar3 = puStack_90[-2];
          uVar4 = puStack_90[-1];
          uVar5 = *puVar15;
          uVar6 = puVar18[-3];
          uVar7 = puVar18[-1];
          puStack_90[-2] = puVar18[-2];
          puStack_90[-1] = uVar7;
          *puVar11 = uVar5;
          puStack_90[-3] = uVar6;
          uStack_88 = (undefined4)uVar1;
          uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
          uStack_80 = (undefined4)uVar2;
          uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
          puVar18[-2] = uVar3;
          puVar18[-1] = uVar4;
          *(undefined4 *)puVar15 = uStack_88;
          *(undefined4 *)((longlong)puVar18 + -0x1c) = uStack_84;
          *(undefined4 *)(puVar18 + -3) = uStack_80;
          *(undefined4 *)((longlong)puVar18 + -0x14) = uStack_7c;
        }
        puVar8 = puVar10 + -4;
        puStack_90 = puVar11;
        if (puVar18 != puVar10) {
          uVar1 = *puVar15;
          uVar2 = puVar18[-3];
          uVar3 = puVar18[-2];
          uVar4 = puVar18[-1];
          uVar5 = *puVar8;
          uVar6 = puVar10[-3];
          uVar7 = puVar10[-1];
          puVar18[-2] = puVar10[-2];
          puVar18[-1] = uVar7;
          *puVar15 = uVar5;
          puVar18[-3] = uVar6;
          uStack_88 = (undefined4)uVar1;
          uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
          uStack_80 = (undefined4)uVar2;
          uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
          puVar10[-2] = uVar3;
          puVar10[-1] = uVar4;
          *(undefined4 *)puVar8 = uStack_88;
          *(undefined4 *)((longlong)puVar10 + -0x1c) = uStack_84;
          *(undefined4 *)(puVar10 + -3) = uStack_80;
          *(undefined4 *)((longlong)puVar10 + -0x14) = uStack_7c;
        }
      }
      else {
        if (param_3 != puVar11) {
          uVar1 = *param_3;
          uVar2 = param_3[1];
          uVar3 = param_3[2];
          uVar4 = param_3[3];
          uVar5 = *puVar11;
          uVar6 = puStack_90[-3];
          uVar7 = puStack_90[-1];
          param_3[2] = puStack_90[-2];
          param_3[3] = uVar7;
          *param_3 = uVar5;
          param_3[1] = uVar6;
          uStack_88 = (undefined4)uVar1;
          uStack_84 = (undefined4)((ulonglong)uVar1 >> 0x20);
          uStack_80 = (undefined4)uVar2;
          uStack_7c = (undefined4)((ulonglong)uVar2 >> 0x20);
          puStack_90[-2] = uVar3;
          puStack_90[-1] = uVar4;
          *(undefined4 *)puVar11 = uStack_88;
          *(undefined4 *)((longlong)puStack_90 + -0x1c) = uStack_84;
          *(undefined4 *)(puStack_90 + -3) = uStack_80;
          *(undefined4 *)((longlong)puStack_90 + -0x14) = uStack_7c;
        }
        param_3 = param_3 + 4;
        puVar8 = puVar10;
        puStack_90 = puVar11;
        puVar15 = puVar18;
      }
    }
  } while( true );
}


