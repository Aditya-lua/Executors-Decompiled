/* 7ff70c849860 FUN_7ff70c849860 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * FUN_7ff70c849860(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  float *pfVar5;
  byte bVar6;
  undefined1 uVar7;
  code *pcVar8;
  float fVar9;
  float fVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined4 uVar21;
  undefined4 uVar22;
  undefined4 uVar23;
  undefined4 uVar24;
  ulonglong uVar25;
  char cVar26;
  uint uVar27;
  uint uVar28;
  longlong lVar29;
  undefined8 uVar30;
  longlong lVar31;
  short sVar32;
  int iVar33;
  int iVar34;
  undefined4 uVar35;
  uint *puVar36;
  bool bVar37;
  char *pcVar38;
  uint *puVar39;
  longlong lVar40;
  undefined *puVar41;
  longlong lVar42;
  undefined **ppuVar43;
  longlong lVar44;
  int iVar45;
  ulonglong uVar46;
  longlong lVar47;
  longlong lVar48;
  float fVar49;
  float fVar50;
  float fVar51;
  float fVar52;
  float fVar53;
  undefined *puStack_b0;
  undefined1 auStack_a8 [32];
  undefined4 uStack_88;
  undefined4 uStack_80;
  undefined4 uStack_78;
  float fStack_68;
  float fStack_64;
  float fStack_60;
  float fStack_5c;
  ulonglong uStack_50;
  
  lVar44 = _DAT_7ff70cc1a3c0;
  ppuVar43 = (undefined **)auStack_a8;
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  pcVar38 = "Tooltip_Error";
  uVar27 = 0xffffffff;
  do {
    cVar26 = pcVar38[-2];
    if (cVar26 == '#') {
      if ((pcVar38[-1] == '#') && (*pcVar38 == '#')) {
        uVar27 = 0xffffffff;
      }
    }
    else if (cVar26 == '\0') break;
    uVar27 = crc32(uVar27,cVar26);
    pcVar38 = pcVar38 + 1;
  } while( true );
  puVar36 = *(uint **)(_DAT_7ff70cc1a3c0 + 0x1428);
  puVar39 = puVar36 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420) * 4;
  uVar46 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1420);
  while (uVar25 = uVar46, uVar25 != 0) {
    uVar46 = uVar25 >> 1;
    if (puVar36[uVar46 * 4] < ~uVar27) {
      puVar36 = puVar36 + uVar46 * 4 + 4;
      uVar46 = ~uVar46 + uVar25;
    }
  }
  if ((((puVar36 == puVar39) || (*puVar36 != ~uVar27)) || (*(longlong *)(puVar36 + 2) == 0)) ||
     (*(char *)(_DAT_7ff70cc1a3c0 + 0xfc) == '\0')) {
    fVar49 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd94);
    fVar50 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd98);
    fVar9 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd9c);
    fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0xda0);
    fStack_68 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd94);
    fStack_64 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd98);
    fStack_60 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd9c);
    fStack_5c = *(float *)(_DAT_7ff70cc1a3c0 + 0xda0);
    iVar34 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
    if (iVar34 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef4)) {
      if (iVar34 == 0) {
        iVar33 = 8;
      }
      else {
        iVar33 = iVar34 / 2 + iVar34;
      }
      iVar45 = iVar34 + 1;
      if (iVar34 + 1 < iVar33) {
        iVar45 = iVar33;
      }
      puStack_b0 = (undefined *)0x7ff70c8499e5;
      lVar31 = (*_DAT_7ff70cbe9460)((longlong)iVar45 * 0x14,_DAT_7ff70cc1a3d0);
      lVar40 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar42 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar42 * 8) == *piVar2) {
          sVar32 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar42 * 8) + 1;
        }
        else {
          iVar34 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar34;
          lVar42 = (longlong)iVar34;
          *(int *)(lVar40 + 0x2874 + lVar42 * 8) = *piVar2;
          *(undefined4 *)(lVar40 + 0x2878 + lVar42 * 8) = 0;
          sVar32 = 1;
        }
        *(short *)(lVar40 + 0x2878 + lVar42 * 8) = sVar32;
        *(int *)(lVar40 + 0x2868) = *(int *)(lVar40 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar44 + 0x1ef8) != 0) {
        puStack_b0 = (undefined *)0x7ff70c849a8f;
        FUN_7ff70cb12b60(lVar31,*(longlong *)(lVar44 + 0x1ef8),
                         (longlong)*(int *)(lVar44 + 0x1ef0) * 0x14);
        lVar42 = _DAT_7ff70cc1a3c0;
        lVar40 = *(longlong *)(lVar44 + 0x1ef8);
        if ((lVar40 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar48 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar48 * 8) == *piVar2) {
            sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar48 * 8) + 1;
          }
          else {
            iVar34 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar34;
            lVar48 = (longlong)iVar34;
            *(int *)(lVar42 + 0x2874 + lVar48 * 8) = *piVar2;
            *(undefined4 *)(lVar42 + 0x2878 + lVar48 * 8) = 0;
            sVar32 = 1;
          }
          *(short *)(lVar42 + 0x287a + lVar48 * 8) = sVar32;
          *(int *)(lVar42 + 0x286c) = *(int *)(lVar42 + 0x286c) + 1;
        }
        puStack_b0 = (undefined *)0x7ff70c849b44;
        (*_DAT_7ff70cbe9468)(lVar40,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar44 + 0x1ef8) = lVar31;
      *(int *)(lVar44 + 0x1ef4) = iVar45;
      iVar34 = *(int *)(lVar44 + 0x1ef0);
    }
    else {
      lVar31 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1ef8);
    }
    *(undefined4 *)(lVar31 + (longlong)iVar34 * 0x14) = 4;
    pfVar5 = (float *)(lVar31 + 4 + (longlong)iVar34 * 0x14);
    *pfVar5 = fStack_68;
    pfVar5[1] = fStack_64;
    pfVar5[2] = fStack_60;
    pfVar5[3] = fStack_5c;
    *(int *)(lVar44 + 0x1ef0) = *(int *)(lVar44 + 0x1ef0) + 1;
    if (*(int *)(lVar44 + 0x1eec) != 4) {
      fVar51 = (_UNK_7ff70cb1d634 - fVar50) * _UNK_7ff70cb1d644;
      fVar52 = (_UNK_7ff70cb1d638 - fVar9) * _UNK_7ff70cb1d648;
      fVar53 = (_UNK_7ff70cb1d63c - fVar10) * _UNK_7ff70cb1d64c;
      *(float *)(lVar44 + 0xd94) = (_DAT_7ff70cb1d630 - fVar49) * _DAT_7ff70cb1d640 + fVar49;
      *(float *)(lVar44 + 0xd98) = fVar51 + fVar50;
      *(float *)(lVar44 + 0xd9c) = fVar52 + fVar9;
      *(float *)(lVar44 + 0xda0) = fVar53 + fVar10;
    }
  }
  else {
    cVar26 = *(char *)(*(longlong *)(puVar36 + 2) + 0xcd);
    fVar49 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd94);
    fVar50 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd98);
    fVar9 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd9c);
    fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0xda0);
    fStack_68 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd94);
    fStack_64 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd98);
    fStack_60 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd9c);
    fStack_5c = *(float *)(_DAT_7ff70cc1a3c0 + 0xda0);
    iVar34 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
    if (iVar34 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef4)) {
      if (iVar34 == 0) {
        iVar33 = 8;
      }
      else {
        iVar33 = iVar34 / 2 + iVar34;
      }
      iVar45 = iVar34 + 1;
      if (iVar34 + 1 < iVar33) {
        iVar45 = iVar33;
      }
      puStack_b0 = (undefined *)0x7ff70c84a1ab;
      lVar31 = (*_DAT_7ff70cbe9460)((longlong)iVar45 * 0x14,_DAT_7ff70cc1a3d0);
      lVar40 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar42 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar42 * 8) == *piVar2) {
          sVar32 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar42 * 8) + 1;
        }
        else {
          iVar34 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar34;
          lVar42 = (longlong)iVar34;
          *(int *)(lVar40 + 0x2874 + lVar42 * 8) = *piVar2;
          *(undefined4 *)(lVar40 + 0x2878 + lVar42 * 8) = 0;
          sVar32 = 1;
        }
        *(short *)(lVar40 + 0x2878 + lVar42 * 8) = sVar32;
        *(int *)(lVar40 + 0x2868) = *(int *)(lVar40 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar44 + 0x1ef8) != 0) {
        puStack_b0 = (undefined *)0x7ff70c84a255;
        FUN_7ff70cb12b60(lVar31,*(longlong *)(lVar44 + 0x1ef8),
                         (longlong)*(int *)(lVar44 + 0x1ef0) * 0x14);
        lVar42 = _DAT_7ff70cc1a3c0;
        lVar40 = *(longlong *)(lVar44 + 0x1ef8);
        if ((lVar40 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar48 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar48 * 8) == *piVar2) {
            sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar48 * 8) + 1;
          }
          else {
            iVar34 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar34;
            lVar48 = (longlong)iVar34;
            *(int *)(lVar42 + 0x2874 + lVar48 * 8) = *piVar2;
            *(undefined4 *)(lVar42 + 0x2878 + lVar48 * 8) = 0;
            sVar32 = 1;
          }
          *(short *)(lVar42 + 0x287a + lVar48 * 8) = sVar32;
          *(int *)(lVar42 + 0x286c) = *(int *)(lVar42 + 0x286c) + 1;
        }
        puStack_b0 = (undefined *)0x7ff70c84a2fa;
        (*_DAT_7ff70cbe9468)(lVar40,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar44 + 0x1ef8) = lVar31;
      *(int *)(lVar44 + 0x1ef4) = iVar45;
      iVar34 = *(int *)(lVar44 + 0x1ef0);
    }
    else {
      lVar31 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1ef8);
    }
    *(undefined4 *)(lVar31 + (longlong)iVar34 * 0x14) = 4;
    pfVar5 = (float *)(lVar31 + 4 + (longlong)iVar34 * 0x14);
    *pfVar5 = fStack_68;
    pfVar5[1] = fStack_64;
    pfVar5[2] = fStack_60;
    pfVar5[3] = fStack_5c;
    *(int *)(lVar44 + 0x1ef0) = *(int *)(lVar44 + 0x1ef0) + 1;
    if (*(int *)(lVar44 + 0x1eec) != 4) {
      fVar51 = (_UNK_7ff70cb1d634 - fVar50) * _UNK_7ff70cb1d644;
      fVar52 = (_UNK_7ff70cb1d638 - fVar9) * _UNK_7ff70cb1d648;
      fVar53 = (_UNK_7ff70cb1d63c - fVar10) * _UNK_7ff70cb1d64c;
      *(float *)(lVar44 + 0xd94) = (_DAT_7ff70cb1d630 - fVar49) * _DAT_7ff70cb1d640 + fVar49;
      *(float *)(lVar44 + 0xd98) = fVar51 + fVar50;
      *(float *)(lVar44 + 0xd9c) = fVar52 + fVar9;
      *(float *)(lVar44 + 0xda0) = fVar53 + fVar10;
    }
    lVar31 = _DAT_7ff70cc1a3c0;
    if (cVar26 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar31 + 0x1e80) = *(undefined8 *)(lVar44 + 0x2780);
      *(undefined8 *)(lVar31 + 0x1e88) = 0;
      *(undefined4 *)(lVar31 + 0x1e74) = 1;
    }
  }
  puStack_b0 = (undefined *)0x7ff70c849bb3;
  uVar27 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  lVar31 = _DAT_7ff70cc1a3c0;
  iVar34 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
  iVar33 = 1;
  if (iVar34 < 1) {
    lVar40 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
      if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
        if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
          *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
          goto LAB_7ff70c849e10;
        }
        puStack_b0 = (undefined *)0x7ff70c849f5e;
        FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                         *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
        bVar6 = *(byte *)(lVar31 + 0x27b4);
      }
      else {
LAB_7ff70c849e10:
        bVar6 = *(byte *)(lVar31 + 0x27b4);
      }
      if ((bVar6 & 1) != 0) {
        if (lVar40 == 0) {
          puVar41 = &UNK_7ff70cb8a129;
        }
        else {
          puVar41 = *(undefined **)(lVar40 + 8);
        }
        puStack_b0 = (undefined *)0x7ff70c84a0cb;
        FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar41,&UNK_7ff70cb9006f);
        *(undefined1 *)(lVar31 + 0x2788) = 0;
        cVar26 = *(char *)(lVar31 + 0x7f);
        goto joined_r0x7ff70c84a0d6;
      }
      *(int *)(lVar31 + 0x27e0) = *(int *)(lVar31 + 0x27e0) + 1;
      *(undefined1 *)(lVar31 + 0x2788) = 0;
      if (*(char *)(lVar31 + 0x7f) == '\x01') goto LAB_7ff70c84a0dc;
LAB_7ff70c849bed:
      pcVar8 = *(code **)(lVar31 + 0x2770);
    }
    else {
      *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
      cVar26 = *(char *)(lVar31 + 0x7f);
joined_r0x7ff70c84a0d6:
      if (cVar26 != '\x01') goto LAB_7ff70c849bed;
LAB_7ff70c84a0dc:
      if (*(char *)(lVar31 + 0x1398) == '\x01') {
        puStack_b0 = (undefined *)0x7ff70c84a0ee;
        cVar26 = FUN_7ff70c849860();
        if (cVar26 != '\0') {
          iVar34 = *(int *)(lVar31 + 0x278c);
          if (iVar34 < 0x14) {
            if (lVar40 == 0) {
              puStack_b0 = (undefined *)0x7ff70c84a87b;
              FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9006f);
            }
            else {
              puStack_b0 = (undefined *)0x7ff70c84a125;
              FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar40 + 8),&UNK_7ff70cb9006f);
              if ((*(char *)(lVar40 + 0xd5) != '\x01') || (*(char *)(lVar40 + 0xcd) == '\x01')) {
                puStack_b0 = (undefined *)0x7ff70c84a143;
                uVar30 = FUN_7ff70c8738c0(lVar40);
                fStack_68 = (float)*(undefined8 *)(lVar40 + 0x30) +
                            (float)*(undefined8 *)(lVar40 + 0x28);
                fStack_64 = (float)((ulonglong)*(undefined8 *)(lVar40 + 0x30) >> 0x20) +
                            (float)((ulonglong)*(undefined8 *)(lVar40 + 0x28) >> 0x20);
                uStack_78 = 0x3f800000;
                uStack_80 = 0;
                uStack_88 = 0;
                puStack_b0 = (undefined *)0x7ff70c84a184;
                FUN_7ff70c7bd870(uVar30,lVar40 + 0x28,&fStack_68,0xff0000ff);
              }
            }
            iVar34 = *(int *)(lVar31 + 0x278c);
          }
          if (iVar34 == 0x14) {
            puStack_b0 = (undefined *)0x7ff70c84a892;
            FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
          }
          puStack_b0 = (undefined *)0x7ff70c84a897;
          FUN_7ff70c84a8c0();
        }
      }
      *(int *)(lVar31 + 0x278c) = *(int *)(lVar31 + 0x278c) + 1;
      pcVar8 = *(code **)(lVar31 + 0x2770);
    }
    if (pcVar8 != (code *)0x0) {
      puStack_b0 = (undefined *)0x7ff70c849c0c;
      (*pcVar8)(lVar31,*(undefined8 *)(lVar31 + 0x2778),&UNK_7ff70cb9006f);
    }
    iVar34 = *(int *)(lVar31 + 0x1ef0);
    iVar33 = iVar34;
    if (0 < iVar34) goto LAB_7ff70c849c18;
  }
  else {
LAB_7ff70c849c18:
    uVar28 = iVar33 + 1;
    do {
      puVar4 = (undefined4 *)(*(longlong *)(lVar31 + 0x1ef8) + -0x10 + (longlong)iVar34 * 0x14);
      uVar35 = puVar4[1];
      uVar11 = puVar4[2];
      uVar12 = puVar4[3];
      puVar3 = (undefined4 *)
               (lVar31 + 0xd54 +
               (longlong)*(int *)(*(longlong *)(lVar31 + 0x1ef8) + -0x14 + (longlong)iVar34 * 0x14)
               * 0x10);
      *puVar3 = *puVar4;
      puVar3[1] = uVar35;
      puVar3[2] = uVar11;
      puVar3[3] = uVar12;
      iVar34 = *(int *)(lVar31 + 0x1ef0) + -1;
      *(int *)(lVar31 + 0x1ef0) = iVar34;
      uVar28 = uVar28 - 1;
    } while (1 < uVar28);
  }
  lVar31 = _DAT_7ff70cc1a3c0;
  if ((char)uVar27 != '\0') {
    ppuVar43 = (undefined **)auStack_a8;
    if (*(short *)(*(longlong *)(lVar44 + 0x1440) + 0xda) == 1) {
      puStack_b0 = (undefined *)0x7ff70c849c90;
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar48 = _DAT_7ff70cc1a3c0;
      lVar31 = *(longlong *)(lVar44 + 0x1440);
      lVar40 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar34 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar42 = *(longlong *)(lVar40 + -8 + (longlong)iVar34 * 8);
      if (((lVar42 != lVar31) && (1 < iVar34)) && (*(longlong *)(lVar42 + 0x3c0) != lVar31)) {
        uVar46 = (ulonglong)(iVar34 - 1);
        iVar34 = 1;
        do {
          uVar28 = (int)uVar46 - 1;
          uVar46 = (ulonglong)uVar28;
          if (*(longlong *)(lVar40 + uVar46 * 8) == lVar31) {
            puStack_b0 = (undefined *)0x7ff70c849f95;
            FUN_7ff70cb12b70(lVar40 + uVar46 * 8,lVar40 + uVar46 * 8 + 8,(longlong)iVar34 << 3);
            *(longlong *)
             (*(longlong *)(lVar48 + 0x13e8) + -8 + (longlong)*(int *)(lVar48 + 0x13e0) * 8) =
                 lVar31;
            lVar31 = *(longlong *)(lVar44 + 0x1440);
            break;
          }
          iVar34 = iVar34 + 1;
        } while (0 < (int)uVar28);
      }
      lVar42 = _DAT_7ff70cc1a3c0;
      lVar40 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar40 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar31)
      {
        iVar33 = (int)*(short *)(lVar31 + 0xe2);
        lVar29 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar34 = (int)lVar29;
        lVar48 = lVar29;
        if (iVar34 - iVar33 != 0 && iVar33 <= iVar34) {
          lVar47 = (longlong)iVar33;
          lVar48 = (longlong)iVar34;
          lVar40 = lVar47;
          if ((iVar34 - iVar33 & 1U) != 0) {
            lVar40 = lVar47 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar47 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar47 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar42 + 0x13f8) + lVar47 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar48 + -1 != lVar47) {
            do {
              *(undefined8 *)(*(longlong *)(lVar42 + 0x13f8) + lVar40 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar42 + 0x13f8) + 8 + lVar40 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar42 + 0x13f8) + lVar40 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar42 + 0x13f8) + 8 + lVar40 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar42 + 0x13f8) + 0x10 + lVar40 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar42 + 0x13f8) + 8 + lVar40 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar40 = lVar40 + 2;
            } while (lVar48 != lVar40);
          }
          lVar40 = *(longlong *)(lVar42 + 0x13f8);
        }
        *(longlong *)(lVar40 + lVar48 * 8) = lVar31;
        *(short *)(lVar31 + 0xe2) = (short)lVar29;
      }
      *(undefined8 *)(lVar44 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      ppuVar43 = (undefined **)auStack_a8;
    }
    goto LAB_7ff70c84a839;
  }
  lVar44 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) < 2) &&
     (*(char *)(_DAT_7ff70cc1a3c0 + 0x1399) == '\x01')) {
    puStack_b0 = (undefined *)0x7ff70c849d28;
    FUN_7ff70c80af70(&UNK_7ff70cb9015c);
    goto LAB_7ff70c84a839;
  }
  lVar40 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) * 0x78 +
           *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418);
  if (((*(byte *)(lVar44 + 0x17) & 1) != 0) &&
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x1394) != *(int *)(lVar44 + 0x10))) {
    puStack_b0 = (undefined *)0x7ff70c849d57;
    FUN_7ff70c80af70(&UNK_7ff70cb9067f);
  }
  if (*(longlong *)(lVar44 + 0x1c8) != 0) {
    puStack_b0 = (undefined *)0x7ff70c849d66;
    FUN_7ff70c912b60();
  }
  lVar42 = _DAT_7ff70cc1a3c0;
  if (*(char *)(lVar44 + 0xd2) == '\0') {
    *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
    lVar42 = *(longlong *)(lVar42 + 0x1440);
    puStack_b0 = (undefined *)0x7ff70c849d98;
    FUN_7ff70c7b8130(*(undefined8 *)(lVar42 + 0x2c8));
    puVar3 = (undefined4 *)
             (*(longlong *)(*(longlong *)(lVar42 + 0x2c8) + 0xa8) + -0x10 +
             (longlong)*(int *)(*(longlong *)(lVar42 + 0x2c8) + 0xa0) * 0x10);
    uVar35 = puVar3[1];
    uVar11 = puVar3[2];
    uVar12 = puVar3[3];
    *(undefined4 *)(lVar42 + 0x260) = *puVar3;
    *(undefined4 *)(lVar42 + 0x264) = uVar35;
    *(undefined4 *)(lVar42 + 0x268) = uVar11;
    *(undefined4 *)(lVar42 + 0x26c) = uVar12;
  }
  lVar42 = _DAT_7ff70cc1a3c0;
  iVar34 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20);
  if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x27a8) + 0xc) < iVar34) {
    *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20) = iVar34 + -1;
    if (iVar34 + -1 == 0) {
      uVar35 = 0;
    }
    else {
      uVar35 = *(undefined4 *)(*(longlong *)(lVar42 + 0x1f28) + -0x10 + (longlong)iVar34 * 8);
    }
    *(undefined4 *)(lVar42 + 0x1ddc) = uVar35;
    cVar26 = *(char *)(lVar40 + -10);
    lVar42 = _DAT_7ff70cc1a3c0;
  }
  else {
    puStack_b0 = (undefined *)0x7ff70c849e45;
    FUN_7ff70c80af70(&UNK_7ff70cb90134);
    cVar26 = *(char *)(lVar40 + -10);
    lVar42 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar42;
  if ((cVar26 == '\x01') && (*(longlong *)(lVar44 + 0x3c0) == lVar44)) {
    *(short *)(lVar42 + 0x25a0) = *(short *)(lVar42 + 0x25a0) + -1;
    iVar34 = *(int *)(lVar42 + 0x1f30);
    *(int *)(lVar42 + 0x1f30) = iVar34 + -1;
    *(undefined4 *)(lVar42 + 0x1de0) =
         *(undefined4 *)(*(longlong *)(lVar42 + 0x1f38) + -8 + (longlong)iVar34 * 4);
    *(undefined4 *)(lVar42 + 0xc4c) =
         *(undefined4 *)
          (*(longlong *)(lVar42 + 0x1418) + -8 + (longlong)*(int *)(lVar42 + 0x1410) * 0x78);
  }
  if (*(char *)(lVar44 + 0xd2) == '\x01') {
    *(longlong *)(lVar44 + 0x2c8) = lVar44 + 0x2d0;
  }
  lVar42 = _DAT_7ff70cc1a3c0;
  ppuVar43 = (undefined **)auStack_a8;
  if ((*(longlong *)(lVar31 + 0x2728) == lVar44) &&
     (ppuVar43 = (undefined **)auStack_a8, *(char *)(_DAT_7ff70cc1a3c0 + 0x2720) == '\x01')) {
    puStack_b0 = (undefined *)0x7ff70c849efa;
    FUN_7ff70c856f00(&UNK_7ff70cb922d3);
    uVar28 = *(uint *)(lVar42 + 0x2724) & 0xf;
    ppuVar43 = (undefined **)auStack_a8;
    if (POPCOUNT(uVar28) == 1) {
      iVar34 = 0;
      for (; (uVar28 & 1) == 0; uVar28 = uVar28 >> 1 | 0x80000000) {
        iVar34 = iVar34 + 1;
      }
      if (iVar34 == 3) {
        ppuVar43 = (undefined **)auStack_a8;
        if ((1 < *(int *)(lVar42 + 0x2738)) &&
           (ppuVar43 = (undefined **)auStack_a8,
           *(code **)(_DAT_7ff70cc1a3c0 + 0xbe8) != (code *)0x0)) {
          lVar48 = 0x7ff70cc1a3c8;
          if (*(longlong *)(lVar42 + 0x2740) != 0) {
            lVar48 = *(longlong *)(lVar42 + 0x2740);
          }
          puStack_b0 = (undefined *)0x7ff70c84a3d6;
          (**(code **)(_DAT_7ff70cc1a3c0 + 0xbe8))(_DAT_7ff70cc1a3c0,lVar48);
          ppuVar43 = (undefined **)auStack_a8;
        }
      }
      else if (iVar34 == 1) {
        puStack_b0 = (undefined *)(ulonglong)uVar27;
        func_0x7ff70d7a3796(*(undefined8 *)(lVar42 + 0x2730));
        ppuVar43 = &puStack_b0;
      }
      else {
        ppuVar43 = (undefined **)auStack_a8;
        if (iVar34 == 0) {
          puStack_b0 = &UNK_7ff70c849f3d;
          func_0x7ff70d8001d5(*(undefined8 *)(lVar42 + 0x2730));
                    /* WARNING: Bad instruction - Truncating control flow here */
          halt_baddata();
        }
      }
    }
    *(undefined1 *)(lVar42 + 0x14b2) = 0;
    *(undefined1 *)(lVar42 + 0x2720) = 0;
    *(undefined4 *)(lVar42 + 0x2724) = 0;
    *(undefined8 *)(lVar42 + 0x2730) = 0;
    lVar48 = *(longlong *)(lVar42 + 0x2740);
    if (lVar48 != 0) {
      *(undefined8 *)(lVar42 + 0x2738) = 0;
      lVar29 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
          sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
        }
        else {
          iVar34 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar34;
          lVar47 = (longlong)iVar34;
          *(int *)(lVar29 + 0x2874 + lVar47 * 8) = *piVar2;
          *(undefined4 *)(lVar29 + 0x2878 + lVar47 * 8) = 0;
          sVar32 = 1;
        }
        *(short *)(lVar29 + 0x287a + lVar47 * 8) = sVar32;
        *(int *)(lVar29 + 0x286c) = *(int *)(lVar29 + 0x286c) + 1;
      }
      *(undefined8 *)((longlong)ppuVar43 + -8) = 0x7ff70c84a4ac;
      (*_DAT_7ff70cbe9468)(lVar48,_DAT_7ff70cc1a3d0);
      *(undefined8 *)(lVar42 + 0x2740) = 0;
    }
  }
  if (*(char *)(lVar44 + 0x159) == '\x01') {
    lVar42 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    *(undefined1 *)(lVar42 + 0x159) = 0;
    if (((*(float *)(lVar42 + 0x130) < *(float *)(lVar42 + 0x118)) ||
        (*(float *)(lVar42 + 0x134) < *(float *)(lVar42 + 0x11c))) &&
       (*(char *)(lVar42 + 0xd1) == '\0')) {
      *(undefined8 *)((longlong)ppuVar43 + -8) = 0x7ff70c84a50d;
      FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
    }
  }
  uVar30 = *(undefined8 *)(lVar40 + -0x28);
  *(undefined8 *)(lVar31 + 0x1e60) = *(undefined8 *)(lVar40 + -0x30);
  *(undefined8 *)(lVar31 + 0x1e68) = uVar30;
  uVar35 = *(undefined4 *)(lVar40 + -0x70);
  uVar11 = *(undefined4 *)(lVar40 + -0x6c);
  uVar12 = *(undefined4 *)(lVar40 + -0x68);
  uVar13 = *(undefined4 *)(lVar40 + -100);
  uVar14 = *(undefined4 *)(lVar40 + -0x60);
  uVar15 = *(undefined4 *)(lVar40 + -0x5c);
  uVar16 = *(undefined4 *)(lVar40 + -0x58);
  uVar17 = *(undefined4 *)(lVar40 + -0x54);
  uVar18 = *(undefined4 *)(lVar40 + -0x50);
  uVar19 = *(undefined4 *)(lVar40 + -0x4c);
  uVar20 = *(undefined4 *)(lVar40 + -0x48);
  uVar21 = *(undefined4 *)(lVar40 + -0x44);
  uVar22 = *(undefined4 *)(lVar40 + -0x3c);
  uVar23 = *(undefined4 *)(lVar40 + -0x38);
  uVar24 = *(undefined4 *)(lVar40 + -0x34);
  *(undefined4 *)(lVar31 + 0x1e50) = *(undefined4 *)(lVar40 + -0x40);
  *(undefined4 *)(lVar31 + 0x1e54) = uVar22;
  *(undefined4 *)(lVar31 + 0x1e58) = uVar23;
  *(undefined4 *)(lVar31 + 0x1e5c) = uVar24;
  *(undefined4 *)(lVar31 + 0x1e40) = uVar18;
  *(undefined4 *)(lVar31 + 0x1e44) = uVar19;
  *(undefined4 *)(lVar31 + 0x1e48) = uVar20;
  *(undefined4 *)(lVar31 + 0x1e4c) = uVar21;
  *(undefined4 *)(lVar31 + 0x1e30) = uVar14;
  *(undefined4 *)(lVar31 + 0x1e34) = uVar15;
  *(undefined4 *)(lVar31 + 0x1e38) = uVar16;
  *(undefined4 *)(lVar31 + 0x1e3c) = uVar17;
  *(undefined4 *)(lVar31 + 0x1e20) = uVar35;
  *(undefined4 *)(lVar31 + 0x1e24) = uVar11;
  *(undefined4 *)(lVar31 + 0x1e28) = uVar12;
  *(undefined4 *)(lVar31 + 0x1e2c) = uVar13;
  if ((*(uint *)(lVar44 + 0x14) & 0x10000000) == 0) {
    if ((*(uint *)(lVar44 + 0x14) & 0x4000000) != 0) goto LAB_7ff70c84a5fd;
LAB_7ff70c84a55e:
    cVar26 = *(char *)(lVar31 + 0x7c);
  }
  else {
    *(int *)(lVar31 + 0x2510) = *(int *)(lVar31 + 0x2510) + -1;
    if ((*(uint *)(lVar44 + 0x14) & 0x4000000) == 0) goto LAB_7ff70c84a55e;
LAB_7ff70c84a5fd:
    *(int *)(lVar31 + 0x1f60) = *(int *)(lVar31 + 0x1f60) + -1;
    cVar26 = *(char *)(lVar31 + 0x7c);
  }
  if (cVar26 == '\x01') {
    *(undefined8 *)((longlong)ppuVar43 + -8) = 0x7ff70c84a570;
    FUN_7ff70c83b170(lVar40 + -0x20);
  }
  lVar40 = (longlong)*(int *)(lVar31 + 0x1410) + -1;
  iVar34 = (int)lVar40;
  *(int *)(lVar31 + 0x1410) = iVar34;
  lVar44 = _DAT_7ff70cc1a3c0;
  if (iVar34 == 0) {
    *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1440) = 0;
  }
  else {
    lVar31 = *(longlong *)(*(longlong *)(lVar31 + 0x1418) + -0x78 + lVar40 * 0x78);
    *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) = lVar31;
    if (lVar31 != 0) {
      *(longlong *)(lVar44 + 0x27a8) =
           *(longlong *)(lVar44 + 0x1418) + (longlong)*(int *)(lVar44 + 0x1410) * 0x78 + -0x20;
      if ((longlong)*(int *)(lVar31 + 0x1d0) == -1) {
        lVar40 = 0;
      }
      else {
        lVar40 = (longlong)*(int *)(lVar31 + 0x1d0) * 0x250 + *(longlong *)(lVar44 + 0x22a0);
      }
      *(longlong *)(lVar44 + 0x2278) = lVar40;
      *(undefined4 *)(lVar44 + 0x1140) = 0x3f800000;
      uVar7 = *(undefined1 *)(lVar31 + 0xd1);
      *(undefined1 *)(lVar31 + 0xd1) = 0;
      if ((*(uint *)(lVar44 + 0xc) & 0x10) != 0) {
        fVar49 = *(float *)(*(longlong *)(lVar31 + 0x20) + 0x18);
        if ((fVar49 == 0.0) && (!NAN(fVar49))) {
          fVar49 = *(float *)(lVar44 + 0x18);
        }
        *(float *)(lVar44 + 0x113c) = fVar49;
      }
      lVar40 = *(longlong *)(lVar44 + 0x1440);
      fVar49 = *(float *)(lVar44 + 0x1134);
      *(float *)(lVar44 + 0xc40) = fVar49;
      if (lVar40 == 0) {
        fVar49 = fVar49 * *(float *)(lVar44 + 0xc44) * *(float *)(lVar44 + 0xc48) *
                 *(float *)(lVar44 + 0xbc0);
        lVar42 = *(longlong *)(lVar44 + 0x1120);
joined_r0x7ff70c84a7c4:
        if (lVar42 != 0) {
          fVar49 = fVar49 * *(float *)(lVar42 + 0x48);
        }
        iVar34 = (int)(fVar49 + _DAT_7ff70cb1ba70);
        if (iVar34 < 1) {
          fVar49 = _DAT_7ff70cb1ba2c;
          if (lVar42 != 0) goto LAB_7ff70c84a72f;
LAB_7ff70c84a78a:
          *(float *)(lVar44 + 0x1130) = fVar49;
          *(undefined8 *)(lVar44 + 0x1128) = 0;
          fVar50 = 0.0;
        }
        else {
          fVar50 = (float)(int)(fVar49 + _DAT_7ff70cb1ba70);
          fVar49 = _DAT_7ff70cb1d620;
          if (fVar50 <= _DAT_7ff70cb1d620) {
            fVar49 = fVar50;
          }
          if (lVar42 == 0) goto LAB_7ff70c84a78a;
LAB_7ff70c84a72f:
          if ((*(uint *)(lVar44 + 0xc) & 0x10) != 0) {
            *(undefined4 *)(lVar42 + 0x14) = *(undefined4 *)(lVar44 + 0x113c);
            lVar42 = *(longlong *)(lVar44 + 0x1120);
          }
          *(float *)(lVar44 + 0x1130) = fVar49;
          bVar37 = lVar42 == 0 || lVar40 == 0;
          if (bVar37) {
            lVar48 = 0;
          }
          else {
            *(undefined8 *)((longlong)ppuVar43 + -8) = 0x7ff70c84a76c;
            lVar48 = FUN_7ff70c7e5630(lVar42,CONCAT31((int3)((uint)iVar34 >> 8),bVar37),
                                      _DAT_7ff70cb1bae8);
            lVar42 = *(longlong *)(lVar44 + 0x1120);
            fVar49 = *(float *)(lVar44 + 0x1130);
          }
          *(longlong *)(lVar44 + 0x1128) = lVar48;
          fVar50 = 0.0;
          if ((lVar40 != 0) && (lVar42 != 0)) {
            fVar50 = fVar49 / *(float *)(lVar48 + 0x14);
          }
        }
        *(float *)(lVar44 + 0x1138) = fVar50;
        *(float *)(lVar44 + 0x1168) = fVar49;
        *(float *)(lVar44 + 0x116c) = fVar50;
        lVar44 = _DAT_7ff70cc1a3c0;
      }
      else if ((*(char *)(lVar40 + 0xd1) != '\x01') ||
              ((*(longlong *)(lVar44 + 0x2278) != 0 &&
               (*(int *)(*(longlong *)(lVar44 + 0x2278) + 0x74) == -1)))) {
        fVar49 = fVar49 * *(float *)(lVar44 + 0xc44) * *(float *)(lVar44 + 0xc48) *
                 *(float *)(lVar40 + 0x2b8) * *(float *)(lVar44 + 0xbc0);
        lVar42 = *(longlong *)(lVar44 + 0x1120);
        goto joined_r0x7ff70c84a7c4;
      }
      *(undefined1 *)(lVar31 + 0xd1) = uVar7;
      if (*(longlong *)(lVar44 + 0x2278) == 0) {
        bVar37 = *(longlong *)(*(longlong *)(lVar44 + 0x1440) + 0x1c8) == 0;
      }
      else {
        bVar37 = false;
      }
      *(bool *)(*(longlong *)(lVar44 + 0x1440) + 0x178) = bVar37;
      goto LAB_7ff70c84a839;
    }
  }
  *(undefined8 *)(lVar44 + 0x27a8) = 0;
  *(undefined8 *)(lVar44 + 0x2278) = 0;
  *(undefined4 *)(lVar44 + 0x1140) = 0x3f800000;
LAB_7ff70c84a839:
  if (_DAT_7ff70cbebd80 != (*(ulonglong *)((longlong)ppuVar43 + 0x58) ^ (ulonglong)ppuVar43)) {
    *(undefined8 *)((longlong)ppuVar43 + -8) = 0x7ff70c84a8bf;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)ppuVar43 + 0x58) ^ (ulonglong)ppuVar43);
    pcVar8 = (code *)swi(3);
    uVar46 = (*pcVar8)();
    return (undefined *)uVar46;
  }
  return (undefined *)(ulonglong)uVar27;
}


