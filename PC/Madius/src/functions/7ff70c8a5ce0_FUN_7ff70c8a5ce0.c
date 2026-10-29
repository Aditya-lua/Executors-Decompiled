/* 7ff70c8a5ce0 FUN_7ff70c8a5ce0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8a5ce0(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  code *pcVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  ulonglong uVar9;
  longlong lVar10;
  char cVar11;
  uint uVar12;
  longlong lVar13;
  longlong lVar14;
  longlong lVar15;
  ulonglong uVar16;
  longlong lVar17;
  short sVar18;
  int iVar19;
  uint *puVar20;
  longlong lVar21;
  int iVar22;
  undefined *puVar23;
  char *pcVar24;
  uint *puVar25;
  longlong lVar26;
  int iVar27;
  longlong lVar28;
  longlong lVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  undefined1 auVar33 [16];
  float fVar34;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_50;
  undefined1 auStack_48 [24];
  
  lVar10 = _DAT_7ff70cc1a3c0;
  uVar16 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  lVar17 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar17 + 0xd1) == '\0') {
    lVar21 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x22e0);
    if (lVar21 == 0) {
      if (_DAT_7ff70cbebd80 != (uVar16 ^ (ulonglong)auStack_48)) goto LAB_7ff70c8a5e6c;
      lVar17 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
        if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
            *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
            goto LAB_7ff70c80aff6;
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                           *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
          bVar4 = *(byte *)(lVar10 + 0x27b4);
        }
        else {
LAB_7ff70c80aff6:
          bVar4 = *(byte *)(lVar10 + 0x27b4);
        }
        if ((bVar4 & 1) == 0) {
          *(int *)(lVar10 + 0x27e0) = *(int *)(lVar10 + 0x27e0) + 1;
          *(undefined1 *)(lVar10 + 0x2788) = 0;
          cVar11 = *(char *)(lVar10 + 0x7f);
          lVar21 = _DAT_7ff70cc1a3c0;
        }
        else {
          if (lVar17 == 0) {
            puVar23 = &UNK_7ff70cb8a129;
          }
          else {
            puVar23 = *(undefined **)(lVar17 + 8);
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar23,&UNK_7ff70cb9061f);
          *(undefined1 *)(lVar10 + 0x2788) = 0;
          cVar11 = *(char *)(lVar10 + 0x7f);
          lVar21 = _DAT_7ff70cc1a3c0;
        }
      }
      else {
        *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
        cVar11 = *(char *)(lVar10 + 0x7f);
        lVar21 = _DAT_7ff70cc1a3c0;
      }
      _DAT_7ff70cc1a3c0 = lVar21;
      if (cVar11 != '\x01') {
        pcVar5 = *(code **)(lVar10 + 0x2770);
        goto joined_r0x7ff70c80b41a;
      }
      if (*(char *)(lVar10 + 0x1398) == '\x01') {
        pcVar24 = "Tooltip_Error";
        uVar12 = 0xffffffff;
        do {
          cVar11 = pcVar24[-2];
          if (cVar11 == '#') {
            if ((pcVar24[-1] == '#') && (*pcVar24 == '#')) {
              uVar12 = 0xffffffff;
            }
          }
          else if (cVar11 == '\0') goto LAB_7ff70c80b0c7;
          uVar12 = crc32(uVar12,cVar11);
          pcVar24 = pcVar24 + 1;
        } while( true );
      }
      goto LAB_7ff70c80b40a;
    }
    if (*(char *)(lVar21 + 0x7b) == '\x01') {
      uStack_50 = 0x7ff70c8a5d2f;
      FUN_7ff70c8a5e80();
    }
    if (((*(char *)(lVar21 + 0x7c) == '\0') && (*(int *)(lVar21 + 0x28) != 0)) &&
       (*(int *)(lVar10 + 5000) <= *(int *)(lVar21 + 0x30) + 1)) {
      *(float *)(lVar17 + 0x11c) = *(float *)(lVar21 + 0x40) + *(float *)(lVar21 + 0x48);
      cVar11 = *(char *)(lVar21 + 0x7a);
    }
    else {
      fVar34 = *(float *)(lVar17 + 0x11c) - *(float *)(lVar21 + 0x40);
      auVar33 = blendvps(ZEXT416((uint)*(float *)(lVar21 + 0x44)),ZEXT416((uint)fVar34),
                         ZEXT416(-(uint)(*(float *)(lVar21 + 0x44) <= fVar34)));
      *(float *)(lVar21 + 0x44) = auVar33._0_4_;
      *(float *)(lVar17 + 0x11c) = auVar33._0_4_ + *(float *)(lVar21 + 0x40);
      cVar11 = *(char *)(lVar21 + 0x7a);
    }
    if ('\x01' < cVar11) {
      *(undefined8 *)(lVar17 + 0x118) = *(undefined8 *)(lVar21 + 0x90);
    }
    *(undefined2 *)(lVar21 + 0x80) = 0xffff;
    if ((*(byte *)(lVar21 + 0x1a) & 0x10) == 0) {
      uStack_50 = 0x7ff70c8a5d95;
      FUN_7ff70c844300();
    }
    lVar17 = (longlong)*(int *)(lVar10 + 0x2310) + -1;
    iVar22 = (int)lVar17;
    *(int *)(lVar10 + 0x2310) = iVar22;
    if (iVar22 == 0) {
      lVar21 = 0;
    }
    else {
      lVar17 = lVar17 * 0x10;
      lVar21 = *(longlong *)(*(longlong *)(lVar10 + 0x2318) + -0x10 + lVar17);
      if (lVar21 == 0) {
        lVar21 = (longlong)*(int *)(*(longlong *)(lVar10 + 0x2318) + lVar17 + -8) * 0xa8 +
                 *(longlong *)(_DAT_7ff70cc1a3c0 + 0x22f0);
      }
    }
    *(longlong *)(lVar10 + 0x22e0) = lVar21;
  }
  if (_DAT_7ff70cbebd80 == (uVar16 ^ (ulonglong)auStack_48)) {
    return uVar16 ^ (ulonglong)auStack_48;
  }
LAB_7ff70c8a5e6c:
  uStack_50 = 0x7ff70c8a5e79;
  FUN_7ff70caa97e0(uVar16 ^ (ulonglong)auStack_48);
  pcVar5 = (code *)swi(3);
  uVar16 = (*pcVar5)();
  return uVar16;
LAB_7ff70c80b0c7:
  puVar20 = *(uint **)(lVar21 + 0x1428);
  puVar25 = puVar20 + (longlong)*(int *)(lVar21 + 0x1420) * 4;
  uVar16 = (longlong)*(int *)(lVar21 + 0x1420);
  while (uVar9 = uVar16, uVar9 != 0) {
    uVar16 = uVar9 >> 1;
    if (puVar20[uVar16 * 4] < ~uVar12) {
      puVar20 = puVar20 + uVar16 * 4 + 4;
      uVar16 = ~uVar16 + uVar9;
    }
  }
  if ((((puVar20 == puVar25) || (*puVar20 != ~uVar12)) || (*(longlong *)(puVar20 + 2) == 0)) ||
     (*(char *)(lVar21 + 0xfc) == '\0')) {
    fVar34 = *(float *)(lVar21 + 0xd94);
    fVar6 = *(float *)(lVar21 + 0xd98);
    fVar7 = *(float *)(lVar21 + 0xd9c);
    fVar8 = *(float *)(lVar21 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar21 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar21 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar21 + 0xda0);
    iVar22 = *(int *)(lVar21 + 0x1ef0);
    if (iVar22 == *(int *)(lVar21 + 0x1ef4)) {
      if (iVar22 == 0) {
        iVar19 = 8;
      }
      else {
        iVar19 = iVar22 / 2 + iVar22;
      }
      iVar27 = iVar22 + 1;
      if (iVar22 + 1 < iVar19) {
        iVar27 = iVar19;
      }
      lVar15 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0x14,_DAT_7ff70cc1a3d0);
      lVar14 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar26 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar26 * 8) == *piVar2) {
          sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar26 * 8) + 1;
        }
        else {
          iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
          lVar26 = (longlong)iVar22;
          *(int *)(lVar14 + 0x2874 + lVar26 * 8) = *piVar2;
          *(undefined4 *)(lVar14 + 0x2878 + lVar26 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar14 + 0x2878 + lVar26 * 8) = sVar18;
        *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar21 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar15,*(longlong *)(lVar21 + 0x1ef8),
                         (longlong)*(int *)(lVar21 + 0x1ef0) * 0x14);
        lVar26 = _DAT_7ff70cc1a3c0;
        lVar14 = *(longlong *)(lVar21 + 0x1ef8);
        if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar29 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar29 * 8) == *piVar2) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar29 * 8) + 1;
          }
          else {
            iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
            lVar29 = (longlong)iVar22;
            *(int *)(lVar26 + 0x2874 + lVar29 * 8) = *piVar2;
            *(undefined4 *)(lVar26 + 0x2878 + lVar29 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(lVar26 + 0x287a + lVar29 * 8) = sVar18;
          *(int *)(lVar26 + 0x286c) = *(int *)(lVar26 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar21 + 0x1ef8) = lVar15;
      *(int *)(lVar21 + 0x1ef4) = iVar27;
      iVar22 = *(int *)(lVar21 + 0x1ef0);
    }
    else {
      lVar15 = *(longlong *)(lVar21 + 0x1ef8);
    }
    *(undefined4 *)(lVar15 + (longlong)iVar22 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar15 + 4 + (longlong)iVar22 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar21 + 0x1ef0) = *(int *)(lVar21 + 0x1ef0) + 1;
    if (*(int *)(lVar21 + 0x1eec) != 4) {
      fVar30 = (_UNK_7ff70cb1d634 - fVar6) * _UNK_7ff70cb1d644;
      fVar31 = (_UNK_7ff70cb1d638 - fVar7) * _UNK_7ff70cb1d648;
      fVar32 = (_UNK_7ff70cb1d63c - fVar8) * _UNK_7ff70cb1d64c;
      *(float *)(lVar21 + 0xd94) = (_DAT_7ff70cb1d630 - fVar34) * _DAT_7ff70cb1d640 + fVar34;
      *(float *)(lVar21 + 0xd98) = fVar30 + fVar6;
      *(float *)(lVar21 + 0xd9c) = fVar31 + fVar7;
      *(float *)(lVar21 + 0xda0) = fVar32 + fVar8;
    }
  }
  else {
    cVar11 = *(char *)(*(longlong *)(puVar20 + 2) + 0xcd);
    fVar34 = *(float *)(lVar21 + 0xd94);
    fVar6 = *(float *)(lVar21 + 0xd98);
    fVar7 = *(float *)(lVar21 + 0xd9c);
    fVar8 = *(float *)(lVar21 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar21 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar21 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar21 + 0xda0);
    iVar22 = *(int *)(lVar21 + 0x1ef0);
    if (iVar22 == *(int *)(lVar21 + 0x1ef4)) {
      if (iVar22 == 0) {
        iVar19 = 8;
      }
      else {
        iVar19 = iVar22 / 2 + iVar22;
      }
      iVar27 = iVar22 + 1;
      if (iVar22 + 1 < iVar19) {
        iVar27 = iVar19;
      }
      lVar15 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0x14,_DAT_7ff70cc1a3d0);
      lVar14 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar26 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar26 * 8) == *piVar2) {
          sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar26 * 8) + 1;
        }
        else {
          iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
          lVar26 = (longlong)iVar22;
          *(int *)(lVar14 + 0x2874 + lVar26 * 8) = *piVar2;
          *(undefined4 *)(lVar14 + 0x2878 + lVar26 * 8) = 0;
          sVar18 = 1;
        }
        *(short *)(lVar14 + 0x2878 + lVar26 * 8) = sVar18;
        *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar21 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar15,*(longlong *)(lVar21 + 0x1ef8),
                         (longlong)*(int *)(lVar21 + 0x1ef0) * 0x14);
        lVar26 = _DAT_7ff70cc1a3c0;
        lVar14 = *(longlong *)(lVar21 + 0x1ef8);
        if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar29 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar29 * 8) == *piVar2) {
            sVar18 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar29 * 8) + 1;
          }
          else {
            iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
            lVar29 = (longlong)iVar22;
            *(int *)(lVar26 + 0x2874 + lVar29 * 8) = *piVar2;
            *(undefined4 *)(lVar26 + 0x2878 + lVar29 * 8) = 0;
            sVar18 = 1;
          }
          *(short *)(lVar26 + 0x287a + lVar29 * 8) = sVar18;
          *(int *)(lVar26 + 0x286c) = *(int *)(lVar26 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar21 + 0x1ef8) = lVar15;
      *(int *)(lVar21 + 0x1ef4) = iVar27;
      iVar22 = *(int *)(lVar21 + 0x1ef0);
    }
    else {
      lVar15 = *(longlong *)(lVar21 + 0x1ef8);
    }
    *(undefined4 *)(lVar15 + (longlong)iVar22 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar15 + 4 + (longlong)iVar22 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar21 + 0x1ef0) = *(int *)(lVar21 + 0x1ef0) + 1;
    if (*(int *)(lVar21 + 0x1eec) != 4) {
      fVar30 = (_UNK_7ff70cb1d634 - fVar6) * _UNK_7ff70cb1d644;
      fVar31 = (_UNK_7ff70cb1d638 - fVar7) * _UNK_7ff70cb1d648;
      fVar32 = (_UNK_7ff70cb1d63c - fVar8) * _UNK_7ff70cb1d64c;
      *(float *)(lVar21 + 0xd94) = (_DAT_7ff70cb1d630 - fVar34) * _DAT_7ff70cb1d640 + fVar34;
      *(float *)(lVar21 + 0xd98) = fVar30 + fVar6;
      *(float *)(lVar21 + 0xd9c) = fVar31 + fVar7;
      *(float *)(lVar21 + 0xda0) = fVar32 + fVar8;
    }
    lVar15 = _DAT_7ff70cc1a3c0;
    if (cVar11 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar15 + 0x1e80) = *(undefined8 *)(lVar21 + 0x2780);
      *(undefined8 *)(lVar15 + 0x1e88) = 0;
      *(undefined4 *)(lVar15 + 0x1e74) = 1;
    }
  }
  cVar11 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar11 != '\0') {
    if (*(short *)(*(longlong *)(lVar21 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar29 = _DAT_7ff70cc1a3c0;
      lVar15 = *(longlong *)(lVar21 + 0x1440);
      lVar14 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar22 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar26 = *(longlong *)(lVar14 + -8 + (longlong)iVar22 * 8);
      if (((lVar26 != lVar15) && (1 < iVar22)) && (*(longlong *)(lVar26 + 0x3c0) != lVar15)) {
        uVar16 = (ulonglong)(iVar22 - 1);
        iVar22 = 1;
        do {
          uVar12 = (int)uVar16 - 1;
          uVar16 = (ulonglong)uVar12;
          if (*(longlong *)(lVar14 + uVar16 * 8) == lVar15) {
            FUN_7ff70cb12b70(lVar14 + uVar16 * 8,lVar14 + uVar16 * 8 + 8,(longlong)iVar22 << 3);
            *(longlong *)
             (*(longlong *)(lVar29 + 0x13e8) + -8 + (longlong)*(int *)(lVar29 + 0x13e0) * 8) =
                 lVar15;
            lVar15 = *(longlong *)(lVar21 + 0x1440);
            break;
          }
          iVar22 = iVar22 + 1;
        } while (0 < (int)uVar12);
      }
      lVar26 = _DAT_7ff70cc1a3c0;
      lVar14 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar14 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar15)
      {
        iVar19 = (int)*(short *)(lVar15 + 0xe2);
        lVar13 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar22 = (int)lVar13;
        lVar29 = lVar13;
        if (iVar22 - iVar19 != 0 && iVar19 <= iVar22) {
          lVar28 = (longlong)iVar19;
          lVar29 = (longlong)iVar22;
          lVar14 = lVar28;
          if ((iVar22 - iVar19 & 1U) != 0) {
            lVar14 = lVar28 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar28 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar28 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + lVar28 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar29 + -1 != lVar28) {
            do {
              *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + lVar14 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar14 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + lVar14 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar14 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 0x10 + lVar14 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar14 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar14 = lVar14 + 2;
            } while (lVar29 != lVar14);
          }
          lVar14 = *(longlong *)(lVar26 + 0x13f8);
        }
        *(longlong *)(lVar14 + lVar29 * 8) = lVar15;
        *(short *)(lVar15 + 0xe2) = (short)lVar13;
      }
      *(undefined8 *)(lVar21 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar22 = *(int *)(lVar10 + 0x278c);
    }
    else {
      iVar22 = *(int *)(lVar10 + 0x278c);
    }
    if (iVar22 < 0x14) {
      if (lVar17 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9061f);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar17 + 8),&UNK_7ff70cb9061f);
        lVar21 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar17 + 0xd5) != '\x01') || (*(char *)(lVar17 + 0xcd) == '\x01')) {
          lVar15 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar14 = *(longlong *)(lVar15 + 0x50);
          if (lVar14 == 0) {
            lVar14 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar26 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar29 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar29 * 8) == *piVar2) {
                sVar18 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar29 * 8) + 1;
              }
              else {
                iVar22 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar22;
                lVar29 = (longlong)iVar22;
                *(int *)(lVar26 + 0x2874 + lVar29 * 8) = *piVar2;
                *(undefined4 *)(lVar26 + 0x2878 + lVar29 * 8) = 0;
                sVar18 = 1;
              }
              *(short *)(lVar26 + 0x2878 + lVar29 * 8) = sVar18;
              *(int *)(lVar26 + 0x2868) = *(int *)(lVar26 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar14,lVar21 + 0x1148);
            *(undefined **)(lVar14 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar15 + 0x50) = lVar14;
          }
          if (*(int *)(lVar15 + 0x44) != *(int *)(lVar21 + 5000)) {
            FUN_7ff70c7b6160(lVar14);
            lVar26 = *(longlong *)(lVar21 + 0x40);
            uStack_68 = *(undefined8 *)(lVar26 + 0x28);
            uStack_60 = *(undefined4 *)(lVar26 + 0x30);
            uStack_5c = *(undefined4 *)(lVar26 + 0x34);
            FUN_7ff70c7b8300(lVar14,&uStack_68);
            uStack_50 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar15 + 0x10) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar15 + 8) >> 0x20),
                                 (float)*(undefined8 *)(lVar15 + 0x10) +
                                 (float)*(undefined8 *)(lVar15 + 8));
            FUN_7ff70c7b7c50(lVar14,lVar15 + 8,&uStack_50,0);
            *(undefined4 *)(lVar15 + 0x44) = *(undefined4 *)(lVar21 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar17 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar17 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar17 + 0x30) +
                               (float)*(undefined8 *)(lVar17 + 0x28));
          FUN_7ff70c7bd870(lVar14,lVar17 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar22 = *(int *)(lVar10 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar22 = *(int *)(lVar10 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar22 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar10 + 0x278c) = *(int *)(lVar10 + 0x278c) + 1;
  pcVar5 = *(code **)(lVar10 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar5 != (code *)0x0) {
    (*pcVar5)(lVar10,*(undefined8 *)(lVar10 + 0x2778),&UNK_7ff70cb9061f);
  }
  return (ulonglong)*(byte *)(lVar10 + 0x7d);
}


