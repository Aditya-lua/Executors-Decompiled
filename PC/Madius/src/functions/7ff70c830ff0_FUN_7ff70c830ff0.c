/* 7ff70c830ff0 FUN_7ff70c830ff0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c830ff0(void)

{
  short *psVar1;
  int *piVar2;
  undefined8 *puVar3;
  byte bVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  longlong lVar7;
  bool bVar8;
  char cVar9;
  char cVar10;
  uint uVar11;
  int iVar12;
  code *pcVar13;
  longlong lVar14;
  undefined8 uVar15;
  longlong *plVar16;
  ulonglong uVar17;
  short sVar18;
  int iVar19;
  uint *puVar20;
  longlong *plVar21;
  undefined *puVar22;
  uint *puVar23;
  char *pcVar24;
  char *pcVar25;
  longlong lVar26;
  uint uVar27;
  longlong lVar28;
  longlong lVar29;
  longlong lVar30;
  longlong lVar31;
  longlong lVar32;
  longlong lVar33;
  undefined4 uVar34;
  ulonglong uVar35;
  int iVar36;
  int iVar37;
  float fVar38;
  float fVar39;
  float fVar40;
  float fVar41;
  float fVar42;
  float fVar43;
  float fVar44;
  undefined4 unaff_XMM6_Da;
  undefined4 unaff_XMM6_Db;
  undefined4 unaff_XMM6_Dc;
  undefined4 unaff_XMM6_Dd;
  undefined4 unaff_XMM7_Dc;
  undefined4 unaff_XMM7_Dd;
  undefined1 auStack_c8 [24];
  undefined8 uStack_b0;
  longlong lStack_a0;
  longlong *plStack_98;
  longlong *plStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  ulonglong uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_50;
  
  lVar7 = _DAT_7ff70cc1a3c0;
  uStack_50 = CONCAT44(unaff_XMM7_Dd,unaff_XMM7_Dc);
  uStack_68 = CONCAT44(unaff_XMM6_Db,unaff_XMM6_Da);
  uStack_60 = CONCAT44(unaff_XMM6_Dd,unaff_XMM6_Dc);
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x138c) != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x1398) != '\0') {
      if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x26b8) != 0) {
        lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x26c0);
        lVar28 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x26b8) << 5;
        do {
          if (*(int *)(lVar29 + 4) == 2) {
            (**(code **)(lVar29 + 0x10))(lVar7,lVar29);
          }
          lVar29 = lVar29 + 0x20;
          lVar28 = lVar28 + -0x20;
        } while (lVar28 != 0);
      }
      lVar29 = _DAT_7ff70cc1a3c0;
      if (*(char *)(lVar7 + 0x7c) == '\x01') {
        iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1410);
        iVar19 = (int)*(short *)(lVar7 + 0x2790);
        if (iVar19 < iVar36) {
          do {
            if ((*(byte *)(*(longlong *)(lVar29 + 0x1440) + 0x17) & 1) == 0) {
              FUN_7ff70c80af70(&UNK_7ff70cb8f670);
              FUN_7ff70c833070();
            }
            else if ((*(longlong *)(lVar29 + 0x2278) == 0) ||
                    (*(longlong *)(*(longlong *)(lVar29 + 0x2278) + 0x188) !=
                     *(longlong *)(lVar29 + 0x1440))) {
              FUN_7ff70c80af70(&UNK_7ff70cb8f67e);
              FUN_7ff70c836f00();
            }
            else {
              FUN_7ff70c80af70(&UNK_7ff70cb8f625);
              FUN_7ff70c907fc0();
            }
            iVar36 = *(int *)(lVar29 + 0x1410);
            iVar19 = (int)*(short *)(lVar7 + 0x2790);
          } while (iVar19 < iVar36);
        }
        if (iVar36 == iVar19) {
          FUN_7ff70c83b170((short *)(lVar7 + 0x2790));
        }
      }
      FUN_7ff70c832c20();
      pcVar13 = *(code **)(lVar7 + 0xc08);
      if ((pcVar13 != (code *)0x0) &&
         (*(int *)(lVar7 + 0x265c) != *(int *)(lVar7 + 0x2648) ||
          *(undefined1 (*) [16])(lVar7 + 0x264c) != *(undefined1 (*) [16])(lVar7 + 0x2638))) {
        if ((*(byte *)(lVar7 + 0x27b4) & 0x80) != 0) {
          FUN_7ff70c800cf0(&UNK_7ff70cb9193d,*(undefined1 *)(lVar7 + 0x2638),
                           (double)*(float *)(lVar7 + 0x263c),(double)*(float *)(lVar7 + 0x2640));
          pcVar13 = *(code **)(lVar7 + 0xc08);
        }
        (*pcVar13)(lVar7,**(undefined8 **)(_DAT_7ff70cc1a3c0 + 0x1f88),lVar7 + 0x2638);
      }
      *(uint *)(lVar7 + 0x29a8) = (uint)*(byte *)(lVar7 + 0x2639);
      *(undefined1 *)(lVar7 + 0x1399) = 0;
      lVar29 = *(longlong *)(lVar7 + 0x1440);
      if ((lVar29 != 0) && (*(char *)(lVar29 + 0xce) == '\0')) {
        *(undefined1 *)(lVar29 + 0xcc) = 0;
      }
      FUN_7ff70c833070();
      lVar29 = _DAT_7ff70cc1a3c0;
      if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2170) != 0) &&
         (_DAT_7ff70cb1d880 < *(float *)(_DAT_7ff70cc1a3c0 + 0x2188) ||
          _DAT_7ff70cb1d880 == *(float *)(_DAT_7ff70cc1a3c0 + 0x2188))) {
        if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2180) == 0) {
          pcVar24 = "NavWindowingOverlay";
          uVar11 = 0xffffffff;
          do {
            cVar9 = pcVar24[-2];
            if (cVar9 == '#') {
              if ((pcVar24[-1] == '#') && (*pcVar24 == '#')) {
                uVar11 = 0xffffffff;
              }
            }
            else if (cVar9 == '\0') goto LAB_7ff70c831427;
            uVar11 = crc32(uVar11,cVar9);
            pcVar24 = pcVar24 + 1;
          } while( true );
        }
        goto LAB_7ff70c83148f;
      }
      goto LAB_7ff70c8312ad;
    }
    if (_DAT_7ff70cbebd80 != (uStack_70 ^ (ulonglong)auStack_c8)) goto LAB_7ff70c832aff;
    lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
      if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
        if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
          *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
          goto LAB_7ff70c80aff6;
        }
        uStack_b0 = 0x7ff70c80b02f;
        FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                         *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
        bVar4 = *(byte *)(lVar7 + 0x27b4);
      }
      else {
LAB_7ff70c80aff6:
        bVar4 = *(byte *)(lVar7 + 0x27b4);
      }
      if ((bVar4 & 1) == 0) {
        *(int *)(lVar7 + 0x27e0) = *(int *)(lVar7 + 0x27e0) + 1;
        *(undefined1 *)(lVar7 + 0x2788) = 0;
        cVar9 = *(char *)(lVar7 + 0x7f);
        lVar28 = _DAT_7ff70cc1a3c0;
      }
      else {
        if (lVar29 == 0) {
          puVar22 = &UNK_7ff70cb8a129;
        }
        else {
          puVar22 = *(undefined **)(lVar29 + 8);
        }
        uStack_b0 = 0x7ff70c80b059;
        FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar22,&UNK_7ff70cb8ada3);
        *(undefined1 *)(lVar7 + 0x2788) = 0;
        cVar9 = *(char *)(lVar7 + 0x7f);
        lVar28 = _DAT_7ff70cc1a3c0;
      }
    }
    else {
      *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
      cVar9 = *(char *)(lVar7 + 0x7f);
      lVar28 = _DAT_7ff70cc1a3c0;
    }
    _DAT_7ff70cc1a3c0 = lVar28;
    if (cVar9 != '\x01') {
      pcVar13 = *(code **)(lVar7 + 0x2770);
      goto joined_r0x7ff70c80b41a;
    }
    if (*(char *)(lVar7 + 0x1398) == '\x01') {
      pcVar24 = "Tooltip_Error";
      uVar11 = 0xffffffff;
      do {
        cVar9 = pcVar24[-2];
        if (cVar9 == '#') {
          if ((pcVar24[-1] == '#') && (*pcVar24 == '#')) {
            uVar11 = 0xffffffff;
          }
        }
        else if (cVar9 == '\0') goto LAB_7ff70c80b0c7;
        uVar11 = crc32(uVar11,cVar9);
        pcVar24 = pcVar24 + 1;
      } while( true );
    }
    goto LAB_7ff70c80b40a;
  }
  goto LAB_7ff70c831033;
LAB_7ff70c80b0c7:
  puVar20 = *(uint **)(lVar28 + 0x1428);
  puVar23 = puVar20 + (longlong)*(int *)(lVar28 + 0x1420) * 4;
  uVar17 = (longlong)*(int *)(lVar28 + 0x1420);
  while (uVar35 = uVar17, uVar35 != 0) {
    uVar17 = uVar35 >> 1;
    if (puVar20[uVar17 * 4] < ~uVar11) {
      puVar20 = puVar20 + uVar17 * 4 + 4;
      uVar17 = ~uVar17 + uVar35;
    }
  }
  if ((((puVar20 == puVar23) || (*puVar20 != ~uVar11)) || (*(longlong *)(puVar20 + 2) == 0)) ||
     (*(char *)(lVar28 + 0xfc) == '\0')) {
    fVar39 = *(float *)(lVar28 + 0xd94);
    fVar38 = *(float *)(lVar28 + 0xd98);
    fVar42 = *(float *)(lVar28 + 0xd9c);
    fVar43 = *(float *)(lVar28 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar28 + 0xd94);
    uStack_60 = *(undefined8 *)(lVar28 + 0xd9c);
    iVar36 = *(int *)(lVar28 + 0x1ef0);
    if (iVar36 == *(int *)(lVar28 + 0x1ef4)) {
      if (iVar36 == 0) {
        iVar19 = 8;
      }
      else {
        iVar19 = iVar36 / 2 + iVar36;
      }
      iVar12 = iVar36 + 1;
      if (iVar36 + 1 < iVar19) {
        iVar12 = iVar19;
      }
      uStack_b0 = 0x7ff70c80b1e6;
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar12 * 0x14,_DAT_7ff70cc1a3d0);
      lVar31 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar2) {
          sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar14 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar14 = (longlong)iVar36;
          *(int *)(lVar31 + 0x2874 + lVar14 * 8) = *piVar2;
          *(undefined4 *)(lVar31 + 0x2878 + lVar14 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar31 + 0x2878 + lVar14 * 8) = sVar18;
        *(int *)(lVar31 + 0x2868) = *(int *)(lVar31 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar28 + 0x1ef8) != 0) {
        uStack_b0 = 0x7ff70c80b298;
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar28 + 0x1ef8),
                         (longlong)*(int *)(lVar28 + 0x1ef0) * 0x14);
        lVar14 = _DAT_7ff70cc1a3c0;
        lVar31 = *(longlong *)(lVar28 + 0x1ef8);
        if ((lVar31 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar33 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar33 * 8) == *piVar2) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar33 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar33 = (longlong)iVar36;
            *(int *)(lVar14 + 0x2874 + lVar33 * 8) = *piVar2;
            *(undefined4 *)(lVar14 + 0x2878 + lVar33 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(lVar14 + 0x287a + lVar33 * 8) = sVar18;
          *(int *)(lVar14 + 0x286c) = *(int *)(lVar14 + 0x286c) + 1;
        }
        uStack_b0 = 0x7ff70c80b355;
        (*_DAT_7ff70cbe9468)(lVar31,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar28 + 0x1ef8) = lVar30;
      *(int *)(lVar28 + 0x1ef4) = iVar12;
      iVar36 = *(int *)(lVar28 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar28 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar36 * 0x14) = 4;
    puVar3 = (undefined8 *)(lVar30 + 4 + (longlong)iVar36 * 0x14);
    *puVar3 = uStack_68;
    puVar3[1] = uStack_60;
    *(int *)(lVar28 + 0x1ef0) = *(int *)(lVar28 + 0x1ef0) + 1;
    if (*(int *)(lVar28 + 0x1eec) != 4) {
      fVar44 = (_UNK_7ff70cb1d634 - fVar38) * _UNK_7ff70cb1d644;
      fVar40 = (_UNK_7ff70cb1d638 - fVar42) * _UNK_7ff70cb1d648;
      fVar41 = (_UNK_7ff70cb1d63c - fVar43) * _UNK_7ff70cb1d64c;
      *(float *)(lVar28 + 0xd94) = (_DAT_7ff70cb1d630 - fVar39) * _DAT_7ff70cb1d640 + fVar39;
      *(float *)(lVar28 + 0xd98) = fVar44 + fVar38;
      *(float *)(lVar28 + 0xd9c) = fVar40 + fVar42;
      *(float *)(lVar28 + 0xda0) = fVar41 + fVar43;
    }
  }
  else {
    cVar9 = *(char *)(*(longlong *)(puVar20 + 2) + 0xcd);
    fVar39 = *(float *)(lVar28 + 0xd94);
    fVar38 = *(float *)(lVar28 + 0xd98);
    fVar42 = *(float *)(lVar28 + 0xd9c);
    fVar43 = *(float *)(lVar28 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar28 + 0xd94);
    uStack_60 = *(undefined8 *)(lVar28 + 0xd9c);
    iVar36 = *(int *)(lVar28 + 0x1ef0);
    if (iVar36 == *(int *)(lVar28 + 0x1ef4)) {
      if (iVar36 == 0) {
        iVar19 = 8;
      }
      else {
        iVar19 = iVar36 / 2 + iVar36;
      }
      iVar12 = iVar36 + 1;
      if (iVar36 + 1 < iVar19) {
        iVar12 = iVar19;
      }
      uStack_b0 = 0x7ff70c80b6c4;
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar12 * 0x14,_DAT_7ff70cc1a3d0);
      lVar31 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar2) {
          sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar14 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar14 = (longlong)iVar36;
          *(int *)(lVar31 + 0x2874 + lVar14 * 8) = *piVar2;
          *(undefined4 *)(lVar31 + 0x2878 + lVar14 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar31 + 0x2878 + lVar14 * 8) = sVar18;
        *(int *)(lVar31 + 0x2868) = *(int *)(lVar31 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar28 + 0x1ef8) != 0) {
        uStack_b0 = 0x7ff70c80b776;
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar28 + 0x1ef8),
                         (longlong)*(int *)(lVar28 + 0x1ef0) * 0x14);
        lVar14 = _DAT_7ff70cc1a3c0;
        lVar31 = *(longlong *)(lVar28 + 0x1ef8);
        if ((lVar31 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar33 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar33 * 8) == *piVar2) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar33 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar33 = (longlong)iVar36;
            *(int *)(lVar14 + 0x2874 + lVar33 * 8) = *piVar2;
            *(undefined4 *)(lVar14 + 0x2878 + lVar33 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(lVar14 + 0x287a + lVar33 * 8) = sVar18;
          *(int *)(lVar14 + 0x286c) = *(int *)(lVar14 + 0x286c) + 1;
        }
        uStack_b0 = 0x7ff70c80b964;
        (*_DAT_7ff70cbe9468)(lVar31,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar28 + 0x1ef8) = lVar30;
      *(int *)(lVar28 + 0x1ef4) = iVar12;
      iVar36 = *(int *)(lVar28 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar28 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar36 * 0x14) = 4;
    puVar3 = (undefined8 *)(lVar30 + 4 + (longlong)iVar36 * 0x14);
    *puVar3 = uStack_68;
    puVar3[1] = uStack_60;
    *(int *)(lVar28 + 0x1ef0) = *(int *)(lVar28 + 0x1ef0) + 1;
    if (*(int *)(lVar28 + 0x1eec) != 4) {
      fVar44 = (_UNK_7ff70cb1d634 - fVar38) * _UNK_7ff70cb1d644;
      fVar40 = (_UNK_7ff70cb1d638 - fVar42) * _UNK_7ff70cb1d648;
      fVar41 = (_UNK_7ff70cb1d63c - fVar43) * _UNK_7ff70cb1d64c;
      *(float *)(lVar28 + 0xd94) = (_DAT_7ff70cb1d630 - fVar39) * _DAT_7ff70cb1d640 + fVar39;
      *(float *)(lVar28 + 0xd98) = fVar44 + fVar38;
      *(float *)(lVar28 + 0xd9c) = fVar40 + fVar42;
      *(float *)(lVar28 + 0xda0) = fVar41 + fVar43;
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    if (cVar9 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar30 + 0x1e80) = *(undefined8 *)(lVar28 + 0x2780);
      *(undefined8 *)(lVar30 + 0x1e88) = 0;
      *(undefined4 *)(lVar30 + 0x1e74) = 1;
    }
  }
  uStack_b0 = 0x7ff70c80b3c4;
  cVar9 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  uStack_b0 = 0x7ff70c80b3d0;
  FUN_7ff70c80a7b0(1);
  if (cVar9 != '\0') {
    if (*(short *)(*(longlong *)(lVar28 + 0x1440) + 0xda) == 1) {
      uStack_b0 = 0x7ff70c80b431;
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar33 = _DAT_7ff70cc1a3c0;
      lVar30 = *(longlong *)(lVar28 + 0x1440);
      lVar31 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar14 = *(longlong *)(lVar31 + -8 + (longlong)iVar36 * 8);
      if (((lVar14 != lVar30) && (1 < iVar36)) && (*(longlong *)(lVar14 + 0x3c0) != lVar30)) {
        uVar17 = (ulonglong)(iVar36 - 1);
        iVar36 = 1;
        do {
          uVar11 = (int)uVar17 - 1;
          uVar17 = (ulonglong)uVar11;
          if (*(longlong *)(lVar31 + uVar17 * 8) == lVar30) {
            uStack_b0 = 0x7ff70c80b499;
            FUN_7ff70cb12b70(lVar31 + uVar17 * 8,lVar31 + uVar17 * 8 + 8,(longlong)iVar36 << 3);
            *(longlong *)
             (*(longlong *)(lVar33 + 0x13e8) + -8 + (longlong)*(int *)(lVar33 + 0x13e0) * 8) =
                 lVar30;
            lVar30 = *(longlong *)(lVar28 + 0x1440);
            break;
          }
          iVar36 = iVar36 + 1;
        } while (0 < (int)uVar11);
      }
      lVar14 = _DAT_7ff70cc1a3c0;
      lVar31 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar31 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar30)
      {
        iVar19 = (int)*(short *)(lVar30 + 0xe2);
        lVar26 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar36 = (int)lVar26;
        lVar33 = lVar26;
        if (iVar36 - iVar19 != 0 && iVar19 <= iVar36) {
          lVar32 = (longlong)iVar19;
          lVar33 = (longlong)iVar36;
          lVar31 = lVar32;
          if ((iVar36 - iVar19 & 1U) != 0) {
            lVar31 = lVar32 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar32 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar32 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar14 + 0x13f8) + lVar32 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar33 + -1 != lVar32) {
            do {
              *(undefined8 *)(*(longlong *)(lVar14 + 0x13f8) + lVar31 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar14 + 0x13f8) + 8 + lVar31 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar14 + 0x13f8) + lVar31 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar14 + 0x13f8) + 8 + lVar31 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar14 + 0x13f8) + 0x10 + lVar31 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar14 + 0x13f8) + 8 + lVar31 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar31 = lVar31 + 2;
            } while (lVar33 != lVar31);
          }
          lVar31 = *(longlong *)(lVar14 + 0x13f8);
        }
        *(longlong *)(lVar31 + lVar33 * 8) = lVar30;
        *(short *)(lVar30 + 0xe2) = (short)lVar26;
      }
      *(undefined8 *)(lVar28 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
    else {
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
    if (iVar36 < 0x14) {
      if (lVar29 == 0) {
        uStack_b0 = 0x7ff70c80b68c;
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb8ada3);
      }
      else {
        uStack_b0 = 0x7ff70c80b5ed;
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar29 + 8),&UNK_7ff70cb8ada3);
        lVar28 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar29 + 0xd5) != '\x01') || (*(char *)(lVar29 + 0xcd) == '\x01')) {
          lVar30 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar31 = *(longlong *)(lVar30 + 0x50);
          if (lVar31 == 0) {
            uStack_b0 = 0x7ff70c80b636;
            lVar31 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar14 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar33 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar33 * 8) == *piVar2) {
                sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar33 * 8) + 1;
              }
              else {
                iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
                lVar33 = (longlong)iVar36;
                *(int *)(lVar14 + 0x2874 + lVar33 * 8) = *piVar2;
                *(undefined4 *)(lVar14 + 0x2878 + lVar33 * 8) = 0;
                sVar18 = 1;
              }
              *(short *)(lVar14 + 0x2878 + lVar33 * 8) = sVar18;
              *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
            }
            uStack_b0 = 0x7ff70c80b82b;
            FUN_7ff70c7b5780(lVar31,lVar28 + 0x1148);
            *(undefined **)(lVar31 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar30 + 0x50) = lVar31;
          }
          if (*(int *)(lVar30 + 0x44) != *(int *)(lVar28 + 5000)) {
            uStack_b0 = 0x7ff70c80b854;
            FUN_7ff70c7b6160(lVar31);
            uStack_68 = *(undefined8 *)(*(longlong *)(lVar28 + 0x40) + 0x28);
            uStack_60 = *(undefined8 *)(*(longlong *)(lVar28 + 0x40) + 0x30);
            uStack_b0 = 0x7ff70c80b86e;
            FUN_7ff70c7b8300(lVar31,&uStack_68);
            uStack_50 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar30 + 0x10) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar30 + 8) >> 0x20),
                                 (float)*(undefined8 *)(lVar30 + 0x10) +
                                 (float)*(undefined8 *)(lVar30 + 8));
            uStack_b0 = 0x7ff70c80b899;
            FUN_7ff70c7b7c50(lVar31,lVar30 + 8,&uStack_50,0);
            *(undefined4 *)(lVar30 + 0x44) = *(undefined4 *)(lVar28 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar29 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar29 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar29 + 0x30) +
                               (float)*(undefined8 *)(lVar29 + 0x28));
          uStack_78 = 0x3f800000;
          uStack_80 = (ulonglong)uStack_80._4_4_ << 0x20;
          uStack_88 = (ulonglong)uStack_88._4_4_ << 0x20;
          uStack_b0 = 0x7ff70c80b8e8;
          FUN_7ff70c7bd870(lVar31,lVar29 + 0x28,&uStack_68,0xff0000ff);
          iVar36 = *(int *)(lVar7 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar36 == 0x14) {
      uStack_b0 = 0x7ff70c80b405;
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  uStack_b0 = 0x7ff70c80b40a;
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar7 + 0x278c) = *(int *)(lVar7 + 0x278c) + 1;
  pcVar13 = *(code **)(lVar7 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar13 != (code *)0x0) {
    uStack_b0 = 0x7ff70c80afc6;
    (*pcVar13)(lVar7,*(undefined8 *)(lVar7 + 0x2778),&UNK_7ff70cb8ada3);
  }
  return (ulonglong)*(byte *)(lVar7 + 0x7d);
LAB_7ff70c831427:
  puVar20 = *(uint **)(_DAT_7ff70cc1a3c0 + 0x1428);
  puVar23 = puVar20 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420) * 4;
  uVar17 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420);
  while (uVar35 = uVar17, uVar35 != 0) {
    uVar17 = uVar35 >> 1;
    if (puVar20[uVar17 * 4] < ~uVar11) {
      puVar20 = puVar20 + uVar17 * 4 + 4;
      uVar17 = ~uVar17 + uVar35;
    }
  }
  if ((puVar20 == puVar23) || (*puVar20 != ~uVar11)) {
    uVar15 = 0;
  }
  else {
    uVar15 = *(undefined8 *)(puVar20 + 2);
  }
  *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x2180) = uVar15;
LAB_7ff70c83148f:
  lVar28 = **(longlong **)(lVar29 + 0x1f88);
  uVar11 = *(uint *)(lVar29 + 0x1e70);
  fVar39 = (float)*(undefined8 *)(lVar28 + 0x10) * _DAT_7ff70cb1d890;
  fVar38 = (float)((ulonglong)*(undefined8 *)(lVar28 + 0x10) >> 0x20) * _UNK_7ff70cb1d894;
  *(uint *)(lVar29 + 0x1e70) = uVar11 | 0x10;
  *(ulonglong *)(lVar29 + 0x1eb4) = CONCAT44(fVar38,fVar39);
  *(undefined8 *)(lVar29 + 0x1ebc) = 0x7f7fffff7f7fffff;
  *(undefined8 *)(lVar29 + 0x1ec8) = 0;
  *(undefined8 *)(lVar29 + 0x1ed0) = 0;
  uVar15 = *(undefined8 *)(lVar28 + 8);
  fVar39 = (float)*(undefined8 *)(lVar28 + 0x10) * _DAT_7ff70cb1ba80;
  fVar38 = (float)((ulonglong)*(undefined8 *)(lVar28 + 0x10) >> 0x20) * _UNK_7ff70cb1ba84;
  *(uint *)(lVar29 + 0x1e70) = uVar11 | 0x11;
  *(float *)(lVar29 + 0x1e80) = fVar39 + (float)uVar15;
  *(float *)(lVar29 + 0x1e84) = fVar38 + (float)((ulonglong)uVar15 >> 0x20);
  *(undefined8 *)(lVar29 + 0x1e88) = 0x3f0000003f000000;
  *(undefined4 *)(lVar29 + 0x1e74) = 1;
  uVar15 = *(undefined8 *)(lVar29 + 0xc54);
  fVar39 = (float)((ulonglong)uVar15 >> 0x20);
  iVar36 = *(int *)(lVar29 + 0x1f00);
  if (iVar36 == *(int *)(lVar29 + 0x1f04)) {
    if (iVar36 == 0) {
      iVar19 = 8;
    }
    else {
      iVar19 = iVar36 / 2 + iVar36;
    }
    iVar12 = iVar36 + 1;
    if (iVar36 + 1 < iVar19) {
      iVar12 = iVar19;
    }
    lVar28 = (*_DAT_7ff70cbe9460)((longlong)iVar12 * 0xc,_DAT_7ff70cc1a3d0);
    lVar30 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar31 * 8) + 1;
      }
      else {
        iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
        lVar31 = (longlong)iVar36;
        *(int *)(lVar30 + 0x2874 + lVar31 * 8) = *piVar2;
        *(undefined4 *)(lVar30 + 0x2878 + lVar31 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(lVar30 + 0x2878 + lVar31 * 8) = sVar18;
      *(int *)(lVar30 + 0x2868) = *(int *)(lVar30 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar29 + 0x1f08) != 0) {
      FUN_7ff70cb12b60(lVar28,*(longlong *)(lVar29 + 0x1f08),
                       (longlong)*(int *)(lVar29 + 0x1f00) * 0xc);
      lVar31 = _DAT_7ff70cc1a3c0;
      lVar30 = *(longlong *)(lVar29 + 0x1f08);
      if ((lVar30 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar2) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar14 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar14 = (longlong)iVar36;
          *(int *)(lVar31 + 0x2874 + lVar14 * 8) = *piVar2;
          *(undefined4 *)(lVar31 + 0x2878 + lVar14 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar31 + 0x287a + lVar14 * 8) = sVar18;
        *(int *)(lVar31 + 0x286c) = *(int *)(lVar31 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar30,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar29 + 0x1f08) = lVar28;
    *(int *)(lVar29 + 0x1f04) = iVar12;
    iVar36 = *(int *)(lVar29 + 0x1f00);
  }
  else {
    lVar28 = *(longlong *)(lVar29 + 0x1f08);
  }
  *(undefined4 *)(lVar28 + (longlong)iVar36 * 0xc) = 2;
  *(undefined8 *)(lVar28 + 4 + (longlong)iVar36 * 0xc) = uVar15;
  *(int *)(lVar29 + 0x1f00) = *(int *)(lVar29 + 0x1f00) + 1;
  *(ulonglong *)(lVar29 + 0xc54) = CONCAT44(fVar39 + fVar39,(float)uVar15 + (float)uVar15);
  FUN_7ff70c826d00(&UNK_7ff70cb80116,0,0x31347);
  if (*(char *)(lVar29 + 0x13a8) != '\0') {
    FUN_7ff70c87dd50(lVar29 + 0x13a8);
  }
  if (0 < (longlong)*(int *)(lVar29 + 0x13f0)) {
    lVar28 = (longlong)*(int *)(lVar29 + 0x13f0);
    do {
      lVar30 = *(longlong *)(*(longlong *)(lVar29 + 0x13f8) + -8 + lVar28 * 8);
      if (((*(char *)(lVar30 + 0xcd) == '\x01') && (lVar30 == *(longlong *)(lVar30 + 0x3c0))) &&
         (uVar11 = *(uint *)(lVar30 + 0x14), (uVar11 & 0x20000) == 0)) {
        pcVar24 = *(char **)(lVar30 + 8);
        pcVar25 = pcVar24;
        if (pcVar24 == (char *)0xffffffffffffffff) {
LAB_7ff70c831810:
          pcVar25 = (char *)0x2700;
          if ((uVar11 & 0x4000000) == 0) {
            if (((uVar11 & 0x400) == 0) ||
               (iVar36 = FUN_7ff70cb12e60(pcVar24,&UNK_7ff70cb83c50), iVar36 != 0)) {
              pcVar25 = (char *)0x2708;
            }
            else {
              pcVar25 = (char *)0x26f8;
            }
          }
          pcVar24 = *(char **)(pcVar25 + _DAT_7ff70cc1a3c0);
          if (pcVar24 == (char *)0x0) {
            pcVar24 = "*Missing Text*";
          }
        }
        else {
          do {
            if (*pcVar25 == '#') {
              if (pcVar25[1] == '#') goto LAB_7ff70c831807;
            }
            else if (*pcVar25 == '\0') goto LAB_7ff70c831807;
            pcVar25 = pcVar25 + 1;
          } while (pcVar25 != (char *)0xffffffffffffffff);
          pcVar25 = (char *)0xffffffffffffffff;
LAB_7ff70c831807:
          if (pcVar24 == pcVar25) goto LAB_7ff70c831810;
        }
        uStack_88 = 0;
        FUN_7ff70c87f8e0(pcVar24,CONCAT71((int7)((ulonglong)pcVar25 >> 8),
                                          *(longlong *)(lVar29 + 0x2170) == lVar30),0,&uStack_88);
      }
      bVar8 = 1 < lVar28;
      lVar28 = lVar28 + -1;
    } while (bVar8);
  }
  FUN_7ff70c833070();
  lVar28 = _DAT_7ff70cc1a3c0;
  iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
  iVar19 = 1;
  if (iVar36 < 1) {
    FUN_7ff70c80af70(&UNK_7ff70cb90097);
    iVar36 = *(int *)(lVar28 + 0x1f00);
    iVar19 = iVar36;
    if (0 < iVar36) goto LAB_7ff70c83187c;
  }
  else {
LAB_7ff70c83187c:
    iVar19 = iVar19 + 1;
    do {
      lVar30 = *(longlong *)(lVar28 + 0x1f08) + (longlong)iVar36 * 0xc;
      iVar36 = *(int *)(*(longlong *)(lVar28 + 0x1f08) + -0xc + (longlong)iVar36 * 0xc);
      uVar17 = (ulonglong)*(ushort *)(&UNK_7ff70cb1d062 + (longlong)iVar36 * 4);
      if ((0x26ffd379bU >> ((longlong)iVar36 & 0x3fU) & 1) == 0) {
        if ((1L << ((byte)iVar36 & 0x3f) & 0xd9002c864U) != 0) {
          *(undefined4 *)(lVar28 + 0xc40 + uVar17) = *(undefined4 *)(lVar30 + -8);
          *(undefined4 *)(lVar28 + 0xc44 + uVar17) = *(undefined4 *)(lVar30 + -4);
        }
      }
      else {
        *(undefined4 *)(lVar28 + 0xc40 + uVar17) = *(undefined4 *)(lVar30 + -8);
      }
      iVar36 = *(int *)(lVar28 + 0x1f00) + -1;
      *(int *)(lVar28 + 0x1f00) = iVar36;
      iVar19 = iVar19 + -1;
    } while (1 < iVar19);
  }
LAB_7ff70c8312ad:
  lVar28 = _DAT_7ff70cc1a3c0;
  if (((*(longlong *)(lVar29 + 0x1f98) != 0) && (*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\x01'))
     && ((*(int *)(_DAT_7ff70cc1a3c0 + 0x2078) == 0 &&
         ((*(int *)(_DAT_7ff70cc1a3c0 + 0x20e8) == 0 &&
          (-1 < (char)*(uint *)(lVar29 + 0x202c) && (*(uint *)(lVar29 + 0x202c) & 0xf) != 0)))))) {
    lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98);
    lVar30 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 0x10;
    fVar39 = *(float *)(lVar29 + 0x3fc + lVar30);
    fVar38 = *(float *)(lVar29 + 0x404 + lVar30);
    iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x2038);
    uVar11 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c);
    if (iVar36 == 0) {
      if ((uVar11 & 5) == 0) goto LAB_7ff70c831a6b;
      fVar43 = *(float *)(lVar29 + 0x40) + *(float *)(lVar29 + 0x58);
      uVar34 = 0;
      fVar42 = fVar43;
      if ((uVar11 & 4) != 0) {
        fVar44 = fVar38 - fVar39;
        fVar38 = fVar38 - fVar44;
        uVar34 = 2;
        fVar39 = fVar39 - fVar44;
      }
    }
    else if ((uVar11 & 5) == 0 || iVar36 != 1) {
      fVar42 = *(float *)(lVar29 + 0x3f8 + lVar30);
      fVar43 = *(float *)(lVar29 + 0x400 + lVar30);
      if ((uVar11 & 10) == 0 || iVar36 != 2) {
        if (iVar36 != 3 || (uVar11 & 10) == 0) goto LAB_7ff70c831a6b;
        fVar38 = (float)(*(uint *)(lVar29 + 0x5c) ^ _DAT_7ff70cb1ba60);
        uVar34 = 3;
        fVar39 = fVar38;
        if ((uVar11 & 8) != 0) {
          fVar44 = fVar43 - fVar42;
          fVar42 = fVar42 + fVar44;
          fVar43 = fVar43 + fVar44;
          uVar34 = 1;
        }
      }
      else {
        fVar38 = *(float *)(lVar29 + 0x44) + *(float *)(lVar29 + 0x5c);
        uVar34 = 2;
        fVar39 = fVar38;
        if ((uVar11 & 8) != 0) {
          fVar44 = fVar43 - fVar42;
          fVar42 = fVar42 - fVar44;
          fVar43 = fVar43 - fVar44;
          uVar34 = 0;
        }
      }
    }
    else {
      fVar43 = (float)(*(uint *)(lVar29 + 0x58) ^ _DAT_7ff70cb1ba60);
      uVar34 = 1;
      fVar42 = fVar43;
      if ((uVar11 & 4) != 0) {
        fVar44 = fVar38 - fVar39;
        fVar38 = fVar38 + fVar44;
        uVar34 = 3;
        fVar39 = fVar39 + fVar44;
      }
    }
    lVar29 = lVar29 + lVar30;
    *(float *)(lVar29 + 0x3f8) = fVar42;
    *(float *)(lVar29 + 0x3fc) = fVar39;
    *(float *)(lVar29 + 0x400) = fVar43;
    *(float *)(lVar29 + 0x404) = fVar38;
    *(undefined4 *)
     (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x418 +
     (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
    *(undefined4 *)
     (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x41c +
     (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
    lVar29 = _DAT_7ff70cc1a3c0;
    uVar5 = *(undefined4 *)(lVar28 + 0x2030);
    uVar6 = *(undefined4 *)(lVar28 + 0x2038);
    *(undefined2 *)(_DAT_7ff70cc1a3c0 + 0x2029) = 0x100;
    *(undefined1 *)(lVar29 + 0x2028) = 0;
    *(undefined1 *)(lVar29 + 0x1fe9) = *(undefined1 *)(lVar29 + 0x1fea);
    *(undefined4 *)(lVar29 + 0x2038) = uVar6;
    *(undefined4 *)(lVar29 + 0x2040) = uVar34;
    *(uint *)(lVar29 + 0x202c) = uVar11 | 0x80;
    *(undefined4 *)(lVar29 + 0x2030) = uVar5;
  }
LAB_7ff70c831a6b:
  iVar36 = *(int *)(lVar7 + 5000);
  if (*(char *)(lVar7 + 0x21b0) == '\x01') {
    cVar9 = *(char *)(lVar7 + 0x21fa);
    if (*(int *)(lVar7 + 0x21b8) + 1 < iVar36) {
      if (((((*(byte *)(lVar7 + 0x21b4) & 0x20) != 0) || (*(int *)(lVar7 + 0x21bc) == -1)) ||
          (cVar10 = FUN_7ff70c833790(), cVar9 != '\0')) || (cVar10 == '\0')) {
LAB_7ff70c831ac6:
        lVar29 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(_DAT_7ff70cc1a3c0 + 0x21b0) == '\x01') &&
           ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0)) {
          FUN_7ff70c800cf0(&UNK_7ff70cb91abc);
        }
        *(undefined1 *)(lVar29 + 0x21b0) = 0;
        *(undefined8 *)(lVar29 + 0x21d8) = 0;
        *(undefined8 *)(lVar29 + 0x21e0) = 0;
        *(undefined8 *)(lVar29 + 0x21e8) = 0;
        *(undefined8 *)(lVar29 + 0x21f0) = 0;
        *(undefined1 *)(lVar29 + 0x21f8) = 0;
        *(undefined8 *)(lVar29 + 0x21c0) = 0;
        *(undefined8 *)(lVar29 + 0x21c8) = 0;
        *(undefined8 *)(lVar29 + 0x21d0) = 0xffffffff00000000;
        *(undefined2 *)(lVar29 + 0x21f9) = 0;
        *(undefined4 *)(lVar29 + 0x2224) = 0;
        *(undefined8 *)(lVar29 + 0x2230) = 0xffffffff00000000;
        *(undefined8 *)(lVar29 + 0x2228) = 0x7f7fffff;
        lVar28 = *(longlong *)(lVar29 + 0x2248);
        if (lVar28 != 0) {
          *(undefined8 *)(lVar29 + 0x2240) = 0;
          lVar30 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
            }
            else {
              iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
              lVar31 = (longlong)iVar36;
              *(int *)(lVar30 + 0x2874 + lVar31 * 8) = *piVar2;
              *(undefined4 *)(lVar30 + 0x2878 + lVar31 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(lVar30 + 0x287a + lVar31 * 8) = sVar18;
            *(int *)(lVar30 + 0x286c) = *(int *)(lVar30 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar28,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar29 + 0x2248) = 0;
        }
        *(undefined8 *)(lVar29 + 0x2250) = 0;
        *(undefined8 *)(lVar29 + 0x2258) = 0;
        iVar36 = *(int *)(lVar7 + 5000);
        if (*(char *)(lVar7 + 0x21b0) != '\x01') goto LAB_7ff70c831c54;
      }
    }
    else if (cVar9 != '\0') goto LAB_7ff70c831ac6;
    if ((*(int *)(lVar7 + 0x21b8) + 1 < iVar36) && ((*(byte *)(lVar7 + 0x21b4) & 1) == 0)) {
      *(undefined1 *)(lVar7 + 0x21b1) = 1;
      FUN_7ff70c818c30(&UNK_7ff70cb8dc0d);
      *(undefined1 *)(lVar7 + 0x21b1) = 0;
      iVar36 = *(int *)(lVar7 + 5000);
    }
  }
LAB_7ff70c831c54:
  *(undefined1 *)(lVar7 + 0x1398) = 0;
  *(int *)(lVar7 + 0x138c) = iVar36;
  lVar29 = _DAT_7ff70cc1a3c0;
  if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f10) < 1) {
    FUN_7ff70c80af70();
    FUN_7ff70c81b280();
    uVar11 = *(uint *)(lVar7 + 0x1404);
    if (-1 < (int)uVar11) goto LAB_7ff70c831de3;
LAB_7ff70c831eec:
    uVar15 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    lVar29 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar28 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar28 * 8) == *piVar2) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar28 * 8) + 1;
      }
      else {
        iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
        lVar28 = (longlong)iVar36;
        *(int *)(lVar29 + 0x2874 + lVar28 * 8) = *piVar2;
        *(undefined4 *)(lVar29 + 0x2878 + lVar28 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(lVar29 + 0x2878 + lVar28 * 8) = sVar18;
      *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar7 + 0x1408) != 0) {
      FUN_7ff70cb12b60(uVar15,*(longlong *)(lVar7 + 0x1408),(longlong)*(int *)(lVar7 + 0x1400) << 3)
      ;
      lVar28 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(lVar7 + 0x1408);
      if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar30 = (longlong)iVar36;
          *(int *)(lVar28 + 0x2874 + lVar30 * 8) = *piVar2;
          *(undefined4 *)(lVar28 + 0x2878 + lVar30 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar28 + 0x287a + lVar30 * 8) = sVar18;
        *(int *)(lVar28 + 0x286c) = *(int *)(lVar28 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar7 + 0x1408) = uVar15;
    *(undefined4 *)(lVar7 + 0x1404) = 0;
    uVar11 = 0;
    *(undefined4 *)(lVar7 + 0x1400) = 0;
    uVar27 = *(uint *)(lVar7 + 0x13e0);
    if ((int)uVar27 < 1) goto LAB_7ff70c8321de;
LAB_7ff70c831dfd:
    uVar11 = uVar27;
    uVar15 = (*_DAT_7ff70cbe9460)((ulonglong)uVar11 * 8,_DAT_7ff70cc1a3d0);
    lVar29 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar28 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar28 * 8) == *piVar2) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar28 * 8) + 1;
      }
      else {
        iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
        lVar28 = (longlong)iVar36;
        *(int *)(lVar29 + 0x2874 + lVar28 * 8) = *piVar2;
        *(undefined4 *)(lVar29 + 0x2878 + lVar28 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(lVar29 + 0x2878 + lVar28 * 8) = sVar18;
      *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar7 + 0x1408) != 0) {
      FUN_7ff70cb12b60(uVar15,*(longlong *)(lVar7 + 0x1408),(longlong)*(int *)(lVar7 + 0x1400) << 3)
      ;
      lVar28 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(lVar7 + 0x1408);
      if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar30 = (longlong)iVar36;
          *(int *)(lVar28 + 0x2874 + lVar30 * 8) = *piVar2;
          *(undefined4 *)(lVar28 + 0x2878 + lVar30 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar28 + 0x287a + lVar30 * 8) = sVar18;
        *(int *)(lVar28 + 0x286c) = *(int *)(lVar28 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar7 + 0x1408) = uVar15;
    *(uint *)(lVar7 + 0x1404) = uVar11;
    uVar27 = *(uint *)(lVar7 + 0x13e0);
    lVar29 = *(longlong *)(lVar7 + 0x13e8);
    if (uVar27 == 0) goto LAB_7ff70c832145;
LAB_7ff70c8321ed:
    lVar28 = 0;
    do {
      if ((*(char *)(*(longlong *)(lVar29 + lVar28) + 0xcc) != '\x01') ||
         ((*(byte *)(*(longlong *)(lVar29 + lVar28) + 0x17) & 1) == 0)) {
        FUN_7ff70c8339f0(lVar7 + 0x1400);
      }
      lVar28 = lVar28 + 8;
    } while ((longlong)(int)uVar27 * 8 != lVar28);
    uVar34 = *(undefined4 *)(lVar7 + 0x13e0);
    uVar11 = *(uint *)(lVar7 + 0x1404);
    lVar29 = *(longlong *)(lVar7 + 0x13e8);
  }
  else {
    lVar28 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f18);
    lVar30 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f10) * 0x10;
    fVar39 = *(float *)(lVar28 + -4 + lVar30);
    fVar38 = *(float *)(lVar28 + -8 + lVar30);
    lVar28 = *(longlong *)(lVar28 + -0x10 + lVar30);
    *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1120) = lVar28;
    *(float *)(lVar29 + 0x1134) = fVar38;
    lVar30 = *(longlong *)(lVar29 + 0x1440);
    *(float *)(lVar29 + 0xc40) = fVar38;
    if (((lVar30 == 0) || (*(char *)(lVar30 + 0xd1) != '\x01')) ||
       ((*(longlong *)(lVar29 + 0x2278) != 0 &&
        (*(int *)(*(longlong *)(lVar29 + 0x2278) + 0x74) == -1)))) {
      if (fVar39 <= 0.0) {
        fVar39 = 0.0;
      }
      if ((fVar39 == 0.0) && (!NAN(fVar39))) {
        fVar39 = fVar38 * *(float *)(lVar29 + 0xc44) * *(float *)(lVar29 + 0xc48);
        if (lVar30 != 0) {
          fVar39 = fVar39 * *(float *)(lVar30 + 0x2b8);
        }
        fVar39 = fVar39 * *(float *)(lVar29 + 0xbc0);
        if (lVar28 != 0) {
          fVar39 = fVar39 * *(float *)(lVar28 + 0x48);
        }
      }
      if ((int)(fVar39 + _DAT_7ff70cb1ba70) < 1) {
        fVar39 = _DAT_7ff70cb1ba2c;
        if (lVar28 == 0) goto LAB_7ff70c831e5f;
LAB_7ff70c831d4d:
        lVar31 = lVar28;
        if ((*(byte *)(lVar29 + 0xc) & 0x10) != 0) {
          *(undefined4 *)(lVar28 + 0x14) = *(undefined4 *)(lVar29 + 0x113c);
          lVar31 = *(longlong *)(lVar29 + 0x1120);
        }
        lVar14 = 0;
        *(float *)(lVar29 + 0x1130) = fVar39;
        if ((lVar30 != 0) && (lVar31 != 0)) {
          lVar14 = FUN_7ff70c7e5630();
          lVar31 = *(longlong *)(lVar29 + 0x1120);
          fVar39 = *(float *)(lVar29 + 0x1130);
        }
        *(longlong *)(lVar29 + 0x1128) = lVar14;
        fVar38 = 0.0;
        if ((lVar30 != 0) && (lVar31 != 0)) {
          fVar38 = fVar39 / *(float *)(lVar14 + 0x14);
        }
      }
      else {
        fVar38 = (float)(int)(fVar39 + _DAT_7ff70cb1ba70);
        fVar39 = _DAT_7ff70cb1d620;
        if (fVar38 <= _DAT_7ff70cb1d620) {
          fVar39 = fVar38;
        }
        if (lVar28 != 0) goto LAB_7ff70c831d4d;
LAB_7ff70c831e5f:
        *(float *)(lVar29 + 0x1130) = fVar39;
        *(undefined8 *)(lVar29 + 0x1128) = 0;
        fVar38 = 0.0;
      }
      *(float *)(lVar29 + 0x1138) = fVar38;
      *(float *)(lVar29 + 0x1168) = fVar39;
      *(float *)(lVar29 + 0x116c) = fVar38;
    }
    if (lVar28 != 0) {
      lVar30 = *(longlong *)(lVar28 + 8);
      *(longlong *)(lVar29 + 0x1158) = lVar30;
      *(longlong *)(lVar29 + 0x1160) = lVar28;
      FUN_7ff70c7e96c0();
      if (*(longlong *)(lVar29 + 0x1440) != 0) {
        uStack_88 = *(longlong *)(lVar30 + 0x28);
        uStack_80 = *(longlong *)(lVar30 + 0x30);
        FUN_7ff70c7b8700(*(undefined8 *)(*(longlong *)(lVar29 + 0x1440) + 0x2c8),&uStack_88);
      }
    }
    *(int *)(lVar29 + 0x1f10) = *(int *)(lVar29 + 0x1f10) + -1;
    FUN_7ff70c81b280();
    uVar11 = *(uint *)(lVar7 + 0x1404);
    if ((int)uVar11 < 0) goto LAB_7ff70c831eec;
LAB_7ff70c831de3:
    *(undefined4 *)(lVar7 + 0x1400) = 0;
    uVar27 = *(uint *)(lVar7 + 0x13e0);
    if ((int)uVar11 < (int)uVar27) goto LAB_7ff70c831dfd;
LAB_7ff70c8321de:
    lVar29 = *(longlong *)(lVar7 + 0x13e8);
    if (uVar27 != 0) goto LAB_7ff70c8321ed;
LAB_7ff70c832145:
    uVar34 = 0;
  }
  uVar5 = *(undefined4 *)(lVar7 + 0x1400);
  *(undefined4 *)(lVar7 + 0x1400) = uVar34;
  *(undefined4 *)(lVar7 + 0x13e0) = uVar5;
  *(undefined4 *)(lVar7 + 0x1404) = *(undefined4 *)(lVar7 + 0x13e4);
  *(uint *)(lVar7 + 0x13e4) = uVar11;
  uVar15 = *(undefined8 *)(lVar7 + 0x1408);
  *(longlong *)(lVar7 + 0x1408) = lVar29;
  *(undefined8 *)(lVar7 + 0x13e8) = uVar15;
  *(undefined4 *)(lVar7 + 200) = *(undefined4 *)(lVar7 + 0x1430);
  lVar29 = _DAT_7ff70cc1a3c0;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0xc34) < 0) {
    uVar15 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    lVar28 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar30 * 8) + 1;
      }
      else {
        iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
        lVar30 = (longlong)iVar36;
        *(int *)(lVar28 + 0x2874 + lVar30 * 8) = *piVar2;
        *(undefined4 *)(lVar28 + 0x2878 + lVar30 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(lVar28 + 0x2878 + lVar30 * 8) = sVar18;
      *(int *)(lVar28 + 0x2868) = *(int *)(lVar28 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar29 + 0xc38) != 0) {
      FUN_7ff70cb12b60(uVar15,*(longlong *)(lVar29 + 0xc38),(longlong)*(int *)(lVar29 + 0xc30) << 3)
      ;
      lVar30 = _DAT_7ff70cc1a3c0;
      lVar28 = *(longlong *)(lVar29 + 0xc38);
      if ((lVar28 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar31 = (longlong)iVar36;
          *(int *)(lVar30 + 0x2874 + lVar31 * 8) = *piVar2;
          *(undefined4 *)(lVar30 + 0x2878 + lVar31 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar30 + 0x287a + lVar31 * 8) = sVar18;
        *(int *)(lVar30 + 0x286c) = *(int *)(lVar30 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar28,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar29 + 0xc38) = uVar15;
    *(undefined4 *)(lVar29 + 0xc34) = 0;
  }
  lStack_a0 = lVar7;
  *(undefined4 *)(lVar29 + 0xc30) = 0;
  if ((longlong)*(int *)(lVar29 + 0x1110) == 0) {
    iVar36 = 0;
  }
  else {
    plVar21 = *(longlong **)(lVar29 + 0x1118);
    plStack_98 = plVar21 + *(int *)(lVar29 + 0x1110);
    iVar36 = 0;
    do {
      lVar7 = *plVar21;
      iVar19 = *(int *)(lVar7 + 0x40);
      plStack_90 = plVar21;
      if ((longlong)iVar19 != 0) {
        lVar28 = *(longlong *)(lVar7 + 0x48);
        lVar30 = 0;
        do {
          lVar31 = *(longlong *)(lVar28 + lVar30);
          *(undefined2 *)(lVar31 + 0x54) = *(undefined2 *)(lVar7 + 0x2d4);
          iVar36 = *(int *)(lVar29 + 0xc30);
          if (iVar36 == *(int *)(lVar29 + 0xc34)) {
            if (iVar36 == 0) {
              iVar12 = 8;
            }
            else {
              iVar12 = iVar36 / 2 + iVar36;
            }
            iVar37 = iVar36 + 1;
            if (iVar36 + 1 < iVar12) {
              iVar37 = iVar12;
            }
            lVar14 = (*_DAT_7ff70cbe9460)((longlong)iVar37 << 3,_DAT_7ff70cc1a3d0);
            lVar33 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar26 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar26 * 8) == *piVar2) {
                sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar26 * 8) + 1;
              }
              else {
                iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
                lVar26 = (longlong)iVar36;
                *(int *)(lVar33 + 0x2874 + lVar26 * 8) = *piVar2;
                *(undefined4 *)(lVar33 + 0x2878 + lVar26 * 8) = 0;
                sVar18 = 1;
              }
              *(short *)(lVar33 + 0x2878 + lVar26 * 8) = sVar18;
              *(int *)(lVar33 + 0x2868) = *(int *)(lVar33 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar29 + 0xc38) != 0) {
              FUN_7ff70cb12b60(lVar14,*(longlong *)(lVar29 + 0xc38),
                               (longlong)*(int *)(lVar29 + 0xc30) << 3);
              lVar26 = _DAT_7ff70cc1a3c0;
              lVar33 = *(longlong *)(lVar29 + 0xc38);
              if ((lVar33 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar32 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar32 * 8) == *piVar2) {
                  sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar32 * 8) + 1;
                }
                else {
                  iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
                  lVar32 = (longlong)iVar36;
                  *(int *)(lVar26 + 0x2874 + lVar32 * 8) = *piVar2;
                  *(undefined4 *)(lVar26 + 0x2878 + lVar32 * 8) = 0;
                  sVar18 = 1;
                }
                *(short *)(lVar26 + 0x287a + lVar32 * 8) = sVar18;
                *(int *)(lVar26 + 0x286c) = *(int *)(lVar26 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)(lVar33,_DAT_7ff70cc1a3d0);
            }
            *(longlong *)(lVar29 + 0xc38) = lVar14;
            *(int *)(lVar29 + 0xc34) = iVar37;
            iVar36 = *(int *)(lVar29 + 0xc30);
          }
          else {
            lVar14 = *(longlong *)(lVar29 + 0xc38);
          }
          *(longlong *)(lVar14 + (longlong)iVar36 * 8) = lVar31;
          iVar36 = *(int *)(lVar29 + 0xc30) + 1;
          *(int *)(lVar29 + 0xc30) = iVar36;
          lVar30 = lVar30 + 8;
        } while ((longlong)iVar19 * 8 != lVar30);
      }
      plVar21 = plStack_90 + 1;
    } while (plVar21 != plStack_98);
  }
  iVar19 = *(int *)(lVar29 + 0x2660);
  if ((longlong)iVar19 != 0) {
    lVar7 = *(longlong *)(lVar29 + 0x2668);
    lVar28 = 0;
    do {
      uVar15 = *(undefined8 *)(lVar7 + lVar28);
      if (iVar36 == *(int *)(lVar29 + 0xc34)) {
        if (iVar36 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar36 / 2 + iVar36;
        }
        iVar37 = iVar36 + 1;
        if (iVar36 + 1 < iVar12) {
          iVar37 = iVar12;
        }
        lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar37 << 3,_DAT_7ff70cc1a3d0);
        lVar31 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar2) {
            sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar14 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar14 = (longlong)iVar36;
            *(int *)(lVar31 + 0x2874 + lVar14 * 8) = *piVar2;
            *(undefined4 *)(lVar31 + 0x2878 + lVar14 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(lVar31 + 0x2878 + lVar14 * 8) = sVar18;
          *(int *)(lVar31 + 0x2868) = *(int *)(lVar31 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar29 + 0xc38) != 0) {
          FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar29 + 0xc38),
                           (longlong)*(int *)(lVar29 + 0xc30) << 3);
          lVar14 = _DAT_7ff70cc1a3c0;
          lVar31 = *(longlong *)(lVar29 + 0xc38);
          if ((lVar31 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar33 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar33 * 8) == *piVar2) {
              sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar33 * 8) + 1;
            }
            else {
              iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
              lVar33 = (longlong)iVar36;
              *(int *)(lVar14 + 0x2874 + lVar33 * 8) = *piVar2;
              *(undefined4 *)(lVar14 + 0x2878 + lVar33 * 8) = 0;
              sVar18 = 1;
            }
            *(short *)(lVar14 + 0x287a + lVar33 * 8) = sVar18;
            *(int *)(lVar14 + 0x286c) = *(int *)(lVar14 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar31,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar29 + 0xc38) = lVar30;
        *(int *)(lVar29 + 0xc34) = iVar37;
        iVar36 = *(int *)(lVar29 + 0xc30);
      }
      else {
        lVar30 = *(longlong *)(lVar29 + 0xc38);
      }
      *(undefined8 *)(lVar30 + (longlong)iVar36 * 8) = uVar15;
      iVar36 = *(int *)(lVar29 + 0xc30) + 1;
      *(int *)(lVar29 + 0xc30) = iVar36;
      lVar28 = lVar28 + 8;
    } while ((longlong)iVar19 * 8 != lVar28);
  }
  lVar7 = lStack_a0;
  lVar29 = (longlong)*(int *)(lStack_a0 + 0x1110);
  if (lVar29 != 0) {
    plVar21 = *(longlong **)(lStack_a0 + 0x1118);
    uVar17 = lVar29 * 8 - 8;
    plVar16 = plVar21;
    if ((~(uint)uVar17 & 0x38) != 0) {
      uVar35 = (ulonglong)(((uint)(uVar17 >> 3) & 0x1fffffff) + 1 & 7);
      do {
        *(undefined1 *)(*plVar16 + 0x50) = 0;
        plVar16 = plVar16 + 1;
        uVar35 = uVar35 - 1;
      } while (uVar35 != 0);
    }
    if (0x37 < uVar17) {
      do {
        *(undefined1 *)(*plVar16 + 0x50) = 0;
        *(undefined1 *)(plVar16[1] + 0x50) = 0;
        *(undefined1 *)(plVar16[2] + 0x50) = 0;
        *(undefined1 *)(plVar16[3] + 0x50) = 0;
        *(undefined1 *)(plVar16[4] + 0x50) = 0;
        *(undefined1 *)(plVar16[5] + 0x50) = 0;
        *(undefined1 *)(plVar16[6] + 0x50) = 0;
        *(undefined1 *)(plVar16[7] + 0x50) = 0;
        plVar16 = plVar16 + 8;
      } while (plVar16 != plVar21 + lVar29);
    }
  }
  *(undefined8 *)(lStack_a0 + 0xab8) = *(undefined8 *)(lStack_a0 + 0xe0);
  *(undefined1 *)(lStack_a0 + 0xbac) = 0;
  *(undefined8 *)(lStack_a0 + 0xf0) = 0;
  if (*(int *)(lStack_a0 + 0xbb4) < 0) {
    uVar15 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    lVar29 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar28 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar28 * 8) == *piVar2) {
        sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar28 * 8) + 1;
      }
      else {
        iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
        lVar28 = (longlong)iVar36;
        *(int *)(lVar29 + 0x2874 + lVar28 * 8) = *piVar2;
        *(undefined4 *)(lVar29 + 0x2878 + lVar28 * 8) = 0;
        sVar18 = 1;
      }
      *(short *)(lVar29 + 0x2878 + lVar28 * 8) = sVar18;
      *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar7 + 3000) != 0) {
      FUN_7ff70cb12b60(uVar15,*(longlong *)(lVar7 + 3000),(longlong)*(int *)(lVar7 + 0xbb0) * 2);
      lVar28 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(lVar7 + 3000);
      if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
          sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar30 = (longlong)iVar36;
          *(int *)(lVar28 + 0x2874 + lVar30 * 8) = *piVar2;
          *(undefined4 *)(lVar28 + 0x2878 + lVar30 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar28 + 0x287a + lVar30 * 8) = sVar18;
        *(int *)(lVar28 + 0x286c) = *(int *)(lVar28 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar7 + 3000) = uVar15;
    *(undefined4 *)(lVar7 + 0xbb4) = 0;
  }
  *(undefined4 *)(lVar7 + 0xbb0) = 0;
  if ((longlong)*(int *)(lVar7 + 0x26b8) != 0) {
    lVar29 = *(longlong *)(lVar7 + 0x26c0);
    lVar28 = (longlong)*(int *)(lVar7 + 0x26b8) << 5;
    do {
      if (*(int *)(lVar29 + 4) == 3) {
        (**(code **)(lVar29 + 0x10))(lVar7,lVar29);
      }
      lVar29 = lVar29 + 0x20;
      lVar28 = lVar28 + -0x20;
    } while (lVar28 != 0);
  }
LAB_7ff70c831033:
  if (_DAT_7ff70cbebd80 == (uStack_70 ^ (ulonglong)auStack_c8)) {
    return uStack_70 ^ (ulonglong)auStack_c8;
  }
LAB_7ff70c832aff:
  FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_c8);
  pcVar13 = (code *)swi(3);
  uVar17 = (*pcVar13)();
  return uVar17;
}


