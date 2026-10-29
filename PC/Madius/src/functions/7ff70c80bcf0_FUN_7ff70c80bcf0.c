/* 7ff70c80bcf0 FUN_7ff70c80bcf0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c80bcf0(uint param_1,undefined4 param_2)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  ushort uVar5;
  undefined8 uVar6;
  longlong lVar7;
  code *pcVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  ulonglong uVar13;
  longlong lVar14;
  char cVar15;
  uint uVar16;
  longlong lVar17;
  longlong lVar18;
  ulonglong uVar19;
  short sVar20;
  int iVar21;
  uint *puVar22;
  undefined *puVar23;
  char *pcVar24;
  uint *puVar25;
  longlong lVar26;
  longlong lVar27;
  int iVar28;
  int iVar29;
  longlong lVar30;
  longlong lVar31;
  longlong lVar32;
  float fVar33;
  float fVar34;
  float fVar35;
  uint uVar36;
  undefined8 in_stack_ffffffffffffff80;
  undefined4 auStack_78 [4];
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  ulonglong auStack_50 [4];
  
  lVar14 = _DAT_7ff70cc1a3c0;
  uVar36 = (uint)((ulonglong)in_stack_ffffffffffffff80 >> 0x20);
  auStack_50[0] = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if ((0xd9002c864U >> ((ulonglong)param_1 & 0x3f) & 1) != 0) {
    uVar5 = *(ushort *)(&UNK_7ff70cb1d062 + (longlong)(int)param_1 * 4);
    uVar6 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xc40 + (ulonglong)uVar5);
    iVar29 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
    if (iVar29 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f04)) {
      if (iVar29 == 0) {
        iVar21 = 8;
      }
      else {
        iVar21 = iVar29 / 2 + iVar29;
      }
      iVar28 = iVar29 + 1;
      if (iVar29 + 1 < iVar21) {
        iVar28 = iVar21;
      }
      lVar18 = (*_DAT_7ff70cbe9460)((longlong)iVar28 * 0xc,_DAT_7ff70cc1a3d0);
      lVar7 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar2) {
          sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar27 * 8) + 1;
        }
        else {
          iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
          lVar27 = (longlong)iVar29;
          *(int *)(lVar7 + 0x2874 + lVar27 * 8) = *piVar2;
          *(undefined4 *)(lVar7 + 0x2878 + lVar27 * 8) = 0;
          sVar20 = 1;
        }
        *(short *)(lVar7 + 0x2878 + lVar27 * 8) = sVar20;
        *(int *)(lVar7 + 0x2868) = *(int *)(lVar7 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar14 + 0x1f08) != 0) {
        FUN_7ff70cb12b60(lVar18,*(longlong *)(lVar14 + 0x1f08),
                         (longlong)*(int *)(lVar14 + 0x1f00) * 0xc);
        lVar27 = _DAT_7ff70cc1a3c0;
        lVar7 = *(longlong *)(lVar14 + 0x1f08);
        if ((lVar7 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar32 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar32 * 8) == *piVar2) {
            sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar32 * 8) + 1;
          }
          else {
            iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
            lVar32 = (longlong)iVar29;
            *(int *)(lVar27 + 0x2874 + lVar32 * 8) = *piVar2;
            *(undefined4 *)(lVar27 + 0x2878 + lVar32 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar27 + 0x287a + lVar32 * 8) = sVar20;
          *(int *)(lVar27 + 0x286c) = *(int *)(lVar27 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar14 + 0x1f08) = lVar18;
      *(int *)(lVar14 + 0x1f04) = iVar28;
      iVar29 = *(int *)(lVar14 + 0x1f00);
    }
    else {
      lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f08);
    }
    *(uint *)(lVar18 + (longlong)iVar29 * 0xc) = param_1;
    *(undefined8 *)(lVar18 + 4 + (longlong)iVar29 * 0xc) = uVar6;
    *(int *)(lVar14 + 0x1f00) = *(int *)(lVar14 + 0x1f00) + 1;
    *(undefined4 *)(lVar14 + 0xc40 + (ulonglong)uVar5) = param_2;
    if (_DAT_7ff70cbebd80 == (auStack_50[0] ^ (ulonglong)auStack_78)) {
      return auStack_50[0] ^ (ulonglong)auStack_78;
    }
LAB_7ff70c80bf73:
    FUN_7ff70caa97e0(auStack_50[0] ^ (ulonglong)auStack_78);
    pcVar8 = (code *)swi(3);
    uVar19 = (*pcVar8)();
    return uVar19;
  }
  if (_DAT_7ff70cbebd80 != (auStack_50[0] ^ (ulonglong)auStack_78)) goto LAB_7ff70c80bf73;
  lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
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
      lVar7 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar18 == 0) {
        puVar23 = &UNK_7ff70cb8a129;
      }
      else {
        puVar23 = *(undefined **)(lVar18 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar23,&UNK_7ff70cb90469);
      *(undefined1 *)(lVar14 + 0x2788) = 0;
      cVar15 = *(char *)(lVar14 + 0x7f);
      lVar7 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar15 = *(char *)(lVar14 + 0x7f);
    lVar7 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar7;
  if (cVar15 != '\x01') {
    pcVar8 = *(code **)(lVar14 + 0x2770);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(lVar14 + 0x1398) == '\x01') {
    pcVar24 = "Tooltip_Error";
    uVar16 = 0xffffffff;
    do {
      cVar15 = pcVar24[-2];
      if (cVar15 == '#') {
        if ((pcVar24[-1] == '#') && (*pcVar24 == '#')) {
          uVar16 = 0xffffffff;
        }
      }
      else if (cVar15 == '\0') goto LAB_7ff70c80b0c7;
      uVar16 = crc32(uVar16,cVar15);
      pcVar24 = pcVar24 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar22 = *(uint **)(lVar7 + 0x1428);
  puVar25 = puVar22 + (longlong)*(int *)(lVar7 + 0x1420) * 4;
  uVar19 = (longlong)*(int *)(lVar7 + 0x1420);
  while (uVar13 = uVar19, uVar13 != 0) {
    uVar19 = uVar13 >> 1;
    if (puVar22[uVar19 * 4] < ~uVar16) {
      puVar22 = puVar22 + uVar19 * 4 + 4;
      uVar19 = ~uVar19 + uVar13;
    }
  }
  if ((((puVar22 == puVar25) || (*puVar22 != ~uVar16)) || (*(longlong *)(puVar22 + 2) == 0)) ||
     (*(char *)(lVar7 + 0xfc) == '\0')) {
    fVar9 = *(float *)(lVar7 + 0xd94);
    fVar10 = *(float *)(lVar7 + 0xd98);
    fVar11 = *(float *)(lVar7 + 0xd9c);
    fVar12 = *(float *)(lVar7 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar7 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar7 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar7 + 0xda0);
    iVar29 = *(int *)(lVar7 + 0x1ef0);
    if (iVar29 == *(int *)(lVar7 + 0x1ef4)) {
      if (iVar29 == 0) {
        iVar21 = 8;
      }
      else {
        iVar21 = iVar29 / 2 + iVar29;
      }
      iVar28 = iVar29 + 1;
      if (iVar29 + 1 < iVar21) {
        iVar28 = iVar21;
      }
      lVar27 = (*_DAT_7ff70cbe9460)((longlong)iVar28 * 0x14,_DAT_7ff70cc1a3d0);
      lVar32 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar26 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar26 * 8) == *piVar2) {
          sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar26 * 8) + 1;
        }
        else {
          iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
          lVar26 = (longlong)iVar29;
          *(int *)(lVar32 + 0x2874 + lVar26 * 8) = *piVar2;
          *(undefined4 *)(lVar32 + 0x2878 + lVar26 * 8) = 0;
          sVar20 = 1;
        }
        *(short *)(lVar32 + 0x2878 + lVar26 * 8) = sVar20;
        *(int *)(lVar32 + 0x2868) = *(int *)(lVar32 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar7 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar27,*(longlong *)(lVar7 + 0x1ef8),
                         (longlong)*(int *)(lVar7 + 0x1ef0) * 0x14);
        lVar26 = _DAT_7ff70cc1a3c0;
        lVar32 = *(longlong *)(lVar7 + 0x1ef8);
        if ((lVar32 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
            sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
          }
          else {
            iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
            lVar31 = (longlong)iVar29;
            *(int *)(lVar26 + 0x2874 + lVar31 * 8) = *piVar2;
            *(undefined4 *)(lVar26 + 0x2878 + lVar31 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar26 + 0x287a + lVar31 * 8) = sVar20;
          *(int *)(lVar26 + 0x286c) = *(int *)(lVar26 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar32,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar7 + 0x1ef8) = lVar27;
      *(int *)(lVar7 + 0x1ef4) = iVar28;
      iVar29 = *(int *)(lVar7 + 0x1ef0);
    }
    else {
      lVar27 = *(longlong *)(lVar7 + 0x1ef8);
    }
    *(undefined4 *)(lVar27 + (longlong)iVar29 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar27 + 4 + (longlong)iVar29 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar7 + 0x1ef0) = *(int *)(lVar7 + 0x1ef0) + 1;
    if (*(int *)(lVar7 + 0x1eec) != 4) {
      fVar33 = (_UNK_7ff70cb1d634 - fVar10) * _UNK_7ff70cb1d644;
      fVar34 = (_UNK_7ff70cb1d638 - fVar11) * _UNK_7ff70cb1d648;
      fVar35 = (_UNK_7ff70cb1d63c - fVar12) * _UNK_7ff70cb1d64c;
      *(float *)(lVar7 + 0xd94) = (_DAT_7ff70cb1d630 - fVar9) * _DAT_7ff70cb1d640 + fVar9;
      *(float *)(lVar7 + 0xd98) = fVar33 + fVar10;
      *(float *)(lVar7 + 0xd9c) = fVar34 + fVar11;
      *(float *)(lVar7 + 0xda0) = fVar35 + fVar12;
    }
  }
  else {
    cVar15 = *(char *)(*(longlong *)(puVar22 + 2) + 0xcd);
    fVar9 = *(float *)(lVar7 + 0xd94);
    fVar10 = *(float *)(lVar7 + 0xd98);
    fVar11 = *(float *)(lVar7 + 0xd9c);
    fVar12 = *(float *)(lVar7 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar7 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar7 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar7 + 0xda0);
    iVar29 = *(int *)(lVar7 + 0x1ef0);
    if (iVar29 == *(int *)(lVar7 + 0x1ef4)) {
      if (iVar29 == 0) {
        iVar21 = 8;
      }
      else {
        iVar21 = iVar29 / 2 + iVar29;
      }
      iVar28 = iVar29 + 1;
      if (iVar29 + 1 < iVar21) {
        iVar28 = iVar21;
      }
      lVar27 = (*_DAT_7ff70cbe9460)((longlong)iVar28 * 0x14,_DAT_7ff70cc1a3d0);
      lVar32 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar26 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar26 * 8) == *piVar2) {
          sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar26 * 8) + 1;
        }
        else {
          iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
          lVar26 = (longlong)iVar29;
          *(int *)(lVar32 + 0x2874 + lVar26 * 8) = *piVar2;
          *(undefined4 *)(lVar32 + 0x2878 + lVar26 * 8) = 0;
          sVar20 = 1;
        }
        *(short *)(lVar32 + 0x2878 + lVar26 * 8) = sVar20;
        *(int *)(lVar32 + 0x2868) = *(int *)(lVar32 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar7 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar27,*(longlong *)(lVar7 + 0x1ef8),
                         (longlong)*(int *)(lVar7 + 0x1ef0) * 0x14);
        lVar26 = _DAT_7ff70cc1a3c0;
        lVar32 = *(longlong *)(lVar7 + 0x1ef8);
        if ((lVar32 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
            sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar31 * 8) + 1;
          }
          else {
            iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
            lVar31 = (longlong)iVar29;
            *(int *)(lVar26 + 0x2874 + lVar31 * 8) = *piVar2;
            *(undefined4 *)(lVar26 + 0x2878 + lVar31 * 8) = 0;
            sVar20 = 1;
          }
          *(short *)(lVar26 + 0x287a + lVar31 * 8) = sVar20;
          *(int *)(lVar26 + 0x286c) = *(int *)(lVar26 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar32,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar7 + 0x1ef8) = lVar27;
      *(int *)(lVar7 + 0x1ef4) = iVar28;
      iVar29 = *(int *)(lVar7 + 0x1ef0);
    }
    else {
      lVar27 = *(longlong *)(lVar7 + 0x1ef8);
    }
    *(undefined4 *)(lVar27 + (longlong)iVar29 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar27 + 4 + (longlong)iVar29 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar7 + 0x1ef0) = *(int *)(lVar7 + 0x1ef0) + 1;
    if (*(int *)(lVar7 + 0x1eec) != 4) {
      fVar33 = (_UNK_7ff70cb1d634 - fVar10) * _UNK_7ff70cb1d644;
      fVar34 = (_UNK_7ff70cb1d638 - fVar11) * _UNK_7ff70cb1d648;
      fVar35 = (_UNK_7ff70cb1d63c - fVar12) * _UNK_7ff70cb1d64c;
      *(float *)(lVar7 + 0xd94) = (_DAT_7ff70cb1d630 - fVar9) * _DAT_7ff70cb1d640 + fVar9;
      *(float *)(lVar7 + 0xd98) = fVar33 + fVar10;
      *(float *)(lVar7 + 0xd9c) = fVar34 + fVar11;
      *(float *)(lVar7 + 0xda0) = fVar35 + fVar12;
    }
    lVar27 = _DAT_7ff70cc1a3c0;
    if (cVar15 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar27 + 0x1e80) = *(undefined8 *)(lVar7 + 0x2780);
      *(undefined8 *)(lVar27 + 0x1e88) = 0;
      *(undefined4 *)(lVar27 + 0x1e74) = 1;
    }
  }
  cVar15 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar15 != '\0') {
    if (*(short *)(*(longlong *)(lVar7 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar31 = _DAT_7ff70cc1a3c0;
      lVar27 = *(longlong *)(lVar7 + 0x1440);
      lVar32 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar29 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar26 = *(longlong *)(lVar32 + -8 + (longlong)iVar29 * 8);
      if (((lVar26 != lVar27) && (1 < iVar29)) && (*(longlong *)(lVar26 + 0x3c0) != lVar27)) {
        uVar19 = (ulonglong)(iVar29 - 1);
        iVar29 = 1;
        do {
          uVar16 = (int)uVar19 - 1;
          uVar19 = (ulonglong)uVar16;
          if (*(longlong *)(lVar32 + uVar19 * 8) == lVar27) {
            FUN_7ff70cb12b70(lVar32 + uVar19 * 8,lVar32 + uVar19 * 8 + 8,(longlong)iVar29 << 3);
            *(longlong *)
             (*(longlong *)(lVar31 + 0x13e8) + -8 + (longlong)*(int *)(lVar31 + 0x13e0) * 8) =
                 lVar27;
            lVar27 = *(longlong *)(lVar7 + 0x1440);
            break;
          }
          iVar29 = iVar29 + 1;
        } while (0 < (int)uVar16);
      }
      lVar26 = _DAT_7ff70cc1a3c0;
      lVar32 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar32 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar27)
      {
        iVar21 = (int)*(short *)(lVar27 + 0xe2);
        lVar17 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar29 = (int)lVar17;
        lVar31 = lVar17;
        if (iVar29 - iVar21 != 0 && iVar21 <= iVar29) {
          lVar30 = (longlong)iVar21;
          lVar31 = (longlong)iVar29;
          lVar32 = lVar30;
          if ((iVar29 - iVar21 & 1U) != 0) {
            lVar32 = lVar30 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar30 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar30 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + lVar30 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar31 + -1 != lVar30) {
            do {
              *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + lVar32 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar32 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + lVar32 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar32 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar26 + 0x13f8) + 0x10 + lVar32 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar26 + 0x13f8) + 8 + lVar32 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar32 = lVar32 + 2;
            } while (lVar31 != lVar32);
          }
          lVar32 = *(longlong *)(lVar26 + 0x13f8);
        }
        *(longlong *)(lVar32 + lVar31 * 8) = lVar27;
        *(short *)(lVar27 + 0xe2) = (short)lVar17;
      }
      *(undefined8 *)(lVar7 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar29 = *(int *)(lVar14 + 0x278c);
    }
    else {
      iVar29 = *(int *)(lVar14 + 0x278c);
    }
    if (iVar29 < 0x14) {
      if (lVar18 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb90469);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar18 + 8),&UNK_7ff70cb90469);
        lVar7 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar18 + 0xd5) != '\x01') || (*(char *)(lVar18 + 0xcd) == '\x01')) {
          lVar27 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar32 = *(longlong *)(lVar27 + 0x50);
          if (lVar32 == 0) {
            lVar32 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar26 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar31 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar31 * 8) == *piVar2) {
                sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar31 * 8) + 1;
              }
              else {
                iVar29 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar29;
                lVar31 = (longlong)iVar29;
                *(int *)(lVar26 + 0x2874 + lVar31 * 8) = *piVar2;
                *(undefined4 *)(lVar26 + 0x2878 + lVar31 * 8) = 0;
                sVar20 = 1;
              }
              *(short *)(lVar26 + 0x2878 + lVar31 * 8) = sVar20;
              *(int *)(lVar26 + 0x2868) = *(int *)(lVar26 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar32,lVar7 + 0x1148);
            *(undefined **)(lVar32 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar27 + 0x50) = lVar32;
          }
          if (*(int *)(lVar27 + 0x44) != *(int *)(lVar7 + 5000)) {
            FUN_7ff70c7b6160(lVar32);
            lVar26 = *(longlong *)(lVar7 + 0x40);
            uStack_68 = *(undefined8 *)(lVar26 + 0x28);
            uStack_60 = *(undefined4 *)(lVar26 + 0x30);
            uStack_5c = *(undefined4 *)(lVar26 + 0x34);
            FUN_7ff70c7b8300(lVar32,&uStack_68);
            auStack_50[0] =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar27 + 0x10) >> 0x20) +
                          (float)((ulonglong)*(undefined8 *)(lVar27 + 8) >> 0x20),
                          (float)*(undefined8 *)(lVar27 + 0x10) + (float)*(undefined8 *)(lVar27 + 8)
                         );
            FUN_7ff70c7b7c50(lVar32,lVar27 + 8,auStack_50,0);
            *(undefined4 *)(lVar27 + 0x44) = *(undefined4 *)(lVar7 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar18 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar18 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar18 + 0x30) +
                               (float)*(undefined8 *)(lVar18 + 0x28));
          auStack_78[0] = 0x3f800000;
          FUN_7ff70c7bd870(lVar32,lVar18 + 0x28,&uStack_68,0xff0000ff,0,(ulonglong)uVar36 << 0x20);
          iVar29 = *(int *)(lVar14 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar29 = *(int *)(lVar14 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar29 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar14 + 0x278c) = *(int *)(lVar14 + 0x278c) + 1;
  pcVar8 = *(code **)(lVar14 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar8 != (code *)0x0) {
    (*pcVar8)(lVar14,*(undefined8 *)(lVar14 + 0x2778),&UNK_7ff70cb90469);
  }
  return (ulonglong)*(byte *)(lVar14 + 0x7d);
}


