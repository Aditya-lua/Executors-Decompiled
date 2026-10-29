/* 7ff70c99dca0 FUN_7ff70c99dca0 */

/* WARNING: Removing unreachable block (ram,0x7ff70c99df92) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99df9c) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99dfad) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99dfbe) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99dfc8) */
/* WARNING: Removing unreachable block (ram,0x7ff70c99dfcd) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c99dca0(float *param_1,longlong *param_2,undefined8 *param_3,byte *param_4)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong lVar10;
  undefined8 *puVar11;
  ulonglong uVar12;
  longlong lVar13;
  undefined8 *puVar14;
  undefined1 auVar15 [16];
  float fVar16;
  float fVar17;
  float *pfVar18;
  undefined8 uVar19;
  
  uVar19 = 0xfffffffffffffffe;
  puVar14 = *(undefined8 **)(param_1 + 2);
  if ((puVar14 != param_3) && (param_3[2] == *(longlong *)param_4)) {
    *param_2 = (longlong)param_3;
    return param_2;
  }
  uVar12 = ((ulonglong)param_4[7] ^
           ((ulonglong)param_4[6] ^
           ((ulonglong)param_4[5] ^
           ((ulonglong)param_4[4] ^
           ((ulonglong)param_4[3] ^
           ((ulonglong)param_4[2] ^
           ((ulonglong)param_4[1] ^ ((ulonglong)*param_4 ^ 0xcbf29ce484222325) * 0x100000001b3) *
           0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) *
           0x100000001b3) * 0x100000001b3;
  lVar10 = *(longlong *)(param_1 + 6);
  puVar11 = (undefined8 *)((*(ulonglong *)(param_1 + 0xc) & uVar12) * 0x10);
  puVar5 = *(undefined8 **)(lVar10 + 8 + (longlong)puVar11);
  if (puVar5 != puVar14) {
    if (*(longlong *)param_4 != puVar5[2]) {
      puVar11 = *(undefined8 **)(lVar10 + (longlong)puVar11);
      do {
        puVar14 = puVar5;
        if (puVar5 == puVar11) goto LAB_7ff70c99dda2;
        puVar5 = (undefined8 *)puVar5[1];
      } while (*(longlong *)param_4 != puVar5[2]);
    }
    *param_2 = (longlong)puVar5;
    return param_2;
  }
LAB_7ff70c99dda2:
  if (*(longlong *)(param_1 + 4) == 0x492492492492492) {
    FUN_7ff70cb12520(&UNK_7ff70cb8573f);
                    /* WARNING: Does not return */
    pcVar1 = (code *)invalidInstructionException();
    (*pcVar1)();
  }
  pfVar18 = param_1 + 2;
  puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x38,puVar11,lVar10,0x100000001b3,pfVar18);
  puVar5[2] = *(undefined8 *)param_4;
  uVar2 = *(undefined8 *)(param_4 + 0x10);
  uVar3 = *(undefined8 *)(param_4 + 0x18);
  uVar4 = *(undefined8 *)(param_4 + 0x20);
  puVar5[3] = *(undefined8 *)(param_4 + 8);
  puVar5[4] = uVar2;
  puVar5[5] = uVar3;
  puVar5[6] = uVar4;
  param_4[0x18] = 0;
  param_4[0x19] = 0;
  param_4[0x1a] = 0;
  param_4[0x1b] = 0;
  param_4[0x1c] = 0;
  param_4[0x1d] = 0;
  param_4[0x1e] = 0;
  param_4[0x1f] = 0;
  param_4[0x20] = 0xf;
  param_4[0x21] = 0;
  param_4[0x22] = 0;
  param_4[0x23] = 0;
  param_4[0x24] = 0;
  param_4[0x25] = 0;
  param_4[0x26] = 0;
  param_4[0x27] = 0;
  param_4[8] = 0;
  uVar6 = *(longlong *)(param_1 + 4) + 1;
  if ((longlong)uVar6 < 0) {
    auVar15 = ZEXT416((uint)(float)uVar6);
    fVar16 = *param_1;
    uVar6 = *(ulonglong *)(param_1 + 0xe);
    if ((longlong)uVar6 < 0) goto LAB_7ff70c99de1d;
LAB_7ff70c99de6a:
    fVar17 = auVar15._0_4_ / (float)(longlong)uVar6;
    if (fVar16 < fVar17) {
LAB_7ff70c99de7f:
      auVar15._0_4_ = auVar15._0_4_ / fVar16;
      auVar15 = roundss(auVar15,auVar15,10);
      uVar7 = (ulonglong)auVar15._0_4_;
      uVar7 = (longlong)(auVar15._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar7 >> 0x3f | uVar7;
      uVar8 = 8;
      if (8 < uVar7) {
        uVar8 = uVar7;
      }
      uVar9 = uVar6;
      if (uVar6 < uVar8) {
        uVar9 = uVar6 * 8;
        if (uVar9 < uVar8 || uVar9 - uVar8 == 0) {
          uVar9 = uVar8;
        }
        if (0x1ff < uVar6) {
          uVar9 = uVar8;
        }
      }
      FUN_7ff70c99e100(param_1,uVar9,uVar7,fVar17,pfVar18,puVar5,uVar19);
      puVar14 = *(undefined8 **)(param_1 + 2);
      if ((puVar14 == param_3) || (param_3[2] != puVar5[2])) {
        lVar10 = (*(ulonglong *)(param_1 + 0xc) & uVar12) * 0x10;
        param_3 = *(undefined8 **)(*(longlong *)(param_1 + 6) + 8 + lVar10);
        if (param_3 == puVar14) goto LAB_7ff70c99df37;
        if (puVar5[2] != param_3[2]) {
          do {
            puVar14 = param_3;
            if (param_3 == *(undefined8 **)(*(longlong *)(param_1 + 6) + lVar10))
            goto LAB_7ff70c99df37;
            param_3 = (undefined8 *)param_3[1];
          } while (puVar5[2] != param_3[2]);
        }
      }
      puVar14 = (undefined8 *)*param_3;
    }
  }
  else {
    auVar15 = ZEXT416((uint)(float)(longlong)uVar6);
    fVar16 = *param_1;
    uVar6 = *(ulonglong *)(param_1 + 0xe);
    if (-1 < (longlong)uVar6) goto LAB_7ff70c99de6a;
LAB_7ff70c99de1d:
    fVar17 = auVar15._0_4_ / (float)uVar6;
    if (fVar16 < fVar17) goto LAB_7ff70c99de7f;
  }
LAB_7ff70c99df37:
  puVar11 = (undefined8 *)puVar14[1];
  *(longlong *)(param_1 + 4) = *(longlong *)(param_1 + 4) + 1;
  *puVar5 = puVar14;
  puVar5[1] = puVar11;
  *puVar11 = puVar5;
  puVar14[1] = puVar5;
  lVar10 = *(longlong *)(param_1 + 6);
  lVar13 = (uVar12 & *(ulonglong *)(param_1 + 0xc)) * 0x10;
  if (*(undefined8 **)(lVar10 + lVar13) == *(undefined8 **)(param_1 + 2)) {
    *(undefined8 **)(lVar10 + lVar13) = puVar5;
  }
  else {
    if (*(undefined8 **)(lVar10 + lVar13) == puVar14) {
      *(undefined8 **)(lVar10 + lVar13) = puVar5;
      *param_2 = (longlong)puVar5;
      return param_2;
    }
    if (*(undefined8 **)(lVar10 + 8 + lVar13) != puVar11) goto LAB_7ff70c99df86;
  }
  *(undefined8 **)(lVar10 + 8 + lVar13) = puVar5;
LAB_7ff70c99df86:
  *param_2 = (longlong)puVar5;
  return param_2;
}


