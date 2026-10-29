/* 7ff70c83c5b0 FUN_7ff70c83c5b0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c83c5b0(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  longlong lVar5;
  code *pcVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  ulonglong uVar11;
  longlong lVar12;
  longlong lVar13;
  char cVar14;
  uint uVar15;
  longlong lVar16;
  longlong lVar17;
  longlong lVar18;
  ulonglong uVar19;
  short sVar20;
  int iVar21;
  uint *puVar22;
  int iVar23;
  undefined *puVar24;
  char *pcVar25;
  uint *puVar26;
  longlong lVar27;
  int iVar28;
  longlong lVar29;
  longlong lVar30;
  float fVar31;
  float fVar32;
  float fVar33;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 auStack_50 [3];
  
  lVar13 = _DAT_7ff70cc1a3c0;
  uVar19 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  if (1 < *(int *)(_DAT_7ff70cc1a3c0 + 0x1f30)) {
    uVar15 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f30) - 1;
    *(uint *)(_DAT_7ff70cc1a3c0 + 0x1f30) = uVar15;
    *(undefined4 *)(lVar13 + 0x1de0) =
         *(undefined4 *)(*(longlong *)(lVar13 + 0x1f38) + -4 + (ulonglong)uVar15 * 4);
    if (_DAT_7ff70cbebd80 == (uVar19 ^ (ulonglong)&stack0xffffffffffffffd8)) {
      return uVar19 ^ (ulonglong)&stack0xffffffffffffffd8;
    }
LAB_7ff70c83c62b:
    FUN_7ff70caa97e0(uVar19 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar6 = (code *)swi(3);
    uVar19 = (*pcVar6)();
    return uVar19;
  }
  if (_DAT_7ff70cbebd80 != (uVar19 ^ (ulonglong)&stack0xffffffffffffffd8)) goto LAB_7ff70c83c62b;
  lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
        goto LAB_7ff70c80aff6;
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                       *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
      bVar4 = *(byte *)(lVar13 + 0x27b4);
    }
    else {
LAB_7ff70c80aff6:
      bVar4 = *(byte *)(lVar13 + 0x27b4);
    }
    if ((bVar4 & 1) == 0) {
      *(int *)(lVar13 + 0x27e0) = *(int *)(lVar13 + 0x27e0) + 1;
      *(undefined1 *)(lVar13 + 0x2788) = 0;
      cVar14 = *(char *)(lVar13 + 0x7f);
      lVar12 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar5 == 0) {
        puVar24 = &UNK_7ff70cb8a129;
      }
      else {
        puVar24 = *(undefined **)(lVar5 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar24,&UNK_7ff70cb9010e);
      *(undefined1 *)(lVar13 + 0x2788) = 0;
      cVar14 = *(char *)(lVar13 + 0x7f);
      lVar12 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar14 = *(char *)(lVar13 + 0x7f);
    lVar12 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar12;
  if (cVar14 != '\x01') {
    pcVar6 = *(code **)(lVar13 + 0x2770);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(lVar13 + 0x1398) == '\x01') {
    pcVar25 = "Tooltip_Error";
    uVar15 = 0xffffffff;
    do {
      cVar14 = pcVar25[-2];
      if (cVar14 == '#') {
        if ((pcVar25[-1] == '#') && (*pcVar25 == '#')) {
          uVar15 = 0xffffffff;
        }
      }
      else if (cVar14 == '\0') goto LAB_7ff70c80b0c7;
      uVar15 = crc32(uVar15,cVar14);
      pcVar25 = pcVar25 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar22 = *(uint **)(lVar12 + 0x1428);
  puVar26 = puVar22 + (longlong)*(int *)(lVar12 + 0x1420) * 4;
  uVar19 = (longlong)*(int *)(lVar12 + 0x1420);
  while (uVar11 = uVar19, uVar11 != 0) {
    uVar19 = uVar11 >> 1;
    if (puVar22[uVar19 * 4] < ~uVar15) {
      puVar22 = puVar22 + uVar19 * 4 + 4;
      uVar19 = ~uVar19 + uVar11;
    }
  }
  if ((((puVar22 == puVar26) || (*puVar22 != ~uVar15)) || (*(longlong *)(puVar22 + 2) == 0)) ||
     (*(char *)(lVar12 + 0xfc) == '\0')) {
    fVar7 = *(float *)(lVar12 + 0xd94);
    fVar8 = *(float *)(lVar12 + 0xd98);
    fVar9 = *(float *)(lVar12 + 0xd9c);
    fVar10 = *(float *)(lVar12 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar12 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar12 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar12 + 0xda0);
    iVar23 = *(int *)(lVar12 + 0x1ef0);
    if (iVar23 == *(int *)(lVar12 + 0x1ef4)) {
      if (iVar23 == 0) {
        iVar21 = 8;
      }
      else {
        iVar21 = iVar23 / 2 + iVar23;
      }
      iVar28 = iVar23 + 1;
      if (iVar23 + 1 < iVar21) {
        iVar28 = iVar21;
      }
      lVar18 = (*_DAT_7ff70cbe9460)((longlong)iVar28 * 0x14,_DAT_7ff70cc1a3d0);
      lVar17 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar2) {
          sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar27 * 8) + 1;
        }
        else {
          iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
          lVar27 = (longlong)iVar23;
          *(int *)(lVar17 + 0x2874 + lVar27 * 8) = *piVar2;
          *(undefined4 *)(lVar17 + 0x2878 + lVar27 * 8) = 0;
          sVar20 = 1;
        }
        *(short *)(lVar17 + 0x2878 + lVar27 * 8) = sVar20;
        *(int *)(lVar17 + 0x2868) = *(int *)(lVar17 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar12 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar18,*(longlong *)(lVar12 + 0x1ef8),
                         (longlong)*(int *)(lVar12 + 0x1ef0) * 0x14);
        lVar27 = _DAT_7ff70cc1a3c0;
        lVar17 = *(longlong *)(lVar12 + 0x1ef8);
        if ((lVar17 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
            sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
          }
          else {
            iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
            lVar30 = (longlong)iVar23;
            *(int *)(lVar27 + 0x2874 + lVar30 * 8) = *piVar2;
            *(undefined4 *)(lVar27 + 0x2878 + lVar30 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar27 + 0x287a + lVar30 * 8) = sVar20;
          *(int *)(lVar27 + 0x286c) = *(int *)(lVar27 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar17,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar12 + 0x1ef8) = lVar18;
      *(int *)(lVar12 + 0x1ef4) = iVar28;
      iVar23 = *(int *)(lVar12 + 0x1ef0);
    }
    else {
      lVar18 = *(longlong *)(lVar12 + 0x1ef8);
    }
    *(undefined4 *)(lVar18 + (longlong)iVar23 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar18 + 4 + (longlong)iVar23 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar12 + 0x1ef0) = *(int *)(lVar12 + 0x1ef0) + 1;
    if (*(int *)(lVar12 + 0x1eec) != 4) {
      fVar31 = (_UNK_7ff70cb1d634 - fVar8) * _UNK_7ff70cb1d644;
      fVar32 = (_UNK_7ff70cb1d638 - fVar9) * _UNK_7ff70cb1d648;
      fVar33 = (_UNK_7ff70cb1d63c - fVar10) * _UNK_7ff70cb1d64c;
      *(float *)(lVar12 + 0xd94) = (_DAT_7ff70cb1d630 - fVar7) * _DAT_7ff70cb1d640 + fVar7;
      *(float *)(lVar12 + 0xd98) = fVar31 + fVar8;
      *(float *)(lVar12 + 0xd9c) = fVar32 + fVar9;
      *(float *)(lVar12 + 0xda0) = fVar33 + fVar10;
    }
  }
  else {
    cVar14 = *(char *)(*(longlong *)(puVar22 + 2) + 0xcd);
    fVar7 = *(float *)(lVar12 + 0xd94);
    fVar8 = *(float *)(lVar12 + 0xd98);
    fVar9 = *(float *)(lVar12 + 0xd9c);
    fVar10 = *(float *)(lVar12 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar12 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar12 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar12 + 0xda0);
    iVar23 = *(int *)(lVar12 + 0x1ef0);
    if (iVar23 == *(int *)(lVar12 + 0x1ef4)) {
      if (iVar23 == 0) {
        iVar21 = 8;
      }
      else {
        iVar21 = iVar23 / 2 + iVar23;
      }
      iVar28 = iVar23 + 1;
      if (iVar23 + 1 < iVar21) {
        iVar28 = iVar21;
      }
      lVar18 = (*_DAT_7ff70cbe9460)((longlong)iVar28 * 0x14,_DAT_7ff70cc1a3d0);
      lVar17 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar2) {
          sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar27 * 8) + 1;
        }
        else {
          iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
          lVar27 = (longlong)iVar23;
          *(int *)(lVar17 + 0x2874 + lVar27 * 8) = *piVar2;
          *(undefined4 *)(lVar17 + 0x2878 + lVar27 * 8) = 0;
          sVar20 = 1;
        }
        *(short *)(lVar17 + 0x2878 + lVar27 * 8) = sVar20;
        *(int *)(lVar17 + 0x2868) = *(int *)(lVar17 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar12 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar18,*(longlong *)(lVar12 + 0x1ef8),
                         (longlong)*(int *)(lVar12 + 0x1ef0) * 0x14);
        lVar27 = _DAT_7ff70cc1a3c0;
        lVar17 = *(longlong *)(lVar12 + 0x1ef8);
        if ((lVar17 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
            sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar30 * 8) + 1;
          }
          else {
            iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
            lVar30 = (longlong)iVar23;
            *(int *)(lVar27 + 0x2874 + lVar30 * 8) = *piVar2;
            *(undefined4 *)(lVar27 + 0x2878 + lVar30 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar27 + 0x287a + lVar30 * 8) = sVar20;
          *(int *)(lVar27 + 0x286c) = *(int *)(lVar27 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar17,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar12 + 0x1ef8) = lVar18;
      *(int *)(lVar12 + 0x1ef4) = iVar28;
      iVar23 = *(int *)(lVar12 + 0x1ef0);
    }
    else {
      lVar18 = *(longlong *)(lVar12 + 0x1ef8);
    }
    *(undefined4 *)(lVar18 + (longlong)iVar23 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar18 + 4 + (longlong)iVar23 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar12 + 0x1ef0) = *(int *)(lVar12 + 0x1ef0) + 1;
    if (*(int *)(lVar12 + 0x1eec) != 4) {
      fVar31 = (_UNK_7ff70cb1d634 - fVar8) * _UNK_7ff70cb1d644;
      fVar32 = (_UNK_7ff70cb1d638 - fVar9) * _UNK_7ff70cb1d648;
      fVar33 = (_UNK_7ff70cb1d63c - fVar10) * _UNK_7ff70cb1d64c;
      *(float *)(lVar12 + 0xd94) = (_DAT_7ff70cb1d630 - fVar7) * _DAT_7ff70cb1d640 + fVar7;
      *(float *)(lVar12 + 0xd98) = fVar31 + fVar8;
      *(float *)(lVar12 + 0xd9c) = fVar32 + fVar9;
      *(float *)(lVar12 + 0xda0) = fVar33 + fVar10;
    }
    lVar18 = _DAT_7ff70cc1a3c0;
    if (cVar14 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar18 + 0x1e80) = *(undefined8 *)(lVar12 + 0x2780);
      *(undefined8 *)(lVar18 + 0x1e88) = 0;
      *(undefined4 *)(lVar18 + 0x1e74) = 1;
    }
  }
  cVar14 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar14 != '\0') {
    if (*(short *)(*(longlong *)(lVar12 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar30 = _DAT_7ff70cc1a3c0;
      lVar18 = *(longlong *)(lVar12 + 0x1440);
      lVar17 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar23 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar27 = *(longlong *)(lVar17 + -8 + (longlong)iVar23 * 8);
      if (((lVar27 != lVar18) && (1 < iVar23)) && (*(longlong *)(lVar27 + 0x3c0) != lVar18)) {
        uVar19 = (ulonglong)(iVar23 - 1);
        iVar23 = 1;
        do {
          uVar15 = (int)uVar19 - 1;
          uVar19 = (ulonglong)uVar15;
          if (*(longlong *)(lVar17 + uVar19 * 8) == lVar18) {
            FUN_7ff70cb12b70(lVar17 + uVar19 * 8,lVar17 + uVar19 * 8 + 8,(longlong)iVar23 << 3);
            *(longlong *)
             (*(longlong *)(lVar30 + 0x13e8) + -8 + (longlong)*(int *)(lVar30 + 0x13e0) * 8) =
                 lVar18;
            lVar18 = *(longlong *)(lVar12 + 0x1440);
            break;
          }
          iVar23 = iVar23 + 1;
        } while (0 < (int)uVar15);
      }
      lVar27 = _DAT_7ff70cc1a3c0;
      lVar17 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar17 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar18)
      {
        iVar21 = (int)*(short *)(lVar18 + 0xe2);
        lVar16 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar23 = (int)lVar16;
        lVar30 = lVar16;
        if (iVar23 - iVar21 != 0 && iVar21 <= iVar23) {
          lVar29 = (longlong)iVar21;
          lVar30 = (longlong)iVar23;
          lVar17 = lVar29;
          if ((iVar23 - iVar21 & 1U) != 0) {
            lVar17 = lVar29 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar29 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar29 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar27 + 0x13f8) + lVar29 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar30 + -1 != lVar29) {
            do {
              *(undefined8 *)(*(longlong *)(lVar27 + 0x13f8) + lVar17 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar27 + 0x13f8) + 8 + lVar17 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar27 + 0x13f8) + lVar17 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar27 + 0x13f8) + 8 + lVar17 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar27 + 0x13f8) + 0x10 + lVar17 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar27 + 0x13f8) + 8 + lVar17 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar17 = lVar17 + 2;
            } while (lVar30 != lVar17);
          }
          lVar17 = *(longlong *)(lVar27 + 0x13f8);
        }
        *(longlong *)(lVar17 + lVar30 * 8) = lVar18;
        *(short *)(lVar18 + 0xe2) = (short)lVar16;
      }
      *(undefined8 *)(lVar12 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar23 = *(int *)(lVar13 + 0x278c);
    }
    else {
      iVar23 = *(int *)(lVar13 + 0x278c);
    }
    if (iVar23 < 0x14) {
      if (lVar5 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9010e);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar5 + 8),&UNK_7ff70cb9010e);
        lVar12 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar5 + 0xd5) != '\x01') || (*(char *)(lVar5 + 0xcd) == '\x01')) {
          lVar18 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar17 = *(longlong *)(lVar18 + 0x50);
          if (lVar17 == 0) {
            lVar17 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar27 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar30 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar30 * 8) == *piVar2) {
                sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar30 * 8) + 1;
              }
              else {
                iVar23 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar23;
                lVar30 = (longlong)iVar23;
                *(int *)(lVar27 + 0x2874 + lVar30 * 8) = *piVar2;
                *(undefined4 *)(lVar27 + 0x2878 + lVar30 * 8) = 0;
                sVar20 = 1;
              }
              *(short *)(lVar27 + 0x2878 + lVar30 * 8) = sVar20;
              *(int *)(lVar27 + 0x2868) = *(int *)(lVar27 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar17,lVar12 + 0x1148);
            *(undefined **)(lVar17 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar18 + 0x50) = lVar17;
          }
          if (*(int *)(lVar18 + 0x44) != *(int *)(lVar12 + 5000)) {
            FUN_7ff70c7b6160(lVar17);
            lVar27 = *(longlong *)(lVar12 + 0x40);
            uStack_68 = *(undefined8 *)(lVar27 + 0x28);
            uStack_60 = *(undefined4 *)(lVar27 + 0x30);
            uStack_5c = *(undefined4 *)(lVar27 + 0x34);
            FUN_7ff70c7b8300(lVar17,&uStack_68);
            auStack_50[0] =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar18 + 0x10) >> 0x20) +
                          (float)((ulonglong)*(undefined8 *)(lVar18 + 8) >> 0x20),
                          (float)*(undefined8 *)(lVar18 + 0x10) + (float)*(undefined8 *)(lVar18 + 8)
                         );
            FUN_7ff70c7b7c50(lVar17,lVar18 + 8,auStack_50,0);
            *(undefined4 *)(lVar18 + 0x44) = *(undefined4 *)(lVar12 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar5 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar5 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar5 + 0x30) +
                               (float)*(undefined8 *)(lVar5 + 0x28));
          FUN_7ff70c7bd870(lVar17,lVar5 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar23 = *(int *)(lVar13 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar23 = *(int *)(lVar13 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar23 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar13 + 0x278c) = *(int *)(lVar13 + 0x278c) + 1;
  pcVar6 = *(code **)(lVar13 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar6 != (code *)0x0) {
    (*pcVar6)(lVar13,*(undefined8 *)(lVar13 + 0x2778),&UNK_7ff70cb9010e);
  }
  return (ulonglong)*(byte *)(lVar13 + 0x7d);
}


