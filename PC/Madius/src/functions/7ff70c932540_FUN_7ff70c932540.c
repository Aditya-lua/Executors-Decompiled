/* 7ff70c932540 FUN_7ff70c932540 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c932540(float *param_1,undefined8 *param_2,longlong *param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  code *pcVar4;
  int iVar5;
  ulonglong uVar6;
  longlong lVar7;
  undefined8 *puVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  longlong lVar11;
  ulonglong uVar12;
  undefined1 uVar13;
  ulonglong uVar14;
  undefined8 *puVar15;
  undefined1 auVar16 [16];
  float fVar17;
  
  lVar11 = *param_3;
  uVar9 = param_3[1];
  if (uVar9 == 0) {
    uVar14 = 0xcbf29ce484222325;
  }
  else {
    uVar6 = (ulonglong)((uint)uVar9 & 3);
    if (uVar9 < 4) {
      uVar14 = 0xcbf29ce484222325;
      uVar10 = 0;
    }
    else {
      uVar14 = 0xcbf29ce484222325;
      uVar10 = 0;
      do {
        uVar14 = ((ulonglong)*(byte *)(lVar11 + 3 + uVar10) ^
                 ((ulonglong)*(byte *)(lVar11 + 2 + uVar10) ^
                 ((ulonglong)*(byte *)(lVar11 + 1 + uVar10) ^
                 (*(byte *)(lVar11 + uVar10) ^ uVar14) * 0x100000001b3) * 0x100000001b3) *
                 0x100000001b3) * 0x100000001b3;
        uVar10 = uVar10 + 4;
      } while ((uVar9 & 0xfffffffffffffffc) != uVar10);
      if (uVar6 == 0) goto LAB_7ff70c932627;
    }
    uVar12 = 0;
    do {
      uVar14 = (*(byte *)(uVar10 + lVar11 + uVar12) ^ uVar14) * 0x100000001b3;
      uVar12 = uVar12 + 1;
    } while (uVar6 != uVar12);
  }
LAB_7ff70c932627:
  lVar7 = (*(ulonglong *)(param_1 + 0xc) & uVar14) * 0x10;
  puVar8 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar7);
  puVar15 = *(undefined8 **)(param_1 + 2);
  if (puVar8 != *(undefined8 **)(param_1 + 2)) {
    puVar1 = *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar7);
    if (uVar9 == 0) {
      for (; puVar8[3] != 0; puVar8 = (undefined8 *)puVar8[1]) {
        puVar15 = puVar8;
        if (puVar8 == puVar1) goto LAB_7ff70c93269f;
      }
LAB_7ff70c932690:
      uVar13 = 0;
      goto LAB_7ff70c932897;
    }
    uVar6 = puVar8[3];
    while( true ) {
      if ((uVar9 == uVar6) && (iVar5 = FUN_7ff70cb12b50(lVar11,puVar8[2],uVar9), iVar5 == 0))
      goto LAB_7ff70c932690;
      puVar15 = puVar8;
      if (puVar8 == puVar1) break;
      puVar8 = (undefined8 *)puVar8[1];
      uVar6 = puVar8[3];
    }
  }
LAB_7ff70c93269f:
  if (*(longlong *)(param_1 + 4) == 0x666666666666666) {
    FUN_7ff70cb12520(&UNK_7ff70cb8573f);
    pcVar4 = (code *)swi(3);
    (*pcVar4)();
    return;
  }
  puVar8 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
  puVar8[4] = param_3[2];
  lVar11 = param_3[1];
  puVar8[2] = *param_3;
  puVar8[3] = lVar11;
  uVar9 = *(longlong *)(param_1 + 4) + 1;
  if ((longlong)uVar9 < 0) {
    auVar16 = ZEXT416((uint)(float)uVar9);
    fVar17 = *param_1;
    uVar9 = *(ulonglong *)(param_1 + 0xe);
    if ((longlong)uVar9 < 0) goto LAB_7ff70c9326ed;
LAB_7ff70c93273a:
    if (fVar17 < auVar16._0_4_ / (float)(longlong)uVar9) {
LAB_7ff70c93274f:
      auVar16._0_4_ = auVar16._0_4_ / fVar17;
      auVar16 = roundss(auVar16,auVar16,10);
      uVar10 = (ulonglong)auVar16._0_4_;
      uVar10 = (longlong)(auVar16._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar10 >> 0x3f | uVar10;
      uVar6 = 8;
      if (8 < uVar10) {
        uVar6 = uVar10;
      }
      uVar10 = uVar9;
      if (uVar9 < uVar6) {
        uVar10 = uVar9 * 8;
        if (uVar10 < uVar6 || uVar10 - uVar6 == 0) {
          uVar10 = uVar6;
        }
        if (0x1ff < uVar9) {
          uVar10 = uVar6;
        }
      }
      FUN_7ff70c926ac0(param_1,uVar10);
      puVar15 = *(undefined8 **)(param_1 + 2);
      lVar11 = (*(ulonglong *)(param_1 + 0xc) & uVar14) * 0x10;
      puVar1 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar11);
      if (puVar1 != puVar15) {
        puVar2 = *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar11);
        lVar11 = puVar8[3];
        puVar15 = puVar1;
        if (lVar11 == 0) {
          for (; puVar15[3] != 0; puVar15 = (undefined8 *)puVar15[1]) {
            if (puVar15 == puVar2) goto LAB_7ff70c932838;
          }
LAB_7ff70c932835:
          puVar15 = (undefined8 *)*puVar15;
        }
        else {
          uVar3 = puVar8[2];
          lVar7 = puVar1[3];
          while( true ) {
            if ((lVar11 == lVar7) && (iVar5 = FUN_7ff70cb12b50(uVar3,puVar15[2],lVar11), iVar5 == 0)
               ) goto LAB_7ff70c932835;
            if (puVar15 == puVar2) break;
            puVar15 = (undefined8 *)puVar15[1];
            lVar7 = puVar15[3];
          }
        }
      }
    }
  }
  else {
    auVar16 = ZEXT416((uint)(float)(longlong)uVar9);
    fVar17 = *param_1;
    uVar9 = *(ulonglong *)(param_1 + 0xe);
    if (-1 < (longlong)uVar9) goto LAB_7ff70c93273a;
LAB_7ff70c9326ed:
    if (fVar17 < auVar16._0_4_ / (float)uVar9) goto LAB_7ff70c93274f;
  }
LAB_7ff70c932838:
  puVar1 = (undefined8 *)puVar15[1];
  *(longlong *)(param_1 + 4) = *(longlong *)(param_1 + 4) + 1;
  *puVar8 = puVar15;
  puVar8[1] = puVar1;
  *puVar1 = puVar8;
  puVar15[1] = puVar8;
  lVar11 = *(longlong *)(param_1 + 6);
  lVar7 = (uVar14 & *(ulonglong *)(param_1 + 0xc)) * 0x10;
  if (*(undefined8 **)(lVar11 + lVar7) == *(undefined8 **)(param_1 + 2)) {
    *(undefined8 **)(lVar11 + lVar7) = puVar8;
    *(undefined8 **)(lVar11 + 8 + lVar7) = puVar8;
    uVar13 = 1;
  }
  else if (*(undefined8 **)(lVar11 + lVar7) == puVar15) {
    *(undefined8 **)(lVar11 + lVar7) = puVar8;
    uVar13 = 1;
  }
  else {
    uVar13 = 1;
    if (*(undefined8 **)(lVar11 + 8 + lVar7) == puVar1) {
      *(undefined8 **)(lVar11 + 8 + lVar7) = puVar8;
    }
  }
LAB_7ff70c932897:
  *param_2 = puVar8;
  *(undefined1 *)(param_2 + 1) = uVar13;
  return;
}


