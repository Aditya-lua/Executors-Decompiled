/* 7ff70c839dc0 FUN_7ff70c839dc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c839dc0(undefined8 *param_1,longlong param_2,undefined8 param_3)

{
  longlong lVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  bool bVar19;
  char cVar20;
  undefined8 *puVar21;
  uint uVar22;
  uint *puVar23;
  int iVar24;
  uint uVar25;
  ulonglong uVar26;
  uint *puVar27;
  bool bVar28;
  bool bVar29;
  bool bVar30;
  bool bVar31;
  int iVar32;
  int iVar33;
  float fVar34;
  float fVar35;
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  ulonglong uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined4 uVar47;
  float fVar48;
  float fVar49;
  float fVar54;
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined4 uVar60;
  undefined4 uVar61;
  undefined1 auVar55 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined4 uVar62;
  float fVar63;
  undefined1 auVar64 [16];
  float fVar65;
  float fVar66;
  float fVar67;
  float fVar68;
  float fVar69;
  ulonglong uVar70;
  undefined1 auVar71 [16];
  undefined1 auVar73 [16];
  float fVar74;
  float fVar75;
  undefined1 auStack_f8 [32];
  undefined1 auStack_d8 [8];
  ulonglong uStack_d0;
  undefined1 auVar56 [16];
  undefined1 auVar72 [16];
  
  lVar1 = _DAT_7ff70cc1a3c0;
  uStack_d0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  uVar45 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 8);
  uVar46 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x10);
  fVar67 = (float)uVar45;
  fVar34 = (float)uVar46 + fVar67;
  fVar49 = (float)((ulonglong)uVar45 >> 0x20);
  fVar35 = (float)((ulonglong)uVar46 >> 0x20) + fVar49;
  fVar65 = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c);
  fVar66 = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c) >> 0x20);
  fVar65 = (float)(((uint)fVar65 ^ _DAT_7ff70cb1ba60) & -(uint)(fVar65 + fVar65 < fVar34 - fVar67));
  fVar66 = (float)(((uint)fVar66 ^ _UNK_7ff70cb1ba64) & -(uint)(fVar66 + fVar66 < fVar35 - fVar49));
  auVar64._0_4_ = fVar67 - fVar65;
  auVar64._4_4_ = fVar49 - fVar66;
  auVar64._8_8_ = 0;
  fVar65 = fVar65 + fVar34;
  fVar66 = fVar66 + fVar35;
  uVar25 = *(uint *)(param_2 + 0x14);
  if ((uVar25 & 0x10000000) == 0) {
    if ((uVar25 & 0x4000000) == 0) {
      if ((uVar25 & 0x2000000) == 0) {
        *param_1 = *(undefined8 *)(param_2 + 0x28);
        goto LAB_7ff70c83a8be;
      }
      fVar34 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd44);
      FUN_7ff70c84f430(auStack_d8);
      iVar24 = (int)param_3;
      fVar35 = auStack_d8._0_4_;
      fVar67 = auStack_d8._4_4_;
      if (*(int *)(lVar1 + 0xf8) == 1) {
        if ((*(int *)(lVar1 + 0x14b4) == 0) || (*(char *)(lVar1 + 0x14c6) != '\x01')) {
          uVar26 = 0;
          iVar24 = 0;
          cVar20 = *(char *)(lVar1 + 0x1f90);
          if (cVar20 != '\x01') goto LAB_7ff70c83a22e;
LAB_7ff70c83a538:
          iVar24 = (int)uVar26;
          if ((*(longlong *)(lVar1 + 0x1f98) != 0 & *(byte *)(lVar1 + 0x1f91)) == 0 &&
              (uVar26 & 1) == 0) goto LAB_7ff70c83a58c;
          uVar45 = CONCAT44(fVar34 * _UNK_7ff70cb1d914 + fVar67,fVar34 * _DAT_7ff70cb1d910 + fVar35)
          ;
          uVar46 = CONCAT44(_UNK_7ff70cb1d91c * 0.0 + 0.0,_UNK_7ff70cb1d918 * 0.0 + 0.0);
          goto LAB_7ff70c83a5fc;
        }
        uVar26 = CONCAT71((int7)((ulonglong)param_3 >> 8),
                          *(int *)(lVar1 + 0x14b4) == *(int *)(lVar1 + 0x1e20));
        iVar24 = (int)uVar26;
        cVar20 = *(char *)(lVar1 + 0x1f90);
        if (cVar20 == '\x01') goto LAB_7ff70c83a538;
LAB_7ff70c83a22e:
        if ((char)iVar24 == '\0') {
LAB_7ff70c83a58c:
          fVar49 = (float)*(undefined8 *)(param_2 + 0x30);
          fVar68 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x30) >> 0x20);
          auVar55._0_4_ = fVar35 + fVar34 * _DAT_7ff70cb1d920;
          auVar55._4_4_ = fVar67 + fVar34 * _UNK_7ff70cb1d924;
          auVar55._8_4_ = _UNK_7ff70cb1d928 * 0.0 + 0.0;
          auVar55._12_4_ = _UNK_7ff70cb1d92c * 0.0 + 0.0;
          auVar53._0_4_ = fVar35 - fVar34 * _DAT_7ff70cb1d920;
          auVar53._4_4_ = fVar67 - fVar34 * _UNK_7ff70cb1d924;
          auVar53._8_4_ = 0.0 - _UNK_7ff70cb1d928 * 0.0;
          auVar53._12_4_ = 0.0 - _UNK_7ff70cb1d92c * 0.0;
          auVar43 = blendps(auVar53,auVar55,0xd);
          fVar48 = auVar43._0_4_ + (float)_DAT_7ff70cb1d930 * fVar49;
          fVar54 = auVar43._4_4_ + (float)((ulonglong)_DAT_7ff70cb1d930 >> 0x20) * fVar68;
          *param_1 = CONCAT44(fVar54,fVar48);
          auVar41._4_4_ = -(uint)(fVar68 + fVar54 <= fVar66);
          auVar41._0_4_ = -(uint)(fVar49 + fVar48 <= fVar65);
          auVar41._8_4_ = -(uint)(auVar64._0_4_ <= fVar48);
          auVar41._12_4_ = -(uint)(auVar64._4_4_ <= fVar54);
          iVar24 = movmskps(iVar24,auVar41);
          if (iVar24 == 0xf) goto LAB_7ff70c83a8be;
          goto LAB_7ff70c83a5e1;
        }
        uVar45 = CONCAT44(fVar34 * _UNK_7ff70cb1d914 + fVar67,fVar34 * _DAT_7ff70cb1d910 + fVar35);
        uVar46 = CONCAT44(_UNK_7ff70cb1d91c * 0.0 + 0.0,_UNK_7ff70cb1d918 * 0.0 + 0.0);
LAB_7ff70c83a60f:
        fVar68 = fVar34 * _DAT_7ff70cb1d944;
        fVar49 = fVar34 * _DAT_7ff70cb1d944;
      }
      else {
        cVar20 = *(char *)(lVar1 + 0x1f90);
LAB_7ff70c83a5e1:
        uVar45 = CONCAT44(fVar34 * _UNK_7ff70cb1d914 + fVar67,fVar34 * _DAT_7ff70cb1d910 + fVar35);
        uVar46 = CONCAT44(_UNK_7ff70cb1d91c * 0.0 + 0.0,_UNK_7ff70cb1d918 * 0.0 + 0.0);
        if (cVar20 == '\0') goto LAB_7ff70c83a60f;
LAB_7ff70c83a5fc:
        if ((*(char *)(lVar1 + 0x1f91) != '\x01') ||
           (fVar68 = _DAT_7ff70cb1d940, fVar49 = _DAT_7ff70cb1d724,
           *(char *)(lVar1 + 0x52) == '\x01')) goto LAB_7ff70c83a60f;
      }
      uVar62 = 0;
      uVar61 = 0;
      uVar60 = 0;
      fVar48 = (float)((ulonglong)uVar45 >> 0x20);
      uVar47 = (undefined4)((ulonglong)uVar46 >> 0x20);
      fVar54 = (float)*(undefined8 *)(param_2 + 0x30);
      auVar42._0_4_ = fVar65 - fVar54;
      fVar63 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x30) >> 0x20);
      auVar42._4_4_ = fVar66 - fVar63;
      auVar42._8_8_ = 0;
      fVar34 = (float)uVar45;
      iVar32 = -(uint)(auVar42._0_4_ < fVar34);
      iVar33 = -(uint)(auVar42._4_4_ < fVar48);
      auVar57._4_4_ = iVar33;
      auVar57._0_4_ = iVar32;
      auVar57._8_4_ = iVar33;
      auVar57._12_4_ = iVar33;
      auVar56._8_8_ = auVar57._8_8_;
      auVar56._4_4_ = iVar32;
      auVar56._0_4_ = iVar32;
      uVar25 = movmskpd(iVar24,auVar56);
      if ((uVar25 & 2) == 0) {
        auVar58._4_4_ = fVar48;
        auVar58._0_4_ = fVar48;
        auVar58._8_4_ = uVar47;
        auVar58._12_4_ = uVar47;
      }
      else {
        auVar58._4_4_ = auVar42._4_4_;
        auVar58._0_4_ = auVar42._4_4_;
        auVar58._8_8_ = 0;
      }
      puVar27 = (uint *)(param_2 + 0xe8);
      auVar3._4_4_ = fVar48;
      auVar3._0_4_ = -(uint)(fVar48 < auVar64._4_4_);
      auVar3._8_4_ = uVar47;
      auVar3._12_4_ = uVar47;
      auVar17._4_4_ = auVar64._4_4_;
      auVar17._0_4_ = auVar64._4_4_;
      auVar17._8_8_ = 0;
      auVar59 = blendvps(auVar58,auVar17,auVar3);
      if ((uVar25 & 1) == 0) {
        auVar42._8_4_ = (int)uVar46;
        auVar42._0_8_ = uVar45;
        auVar42._12_4_ = uVar47;
      }
      fVar69 = _DAT_7ff70cb1d948 + fVar35;
      auVar4._4_4_ = fVar48;
      auVar4._0_4_ = -(uint)(fVar34 < auVar64._0_4_);
      auVar4._8_4_ = (int)uVar46;
      auVar4._12_4_ = uVar47;
      auVar43 = blendvps(auVar42,auVar64,auVar4);
      uVar25 = *(uint *)(param_2 + 0xe8);
      bVar28 = uVar25 != 0xffffffff;
      puVar23 = (uint *)&UNK_7ff70cb1ce30;
      if (bVar28) {
        puVar23 = puVar27;
      }
      uVar22 = *puVar23;
      bVar29 = uVar22 == 0;
      fVar75 = fVar69;
      if (!bVar29) {
        fVar75 = fVar65;
      }
      fVar49 = fVar49 + fVar35;
      fVar35 = fVar49;
      if (uVar22 != 1) {
        fVar35 = auVar64._0_4_;
      }
      fVar74 = _DAT_7ff70cb1d94c + fVar67;
      fVar68 = fVar68 + fVar67;
      if (fVar75 - fVar35 < fVar54 && uVar22 < 2) {
LAB_7ff70c83a74a:
        bVar31 = uVar25 == 0xffffffff;
        uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)bVar31 * 4);
        if (uVar22 != uVar25) {
          fVar35 = fVar49;
          if (uVar25 == 0xffffffff) {
            fVar35 = auVar64._0_4_;
          }
          if (uVar25 == 0xffffffff || fVar54 <= fVar65 - fVar35) {
            fVar35 = auVar64._4_4_;
            if (uVar25 == 0xffffffff) {
              fVar35 = fVar68;
            }
            if (fVar63 <= fVar66 - fVar35 || uVar25 != 0xffffffff) {
              bVar30 = false;
              bVar29 = false;
              bVar19 = bVar28;
              goto LAB_7ff70c83a963;
            }
          }
        }
        uVar22 = *(uint *)(&UNK_7ff70cb1ce34 + (ulonglong)(uVar25 == 0xffffffff) * 4);
        if (uVar22 == uVar25) {
LAB_7ff70c83a7f4:
          uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)(uVar25 != 0xffffffff ^ 3) * 4);
          if (uVar22 != uVar25) {
            if (uVar25 == 0xffffffff) {
              fVar65 = fVar69;
            }
            if (fVar54 <= fVar65 - auVar64._0_4_ || uVar25 != 0xffffffff) {
              bVar29 = uVar25 == 0xffffffff;
              fVar65 = fVar74;
              if (bVar29) {
                fVar65 = fVar66;
              }
              if (fVar63 <= fVar65 - auVar64._4_4_ || bVar29) {
                bVar30 = bVar28;
                bVar31 = false;
                goto LAB_7ff70c83a961;
              }
            }
          }
          if (((uVar25 == 0xffffffff) || (uVar25 == 0)) || (fVar69 - auVar64._0_4_ < fVar54)) {
            *puVar27 = 0xffffffff;
            *param_1 = CONCAT44(fVar48 + _UNK_7ff70cb1d684,fVar34 + _DAT_7ff70cb1d680);
            goto LAB_7ff70c83a8be;
          }
          uVar22 = 0;
          bVar29 = true;
          bVar30 = false;
          bVar31 = false;
        }
        else {
          bVar30 = uVar25 == 0xffffffff;
          fVar35 = fVar66;
          fVar67 = fVar68;
          if (bVar30) {
            fVar35 = fVar74;
            fVar67 = auVar64._4_4_;
          }
          if (fVar35 - fVar67 < fVar63) goto LAB_7ff70c83a7f4;
          bVar29 = false;
          bVar31 = bVar28;
        }
LAB_7ff70c83a961:
        bVar19 = false;
      }
      else {
        bVar30 = uVar22 == 2;
        fVar35 = fVar74;
        if (!bVar30) {
          fVar35 = fVar66;
        }
        bVar31 = uVar22 == 3;
        fVar67 = fVar68;
        if (!bVar31) {
          fVar67 = auVar64._4_4_;
        }
        bVar19 = uVar22 == 1;
        if (fVar35 - fVar67 < fVar63 && (uVar22 & 0xfffffffe) == 2) goto LAB_7ff70c83a74a;
      }
LAB_7ff70c83a963:
      if (bVar29) {
        auVar43 = ZEXT416((uint)(fVar69 - fVar54));
      }
      else if (bVar19) {
        auVar43 = ZEXT416((uint)fVar49);
      }
      else if (bVar30) {
        auVar59 = ZEXT416((uint)(fVar74 - fVar63));
      }
      else {
        if (!bVar31) {
          fVar68 = auVar59._0_4_;
          uVar60 = auVar59._4_4_;
          uVar61 = auVar59._8_4_;
          uVar62 = auVar59._12_4_;
        }
        auVar59._4_4_ = uVar60;
        auVar59._0_4_ = fVar68;
        auVar59._8_4_ = uVar61;
        auVar59._12_4_ = uVar62;
      }
      auVar43 = insertps(auVar43,auVar59,0x10);
      auVar5._4_4_ = -(uint)(auVar64._4_4_ <= auVar43._4_4_);
      auVar5._0_4_ = -(uint)(auVar64._0_4_ <= auVar43._0_4_);
      auVar5._8_4_ = -(uint)(0.0 <= auVar43._8_4_);
      auVar5._12_4_ = -(uint)(0.0 <= auVar43._12_4_);
      auVar64 = blendvps(auVar64,auVar43,auVar5);
      *param_1 = auVar64._0_8_;
      *puVar27 = uVar22;
      goto LAB_7ff70c83a8be;
    }
    uVar26 = *(ulonglong *)(param_2 + 0x28);
    fVar68 = (float)(uVar26 >> 0x20);
    uVar45 = CONCAT44(fVar68,fVar68);
    uVar47 = 0;
    fVar35 = (float)*(undefined8 *)(param_2 + 0x30);
    fVar67 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x30) >> 0x20);
    fVar34 = fVar66 - fVar67;
    fVar49 = (float)uVar26;
    iVar24 = -(uint)(fVar65 - fVar35 < fVar49);
    auVar6._4_4_ = iVar24;
    auVar6._0_4_ = iVar24;
    auVar6._8_4_ = -(uint)(fVar34 < fVar68);
    auVar6._12_4_ = -(uint)(fVar34 < fVar68);
    uVar25 = movmskpd((int)param_3,auVar6);
    if ((uVar25 & 2) == 0) {
      uVar44 = CONCAT44(fVar68,fVar68);
    }
    else {
      uVar44 = CONCAT44(fVar34,fVar34);
    }
    auVar50._8_8_ = 0;
    auVar50._0_8_ = uVar44;
    auVar7._4_4_ = fVar68;
    auVar7._0_4_ = -(uint)(fVar68 < auVar64._4_4_);
    auVar7._8_8_ = 0;
    auVar16._4_4_ = auVar64._4_4_;
    auVar16._0_4_ = auVar64._4_4_;
    auVar16._8_8_ = 0;
    auVar52 = blendvps(auVar50,auVar16,auVar7);
    uVar44 = CONCAT44(fVar34,fVar65 - fVar35);
    if ((uVar25 & 1) == 0) {
      uVar44 = uVar26;
    }
    auVar36._8_8_ = 0;
    auVar36._0_8_ = uVar44;
    auVar8._4_4_ = fVar68;
    auVar8._0_4_ = -(uint)(fVar49 < auVar64._0_4_);
    auVar8._8_8_ = 0;
    auVar39 = blendvps(auVar36,auVar64,auVar8);
    uVar25 = *(uint *)(param_2 + 0xe8);
    bVar28 = uVar25 != 0xffffffff;
    puVar27 = (uint *)&UNK_7ff70cb1ce30;
    if (bVar28) {
      puVar27 = (uint *)(param_2 + 0xe8);
    }
    uVar22 = *puVar27;
    bVar29 = uVar22 == 0;
    fVar34 = fVar49;
    if (!bVar29) {
      fVar34 = fVar65;
    }
    bVar30 = uVar22 == 1;
    fVar48 = fVar49;
    if (!bVar30) {
      fVar48 = auVar64._0_4_;
    }
    if (fVar34 - fVar48 < fVar35 && uVar22 < 2) {
LAB_7ff70c83a330:
      bVar31 = uVar25 == 0xffffffff;
      uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)bVar31 * 4);
      if (uVar22 != uVar25) {
        fVar34 = fVar49;
        if (uVar25 == 0xffffffff) {
          fVar34 = auVar64._0_4_;
        }
        if (uVar25 != 0xffffffff && fVar65 - fVar34 < fVar35) goto LAB_7ff70c83a3a6;
        fVar34 = auVar64._4_4_;
        if (uVar25 == 0xffffffff) {
          fVar34 = fVar68;
        }
        if (fVar66 - fVar34 < fVar67 && uVar25 == 0xffffffff) goto LAB_7ff70c83a3a6;
        bVar30 = bVar28;
        bVar28 = false;
        goto LAB_7ff70c83a475;
      }
LAB_7ff70c83a3a6:
      uVar22 = *(uint *)(&UNK_7ff70cb1ce34 + (ulonglong)(uVar25 == 0xffffffff) * 4);
      if (uVar22 != uVar25) {
        fVar34 = fVar66;
        fVar48 = fVar68;
        if (uVar25 == 0xffffffff) {
          fVar34 = fVar68;
          fVar48 = auVar64._4_4_;
        }
        if (fVar67 <= fVar34 - fVar48) {
          bVar29 = false;
          bVar30 = false;
          bVar19 = uVar25 == 0xffffffff;
          bVar31 = bVar28;
          goto LAB_7ff70c83a577;
        }
      }
      uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)(uVar25 != 0xffffffff ^ 3) * 4);
      if (uVar22 != uVar25) {
        fVar34 = fVar65;
        if (uVar25 == 0xffffffff) {
          fVar34 = fVar49;
        }
        if (fVar35 <= fVar34 - auVar64._0_4_ || uVar25 != 0xffffffff) {
          bVar29 = uVar25 == 0xffffffff;
          fVar34 = fVar68;
          if (bVar29) {
            fVar34 = fVar66;
          }
          if (fVar67 <= fVar34 - auVar64._4_4_ || bVar29) {
            bVar31 = false;
            bVar30 = false;
            if (bVar29) goto LAB_7ff70c83a580;
            goto LAB_7ff70c83a475;
          }
        }
      }
      if (((uVar25 != 0xffffffff) && (uVar25 != 0)) && (fVar35 <= fVar49 - auVar64._0_4_)) {
        uVar22 = 0;
        goto LAB_7ff70c83a580;
      }
      *(undefined4 *)(param_2 + 0xe8) = 0xffffffff;
      auVar40._0_4_ = (float)*(undefined8 *)(param_2 + 0x28) + fVar35;
      auVar40._4_4_ = (float)((ulonglong)*(undefined8 *)(param_2 + 0x28) >> 0x20) + fVar67;
      auVar40._8_8_ = 0;
      auVar14._4_4_ = fVar66;
      auVar14._0_4_ = fVar65;
      auVar14._8_8_ = 0;
      auVar43 = minps(auVar40,auVar14);
      auVar38._0_4_ = auVar43._0_4_ - fVar35;
      auVar38._4_4_ = auVar43._4_4_ - fVar67;
      auVar38._8_4_ = auVar43._8_4_ - 0.0;
      auVar38._12_4_ = auVar43._12_4_ - 0.0;
LAB_7ff70c83a4e0:
      auVar10._4_4_ = -(uint)(auVar64._4_4_ <= auVar38._4_4_);
      auVar10._0_4_ = -(uint)(auVar64._0_4_ <= auVar38._0_4_);
      auVar10._8_4_ = -(uint)(0.0 <= auVar38._8_4_);
      auVar10._12_4_ = -(uint)(0.0 <= auVar38._12_4_);
      auVar64 = blendvps(auVar64,auVar38,auVar10);
      *param_1 = auVar64._0_8_;
      goto LAB_7ff70c83a8be;
    }
    fVar34 = fVar68;
    if (uVar22 != 2) {
      fVar34 = fVar66;
    }
    fVar48 = fVar68;
    if (uVar22 != 3) {
      fVar48 = auVar64._4_4_;
    }
    bVar19 = uVar22 == 2;
    bVar31 = uVar22 == 3;
    if (fVar34 - fVar48 < fVar67 && (uVar22 & 0xfffffffe) == 2) goto LAB_7ff70c83a330;
LAB_7ff70c83a577:
    bVar28 = bVar19;
    if (bVar29) {
LAB_7ff70c83a580:
      auVar39._4_4_ = fVar68;
      auVar39._0_4_ = fVar49 - fVar35;
      auVar39._8_8_ = 0;
    }
    else {
LAB_7ff70c83a475:
      if (bVar30) {
        auVar39._8_8_ = 0;
        auVar39._0_8_ = uVar26;
      }
      else {
        if (bVar28) {
          uVar45 = CONCAT44(fVar68,fVar68 - fVar67);
          uVar47 = 0;
          uVar60 = 0;
        }
        else {
          uVar60 = 0;
          if (!bVar31) {
            uVar45 = auVar52._0_8_;
            uVar47 = auVar52._8_4_;
            uVar60 = auVar52._12_4_;
          }
        }
        auVar52._8_4_ = uVar47;
        auVar52._0_8_ = uVar45;
        auVar52._12_4_ = uVar60;
      }
    }
    auVar43 = insertps(auVar39,auVar52,0x10);
    auVar9._4_4_ = -(uint)(auVar64._4_4_ <= auVar43._4_4_);
    auVar9._0_4_ = -(uint)(auVar64._0_4_ <= auVar43._0_4_);
    auVar9._8_4_ = -(uint)(0.0 <= auVar43._8_4_);
    auVar9._12_4_ = -(uint)(0.0 <= auVar43._12_4_);
    auVar64 = blendvps(auVar64,auVar43,auVar9);
    uVar45 = auVar64._0_8_;
  }
  else {
    lVar1 = *(longlong *)
             (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418) + -0xf0 +
             (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) * 0x78);
    if (*(char *)(lVar1 + 0x17b) == '\x01') {
      fVar67 = _DAT_7ff70cb1c5d8;
      fVar34 = *(float *)(lVar1 + 0x26c);
      fVar49 = _DAT_7ff70cb1d570;
      fVar35 = *(float *)(lVar1 + 0x264);
    }
    else {
      fVar67 = ((*(float *)(lVar1 + 0x30) + *(float *)(lVar1 + 0x28)) -
               *(float *)(_DAT_7ff70cc1a3c0 + 0xca4)) - *(float *)(lVar1 + 0xc0);
      fVar49 = *(float *)(_DAT_7ff70cc1a3c0 + 0xca4) + *(float *)(lVar1 + 0x28);
      fVar34 = _DAT_7ff70cb1c5d8;
      fVar35 = _DAT_7ff70cb1d570;
    }
    uVar47 = 0;
    uVar60 = 0;
    uVar44 = (ulonglong)(uint)fVar34;
    uVar26 = *(ulonglong *)(param_2 + 0x28);
    fVar54 = (float)*(undefined8 *)(param_2 + 0x30);
    fVar63 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x30) >> 0x20);
    fVar48 = fVar66 - fVar63;
    fVar68 = (float)(uVar26 >> 0x20);
    iVar24 = -(uint)(fVar65 - fVar54 < (float)uVar26);
    iVar32 = -(uint)(fVar48 < fVar68);
    auVar43._4_4_ = iVar32;
    auVar43._0_4_ = iVar24;
    auVar43._8_4_ = iVar32;
    auVar43._12_4_ = iVar32;
    auVar71._8_8_ = auVar43._8_8_;
    auVar71._4_4_ = iVar24;
    auVar71._0_4_ = iVar24;
    uVar25 = movmskpd((int)*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418),auVar71);
    if ((uVar25 & 2) == 0) {
      uVar70 = CONCAT44(fVar68,fVar68);
    }
    else {
      uVar70 = CONCAT44(fVar48,fVar48);
    }
    auVar72._8_8_ = 0;
    auVar72._0_8_ = uVar70;
    auVar11._4_4_ = fVar68;
    auVar11._0_4_ = -(uint)(fVar68 < auVar64._4_4_);
    auVar11._8_8_ = 0;
    auVar18._4_4_ = auVar64._4_4_;
    auVar18._0_4_ = auVar64._4_4_;
    auVar18._8_8_ = 0;
    auVar73 = blendvps(auVar72,auVar18,auVar11);
    uVar70 = CONCAT44(fVar48,fVar65 - fVar54);
    if ((uVar25 & 1) == 0) {
      uVar70 = uVar26;
    }
    auVar51._8_8_ = 0;
    auVar51._0_8_ = uVar70;
    auVar12._4_4_ = fVar68;
    auVar12._0_4_ = -(uint)((float)uVar26 < auVar64._0_4_);
    auVar12._8_8_ = 0;
    auVar43 = blendvps(auVar51,auVar64,auVar12);
    uVar25 = *(uint *)(param_2 + 0xe8);
    bVar28 = uVar25 != 0xffffffff;
    puVar27 = (uint *)&UNK_7ff70cb1ce30;
    if (bVar28) {
      puVar27 = (uint *)(param_2 + 0xe8);
    }
    uVar22 = *puVar27;
    bVar29 = uVar22 == 0;
    fVar68 = fVar49;
    if (!bVar29) {
      fVar68 = fVar65;
    }
    bVar30 = uVar22 == 1;
    fVar48 = fVar67;
    if (!bVar30) {
      fVar48 = auVar64._0_4_;
    }
    if (fVar68 - fVar48 < fVar54 && uVar22 < 2) {
LAB_7ff70c83a05a:
      bVar31 = uVar25 == 0xffffffff;
      uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)bVar31 * 4);
      if (uVar22 != uVar25) {
        fVar68 = fVar67;
        if (uVar25 == 0xffffffff) {
          fVar68 = auVar64._0_4_;
        }
        if (uVar25 != 0xffffffff && fVar65 - fVar68 < fVar54) goto LAB_7ff70c83a0d0;
        fVar68 = auVar64._4_4_;
        if (uVar25 == 0xffffffff) {
          fVar68 = fVar34;
        }
        if (fVar66 - fVar68 < fVar63 && uVar25 == 0xffffffff) goto LAB_7ff70c83a0d0;
        bVar30 = bVar28;
        bVar28 = false;
        goto LAB_7ff70c83a19d;
      }
LAB_7ff70c83a0d0:
      uVar22 = *(uint *)(&UNK_7ff70cb1ce34 + (ulonglong)(uVar25 == 0xffffffff) * 4);
      if (uVar22 != uVar25) {
        fVar68 = fVar66;
        if (uVar25 == 0xffffffff) {
          fVar68 = fVar35;
          fVar34 = auVar64._4_4_;
        }
        if (fVar63 <= fVar68 - fVar34) {
          bVar29 = false;
          bVar30 = false;
          bVar19 = uVar25 == 0xffffffff;
          bVar31 = bVar28;
          goto LAB_7ff70c83a49f;
        }
      }
      uVar22 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)(uVar25 != 0xffffffff ^ 3) * 4);
      if (uVar22 != uVar25) {
        fVar34 = fVar65;
        if (uVar25 == 0xffffffff) {
          fVar34 = fVar49;
        }
        if (fVar54 <= fVar34 - auVar64._0_4_ || uVar25 != 0xffffffff) {
          bVar29 = uVar25 == 0xffffffff;
          fVar34 = fVar35;
          if (bVar29) {
            fVar34 = fVar66;
          }
          if (fVar63 <= fVar34 - auVar64._4_4_ || bVar29) {
            bVar31 = false;
            bVar30 = false;
            if (bVar29) goto LAB_7ff70c83a4a8;
            goto LAB_7ff70c83a19d;
          }
        }
      }
      if (((uVar25 == 0xffffffff) || (uVar25 == 0)) || (fVar49 - auVar64._0_4_ < fVar54)) {
        *(undefined4 *)(param_2 + 0xe8) = 0xffffffff;
        auVar37._0_4_ = (float)*(undefined8 *)(param_2 + 0x28) + fVar54;
        auVar37._4_4_ = (float)((ulonglong)*(undefined8 *)(param_2 + 0x28) >> 0x20) + fVar63;
        auVar37._8_8_ = 0;
        auVar15._4_4_ = fVar66;
        auVar15._0_4_ = fVar65;
        auVar15._8_8_ = 0;
        auVar43 = minps(auVar37,auVar15);
        auVar38._0_4_ = auVar43._0_4_ - fVar54;
        auVar38._4_4_ = auVar43._4_4_ - fVar63;
        auVar38._8_4_ = auVar43._8_4_ - 0.0;
        auVar38._12_4_ = auVar43._12_4_ - 0.0;
        goto LAB_7ff70c83a4e0;
      }
      uVar22 = 0;
LAB_7ff70c83a4a8:
      auVar43 = ZEXT416((uint)(fVar49 - fVar54));
    }
    else {
      fVar68 = fVar35;
      if (uVar22 != 2) {
        fVar68 = fVar66;
      }
      fVar48 = fVar34;
      if (uVar22 != 3) {
        fVar48 = auVar64._4_4_;
      }
      bVar19 = uVar22 == 2;
      bVar31 = uVar22 == 3;
      if (fVar68 - fVar48 < fVar63 && (uVar22 & 0xfffffffe) == 2) goto LAB_7ff70c83a05a;
LAB_7ff70c83a49f:
      bVar28 = bVar19;
      if (bVar29) goto LAB_7ff70c83a4a8;
LAB_7ff70c83a19d:
      if (bVar30) {
        auVar43 = ZEXT416((uint)fVar67);
      }
      else if (bVar28) {
        auVar73 = ZEXT416((uint)(fVar35 - fVar63));
      }
      else {
        if (!bVar31) {
          uVar44 = auVar73._0_8_;
          uVar47 = auVar73._8_4_;
          uVar60 = auVar73._12_4_;
        }
        auVar73._8_4_ = uVar47;
        auVar73._0_8_ = uVar44;
        auVar73._12_4_ = uVar60;
      }
    }
    auVar43 = insertps(auVar43,auVar73,0x10);
    auVar13._4_4_ = -(uint)(auVar64._4_4_ <= auVar43._4_4_);
    auVar13._0_4_ = -(uint)(auVar64._0_4_ <= auVar43._0_4_);
    auVar13._8_4_ = -(uint)(0.0 <= auVar43._8_4_);
    auVar13._12_4_ = -(uint)(0.0 <= auVar43._12_4_);
    auVar64 = blendvps(auVar64,auVar43,auVar13);
    uVar45 = auVar64._0_8_;
  }
  *param_1 = uVar45;
  *(uint *)(param_2 + 0xe8) = uVar22;
LAB_7ff70c83a8be:
  if (_DAT_7ff70cbebd80 != (uStack_d0 ^ (ulonglong)auStack_f8)) {
    FUN_7ff70caa97e0(uStack_d0 ^ (ulonglong)auStack_f8);
    pcVar2 = (code *)swi(3);
    puVar21 = (undefined8 *)(*pcVar2)();
    return puVar21;
  }
  return param_1;
}


