/* 7ff70c81c690 FUN_7ff70c81c690 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c81c690(void)

{
  int *piVar1;
  short *psVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  code *pcVar5;
  uint uVar6;
  undefined2 uVar7;
  uint uVar8;
  int iVar9;
  int iVar10;
  ulonglong uVar11;
  undefined8 uVar12;
  longlong lVar13;
  longlong *plVar14;
  float *pfVar15;
  char *pcVar16;
  byte bVar17;
  short sVar18;
  uint uVar19;
  longlong *plVar20;
  char cVar21;
  int iVar22;
  uint uVar23;
  longlong lVar24;
  longlong lVar25;
  ulonglong *puVar26;
  longlong lVar27;
  ulonglong uVar28;
  undefined *puVar29;
  longlong lVar30;
  ulonglong uVar31;
  ulonglong uVar32;
  int iVar33;
  bool bVar34;
  float fVar35;
  float fVar36;
  float fVar46;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  float fVar47;
  undefined1 auVar40 [16];
  undefined4 uVar48;
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  float fVar59;
  undefined1 in_XMM3 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  float fVar60;
  undefined1 auVar61 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  ulonglong uStack_f0;
  undefined1 auStack_e8 [32];
  undefined *puStack_c8;
  longlong lStack_b8;
  undefined8 uStack_b0;
  ulonglong uStack_90;
  ulonglong uStack_88;
  undefined8 uStack_80;
  undefined8 extraout_XMM0_Qb;
  undefined1 auVar62 [16];
  
  uVar32 = _DAT_7ff70cc1a3c0;
  uStack_80 = 0xfffffffffffffffe;
  iVar9 = *(int *)(_DAT_7ff70cc1a3c0 + 0x26b8);
  uVar11 = (ulonglong)iVar9;
  if (0 < (longlong)uVar11) {
    lVar27 = -uVar11;
    uVar28 = uVar11 + 1;
    lVar25 = uVar11 << 5;
    do {
      lVar25 = lVar25 + -0x20;
      lVar24 = *(longlong *)(uVar32 + 0x26c0);
      if (*(int *)(lVar24 + 4 + lVar25) == 7) {
        uStack_f0 = 0x7ff70c81c729;
        FUN_7ff70cb12b70(lVar24 + lVar25,lVar24 + lVar25 + 0x20,((int)uVar11 + lVar27) * 0x20);
        uVar8 = *(int *)(uVar32 + 0x26b8) - 1;
        uVar11 = (ulonglong)uVar8;
        *(uint *)(uVar32 + 0x26b8) = uVar8;
      }
      iVar9 = (int)uVar11;
      lVar27 = lVar27 + 1;
      uVar28 = uVar28 - 1;
    } while (1 < uVar28);
  }
  if (iVar9 != 0) {
    lVar25 = *(longlong *)(uVar32 + 0x26c0);
    lVar27 = (longlong)iVar9 << 5;
    do {
      if (*(int *)(lVar25 + 4) == 0) {
        uStack_f0 = 0x7ff70c81c779;
        (**(code **)(lVar25 + 0x10))(uVar32,lVar25);
      }
      lVar25 = lVar25 + 0x20;
      lVar27 = lVar27 + -0x20;
    } while (lVar27 != 0);
  }
  uVar11 = _DAT_7ff70cc1a3c0;
  uVar8 = *(uint *)(_DAT_7ff70cc1a3c0 + 8);
  if ((uVar8 & 4) == 0) {
    uVar19 = uVar8;
    if ((uVar8 & 8) != 0) goto LAB_7ff70c81c7a7;
LAB_7ff70c81c78d:
    lVar25 = *(longlong *)(uVar11 + 0xbc8);
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x52) = 1;
    uVar19 = uVar8 & 0xfffffffb;
    *(uint *)(uVar11 + 8) = uVar19;
    if ((uVar8 & 8) == 0) goto LAB_7ff70c81c78d;
LAB_7ff70c81c7a7:
    *(undefined1 *)(uVar11 + 0x53) = 0;
    *(uint *)(uVar11 + 8) = uVar19 & 0xfffffff7;
    lVar25 = *(longlong *)(uVar11 + 0xbc8);
  }
  if ((lVar25 != 0) &&
     ((*(undefined **)(uVar11 + 0xbe0) == (undefined *)0x0 ||
      (*(undefined **)(uVar11 + 0xbe0) == &UNK_7ff70c814640)))) {
    *(undefined **)(uVar11 + 0xbe0) = &UNK_7ff70c870f90;
  }
  if ((*(longlong *)(uVar11 + 0xbd0) != 0) &&
     ((*(undefined **)(uVar11 + 0xbe8) == (undefined *)0x0 ||
      (*(undefined **)(uVar11 + 0xbe8) == &UNK_7ff70c8149f0)))) {
    *(undefined **)(uVar11 + 0xbe8) = &UNK_7ff70c870fe0;
  }
  if (*(char *)(uVar11 + 0x2670) == '\0') {
    if (*(longlong *)(uVar11 + 0x28) != 0) {
      lStack_b8 = 0;
      uStack_f0 = 0x7ff70c81c846;
      lVar25 = FUN_7ff70c803470(*(longlong *)(uVar11 + 0x28),&UNK_7ff70cb89228,&lStack_b8,0);
      if (lVar25 != 0) {
        if (lStack_b8 != 0) {
          uStack_f0 = 0x7ff70c81c863;
          FUN_7ff70c858720(lVar25);
        }
        uVar28 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
          }
          else {
            iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
            lVar27 = (longlong)iVar9;
            *(int *)(uVar28 + 0x2874 + lVar27 * 8) = *piVar1;
            *(undefined4 *)(uVar28 + 0x2878 + lVar27 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(uVar28 + 0x287a + lVar27 * 8) = sVar18;
          *(int *)(uVar28 + 0x286c) = *(int *)(uVar28 + 0x286c) + 1;
        }
        uStack_f0 = 0x7ff70c81c8fc;
        (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
      }
    }
    *(undefined1 *)(uVar11 + 0x2670) = 1;
  }
  if ((0.0 < *(float *)(uVar11 + 0x2674)) &&
     (fVar35 = *(float *)(uVar11 + 0x2674) - *(float *)(uVar11 + 0x20),
     *(float *)(uVar11 + 0x2674) = fVar35, fVar35 <= 0.0)) {
    if (*(longlong *)(uVar11 + 0x28) == 0) {
      *(undefined1 *)(uVar11 + 0xb4) = 1;
    }
    else {
      uStack_f0 = 0x7ff70c81c933;
      FUN_7ff70c815110();
    }
    *(undefined4 *)(uVar11 + 0x2674) = 0;
  }
  fVar35 = *(float *)(uVar32 + 0x20);
  *(double *)(uVar32 + 0x1380) = (double)fVar35 + *(double *)(uVar32 + 0x1380);
  *(int *)(uVar32 + 5000) = *(int *)(uVar32 + 5000) + 1;
  *(undefined2 *)(uVar32 + 0x25a2) = 0;
  *(undefined4 *)(uVar32 + 0x1430) = 0;
  if (*(int *)(uVar32 + 0x25c4) < 0) {
    uStack_f0 = 0x7ff70c81c9a5;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar11 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar11 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar11 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar11 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar11 + 0x2868) = *(int *)(uVar11 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar32 + 0x25c8) != 0) {
      uStack_f0 = 0x7ff70c81ca55;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar32 + 0x25c8),
                       (longlong)*(int *)(uVar32 + 0x25c0) << 2);
      uVar11 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar32 + 0x25c8);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar11 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar11 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar11 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81cb07;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar32 + 0x25c8) = uVar12;
    *(undefined4 *)(uVar32 + 0x25c4) = 0;
    fVar35 = *(float *)(uVar32 + 0x20);
  }
  *(undefined4 *)(uVar32 + 0x25c0) = 0;
  *(float *)(uVar32 + 0x299c) =
       (fVar35 - *(float *)(uVar32 + 0x28a4 + (longlong)*(int *)(uVar32 + 0x2994) * 4)) +
       *(float *)(uVar32 + 0x299c);
  *(float *)(uVar32 + 0x28a4 + (longlong)*(int *)(uVar32 + 0x2994) * 4) = fVar35;
  iVar9 = *(int *)(uVar32 + 0x2994);
  iVar22 = (int)((ulonglong)((longlong)(iVar9 + 1) * -0x77777777) >> 0x20) + iVar9 + 1;
  *(int *)(uVar32 + 0x2994) = iVar9 + ((iVar22 >> 5) - (iVar22 >> 0x1f)) * -0x3c + 1;
  iVar9 = 0x3b;
  if (*(int *)(uVar32 + 0x2998) < 0x3b) {
    iVar9 = *(int *)(uVar32 + 0x2998);
  }
  *(int *)(uVar32 + 0x2998) = iVar9 + 1;
  if (*(float *)(uVar32 + 0x299c) <= 0.0) {
    *(float *)(uVar32 + 0xb8) = _DAT_7ff70cb1c5d8;
    iVar9 = *(int *)(uVar32 + 0x13cc);
  }
  else {
    *(float *)(uVar32 + 0xb8) =
         _DAT_7ff70cb1ba2c / (*(float *)(uVar32 + 0x299c) / (float)(iVar9 + 1));
    iVar9 = *(int *)(uVar32 + 0x13cc);
  }
  if (iVar9 < 0) {
    uStack_f0 = 0x7ff70c81cc2e;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar11 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar11 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar11 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar11 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar11 + 0x2868) = *(int *)(uVar11 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar32 + 0x13d0) != 0) {
      uStack_f0 = 0x7ff70c81cce5;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar32 + 0x13d0),
                       (longlong)*(int *)(uVar32 + 0x13c8) * 0x1c);
      uVar11 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar32 + 0x13d0);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar11 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar11 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar11 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81cd97;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar32 + 0x13d0) = uVar12;
    *(undefined4 *)(uVar32 + 0x13cc) = 0;
  }
  *(undefined4 *)(uVar32 + 0x13c8) = 0;
  uStack_f0 = 0x7ff70c81cdc2;
  FUN_7ff70c820ef0(*(undefined1 *)(uVar32 + 0x5a));
  uVar11 = _DAT_7ff70cc1a3c0;
  lVar25 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
  *(undefined8 *)(lVar25 + 4) = 5;
  *(undefined4 *)(lVar25 + 0xc) = 0;
  *(undefined8 *)(lVar25 + 0x10) = *(undefined8 *)(uVar11 + 0x10);
  *(undefined8 *)(lVar25 + 0x18) = *(undefined8 *)(uVar11 + 0x18);
  iVar9 = *(int *)(uVar11 + 0x1f80);
  if ((longlong)iVar9 != 0) {
    lVar25 = *(longlong *)(uVar11 + 0x1f88);
    lVar27 = 0;
    auVar37._0_12_ = ZEXT812(0);
    auVar37._12_4_ = 0;
    do {
      lVar24 = *(longlong *)(lVar25 + lVar27);
      uVar12 = *(undefined8 *)(lVar24 + 0xd0);
      *(undefined8 *)(lVar24 + 0xc0) = uVar12;
      uVar4 = *(undefined8 *)(lVar24 + 0xd8);
      *(undefined8 *)(lVar24 + 200) = uVar4;
      *(undefined1 (*) [16])(lVar24 + 0xd0) = auVar37;
      fVar35 = (float)((ulonglong)uVar12 >> 0x20);
      in_XMM3._0_4_ = ((float)*(undefined8 *)(lVar24 + 0x10) - (float)uVar12) - (float)uVar4;
      in_XMM3._4_4_ =
           ((float)((ulonglong)*(undefined8 *)(lVar24 + 0x10) >> 0x20) - fVar35) -
           (float)((ulonglong)uVar4 >> 0x20);
      in_XMM3._8_8_ = 0;
      *(ulonglong *)(lVar24 + 0x20) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar24 + 8) >> 0x20) + fVar35,
                    (float)*(undefined8 *)(lVar24 + 8) + (float)uVar12);
      *(ulonglong *)(lVar24 + 0x28) =
           CONCAT44(-(uint)(0.0 < in_XMM3._4_4_) & (uint)in_XMM3._4_4_,
                    -(uint)(0.0 < in_XMM3._0_4_) & (uint)in_XMM3._0_4_);
      lVar27 = lVar27 + 8;
    } while ((longlong)iVar9 * 8 != lVar27);
  }
  uVar11 = _DAT_7ff70cc1a3c0;
  iVar9 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1110);
  if ((longlong)iVar9 != 0) {
    uVar8 = *(uint *)(_DAT_7ff70cc1a3c0 + 0xc);
    lVar25 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1118);
    lVar27 = 0;
    do {
      lVar24 = *(longlong *)(lVar25 + lVar27);
      if (*(ulonglong *)(lVar24 + 0x2d8) == uVar11) {
        uStack_f0 = 0x7ff70c81cec4;
        FUN_7ff70c7c93a0(lVar24,*(undefined4 *)(uVar11 + 5000),(uVar8 & 0x10) >> 4);
      }
      lVar27 = lVar27 + 8;
    } while ((longlong)iVar9 * 8 != lVar27);
  }
  uVar11 = _DAT_7ff70cc1a3c0;
  lVar25 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f80);
  auVar37 = _DAT_7ff70cb1d750;
  if (lVar25 != 0) {
    plVar20 = *(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
    uVar28 = lVar25 * 8 - 8;
    plVar14 = plVar20;
    if ((uVar28 & 8) == 0) {
      uVar12 = *(undefined8 *)(*plVar20 + 8);
      uVar4 = *(undefined8 *)(*plVar20 + 0x10);
      fVar36 = (float)uVar12;
      fVar35 = (float)uVar4 + fVar36;
      fVar47 = (float)((ulonglong)uVar12 >> 0x20);
      fVar46 = (float)((ulonglong)uVar4 >> 0x20) + fVar47;
      auVar51._12_4_ = fVar46;
      auVar51._8_4_ = fVar35;
      auVar51._0_8_ = uVar12;
      in_XMM3._4_4_ = (float)-(uint)(fVar47 < DAT_7ff70cb1d750._4_4_);
      in_XMM3._0_4_ = (float)-(uint)(fVar36 < (float)DAT_7ff70cb1d750);
      in_XMM3._8_4_ = -(uint)(fVar35 < DAT_7ff70cb1d750._8_4_);
      in_XMM3._12_4_ = -(uint)(fVar46 < DAT_7ff70cb1d750._12_4_);
      auVar66._4_4_ = -(uint)(DAT_7ff70cb1d750._4_4_ < fVar47);
      auVar66._0_4_ = -(uint)((float)DAT_7ff70cb1d750 < fVar36);
      auVar66._8_4_ = -(uint)(DAT_7ff70cb1d750._8_4_ < fVar35);
      auVar66._12_4_ = -(uint)(DAT_7ff70cb1d750._12_4_ < fVar46);
      auVar37 = blendps(auVar66,in_XMM3,3);
      auVar37 = blendvps(_DAT_7ff70cb1d750,auVar51,auVar37);
      plVar14 = plVar20 + 1;
    }
    if (uVar28 != 0) {
      do {
        uVar12 = *(undefined8 *)(*plVar14 + 8);
        uVar4 = *(undefined8 *)(*plVar14 + 0x10);
        fVar36 = (float)uVar12;
        fVar35 = (float)uVar4 + fVar36;
        fVar47 = (float)((ulonglong)uVar12 >> 0x20);
        fVar46 = (float)((ulonglong)uVar4 >> 0x20) + fVar47;
        auVar52._12_4_ = fVar46;
        auVar52._8_4_ = fVar35;
        auVar52._0_8_ = uVar12;
        auVar56._4_4_ = -(uint)(fVar47 < auVar37._4_4_);
        auVar56._0_4_ = -(uint)(fVar36 < auVar37._0_4_);
        auVar56._8_4_ = -(uint)(fVar35 < auVar37._8_4_);
        auVar56._12_4_ = -(uint)(fVar46 < auVar37._12_4_);
        auVar58._4_4_ = -(uint)(auVar37._4_4_ < fVar47);
        auVar58._0_4_ = -(uint)(auVar37._0_4_ < fVar36);
        auVar58._8_4_ = -(uint)(auVar37._8_4_ < fVar35);
        auVar58._12_4_ = -(uint)(auVar37._12_4_ < fVar46);
        auVar66 = blendps(auVar58,auVar56,3);
        auVar66 = blendvps(auVar37,auVar52,auVar66);
        uVar12 = *(undefined8 *)(plVar14[1] + 8);
        uVar4 = *(undefined8 *)(plVar14[1] + 0x10);
        fVar36 = (float)uVar12;
        fVar35 = (float)uVar4 + fVar36;
        fVar47 = (float)((ulonglong)uVar12 >> 0x20);
        fVar46 = (float)((ulonglong)uVar4 >> 0x20) + fVar47;
        auVar53._12_4_ = fVar46;
        auVar53._8_4_ = fVar35;
        auVar53._0_8_ = uVar12;
        in_XMM3._4_4_ = (float)-(uint)(fVar47 < auVar66._4_4_);
        in_XMM3._0_4_ = (float)-(uint)(fVar36 < auVar66._0_4_);
        in_XMM3._8_4_ = -(uint)(fVar35 < auVar66._8_4_);
        in_XMM3._12_4_ = -(uint)(fVar46 < auVar66._12_4_);
        auVar38._4_4_ = -(uint)(auVar66._4_4_ < fVar47);
        auVar38._0_4_ = -(uint)(auVar66._0_4_ < fVar36);
        auVar38._8_4_ = -(uint)(auVar66._8_4_ < fVar35);
        auVar38._12_4_ = -(uint)(auVar66._12_4_ < fVar46);
        auVar37 = blendps(auVar38,in_XMM3,3);
        auVar37 = blendvps(auVar66,auVar53,auVar37);
        plVar14 = plVar14 + 2;
      } while (plVar14 != plVar20 + lVar25);
    }
  }
  lVar25 = _DAT_7ff70cc1a3c0 + 0x1148;
  *(undefined1 (*) [16])(_DAT_7ff70cc1a3c0 + 0x1180) = auVar37;
  *(undefined4 *)(uVar11 + 0x1170) = *(undefined4 *)(uVar11 + 0xd4c);
  uStack_f0 = 0x7ff70c81cfdf;
  FUN_7ff70c7b5660(lVar25);
  bVar17 = *(byte *)(uVar11 + 0xd48);
  uVar8 = (uint)bVar17;
  *(uint *)(uVar11 + 0x117c) = (uint)bVar17;
  if ((*(char *)(uVar11 + 0xd49) != '\0') && ((**(byte **)(uVar11 + 0x40) & 4) == 0)) {
    uVar8 = bVar17 | 2;
    *(uint *)(uVar11 + 0x117c) = uVar8;
  }
  if (*(char *)(uVar11 + 0xd4a) == '\x01') {
    uVar8 = uVar8 | 4;
    *(uint *)(uVar11 + 0x117c) = uVar8;
    if ((*(byte *)(uVar11 + 0xc) & 8) == 0) goto LAB_7ff70c81d04b;
LAB_7ff70c81d01f:
    *(uint *)(uVar11 + 0x117c) = uVar8 | 8;
    *(undefined4 *)(uVar11 + 0x1178) = 0x3f800000;
    bVar17 = *(byte *)(_DAT_7ff70cc1a3c0 + 0xc);
    uVar11 = _DAT_7ff70cc1a3c0;
  }
  else {
    if ((*(byte *)(uVar11 + 0xc) & 8) != 0) goto LAB_7ff70c81d01f;
LAB_7ff70c81d04b:
    *(undefined4 *)(uVar11 + 0x1178) = 0x3f800000;
    bVar17 = *(byte *)(_DAT_7ff70cc1a3c0 + 0xc);
    uVar11 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = uVar11;
  if (((bVar17 & 0x10) == 0) && (lVar25 = (longlong)*(int *)(uVar11 + 0x1110), lVar25 != 0)) {
    plVar20 = *(longlong **)(uVar11 + 0x1118);
    uVar28 = lVar25 * 8 - 8;
    plVar14 = plVar20;
    if ((~(uint)uVar28 & 0x38) != 0) {
      uVar31 = (ulonglong)(((uint)(uVar28 >> 3) & 0x1fffffff) + 1 & 7);
      do {
        *(undefined1 *)(*plVar14 + 0x50) = 1;
        plVar14 = plVar14 + 1;
        uVar31 = uVar31 - 1;
      } while (uVar31 != 0);
    }
    if (0x37 < uVar28) {
      do {
        *(undefined1 *)(*plVar14 + 0x50) = 1;
        *(undefined1 *)(plVar14[1] + 0x50) = 1;
        *(undefined1 *)(plVar14[2] + 0x50) = 1;
        *(undefined1 *)(plVar14[3] + 0x50) = 1;
        *(undefined1 *)(plVar14[4] + 0x50) = 1;
        *(undefined1 *)(plVar14[5] + 0x50) = 1;
        *(undefined1 *)(plVar14[6] + 0x50) = 1;
        *(undefined1 *)(plVar14[7] + 0x50) = 1;
        plVar14 = plVar14 + 8;
      } while (plVar14 != plVar20 + lVar25);
    }
  }
  fVar35 = *(float *)(uVar11 + 0x110c);
  if ((fVar35 != 0.0) || (NAN(fVar35))) {
    *(float *)(uVar11 + 0xc40) = fVar35;
    *(undefined4 *)(uVar11 + 0x110c) = 0;
  }
  lVar25 = *(longlong *)(uVar11 + 0x40);
  if ((*(longlong *)(lVar25 + 0x2b0) == 0) || (*(int *)(lVar25 + 0x68) == 0)) {
    uStack_f0 = 0x7ff70c81d2d1;
    FUN_7ff70c7c9780(lVar25);
    lVar27 = *(longlong *)(uVar11 + 0x48);
    if (lVar27 != 0) goto LAB_7ff70c81d165;
LAB_7ff70c81d2de:
    lVar27 = **(longlong **)(lVar25 + 0x70);
    fVar35 = *(float *)(uVar11 + 0xc40);
  }
  else {
    lVar27 = *(longlong *)(uVar11 + 0x48);
    if (lVar27 == 0) goto LAB_7ff70c81d2de;
LAB_7ff70c81d165:
    fVar35 = *(float *)(uVar11 + 0xc40);
  }
  if (fVar35 <= 0.0) {
    auVar39._4_12_ = SUB1612(ZEXT816(0),4);
    auVar39._0_4_ = -(uint)(0.0 < *(float *)(lVar27 + 0x1c));
    auVar37 = blendvps(_DAT_7ff70cb1d760,ZEXT416((uint)*(float *)(lVar27 + 0x1c)),auVar39);
    fVar35 = auVar37._0_4_;
    *(float *)(uVar11 + 0xc40) = fVar35;
  }
  *(longlong *)(uVar11 + 0x1120) = lVar27;
  *(float *)(uVar11 + 0x1134) = fVar35;
  *(undefined4 *)(uVar11 + 0x1130) = 0;
  uVar28 = _DAT_7ff70cc1a3c0;
  *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1120) = lVar27;
  *(float *)(uVar28 + 0x1134) = fVar35;
  lVar25 = *(longlong *)(uVar28 + 0x1440);
  *(float *)(uVar28 + 0xc40) = fVar35;
  if (lVar25 == 0) {
    fVar46 = *(float *)(uVar28 + 0xc44) * fVar35 * *(float *)(uVar28 + 0xc48) *
             *(float *)(uVar28 + 0xbc0);
joined_r0x7ff70c81d3cd:
    if (lVar27 != 0) {
      fVar46 = fVar46 * *(float *)(lVar27 + 0x48);
    }
    if ((int)(fVar46 + _DAT_7ff70cb1ba70) < 1) {
      fVar46 = _DAT_7ff70cb1ba2c;
      if (lVar27 != 0) goto LAB_7ff70c81d25d;
LAB_7ff70c81d30f:
      *(float *)(uVar28 + 0x1130) = fVar46;
      *(undefined8 *)(uVar28 + 0x1128) = 0;
      fVar36 = 0.0;
    }
    else {
      fVar36 = (float)(int)(fVar46 + _DAT_7ff70cb1ba70);
      fVar46 = _DAT_7ff70cb1d620;
      if (fVar36 <= _DAT_7ff70cb1d620) {
        fVar46 = fVar36;
      }
      if (lVar27 == 0) goto LAB_7ff70c81d30f;
LAB_7ff70c81d25d:
      lVar24 = lVar27;
      if ((*(byte *)(uVar28 + 0xc) & 0x10) != 0) {
        *(undefined4 *)(lVar27 + 0x14) = *(undefined4 *)(uVar28 + 0x113c);
        lVar24 = *(longlong *)(uVar28 + 0x1120);
      }
      lVar13 = 0;
      *(float *)(uVar28 + 0x1130) = fVar46;
      if ((lVar25 != 0) && (lVar24 != 0)) {
        uStack_f0 = 0x7ff70c81d29c;
        lVar13 = FUN_7ff70c7e5630();
        lVar24 = *(longlong *)(uVar28 + 0x1120);
        fVar46 = *(float *)(uVar28 + 0x1130);
      }
      *(longlong *)(uVar28 + 0x1128) = lVar13;
      fVar36 = 0.0;
      if ((lVar25 != 0) && (lVar24 != 0)) {
        fVar36 = fVar46 / *(float *)(lVar13 + 0x14);
      }
    }
    *(float *)(uVar28 + 0x1138) = fVar36;
    *(float *)(uVar28 + 0x1168) = fVar46;
    *(float *)(uVar28 + 0x116c) = fVar36;
  }
  else if ((*(char *)(lVar25 + 0xd1) != '\x01') ||
          ((*(longlong *)(uVar28 + 0x2278) != 0 &&
           (*(int *)(*(longlong *)(uVar28 + 0x2278) + 0x74) == -1)))) {
    fVar46 = *(float *)(uVar28 + 0xc44) * fVar35 * *(float *)(uVar28 + 0xc48) *
             *(float *)(lVar25 + 0x2b8) * *(float *)(uVar28 + 0xbc0);
    goto joined_r0x7ff70c81d3cd;
  }
  if (lVar27 != 0) {
    lVar25 = *(longlong *)(lVar27 + 8);
    *(longlong *)(uVar28 + 0x1158) = lVar25;
    *(longlong *)(uVar28 + 0x1160) = lVar27;
    uStack_f0 = 0x7ff70c81d35c;
    FUN_7ff70c7e96c0(lVar25);
    if (*(longlong *)(uVar28 + 0x1440) != 0) {
      lStack_b8 = *(longlong *)(lVar25 + 0x28);
      uStack_b0 = *(undefined8 *)(lVar25 + 0x30);
      uStack_f0 = 0x7ff70c81d380;
      FUN_7ff70c7b8700(*(undefined8 *)(*(longlong *)(uVar28 + 0x1440) + 0x2c8),&lStack_b8);
    }
  }
  iVar9 = *(int *)(uVar11 + 0x1f10);
  if (iVar9 == *(int *)(uVar11 + 0x1f14)) {
    if (iVar9 == 0) {
      iVar22 = 8;
    }
    else {
      iVar22 = iVar9 / 2 + iVar9;
    }
    iVar10 = iVar9 + 1;
    if (iVar9 + 1 < iVar22) {
      iVar10 = iVar22;
    }
    uStack_f0 = 0x7ff70c81d3f6;
    lVar25 = (*_DAT_7ff70cbe9460)((longlong)iVar10 << 4,_DAT_7ff70cc1a3d0);
    uVar28 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar24 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar24 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar24 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar24 = (longlong)iVar9;
        *(int *)(uVar28 + 0x2874 + lVar24 * 8) = *piVar1;
        *(undefined4 *)(uVar28 + 0x2878 + lVar24 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar28 + 0x2878 + lVar24 * 8) = sVar18;
      *(int *)(uVar28 + 0x2868) = *(int *)(uVar28 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar11 + 0x1f18) != 0) {
      uStack_f0 = 0x7ff70c81d4a4;
      FUN_7ff70cb12b60(lVar25,*(longlong *)(uVar11 + 0x1f18),
                       (longlong)*(int *)(uVar11 + 0x1f10) << 4);
      uVar28 = _DAT_7ff70cc1a3c0;
      lVar24 = *(longlong *)(uVar11 + 0x1f18);
      if ((lVar24 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar13 = (longlong)iVar9;
          *(int *)(uVar28 + 0x2874 + lVar13 * 8) = *piVar1;
          *(undefined4 *)(uVar28 + 0x2878 + lVar13 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar28 + 0x287a + lVar13 * 8) = sVar18;
        *(int *)(uVar28 + 0x286c) = *(int *)(uVar28 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81d555;
      (*_DAT_7ff70cbe9468)(lVar24,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(uVar11 + 0x1f18) = lVar25;
    *(int *)(uVar11 + 0x1f14) = iVar10;
    iVar9 = *(int *)(uVar11 + 0x1f10);
  }
  else {
    lVar25 = *(longlong *)(uVar11 + 0x1f18);
  }
  lVar24 = (longlong)iVar9 * 0x10;
  *(longlong *)(lVar25 + lVar24) = lVar27;
  *(float *)(lVar25 + 8 + lVar24) = fVar35;
  *(float *)(lVar25 + 0xc + lVar24) = fVar35;
  *(int *)(uVar11 + 0x1f10) = *(int *)(uVar11 + 0x1f10) + 1;
  *(undefined1 *)(uVar32 + 0x1398) = 1;
  lVar25 = (longlong)*(int *)(uVar32 + 0x1f80);
  if (lVar25 != 0) {
    plVar20 = *(longlong **)(uVar32 + 0x1f88);
    uVar11 = lVar25 * 8 - 8;
    plVar14 = plVar20;
    if ((~(uint)uVar11 & 0x38) != 0) {
      uVar28 = (ulonglong)(((uint)(uVar11 >> 3) & 0x1fffffff) + 1 & 7);
      do {
        *(undefined1 *)(*plVar14 + 0x58) = 0;
        plVar14 = plVar14 + 1;
        uVar28 = uVar28 - 1;
      } while (uVar28 != 0);
    }
    if (0x37 < uVar11) {
      do {
        *(undefined1 *)(*plVar14 + 0x58) = 0;
        *(undefined1 *)(plVar14[1] + 0x58) = 0;
        *(undefined1 *)(plVar14[2] + 0x58) = 0;
        *(undefined1 *)(plVar14[3] + 0x58) = 0;
        *(undefined1 *)(plVar14[4] + 0x58) = 0;
        *(undefined1 *)(plVar14[5] + 0x58) = 0;
        *(undefined1 *)(plVar14[6] + 0x58) = 0;
        *(undefined1 *)(plVar14[7] + 0x58) = 0;
        plVar14 = plVar14 + 8;
      } while (plVar14 != plVar20 + lVar25);
    }
  }
  uVar11 = _DAT_7ff70cc1a3c0;
  if ((*(char *)(uVar32 + 0x21b0) != '\0') &&
     (iVar9 = *(int *)(uVar32 + 0x21cc), iVar9 == *(int *)(uVar32 + 0x14b4))) {
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) == iVar9) {
      *(int *)(_DAT_7ff70cc1a3c0 + 0x14b8) = iVar9;
    }
    if (*(int *)(uVar11 + 0x14e8) == iVar9) {
      *(undefined1 *)(uVar11 + 0x14f1) = 1;
    }
  }
  uVar48 = 0;
  if (*(char *)(uVar32 + 0x81) == '\x01') {
    if (*(char *)(uVar32 + 0xfc) == '\0') {
      *(undefined4 *)(uVar32 + 0x1494) = 0;
      iVar9 = *(int *)(uVar32 + 0x14a4);
    }
    else {
      iVar9 = *(int *)(uVar32 + 0x14a4);
    }
    if (1 < iVar9) {
      uVar48 = *(undefined4 *)(uVar32 + 0x14a0);
      goto LAB_7ff70c81d6b4;
    }
    if (*(int *)(uVar32 + 0x14a0) != 0) goto LAB_7ff70c81d706;
LAB_7ff70c81d6c7:
    iVar9 = *(int *)(uVar32 + 0x149c);
    *(undefined8 *)(uVar32 + 0x14a8) = 0;
    if (iVar9 != 0) goto LAB_7ff70c81d728;
LAB_7ff70c81d767:
    iVar9 = 0;
  }
  else {
LAB_7ff70c81d6b4:
    *(undefined4 *)(uVar32 + 0x1494) = uVar48;
    if (*(int *)(uVar32 + 0x14a0) == 0) goto LAB_7ff70c81d6c7;
LAB_7ff70c81d706:
    iVar9 = *(int *)(uVar32 + 0x149c);
    if (iVar9 == 0) goto LAB_7ff70c81d767;
    if (*(int *)(uVar32 + 0x14b4) == iVar9) {
      *(undefined4 *)(uVar32 + 0x14ac) = 0;
    }
LAB_7ff70c81d728:
    *(float *)(uVar32 + 0x14a8) = *(float *)(uVar32 + 0x14a8) + *(float *)(uVar32 + 0x20);
    if (*(int *)(uVar32 + 0x14b4) != iVar9) {
      *(float *)(uVar32 + 0x14ac) = *(float *)(uVar32 + 0x20) + *(float *)(uVar32 + 0x14ac);
    }
  }
  *(int *)(uVar32 + 0x14a0) = iVar9;
  *(undefined4 *)(uVar32 + 0x14a4) = 0;
  *(undefined4 *)(uVar32 + 0x149c) = 0;
  *(undefined2 *)(uVar32 + 0x14b0) = 0;
  iVar9 = *(int *)(uVar32 + 0x14b4);
  if (iVar9 == 0) {
    fVar35 = *(float *)(uVar32 + 0x20);
LAB_7ff70c81d8ff:
    iVar9 = 0;
  }
  else {
    if ((*(int *)(uVar32 + 0x14b8) == iVar9) || (*(int *)(uVar32 + 0x14e4) != iVar9)) {
      fVar35 = *(float *)(uVar32 + 0x20);
    }
    else {
      if ((*(byte *)(uVar32 + 0x27b4) & 2) != 0) {
        uStack_f0 = 0x7ff70c81d7d7;
        FUN_7ff70c800cf0(&UNK_7ff70cb91fa9);
      }
      uVar11 = _DAT_7ff70cc1a3c0;
      iVar9 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
      if (iVar9 == 0) {
        *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x14c0) = 0;
      }
      else {
        if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
           (iVar9 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
            uStack_f0 = 0x7ff70c81d815;
            FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
            iVar9 = *(int *)(uVar11 + 0x14b4);
          }
          *(undefined8 *)(uVar11 + 0x1460) = 0;
        }
        *(int *)(uVar11 + 0x14e8) = iVar9;
        *(uint *)(uVar11 + 0x14ec) =
             (uint)(*(int *)(uVar11 + 0x1e20) != iVar9) + *(int *)(uVar11 + 5000);
        *(undefined1 *)(uVar11 + 0x14f0) = *(undefined1 *)(uVar11 + 0x14c4);
        *(bool *)(uVar11 + 0x14f1) = *(int *)(uVar11 + 0x14b8) == iVar9;
        if (*(int *)(uVar11 + 0x241c) == iVar9) {
          uStack_f0 = 0x7ff70c81d86c;
          FUN_7ff70c8934e0(iVar9);
          iVar9 = *(int *)(uVar11 + 0x14b4);
        }
        *(bool *)(uVar11 + 0x14c0) = iVar9 != 0;
        if (iVar9 != 0) {
          if ((*(byte *)(uVar11 + 0x27b4) & 2) != 0) {
            puVar29 = &UNK_7ff70cb923a7;
            if (*(longlong *)(uVar11 + 0x14d8) != 0) {
              puVar29 = *(undefined **)(*(longlong *)(uVar11 + 0x14d8) + 8);
            }
            puStack_c8 = &UNK_7ff70cb923a7;
            uStack_f0 = 0x7ff70c81d8b8;
            FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar9,puVar29,0);
          }
          *(undefined4 *)(uVar11 + 0x14bc) = 0;
          *(undefined2 *)(uVar11 + 0x14c3) = 0;
          *(undefined1 *)(uVar11 + 0x14c8) = 0xff;
        }
      }
      *(undefined4 *)(uVar11 + 0x14b4) = 0;
      *(undefined2 *)(uVar11 + 0x14c1) = 0;
      *(undefined8 *)(uVar11 + 0x14d8) = 0;
      *(undefined2 *)(uVar11 + 0x14c5) = 0;
      *(undefined4 *)(uVar11 + 0x1dd0) = 0;
      *(undefined1 *)(uVar11 + 0x1dd4) = 0;
      iVar9 = *(int *)(uVar32 + 0x14b4);
      fVar35 = *(float *)(uVar32 + 0x20);
      if (iVar9 == 0) goto LAB_7ff70c81d8ff;
    }
    *(float *)(uVar32 + 0x14bc) = *(float *)(uVar32 + 0x14bc) + fVar35;
  }
  *(float *)(uVar32 + 0x1500) = *(float *)(uVar32 + 0x1500) + fVar35;
  *(int *)(uVar32 + 0x14e4) = iVar9;
  *(undefined4 *)(uVar32 + 0x14b8) = 0;
  *(undefined1 *)(uVar32 + 0x14c5) = 0;
  *(undefined1 *)(uVar32 + 0x14c0) = 0;
  if ((*(int *)(uVar32 + 0x2504) != 0) && (iVar9 != *(int *)(uVar32 + 0x2504))) {
    *(undefined4 *)(uVar32 + 0x2504) = 0;
  }
  if (iVar9 == 0) {
    *(undefined4 *)(uVar32 + 0x1dd0) = 0;
    *(undefined1 *)(uVar32 + 0x1dd4) = 0;
    if (*(int *)(uVar32 + 0x14ec) < *(int *)(uVar32 + 5000)) goto LAB_7ff70c81d971;
LAB_7ff70c81d9bd:
    *(undefined1 *)(uVar32 + 0x14f1) = 0;
    iVar9 = *(int *)(uVar32 + 0x23e0);
    if (iVar9 == 0) goto LAB_7ff70c81d992;
LAB_7ff70c81d9d2:
    iVar22 = iVar9;
    if (*(float *)(uVar32 + 0x10f4) <= *(float *)(uVar32 + 0x23fc)) goto LAB_7ff70c81da10;
    lVar25 = *(longlong *)(uVar32 + 0x1448);
    if (lVar25 == 0) goto LAB_7ff70c81da25;
LAB_7ff70c81d9f6:
    if (*(float *)(uVar32 + 0x10f4) <= *(float *)(uVar32 + 0x23fc)) {
      uVar48 = *(undefined4 *)(lVar25 + 0x10);
      goto LAB_7ff70c81da27;
    }
  }
  else {
    if (*(int *)(uVar32 + 5000) <= *(int *)(uVar32 + 0x14ec)) goto LAB_7ff70c81d9bd;
LAB_7ff70c81d971:
    *(undefined4 *)(uVar32 + 0x14e8) = 0;
    *(undefined1 *)(uVar32 + 0x14f1) = 0;
    iVar9 = *(int *)(uVar32 + 0x23e0);
    if (iVar9 != 0) goto LAB_7ff70c81d9d2;
LAB_7ff70c81d992:
    iVar22 = 0;
LAB_7ff70c81da10:
    *(int *)(uVar32 + 0x23f0) = iVar22;
    lVar25 = *(longlong *)(uVar32 + 0x1448);
    if (lVar25 != 0) goto LAB_7ff70c81d9f6;
LAB_7ff70c81da25:
    uVar48 = 0;
LAB_7ff70c81da27:
    *(undefined4 *)(uVar32 + 0x23f4) = uVar48;
  }
  *(int *)(uVar32 + 0x23e4) = iVar9;
  if (iVar9 == 0) {
    if (0.0 < *(float *)(uVar32 + 0x23e8)) {
      fVar36 = *(float *)(uVar32 + 0x23ec) + fVar35;
      *(float *)(uVar32 + 0x23ec) = fVar36;
      fVar46 = _DAT_7ff70cb1c67c;
      if (_DAT_7ff70cb1c67c <= fVar35 + fVar35) {
        fVar46 = fVar35 + fVar35;
      }
      if (fVar46 <= fVar36) {
        *(undefined8 *)(uVar32 + 0x23e8) = 0;
      }
    }
  }
  else {
    *(float *)(uVar32 + 0x23e8) = fVar35 + *(float *)(uVar32 + 0x23e8);
    *(undefined4 *)(uVar32 + 0x23ec) = 0;
    *(undefined4 *)(uVar32 + 0x23e0) = 0;
  }
  *(undefined4 *)(uVar32 + 0x2230) = *(undefined4 *)(uVar32 + 0x222c);
  *(undefined8 *)(uVar32 + 0x2228) = 0x7f7fffff;
  *(undefined2 *)(uVar32 + 0x21b1) = 0;
  *(undefined4 *)(uVar32 + 0x2238) = 0;
  *(undefined8 *)(uVar32 + 0x25a8) = 0;
  uVar11 = _DAT_7ff70cc1a3c0;
  uVar12 = _DAT_7ff70cb1d550;
  if ((*(byte *)(_DAT_7ff70cc1a3c0 + 8) & 0x40) != 0) {
    lVar25 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0xd8);
    lVar27 = 0x118;
    uVar8 = 0xffffff70;
    while( true ) {
      if (6 < uVar8) {
        *(undefined1 *)(lVar25 + -0x14 + lVar27) = 0;
        *(undefined8 *)(lVar25 + -0x10 + lVar27) = uVar12;
      }
      if (lVar27 == 0xab8) break;
      if (6 < uVar8 + 1) {
        *(undefined1 *)(lVar25 + -4 + lVar27) = 0;
        *(undefined8 *)(lVar25 + lVar27) = uVar12;
      }
      lVar27 = lVar27 + 0x20;
      uVar8 = uVar8 + 2;
    }
    *(undefined8 *)(uVar11 + 0xfc) = 0;
    if (*(int *)(uVar11 + 0xbb4) < 0) {
      uStack_f0 = 0x7ff70c81db7d;
      uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
      uVar28 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
          sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar25 = (longlong)iVar9;
          *(int *)(uVar28 + 0x2874 + lVar25 * 8) = *piVar1;
          *(undefined4 *)(uVar28 + 0x2878 + lVar25 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar28 + 0x2878 + lVar25 * 8) = sVar18;
        *(int *)(uVar28 + 0x2868) = *(int *)(uVar28 + 0x2868) + 1;
      }
      if (*(longlong *)(uVar11 + 3000) != 0) {
        uStack_f0 = 0x7ff70c81dc8c;
        FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar11 + 3000),(longlong)*(int *)(uVar11 + 0xbb0) * 2)
        ;
        uVar28 = _DAT_7ff70cc1a3c0;
        lVar25 = *(longlong *)(uVar11 + 3000);
        if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
          }
          else {
            iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
            lVar27 = (longlong)iVar9;
            *(int *)(uVar28 + 0x2874 + lVar27 * 8) = *piVar1;
            *(undefined4 *)(uVar28 + 0x2878 + lVar27 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(uVar28 + 0x287a + lVar27 * 8) = sVar18;
          *(int *)(uVar28 + 0x286c) = *(int *)(uVar28 + 0x286c) + 1;
        }
        uStack_f0 = 0x7ff70c81dd3d;
        (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
      }
      *(undefined8 *)(uVar11 + 3000) = uVar12;
      *(undefined4 *)(uVar11 + 0xbb4) = 0;
    }
    *(undefined4 *)(uVar11 + 0xbb0) = 0;
  }
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar35 = _DAT_7ff70cb1ba2c;
  fVar46 = _DAT_7ff70cb1ba2c;
  if (*(char *)(uVar11 + 0xe8) == '\0') {
    fVar46 = 0.0;
  }
  *(char *)(_DAT_7ff70cc1a3c0 + 0xa04) = *(char *)(uVar11 + 0xe8);
  *(float *)(uVar28 + 0xa10) = fVar46;
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar46 = fVar35;
  if (*(char *)(uVar11 + 0xe9) == '\0') {
    fVar46 = 0.0;
  }
  *(char *)(_DAT_7ff70cc1a3c0 + 0xa14) = *(char *)(uVar11 + 0xe9);
  *(float *)(uVar28 + 0xa20) = fVar46;
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar46 = fVar35;
  if (*(char *)(uVar11 + 0xea) == '\0') {
    fVar46 = 0.0;
  }
  *(char *)(_DAT_7ff70cc1a3c0 + 0xa24) = *(char *)(uVar11 + 0xea);
  *(float *)(uVar28 + 0xa30) = fVar46;
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar46 = fVar35;
  if (*(char *)(uVar11 + 0xeb) == '\0') {
    fVar46 = 0.0;
  }
  *(char *)(_DAT_7ff70cc1a3c0 + 0xa34) = *(char *)(uVar11 + 0xeb);
  *(float *)(uVar28 + 0xa40) = fVar46;
  uVar28 = _DAT_7ff70cc1a3c0;
  if (*(char *)(uVar11 + 0xec) == '\0') {
    fVar35 = 0.0;
  }
  *(char *)(_DAT_7ff70cc1a3c0 + 0xa44) = *(char *)(uVar11 + 0xec);
  *(float *)(uVar28 + 0xa50) = fVar35;
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar35 = *(float *)(uVar11 + 0xf4);
  *(bool *)(_DAT_7ff70cc1a3c0 + 0xa54) = fVar35 != 0.0;
  *(float *)(uVar28 + 0xa60) = fVar35;
  uVar28 = _DAT_7ff70cc1a3c0;
  fVar35 = *(float *)(uVar11 + 0xf0);
  *(bool *)(_DAT_7ff70cc1a3c0 + 0xa64) = fVar35 != 0.0;
  *(float *)(uVar28 + 0xa70) = fVar35;
  uVar8 = 0;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa74) == '\x01') {
    uVar8 = (uint)(*(char *)(_DAT_7ff70cc1a3c0 + 0x1c50) == '\0') << 0xc;
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa84) == '\x01') goto LAB_7ff70c81ded6;
LAB_7ff70c81dea1:
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa94) != '\x01') goto LAB_7ff70c81def1;
LAB_7ff70c81deaa:
    uVar6 = uVar8 + 0x4000;
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x1c68) != '\0') {
      uVar6 = uVar8;
    }
    uVar19 = *(uint *)(uVar11 + 0x100);
    cVar21 = *(char *)(_DAT_7ff70cc1a3c0 + 0xaa4);
  }
  else {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa84) != '\x01') goto LAB_7ff70c81dea1;
LAB_7ff70c81ded6:
    uVar19 = uVar8 + 0x2000;
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x1c5c) != '\0') {
      uVar19 = uVar8;
    }
    uVar8 = uVar19;
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa94) == '\x01') goto LAB_7ff70c81deaa;
LAB_7ff70c81def1:
    uVar19 = *(uint *)(uVar11 + 0x100);
    cVar21 = *(char *)(_DAT_7ff70cc1a3c0 + 0xaa4);
    uVar6 = uVar8;
  }
  uVar8 = uVar6;
  if ((cVar21 == '\x01') && (uVar8 = uVar6 + 0x8000, *(char *)(_DAT_7ff70cc1a3c0 + 0x1c74) != '\0'))
  {
    uVar8 = uVar6;
  }
  *(uint *)(uVar11 + 0x100) = uVar8;
  *(uint *)(uVar11 + 0xfc) =
       (uVar8 >> 0xc | (uVar8 >> 0xd) << 8 | (uVar8 >> 0xe) << 0x10 | (uVar8 >> 0xf) << 0x18) &
       (uint)DAT_7ff70cb1d770;
  if (uVar19 != uVar8) {
    *(undefined8 *)(uVar11 + 0x1508) = *(undefined8 *)(uVar11 + 0x1380);
  }
  if ((uVar19 == 0) && (uVar8 != 0)) {
    *(undefined8 *)(uVar11 + 0x1510) = *(undefined8 *)(uVar11 + 0x1380);
  }
  if ((*(byte *)(uVar11 + 0xc) & 1) == 0) {
    *(undefined1 *)(uVar11 + 0x884) = 0;
    *(undefined4 *)(uVar11 + 0x890) = 0;
    *(undefined1 *)(uVar11 + 0x894) = 0;
    *(undefined4 *)(uVar11 + 0x8a0) = 0;
    *(undefined1 *)(uVar11 + 0x8a4) = 0;
    *(undefined4 *)(uVar11 + 0x8b0) = 0;
    *(undefined1 *)(uVar11 + 0x8b4) = 0;
    *(undefined4 *)(uVar11 + 0x8c0) = 0;
    *(undefined1 *)(uVar11 + 0x8c4) = 0;
    *(undefined4 *)(uVar11 + 0x8d0) = 0;
    *(undefined1 *)(uVar11 + 0x8d4) = 0;
    *(undefined4 *)(uVar11 + 0x8e0) = 0;
    *(undefined1 *)(uVar11 + 0x8e4) = 0;
    *(undefined4 *)(uVar11 + 0x8f0) = 0;
    *(undefined1 *)(uVar11 + 0x8f4) = 0;
    *(undefined4 *)(uVar11 + 0x900) = 0;
    *(undefined1 *)(uVar11 + 0x904) = 0;
    *(undefined4 *)(uVar11 + 0x910) = 0;
    *(undefined1 *)(uVar11 + 0x914) = 0;
    *(undefined4 *)(uVar11 + 0x920) = 0;
    *(undefined1 *)(uVar11 + 0x924) = 0;
    *(undefined4 *)(uVar11 + 0x930) = 0;
    *(undefined1 *)(uVar11 + 0x934) = 0;
    *(undefined4 *)(uVar11 + 0x940) = 0;
    *(undefined1 *)(uVar11 + 0x944) = 0;
    *(undefined4 *)(uVar11 + 0x950) = 0;
    *(undefined1 *)(uVar11 + 0x954) = 0;
    *(undefined4 *)(uVar11 + 0x960) = 0;
    *(undefined1 *)(uVar11 + 0x964) = 0;
    *(undefined4 *)(uVar11 + 0x970) = 0;
    *(undefined1 *)(uVar11 + 0x974) = 0;
    *(undefined4 *)(uVar11 + 0x980) = 0;
    *(undefined1 *)(uVar11 + 0x984) = 0;
    *(undefined4 *)(uVar11 + 0x990) = 0;
    *(undefined1 *)(uVar11 + 0x994) = 0;
    *(undefined4 *)(uVar11 + 0x9a0) = 0;
    *(undefined1 *)(uVar11 + 0x9a4) = 0;
    *(undefined4 *)(uVar11 + 0x9b0) = 0;
    *(undefined1 *)(uVar11 + 0x9b4) = 0;
    *(undefined4 *)(uVar11 + 0x9c0) = 0;
    *(undefined1 *)(uVar11 + 0x9c4) = 0;
    *(undefined4 *)(uVar11 + 0x9d0) = 0;
    *(undefined1 *)(uVar11 + 0x9d4) = 0;
    *(undefined4 *)(uVar11 + 0x9e0) = 0;
    *(undefined1 *)(uVar11 + 0x9e4) = 0;
    *(undefined4 *)(uVar11 + 0x9f0) = 0;
    *(undefined1 *)(uVar11 + 0x9f4) = 0;
    *(undefined4 *)(uVar11 + 0xa00) = 0;
  }
  pfVar15 = (float *)(uVar11 + 0x10c);
  uVar28 = 0x200;
  uVar8 = 0xffffff69;
  do {
    fVar35 = pfVar15[-1];
    *pfVar15 = fVar35;
    if (*(char *)(pfVar15 + -2) == '\0') {
      pfVar15[-1] = -1.0;
    }
    else {
      if (0.0 <= fVar35) {
        fVar35 = fVar35 + *(float *)(uVar11 + 0x20);
        pfVar15[-1] = fVar35;
        if ((fVar35 != 0.0) || (NAN(fVar35))) goto LAB_7ff70c81e147;
      }
      else {
        pfVar15[-1] = 0.0;
      }
      if ((uVar28 < 0x278) || (uVar8 < 4)) {
        *(undefined8 *)(uVar11 + 0x1518) = *(undefined8 *)(uVar11 + 0x1380);
      }
    }
LAB_7ff70c81e147:
    uVar28 = uVar28 + 1;
    uVar8 = uVar8 + 1;
    pfVar15 = pfVar15 + 4;
  } while (uVar28 != 0x29b);
  pcVar16 = (char *)(uVar11 + 0x153d);
  lVar25 = 0x104;
  do {
    *(undefined4 *)(pcVar16 + -9) = *(undefined4 *)(pcVar16 + -5);
    if (*(char *)(uVar11 + lVar25) == '\0') {
      pcVar16[-5] = -1;
      pcVar16[-4] = -1;
      pcVar16[-3] = -1;
      pcVar16[-2] = -1;
    }
    if (*pcVar16 == '\x01') {
      cVar21 = *(char *)(uVar11 + lVar25);
    }
    else {
      cVar21 = '\0';
    }
    *pcVar16 = cVar21;
    pcVar16[-1] = cVar21;
    lVar25 = lVar25 + 0x10;
    pcVar16 = pcVar16 + 0xc;
  } while (lVar25 != 0xab4);
  uStack_90 = _DAT_7ff70cc1a3c0;
  if (*(int *)(uVar11 + 0x1dc4) < 0) {
    uStack_f0 = 0x7ff70c81e21d;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar28 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar28 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar28 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar28 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar28 + 0x2868) = *(int *)(uVar28 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar11 + 0x1dc8) != 0) {
      uStack_f0 = 0x7ff70c81e2cb;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar11 + 0x1dc8),
                       (longlong)*(int *)(uVar11 + 0x1dc0) << 4);
      uVar28 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar11 + 0x1dc8);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar28 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar28 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar28 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar28 + 0x286c) = *(int *)(uVar28 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81e37c;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar11 + 0x1dc8) = uVar12;
    *(undefined4 *)(uVar11 + 0x1dc4) = 0;
  }
  uStack_88 = uVar32;
  *(undefined4 *)(uVar11 + 0x1dc0) = 0;
  lVar25 = 0x200;
  uVar32 = 0;
  do {
    sVar18 = *(short *)(uVar11 + 0x1878 + lVar25 * 2);
    iVar9 = (int)uVar32;
    if (sVar18 == -1) {
      *(undefined2 *)(uVar11 + 0x1878 + lVar25 * 2) = 0xffff;
      uVar8 = *(uint *)(uVar11 + 0x1dc0);
    }
    else {
      lVar27 = uStack_90 + lVar25 * 0xc;
      do {
        lVar24 = *(longlong *)(uVar11 + 0x1db8);
        lVar13 = (longlong)sVar18 * 0x10;
        psVar2 = (short *)(lVar24 + lVar13);
        *(undefined1 *)(lVar24 + 4 + lVar13) = *(undefined1 *)(lVar24 + 5 + lVar13);
        iVar22 = *(int *)(lVar24 + 0xc + lVar13);
        *(int *)(lVar24 + 8 + lVar13) = iVar22;
        *(undefined4 *)(lVar24 + 0xc + lVar13) = 0xffffffff;
        *(undefined1 *)(lVar24 + 5 + lVar13) = 0xff;
        if (iVar22 != -1) {
          iVar22 = *(int *)(uVar11 + 0x1dc0);
          if (iVar22 == *(int *)(uVar11 + 0x1dc4)) {
            if (iVar22 == 0) {
              iVar10 = 8;
            }
            else {
              iVar10 = iVar22 / 2 + iVar22;
            }
            iVar33 = iVar22 + 1;
            if (iVar22 + 1 < iVar10) {
              iVar33 = iVar10;
            }
            uStack_f0 = 0x7ff70c81e48f;
            lVar24 = (*_DAT_7ff70cbe9460)((longlong)iVar33 << 4,_DAT_7ff70cc1a3d0);
            uVar28 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
                sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
              }
              else {
                iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
                lVar13 = (longlong)iVar22;
                *(int *)(uVar28 + 0x2874 + lVar13 * 8) = *piVar1;
                *(undefined4 *)(uVar28 + 0x2878 + lVar13 * 8) = 0;
                sVar18 = 1;
              }
              *(short *)(uVar28 + 0x2878 + lVar13 * 8) = sVar18;
              *(int *)(uVar28 + 0x2868) = *(int *)(uVar28 + 0x2868) + 1;
            }
            if (*(longlong *)(uVar11 + 0x1dc8) != 0) {
              uStack_f0 = 0x7ff70c81e53d;
              FUN_7ff70cb12b60(lVar24,*(longlong *)(uVar11 + 0x1dc8),
                               (longlong)*(int *)(uVar11 + 0x1dc0) << 4);
              uVar28 = _DAT_7ff70cc1a3c0;
              lVar13 = *(longlong *)(uVar11 + 0x1dc8);
              if ((lVar13 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar1) {
                  sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
                }
                else {
                  iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
                  lVar30 = (longlong)iVar22;
                  *(int *)(uVar28 + 0x2874 + lVar30 * 8) = *piVar1;
                  *(undefined4 *)(uVar28 + 0x2878 + lVar30 * 8) = 0;
                  sVar18 = 1;
                }
                *(short *)(uVar28 + 0x287a + lVar30 * 8) = sVar18;
                *(int *)(uVar28 + 0x286c) = *(int *)(uVar28 + 0x286c) + 1;
              }
              uStack_f0 = 0x7ff70c81e5ee;
              (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
            }
            *(longlong *)(uVar11 + 0x1dc8) = lVar24;
            *(int *)(uVar11 + 0x1dc4) = iVar33;
            iVar22 = *(int *)(uVar11 + 0x1dc0);
          }
          else {
            lVar24 = *(longlong *)(uVar11 + 0x1dc8);
          }
          uVar12 = *(undefined8 *)(psVar2 + 4);
          puVar3 = (undefined8 *)(lVar24 + (longlong)iVar22 * 0x10);
          *puVar3 = *(undefined8 *)psVar2;
          puVar3[1] = uVar12;
          *(int *)(uVar11 + 0x1dc0) = *(int *)(uVar11 + 0x1dc0) + 1;
          if ((*(uint *)(uStack_90 + 0x100) == (uint)(ushort)psVar2[1]) &&
             (*(int *)(lVar27 + -0x2cc) == -1)) {
            *(undefined4 *)(lVar27 + -0x2cc) = *(undefined4 *)(psVar2 + 4);
          }
        }
        sVar18 = *psVar2;
      } while (sVar18 != -1);
      uVar7 = 0xffff;
      if (iVar9 < *(int *)(uVar11 + 0x1dc0)) {
        uVar7 = (undefined2)uVar32;
      }
      *(undefined2 *)(uVar11 + 0x1878 + lVar25 * 2) = uVar7;
      uVar8 = *(uint *)(uVar11 + 0x1dc0);
    }
    uVar32 = (ulonglong)uVar8;
    if (iVar9 < (int)uVar8) {
      lVar27 = (longlong)iVar9;
      lVar24 = lVar27 << 4;
      do {
        iVar9 = iVar9 + 1;
        lVar27 = lVar27 + 1;
        uVar7 = (undefined2)iVar9;
        if ((int)uVar32 <= lVar27) {
          uVar7 = 0xffff;
        }
        *(undefined2 *)(*(longlong *)(uVar11 + 0x1dc8) + lVar24) = uVar7;
        uVar32 = (ulonglong)*(int *)(uVar11 + 0x1dc0);
        lVar24 = lVar24 + 0x10;
      } while (lVar27 < (longlong)uVar32);
    }
    lVar25 = lVar25 + 1;
  } while (lVar25 != 0x29b);
  uVar12 = *(undefined8 *)(uVar11 + 0x1db0);
  *(int *)(uVar11 + 0x1db0) = (int)uVar32;
  *(undefined8 *)(uVar11 + 0x1dc0) = uVar12;
  *(undefined4 *)(uVar11 + 0x1db4) = *(undefined4 *)(uVar11 + 0x1dc4);
  uVar12 = *(undefined8 *)(uVar11 + 0x1dc8);
  *(undefined8 *)(uVar11 + 0x1dc8) = *(undefined8 *)(uVar11 + 0x1db8);
  *(undefined8 *)(uVar11 + 0x1db8) = uVar12;
  uStack_f0 = 0x7ff70c81e73a;
  FUN_7ff70c821f00();
  uVar28 = uStack_88;
  uVar32 = _DAT_7ff70cc1a3c0;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0xfd) == '\x01') {
    bVar17 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x59) ^ 1;
  }
  else {
    bVar17 = 0;
  }
  *(byte *)(_DAT_7ff70cc1a3c0 + 0xb6a) = bVar17;
  uVar31 = *(ulonglong *)(uVar32 + 0xe0);
  auVar49._8_8_ = 0;
  auVar49._0_8_ = uVar31;
  fVar35 = (float)(uVar31 >> 0x20);
  fVar46 = (float)uVar31;
  if ((_DAT_7ff70cb1d744 <= fVar46) && (_DAT_7ff70cb1d744 <= fVar35)) {
    auVar37 = roundps(in_XMM3,auVar49,0xb);
    fVar35 = (float)(int)((int)fVar35 - (uint)(fVar35 < 0.0 && auVar37._4_4_ != fVar35));
    uVar31 = CONCAT44(fVar35,(float)(int)((int)fVar46 -
                                         (uint)(fVar46 < 0.0 && auVar37._0_4_ != fVar46)));
    *(ulonglong *)(uVar32 + 0x2400) = uVar31;
    *(ulonglong *)(uVar32 + 0xe0) = uVar31;
  }
  fVar46 = (float)uVar31;
  fVar36 = (float)(uVar31 >> 0x20);
  if ((fVar46 < _DAT_7ff70cb1d744) || (fVar35 < _DAT_7ff70cb1d744)) {
LAB_7ff70c81e7f1:
    *(undefined8 *)(uVar32 + 0xcc) = 0;
    fVar47 = 0.0;
    fVar35 = 0.0;
  }
  else {
    fVar35 = (float)*(undefined8 *)(uVar32 + 0xab8);
    if ((fVar35 < _DAT_7ff70cb1d744) ||
       (fVar47 = (float)((ulonglong)*(undefined8 *)(uVar32 + 0xab8) >> 0x20),
       fVar47 < _DAT_7ff70cb1d744)) goto LAB_7ff70c81e7f1;
    fVar35 = fVar46 - fVar35;
    fVar47 = fVar36 - fVar47;
    *(float *)(uVar32 + 0xcc) = fVar35;
    *(float *)(uVar32 + 0xd0) = fVar47;
  }
  fVar60 = 0.0;
  if (fVar47 * fVar47 + fVar35 * fVar35 <=
      *(float *)(&UNK_7ff70cb1d780 + (ulonglong)(*(int *)(uVar32 + 0xf8) == 0) * 4)) {
    fVar60 = *(float *)(uVar32 + 0x23fc) + *(float *)(uVar32 + 0x20);
  }
  *(float *)(uVar32 + 0x23fc) = fVar60;
  if ((((fVar47 != 0.0) || (NAN(fVar47))) || (fVar35 != 0.0)) || (NAN(fVar35))) {
    *(undefined1 *)(uVar32 + 0x1f91) = 0;
  }
  auVar37 = _DAT_7ff70cb1d790;
  fVar35 = _DAT_7ff70cb1d744;
  auVar50._4_4_ = fVar46;
  auVar50._0_4_ = fVar36;
  auVar50._8_4_ = fVar36;
  auVar50._12_4_ = fVar46;
  lVar25 = 0xb10;
  lVar27 = 0xb2e;
  lVar24 = 0xb1a;
  lVar13 = 0;
  do {
    if (*(char *)((uVar32 - 0xa46) + lVar27) == '\0') {
      *(undefined1 *)((uVar32 - 0x1e) + lVar27) = 0;
      *(undefined2 *)((uVar32 - 0xb06) + lVar25 * 2) = 0;
      bVar34 = 0.0 <= *(float *)((uVar32 - 0x20d4) + lVar25 * 4);
      *(bool *)(uVar32 + lVar27) = bVar34;
      if (bVar34) {
        *(undefined8 *)((uVar32 - 0x4d48) + lVar25 * 8) = *(undefined8 *)(uVar32 + 0x1380);
      }
      *(undefined4 *)((uVar32 - 0x20c0) + lVar25 * 4) =
           *(undefined4 *)((uVar32 - 0x20d4) + lVar25 * 4);
      *(undefined4 *)((uVar32 - 0x20d4) + lVar25 * 4) = 0xbf800000;
      *(bool *)((uVar32 - 0x19) + lVar27) = *(short *)(uVar32 + 0xb1a + lVar13 * 2) == 2;
      cVar21 = *(char *)(uVar32 + 0xb10 + lVar13);
    }
    else {
      fVar46 = *(float *)((uVar32 - 0x20d4) + lVar25 * 4);
      fVar47 = 0.0;
      *(bool *)((uVar32 - 0x1e) + lVar27) = fVar46 < 0.0;
      *(undefined2 *)((uVar32 - 0xb06) + lVar25 * 2) = 0;
      *(undefined1 *)(uVar32 + lVar27) = 0;
      fVar36 = *(float *)((uVar32 - 0x20d4) + lVar25 * 4);
      *(float *)((uVar32 - 0x20c0) + lVar25 * 4) = fVar36;
      if (0.0 <= fVar36) {
        fVar47 = fVar36 + *(float *)(uVar32 + 0x20);
      }
      *(float *)((uVar32 - 0x20d4) + lVar25 * 4) = fVar47;
      fVar36 = auVar50._12_4_;
      if (0.0 <= fVar46) {
        iVar9 = -(uint)(auVar37._0_4_ <= auVar50._8_4_);
        iVar22 = -(uint)(auVar37._4_4_ <= fVar36);
        auVar63._4_4_ = iVar22;
        auVar63._0_4_ = iVar9;
        auVar63._8_4_ = iVar22;
        auVar63._12_4_ = iVar22;
        auVar62._8_8_ = auVar63._8_8_;
        auVar62._4_4_ = iVar9;
        auVar62._0_4_ = iVar9;
        uVar8 = movmskpd((int)uVar11,auVar62);
        uVar11 = (ulonglong)uVar8;
        auVar65 = ZEXT816(0);
        if (uVar8 == 3) {
          uVar12 = *(undefined8 *)((uVar32 - 0x4dc0) + lVar25 * 8);
          fVar46 = auVar50._8_4_ - (float)((ulonglong)uVar12 >> 0x20);
          fVar47 = fVar36 - (float)uVar12;
          fVar47 = fVar47 * fVar47;
          fVar36 = (fVar36 - 0.0) * (fVar36 - 0.0);
          auVar64._4_4_ = fVar47;
          auVar64._0_4_ = fVar47;
          auVar64._8_4_ = fVar36;
          auVar64._12_4_ = fVar36;
          auVar65._4_12_ = auVar64._4_12_;
          auVar65._0_4_ = fVar47 + fVar46 * fVar46;
        }
        fVar46 = *(float *)((uVar32 - 0x20ac) + lVar25 * 4);
        auVar40._4_12_ = auVar65._4_12_;
        auVar40._0_4_ = -(uint)(auVar65._0_4_ <= fVar46);
        auVar66 = blendvps(auVar65,ZEXT416((uint)fVar46),auVar40);
        *(int *)((uVar32 - 0x20ac) + lVar25 * 4) = auVar66._0_4_;
        *(bool *)((uVar32 - 0x19) + lVar27) = *(short *)(uVar32 + lVar24) == 2;
        cVar21 = *(char *)(uVar32 + lVar25);
      }
      else {
        if (*(float *)(uVar32 + 0x68) <=
            (float)(*(double *)(uVar32 + 0x1380) - *(double *)((uVar32 - 0x4d98) + lVar25 * 8))) {
LAB_7ff70c81eab2:
          *(undefined2 *)((uVar32 - 0xafc) + lVar25 * 2) = 1;
        }
        else {
          fVar46 = 0.0;
          if ((fVar35 <= auVar50._4_4_) && (fVar35 <= auVar50._0_4_)) {
            uVar12 = *(undefined8 *)((uVar32 - 0x4dc0) + lVar25 * 8);
            fVar46 = auVar50._0_4_ - (float)((ulonglong)uVar12 >> 0x20);
            fVar36 = auVar50._4_4_ - (float)uVar12;
            fVar46 = fVar36 * fVar36 + fVar46 * fVar46;
          }
          if (*(float *)(uVar32 + 0x6c) * *(float *)(uVar32 + 0x6c) <= fVar46)
          goto LAB_7ff70c81eab2;
          psVar2 = (short *)((uVar32 - 0xafc) + lVar25 * 2);
          *psVar2 = *psVar2 + 1;
        }
        *(undefined8 *)((uVar32 - 0x4d98) + lVar25 * 8) = *(undefined8 *)(uVar32 + 0x1380);
        uVar11 = *(ulonglong *)(uVar32 + 0xe0);
        *(ulonglong *)((uVar32 - 0x4dc0) + lVar25 * 8) = uVar11;
        *(undefined2 *)((uVar32 - 0xb06) + lVar25 * 2) =
             *(undefined2 *)((uVar32 - 0xafc) + lVar25 * 2);
        *(undefined4 *)((uVar32 - 0x20ac) + lVar25 * 4) = 0;
        uVar48 = (undefined4)(uVar11 >> 0x20);
        auVar50._4_4_ = (int)uVar11;
        auVar50._0_4_ = uVar48;
        auVar50._8_4_ = uVar48;
        auVar50._12_4_ = (int)uVar11;
        *(bool *)((uVar32 - 0x19) + lVar27) = *(short *)(uVar32 + lVar24) == 2;
        cVar21 = *(char *)(uVar32 + lVar25);
      }
    }
    if (cVar21 == '\x01') {
      *(undefined1 *)(uVar32 + 0x1f91) = 0;
    }
    lVar13 = lVar13 + 1;
    lVar25 = lVar25 + 1;
    lVar27 = lVar27 + 1;
    lVar24 = lVar24 + 2;
  } while (lVar25 != 0xb15);
  fVar35 = _DAT_7ff70cb1c5d8;
  if ((*(char *)(uStack_88 + 0x139a) == '\0') && (0.0 <= *(float *)(uStack_88 + 100))) {
    fVar35 = (float)*(double *)(uStack_88 + 0x1380) - *(float *)(uStack_88 + 100);
  }
  iVar9 = *(int *)(uStack_88 + 0x13e0);
  if ((longlong)iVar9 != 0) {
    lVar25 = *(longlong *)(uStack_88 + 0x13e8);
    lVar27 = 0;
    do {
      lVar24 = *(longlong *)(lVar25 + lVar27);
      cVar21 = *(char *)(lVar24 + 0xcc);
      *(char *)(lVar24 + 0xcd) = cVar21;
      *(undefined1 *)(lVar24 + 0xcc) = 0;
      *(undefined1 *)(lVar24 + 0xce) = 0;
      *(undefined2 *)(lVar24 + 0xdc) = *(undefined2 *)(lVar24 + 0xda);
      *(undefined2 *)(lVar24 + 0xda) = 0;
      if (((cVar21 == '\0') && (*(char *)(lVar24 + 0x434) == '\0')) &&
         (*(float *)(lVar24 + 0x28c) <= fVar35 && fVar35 != *(float *)(lVar24 + 0x28c))) {
        *(undefined1 *)(lVar24 + 0x434) = 1;
        lVar13 = *(longlong *)(lVar24 + 0x110);
        lVar30 = *(longlong *)(lVar24 + 0x2c8);
        *(undefined4 *)(lVar24 + 0x42c) = *(undefined4 *)(lVar30 + 0x14);
        *(undefined4 *)(lVar24 + 0x430) = *(undefined4 *)(lVar30 + 0x24);
        if (lVar13 != 0) {
          *(undefined8 *)(lVar24 + 0x108) = 0;
          uVar32 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar30 = (longlong)iVar22;
              *(int *)(uVar32 + 0x2874 + lVar30 * 8) = *piVar1;
              *(undefined4 *)(uVar32 + 0x2878 + lVar30 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar32 + 0x287a + lVar30 * 8) = sVar18;
            *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c81ed41;
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar24 + 0x110) = 0;
          lVar30 = *(longlong *)(lVar24 + 0x2c8);
        }
        uStack_f0 = 0x7ff70c81ed5b;
        FUN_7ff70c7b5f30(lVar30);
        lVar13 = *(longlong *)(lVar24 + 0x1b8);
        if (lVar13 != 0) {
          *(undefined8 *)(lVar24 + 0x1b0) = 0;
          uVar32 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar30 = (longlong)iVar22;
              *(int *)(uVar32 + 0x2874 + lVar30 * 8) = *piVar1;
              *(undefined4 *)(uVar32 + 0x2878 + lVar30 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar32 + 0x287a + lVar30 * 8) = sVar18;
            *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c81ee17;
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar24 + 0x1b8) = 0;
        }
        lVar13 = *(longlong *)(lVar24 + 0x1f8);
        if (lVar13 != 0) {
          *(undefined8 *)(lVar24 + 0x1f0) = 0;
          uVar32 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar30 = (longlong)iVar22;
              *(int *)(uVar32 + 0x2874 + lVar30 * 8) = *piVar1;
              *(undefined4 *)(uVar32 + 0x2878 + lVar30 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar32 + 0x287a + lVar30 * 8) = sVar18;
            *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c81eede;
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar24 + 0x1f8) = 0;
        }
        lVar13 = *(longlong *)(lVar24 + 0x208);
        if (lVar13 != 0) {
          *(undefined8 *)(lVar24 + 0x200) = 0;
          uVar32 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar30 = (longlong)iVar22;
              *(int *)(uVar32 + 0x2874 + lVar30 * 8) = *piVar1;
              *(undefined4 *)(uVar32 + 0x2878 + lVar30 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar32 + 0x287a + lVar30 * 8) = sVar18;
            *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c81ebe6;
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar24 + 0x208) = 0;
        }
      }
      lVar27 = lVar27 + 8;
    } while ((longlong)iVar9 * 8 != lVar27);
  }
  uStack_f0 = 0x7ff70c81ef51;
  FUN_7ff70c81bdb0(uVar28 + 0xe0);
  uStack_f0 = 0x7ff70c81ef56;
  FUN_7ff70c81adc0();
  uVar32 = _DAT_7ff70cc1a3c0;
  lVar25 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f50);
  if (0 < lVar25) {
    uVar11 = lVar25 + 1;
    plVar20 = (longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + lVar25 * 0x38 + -0x30);
    do {
      if ((*plVar20 != 0) && ((*(byte *)(*plVar20 + 0x17) & 8) != 0)) goto LAB_7ff70c81efba;
      uVar11 = uVar11 - 1;
      plVar20 = plVar20 + -7;
    } while (1 < uVar11);
  }
  if ((*(longlong *)(uVar28 + 0x2170) == 0) || (*(float *)(uVar28 + 0x218c) <= 0.0)) {
    fVar46 = *(float *)(uVar28 + 0x20) * _DAT_7ff70cb1d7a0 + *(float *)(uVar28 + 0x21ac);
    *(uint *)(uVar28 + 0x21ac) = -(uint)(0.0 <= fVar46) & (uint)fVar46;
  }
  else {
LAB_7ff70c81efba:
    fVar46 = *(float *)(uVar28 + 0x20) * _DAT_7ff70cb1d5f4 + *(float *)(uVar28 + 0x21ac);
    if (_DAT_7ff70cb1ba2c <= fVar46) {
      fVar46 = _DAT_7ff70cb1ba2c;
    }
    *(float *)(uVar28 + 0x21ac) = fVar46;
  }
  *(undefined4 *)(uVar28 + 0x23f8) = 0;
  *(undefined4 *)(uVar28 + 0x29a8) = 0xffffffff;
  *(undefined8 *)(uVar28 + 0x29a0) = 0xffffffffffffffff;
  *(undefined4 *)(uVar28 + 0x265c) = *(undefined4 *)(uVar28 + 0x2648);
  *(undefined8 *)(uVar28 + 0x264c) = *(undefined8 *)(uVar28 + 0x2638);
  *(undefined8 *)(uVar28 + 0x2654) = *(undefined8 *)(uVar28 + 0x2640);
  *(undefined2 *)(uVar28 + 0x2638) = 0;
  lVar25 = *(longlong *)(uVar32 + 0x1468);
  uVar11 = uVar32;
  if (lVar25 == 0) {
    lVar25 = 0;
    iVar9 = *(int *)(uVar32 + 0x1c30);
joined_r0x7ff70c81f117:
    if (iVar9 != -1) goto LAB_7ff70c81f0f0;
LAB_7ff70c81f119:
    auVar37 = ZEXT416(*(uint *)(uVar32 + 0xf4));
    if (*(int *)(uVar11 + 0x1c3c) != -1) goto LAB_7ff70c81f0fa;
LAB_7ff70c81f12b:
    auVar66 = ZEXT416(*(uint *)(uVar32 + 0xf0));
    lVar27 = lVar25;
    if (lVar25 != 0) goto LAB_7ff70c81f147;
LAB_7ff70c81f13b:
    lVar25 = *(longlong *)(uVar32 + 0x1448);
    if (lVar25 != 0) goto LAB_7ff70c81f147;
  }
  else {
    fVar46 = *(float *)(uVar32 + 0x1480) - *(float *)(uVar32 + 0x20);
    *(float *)(uVar32 + 0x1480) = fVar46;
    fVar36 = (float)*(undefined8 *)(uVar32 + 0xe0);
    if ((((fVar36 < _DAT_7ff70cb1d744) ||
         (fVar47 = (float)((ulonglong)*(undefined8 *)(uVar32 + 0xe0) >> 0x20),
         fVar47 < _DAT_7ff70cb1d744)) ||
        (fVar36 = fVar36 - (float)*(undefined8 *)(uVar32 + 0x1470),
        fVar47 = fVar47 - (float)((ulonglong)*(undefined8 *)(uVar32 + 0x1470) >> 0x20),
        fVar47 * fVar47 + fVar36 * fVar36 <= *(float *)(uVar32 + 0x70) * *(float *)(uVar32 + 0x70)))
       && (0.0 < fVar46)) {
      iVar9 = *(int *)(uVar32 + 0x1c30);
      goto joined_r0x7ff70c81f117;
    }
    *(undefined4 *)(uVar32 + 0x1480) = 0;
    if ((*(byte *)(uVar32 + 0x27b4) & 0x80) != 0) {
      uStack_f0 = 0x7ff70c81f455;
      FUN_7ff70c800cf0(&UNK_7ff70cb91e5d,&UNK_7ff70cb8a129);
      uVar11 = _DAT_7ff70cc1a3c0;
    }
    *(undefined8 *)(uVar32 + 0x1468) = 0;
    *(undefined8 *)(uVar32 + 0x1470) = *(undefined8 *)(uVar32 + 0xe0);
    *(undefined4 *)(uVar32 + 0x1478) = 0xffffffff;
    *(undefined8 *)(uVar32 + 0x148c) = 0;
    lVar25 = 0;
    if (*(int *)(uVar11 + 0x1c30) == -1) goto LAB_7ff70c81f119;
LAB_7ff70c81f0f0:
    auVar37 = ZEXT816(0);
    if (*(int *)(uVar11 + 0x1c3c) == -1) goto LAB_7ff70c81f12b;
LAB_7ff70c81f0fa:
    auVar66 = ZEXT816(0);
    lVar27 = lVar25;
    if (lVar25 == 0) goto LAB_7ff70c81f13b;
LAB_7ff70c81f147:
    if (*(char *)(lVar25 + 0xcf) == '\0') {
      fVar46 = auVar66._0_4_;
      if ((fVar46 != 0.0) || (NAN(fVar46))) {
        if (*(char *)(uVar32 + 0xfc) == '\0') goto LAB_7ff70c81f4ad;
        if (*(char *)(uVar32 + 0x50) == '\x01') {
          fVar46 = (float)((uint)fVar46 & _DAT_7ff70cb1bac0) * _DAT_7ff70cb1d7c4 +
                   *(float *)(uVar11 + 0x1480);
          if (_DAT_7ff70cb1d7c4 <= fVar46) {
            fVar46 = _DAT_7ff70cb1d7c4;
          }
          *(float *)(uVar11 + 0x1480) = fVar46;
          if (*(longlong *)(uVar11 + 0x1468) != lVar25) {
            if ((*(byte *)(uVar11 + 0x27b4) & 0x80) != 0) {
              uStack_f0 = 0x7ff70c81f2dc;
              FUN_7ff70c800cf0(&UNK_7ff70cb91e5d,*(undefined8 *)(lVar25 + 8));
            }
            *(longlong *)(uVar11 + 0x1468) = lVar25;
            *(undefined8 *)(uVar11 + 0x1470) = *(undefined8 *)(uVar11 + 0xe0);
          }
          fVar46 = *(float *)(lVar25 + 0x2b8);
          fVar47 = *(float *)(uVar32 + 0xf0) * _DAT_7ff70cb1d7c8 + fVar46;
          fVar36 = _DAT_7ff70cb1d7cc;
          if (fVar47 <= _DAT_7ff70cb1d7cc) {
            fVar36 = fVar47;
          }
          auVar37 = blendvps(ZEXT416((uint)fVar36),_DAT_7ff70cb1b5a0,
                             ZEXT416(-(uint)(fVar47 < _DAT_7ff70cb1ba70)));
          *(float *)(lVar25 + 0x2b8) = auVar37._0_4_;
          if (lVar25 == *(longlong *)(lVar25 + 0x3c0)) {
            fVar46 = auVar37._0_4_ / fVar46;
            uVar11 = *(ulonglong *)(lVar25 + 0x30);
            auVar41._8_8_ = 0;
            auVar41._0_8_ = uVar11;
            fVar60 = (float)*(undefined8 *)(lVar25 + 0x28);
            fVar59 = (float)((ulonglong)*(undefined8 *)(lVar25 + 0x28) >> 0x20);
            auVar54._0_4_ =
                 (_DAT_7ff70cb1ba2c - fVar46) * (float)uVar11 *
                 ((float)*(undefined8 *)(uVar32 + 0xe0) - fVar60);
            auVar54._4_4_ =
                 (_DAT_7ff70cb1ba2c - fVar46) * (float)(uVar11 >> 0x20) *
                 ((float)((ulonglong)*(undefined8 *)(uVar32 + 0xe0) >> 0x20) - fVar59);
            auVar54._8_8_ = 0;
            auVar37 = divps(auVar54,auVar41);
            *(uint *)(lVar25 + 0xf0) = *(uint *)(lVar25 + 0xf0) & 0xfffffff1;
            *(undefined8 *)(lVar25 + 0xf4) = 0x7f7fffff7f7fffff;
            fVar36 = (float)(int)(auVar37._0_4_ + fVar60);
            fVar47 = (float)(int)(auVar37._4_4_ + fVar59);
            *(ulonglong *)(lVar25 + 0x28) = CONCAT44(fVar47,fVar36);
            fVar36 = fVar36 - fVar60;
            fVar47 = fVar47 - fVar59;
            if (((fVar36 != 0.0) || (fVar47 != 0.0)) || (NAN(fVar47))) {
              if (((*(byte *)(lVar25 + 0x15) & 1) == 0) &&
                 (*(float *)(_DAT_7ff70cc1a3c0 + 0x2674) <= 0.0)) {
                *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2674) =
                     *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x24);
                uVar11 = *(ulonglong *)(lVar25 + 0x30);
              }
              *(ulonglong *)(lVar25 + 0x118) =
                   CONCAT44((float)((ulonglong)*(undefined8 *)(lVar25 + 0x118) >> 0x20) + fVar47,
                            (float)*(undefined8 *)(lVar25 + 0x118) + fVar36);
              *(ulonglong *)(lVar25 + 0x138) =
                   CONCAT44((float)((ulonglong)*(undefined8 *)(lVar25 + 0x138) >> 0x20) + fVar47,
                            (float)*(undefined8 *)(lVar25 + 0x138) + fVar36);
              auVar55._0_4_ = *(float *)(lVar25 + 0x128) + fVar36;
              auVar55._4_4_ = *(float *)(lVar25 + 300) + fVar47;
              auVar55._8_4_ = *(float *)(lVar25 + 0x130) + fVar36;
              auVar55._12_4_ = *(float *)(lVar25 + 0x134) + fVar47;
              *(undefined1 (*) [16])(lVar25 + 0x128) = auVar55;
            }
            uVar12 = *(undefined8 *)(lVar25 + 0x38);
            *(float *)(lVar25 + 0x30) = (float)(int)((float)uVar11 * fVar46);
            *(float *)(lVar25 + 0x34) = (float)(int)((float)(uVar11 >> 0x20) * fVar46);
            *(float *)(lVar25 + 0x38) = (float)(int)((float)uVar12 * fVar46);
            *(float *)(lVar25 + 0x3c) = (float)(int)((float)((ulonglong)uVar12 >> 0x20) * fVar46);
          }
        }
      }
      else if (*(char *)(uVar32 + 0xfc) == '\0') {
LAB_7ff70c81f4ad:
        uVar31 = *(ulonglong *)(uVar32 + 0x148c);
        auVar57._8_8_ = 0;
        auVar57._0_8_ = uVar31;
        auVar58 = divps(auVar57,_DAT_7ff70cb1d7b0);
        auVar51 = auVar66;
        if (*(char *)(uVar32 + 0xb6a) != '\0') {
          auVar51 = ZEXT816(0);
          auVar37 = auVar66;
        }
        auVar66 = insertps(auVar37,auVar51,0x10);
        auVar42._0_4_ = _DAT_7ff70cb1bac0 & (uint)auVar66._0_4_;
        auVar42._4_4_ = _UNK_7ff70cb1bac4 & (uint)auVar66._4_4_;
        auVar42._8_4_ = _UNK_7ff70cb1bac8 & auVar66._8_4_;
        auVar42._12_4_ = _UNK_7ff70cb1bacc & auVar66._12_4_;
        auVar37 = divps(auVar42,_DAT_7ff70cb1d7b0);
        *(ulonglong *)(uVar32 + 0x148c) =
             CONCAT44(((float)(uVar31 >> 0x20) - auVar58._4_4_) + auVar37._4_4_,
                      ((float)uVar31 - auVar58._0_4_) + auVar37._0_4_);
        fVar46 = auVar66._0_4_ + (float)*(undefined8 *)(uVar32 + 0x1484);
        fVar36 = auVar66._4_4_ + (float)((ulonglong)*(undefined8 *)(uVar32 + 0x1484) >> 0x20);
        *(undefined8 *)(uVar32 + 0x1484) = 0;
        if (((fVar46 != 0.0) || (fVar36 != 0.0)) || (NAN(fVar36))) {
          if (lVar27 == 0) {
            if ((fVar46 != 0.0) || (NAN(fVar46))) {
              lVar24 = *(longlong *)(uVar11 + 0x1448);
              uVar19 = *(uint *)(lVar24 + 0x14);
              uVar23 = uVar19 & 0x1000000;
              lVar25 = lVar24;
              uVar8 = uVar19;
              uVar6 = uVar23;
              while ((uVar6 != 0 &&
                     (((uVar8 & 0x210) == 0x10 ||
                      ((*(float *)(lVar25 + 0xa0) == 0.0 && (!NAN(*(float *)(lVar25 + 0xa0)))))))))
              {
                lVar25 = *(longlong *)(lVar25 + 0x3b0);
                uVar8 = *(uint *)(lVar25 + 0x14);
                uVar6 = uVar8 & 0x1000000;
              }
              if ((fVar36 == 0.0) && (lVar27 = lVar25, !NAN(fVar36))) goto LAB_7ff70c81f601;
            }
            else {
              if ((fVar36 == 0.0) && (!NAN(fVar36))) goto LAB_7ff70c81f154;
              lVar24 = *(longlong *)(uVar11 + 0x1448);
              uVar19 = *(uint *)(lVar24 + 0x14);
              uVar23 = uVar19 & 0x1000000;
              lVar25 = 0;
            }
            while ((uVar23 != 0 &&
                   (((uVar19 & 0x210) == 0x10 ||
                    ((*(float *)(lVar24 + 0xa4) == 0.0 && (!NAN(*(float *)(lVar24 + 0xa4))))))))) {
              lVar24 = *(longlong *)(lVar24 + 0x3b0);
              uVar19 = *(uint *)(lVar24 + 0x14);
              uVar23 = uVar19 & 0x1000000;
            }
            lVar27 = lVar24;
            if ((((fVar36 != 0.0) || (NAN(fVar36))) && (lVar25 != 0)) && (lVar25 != lVar24)) {
              if (*(int *)(uVar11 + 0x1478) == -1) {
                *(int *)(uVar11 + 0x1478) = *(int *)(uVar11 + 5000);
                if ((fVar46 == 0.0) && (!NAN(fVar46))) goto LAB_7ff70c820df0;
              }
              else if (((fVar46 == 0.0) && (!NAN(fVar46))) ||
                      (*(int *)(uVar11 + 0x1478) != *(int *)(uVar11 + 5000))) {
LAB_7ff70c820df0:
                fVar47 = *(float *)(uVar11 + 0x148c);
                pfVar15 = (float *)(uVar11 + 0x1490);
                if ((fVar47 != *pfVar15) || (NAN(fVar47) || NAN(*pfVar15))) {
                  lVar27 = lVar25;
                  if (fVar47 < *pfVar15 || fVar47 == *pfVar15) {
                    lVar27 = lVar24;
                  }
                  goto LAB_7ff70c81f601;
                }
              }
              *(ulonglong *)(uVar11 + 0x1484) = CONCAT44(fVar36,fVar46);
              goto LAB_7ff70c81f154;
            }
          }
LAB_7ff70c81f601:
          if ((*(ushort *)(lVar27 + 0x14) & 0x210) == 0) {
            if ((fVar46 != 0.0) || (NAN(fVar46))) {
              fVar47 = *(float *)(lVar27 + 0xa0);
              if ((fVar36 != 0.0) || (NAN(fVar36))) {
                fVar60 = *(float *)(lVar27 + 0xa4);
                bVar34 = fVar60 != 0.0;
                if (fVar47 != 0.0 && bVar34) {
                  if (*(float *)(uVar32 + 0x148c) < *(float *)(uVar32 + 0x1490) ||
                      *(float *)(uVar32 + 0x148c) == *(float *)(uVar32 + 0x1490))
                  goto LAB_7ff70c820e28;
                  goto LAB_7ff70c820d4e;
                }
                if ((fVar47 == 0.0) && (!NAN(fVar47))) goto LAB_7ff70c820e20;
              }
              else {
                if ((fVar47 == 0.0) && (!NAN(fVar47))) goto LAB_7ff70c81f154;
LAB_7ff70c820d4e:
                bVar34 = false;
              }
              uStack_f0 = 0x7ff70c820d70;
              FUN_7ff70c870ea0(lVar27);
              fVar60 = (*(float *)(lVar27 + 0x228) - *(float *)(lVar27 + 0x220)) * _DAT_7ff70cb1d7c0
              ;
              fVar47 = *(float *)(lVar27 + 0x2c0) + *(float *)(lVar27 + 0x2c0);
              if (fVar60 <= fVar47) {
                fVar47 = fVar60;
              }
              *(float *)(lVar27 + 0xa8) = *(float *)(lVar27 + 0x98) - (float)(int)fVar47 * fVar46;
              *(undefined4 *)(lVar27 + 0xb0) = 0;
              *(undefined4 *)(lVar27 + 0xb8) = 0;
              *(undefined4 *)(uVar32 + 0x147c) = *(undefined4 *)(uVar32 + 5000);
              if (bVar34) {
LAB_7ff70c820e28:
                uStack_f0 = 0x7ff70c820e33;
                FUN_7ff70c870ea0(lVar27);
                fVar47 = (*(float *)(lVar27 + 0x22c) - *(float *)(lVar27 + 0x224)) *
                         _DAT_7ff70cb1d7c0;
                fVar46 = *(float *)(lVar27 + 0x2c0) * _DAT_7ff70cb1c678;
                if (fVar47 <= fVar46) {
                  fVar46 = fVar47;
                }
                *(float *)(lVar27 + 0xac) = *(float *)(lVar27 + 0x9c) - (float)(int)fVar46 * fVar36;
                *(undefined4 *)(lVar27 + 0xb4) = 0;
                *(undefined4 *)(lVar27 + 0xbc) = 0;
                *(undefined4 *)(uVar32 + 0x147c) = *(undefined4 *)(uVar32 + 5000);
              }
            }
            else if ((fVar36 != 0.0) || (NAN(fVar36))) {
              fVar60 = *(float *)(lVar27 + 0xa4);
LAB_7ff70c820e20:
              if ((fVar60 != 0.0) || (NAN(fVar60))) goto LAB_7ff70c820e28;
            }
          }
        }
      }
    }
  }
LAB_7ff70c81f154:
  iVar9 = *(int *)(uVar28 + 0x22c0);
  if (0 < iVar9) {
    lVar25 = 0;
    lVar27 = 0;
    do {
      fVar46 = *(float *)(*(longlong *)(uVar28 + 0x22c8) + lVar27 * 4);
      if ((0.0 <= fVar46) && (fVar46 < fVar35)) {
        uStack_f0 = 0x7ff70c81f1aa;
        FUN_7ff70c9103f0(*(longlong *)(uVar28 + 0x22a0) + lVar25);
        iVar9 = *(int *)(uVar28 + 0x22c0);
      }
      lVar27 = lVar27 + 1;
      lVar25 = lVar25 + 0x250;
    } while (lVar27 < iVar9);
  }
  if ((longlong)*(int *)(uVar28 + 0x2288) != 0) {
    lVar25 = *(longlong *)(uVar28 + 0x2290);
    lVar27 = (longlong)*(int *)(uVar28 + 0x2288) * 0x88;
    do {
      if ((0.0 <= *(float *)(lVar25 + 4)) && (*(float *)(lVar25 + 4) < fVar35)) {
        uStack_f0 = 0x7ff70c81f208;
        FUN_7ff70c910500(lVar25);
      }
      lVar25 = lVar25 + 0x88;
      lVar27 = lVar27 + -0x88;
    } while (lVar27 != 0);
  }
  uVar32 = _DAT_7ff70cc1a3c0;
  if (*(char *)(uVar28 + 0x139a) != '\0') {
    lVar25 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f38);
    if (lVar25 != 0) {
      *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1f30) = 0;
      lVar27 = (longlong)*(short *)(uVar32 + 0x2870);
      if (*(int *)(uVar32 + 0x2874 + lVar27 * 8) == *(int *)(uVar32 + 5000)) {
        sVar18 = *(short *)(uVar32 + 0x287a + lVar27 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(uVar32 + 0x2870) + 1) % 6;
        *(short *)(uVar32 + 0x2870) = (short)iVar9;
        lVar27 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *(int *)(uVar32 + 5000);
        *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x287a + lVar27 * 8) = sVar18;
      *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      uStack_f0 = 0x7ff70c81f548;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(uVar32 + 0x1f38) = 0;
    }
    lVar25 = *(longlong *)(uVar32 + 0x1f48);
    if (lVar25 != 0) {
      *(undefined8 *)(uVar32 + 8000) = 0;
      uVar11 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar11 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar11 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar11 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81f6e2;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(uVar32 + 0x1f48) = 0;
    }
    *(undefined4 *)(uVar32 + 0x23a0) = 0;
    iVar9 = *(int *)(uVar32 + 0x23a8);
    if (0 < iVar9) {
      lVar27 = 8;
      lVar25 = 0;
      do {
        uVar11 = _DAT_7ff70cc1a3c0;
        lVar24 = *(longlong *)(*(longlong *)(uVar32 + 0x23b0) + lVar27);
        if (lVar24 != 0) {
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
            }
            else {
              iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
              lVar13 = (longlong)iVar9;
              *(int *)(uVar11 + 0x2874 + lVar13 * 8) = *piVar1;
              *(undefined4 *)(uVar11 + 0x2878 + lVar13 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar11 + 0x287a + lVar13 * 8) = sVar18;
            *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c81f776;
          (*_DAT_7ff70cbe9468)(lVar24,_DAT_7ff70cc1a3d0);
          iVar9 = *(int *)(uVar32 + 0x23a8);
        }
        lVar25 = lVar25 + 1;
        lVar27 = lVar27 + 0x60;
      } while (lVar25 < iVar9);
    }
    lVar25 = *(longlong *)(uVar32 + 0x23b0);
    if (lVar25 != 0) {
      *(undefined8 *)(uVar32 + 0x23a8) = 0;
      uVar11 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar11 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar11 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar11 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81f891;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(uVar32 + 0x23b0) = 0;
    }
    uStack_f0 = 0x7ff70c81f8a1;
    FUN_7ff70c910550();
    iVar9 = *(int *)(uVar32 + 0x1110);
    if ((longlong)iVar9 != 0) {
      lVar25 = *(longlong *)(uVar32 + 0x1118);
      lVar27 = 0;
      do {
        uStack_f0 = 0x7ff70c81f8c9;
        FUN_7ff70c7c8240(*(undefined8 *)(lVar25 + lVar27));
        lVar27 = lVar27 + 8;
      } while ((longlong)iVar9 * 8 != lVar27);
    }
  }
  *(undefined1 *)(uVar28 + 0x139a) = 0;
  if ((*(longlong *)(uVar28 + 0x1f98) != 0) &&
     (*(char *)(*(longlong *)(uVar28 + 0x1f98) + 0xcd) == '\0')) {
    if (0 < *(int *)(_DAT_7ff70cc1a3c0 + 0x13f0)) {
      lVar25 = (ulonglong)(*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) - 1) + 1;
      do {
        lVar27 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + -8 + lVar25 * 8);
        if (((lVar27 != 0) && (*(char *)(lVar27 + 0xcd) == '\x01')) &&
           ((~*(uint *)(lVar27 + 0x14) & 0x10200) != 0)) goto LAB_7ff70c81f93c;
        lVar27 = lVar25 + -1;
        bVar34 = 0 < lVar25;
        lVar25 = lVar27;
      } while (lVar27 != 0 && bVar34);
    }
    lVar27 = 0;
LAB_7ff70c81f93c:
    uStack_f0 = 0x7ff70c81f946;
    FUN_7ff70c819c70(lVar27,1);
  }
  if (*(int *)(uVar28 + 0x1414) < 0) {
    uStack_f0 = 0x7ff70c81f9b7;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar32 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar32 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar32 + 0x2868) = *(int *)(uVar32 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar28 + 0x1418) != 0) {
      uStack_f0 = 0x7ff70c81fa67;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar28 + 0x1418),
                       (longlong)*(int *)(uVar28 + 0x1410) * 0x78);
      uVar32 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar28 + 0x1418);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar32 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81fb19;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar28 + 0x1418) = uVar12;
    *(undefined4 *)(uVar28 + 0x1414) = 0;
    *(undefined4 *)(uVar28 + 0x1410) = 0;
    if (-1 < *(int *)(uVar28 + 0x1f64)) goto LAB_7ff70c81f96c;
LAB_7ff70c81fb48:
    uStack_f0 = 0x7ff70c81fb57;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar32 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar32 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar32 + 0x2868) = *(int *)(uVar32 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar28 + 0x1f68) != 0) {
      uStack_f0 = 0x7ff70c81fc07;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar28 + 0x1f68),
                       (longlong)*(int *)(uVar28 + 0x1f60) * 0x38);
      uVar32 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar28 + 0x1f68);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar32 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81fcb9;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar28 + 0x1f68) = uVar12;
    *(undefined4 *)(uVar28 + 0x1f64) = 0;
    *(undefined4 *)(uVar28 + 0x1f60) = 0;
    iVar9 = *(int *)(uVar28 + 0x1f34);
    if (-1 < iVar9) goto LAB_7ff70c81f987;
LAB_7ff70c81fce8:
    uStack_f0 = 0x7ff70c81fcf7;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar32 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar32 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar32 + 0x2868) = *(int *)(uVar32 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar28 + 0x1f38) != 0) {
      uStack_f0 = 0x7ff70c81fda7;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar28 + 0x1f38),
                       (longlong)*(int *)(uVar28 + 0x1f30) << 2);
      uVar32 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar28 + 0x1f38);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar32 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81fe59;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar28 + 0x1f38) = uVar12;
    *(undefined8 *)(uVar28 + 0x1f30) = 0;
LAB_7ff70c81fe6d:
    uStack_f0 = 0x7ff70c81fe7f;
    lVar25 = (*_DAT_7ff70cbe9460)(0x20,_DAT_7ff70cc1a3d0);
    uVar32 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar27 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar27 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *piVar1;
        *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x2878 + lVar27 * 8) = sVar18;
      *(int *)(uVar32 + 0x2868) = *(int *)(uVar32 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar28 + 0x1f38) != 0) {
      uStack_f0 = 0x7ff70c81ff2f;
      FUN_7ff70cb12b60(lVar25,*(longlong *)(uVar28 + 0x1f38),
                       (longlong)*(int *)(uVar28 + 0x1f30) << 2);
      uVar32 = _DAT_7ff70cc1a3c0;
      lVar27 = *(longlong *)(uVar28 + 0x1f38);
      if ((lVar27 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar24 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar24 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar24 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar24 = (longlong)iVar9;
          *(int *)(uVar32 + 0x2874 + lVar24 * 8) = *piVar1;
          *(undefined4 *)(uVar32 + 0x2878 + lVar24 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar32 + 0x287a + lVar24 * 8) = sVar18;
        *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c81ffe1;
      (*_DAT_7ff70cbe9468)(lVar27,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(uVar28 + 0x1f38) = lVar25;
    *(undefined4 *)(uVar28 + 0x1f34) = 8;
    lVar27 = (longlong)*(int *)(uVar28 + 0x1f30);
  }
  else {
    *(undefined4 *)(uVar28 + 0x1410) = 0;
    if (*(int *)(uVar28 + 0x1f64) < 0) goto LAB_7ff70c81fb48;
LAB_7ff70c81f96c:
    *(undefined4 *)(uVar28 + 0x1f60) = 0;
    iVar9 = *(int *)(uVar28 + 0x1f34);
    if (iVar9 < 0) goto LAB_7ff70c81fce8;
LAB_7ff70c81f987:
    *(undefined4 *)(uVar28 + 0x1f30) = 0;
    if (iVar9 == 0) goto LAB_7ff70c81fe6d;
    lVar25 = *(longlong *)(uVar28 + 0x1f38);
    lVar27 = 0;
  }
  *(undefined4 *)(lVar25 + lVar27 * 4) = 0x10;
  iVar9 = *(int *)(uVar28 + 0x1f30);
  *(int *)(uVar28 + 0x1f30) = iVar9 + 1;
  *(undefined4 *)(uVar28 + 0x1de0) =
       *(undefined4 *)(*(longlong *)(uVar28 + 0x1f38) + (longlong)iVar9 * 4);
  if (*(int *)(uVar28 + 0x1f44) < 0) {
    uStack_f0 = 0x7ff70c820049;
    uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    uVar32 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
      }
      else {
        iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
        lVar25 = (longlong)iVar9;
        *(int *)(uVar32 + 0x2874 + lVar25 * 8) = *piVar1;
        *(undefined4 *)(uVar32 + 0x2878 + lVar25 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(uVar32 + 0x2878 + lVar25 * 8) = sVar18;
      *(int *)(uVar32 + 0x2868) = *(int *)(uVar32 + 0x2868) + 1;
    }
    if (*(longlong *)(uVar28 + 0x1f48) != 0) {
      uStack_f0 = 0x7ff70c8200f9;
      FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar28 + 0x1f48),
                       (longlong)*(int *)(uVar28 + 8000) * 0x38);
      uVar32 = _DAT_7ff70cc1a3c0;
      lVar25 = *(longlong *)(uVar28 + 0x1f48);
      if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
          lVar27 = (longlong)iVar9;
          *(int *)(uVar32 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(uVar32 + 0x2878 + lVar27 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(uVar32 + 0x287a + lVar27 * 8) = sVar18;
        *(int *)(uVar32 + 0x286c) = *(int *)(uVar32 + 0x286c) + 1;
      }
      uStack_f0 = 0x7ff70c8201ab;
      (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(uVar28 + 0x1f48) = uVar12;
    *(undefined4 *)(uVar28 + 0x1f44) = 0;
  }
  *(undefined4 *)(uVar28 + 8000) = 0;
  uVar32 = _DAT_7ff70cc1a3c0;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x27f4) = 0;
  if (*(char *)(uVar32 + 0x27f1) == '\x01') {
    iVar9 = *(int *)(uVar32 + 0x14a0);
    *(undefined4 *)(uVar32 + 0x23f8) = 7;
    if ((*(char *)(uVar32 + 0x1e4) == '\x01') &&
       (fVar35 = *(float *)(uVar32 + 0x1e8), 0.0 <= fVar35)) {
      if ((fVar35 == 0.0) && (!NAN(fVar35))) goto LAB_7ff70c8203e9;
      fVar46 = *(float *)(uVar32 + 0x74);
      if (fVar46 < fVar35) {
        fVar36 = fVar35 - *(float *)(uVar32 + 0x20);
        if (fVar36 < fVar35) {
          fVar47 = *(float *)(uVar32 + 0x78);
          if (fVar47 <= 0.0) {
            if ((fVar46 <= fVar35) && (fVar36 < fVar46)) goto LAB_7ff70c8203e9;
          }
          else {
            auVar37 = insertps(ZEXT416((uint)fVar35),ZEXT416((uint)fVar36),0x10);
            auVar61._0_4_ = auVar37._0_4_ - fVar46;
            auVar61._4_4_ = auVar37._4_4_ - fVar46;
            auVar61._8_4_ = auVar37._8_4_ - 0.0;
            auVar61._12_4_ = auVar37._12_4_ - 0.0;
            auVar43._4_4_ = fVar47;
            auVar43._0_4_ = fVar47;
            auVar43._8_8_ = 0;
            auVar37 = divps(auVar61,auVar43);
            if (((int)((uint)(fVar36 < fVar46) << 0x1f) >> 0x1f | (int)auVar37._4_4_) <
                ((int)((uint)(fVar35 < fVar46) << 0x1f) >> 0x1f | (int)auVar37._0_4_)) {
LAB_7ff70c8203e9:
              if (*(char *)(uVar32 + 0x15e4) == '\0') {
                *(undefined1 *)(uVar32 + 0x27f1) = 0;
              }
            }
          }
        }
      }
    }
    iVar22 = *(int *)(uVar32 + 0x100);
    if (iVar22 == 0x3000) {
      if (((*(char *)(uVar32 + 0xe8) == '\x01') && (*(float *)(uVar32 + 0xb6c) == 0.0)) &&
         ((!NAN(*(float *)(uVar32 + 0xb6c)) && (*(char *)(uVar32 + 0x1bfc) == '\0')))) {
        *(undefined1 *)(uVar32 + 0x27f2) = 0;
      }
      if (((*(char *)(uVar32 + 0xe9) == '\x01') && (*(float *)(uVar32 + 0xb70) == 0.0)) &&
         ((!NAN(*(float *)(uVar32 + 0xb70)) && (*(char *)(uVar32 + 0x1c08) == '\0')))) {
        *(undefined1 *)(uVar32 + 0x27f2) = 1;
      }
      if ((((*(char *)(uVar32 + 0xea) == '\x01') && (*(float *)(uVar32 + 0xb74) == 0.0)) &&
          (!NAN(*(float *)(uVar32 + 0xb74)))) && (*(char *)(uVar32 + 0x1c14) == '\0')) {
        *(undefined1 *)(uVar32 + 0x27f2) = 2;
      }
    }
    else {
      uVar11 = (ulonglong)*(byte *)(uVar32 + 0x27f2);
      if (((*(char *)(uVar32 + 0xe8 + uVar11) == '\x01') &&
          (fVar35 = *(float *)(uVar32 + 0xb6c + uVar11 * 4), fVar35 == 0.0)) && (!NAN(fVar35))) {
        bVar34 = true;
        if (*(byte *)(uVar32 + 0x27f2) < 0xb) {
          bVar34 = *(char *)(uVar32 + 0x1bfc + uVar11 * 0xc) == '\0';
        }
        if ((bool)(iVar9 != 0 & bVar34)) {
          *(int *)(uVar32 + 0x27f4) = iVar9;
          *(undefined1 *)(uVar32 + 0x27f1) = 0;
        }
      }
    }
    uVar8 = *(uint *)(uVar32 + 0x1e70);
    uVar19 = uVar8 | 0x40;
    *(uint *)(uVar32 + 0x1e70) = uVar19;
    *(undefined4 *)(uVar32 + 0x1ed8) = 0x3f333333;
    if ((*(char *)(uVar32 + 0x21b1) == '\0') && (*(char *)(uVar32 + 0x21b2) != '\x01')) {
      sVar18 = *(short *)(uVar32 + 0x25a2);
      puVar29 = &UNK_7ff70cb88969;
LAB_7ff70c82065a:
      uStack_f0 = 0x7ff70c82066f;
      FUN_7ff70c802a20(&lStack_b8,0x20,puVar29,(int)sVar18);
    }
    else {
      if ((uVar8 & 1) == 0) {
        fVar35 = *(float *)(uVar32 + 0xd44);
        if (*(int *)(uVar32 + 0xf8) == 1) {
          fVar36 = fVar35 * 0.0;
          uVar12 = _DAT_7ff70cb1d730;
          fVar46 = _DAT_7ff70cb1d728;
        }
        else {
          fVar36 = fVar35 * _DAT_7ff70cb1d724;
          uVar12 = 0;
          fVar46 = _DAT_7ff70cb1d720;
        }
        uVar19 = uVar8 | 0x41;
        *(float *)(uVar32 + 0x1e80) = *(float *)(uVar32 + 0xe0) + fVar36;
        *(float *)(uVar32 + 0x1e84) = *(float *)(uVar32 + 0xe4) + fVar46 * fVar35;
        *(undefined8 *)(uVar32 + 0x1e88) = uVar12;
        *(undefined4 *)(uVar32 + 0x1e74) = 1;
      }
      fVar35 = *(float *)(uVar32 + 0xda0) * _DAT_7ff70cb1d740;
      *(uint *)(uVar32 + 0x1e70) = uVar19;
      *(float *)(uVar32 + 0x1ed8) = fVar35;
      puVar29 = &UNK_7ff70cb88951;
      uStack_f0 = 0x7ff70c82061e;
      FUN_7ff70c802a20(&lStack_b8,0x20,&UNK_7ff70cb88951,(int)*(short *)(uVar32 + 0x25a2));
      lVar25 = *(longlong *)(uVar32 + 0x25a8);
      if ((lVar25 != 0) && (*(char *)(lVar25 + 0xcc) == '\x01')) {
        *(undefined1 *)(lVar25 + 0xd1) = 1;
        *(undefined1 *)(lVar25 + 0xd4) = 1;
        *(undefined1 *)(lVar25 + 0xec) = 1;
        sVar18 = *(short *)(uVar32 + 0x25a2) + 1;
        *(short *)(uVar32 + 0x25a2) = sVar18;
        goto LAB_7ff70c82065a;
      }
    }
    uStack_f0 = 0x7ff70c820680;
    FUN_7ff70c826d00(&lStack_b8,0,0x2030347);
    uStack_f0 = 0x7ff70c82068e;
    FUN_7ff70c876e30(&UNK_7ff70cb89736,iVar9);
    uStack_f0 = 0x7ff70c82069a;
    FUN_7ff70c876e30(&UNK_7ff70cb8d10e);
    if (iVar22 == 0x3000) {
      uStack_f0 = 0x7ff70c8206af;
      FUN_7ff70c876e30(&UNK_7ff70cb8cb81);
    }
    else {
      uStack_f0 = 0x7ff70c8206eb;
      FUN_7ff70c876f70(_DAT_7ff70cc1a3c0 + (ulonglong)(iVar9 == 0) * 0x10 + 0xd54,&UNK_7ff70cb8e3c5,
                       *(undefined8 *)
                        (&UNK_7ff70cb1d200 + (ulonglong)*(byte *)(uVar32 + 0x27f2) * 8));
    }
    uStack_f0 = 0x7ff70c8206f0;
    FUN_7ff70c833070();
    uVar32 = _DAT_7ff70cc1a3c0;
  }
  *(undefined4 *)(uVar32 + 0x1498) = 0;
  if (*(int *)(uVar32 + 5000) == *(int *)(uVar32 + 0x2830) + 1) {
    iVar9 = *(int *)(uVar32 + 0x14a0);
    if (iVar9 == 0) {
      iVar9 = *(int *)(uVar32 + 0x14b4);
      if (*(int *)(uVar32 + 0x2838) != iVar9) goto LAB_7ff70c820749;
    }
    else if (*(int *)(uVar32 + 0x2838) != iVar9) {
LAB_7ff70c820749:
      *(int *)(uVar32 + 0x2838) = iVar9;
      *(undefined4 *)(uVar32 + 0x2834) = 0xffffffff;
      if (*(int *)(uVar32 + 0x2844) < 0) {
        uStack_f0 = 0x7ff70c820778;
        uVar12 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
        uVar11 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
            sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar25 * 8) + 1;
          }
          else {
            iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
            lVar25 = (longlong)iVar22;
            *(int *)(uVar11 + 0x2874 + lVar25 * 8) = *piVar1;
            *(undefined4 *)(uVar11 + 0x2878 + lVar25 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(uVar11 + 0x2878 + lVar25 * 8) = sVar18;
          *(int *)(uVar11 + 0x2868) = *(int *)(uVar11 + 0x2868) + 1;
        }
        if (*(longlong *)(uVar32 + 0x2848) != 0) {
          uStack_f0 = 0x7ff70c82082a;
          FUN_7ff70cb12b60(uVar12,*(longlong *)(uVar32 + 0x2848),
                           (longlong)*(int *)(uVar32 + 0x2840) * 0x48);
          uVar11 = _DAT_7ff70cc1a3c0;
          lVar25 = *(longlong *)(uVar32 + 0x2848);
          if ((lVar25 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
            }
            else {
              iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
              lVar27 = (longlong)iVar22;
              *(int *)(uVar11 + 0x2874 + lVar27 * 8) = *piVar1;
              *(undefined4 *)(uVar11 + 0x2878 + lVar27 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(uVar11 + 0x287a + lVar27 * 8) = sVar18;
            *(int *)(uVar11 + 0x286c) = *(int *)(uVar11 + 0x286c) + 1;
          }
          uStack_f0 = 0x7ff70c8208db;
          (*_DAT_7ff70cbe9468)(lVar25,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(uVar32 + 0x2848) = uVar12;
        *(undefined4 *)(uVar32 + 0x2844) = 0;
      }
      *(undefined4 *)(uVar32 + 0x2840) = 0;
    }
    if (iVar9 != 0) {
      uVar8 = *(uint *)(uVar32 + 0x2834);
      lVar25 = (longlong)(int)uVar8;
      if (lVar25 < 0) {
        if (uVar8 == 0xffffffff) {
          *(int *)(uVar32 + 0x1498) = iVar9;
        }
      }
      else {
        if (((int)uVar8 < *(int *)(uVar32 + 0x2840)) &&
           ((*(char *)(*(longlong *)(uVar32 + 0x2848) + 5 + lVar25 * 0x48) != '\0' ||
            ('\x02' < *(char *)(*(longlong *)(uVar32 + 0x2848) + lVar25 * 0x48 + 4))))) {
          uVar8 = uVar8 + 1;
          *(uint *)(uVar32 + 0x2834) = uVar8;
        }
        if ((int)uVar8 < *(int *)(uVar32 + 0x2840)) {
          *(undefined4 *)(uVar32 + 0x1498) =
               *(undefined4 *)(*(longlong *)(uVar32 + 0x2848) + (ulonglong)uVar8 * 0x48);
          pcVar16 = (char *)(*(longlong *)(uVar32 + 0x2848) + 4 + (ulonglong)uVar8 * 0x48);
          *pcVar16 = *pcVar16 + '\x01';
        }
      }
    }
  }
  uVar32 = _DAT_7ff70cc1a3c0;
  puVar26 = (ulonglong *)auStack_e8;
  if (0.0 < *(float *)(_DAT_7ff70cc1a3c0 + 0x27f8)) {
    lVar25 = _DAT_7ff70cc1a3c0 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1eec) * 0x10;
    uStack_f0 = 0x7ff70c8209ac;
    auVar44._0_8_ = (*_DAT_7ff70cb965c8)(*(float *)(_DAT_7ff70cc1a3c0 + 0x27f8) * _DAT_7ff70cb1d5f4)
    ;
    fVar46 = _DAT_7ff70cb1ba70;
    fVar35 = _DAT_7ff70cb1ba2c;
    auVar44._8_8_ = extraout_XMM0_Qb;
    auVar45._4_12_ = auVar44._4_12_;
    auVar45._0_4_ = (float)auVar44._0_8_ * _DAT_7ff70cb1ba70 + _DAT_7ff70cb1ba70;
    uStack_f0 = uVar32;
    fVar60 = (float)func_0x7ff70d92a958(auVar45._0_8_);
    fVar60 = fVar60 / _DAT_7ff70cb1d5fc;
    fVar47 = (fVar35 - (fVar60 - (float)(int)fVar60) * fVar46) * fVar46;
    fVar36 = _DAT_7ff70cb1c67c;
    if ((uint)(int)fVar60 < 5) {
      fVar35 = (fVar35 - (fVar35 - (fVar60 - (float)(int)fVar60)) * fVar46) * fVar46;
      switch((int)fVar60) {
      case 0:
        fVar36 = fVar35;
        fVar47 = _DAT_7ff70cb1c67c;
        break;
      case 1:
        fVar46 = fVar47;
        fVar36 = _DAT_7ff70cb1ba70;
        fVar47 = _DAT_7ff70cb1c67c;
        break;
      case 2:
        fVar46 = _DAT_7ff70cb1c67c;
        fVar36 = _DAT_7ff70cb1ba70;
        fVar47 = fVar35;
        break;
      case 3:
        fVar46 = _DAT_7ff70cb1c67c;
        fVar36 = fVar47;
        fVar47 = _DAT_7ff70cb1ba70;
        break;
      case 4:
        fVar46 = fVar35;
        fVar47 = _DAT_7ff70cb1ba70;
      }
    }
    *(float *)(lVar25 + 0xd54) = fVar46;
    *(float *)(lVar25 + 0xd58) = fVar36;
    *(float *)(lVar25 + 0xd5c) = fVar47;
    *(undefined4 *)(uVar32 + 0xd60 + (longlong)*(int *)(uVar32 + 0x1eec) * 0x10) = 0x3f800000;
    fVar35 = *(float *)(uVar32 + 0x27f8) - *(float *)(uVar32 + 0x20);
    *(float *)(uVar32 + 0x27f8) = fVar35;
    uVar32 = _DAT_7ff70cc1a3c0;
    puVar26 = &uStack_f0;
    if (fVar35 <= 0.0) {
      if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1eec) != 0x3a) {
        uVar12 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x2804);
        puVar3 = (undefined8 *)
                 (_DAT_7ff70cc1a3c0 + 0xd54 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1eec) * 0x10)
        ;
        *puVar3 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x27fc);
        puVar3[1] = uVar12;
      }
      *(undefined4 *)(uVar32 + 0x1eec) = 0x3a;
      puVar26 = &uStack_f0;
    }
  }
  if ((*(char *)(uVar28 + 0x27e9) != '\0') &&
     (cVar21 = *(char *)(uVar28 + 0x27e9) + -1, *(char *)(uVar28 + 0x27e9) = cVar21, cVar21 == '\0')
     ) {
    *(undefined4 *)(uVar28 + 0x1de4) = 0;
    *(undefined1 *)(uVar28 + 0x27ea) = 0;
  }
  if ((*(char *)(uVar28 + 0x27e8) != '\0') &&
     (cVar21 = *(char *)(uVar28 + 0x27e8) + -1, *(char *)(uVar28 + 0x27e8) = cVar21, cVar21 == '\0')
     ) {
    *(undefined8 *)((longlong)puVar26 + -8) = 0x7ff70c820b44;
    FUN_7ff70c800cf0(&UNK_7ff70cb91862);
    *(uint *)(uVar28 + 0x27b4) = *(uint *)(uVar28 + 0x27b4) & ~*(uint *)(uVar28 + 0x27e4);
    *(undefined4 *)(uVar28 + 0x27e4) = 0;
  }
  *(undefined1 *)(uVar28 + 0x1399) = 1;
  uVar32 = _DAT_7ff70cc1a3c0;
  *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 2;
  *(undefined8 *)(uVar32 + 0x1e90) = 0x43c8000043c80000;
  *(undefined4 *)(uVar32 + 0x1e78) = 4;
  *(undefined8 *)((longlong)puVar26 + -8) = 0x7ff70c820ba5;
  FUN_7ff70c826d00(&UNK_7ff70cb811a5,0,0);
  *(undefined4 *)(uVar28 + 0x278c) = 0;
  uVar32 = _DAT_7ff70cc1a3c0;
  *(undefined2 *)(uVar28 + 0x2790) = *(undefined2 *)(_DAT_7ff70cc1a3c0 + 0x1410);
  *(undefined2 *)(uVar28 + 0x2792) = *(undefined2 *)(*(longlong *)(uVar32 + 0x1440) + 0x108);
  *(undefined2 *)(uVar28 + 0x2794) = *(undefined2 *)(*(longlong *)(uVar32 + 0x1440) + 0x1a0);
  *(undefined2 *)(uVar28 + 0x2796) = *(undefined2 *)(uVar32 + 0x1ef0);
  *(undefined2 *)(uVar28 + 0x2798) = *(undefined2 *)(uVar32 + 0x1f00);
  *(undefined2 *)(uVar28 + 0x279a) = *(undefined2 *)(uVar32 + 0x1f10);
  *(undefined2 *)(uVar28 + 0x279c) = *(undefined2 *)(uVar32 + 0x1f20);
  *(undefined2 *)(uVar28 + 0x279e) = *(undefined2 *)(uVar32 + 8000);
  *(undefined2 *)(uVar28 + 0x27a0) = *(undefined2 *)(uVar32 + 0x1f30);
  *(undefined2 *)(uVar28 + 0x27a2) = *(undefined2 *)(uVar32 + 0x1f60);
  *(undefined2 *)(uVar28 + 0x27a4) = *(undefined2 *)(uVar32 + 0x25a0);
  cVar21 = -1;
  if (*(char *)(uVar28 + 0x84) == '\x01') {
    if (*(char *)(uVar28 + 0x27f0) == -1) {
      *(undefined1 *)(uVar28 + 0x27f0) = 0;
      iVar9 = *(int *)(uVar28 + 0x26b8);
      goto joined_r0x7ff70c820cd2;
    }
    sVar18 = (short)*(char *)(uVar28 + 0x27f0) + (ushort)((*(byte *)(uVar28 + 5000) & 3) == 0);
    uVar8 = sVar18 * 0x6667;
    cVar21 = (char)sVar18 + ((char)(uVar8 >> 0x12) - (char)((int)uVar8 >> 0x1f)) * -10;
  }
  *(char *)(uVar28 + 0x27f0) = cVar21;
  iVar9 = *(int *)(uVar28 + 0x26b8);
joined_r0x7ff70c820cd2:
  if ((longlong)iVar9 != 0) {
    lVar25 = *(longlong *)(uVar28 + 0x26c0);
    lVar27 = (longlong)iVar9 << 5;
    do {
      if (*(int *)(lVar25 + 4) == 1) {
        pcVar5 = *(code **)(lVar25 + 0x10);
        *(undefined8 *)((longlong)puVar26 + -8) = 0x7ff70c820d09;
        (*pcVar5)(uVar28,lVar25);
      }
      lVar25 = lVar25 + 0x20;
      lVar27 = lVar27 + -0x20;
    } while (lVar27 != 0);
  }
  return;
}


