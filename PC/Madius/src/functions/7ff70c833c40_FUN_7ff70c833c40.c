/* 7ff70c833c40 FUN_7ff70c833c40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c833c40(void)

{
  undefined4 *puVar1;
  int *piVar2;
  bool bVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  float fVar7;
  longlong lVar8;
  uint uVar9;
  undefined8 uVar10;
  short sVar11;
  ulonglong uVar12;
  int *piVar13;
  char cVar14;
  longlong lVar15;
  longlong *plVar16;
  longlong lVar17;
  int iVar18;
  longlong lVar19;
  longlong lVar20;
  int iVar21;
  int iVar22;
  longlong *plVar23;
  longlong lVar24;
  int iVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  float fVar31;
  float fVar32;
  float fVar34;
  undefined1 auVar33 [16];
  float fVar35;
  float fVar36;
  float fVar38;
  undefined1 auVar37 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 auStack_90 [2];
  longlong *plStack_80;
  
  lVar8 = _DAT_7ff70cc1a3c0;
  iVar22 = *(int *)(_DAT_7ff70cc1a3c0 + 0x138c);
  if (iVar22 != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
    FUN_7ff70c830ff0();
    iVar22 = *(int *)(lVar8 + 5000);
  }
  if (*(int *)(lVar8 + 0x1390) == iVar22) {
    return;
  }
  *(int *)(lVar8 + 0x1390) = iVar22;
  *(undefined4 *)(lVar8 + 0xc4) = 0;
  if ((longlong)*(int *)(lVar8 + 0x26b8) != 0) {
    lVar20 = *(longlong *)(lVar8 + 0x26c0);
    lVar19 = (longlong)*(int *)(lVar8 + 0x26b8) << 5;
    do {
      if (*(int *)(lVar20 + 4) == 4) {
        (**(code **)(lVar20 + 0x10))(lVar8);
      }
      lVar20 = lVar20 + 0x20;
      lVar19 = lVar19 + -0x20;
    } while (lVar19 != 0);
  }
  iVar22 = *(int *)(lVar8 + 0x1f80);
  lVar20 = _DAT_7ff70cc1a3c0;
  if ((longlong)iVar22 != 0) {
    plStack_80 = *(longlong **)(lVar8 + 0x1f88);
    lVar19 = 0;
    do {
      lVar17 = *(longlong *)((longlong)plStack_80 + lVar19);
      puVar1 = (undefined4 *)(lVar17 + 0x68);
      *(undefined4 **)(lVar17 + 0xa0) = puVar1;
      piVar13 = (int *)(lVar17 + 0xb0);
      *(int **)(lVar17 + 0xa8) = piVar13;
      if (*(int *)(lVar17 + 0x6c) < 0) {
        uVar10 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
        lVar24 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar13 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar13) {
            sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar15 * 8) + 1;
          }
          else {
            iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
            lVar15 = (longlong)iVar25;
            *(int *)(lVar24 + 0x2874 + lVar15 * 8) = *piVar13;
            *(undefined4 *)(lVar24 + 0x2878 + lVar15 * 8) = 0;
            sVar11 = 1;
          }
          *(short *)(lVar24 + 0x2878 + lVar15 * 8) = sVar11;
          *(int *)(lVar24 + 0x2868) = *(int *)(lVar24 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar17 + 0x70) != 0) {
          FUN_7ff70cb12b60(uVar10,*(longlong *)(lVar17 + 0x70),
                           (longlong)*(int *)(lVar17 + 0x68) << 3);
          lVar24 = _DAT_7ff70cc1a3c0;
          if ((*(longlong *)(lVar17 + 0x70) != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar13 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar13) {
              sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
            }
            else {
              iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
              lVar15 = (longlong)iVar25;
              *(int *)(lVar24 + 0x2874 + lVar15 * 8) = *piVar13;
              *(undefined4 *)(lVar24 + 0x2878 + lVar15 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar24 + 0x287a + lVar15 * 8) = sVar11;
            *(int *)(lVar24 + 0x286c) = *(int *)(lVar24 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)();
        }
        *(undefined8 *)(lVar17 + 0x70) = uVar10;
        *(undefined4 *)(lVar17 + 0x6c) = 0;
        piVar13 = *(int **)(lVar17 + 0xa8);
        *puVar1 = 0;
        iVar25 = piVar13[1];
      }
      else {
        *puVar1 = 0;
        iVar25 = *(int *)(lVar17 + 0xb4);
      }
      if (iVar25 < 0) {
        uVar10 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
        lVar24 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar2) {
            sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar15 * 8) + 1;
          }
          else {
            iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
            lVar15 = (longlong)iVar25;
            *(int *)(lVar24 + 0x2874 + lVar15 * 8) = *piVar2;
            *(undefined4 *)(lVar24 + 0x2878 + lVar15 * 8) = 0;
            sVar11 = 1;
          }
          *(short *)(lVar24 + 0x2878 + lVar15 * 8) = sVar11;
          *(int *)(lVar24 + 0x2868) = *(int *)(lVar24 + 0x2868) + 1;
        }
        if (*(longlong *)(piVar13 + 2) != 0) {
          FUN_7ff70cb12b60(uVar10,*(longlong *)(piVar13 + 2),(longlong)*piVar13 << 3);
          lVar24 = _DAT_7ff70cc1a3c0;
          if ((*(longlong *)(piVar13 + 2) != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar2) {
              sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
            }
            else {
              iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
              lVar15 = (longlong)iVar25;
              *(int *)(lVar24 + 0x2874 + lVar15 * 8) = *piVar2;
              *(undefined4 *)(lVar24 + 0x2878 + lVar15 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar24 + 0x287a + lVar15 * 8) = sVar11;
            *(int *)(lVar24 + 0x286c) = *(int *)(lVar24 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)();
        }
        *(undefined8 *)(piVar13 + 2) = uVar10;
        piVar13[1] = 0;
      }
      *piVar13 = 0;
      *(undefined1 *)(lVar17 + 0x58) = 1;
      *(undefined8 *)(lVar17 + 0x5c) = 0;
      *(undefined4 *)(lVar17 + 100) = 0;
      *(undefined8 *)(lVar17 + 0x78) = *(undefined8 *)(lVar17 + 8);
      *(undefined8 *)(lVar17 + 0x80) = *(undefined8 *)(lVar17 + 0x10);
      *(undefined8 *)(lVar17 + 0x88) = *(undefined8 *)(lVar20 + 0x18);
      *(longlong *)(lVar17 + 0x90) = lVar17;
      lVar20 = _DAT_7ff70cc1a3c0;
      *(longlong *)(lVar17 + 0x98) = _DAT_7ff70cc1a3c0 + 0xc30;
      lVar24 = *(longlong *)(lVar17 + 0x48);
      if (lVar24 != 0) {
        if (*(int *)(lVar17 + 0x40) != *(int *)(lVar20 + 5000)) {
          FUN_7ff70c7b6160(lVar24);
          uStack_98 = *(undefined8 *)(*(longlong *)(lVar20 + 0x40) + 0x28);
          auStack_90[0] = *(undefined8 *)(*(longlong *)(lVar20 + 0x40) + 0x30);
          FUN_7ff70c7b8300(lVar24,&uStack_98);
          uStack_a0 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar17 + 0x10) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar17 + 8) >> 0x20),
                               (float)*(undefined8 *)(lVar17 + 0x10) +
                               (float)*(undefined8 *)(lVar17 + 8));
          FUN_7ff70c7b7c50(lVar24,lVar17 + 8,&uStack_a0,0);
          *(undefined4 *)(lVar17 + 0x40) = *(undefined4 *)(lVar20 + 5000);
        }
        FUN_7ff70c7c6a60(lVar17 + 0x58,*(undefined8 *)(lVar17 + 0xa0),lVar24);
        lVar20 = _DAT_7ff70cc1a3c0;
      }
      lVar19 = lVar19 + 8;
    } while ((longlong)iVar22 * 8 != lVar19);
  }
  auVar39 = _DAT_7ff70cb1d610;
  auVar30 = _DAT_7ff70cb1b5a0;
  auVar42 = _DAT_7ff70cb1b2a0;
  lVar19 = (longlong)*(int *)(lVar20 + 0x1f50);
  if (0 < lVar19) {
    uVar12 = lVar19 + 1;
    plVar16 = (longlong *)(lVar19 * 0x38 + *(longlong *)(lVar20 + 0x1f58) + -0x30);
    do {
      lVar19 = *plVar16;
      if ((((lVar19 != 0) && ((*(byte *)(lVar19 + 0x17) & 8) != 0)) &&
          (*(char *)(lVar19 + 0xcc) == '\x01')) && (*(char *)(lVar19 + 0xd4) != '\x01')) {
        auVar26 = ZEXT416((uint)*(float *)(lVar20 + 0x21ac));
        if (0.0 < *(float *)(lVar20 + 0x21ac)) goto LAB_7ff70c8341d1;
        goto LAB_7ff70c8341c3;
      }
      uVar12 = uVar12 - 1;
      plVar16 = plVar16 + -7;
    } while (1 < uVar12);
  }
  lVar19 = 0;
  auVar26 = ZEXT416((uint)*(float *)(lVar20 + 0x21ac));
  if (*(float *)(lVar20 + 0x21ac) <= 0.0) {
LAB_7ff70c8341c3:
    if (*(float *)(lVar20 + 0x218c) <= 0.0) goto LAB_7ff70c834508;
  }
LAB_7ff70c8341d1:
  lVar17 = *(longlong *)(lVar20 + 0x2178);
  if (lVar17 == 0) {
    cVar14 = '\0';
  }
  else {
    cVar14 = *(char *)(lVar17 + 0xcc);
  }
  if ((lVar19 != 0) || (cVar14 != '\0')) {
    if (lVar19 == 0) {
      if (cVar14 != '\0') {
        auVar26._0_4_ = auVar26._0_4_ * *(float *)(lVar20 + 0xc4c);
        auVar26 = insertps(_DAT_7ff70cb1d610,auVar26,0x30);
        auVar27._0_4_ = auVar26._0_4_ * *(float *)(lVar20 + 0x10d4);
        auVar27._4_4_ = auVar26._4_4_ * *(float *)(lVar20 + 0x10d8);
        auVar27._8_4_ = auVar26._8_4_ * *(float *)(lVar20 + 0x10dc);
        auVar27._12_4_ = auVar26._12_4_ * *(float *)(lVar20 + 0x10e0);
        auVar26 = minps(_DAT_7ff70cb1b2a0,auVar27);
        auVar28._4_4_ = -(uint)(auVar27._4_4_ < 0.0);
        auVar28._0_4_ = -(uint)(auVar27._0_4_ < 0.0);
        auVar28._8_4_ = -(uint)(auVar27._8_4_ < 0.0);
        auVar28._12_4_ = -(uint)(auVar27._12_4_ < 0.0);
        fVar4 = (float)DAT_7ff70cb1b5a0;
        fVar5 = DAT_7ff70cb1b5a0._4_4_;
        fVar6 = DAT_7ff70cb1b5a0._8_4_;
        fVar7 = DAT_7ff70cb1b5a0._12_4_;
        auVar37._0_4_ = auVar26._0_4_ * _DAT_7ff70cb1d5d0 + fVar4;
        auVar37._4_4_ = auVar26._4_4_ * _UNK_7ff70cb1d5d4 + fVar5;
        auVar37._8_4_ = auVar26._8_4_ * _UNK_7ff70cb1d5d8 + fVar6;
        auVar37._12_4_ = auVar26._12_4_ * _UNK_7ff70cb1d5dc + fVar7;
        auVar26 = blendvps(auVar37,_DAT_7ff70cb1b5a0,auVar28);
        auVar29._0_4_ = (int)auVar26._0_4_;
        auVar29._4_4_ = (int)auVar26._4_4_;
        auVar29._8_4_ = (int)auVar26._8_4_;
        auVar29._12_4_ = (int)auVar26._12_4_;
        auVar26 = pmulld(auVar29,_DAT_7ff70cb1d5e0);
        auVar33._0_8_ = auVar26._8_8_;
        auVar33._8_4_ = auVar26._8_4_;
        auVar33._12_4_ = auVar26._12_4_;
        FUN_7ff70c8704b0(lVar17,SUB164(auVar33 | auVar26,4) | SUB164(auVar33 | auVar26,0));
        lVar19 = *(longlong *)(lVar20 + 0x2178);
        lVar17 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
        fVar31 = *(float *)(lVar20 + 0x1130);
        fVar35 = (float)*(undefined8 *)(lVar19 + 0x28);
        fVar34 = (float)((ulonglong)*(undefined8 *)(lVar19 + 0x28) >> 0x20);
        fVar36 = fVar35 - fVar31;
        fVar38 = fVar34 - fVar31;
        uStack_98 = CONCAT44(fVar38,fVar36);
        fVar32 = (float)*(undefined8 *)(lVar19 + 0x30) + fVar35 + fVar31;
        fVar34 = (float)((ulonglong)*(undefined8 *)(lVar19 + 0x30) >> 0x20) + fVar34 + fVar31;
        auStack_90[0] = CONCAT44(fVar34,fVar32);
        fVar35 = *(float *)(lVar17 + 0x10);
        if ((fVar35 <= fVar32 - fVar36) && (*(float *)(lVar17 + 0x14) <= fVar34 - fVar38)) {
          fVar31 = _DAT_7ff70cb1bae8 - fVar31;
          uStack_98 = CONCAT44(fVar38 - fVar31,fVar36 - fVar31);
          auStack_90[0] = CONCAT44(fVar31 + fVar34,fVar31 + fVar32);
        }
        piVar13 = *(int **)(lVar19 + 0x2c8);
        if (*piVar13 == 0) {
          FUN_7ff70c7b7240();
          piVar13 = *(int **)(lVar19 + 0x2c8);
          fVar35 = *(float *)(lVar17 + 0x10);
        }
        auVar26 = insertps(ZEXT416((uint)fVar35),*(undefined4 *)(lVar17 + 0x14),0x10);
        uStack_a0 = CONCAT44(auVar26._4_4_ + (float)((ulonglong)*(undefined8 *)(lVar17 + 8) >> 0x20)
                             ,auVar26._0_4_ + (float)*(undefined8 *)(lVar17 + 8));
        FUN_7ff70c7b7c50(piVar13,lVar17 + 8,&uStack_a0,0);
        auVar39 = insertps(auVar39,ZEXT416((uint)(*(float *)(lVar20 + 0x218c) *
                                                 *(float *)(_DAT_7ff70cc1a3c0 + 0xc4c))),0x30);
        auVar40._0_4_ = auVar39._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c4);
        auVar40._4_4_ = auVar39._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c8);
        auVar40._8_4_ = auVar39._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10cc);
        auVar40._12_4_ = auVar39._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10d0);
        auVar39 = minps(auVar42,auVar40);
        auVar42._4_4_ = -(uint)(auVar40._4_4_ < 0.0);
        auVar42._0_4_ = -(uint)(auVar40._0_4_ < 0.0);
        auVar41._0_4_ = auVar39._0_4_ * _DAT_7ff70cb1d5d0 + fVar4;
        auVar41._4_4_ = auVar39._4_4_ * _UNK_7ff70cb1d5d4 + fVar5;
        auVar41._8_4_ = auVar39._8_4_ * _UNK_7ff70cb1d5d8 + fVar6;
        auVar41._12_4_ = auVar39._12_4_ * _UNK_7ff70cb1d5dc + fVar7;
        auVar42._8_4_ = -(uint)(auVar40._8_4_ < 0.0);
        auVar42._12_4_ = -(uint)(auVar40._12_4_ < 0.0);
        auVar42 = blendvps(auVar41,auVar30,auVar42);
        auVar30._0_4_ = (int)auVar42._0_4_;
        auVar30._4_4_ = (int)auVar42._4_4_;
        auVar30._8_4_ = (int)auVar42._8_4_;
        auVar30._12_4_ = (int)auVar42._12_4_;
        auVar42 = pmulld(auVar30,_DAT_7ff70cb1d5e0);
        auVar39._0_8_ = auVar42._8_8_;
        auVar39._8_4_ = auVar42._8_4_;
        auVar39._12_4_ = auVar42._12_4_;
        FUN_7ff70c7bd870(*(undefined8 *)(lVar19 + 0x2c8),&uStack_98,auStack_90,
                         SUB164(auVar39 | auVar42,4) | SUB164(auVar39 | auVar42,0),
                         *(undefined4 *)(lVar19 + 0x60),0,0x40400000);
        FUN_7ff70c7b8130(*(undefined8 *)(lVar19 + 0x2c8));
      }
    }
    else {
      plVar16 = *(longlong **)(lVar20 + 0x13e8);
      plVar23 = plVar16;
      if (0 < (longlong)*(int *)(lVar20 + 0x13e0)) {
        do {
          if (*plVar23 == lVar19) break;
          plVar23 = plVar23 + 1;
        } while (plVar23 < plVar16 + *(int *)(lVar20 + 0x13e0));
      }
      lVar17 = lVar19;
      if (((ulonglong)((longlong)plVar23 - (longlong)plVar16) >> 0x22 & 1) == 0) {
        uVar12 = (ulonglong)
                 ((uint)((ulonglong)((longlong)plVar23 - (longlong)plVar16) >> 3) & 0x7fffffff);
        do {
          lVar24 = plVar16[uVar12];
          if ((*(uint *)(lVar24 + 0x14) & 0x1000000) == 0) {
            lVar15 = lVar24;
            if (*(longlong *)(lVar24 + 0x3c0) != lVar19) {
              while (lVar15 != lVar19) {
                plVar23 = (longlong *)(lVar15 + 0x3b8);
                lVar15 = *plVar23;
                if (*plVar23 == 0) goto LAB_7ff70c8342be;
              }
            }
            if (((*(char *)(lVar24 + 0xcc) == '\x01') && (*(char *)(lVar24 + 0xd4) == '\0')) &&
               ((*(uint *)(lVar24 + 0x14) >> 0x19 & 1) <=
                (uint)((*(uint *)(lVar19 + 0x14) >> 0x19 & 1) != 0))) {
              lVar17 = lVar24;
            }
          }
          bVar3 = 0 < (longlong)uVar12;
          uVar12 = uVar12 - 1;
        } while (bVar3);
      }
LAB_7ff70c8342be:
      fVar31 = auVar26._0_4_ * *(float *)(lVar20 + 0xc4c);
      uVar9 = *(uint *)(lVar19 + 0x1dc);
      if (fVar31 < _DAT_7ff70cb1ba2c) {
        uVar9 = (int)(longlong)(fVar31 * (float)(uVar9 >> 0x18)) << 0x18 | uVar9 & 0xffffff;
      }
      FUN_7ff70c8704b0(lVar17,uVar9);
    }
  }
LAB_7ff70c834508:
  lVar20 = *(longlong *)(lVar8 + 0x2170);
  if (lVar20 == 0) {
    lVar20 = 0;
    lVar19 = 0;
    iVar22 = *(int *)(lVar8 + 0x13e0);
  }
  else {
    if ((*(byte *)(lVar20 + 0x15) & 0x20) == 0) {
      lVar20 = *(longlong *)(lVar20 + 0x3c0);
    }
    else {
      lVar20 = 0;
    }
    lVar19 = *(longlong *)(lVar8 + 0x2180);
    iVar22 = *(int *)(lVar8 + 0x13e0);
  }
  if ((longlong)iVar22 != 0) {
    lVar17 = *(longlong *)(lVar8 + 0x13e8);
    lVar24 = 0;
    do {
      lVar15 = *(longlong *)(lVar17 + lVar24);
      if (((*(char *)(lVar15 + 0xcc) == '\x01') && (*(char *)(lVar15 + 0xd4) == '\0')) &&
         ((lVar15 != lVar19 && lVar15 != lVar20) && (*(uint *)(lVar15 + 0x14) & 0x1000000) == 0)) {
        FUN_7ff70c8709a0(lVar15,*(uint *)(lVar15 + 0x14) >> 0x19 & 1);
      }
      lVar24 = lVar24 + 8;
    } while ((longlong)iVar22 * 8 != lVar24);
  }
  if (((lVar20 != 0) && (*(char *)(lVar20 + 0xcc) == '\x01')) && (*(char *)(lVar20 + 0xd4) == '\0'))
  {
    FUN_7ff70c8709a0(lVar20,*(uint *)(lVar20 + 0x14) >> 0x19 & 1);
  }
  if (((lVar19 != 0) && (*(char *)(lVar19 + 0xcc) == '\x01')) && (*(char *)(lVar19 + 0xd4) == '\0'))
  {
    FUN_7ff70c8709a0(lVar19,*(uint *)(lVar19 + 0x14) >> 0x19 & 1);
  }
  if ((*(char *)(lVar8 + 0x58) == '\x01') && (*(int *)(lVar8 + 0x23f8) != -1)) {
    FUN_7ff70c80e260(*(undefined8 *)(lVar8 + 0xe0));
  }
  *(undefined8 *)(lVar8 + 0xbc) = 0;
  if ((longlong)*(int *)(lVar8 + 0x1f80) != 0) {
    plVar23 = *(longlong **)(lVar8 + 0x1f88);
    plVar16 = plVar23 + *(int *)(lVar8 + 0x1f80);
    plStack_80 = plVar16;
    do {
      lVar20 = *plVar23;
      piVar13 = *(int **)(lVar20 + 0xa0);
      iVar22 = *piVar13;
      iVar18 = **(int **)(lVar20 + 0xa8) + iVar22;
      iVar25 = piVar13[1];
      if (iVar25 < iVar18) {
        if (iVar25 == 0) {
          iVar25 = 8;
        }
        else {
          iVar25 = iVar25 / 2 + iVar25;
        }
        if (iVar25 <= iVar18) {
          iVar25 = iVar18;
        }
        uVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar25 << 3,_DAT_7ff70cc1a3d0);
        lVar19 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar17 * 8) == *piVar2) {
            sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar17 * 8) + 1;
          }
          else {
            iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
            lVar17 = (longlong)iVar21;
            *(int *)(lVar19 + 0x2874 + lVar17 * 8) = *piVar2;
            *(undefined4 *)(lVar19 + 0x2878 + lVar17 * 8) = 0;
            sVar11 = 1;
          }
          *(short *)(lVar19 + 0x2878 + lVar17 * 8) = sVar11;
          *(int *)(lVar19 + 0x2868) = *(int *)(lVar19 + 0x2868) + 1;
        }
        if (*(longlong *)(piVar13 + 2) != 0) {
          FUN_7ff70cb12b60(uVar10,*(longlong *)(piVar13 + 2),(longlong)*piVar13 << 3);
          lVar17 = _DAT_7ff70cc1a3c0;
          lVar19 = *(longlong *)(piVar13 + 2);
          if ((lVar19 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar24 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar24 * 8) == *piVar2) {
              sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar24 * 8) + 1;
            }
            else {
              iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
              lVar24 = (longlong)iVar21;
              *(int *)(lVar17 + 0x2874 + lVar24 * 8) = *piVar2;
              *(undefined4 *)(lVar17 + 0x2878 + lVar24 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar17 + 0x287a + lVar24 * 8) = sVar11;
            *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar19,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(piVar13 + 2) = uVar10;
        piVar13[1] = iVar25;
        plVar16 = plStack_80;
      }
      *piVar13 = iVar18;
      piVar13 = *(int **)(lVar20 + 0xa8);
      if ((longlong)*piVar13 != 0) {
        FUN_7ff70cb12b60((longlong)iVar22 * 8 + *(longlong *)(*(longlong *)(lVar20 + 0xa0) + 8),
                         *(undefined8 *)(piVar13 + 2),(longlong)*piVar13 << 3);
        if (piVar13[1] < 0) {
          uVar10 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
          lVar19 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar17 * 8) == *piVar2) {
              sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar17 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar17 = (longlong)iVar22;
              *(int *)(lVar19 + 0x2874 + lVar17 * 8) = *piVar2;
              *(undefined4 *)(lVar19 + 0x2878 + lVar17 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar19 + 0x2878 + lVar17 * 8) = sVar11;
            *(int *)(lVar19 + 0x2868) = *(int *)(lVar19 + 0x2868) + 1;
          }
          if (*(longlong *)(piVar13 + 2) != 0) {
            FUN_7ff70cb12b60(uVar10,*(longlong *)(piVar13 + 2),(longlong)*piVar13 << 3);
            lVar17 = _DAT_7ff70cc1a3c0;
            lVar19 = *(longlong *)(piVar13 + 2);
            if ((lVar19 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar24 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar24 * 8) == *piVar2) {
                sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar24 * 8) + 1;
              }
              else {
                iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
                lVar24 = (longlong)iVar22;
                *(int *)(lVar17 + 0x2874 + lVar24 * 8) = *piVar2;
                *(undefined4 *)(lVar17 + 0x2878 + lVar24 * 8) = 0;
                sVar11 = 1;
              }
              *(short *)(lVar17 + 0x287a + lVar24 * 8) = sVar11;
              *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
            }
            (*_DAT_7ff70cbe9468)(lVar19,_DAT_7ff70cc1a3d0);
          }
          *(undefined8 *)(piVar13 + 2) = uVar10;
          piVar13[1] = 0;
        }
        *piVar13 = 0;
      }
      lVar17 = _DAT_7ff70cc1a3c0;
      lVar19 = *(longlong *)(lVar20 + 0x50);
      if (lVar19 != 0) {
        if (*(int *)(lVar20 + 0x44) != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
          FUN_7ff70c7b6160(lVar19);
          lVar24 = *(longlong *)(lVar17 + 0x40);
          uStack_98 = *(undefined8 *)(lVar24 + 0x28);
          auStack_90[0] = *(undefined8 *)(lVar24 + 0x30);
          FUN_7ff70c7b8300(lVar19,&uStack_98);
          uStack_a0 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar20 + 0x10) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar20 + 8) >> 0x20),
                               (float)*(undefined8 *)(lVar20 + 0x10) +
                               (float)*(undefined8 *)(lVar20 + 8));
          FUN_7ff70c7b7c50(lVar19,lVar20 + 8,&uStack_a0,0);
          *(undefined4 *)(lVar20 + 0x44) = *(undefined4 *)(lVar17 + 5000);
        }
        FUN_7ff70c7c6a60(lVar20 + 0x58,*(undefined8 *)(lVar20 + 0xa0),lVar19);
      }
      iVar22 = *(int *)(lVar20 + 0x68);
      if ((longlong)iVar22 != 0) {
        lVar19 = *(longlong *)(lVar20 + 0x70);
        lVar17 = 0;
        do {
          FUN_7ff70c7b7350(*(undefined8 *)(lVar19 + lVar17));
          lVar17 = lVar17 + 8;
        } while ((longlong)iVar22 * 8 != lVar17);
      }
      *(int *)(lVar8 + 0xbc) = *(int *)(lVar8 + 0xbc) + *(int *)(lVar20 + 100);
      *(int *)(lVar8 + 0xc0) = *(int *)(lVar8 + 0xc0) + *(int *)(lVar20 + 0x60);
      plVar23 = plVar23 + 1;
    } while (plVar23 != plVar16);
  }
  if (((*(byte *)(lVar8 + 0xc) & 0x10) != 0) &&
     (iVar22 = *(int *)(lVar8 + 0x1110), (longlong)iVar22 != 0)) {
    lVar20 = *(longlong *)(lVar8 + 0x1118);
    lVar19 = 0;
    do {
      FUN_7ff70c7f6900(*(undefined8 *)(lVar20 + lVar19));
      lVar19 = lVar19 + 8;
    } while ((longlong)iVar22 * 8 != lVar19);
  }
  if ((longlong)*(int *)(lVar8 + 0x26b8) != 0) {
    lVar20 = *(longlong *)(lVar8 + 0x26c0);
    lVar19 = (longlong)*(int *)(lVar8 + 0x26b8) << 5;
    do {
      if (*(int *)(lVar20 + 4) == 5) {
        (**(code **)(lVar20 + 0x10))(lVar8,lVar20);
      }
      lVar20 = lVar20 + 0x20;
      lVar19 = lVar19 + -0x20;
    } while (lVar19 != 0);
  }
  return;
}


