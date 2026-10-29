/* 7ff70c7c9780 FUN_7ff70c7c9780 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c9780(byte *param_1)

{
  byte bVar1;
  undefined8 uVar2;
  code *pcVar3;
  ulonglong uVar4;
  undefined *puVar5;
  uint uVar6;
  longlong lVar7;
  int iVar8;
  undefined8 **ppuVar9;
  undefined1 *puVar10;
  longlong lVar11;
  longlong lVar12;
  float fVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  int iVar24;
  int iVar27;
  undefined1 auVar26 [16];
  int iVar28;
  uint uVar29;
  int iVar31;
  uint uVar32;
  undefined1 auVar30 [16];
  undefined8 *puStack_130;
  undefined1 auStack_128 [48];
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined *puStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_60;
  ulonglong uVar25;
  
  ppuVar9 = (undefined8 **)auStack_128;
  uStack_60 = 0xfffffffffffffffe;
  lVar7 = *(longlong *)(param_1 + 0x38);
  puVar10 = auStack_128;
  if ((lVar7 == 0) || (puVar10 = auStack_128, *(int *)(lVar7 + 0x18) == *(int *)(param_1 + 4)))
  goto LAB_7ff70c7c9abd;
  auVar14._0_4_ = (int)*(undefined8 *)(param_1 + 0xc) + -1;
  auVar14._4_4_ = (int)((ulonglong)*(undefined8 *)(param_1 + 0xc) >> 0x20) + -1;
  auVar14._8_4_ = 0xffffffff;
  auVar14._12_4_ = 0xffffffff;
  auVar20._0_4_ = auVar14._0_4_ >> 1;
  auVar20._4_4_ = auVar14._4_4_ >> 1;
  auVar20._8_4_ = 0xffffffff;
  auVar20._12_4_ = 0xffffffff;
  auVar20 = auVar20 | auVar14;
  auVar15._0_4_ = auVar20._0_4_ >> 2;
  auVar15._4_4_ = auVar20._4_4_ >> 2;
  auVar15._8_4_ = auVar20._8_4_ >> 2;
  auVar15._12_4_ = auVar20._12_4_ >> 2;
  auVar15 = auVar15 | auVar20;
  auVar21._0_4_ = auVar15._0_4_ >> 4;
  auVar21._4_4_ = auVar15._4_4_ >> 4;
  auVar21._8_4_ = auVar15._8_4_ >> 4;
  auVar21._12_4_ = auVar15._12_4_ >> 4;
  auVar21 = auVar21 | auVar15;
  auVar16._0_4_ = auVar21._0_4_ >> 8;
  auVar16._4_4_ = auVar21._4_4_ >> 8;
  auVar16._8_4_ = auVar21._8_4_ >> 8;
  auVar16._12_4_ = auVar21._12_4_ >> 8;
  auVar16 = auVar16 | auVar21;
  auVar26._0_4_ = auVar16._0_4_ >> 0x10;
  auVar26._4_4_ = auVar16._4_4_ >> 0x10;
  auVar26._8_4_ = auVar16._8_4_ >> 0x10;
  auVar26._12_4_ = auVar16._12_4_ >> 0x10;
  iVar24 = SUB164(auVar26 | auVar16,0) + 1;
  iVar27 = SUB164(auVar26 | auVar16,4) + 1;
  uVar25 = CONCAT44(iVar27,iVar24);
  lVar11 = *(longlong *)(param_1 + 0x2b0);
  puVar10 = auStack_128;
  if ((lVar11 != 0) && (puVar10 = auStack_128, *(int *)(lVar7 + 4) != 4)) {
    auVar17._0_4_ = (int)*(undefined8 *)(lVar11 + 0xa8) + -1;
    auVar17._4_4_ = (int)((ulonglong)*(undefined8 *)(lVar11 + 0xa8) >> 0x20) + -1;
    auVar17._8_4_ = 0xffffffff;
    auVar17._12_4_ = 0xffffffff;
    auVar22._0_4_ = auVar17._0_4_ >> 1;
    auVar22._4_4_ = auVar17._4_4_ >> 1;
    auVar22._8_4_ = 0xffffffff;
    auVar22._12_4_ = 0xffffffff;
    auVar22 = auVar22 | auVar17;
    auVar18._0_4_ = auVar22._0_4_ >> 2;
    auVar18._4_4_ = auVar22._4_4_ >> 2;
    auVar18._8_4_ = auVar22._8_4_ >> 2;
    auVar18._12_4_ = auVar22._12_4_ >> 2;
    auVar18 = auVar18 | auVar22;
    auVar23._0_4_ = auVar18._0_4_ >> 4;
    auVar23._4_4_ = auVar18._4_4_ >> 4;
    auVar23._8_4_ = auVar18._8_4_ >> 4;
    auVar23._12_4_ = auVar18._12_4_ >> 4;
    auVar23 = auVar23 | auVar18;
    auVar19._0_4_ = auVar23._0_4_ >> 8;
    auVar19._4_4_ = auVar23._4_4_ >> 8;
    auVar19._8_4_ = auVar23._8_4_ >> 8;
    auVar19._12_4_ = auVar23._12_4_ >> 8;
    auVar19 = auVar19 | auVar23;
    auVar30._0_4_ = auVar19._0_4_ >> 0x10;
    auVar30._4_4_ = auVar19._4_4_ >> 0x10;
    auVar30._8_4_ = auVar19._8_4_ >> 0x10;
    auVar30._12_4_ = auVar19._12_4_ >> 0x10;
    iVar8 = *(int *)(lVar11 + 0x98) - *(int *)(lVar11 + 0xa0);
    iVar28 = SUB164(auVar30 | auVar19,0) + 1;
    iVar31 = SUB164(auVar30 | auVar19,4) + 1;
    uVar29 = (uint)(iVar28 < iVar24) * iVar24 | (uint)(iVar28 >= iVar24) * iVar28;
    uVar32 = (uint)(iVar31 < iVar27) * iVar27 | (uint)(iVar31 >= iVar27) * iVar31;
    if ((float)iVar8 < 0.0) {
      ppuVar9 = &puStack_130;
      puStack_130 = &uStack_a8;
      fVar13 = (float)func_0x7ff70d8d0d6c();
    }
    else {
      fVar13 = SQRT((float)iVar8);
    }
    uVar6 = (int)((int)fVar13 - 1U) >> 1 | (int)fVar13 - 1U;
    uVar6 = (int)uVar6 >> 2 | uVar6;
    uVar6 = (int)uVar6 >> 4 | uVar6;
    uVar6 = (int)uVar6 >> 8 | uVar6;
    uVar6 = ((int)uVar6 >> 0x10 | uVar6) + 1;
    puVar10 = (undefined1 *)ppuVar9;
    if ((int)uVar29 < (int)uVar32) {
      if ((int)uVar6 < (int)uVar32) {
        uVar6 = uVar32;
      }
      if ((*param_1 & 1) == 0) {
        uVar32 = (int)(uVar6 - 1) >> 1 | uVar6 - 1;
        uVar32 = (int)uVar32 >> 2 | uVar32;
        uVar32 = (int)uVar32 >> 4 | uVar32;
        uVar32 = (int)uVar32 >> 8 | uVar32;
        uVar6 = ((int)uVar32 >> 0x10 | uVar32) + 1;
      }
      uVar32 = (int)(iVar8 + uVar6 + -1) / (int)uVar6;
      if ((int)uVar32 < (int)uVar29) {
        uVar32 = uVar29;
      }
      uVar25 = CONCAT44(uVar6,uVar32);
    }
    else {
      if ((int)uVar6 < (int)uVar29) {
        uVar6 = uVar29;
      }
      uVar25 = (longlong)(int)(iVar8 + uVar6 + -1) / (longlong)(int)uVar6;
      uVar4 = uVar25 & 0xffffffff;
      if ((int)uVar25 < (int)uVar32) {
        uVar4 = (ulonglong)uVar32;
      }
      uVar25 = (ulonglong)uVar6 | uVar4 << 0x20;
      if ((*param_1 & 1) == 0) {
        uVar29 = (int)uVar4 - 1;
        uVar29 = (int)uVar29 >> 1 | uVar29;
        uVar29 = (int)uVar29 >> 2 | uVar29;
        uVar29 = (int)uVar29 >> 4 | uVar29;
        uVar29 = (int)uVar29 >> 8 | uVar29;
        uVar25 = CONCAT44(((int)uVar29 >> 0x10 | uVar29) + 1,uVar6);
      }
    }
  }
  iVar24 = *(int *)(param_1 + 0x68);
  if ((longlong)iVar24 != 0) {
    lVar7 = *(longlong *)(param_1 + 0x70);
    lVar11 = 0;
    do {
      uVar2 = *(undefined8 *)(lVar7 + lVar11);
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c99bc;
      FUN_7ff70c7c8d40(param_1,uVar2);
      lVar11 = lVar11 + 8;
    } while ((longlong)iVar24 * 8 != lVar11);
    lVar11 = *(longlong *)(param_1 + 0x2b0);
  }
  if (lVar11 != 0) {
    if ((*(longlong *)(param_1 + 0x2b8) != 0) &&
       (pcVar3 = *(code **)(*(longlong *)(param_1 + 0x2b8) + 0x10), pcVar3 != (code *)0x0)) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c99ef;
      (*pcVar3)(param_1);
      lVar11 = *(longlong *)(param_1 + 0x2b0);
      if (lVar11 == 0) goto LAB_7ff70c7c9a9f;
    }
    if (*(longlong *)(lVar11 + 0xe0) != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a10;
      FUN_7ff70c802510();
    }
    lVar7 = *(longlong *)(lVar11 + 0xd0);
    iVar24 = *(int *)(lVar11 + 200);
    if ((longlong)iVar24 != 0) {
      lVar12 = 0;
      do {
        uVar2 = *(undefined8 *)(lVar7 + lVar12);
        *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a39;
        FUN_7ff70c802510(uVar2);
        lVar12 = lVar12 + 8;
      } while ((longlong)iVar24 * 8 != lVar12);
      lVar7 = *(longlong *)(lVar11 + 0xd0);
    }
    if (lVar7 != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a57;
      FUN_7ff70c802510(lVar7);
    }
    if (*(longlong *)(lVar11 + 0x88) != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a69;
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar11 + 0x78) != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a78;
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar11 + 0x68) != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a87;
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar11 + 0x58) != 0) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a96;
      FUN_7ff70c802510();
    }
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9a9f;
    FUN_7ff70c802510(lVar11);
  }
LAB_7ff70c7c9a9f:
  param_1[0x2b0] = 0;
  param_1[0x2b1] = 0;
  param_1[0x2b2] = 0;
  param_1[0x2b3] = 0;
  param_1[0x2b4] = 0;
  param_1[0x2b5] = 0;
  param_1[0x2b6] = 0;
  param_1[0x2b7] = 0;
  *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9abd;
  FUN_7ff70c7e6320(param_1,uVar25 & 0xffffffff,uVar25 >> 0x20);
LAB_7ff70c7c9abd:
  if (*(longlong *)(param_1 + 0x2b0) == 0) {
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9aea;
    FUN_7ff70c7cbc20(param_1);
    iVar24 = *(int *)(param_1 + 0x78);
  }
  else {
    iVar24 = *(int *)(param_1 + 0x78);
  }
  if (iVar24 == 0) {
    uStack_a8 = 0;
    uStack_84 = 0;
    uStack_80 = 0;
    uStack_98 = 0;
    uStack_90 = 0;
    uStack_78 = 0;
    uStack_70 = 0;
    puStack_b8 = (undefined *)0x0;
    uStack_b0 = 0;
    uStack_d8 = 0;
    uStack_d0 = 0;
    uStack_e8 = 0;
    uStack_e0 = 0;
    uStack_f8 = 0;
    uStack_f0 = 0;
    uStack_a0 = 0x7f7fffff00000000;
    uStack_8c = (undefined4)_DAT_7ff70cb1bb60;
    uStack_88 = (undefined4)((ulonglong)_DAT_7ff70cb1bb60 >> 0x20);
    uStack_c8 = 0x1000100000000;
    uStack_c0 = 0x4150000000000101;
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9b58;
    FUN_7ff70c802a20(&uStack_f8,0x28,&UNK_7ff70cb85c12);
    uStack_c0._0_4_ = CONCAT22(0x85,(undefined2)uStack_c0);
    uStack_a8 = CONCAT44((float)(int)(uStack_c0._4_4_ / _DAT_7ff70cb1bb80) + uStack_a8._4_4_,
                         (undefined4)uStack_a8);
    puVar5 = &UNK_7ff70cb15438;
    if (puStack_b8 != (undefined *)0x0) {
      puVar5 = puStack_b8;
    }
    *(undefined **)(puVar10 + 0x28) = puVar5;
    *(undefined8 **)(puVar10 + 0x20) = &uStack_f8;
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9baa;
    FUN_7ff70c7d6f80(param_1);
    iVar24 = *(int *)(param_1 + 0x2a0);
  }
  else {
    iVar24 = *(int *)(param_1 + 0x2a0);
  }
  if ((longlong)iVar24 != 0) {
    lVar7 = 0;
    do {
      lVar11 = *(longlong *)(*(longlong *)(*(longlong *)(param_1 + 0x2a8) + lVar7) + 0x68);
      if (lVar11 != 0) {
        param_1[0x51] = *(byte *)(lVar11 + 0xc) >> 4 & 1;
        bVar1 = param_1[0x51];
        goto joined_r0x7ff70c7c9c21;
      }
      lVar7 = lVar7 + 8;
    } while ((longlong)iVar24 * 8 != lVar7);
  }
  bVar1 = param_1[0x51];
joined_r0x7ff70c7c9c21:
  if (bVar1 == 0) {
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c7c9bf4;
    FUN_7ff70c7e67b0(param_1);
  }
  param_1[0x52] = 1;
  return;
}


