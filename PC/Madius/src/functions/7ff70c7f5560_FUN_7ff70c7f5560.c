/* 7ff70c7f5560 FUN_7ff70c7f5560 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f5560(byte *param_1)

{
  float *pfVar1;
  undefined8 *puVar2;
  float fVar3;
  undefined8 uVar4;
  uint uVar5;
  short sVar6;
  undefined8 uVar7;
  uint uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  uint uVar11;
  longlong lVar12;
  longlong lVar13;
  int iVar14;
  uint uVar15;
  longlong lVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  ulonglong uVar20;
  ushort uVar21;
  longlong lVar22;
  uint uVar23;
  uint uVar24;
  ulonglong uVar25;
  uint uVar26;
  ushort uVar27;
  uint uVar28;
  int iVar29;
  uint uVar30;
  undefined1 auVar31 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  float fVar36;
  int iVar37;
  undefined1 auVar38 [16];
  longlong lVar39;
  longlong lVar40;
  longlong lVar41;
  undefined1 auVar42 [16];
  int iVar43;
  int iVar44;
  int iVar47;
  int iVar48;
  int iVar49;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  float fVar50;
  float fVar51;
  float fVar52;
  float fVar53;
  ushort uVar32;
  short sVar35;
  
  lVar13 = _UNK_7ff70cb1c638;
  lVar12 = _DAT_7ff70cb1c630;
  if ((*param_1 & 4) != 0) {
    return;
  }
  lVar16 = *(longlong *)(param_1 + 0x38);
  lVar39 = *(longlong *)(param_1 + 0x2b0);
  uVar24 = *(uint *)(lVar39 + 0xf0);
  if ((uVar24 != 0xffffffff) && ((int)(uVar24 & 0xfffff) < *(int *)(lVar39 + 0x70))) {
    uVar18 = *(uint *)(*(longlong *)(lVar39 + 0x78) + (ulonglong)(uVar24 & 0xfffff) * 4);
    if (((uVar18 & 0x40000000) != 0) &&
       (((int)(uVar18 * 4) >> 0x16 == (uVar24 >> 0x14 & 0x3ff) &&
        (lVar40 = *(longlong *)(lVar39 + 0x68), lVar40 != 0)))) {
      lVar16 = (longlong)((ulonglong)uVar18 << 0x2c) >> 0x2c;
      uVar32 = *(ushort *)(lVar40 + lVar16 * 8);
      uVar21 = *(ushort *)(lVar40 + 2 + lVar16 * 8);
      uVar27 = *(ushort *)(lVar40 + 4 + lVar16 * 8);
      fVar3 = *(float *)(param_1 + 0x54);
      fVar36 = *(float *)(param_1 + 0x58);
      uVar24 = (uint)uVar32;
      uVar18 = (uint)uVar27;
      uVar30 = (uint)uVar21;
      lVar22 = 0;
      lVar16 = _DAT_7ff70cb1c610;
      lVar39 = _UNK_7ff70cb1c618;
      lVar40 = _DAT_7ff70cb1c620;
      lVar41 = _UNK_7ff70cb1c628;
      do {
        iVar44 = (int)((ulonglong)uVar18 - lVar40) / 2;
        iVar47 = (int)((ulonglong)uVar18 - lVar41) / 2;
        iVar48 = (int)((ulonglong)uVar18 - lVar16) / 2;
        iVar49 = (int)((ulonglong)uVar18 - lVar39) / 2;
        iVar29 = (int)(lVar16 + (ulonglong)uVar30);
        iVar43 = (int)(lVar39 + (ulonglong)uVar30);
        iVar14 = (int)(lVar40 + (ulonglong)uVar30);
        iVar37 = (int)(lVar41 + (ulonglong)uVar30);
        fVar50 = ((float)(iVar14 + 1) * fVar36 + (float)iVar14 * fVar36) * _DAT_7ff70cb1b5a0;
        fVar51 = ((float)(iVar37 + 1) * fVar36 + (float)iVar37 * fVar36) * _UNK_7ff70cb1b5a4;
        fVar52 = ((float)(iVar29 + 1) * fVar36 + (float)iVar29 * fVar36) * _UNK_7ff70cb1b5a8;
        fVar53 = ((float)(iVar43 + 1) * fVar36 + (float)iVar43 * fVar36) * _UNK_7ff70cb1b5ac;
        auVar31._4_4_ = fVar50;
        auVar31._0_4_ = (float)(int)(iVar44 + (uVar24 - 1)) * fVar3;
        auVar31._8_4_ = fVar52;
        auVar31._12_4_ = fVar50;
        auVar33._4_4_ = fVar51;
        auVar33._0_4_ = (float)(int)(iVar47 + (uVar24 - 1)) * fVar3;
        auVar33._8_4_ = fVar52;
        auVar33._12_4_ = fVar51;
        auVar42._4_4_ = fVar52;
        auVar42._0_4_ = (float)(int)(iVar48 + (uVar24 - 1)) * fVar3;
        auVar42._8_4_ = fVar52;
        auVar42._12_4_ = fVar52;
        auVar45._4_4_ = fVar53;
        auVar45._0_4_ = (float)(int)(iVar49 + (uVar24 - 1)) * fVar3;
        auVar45._8_4_ = fVar52;
        auVar45._12_4_ = fVar53;
        auVar46._0_4_ = (float)(int)((int)lVar40 + uVar24 + iVar44 + 1) * fVar3;
        auVar46._4_4_ = (float)(int)((int)lVar41 + uVar24 + iVar47 + 1) * fVar3;
        auVar46._8_4_ = (float)(int)((int)lVar16 + uVar24 + iVar48 + 1) * fVar3;
        auVar46._12_4_ = (float)(int)((int)lVar39 + uVar24 + iVar49 + 1) * fVar3;
        auVar31 = insertps(auVar31,auVar46,0x20);
        auVar33 = insertps(auVar33,auVar46,0x60);
        auVar42 = blendps(auVar42,auVar46,4);
        auVar46 = insertps(auVar45,auVar46,0xe0);
        *(undefined1 (*) [16])(param_1 + lVar22 + 0xb8) = auVar46;
        *(undefined1 (*) [16])(param_1 + lVar22 + 0xa8) = auVar42;
        *(undefined1 (*) [16])(param_1 + lVar22 + 0x98) = auVar33;
        *(undefined1 (*) [16])(param_1 + lVar22 + 0x88) = auVar31;
        lVar40 = lVar40 + lVar12;
        lVar41 = lVar41 + lVar13;
        lVar16 = lVar16 + lVar12;
        lVar39 = lVar39 + lVar13;
        lVar22 = lVar22 + 0x40;
      } while (lVar22 != 0x200);
      iVar14 = (int)(((uint)uVar27 - ((int)(uVar27 - 0x20) >> 0x1f)) + -0x20) >> 1;
      fVar36 = ((float)(uVar21 + 0x21) * fVar36 + (float)(uVar21 + 0x20) * fVar36) *
               _DAT_7ff70cb1ba70;
      *(float *)(param_1 + 0x288) = (float)(int)(iVar14 + (uint)uVar32 + -1) * fVar3;
      *(float *)(param_1 + 0x28c) = fVar36;
      *(float *)(param_1 + 0x290) = (float)(int)(uVar24 + iVar14 + 0x21) * fVar3;
      *(float *)(param_1 + 0x294) = fVar36;
      return;
    }
  }
  uVar18 = 0;
  uVar9 = FUN_7ff70c7d93b0(param_1,0x22,0x21,0);
  uVar24 = (uint)uVar9;
  if (uVar24 == 0xffffffff) {
    uVar20 = 0;
    uVar30 = 0;
    goto LAB_7ff70c7f5b6c;
  }
  uVar17 = uVar24 & 0xfffff;
  lVar12 = *(longlong *)(param_1 + 0x2b0);
  if (lVar12 == 0) {
    uVar9 = uVar9 & 0xffffffff;
    FUN_7ff70c7cbc20(param_1);
    lVar12 = *(longlong *)(param_1 + 0x2b0);
    if ((int)uVar17 < *(int *)(lVar12 + 0x70)) goto LAB_7ff70c7f5946;
LAB_7ff70c7f59a9:
    uVar18 = 0;
    uVar20 = 0;
    uVar30 = 0;
  }
  else {
    if (*(int *)(lVar12 + 0x70) <= (int)uVar17) goto LAB_7ff70c7f59a9;
LAB_7ff70c7f5946:
    uVar24 = (uint)uVar9;
    uVar8 = *(uint *)(*(longlong *)(lVar12 + 0x78) + (ulonglong)uVar17 * 4);
    uVar18 = 0;
    if ((uVar8 & 0x40000000) == 0) goto LAB_7ff70c7f59a9;
    uVar20 = 0;
    uVar30 = 0;
    if ((int)(uVar8 * 4) >> 0x16 == ((uint)(uVar9 >> 0x14) & 0x3ff)) {
      lVar13 = *(longlong *)(lVar12 + 0x68);
      if (lVar13 == 0) goto LAB_7ff70c7f59a9;
      lVar40 = (longlong)((ulonglong)uVar8 << 0x2c) >> 0x2c;
      uVar30 = (uint)*(ushort *)(lVar13 + lVar40 * 8);
      uVar20 = (ulonglong)*(ushort *)(lVar13 + 2 + lVar40 * 8);
      uVar18 = (uint)*(ushort *)(lVar13 + 4 + lVar40 * 8);
    }
  }
  if (param_1[0x51] == 1) {
    lVar13 = (longlong)
             ((ulonglong)*(uint *)(*(longlong *)(lVar12 + 0x78) + (ulonglong)uVar17 * 4) << 0x2c) >>
             0x2c;
    uVar17 = *(uint *)(*(longlong *)(lVar12 + 0x68) + lVar13 * 8);
    uVar8 = *(uint *)(*(longlong *)(lVar12 + 0x68) + 4 + lVar13 * 8);
    uVar28 = uVar17 >> 0x10;
    lVar12 = *(longlong *)(param_1 + 0x38);
    uVar15 = (uVar8 & 0xffff) + (uVar17 & 0xffff);
    uVar23 = uVar15;
    if ((*(ushort *)(lVar12 + 0x3c) != 0) &&
       (uVar23 = (uint)*(ushort *)(lVar12 + 0x38) + (uint)*(ushort *)(lVar12 + 0x3c),
       uVar23 <= uVar15)) {
      uVar23 = uVar15;
    }
    uVar11 = (uVar8 >> 0x10) + uVar28;
    if (*(ushort *)(lVar12 + 0x3e) == 0) {
      uVar32 = *(ushort *)(lVar12 + 0x3a);
      uVar26 = uVar11;
    }
    else {
      uVar32 = *(ushort *)(lVar12 + 0x3a);
      uVar26 = (uint)*(ushort *)(lVar12 + 0x3e) + (uint)uVar32;
      if (uVar26 <= uVar11) {
        uVar26 = uVar11;
      }
    }
    uVar21 = (ushort)uVar17;
    uVar5 = uVar17;
    if ((ushort)*(uint *)(lVar12 + 0x38) < uVar21) {
      uVar5 = *(uint *)(lVar12 + 0x38);
    }
    *(short *)(lVar12 + 0x38) = (short)uVar5;
    uVar27 = (ushort)(uVar17 >> 0x10);
    uVar19 = uVar28;
    if (uVar32 < uVar27) {
      uVar19 = (uint)uVar32;
    }
    *(short *)(lVar12 + 0x3a) = (short)uVar19;
    *(short *)(lVar12 + 0x3c) = (short)uVar23 - (short)uVar5;
    *(short *)(lVar12 + 0x3e) = (short)uVar26 - (short)uVar19;
    uVar4 = *(undefined8 *)(lVar12 + 0x30);
    uVar32 = (ushort)uVar4;
    auVar34._0_2_ = (uVar21 < uVar32) * uVar21 | (uVar21 >= uVar32) * uVar32;
    uVar32 = (ushort)((ulonglong)uVar4 >> 0x10);
    auVar34._2_2_ = (uVar27 < uVar32) * uVar27 | (uVar27 >= uVar32) * uVar32;
    sVar35 = (short)((ulonglong)uVar4 >> 0x20);
    sVar6 = (short)((ulonglong)uVar4 >> 0x30);
    auVar34._4_2_ = (ushort)(sVar35 == 0) * sVar35;
    auVar34._6_2_ = (ushort)(sVar6 == 0) * sVar6;
    auVar34._8_8_ = 0;
    *(ushort *)(lVar12 + 0x30) = auVar34._0_2_;
    *(ushort *)(lVar12 + 0x32) = auVar34._2_2_;
    auVar31 = pmovzxwd(ZEXT416(uVar17),auVar34);
    auVar33 = pmovzxwd(ZEXT416(*(uint *)(lVar12 + 0x34)),ZEXT416(*(uint *)(lVar12 + 0x34)));
    uVar23 = auVar33._0_4_ + auVar31._0_4_;
    uVar26 = auVar33._4_4_ + auVar31._4_4_;
    iVar14 = auVar33._8_4_ + auVar31._8_4_;
    iVar37 = auVar33._12_4_ + auVar31._12_4_;
    auVar38._0_4_ = (uVar15 < uVar23) * uVar23 | (uVar15 >= uVar23) * uVar15;
    auVar38._4_4_ = (uVar11 < uVar26) * uVar26 | (uVar11 >= uVar26) * uVar11;
    auVar38._8_4_ = (uint)(iVar14 != 0) * iVar14;
    auVar38._12_4_ = (uint)(iVar37 != 0) * iVar37;
    auVar31 = pshuflw(auVar31,auVar38,0xe8);
    *(uint *)(lVar12 + 0x34) = CONCAT22(auVar31._2_2_ - auVar34._2_2_,auVar31._0_2_ - auVar34._0_2_)
    ;
    param_1[0x52] = 0;
    if ((*(int *)(lVar12 + 4) == 3) || (*(int *)(lVar12 + 4) == 0)) {
      *(undefined4 *)(lVar12 + 4) = 3;
      iVar14 = *(int *)(lVar12 + 0x40);
      if (iVar14 == *(int *)(lVar12 + 0x44)) {
        if (iVar14 == 0) {
          iVar37 = 8;
        }
        else {
          iVar37 = iVar14 / 2 + iVar14;
        }
        iVar29 = iVar14 + 1;
        if (iVar14 + 1 < iVar37) {
          iVar29 = iVar37;
        }
        lVar13 = FUN_7ff70c802100((longlong)iVar29 << 3);
        if (*(longlong *)(lVar12 + 0x48) != 0) {
          FUN_7ff70cb12b60(lVar13,*(longlong *)(lVar12 + 0x48),
                           (longlong)*(int *)(lVar12 + 0x40) << 3);
          FUN_7ff70c802510(*(undefined8 *)(lVar12 + 0x48));
        }
        *(longlong *)(lVar12 + 0x48) = lVar13;
        *(int *)(lVar12 + 0x44) = iVar29;
        iVar14 = *(int *)(lVar12 + 0x40);
      }
      else {
        lVar13 = *(longlong *)(lVar12 + 0x48);
      }
      *(ulonglong *)(lVar13 + (longlong)iVar14 * 8) =
           CONCAT44(uVar8,uVar17) & 0xffffffff0000ffff | (ulonglong)(uVar28 << 0x10);
      *(int *)(lVar12 + 0x40) = *(int *)(lVar12 + 0x40) + 1;
    }
  }
LAB_7ff70c7f5b6c:
  *(uint *)(lVar39 + 0xf0) = uVar24;
  uVar7 = _UNK_7ff70cb1bbd8;
  uVar4 = _DAT_7ff70cb1bbd0;
  fVar3 = _DAT_7ff70cb1ba70;
  lVar39 = 0x10;
  lVar13 = 0;
  uVar9 = uVar20;
  lVar12 = 0;
  uVar24 = uVar18;
  do {
    uVar10 = (ulonglong)uVar18 - lVar12;
    uVar17 = (int)(((uint)(uVar10 >> 0x1f) & 1) + (int)uVar10) >> 1;
    iVar29 = (uVar18 - (int)lVar12) - uVar17;
    iVar37 = (int)lVar12 + (int)uVar20;
    iVar14 = (int)uVar9;
    if (*(int *)(lVar16 + 0x18) == 0) {
      lVar40 = *(longlong *)(lVar16 + 0x28);
      iVar43 = *(int *)(lVar16 + 0x1c);
      iVar44 = *(int *)(lVar16 + 0x24);
      uVar9 = uVar20;
      if (1 < (longlong)uVar10) {
        if (uVar17 < 8) {
          uVar10 = 0;
        }
        else {
          uVar10 = (ulonglong)(uVar17 & 0xfffffff8);
          uVar9 = (ulonglong)uVar17 * 4 & 0xffffffffffffffe0;
          lVar41 = (int)((iVar43 * iVar14 + uVar30) * iVar44) + lVar40;
          uVar25 = 0;
          do {
            puVar2 = (undefined8 *)(lVar41 + uVar25);
            *puVar2 = uVar4;
            puVar2[1] = uVar7;
            puVar2 = (undefined8 *)(lVar41 + 0x10 + uVar25);
            *puVar2 = uVar4;
            puVar2[1] = uVar7;
            uVar25 = uVar25 + 0x20;
          } while (uVar9 != uVar25);
          if ((uVar17 & 0xfffffff8) == uVar17) goto LAB_7ff70c7f5dcf;
        }
        uVar9 = (int)((iVar43 * iVar14 + uVar30) * iVar44) + lVar40;
        do {
          *(undefined4 *)(uVar9 + uVar10 * 4) = 0xffffff;
          uVar10 = uVar10 + 1;
        } while (uVar17 != uVar10);
      }
LAB_7ff70c7f5dcf:
      if (lVar12 != 0) {
        FUN_7ff70cb12b80((int)((iVar43 * iVar37 + uVar30) * iVar44) + lVar40 +
                         (longlong)(int)uVar17 * 4,CONCAT71((int7)(uVar9 >> 8),0xff),lVar12 * 4);
      }
      if (0 < iVar29) {
        lVar41 = (longlong)(int)uVar17;
        uVar8 = uVar24 - uVar17;
        if (uVar8 < 8) {
          uVar9 = 0;
        }
        else {
          uVar9 = (ulonglong)(uVar8 & 0xfffffff8);
          lVar22 = (longlong)(int)((iVar43 * iVar14 + uVar30) * iVar44);
          uVar10 = 0;
          do {
            puVar2 = (undefined8 *)(lVar41 * 4 + lVar13 + lVar40 + lVar22 + uVar10 * 4);
            *puVar2 = uVar4;
            puVar2[1] = uVar7;
            puVar2 = (undefined8 *)(lVar39 + lVar41 * 4 + lVar40 + lVar22 + uVar10 * 4);
            *puVar2 = uVar4;
            puVar2[1] = uVar7;
            uVar10 = uVar10 + 8;
          } while ((uVar8 & 0xfffffff8) != uVar10);
          if ((uVar8 & 0xfffffff8) == uVar8) goto LAB_7ff70c7f5bcf;
        }
        lVar22 = 0;
        do {
          *(undefined4 *)
           (lVar40 + uVar9 * 4 + lVar13 + lVar41 * 4 +
            (longlong)(int)(iVar44 * (iVar43 * iVar14 + uVar30)) + lVar22 * 4) = 0xffffff;
          lVar22 = lVar22 + 1;
        } while (uVar8 - uVar9 != lVar22);
      }
    }
    else if (*(int *)(lVar16 + 0x18) == 1) {
      lVar40 = (longlong)
               (int)((*(int *)(lVar16 + 0x1c) * iVar37 + uVar30) * *(int *)(lVar16 + 0x24)) +
               *(longlong *)(lVar16 + 0x28);
      if (1 < (longlong)uVar10) {
        FUN_7ff70cb12b80(lVar40,0,(ulonglong)(uVar17 - 1) + 1);
      }
      if (lVar12 != 0) {
        FUN_7ff70cb12b80(lVar40 + (int)uVar17,0xff,lVar12);
      }
      if (0 < iVar29) {
        FUN_7ff70cb12b80(lVar40 + (int)uVar17 + lVar12,0,iVar29);
      }
    }
LAB_7ff70c7f5bcf:
    lVar40 = lVar12 + 1;
    auVar33 = insertps(ZEXT416(*(uint *)(param_1 + 0x54)),
                       ZEXT416((uint)((float)(iVar37 + 1) * *(float *)(param_1 + 0x58) +
                                     (float)iVar37 * *(float *)(param_1 + 0x58))),0x10);
    auVar31 = insertps(ZEXT416((uint)(float)(int)(uVar17 + uVar30 + -1)),ZEXT416((uint)fVar3),0x10);
    auVar31 = insertps(auVar31,ZEXT416((uint)(float)(int)((int)lVar40 + uVar17 + uVar30)),0x20);
    auVar31 = insertps(auVar31,ZEXT416((uint)fVar3),0x30);
    pfVar1 = (float *)(param_1 + lVar12 * 0x10 + 0x88);
    *pfVar1 = auVar31._0_4_ * auVar33._0_4_;
    pfVar1[1] = auVar31._4_4_ * auVar33._4_4_;
    pfVar1[2] = auVar31._8_4_ * auVar33._0_4_;
    pfVar1[3] = auVar31._12_4_ * auVar33._4_4_;
    uVar24 = uVar24 - 1;
    uVar9 = (ulonglong)(iVar14 + 1);
    lVar39 = lVar39 + 4;
    lVar13 = lVar13 + 4;
    lVar12 = lVar40;
    if (lVar40 == 0x21) {
      return;
    }
  } while( true );
}


