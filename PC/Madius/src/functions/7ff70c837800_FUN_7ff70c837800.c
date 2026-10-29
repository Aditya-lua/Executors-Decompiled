/* 7ff70c837800 FUN_7ff70c837800 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c837800(float *param_1,uint param_2,float *param_3,uint param_4)

{
  int *piVar1;
  undefined8 *puVar2;
  float *pfVar3;
  float fVar4;
  float fVar5;
  undefined8 uVar6;
  uint uVar7;
  undefined4 uVar8;
  longlong lVar9;
  longlong lVar10;
  code *pcVar11;
  undefined1 auVar12 [12];
  longlong lVar13;
  longlong lVar14;
  char cVar15;
  ulonglong uVar16;
  longlong lVar17;
  longlong lVar18;
  undefined1 uVar19;
  short sVar20;
  int iVar21;
  uint uVar22;
  longlong lVar23;
  longlong unaff_RBX;
  uint uVar24;
  undefined4 in_R11D;
  uint uVar25;
  bool bVar26;
  int iVar27;
  int iVar28;
  float fVar29;
  float fVar32;
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar33 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  float fVar37;
  float fVar42;
  undefined8 uVar43;
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  float fVar44;
  undefined1 auVar45 [16];
  float fVar46;
  float fVar47;
  float fVar48;
  undefined1 auVar49 [16];
  float fVar50;
  undefined1 auVar51 [16];
  float fVar53;
  undefined1 auVar52 [16];
  float fVar54;
  float fVar55;
  ulonglong uStack_180;
  undefined1 auStack_178 [16];
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined1 auStack_148 [16];
  undefined8 uStack_138;
  undefined4 uStack_130;
  float fStack_12c;
  float fStack_128;
  float fStack_124;
  float fStack_120;
  undefined4 uStack_11c;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined1 auVar34 [16];
  undefined1 auVar41 [16];
  
  lVar13 = _DAT_7ff70cc1a3c0;
  lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e20) = param_2;
  uVar43 = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)(lVar13 + 0x1e2c) = *(undefined8 *)param_1;
  *(undefined8 *)(lVar13 + 0x1e34) = uVar43;
  if (param_3 == (float *)0x0) {
    param_3 = param_1;
  }
  uVar43 = *(undefined8 *)(param_3 + 2);
  *(undefined8 *)(lVar13 + 0x1e3c) = *(undefined8 *)param_3;
  *(undefined8 *)(lVar13 + 0x1e44) = uVar43;
  uVar24 = param_4 | *(uint *)(lVar13 + 0x1de0) | *(uint *)(lVar13 + 0x1dec);
  *(uint *)(lVar13 + 0x1e24) = uVar24;
  *(undefined4 *)(lVar13 + 0x1e28) = 0;
  if (param_2 != 0) {
    if (*(uint *)(lVar13 + 0x14b4) == param_2) {
      *(uint *)(lVar13 + 0x14b8) = param_2;
      uVar7 = *(uint *)(lVar13 + 0x14e8);
    }
    else {
      uVar7 = *(uint *)(lVar13 + 0x14e8);
    }
    if (uVar7 == param_2) {
      *(undefined1 *)(lVar13 + 0x14f1) = 1;
    }
    if ((uVar24 & 2) == 0) {
      *(ushort *)(lVar9 + 0x176) =
           *(ushort *)(lVar9 + 0x176) | (ushort)(1 << (*(byte *)(lVar9 + 0x170) & 0x1f));
      uVar24 = *(uint *)(lVar13 + 0x1f94);
      if ((((uVar24 == param_2) || (*(char *)(lVar13 + 0x1fe9) == '\x01')) &&
          (lVar10 = *(longlong *)(lVar13 + 0x1f98),
          *(longlong *)(lVar10 + 0x3d8) == *(longlong *)(lVar9 + 0x3d8))) &&
         ((lVar9 == lVar10 || (((*(uint *)(lVar10 + 0x18) | *(uint *)(lVar9 + 0x18)) & 0x100) != 0))
         )) {
        lVar17 = *(longlong *)(lVar13 + 0x1440);
        if (*(char *)(lVar17 + 0x178) == '\0') {
          fVar4 = *(float *)(lVar13 + 0x1e3c);
          fVar5 = *(float *)(lVar13 + 0x1e44);
          fVar50 = *(float *)(lVar17 + 0x268);
          if (fVar4 <= *(float *)(lVar17 + 0x268)) {
            fVar50 = fVar4;
          }
          auVar30 = blendvps(ZEXT416((uint)fVar50),ZEXT416((uint)*(float *)(lVar17 + 0x260)),
                             ZEXT416(-(uint)(fVar4 < *(float *)(lVar17 + 0x260))));
          *(int *)(lVar13 + 0x1e3c) = auVar30._0_4_;
          fVar4 = *(float *)(lVar17 + 0x268);
          if (fVar5 <= *(float *)(lVar17 + 0x268)) {
            fVar4 = fVar5;
          }
          auVar51 = blendvps(ZEXT416((uint)fVar4),ZEXT416((uint)*(float *)(lVar17 + 0x260)),
                             ZEXT416(-(uint)(fVar5 < *(float *)(lVar17 + 0x260))));
          *(int *)(lVar13 + 0x1e44) = auVar51._0_4_;
        }
        else {
          auVar30 = ZEXT416(*(uint *)(lVar13 + 0x1e3c));
          auVar51 = ZEXT416(*(uint *)(lVar13 + 0x1e44));
        }
        uVar7 = *(uint *)(lVar13 + 0x1e20);
        uVar25 = *(uint *)(lVar13 + 0x1e24);
        fVar4 = *(float *)(lVar13 + 0x1e40);
        fVar5 = *(float *)(lVar13 + 0x1e48);
        if (*(char *)(lVar13 + 0x1fea) == '\0') {
          uVar22 = uVar25 & 0x400;
LAB_7ff70c837fb1:
          uVar19 = 0;
        }
        else {
          uVar22 = uVar25 & 0x400;
          uVar19 = 1;
          if (*(int *)(lVar13 + 0x1fa4) == *(int *)(lVar17 + 0x170) && uVar22 == 0) {
            if (((uVar25 & 4) == 0) || (*(int *)(lVar13 + 0x1ff8) == 0)) {
              *(longlong *)(lVar13 + 0x1ff0) = lVar17;
              *(uint *)(lVar13 + 0x1ff8) = uVar7;
              *(undefined4 *)(lVar13 + 0x1ffc) = *(undefined4 *)(lVar13 + 0x1ddc);
              *(uint *)(lVar13 + 0x2010) = uVar25;
              uVar6 = *(undefined8 *)(lVar17 + 0x128);
              uVar43 = *(undefined8 *)(lVar17 + 0x128);
              auVar33 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
              auVar33 = insertps(auVar33,auVar51,0x20);
              auVar33 = insertps(auVar33,ZEXT416((uint)fVar5),0x30);
              *(float *)(lVar13 + 0x2000) = auVar33._0_4_ - (float)uVar6;
              *(float *)(lVar13 + 0x2004) = auVar33._4_4_ - (float)((ulonglong)uVar6 >> 0x20);
              *(float *)(lVar13 + 0x2008) = auVar33._8_4_ - (float)uVar43;
              *(float *)(lVar13 + 0x200c) = auVar33._12_4_ - (float)((ulonglong)uVar43 >> 0x20);
              if ((uVar25 & 0x200000) != 0) {
                *(undefined8 *)(lVar13 + 0x2020) = *(undefined8 *)(lVar13 + 0x1df8);
              }
              if ((uVar25 & 4) == 0) {
                *(undefined1 *)(lVar13 + 0x1fea) = 0;
                *(undefined1 *)(lVar13 + 0x1fe9) = *(undefined1 *)(lVar13 + 0x2029);
                uVar22 = 0;
                goto LAB_7ff70c837fb1;
              }
            }
            uVar22 = 0;
          }
        }
        lVar18 = unaff_RBX;
        if ((uVar22 == 0 & *(byte *)(lVar13 + 0x2029)) == 1) {
          uVar22 = *(uint *)(lVar13 + 0x202c);
          if ((uVar22 & 0x200) == 0) {
            if ((*(byte *)(lVar17 + 0x16) & 1) == 0) {
              if ((uVar22 & 0x400) == 0) goto LAB_7ff70c83804d;
              if ((*(int *)(lVar13 + 0x1fa4) == *(int *)(lVar17 + 0x170)) &&
                 (*(int *)(lVar13 + 0x1fa0) == *(int *)(lVar13 + 0x1ddc))) {
                if ((uVar25 & 1) == 0) {
                  bVar26 = (uVar25 & 0x100000) != 0 || (*(uint *)(lVar13 + 8) & 1) != 0;
                }
                else {
                  bVar26 = false;
                }
                goto LAB_7ff70c838268;
              }
            }
          }
          else {
            bVar26 = true;
            if ((uVar22 & 0x400) == 0) {
LAB_7ff70c83804d:
              if ((uVar22 & 0x10) == 0 && uVar24 == uVar7) goto LAB_7ff70c83873a;
              lVar23 = 0x20e0;
              if (lVar17 == lVar10) {
                lVar23 = 0x2070;
              }
              iVar21 = *(int *)(lVar13 + 0x1fa4);
              fVar50 = auVar51._0_4_;
              if (iVar21 == *(int *)(lVar17 + 0x170)) {
                uVar43 = *(undefined8 *)(lVar13 + 0x204c);
                fVar42 = (float)uVar43;
                fVar46 = (float)((ulonglong)uVar43 >> 0x20);
                *(int *)(lVar13 + 0x2064) = *(int *)(lVar13 + 0x2064) + 1;
                auVar33 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
                fVar37 = (float)*(undefined8 *)(lVar13 + 0x2044);
                if (*(longlong *)(lVar17 + 0x3b0) == lVar10) {
                  fVar48 = *(float *)(lVar17 + 0x26c);
                  if (fVar4 < fVar48) {
                    fVar29 = *(float *)(lVar17 + 0x264);
                    if (fVar29 < fVar5) {
                      fVar32 = *(float *)(lVar17 + 0x268);
                      if ((auVar30._0_4_ < fVar32) && (*(float *)(lVar17 + 0x260) < fVar50)) {
                        auVar49 = insertps(ZEXT416((uint)*(float *)(lVar17 + 0x260)),
                                           ZEXT416((uint)fVar29),0x10);
                        auVar40 = insertps(ZEXT416((uint)fVar32),ZEXT416((uint)fVar48),0x10);
                        auVar52 = minps(auVar40,auVar33);
                        auVar40._4_4_ = -(uint)(auVar33._4_4_ < auVar49._4_4_);
                        auVar40._0_4_ = -(uint)(auVar33._0_4_ < auVar49._0_4_);
                        auVar40._8_4_ = -(uint)(auVar33._8_4_ < auVar49._8_4_);
                        auVar40._12_4_ = -(uint)(auVar33._12_4_ < auVar49._12_4_);
                        auVar33 = blendvps(auVar52,auVar49,auVar40);
                        if (fVar5 <= fVar48) {
                          fVar48 = fVar5;
                        }
                        auStack_148 = blendvps(ZEXT416((uint)fVar48),ZEXT416((uint)fVar29),
                                               ZEXT416(-(uint)(fVar5 < fVar29)));
                        if (fVar50 <= fVar32) {
                          fVar32 = fVar50;
                        }
                        auVar40 = ZEXT416((uint)fVar32);
                        goto joined_r0x7ff70c83816e;
                      }
                    }
                  }
                }
                else {
                  auStack_148 = ZEXT416((uint)fVar5);
                  auVar40 = auVar51;
                  fVar32 = fVar50;
joined_r0x7ff70c83816e:
                  fVar48 = auVar33._0_4_;
                  if (fVar37 <= fVar32) {
                    auVar49 = ZEXT816(0);
                    if (fVar42 < fVar48) {
                      auVar49._4_12_ = auVar33._4_12_;
                      auVar49._0_4_ = fVar48 - fVar42;
                    }
                  }
                  else {
                    auVar49._4_12_ = auVar40._4_12_;
                    auVar49._0_4_ = auVar40._0_4_ - fVar37;
                  }
                  fVar47 = (float)((ulonglong)*(undefined8 *)(lVar13 + 0x2044) >> 0x20);
                  uStack_150 = 0;
                  fVar32 = fVar46 - fVar47;
                  fVar55 = fVar32 * _DAT_7ff70cb1c5dc + fVar47;
                  fVar53 = auVar33._4_4_;
                  fVar54 = auVar33._12_4_;
                  fVar44 = auStack_148._0_4_ - fVar53;
                  auVar31._4_4_ = auStack_148._4_4_;
                  auVar31._0_4_ = fVar44;
                  auVar31._8_4_ = auStack_148._8_4_;
                  auVar31._12_4_ = auStack_148._12_4_;
                  auVar52._4_12_ = auVar31._4_12_;
                  fVar29 = fVar44 * _DAT_7ff70cb1d86c + fVar53;
                  if (fVar55 <= fVar29) {
                    fVar29 = fVar47 + fVar32 * _DAT_7ff70cb1d86c;
                    fVar32 = fVar53 + fVar44 * _DAT_7ff70cb1c5dc;
                    if (fVar29 < fVar32) {
                      auVar52._4_4_ = fVar53;
                      auVar52._0_4_ = fVar32 - fVar29;
                      auVar52._8_4_ = fVar54;
                      auVar52._12_4_ = fVar54;
                      goto LAB_7ff70c83820c;
                    }
                    auVar52._0_12_ = ZEXT812(0);
                    auVar52._12_4_ = 0;
                    bVar26 = false;
                  }
                  else {
                    auVar52._0_4_ = fVar29 - fVar55;
LAB_7ff70c83820c:
                    fVar29 = auVar52._0_4_;
                    bVar26 = fVar29 != 0.0;
                    fVar32 = auVar49._0_4_;
                    if (((fVar32 != 0.0) || (NAN(fVar32))) && ((fVar29 != 0.0 || (NAN(fVar29))))) {
                      in_R11D = 0xcb1d8f8;
                      auVar49._0_4_ =
                           fVar32 / _DAT_7ff70cb1d8f0 +
                           *(float *)(&UNK_7ff70cb1d8f8 + (ulonglong)(0.0 < fVar32) * 4);
                      bVar26 = true;
                    }
                  }
                  auVar40 = insertps(auVar40,auStack_148._0_4_,0x10);
                  fVar37 = (auVar40._0_4_ + fVar48) - (fVar37 + fVar42);
                  fVar42 = (auVar40._4_4_ + fVar53) - (fVar47 + fVar46);
                  auVar41._0_8_ = CONCAT44(fVar42,fVar37);
                  auVar41._8_4_ = (auVar40._8_4_ + auVar33._8_4_) - 0.0;
                  auVar41._12_4_ = (auVar40._12_4_ + fVar54) - 0.0;
                  fVar29 = auVar49._0_4_;
                  auVar33 = insertps(auVar49,auVar41,0x1c);
                  fVar46 = (float)(auVar33._0_4_ & _DAT_7ff70cb1bac0);
                  fVar48 = (float)(auVar33._4_4_ & _UNK_7ff70cb1bac4);
                  auVar33._8_4_ = auVar41._8_4_;
                  auVar33._0_8_ = auVar41._0_8_;
                  auVar33._12_4_ = auVar41._12_4_;
                  auVar33 = blendps(auVar33,auVar52,1);
                  fVar54 = (float)(auVar33._0_4_ & _DAT_7ff70cb1bac0);
                  fVar44 = (float)(auVar33._4_4_ & _UNK_7ff70cb1bac4);
                  fVar32 = fVar54 + fVar46;
                  fVar53 = fVar44 + fVar48;
                  if (bVar26) {
LAB_7ff70c8384ed:
                    auVar36 = auVar49;
                    auVar45 = auVar52;
                    uVar24 = (uint)(0.0 < fVar29);
                    fVar37 = fVar32;
                    if (fVar46 <= fVar54) {
                      uVar24 = 0.0 < auVar52._0_4_ | 2;
                    }
                  }
                  else {
                    if ((fVar29 != 0.0) || (NAN(fVar29))) goto LAB_7ff70c8384ed;
                    auVar45._4_4_ = fVar42;
                    auVar45._0_4_ = fVar42;
                    auVar45._8_4_ = auVar41._12_4_;
                    auVar45._12_4_ = auVar41._12_4_;
                    if ((((fVar37 != 0.0) || (NAN(fVar37))) || (fVar42 != 0.0)) || (NAN(fVar42))) {
                      iVar27 = -(uint)(0.0 < fVar37);
                      iVar28 = -(uint)(0.0 < fVar42);
                      auVar35._4_4_ = iVar28;
                      auVar35._0_4_ = iVar27;
                      auVar35._8_4_ = iVar28;
                      auVar35._12_4_ = iVar28;
                      auVar34._8_8_ = auVar35._8_8_;
                      auVar34._4_4_ = iVar27;
                      auVar34._0_4_ = iVar27;
                      uVar25 = movmskpd(in_R11D,auVar34);
                      uVar24 = uVar25 >> 1 & 0x7f | 2;
                      if (fVar44 < fVar48) {
                        uVar24 = uVar25 & 1;
                      }
                      auVar36._8_4_ = auVar41._8_4_;
                      auVar36._0_8_ = auVar41._0_8_;
                      auVar36._12_4_ = auVar41._12_4_;
                      fVar37 = fVar53;
                    }
                    else {
                      auVar36 = ZEXT816(0);
                      auVar45 = ZEXT816(0);
                      uVar24 = (uint)(uVar24 <= uVar7);
                      fVar37 = 0.0;
                    }
                  }
                  uVar25 = *(uint *)(lVar13 + 0x2038);
                  fVar42 = *(float *)(lVar13 + 0x24 + lVar23);
                  uStack_158 = uVar43;
                  if (uVar24 != uVar25) goto LAB_7ff70c8385cb;
                  if (fVar42 <= fVar32) {
                    if ((fVar32 != fVar42) || (NAN(fVar32) || NAN(fVar42))) {
LAB_7ff70c8385cb:
                      bVar26 = false;
                    }
                    else {
                      fVar46 = *(float *)(lVar13 + 0x28 + lVar23);
                      if (fVar46 <= fVar53) {
                        if ((fVar53 == fVar46) && (!NAN(fVar53) && !NAN(fVar46))) {
                          if (uVar24 < 2) {
                            auVar52 = auVar49;
                          }
                          if (auVar52._0_4_ < 0.0) goto LAB_7ff70c8385c6;
                        }
                        goto LAB_7ff70c8385cb;
                      }
                      *(float *)(lVar13 + 0x28 + lVar23) = fVar53;
LAB_7ff70c8385c6:
                      bVar26 = true;
                    }
                    if (((((fVar42 != _DAT_7ff70cb1c5d8) || (NAN(fVar42) || NAN(_DAT_7ff70cb1c5d8)))
                         || (iVar21 != 1)) ||
                        ((*(float *)(lVar13 + 0x2c + lVar23) <= fVar37 ||
                         ((*(byte *)(lVar10 + 0x17) & 0x10) != 0)))) ||
                       (((((uVar25 != 0 || (0.0 <= auVar36._0_4_)) &&
                          ((uVar25 != 1 || (auVar36._0_4_ <= 0.0)))) &&
                         ((uVar25 != 2 || (0.0 <= auVar45._0_4_)))) &&
                        ((uVar25 != 3 || (auVar45._0_4_ <= 0.0)))))) {
                      if (!bVar26) goto LAB_7ff70c838695;
                    }
                    else {
                      *(float *)(lVar13 + 0x2c + lVar23) = fVar37;
                    }
                  }
                  else {
                    pfVar3 = (float *)(lVar13 + 0x24 + lVar23);
                    *pfVar3 = fVar32;
                    pfVar3[1] = fVar53;
                  }
                  lVar14 = _DAT_7ff70cc1a3c0;
                  lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
                  *(longlong *)(lVar13 + lVar23) = lVar10;
                  *(undefined4 *)(lVar13 + 8 + lVar23) = *(undefined4 *)(lVar14 + 0x1e20);
                  *(undefined4 *)(lVar13 + 0xc + lVar23) = *(undefined4 *)(lVar14 + 0x1ddc);
                  uVar24 = *(uint *)(lVar14 + 0x1e24);
                  *(uint *)(lVar13 + 0x20 + lVar23) = uVar24;
                  puVar2 = (undefined8 *)(lVar10 + 0x128);
                  uVar43 = *puVar2;
                  uVar6 = *puVar2;
                  fVar37 = *(float *)(lVar14 + 0x1e40);
                  fVar42 = *(float *)(lVar14 + 0x1e44);
                  fVar46 = *(float *)(lVar14 + 0x1e48);
                  pfVar3 = (float *)(lVar13 + 0x10 + lVar23);
                  *pfVar3 = *(float *)(lVar14 + 0x1e3c) - (float)uVar43;
                  pfVar3[1] = fVar37 - (float)((ulonglong)uVar43 >> 0x20);
                  pfVar3[2] = fVar42 - (float)uVar6;
                  pfVar3[3] = fVar46 - (float)((ulonglong)uVar6 >> 0x20);
                  if ((uVar24 & 0x200000) != 0) {
                    *(undefined8 *)(lVar13 + 0x30 + lVar23) = *(undefined8 *)(lVar14 + 0x1df8);
                  }
                }
              }
LAB_7ff70c838695:
              if (((uVar22 & 0x20) != 0) && (fVar37 = *(float *)(lVar17 + 0x26c), fVar4 < fVar37)) {
                fVar42 = *(float *)(lVar17 + 0x264);
                if ((fVar42 < fVar5) &&
                   ((auVar30._0_4_ < *(float *)(lVar17 + 0x268) &&
                    (*(float *)(lVar17 + 0x260) <= fVar50 && fVar50 != *(float *)(lVar17 + 0x260))))
                   ) {
                  fVar50 = fVar37;
                  if (fVar5 <= fVar37) {
                    fVar50 = fVar5;
                  }
                  auVar33 = blendvps(ZEXT416((uint)fVar50),ZEXT416((uint)fVar42),
                                     ZEXT416(-(uint)(fVar5 < fVar42)));
                  if (fVar4 <= fVar37) {
                    fVar37 = fVar4;
                  }
                  auVar40 = blendvps(ZEXT416((uint)fVar37),ZEXT416((uint)fVar42),
                                     ZEXT416(-(uint)(fVar4 < fVar42)));
                  if ((fVar5 - fVar4) * _DAT_7ff70cb1d7c4 <= auVar33._0_4_ - auVar40._0_4_) {
                    lVar18 = lVar13 + 0x20a8;
                    cVar15 = FUN_7ff70c871030(lVar18);
                    unaff_RBX = lVar18;
                    if (cVar15 != '\0') goto LAB_7ff70c8383cb;
                  }
                }
              }
            }
            else {
LAB_7ff70c838268:
              iVar21 = *(int *)(lVar13 + 0x2068);
              if (iVar21 == -1) {
                if (uVar24 == uVar7) {
                  if (*(int *)(lVar13 + 0x2078) != 0) {
                    *(undefined1 *)(lVar13 + 0x2029) = 0;
                    *(undefined1 *)(lVar13 + 0x1fe9) = uVar19;
                  }
                }
                else if (bVar26) {
                  *(longlong *)(lVar13 + 0x2070) = lVar17;
                  *(uint *)(lVar13 + 0x2078) = uVar7;
                  *(undefined4 *)(lVar13 + 0x207c) = *(undefined4 *)(lVar13 + 0x1ddc);
                  *(uint *)(lVar13 + 0x2090) = uVar25;
                  uVar43 = *(undefined8 *)(lVar17 + 0x128);
                  uVar6 = *(undefined8 *)(lVar17 + 0x128);
                  auVar33 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
                  auVar33 = insertps(auVar33,auVar51,0x20);
                  auVar33 = insertps(auVar33,ZEXT416((uint)fVar5),0x30);
                  *(float *)(lVar13 + 0x2080) = auVar33._0_4_ - (float)uVar43;
                  *(float *)(lVar13 + 0x2084) = auVar33._4_4_ - (float)((ulonglong)uVar43 >> 0x20);
                  *(float *)(lVar13 + 0x2088) = auVar33._8_4_ - (float)uVar6;
                  *(float *)(lVar13 + 0x208c) = auVar33._12_4_ - (float)((ulonglong)uVar6 >> 0x20);
                  if ((uVar25 & 0x200000) != 0) {
                    *(undefined8 *)(lVar13 + 0x20a0) = *(undefined8 *)(lVar13 + 0x1df8);
                  }
                }
              }
              else if (iVar21 == 0) {
                if (bVar26) {
                  if (uVar24 == uVar7) {
                    *(undefined1 *)(lVar13 + 0x2029) = 0;
                    *(longlong *)(lVar13 + 0x2070) = lVar17;
                    *(uint *)(lVar13 + 0x2078) = uVar24;
                    *(undefined4 *)(lVar13 + 0x207c) = *(undefined4 *)(lVar13 + 0x1ddc);
                    *(uint *)(lVar13 + 0x2090) = uVar25;
                    uVar43 = *(undefined8 *)(lVar17 + 0x128);
                    uVar6 = *(undefined8 *)(lVar17 + 0x128);
                    auVar33 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
                    auVar33 = insertps(auVar33,auVar51,0x20);
                    auVar33 = insertps(auVar33,ZEXT416((uint)fVar5),0x30);
                    *(float *)(lVar13 + 0x2080) = auVar33._0_4_ - (float)uVar43;
                    *(float *)(lVar13 + 0x2084) = auVar33._4_4_ - (float)((ulonglong)uVar43 >> 0x20)
                    ;
                    *(float *)(lVar13 + 0x2088) = auVar33._8_4_ - (float)uVar6;
                    *(float *)(lVar13 + 0x208c) = auVar33._12_4_ - (float)((ulonglong)uVar6 >> 0x20)
                    ;
                    if ((uVar25 & 0x200000) != 0) {
                      *(undefined8 *)(lVar13 + 0x20a0) = *(undefined8 *)(lVar13 + 0x1df8);
                    }
                    *(undefined1 *)(lVar13 + 0x1fe9) = uVar19;
                  }
                  if (*(int *)(lVar13 + 0x2120) == 0) {
                    lVar18 = lVar13 + 0x2118;
LAB_7ff70c8383cb:
                    FUN_7ff70c83f3e0(lVar18);
                    lVar18 = unaff_RBX;
                  }
                }
              }
              else if (iVar21 == 1) {
                if (bVar26) {
                  if (*(int *)(lVar13 + 0x2120) == 0) {
                    *(longlong *)(lVar13 + 0x2118) = lVar17;
                    *(uint *)(lVar13 + 0x2120) = uVar7;
                    *(undefined4 *)(lVar13 + 0x2124) = *(undefined4 *)(lVar13 + 0x1ddc);
                    *(uint *)(lVar13 + 0x2138) = uVar25;
                    uVar6 = *(undefined8 *)(lVar17 + 0x128);
                    uVar43 = *(undefined8 *)(lVar17 + 0x128);
                    auVar33 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
                    auVar33 = insertps(auVar33,auVar51,0x20);
                    auVar33 = insertps(auVar33,ZEXT416((uint)fVar5),0x30);
                    *(float *)(lVar13 + 0x2128) = auVar33._0_4_ - (float)uVar6;
                    *(float *)(lVar13 + 0x212c) = auVar33._4_4_ - (float)((ulonglong)uVar6 >> 0x20);
                    *(float *)(lVar13 + 0x2130) = auVar33._8_4_ - (float)uVar43;
                    *(float *)(lVar13 + 0x2134) =
                         auVar33._12_4_ - (float)((ulonglong)uVar43 >> 0x20);
                    if ((uVar25 & 0x200000) != 0) {
                      *(undefined8 *)(lVar13 + 0x2148) = *(undefined8 *)(lVar13 + 0x1df8);
                    }
                  }
                  if ((0 < *(int *)(lVar13 + 0x206c)) &&
                     (iVar21 = *(int *)(lVar13 + 0x206c) + -1, *(int *)(lVar13 + 0x206c) = iVar21,
                     iVar21 == 0)) {
                    FUN_7ff70c83ee60(lVar13 + 0x2070);
                    goto LAB_7ff70c83873a;
                  }
                }
                if (uVar24 == uVar7) {
                  *(undefined4 *)(lVar13 + 0x206c) = 1;
                }
              }
            }
          }
        }
LAB_7ff70c83873a:
        lVar10 = _DAT_7ff70cc1a3c0;
        unaff_RBX = lVar18;
        if (*(uint *)(lVar13 + 0x1f94) == uVar7) {
          if (*(longlong *)(lVar13 + 0x1f98) != lVar17) {
            lVar18 = _DAT_7ff70cc1a3c0;
            if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) != lVar17) {
              if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 4) != 0) {
                FUN_7ff70c800cf0(&UNK_7ff70cb91b12,*(undefined8 *)(lVar17 + 8));
              }
              lVar18 = _DAT_7ff70cc1a3c0;
              *(longlong *)(lVar10 + 0x1f98) = lVar17;
              *(undefined8 *)(lVar10 + 0x1fe0) = 0xffffffffffffffff;
            }
            *(undefined2 *)(lVar10 + 0x2028) = 0;
            *(undefined1 *)(lVar10 + 0x1fea) = 0;
            uVar19 = 1;
            if (*(char *)(lVar18 + 0x2029) == '\0') {
              uVar19 = *(undefined1 *)(lVar18 + 0x1fea);
            }
            *(undefined1 *)(lVar18 + 0x1fe9) = uVar19;
            unaff_RBX = lVar10;
          }
          *(undefined4 *)(lVar13 + 0x1fa4) = *(undefined4 *)(lVar17 + 0x170);
          FUN_7ff70c83e1d0(*(undefined4 *)(lVar13 + 0x1ddc));
          *(undefined4 *)(lVar13 + 0x1fa0) = *(undefined4 *)(lVar13 + 0x1ddc);
          *(undefined1 *)(lVar13 + 0x1f93) = 1;
          if ((*(byte *)(lVar13 + 0x1e26) & 0x20) != 0) {
            *(undefined8 *)(lVar13 + 0x1fe0) = *(undefined8 *)(lVar13 + 0x1df8);
          }
          uVar43 = *(undefined8 *)(lVar17 + 0x128);
          uVar6 = *(undefined8 *)(lVar17 + 0x128);
          auVar30 = insertps(auVar30,ZEXT416((uint)fVar4),0x10);
          auVar30 = insertps(auVar30,auVar51,0x20);
          auVar30 = insertps(auVar30,ZEXT416((uint)fVar5),0x30);
          pfVar3 = (float *)(lVar17 + 0x3f8 + (longlong)*(int *)(lVar17 + 0x170) * 0x10);
          *pfVar3 = auVar30._0_4_ - (float)uVar43;
          pfVar3[1] = auVar30._4_4_ - (float)((ulonglong)uVar43 >> 0x20);
          pfVar3[2] = auVar30._8_4_ - (float)uVar6;
          pfVar3[3] = auVar30._12_4_ - (float)((ulonglong)uVar6 >> 0x20);
        }
      }
    }
    lVar10 = _DAT_7ff70cc1a3c0;
    if (((*(byte *)(lVar13 + 0x1de8) & 4) != 0) &&
       (unaff_RBX = lVar10, (*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e25) & 4) == 0)) {
      uVar24 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e08);
      if ((uVar24 & 0x40000) == 0) {
        uVar8 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1e04);
      }
      else {
        *(byte *)(_DAT_7ff70cc1a3c0 + 0x1e29) = *(byte *)(_DAT_7ff70cc1a3c0 + 0x1e29) | 4;
        uVar8 = *(undefined4 *)(lVar10 + 0x1e04);
        *(undefined4 *)(lVar10 + 0x1e6c) = uVar8;
      }
      cVar15 = FUN_7ff70c848ce0(uVar8,uVar24 & 0x3fcff,param_2);
      uVar8 = _UNK_7ff70cb1d904;
      if ((cVar15 != '\0') && (*(int *)(lVar10 + 0x1fa8) == 0)) {
        *(uint *)(lVar10 + 0x1fa8) = param_2;
        *(uint *)(lVar10 + 0x1fac) = param_2;
        *(uint *)(lVar10 + 0x1fb0) = param_2;
        *(undefined4 *)(lVar10 + 0x1fb4) = uVar8;
        lVar10 = _DAT_7ff70cc1a3c0;
        *(uint *)(_DAT_7ff70cc1a3c0 + 0x1fc8) = param_2;
        *(undefined4 *)(lVar10 + 0x1fcc) = 0x3dcccccd;
      }
    }
  }
  *(undefined8 *)(lVar13 + 0x1de8) = 0;
  lVar10 = _DAT_7ff70cc1a3c0;
  if ((((param_1[3] < *(float *)(lVar9 + 0x264) || param_1[3] == *(float *)(lVar9 + 0x264)) ||
       (*(float *)(lVar9 + 0x26c) < param_1[1] || *(float *)(lVar9 + 0x26c) == param_1[1])) ||
      (param_1[2] < *(float *)(lVar9 + 0x260) || param_1[2] == *(float *)(lVar9 + 0x260))) ||
     (uVar16 = CONCAT71((int7)((ulonglong)unaff_RBX >> 8),1),
     *(float *)(lVar9 + 0x268) < *param_1 || *(float *)(lVar9 + 0x268) == *param_1)) {
    if ((param_2 == 0) ||
       (((param_2 != *(uint *)(lVar13 + 0x14b4) && (param_2 != *(uint *)(lVar13 + 0x14e4))) &&
        ((param_2 != *(uint *)(lVar13 + 0x1f94) && (param_2 != *(uint *)(lVar13 + 0x1fa8))))))) {
      uVar16 = 0;
      if (*(char *)(lVar13 + 0x14b2) != '\x01') goto LAB_7ff70c837d0f;
      goto LAB_7ff70c837aa3;
    }
    uVar16 = 0;
LAB_7ff70c837aab:
    if (param_2 == *(uint *)(lVar13 + 0x1de4)) {
      if (*(char *)(_DAT_7ff70cc1a3c0 + 0x27ea) == '\x01') {
        pcVar11 = (code *)swi(3);
        uVar16 = (*pcVar11)();
        return uVar16;
      }
      uStack_f8 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e60);
      uStack_f0 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e68);
      uStack_138 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e20);
      uStack_118 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e40);
      uVar43 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e48);
      uStack_108 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e50);
      uStack_100 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e58);
      fStack_128 = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e30);
      fStack_124 = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e30) >> 0x20);
      fStack_120 = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e38);
      uStack_11c = (undefined4)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e38) >> 0x20);
      uStack_130 = (undefined4)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e28);
      fStack_12c = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e28) >> 0x20);
      *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1de4) = 0;
      lVar9 = **(longlong **)(lVar10 + 0x1f88);
      lVar17 = *(longlong *)(lVar9 + 0x50);
      uStack_110 = uVar43;
      if (lVar17 == 0) {
        lVar17 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
        lVar18 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
            sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar23 * 8) + 1;
          }
          else {
            iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
            lVar23 = (longlong)iVar21;
            *(int *)(lVar18 + 0x2874 + lVar23 * 8) = *piVar1;
            *(undefined4 *)(lVar18 + 0x2878 + lVar23 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar18 + 0x2878 + lVar23 * 8) = sVar20;
          *(int *)(lVar18 + 0x2868) = *(int *)(lVar18 + 0x2868) + 1;
        }
        FUN_7ff70c7b5780(lVar17,lVar10 + 0x1148);
        *(undefined **)(lVar17 + 0xd8) = &UNK_7ff70cb875f7;
        *(longlong *)(lVar9 + 0x50) = lVar17;
        if (*(int *)(lVar9 + 0x44) != *(int *)(lVar10 + 5000)) goto LAB_7ff70c837b59;
      }
      else if (*(int *)(lVar9 + 0x44) != *(int *)(lVar10 + 5000)) {
LAB_7ff70c837b59:
        FUN_7ff70c7b6160(lVar17);
        auStack_178 = *(undefined1 (*) [16])(*(longlong *)(lVar10 + 0x40) + 0x28);
        FUN_7ff70c7b8300(lVar17,auStack_178);
        uStack_180 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar9 + 0x10) >> 0x20) +
                              (float)((ulonglong)*(undefined8 *)(lVar9 + 8) >> 0x20),
                              (float)*(undefined8 *)(lVar9 + 0x10) +
                              (float)*(undefined8 *)(lVar9 + 8));
        FUN_7ff70c7b7c50(lVar17,lVar9 + 8,&uStack_180,0);
        *(undefined4 *)(lVar9 + 0x44) = *(undefined4 *)(lVar10 + 5000);
      }
      auStack_178._0_4_ = fStack_12c + _DAT_7ff70cb1d870;
      auStack_178._4_4_ = fStack_128 + _UNK_7ff70cb1d874;
      auStack_178._8_4_ = fStack_124 + _UNK_7ff70cb1d878;
      auStack_178._12_4_ = fStack_120 + _UNK_7ff70cb1d87c;
      uStack_180 = *(ulonglong *)(lVar10 + 0xe0);
      auVar30._8_8_ = 0;
      auVar30._0_8_ = uStack_180;
      auVar12._4_8_ = uVar43;
      auVar12._0_4_ = auStack_178._4_4_;
      auVar38._0_8_ = auVar12._0_8_ << 0x20;
      auVar38._8_4_ = auStack_178._8_4_;
      auVar38._12_4_ = auStack_178._12_4_;
      auVar39._8_8_ = auStack_178._8_8_;
      auVar39._0_8_ = auVar38._8_8_;
      auVar30 = minps(auVar39,auVar30);
      auVar51._4_4_ = -(uint)((float)(uStack_180 >> 0x20) < auStack_178._4_4_);
      auVar51._0_4_ = -(uint)((float)uStack_180 < auStack_178._0_4_);
      auVar51._8_4_ = -(uint)(0.0 < auStack_178._8_4_);
      auVar51._12_4_ = -(uint)(0.0 < auStack_178._12_4_);
      auVar30 = blendvps(auVar30,auStack_178,auVar51);
      uStack_160 = auVar30._0_8_;
      FUN_7ff70c7bd870(lVar17,auStack_178,auStack_178 + 8,0xff00ff00,0,0,0x3f800000);
      FUN_7ff70c7bd6c0(lVar17,&uStack_180,&uStack_160,0xff00ff00,0x3f800000);
    }
    if (*(uint *)(lVar13 + 0x14e8) == param_2) {
      *(undefined4 *)(lVar13 + 0x14ec) = *(undefined4 *)(lVar13 + 5000);
    }
  }
  else {
LAB_7ff70c837aa3:
    if (param_2 != 0) goto LAB_7ff70c837aab;
  }
  if ((char)uVar16 != '\0') {
    *(byte *)(lVar13 + 0x1e29) = *(byte *)(lVar13 + 0x1e29) | 1;
  }
  lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  auVar30 = blendvps(ZEXT416((uint)*(float *)(lVar9 + 0x260)),ZEXT416((uint)*param_1),
                     ZEXT416(-(uint)(*(float *)(lVar9 + 0x260) <= *param_1)));
  uVar16 = CONCAT71((int7)(uVar16 >> 8),1);
  if (auVar30._0_4_ - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4) <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe0))
  {
    auVar30 = blendvps(ZEXT416((uint)*(float *)(lVar9 + 0x264)),ZEXT416((uint)param_1[1]),
                       ZEXT416(-(uint)(*(float *)(lVar9 + 0x264) <= param_1[1])));
    if (auVar30._0_4_ - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8) <=
        *(float *)(_DAT_7ff70cc1a3c0 + 0xe4)) {
      fVar4 = param_1[2];
      if (*(float *)(lVar9 + 0x268) <= param_1[2]) {
        fVar4 = *(float *)(lVar9 + 0x268);
      }
      if (*(float *)(_DAT_7ff70cc1a3c0 + 0xe0) < *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4) + fVar4) {
        fVar4 = param_1[3];
        if (*(float *)(lVar9 + 0x26c) <= param_1[3]) {
          fVar4 = *(float *)(lVar9 + 0x26c);
        }
        if (*(float *)(_DAT_7ff70cc1a3c0 + 0xe4) < fVar4 + *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8)) {
          *(byte *)(lVar13 + 0x1e28) = *(byte *)(lVar13 + 0x1e28) | 1;
        }
      }
    }
  }
LAB_7ff70c837d0f:
  return uVar16 & 0xffffffff;
}


