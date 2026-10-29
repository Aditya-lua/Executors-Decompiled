/* 7ff70c850910 FUN_7ff70c850910 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c850910(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  undefined4 uVar5;
  longlong lVar6;
  code *pcVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  ulonglong uVar12;
  longlong lVar13;
  longlong lVar14;
  char cVar15;
  uint uVar16;
  longlong lVar17;
  longlong lVar18;
  longlong lVar19;
  ulonglong uVar20;
  short sVar21;
  int iVar22;
  uint *puVar23;
  int iVar24;
  undefined *puVar25;
  char *pcVar26;
  uint *puVar27;
  longlong lVar28;
  int iVar29;
  longlong lVar30;
  longlong lVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 auStack_50 [2];
  undefined8 uStack_40;
  
  lVar14 = _DAT_7ff70cc1a3c0;
  uVar20 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffc8;
  lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uVar16 = *(uint *)(lVar6 + 0x14);
  if (((uVar16 & 0x4000000) != 0) && (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) != 0)) {
    if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == lVar6) &&
       ((*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\x01' &&
        (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) == 0)))) {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) & 0xfffffff0 | 2
      ;
      uVar16 = *(uint *)(lVar6 + 0x14);
    }
    uVar5 = *(undefined4 *)(lVar14 + 0x1394);
    if ((uVar16 & 0x1000000) != 0) {
      *(undefined4 *)(lVar14 + 0x1394) = *(undefined4 *)(lVar6 + 0x10);
    }
    uStack_40 = 0x7ff70c850993;
    FUN_7ff70c833070();
    *(undefined4 *)(lVar14 + 0x1394) = uVar5;
    if (_DAT_7ff70cbebd80 == (uVar20 ^ (ulonglong)&stack0xffffffffffffffc8)) {
      return uVar20 ^ (ulonglong)&stack0xffffffffffffffc8;
    }
LAB_7ff70c8509da:
    uStack_40 = 0x7ff70c8509e7;
    FUN_7ff70caa97e0(uVar20 ^ (ulonglong)&stack0xffffffffffffffc8);
    pcVar7 = (code *)swi(3);
    uVar20 = (*pcVar7)();
    return uVar20;
  }
  if (_DAT_7ff70cbebd80 != (uVar20 ^ (ulonglong)&stack0xffffffffffffffc8)) goto LAB_7ff70c8509da;
  lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
        goto LAB_7ff70c80aff6;
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                       *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
      bVar4 = *(byte *)(lVar14 + 0x27b4);
    }
    else {
LAB_7ff70c80aff6:
      bVar4 = *(byte *)(lVar14 + 0x27b4);
    }
    if ((bVar4 & 1) == 0) {
      *(int *)(lVar14 + 0x27e0) = *(int *)(lVar14 + 0x27e0) + 1;
      *(undefined1 *)(lVar14 + 0x2788) = 0;
      cVar15 = *(char *)(lVar14 + 0x7f);
      lVar13 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar6 == 0) {
        puVar25 = &UNK_7ff70cb8a129;
      }
      else {
        puVar25 = *(undefined **)(lVar6 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar25,&UNK_7ff70cb8fed7);
      *(undefined1 *)(lVar14 + 0x2788) = 0;
      cVar15 = *(char *)(lVar14 + 0x7f);
      lVar13 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar15 = *(char *)(lVar14 + 0x7f);
    lVar13 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar13;
  if (cVar15 != '\x01') {
    pcVar7 = *(code **)(lVar14 + 0x2770);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(lVar14 + 0x1398) == '\x01') {
    pcVar26 = "Tooltip_Error";
    uVar16 = 0xffffffff;
    do {
      cVar15 = pcVar26[-2];
      if (cVar15 == '#') {
        if ((pcVar26[-1] == '#') && (*pcVar26 == '#')) {
          uVar16 = 0xffffffff;
        }
      }
      else if (cVar15 == '\0') goto LAB_7ff70c80b0c7;
      uVar16 = crc32(uVar16,cVar15);
      pcVar26 = pcVar26 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar23 = *(uint **)(lVar13 + 0x1428);
  puVar27 = puVar23 + (longlong)*(int *)(lVar13 + 0x1420) * 4;
  uVar20 = (longlong)*(int *)(lVar13 + 0x1420);
  while (uVar12 = uVar20, uVar12 != 0) {
    uVar20 = uVar12 >> 1;
    if (puVar23[uVar20 * 4] < ~uVar16) {
      puVar23 = puVar23 + uVar20 * 4 + 4;
      uVar20 = ~uVar20 + uVar12;
    }
  }
  if ((((puVar23 == puVar27) || (*puVar23 != ~uVar16)) || (*(longlong *)(puVar23 + 2) == 0)) ||
     (*(char *)(lVar13 + 0xfc) == '\0')) {
    fVar8 = *(float *)(lVar13 + 0xd94);
    fVar9 = *(float *)(lVar13 + 0xd98);
    fVar10 = *(float *)(lVar13 + 0xd9c);
    fVar11 = *(float *)(lVar13 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar13 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar13 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar13 + 0xda0);
    iVar24 = *(int *)(lVar13 + 0x1ef0);
    if (iVar24 == *(int *)(lVar13 + 0x1ef4)) {
      if (iVar24 == 0) {
        iVar22 = 8;
      }
      else {
        iVar22 = iVar24 / 2 + iVar24;
      }
      iVar29 = iVar24 + 1;
      if (iVar24 + 1 < iVar22) {
        iVar29 = iVar22;
      }
      lVar19 = (*_DAT_7ff70cbe9460)((longlong)iVar29 * 0x14,_DAT_7ff70cc1a3d0);
      lVar18 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar28 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar28 * 8) == *piVar2) {
          sVar21 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar28 * 8) + 1;
        }
        else {
          iVar24 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar24;
          lVar28 = (longlong)iVar24;
          *(int *)(lVar18 + 0x2874 + lVar28 * 8) = *piVar2;
          *(undefined4 *)(lVar18 + 0x2878 + lVar28 * 8) = 0;
          sVar21 = 1;
        }
        *(short *)(lVar18 + 0x2878 + lVar28 * 8) = sVar21;
        *(int *)(lVar18 + 0x2868) = *(int *)(lVar18 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar13 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar19,*(longlong *)(lVar13 + 0x1ef8),
                         (longlong)*(int *)(lVar13 + 0x1ef0) * 0x14);
        lVar28 = _DAT_7ff70cc1a3c0;
        lVar18 = *(longlong *)(lVar13 + 0x1ef8);
        if ((lVar18 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
            sVar21 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
          }
          else {
            iVar24 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar24;
            lVar31 = (longlong)iVar24;
            *(int *)(lVar28 + 0x2874 + lVar31 * 8) = *piVar2;
            *(undefined4 *)(lVar28 + 0x2878 + lVar31 * 8) = 0;
            sVar21 = 1;
          }
          *(short *)(lVar28 + 0x287a + lVar31 * 8) = sVar21;
          *(int *)(lVar28 + 0x286c) = *(int *)(lVar28 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar18,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar13 + 0x1ef8) = lVar19;
      *(int *)(lVar13 + 0x1ef4) = iVar29;
      iVar24 = *(int *)(lVar13 + 0x1ef0);
    }
    else {
      lVar19 = *(longlong *)(lVar13 + 0x1ef8);
    }
    *(undefined4 *)(lVar19 + (longlong)iVar24 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar19 + 4 + (longlong)iVar24 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar13 + 0x1ef0) = *(int *)(lVar13 + 0x1ef0) + 1;
    if (*(int *)(lVar13 + 0x1eec) != 4) {
      fVar32 = (_UNK_7ff70cb1d634 - fVar9) * _UNK_7ff70cb1d644;
      fVar33 = (_UNK_7ff70cb1d638 - fVar10) * _UNK_7ff70cb1d648;
      fVar34 = (_UNK_7ff70cb1d63c - fVar11) * _UNK_7ff70cb1d64c;
      *(float *)(lVar13 + 0xd94) = (_DAT_7ff70cb1d630 - fVar8) * _DAT_7ff70cb1d640 + fVar8;
      *(float *)(lVar13 + 0xd98) = fVar32 + fVar9;
      *(float *)(lVar13 + 0xd9c) = fVar33 + fVar10;
      *(float *)(lVar13 + 0xda0) = fVar34 + fVar11;
    }
  }
  else {
    cVar15 = *(char *)(*(longlong *)(puVar23 + 2) + 0xcd);
    fVar8 = *(float *)(lVar13 + 0xd94);
    fVar9 = *(float *)(lVar13 + 0xd98);
    fVar10 = *(float *)(lVar13 + 0xd9c);
    fVar11 = *(float *)(lVar13 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar13 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar13 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar13 + 0xda0);
    iVar24 = *(int *)(lVar13 + 0x1ef0);
    if (iVar24 == *(int *)(lVar13 + 0x1ef4)) {
      if (iVar24 == 0) {
        iVar22 = 8;
      }
      else {
        iVar22 = iVar24 / 2 + iVar24;
      }
      iVar29 = iVar24 + 1;
      if (iVar24 + 1 < iVar22) {
        iVar29 = iVar22;
      }
      lVar19 = (*_DAT_7ff70cbe9460)((longlong)iVar29 * 0x14,_DAT_7ff70cc1a3d0);
      lVar18 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar28 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar28 * 8) == *piVar2) {
          sVar21 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar28 * 8) + 1;
        }
        else {
          iVar24 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar24;
          lVar28 = (longlong)iVar24;
          *(int *)(lVar18 + 0x2874 + lVar28 * 8) = *piVar2;
          *(undefined4 *)(lVar18 + 0x2878 + lVar28 * 8) = 0;
          sVar21 = 1;
        }
        *(short *)(lVar18 + 0x2878 + lVar28 * 8) = sVar21;
        *(int *)(lVar18 + 0x2868) = *(int *)(lVar18 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar13 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar19,*(longlong *)(lVar13 + 0x1ef8),
                         (longlong)*(int *)(lVar13 + 0x1ef0) * 0x14);
        lVar28 = _DAT_7ff70cc1a3c0;
        lVar18 = *(longlong *)(lVar13 + 0x1ef8);
        if ((lVar18 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
            sVar21 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
          }
          else {
            iVar24 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar24;
            lVar31 = (longlong)iVar24;
            *(int *)(lVar28 + 0x2874 + lVar31 * 8) = *piVar2;
            *(undefined4 *)(lVar28 + 0x2878 + lVar31 * 8) = 0;
            sVar21 = 1;
          }
          *(short *)(lVar28 + 0x287a + lVar31 * 8) = sVar21;
          *(int *)(lVar28 + 0x286c) = *(int *)(lVar28 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar18,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar13 + 0x1ef8) = lVar19;
      *(int *)(lVar13 + 0x1ef4) = iVar29;
      iVar24 = *(int *)(lVar13 + 0x1ef0);
    }
    else {
      lVar19 = *(longlong *)(lVar13 + 0x1ef8);
    }
    *(undefined4 *)(lVar19 + (longlong)iVar24 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar19 + 4 + (longlong)iVar24 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar13 + 0x1ef0) = *(int *)(lVar13 + 0x1ef0) + 1;
    if (*(int *)(lVar13 + 0x1eec) != 4) {
      fVar32 = (_UNK_7ff70cb1d634 - fVar9) * _UNK_7ff70cb1d644;
      fVar33 = (_UNK_7ff70cb1d638 - fVar10) * _UNK_7ff70cb1d648;
      fVar34 = (_UNK_7ff70cb1d63c - fVar11) * _UNK_7ff70cb1d64c;
      *(float *)(lVar13 + 0xd94) = (_DAT_7ff70cb1d630 - fVar8) * _DAT_7ff70cb1d640 + fVar8;
      *(float *)(lVar13 + 0xd98) = fVar32 + fVar9;
      *(float *)(lVar13 + 0xd9c) = fVar33 + fVar10;
      *(float *)(lVar13 + 0xda0) = fVar34 + fVar11;
    }
    lVar19 = _DAT_7ff70cc1a3c0;
    if (cVar15 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar19 + 0x1e80) = *(undefined8 *)(lVar13 + 0x2780);
      *(undefined8 *)(lVar19 + 0x1e88) = 0;
      *(undefined4 *)(lVar19 + 0x1e74) = 1;
    }
  }
  cVar15 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar15 != '\0') {
    if (*(short *)(*(longlong *)(lVar13 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar31 = _DAT_7ff70cc1a3c0;
      lVar19 = *(longlong *)(lVar13 + 0x1440);
      lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar24 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar28 = *(longlong *)(lVar18 + -8 + (longlong)iVar24 * 8);
      if (((lVar28 != lVar19) && (1 < iVar24)) && (*(longlong *)(lVar28 + 0x3c0) != lVar19)) {
        uVar20 = (ulonglong)(iVar24 - 1);
        iVar24 = 1;
        do {
          uVar16 = (int)uVar20 - 1;
          uVar20 = (ulonglong)uVar16;
          if (*(longlong *)(lVar18 + uVar20 * 8) == lVar19) {
            FUN_7ff70cb12b70(lVar18 + uVar20 * 8,lVar18 + uVar20 * 8 + 8,(longlong)iVar24 << 3);
            *(longlong *)
             (*(longlong *)(lVar31 + 0x13e8) + -8 + (longlong)*(int *)(lVar31 + 0x13e0) * 8) =
                 lVar19;
            lVar19 = *(longlong *)(lVar13 + 0x1440);
            break;
          }
          iVar24 = iVar24 + 1;
        } while (0 < (int)uVar16);
      }
      lVar28 = _DAT_7ff70cc1a3c0;
      lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar18 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar19)
      {
        iVar22 = (int)*(short *)(lVar19 + 0xe2);
        lVar17 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar24 = (int)lVar17;
        lVar31 = lVar17;
        if (iVar24 - iVar22 != 0 && iVar22 <= iVar24) {
          lVar30 = (longlong)iVar22;
          lVar31 = (longlong)iVar24;
          lVar18 = lVar30;
          if ((iVar24 - iVar22 & 1U) != 0) {
            lVar18 = lVar30 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar30 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar30 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar28 + 0x13f8) + lVar30 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar31 + -1 != lVar30) {
            do {
              *(undefined8 *)(*(longlong *)(lVar28 + 0x13f8) + lVar18 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar28 + 0x13f8) + 8 + lVar18 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar28 + 0x13f8) + lVar18 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar28 + 0x13f8) + 8 + lVar18 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar28 + 0x13f8) + 0x10 + lVar18 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar28 + 0x13f8) + 8 + lVar18 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar18 = lVar18 + 2;
            } while (lVar31 != lVar18);
          }
          lVar18 = *(longlong *)(lVar28 + 0x13f8);
        }
        *(longlong *)(lVar18 + lVar31 * 8) = lVar19;
        *(short *)(lVar19 + 0xe2) = (short)lVar17;
      }
      *(undefined8 *)(lVar13 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar24 = *(int *)(lVar14 + 0x278c);
    }
    else {
      iVar24 = *(int *)(lVar14 + 0x278c);
    }
    if (iVar24 < 0x14) {
      if (lVar6 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb8fed7);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar6 + 8),&UNK_7ff70cb8fed7);
        lVar13 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar6 + 0xd5) != '\x01') || (*(char *)(lVar6 + 0xcd) == '\x01')) {
          lVar19 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar18 = *(longlong *)(lVar19 + 0x50);
          if (lVar18 == 0) {
            lVar18 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar28 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
                sVar21 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar31 * 8) + 1;
              }
              else {
                iVar24 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar24;
                lVar31 = (longlong)iVar24;
                *(int *)(lVar28 + 0x2874 + lVar31 * 8) = *piVar2;
                *(undefined4 *)(lVar28 + 0x2878 + lVar31 * 8) = 0;
                sVar21 = 1;
              }
              *(short *)(lVar28 + 0x2878 + lVar31 * 8) = sVar21;
              *(int *)(lVar28 + 0x2868) = *(int *)(lVar28 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar18,lVar13 + 0x1148);
            *(undefined **)(lVar18 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar19 + 0x50) = lVar18;
          }
          if (*(int *)(lVar19 + 0x44) != *(int *)(lVar13 + 5000)) {
            FUN_7ff70c7b6160(lVar18);
            lVar28 = *(longlong *)(lVar13 + 0x40);
            uStack_68 = *(undefined8 *)(lVar28 + 0x28);
            uStack_60 = *(undefined4 *)(lVar28 + 0x30);
            uStack_5c = *(undefined4 *)(lVar28 + 0x34);
            FUN_7ff70c7b8300(lVar18,&uStack_68);
            auStack_50[0] =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar19 + 0x10) >> 0x20) +
                          (float)((ulonglong)*(undefined8 *)(lVar19 + 8) >> 0x20),
                          (float)*(undefined8 *)(lVar19 + 0x10) + (float)*(undefined8 *)(lVar19 + 8)
                         );
            FUN_7ff70c7b7c50(lVar18,lVar19 + 8,auStack_50,0);
            *(undefined4 *)(lVar19 + 0x44) = *(undefined4 *)(lVar13 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar6 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar6 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar6 + 0x30) +
                               (float)*(undefined8 *)(lVar6 + 0x28));
          FUN_7ff70c7bd870(lVar18,lVar6 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar24 = *(int *)(lVar14 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar24 = *(int *)(lVar14 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar24 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar14 + 0x278c) = *(int *)(lVar14 + 0x278c) + 1;
  pcVar7 = *(code **)(lVar14 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar7 != (code *)0x0) {
    (*pcVar7)(lVar14,*(undefined8 *)(lVar14 + 0x2778),&UNK_7ff70cb8fed7);
  }
  return (ulonglong)*(byte *)(lVar14 + 0x7d);
}


