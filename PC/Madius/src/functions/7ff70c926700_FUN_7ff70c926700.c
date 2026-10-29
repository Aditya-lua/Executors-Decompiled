/* 7ff70c926700 FUN_7ff70c926700 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c926700(float *param_1,undefined8 *param_2,longlong *param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  code *pcVar4;
  longlong lVar5;
  int iVar6;
  ulonglong uVar7;
  longlong lVar8;
  undefined8 *puVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  ulonglong uVar13;
  undefined1 uVar14;
  ulonglong uVar15;
  undefined8 *puVar16;
  undefined1 auVar17 [16];
  float fVar18;
  
  lVar12 = *param_3;
  uVar10 = param_3[1];
  if (uVar10 == 0) {
    uVar15 = 0xcbf29ce484222325;
  }
  else {
    uVar7 = (ulonglong)((uint)uVar10 & 3);
    if (uVar10 < 4) {
      uVar15 = 0xcbf29ce484222325;
      uVar11 = 0;
    }
    else {
      uVar15 = 0xcbf29ce484222325;
      uVar11 = 0;
      do {
        uVar15 = ((ulonglong)*(byte *)(lVar12 + 3 + uVar11) ^
                 ((ulonglong)*(byte *)(lVar12 + 2 + uVar11) ^
                 ((ulonglong)*(byte *)(lVar12 + 1 + uVar11) ^
                 (*(byte *)(lVar12 + uVar11) ^ uVar15) * 0x100000001b3) * 0x100000001b3) *
                 0x100000001b3) * 0x100000001b3;
        uVar11 = uVar11 + 4;
      } while ((uVar10 & 0xfffffffffffffffc) != uVar11);
      if (uVar7 == 0) goto LAB_7ff70c9267e7;
    }
    uVar13 = 0;
    do {
      uVar15 = (*(byte *)(uVar11 + lVar12 + uVar13) ^ uVar15) * 0x100000001b3;
      uVar13 = uVar13 + 1;
    } while (uVar7 != uVar13);
  }
LAB_7ff70c9267e7:
  lVar8 = (*(ulonglong *)(param_1 + 0xc) & uVar15) * 0x10;
  puVar9 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar8);
  puVar16 = *(undefined8 **)(param_1 + 2);
  if (puVar9 != *(undefined8 **)(param_1 + 2)) {
    puVar1 = *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar8);
    if (uVar10 == 0) {
      for (; puVar9[3] != 0; puVar9 = (undefined8 *)puVar9[1]) {
        puVar16 = puVar9;
        if (puVar9 == puVar1) goto LAB_7ff70c92685f;
      }
LAB_7ff70c926850:
      uVar14 = 0;
      goto LAB_7ff70c926a57;
    }
    uVar7 = puVar9[3];
    while( true ) {
      if ((uVar10 == uVar7) && (iVar6 = FUN_7ff70cb12b50(lVar12,puVar9[2],uVar10), iVar6 == 0))
      goto LAB_7ff70c926850;
      puVar16 = puVar9;
      if (puVar9 == puVar1) break;
      puVar9 = (undefined8 *)puVar9[1];
      uVar7 = puVar9[3];
    }
  }
LAB_7ff70c92685f:
  if (*(longlong *)(param_1 + 4) == 0x555555555555555) {
    FUN_7ff70cb12520(&UNK_7ff70cb8573f);
    pcVar4 = (code *)swi(3);
    (*pcVar4)();
    return;
  }
  puVar9 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
  lVar12 = *param_3;
  lVar8 = param_3[1];
  lVar5 = param_3[3];
  puVar9[4] = param_3[2];
  puVar9[5] = lVar5;
  puVar9[2] = lVar12;
  puVar9[3] = lVar8;
  uVar10 = *(longlong *)(param_1 + 4) + 1;
  if ((longlong)uVar10 < 0) {
    auVar17 = ZEXT416((uint)(float)uVar10);
    fVar18 = *param_1;
    uVar10 = *(ulonglong *)(param_1 + 0xe);
    if ((longlong)uVar10 < 0) goto LAB_7ff70c9268ad;
LAB_7ff70c9268fa:
    if (fVar18 < auVar17._0_4_ / (float)(longlong)uVar10) {
LAB_7ff70c92690f:
      auVar17._0_4_ = auVar17._0_4_ / fVar18;
      auVar17 = roundss(auVar17,auVar17,10);
      uVar11 = (ulonglong)auVar17._0_4_;
      uVar11 = (longlong)(auVar17._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar11 >> 0x3f | uVar11;
      uVar7 = 8;
      if (8 < uVar11) {
        uVar7 = uVar11;
      }
      uVar11 = uVar10;
      if (uVar10 < uVar7) {
        uVar11 = uVar10 * 8;
        if (uVar11 < uVar7 || uVar11 - uVar7 == 0) {
          uVar11 = uVar7;
        }
        if (0x1ff < uVar10) {
          uVar11 = uVar7;
        }
      }
      FUN_7ff70c926ac0(param_1,uVar11);
      puVar16 = *(undefined8 **)(param_1 + 2);
      lVar12 = (*(ulonglong *)(param_1 + 0xc) & uVar15) * 0x10;
      puVar1 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar12);
      if (puVar1 != puVar16) {
        puVar2 = *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar12);
        lVar12 = puVar9[3];
        puVar16 = puVar1;
        if (lVar12 == 0) {
          for (; puVar16[3] != 0; puVar16 = (undefined8 *)puVar16[1]) {
            if (puVar16 == puVar2) goto LAB_7ff70c9269f8;
          }
LAB_7ff70c9269f5:
          puVar16 = (undefined8 *)*puVar16;
        }
        else {
          uVar3 = puVar9[2];
          lVar8 = puVar1[3];
          while( true ) {
            if ((lVar12 == lVar8) && (iVar6 = FUN_7ff70cb12b50(uVar3,puVar16[2],lVar12), iVar6 == 0)
               ) goto LAB_7ff70c9269f5;
            if (puVar16 == puVar2) break;
            puVar16 = (undefined8 *)puVar16[1];
            lVar8 = puVar16[3];
          }
        }
      }
    }
  }
  else {
    auVar17 = ZEXT416((uint)(float)(longlong)uVar10);
    fVar18 = *param_1;
    uVar10 = *(ulonglong *)(param_1 + 0xe);
    if (-1 < (longlong)uVar10) goto LAB_7ff70c9268fa;
LAB_7ff70c9268ad:
    if (fVar18 < auVar17._0_4_ / (float)uVar10) goto LAB_7ff70c92690f;
  }
LAB_7ff70c9269f8:
  puVar1 = (undefined8 *)puVar16[1];
  *(longlong *)(param_1 + 4) = *(longlong *)(param_1 + 4) + 1;
  *puVar9 = puVar16;
  puVar9[1] = puVar1;
  *puVar1 = puVar9;
  puVar16[1] = puVar9;
  lVar12 = *(longlong *)(param_1 + 6);
  lVar8 = (uVar15 & *(ulonglong *)(param_1 + 0xc)) * 0x10;
  if (*(undefined8 **)(lVar12 + lVar8) == *(undefined8 **)(param_1 + 2)) {
    *(undefined8 **)(lVar12 + lVar8) = puVar9;
    *(undefined8 **)(lVar12 + 8 + lVar8) = puVar9;
    uVar14 = 1;
  }
  else if (*(undefined8 **)(lVar12 + lVar8) == puVar16) {
    *(undefined8 **)(lVar12 + lVar8) = puVar9;
    uVar14 = 1;
  }
  else {
    uVar14 = 1;
    if (*(undefined8 **)(lVar12 + 8 + lVar8) == puVar1) {
      *(undefined8 **)(lVar12 + 8 + lVar8) = puVar9;
    }
  }
LAB_7ff70c926a57:
  *param_2 = puVar9;
  *(undefined1 *)(param_2 + 1) = uVar14;
  return;
}


