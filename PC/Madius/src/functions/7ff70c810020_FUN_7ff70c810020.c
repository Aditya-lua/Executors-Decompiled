/* 7ff70c810020 FUN_7ff70c810020 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c810020(void)

{
  int *piVar1;
  char cVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  longlong lVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  short sVar13;
  int iVar14;
  int iVar15;
  char *pcVar16;
  longlong lVar17;
  ulonglong uVar18;
  int iVar19;
  uint uVar20;
  longlong lVar21;
  longlong lVar22;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined8 *puVar26;
  
  puVar7 = _DAT_7ff70cc1a3c0;
  pcVar16 = "ndow";
  uVar20 = 0xffffffff;
  do {
    cVar2 = pcVar16[-2];
    if (cVar2 == '#') {
      if ((pcVar16[-1] == '#') && (*pcVar16 == '#')) {
        uVar20 = 0xffffffff;
      }
    }
    else if (cVar2 == '\0') break;
    uVar20 = crc32(uVar20,cVar2);
    pcVar16 = pcVar16 + 1;
  } while( true );
  iVar15 = *(int *)(_DAT_7ff70cc1a3c0 + 0x2688);
  if (iVar15 == *(int *)(_DAT_7ff70cc1a3c0 + 0x268c)) {
    if (iVar15 == 0) {
      iVar14 = 8;
    }
    else {
      iVar14 = iVar15 / 2 + iVar15;
    }
    iVar19 = iVar15 + 1;
    if (iVar15 + 1 < iVar14) {
      iVar19 = iVar14;
    }
    lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar19 * 0x48,_DAT_7ff70cc1a3d0);
    puVar8 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2874) == *piVar1) {
        sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2878) + 1;
      }
      else {
        iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
        lVar17 = (longlong)iVar15;
        *(int *)(puVar8 + lVar17 * 8 + 0x2874) = *piVar1;
        *(undefined4 *)(puVar8 + lVar17 * 8 + 0x2878) = 0;
        sVar13 = 1;
      }
      *(short *)(puVar8 + lVar17 * 8 + 0x2878) = sVar13;
      *(int *)(puVar8 + 0x2868) = *(int *)(puVar8 + 0x2868) + 1;
    }
    if (*(longlong *)(puVar7 + 0x2690) != 0) {
      FUN_7ff70cb12b60(lVar10,*(longlong *)(puVar7 + 0x2690),
                       (longlong)*(int *)(puVar7 + 0x2688) * 0x48);
      puVar8 = _DAT_7ff70cc1a3c0;
      lVar17 = *(longlong *)(puVar7 + 0x2690);
      if ((lVar17 != 0) && (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x2874) == *piVar1) {
          sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x287a) + 1;
        }
        else {
          iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
          lVar21 = (longlong)iVar15;
          *(int *)(puVar8 + lVar21 * 8 + 0x2874) = *piVar1;
          *(undefined4 *)(puVar8 + lVar21 * 8 + 0x2878) = 0;
          sVar13 = 1;
        }
        *(short *)(puVar8 + lVar21 * 8 + 0x287a) = sVar13;
        *(int *)(puVar8 + 0x286c) = *(int *)(puVar8 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar17,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(puVar7 + 0x2690) = lVar10;
    *(int *)(puVar7 + 0x268c) = iVar19;
    iVar15 = *(int *)(puVar7 + 0x2688);
  }
  else {
    lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2690);
  }
  lVar17 = (longlong)iVar15;
  *(undefined **)(lVar10 + lVar17 * 0x48) = &UNK_7ff70cb805d0;
  *(uint *)(lVar10 + 8 + lVar17 * 0x48) = ~uVar20;
  *(undefined4 *)(lVar10 + 0xc + lVar17 * 0x48) = 0;
  *(undefined **)(lVar10 + 0x10 + lVar17 * 0x48) = &UNK_7ff70c813130;
  *(undefined8 *)(lVar10 + 0x18 + lVar17 * 0x48) = 0;
  *(undefined **)(lVar10 + 0x20 + lVar17 * 0x48) = &UNK_7ff70c813320;
  *(undefined **)(lVar10 + 0x28 + lVar17 * 0x48) = &UNK_7ff70c8136f0;
  *(undefined **)(lVar10 + 0x30 + lVar17 * 0x48) = &UNK_7ff70c8137e0;
  *(undefined **)(lVar10 + 0x38 + lVar17 * 0x48) = &UNK_7ff70c813960;
  *(undefined8 *)(lVar10 + 0x40 + lVar17 * 0x48) = 0;
  *(int *)(puVar7 + 0x2688) = *(int *)(puVar7 + 0x2688) + 1;
  FUN_7ff70c90f790();
  puVar8 = _DAT_7ff70cc1a3c0;
  *(undefined **)(_DAT_7ff70cc1a3c0 + 0x26d0) = &UNK_7ff70cb8f30d;
  *(undefined **)(puVar8 + 0x26d8) = &UNK_7ff70cb86ba0;
  *(undefined **)(puVar8 + 0x26e0) = &UNK_7ff70cb84fac;
  *(undefined **)(puVar8 + 0x26e8) = &UNK_7ff70cb84f86;
  *(undefined **)(puVar8 + 0x26f0) = &UNK_7ff70cb83a11;
  *(undefined **)(puVar8 + 0x26f8) = &UNK_7ff70cb8e754;
  *(undefined **)(puVar8 + 0x2700) = &UNK_7ff70cb8e76b;
  *(undefined **)(puVar8 + 0x2708) = &UNK_7ff70cb8edaf;
  *(undefined **)(puVar8 + 10000) = &UNK_7ff70cb8f928;
  *(undefined **)(puVar8 + 0x2718) = &UNK_7ff70cb8515a;
  *(undefined **)(puVar7 + 0xbe0) = &UNK_7ff70c814640;
  *(undefined **)(puVar7 + 0xbe8) = &UNK_7ff70c8149f0;
  *(undefined **)(puVar7 + 0xbf8) = &UNK_7ff70c814b00;
  *(undefined **)(puVar7 + 0xc08) = &UNK_7ff70c814d60;
  puVar11 = (undefined8 *)(*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
  puVar8 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0) {
    piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
      sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2878) + 1;
    }
    else {
      iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
      lVar10 = (longlong)iVar15;
      *(int *)(puVar8 + lVar10 * 8 + 0x2874) = *piVar1;
      *(undefined4 *)(puVar8 + lVar10 * 8 + 0x2878) = 0;
      sVar13 = 1;
    }
    *(short *)(puVar8 + lVar10 * 8 + 0x2878) = sVar13;
    *(int *)(puVar8 + 0x2868) = *(int *)(puVar8 + 0x2868) + 1;
  }
  puVar11[6] = 0;
  puVar11[7] = 0;
  puVar11[4] = 0;
  puVar11[5] = 0;
  puVar11[2] = 0;
  puVar11[3] = 0;
  *puVar11 = 0;
  puVar11[1] = 0;
  puVar26 = puVar11 + 0xd;
  puVar11[0xd] = 0;
  puVar11[0xe] = 0;
  puVar11[0xf] = 0;
  puVar11[0x10] = 0;
  puVar11[0x11] = 0;
  FUN_7ff70c7c69b0(puVar11 + 0xb);
  puVar11[0x1a] = 0;
  puVar11[0x1b] = 0;
  puVar11[0x18] = 0;
  puVar11[0x19] = 0;
  puVar11[0x16] = 0;
  puVar11[0x17] = 0;
  puVar11[0x14] = 0;
  puVar11[0x15] = 0;
  puVar11[8] = 0xffffffffffffffff;
  puVar11[9] = 0;
  puVar11[10] = 0;
  *(undefined4 *)puVar11 = 0x11111111;
  iVar15 = *(int *)(puVar7 + 0x1f80);
  if (iVar15 == *(int *)(puVar7 + 0x1f84)) {
    if (iVar15 == 0) {
      iVar14 = 8;
    }
    else {
      iVar14 = iVar15 / 2 + iVar15;
    }
    iVar19 = iVar15 + 1;
    if (iVar15 + 1 < iVar14) {
      iVar19 = iVar14;
    }
    lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar19 << 3,_DAT_7ff70cc1a3d0);
    puVar8 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2874) == *piVar1) {
        sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2878) + 1;
      }
      else {
        iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
        lVar17 = (longlong)iVar15;
        *(int *)(puVar8 + lVar17 * 8 + 0x2874) = *piVar1;
        *(undefined4 *)(puVar8 + lVar17 * 8 + 0x2878) = 0;
        sVar13 = 1;
      }
      *(short *)(puVar8 + lVar17 * 8 + 0x2878) = sVar13;
      *(int *)(puVar8 + 0x2868) = *(int *)(puVar8 + 0x2868) + 1;
    }
    if (*(longlong *)(puVar7 + 0x1f88) != 0) {
      FUN_7ff70cb12b60(lVar10,*(longlong *)(puVar7 + 0x1f88),
                       (longlong)*(int *)(puVar7 + 0x1f80) << 3);
      puVar8 = _DAT_7ff70cc1a3c0;
      lVar17 = *(longlong *)(puVar7 + 0x1f88);
      if ((lVar17 != 0) && (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x2874) == *piVar1) {
          sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x287a) + 1;
        }
        else {
          iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
          lVar21 = (longlong)iVar15;
          *(int *)(puVar8 + lVar21 * 8 + 0x2874) = *piVar1;
          *(undefined4 *)(puVar8 + lVar21 * 8 + 0x2878) = 0;
          sVar13 = 1;
        }
        *(short *)(puVar8 + lVar21 * 8 + 0x287a) = sVar13;
        *(int *)(puVar8 + 0x286c) = *(int *)(puVar8 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar17,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(puVar7 + 0x1f88) = lVar10;
    *(int *)(puVar7 + 0x1f84) = iVar19;
    iVar15 = *(int *)(puVar7 + 0x1f80);
  }
  else {
    lVar10 = *(longlong *)(puVar7 + 0x1f88);
  }
  *(undefined8 **)(lVar10 + (longlong)iVar15 * 8) = puVar11;
  *(int *)(puVar7 + 0x1f80) = *(int *)(puVar7 + 0x1f80) + 1;
  iVar15 = *(int *)(puVar7 + 0x29b4);
  if (iVar15 < 0xc01) {
    if (iVar15 == 0) {
      iVar14 = 0xc01;
    }
    else {
      iVar15 = iVar15 / 2 + iVar15;
      iVar14 = 0xc01;
      if (0xc01 < iVar15) {
        iVar14 = iVar15;
      }
    }
    uVar12 = (*_DAT_7ff70cbe9460)(iVar14,_DAT_7ff70cc1a3d0);
    puVar8 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
        sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2878) + 1;
      }
      else {
        iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
        lVar10 = (longlong)iVar15;
        *(int *)(puVar8 + lVar10 * 8 + 0x2874) = *piVar1;
        *(undefined4 *)(puVar8 + lVar10 * 8 + 0x2878) = 0;
        sVar13 = 1;
      }
      *(short *)(puVar8 + lVar10 * 8 + 0x2878) = sVar13;
      *(int *)(puVar8 + 0x2868) = *(int *)(puVar8 + 0x2868) + 1;
    }
    if (*(longlong *)(puVar7 + 0x29b8) != 0) {
      FUN_7ff70cb12b60(uVar12,*(longlong *)(puVar7 + 0x29b8),(longlong)*(int *)(puVar7 + 0x29b0));
      puVar8 = _DAT_7ff70cc1a3c0;
      lVar10 = *(longlong *)(puVar7 + 0x29b8);
      if ((lVar10 != 0) && (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2874) == *piVar1) {
          sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x287a) + 1;
        }
        else {
          iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
          lVar17 = (longlong)iVar15;
          *(int *)(puVar8 + lVar17 * 8 + 0x2874) = *piVar1;
          *(undefined4 *)(puVar8 + lVar17 * 8 + 0x2878) = 0;
          sVar13 = 1;
        }
        *(short *)(puVar8 + lVar17 * 8 + 0x287a) = sVar13;
        *(int *)(puVar8 + 0x286c) = *(int *)(puVar8 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(puVar7 + 0x29b8) = uVar12;
    *(int *)(puVar7 + 0x29b4) = iVar14;
  }
  lVar10 = (longlong)*(int *)(puVar7 + 0x29b0);
  if (lVar10 < 0xc01) {
    uVar20 = 1U - *(int *)(puVar7 + 0x29b0) & 3;
    uVar18 = (ulonglong)uVar20;
    lVar17 = lVar10;
    if (uVar20 != 0) {
      do {
        *(undefined1 *)(*(longlong *)(puVar7 + 0x29b8) + lVar17) = 0;
        lVar17 = lVar17 + 1;
        uVar18 = uVar18 - 1;
      } while (uVar18 != 0);
    }
    if (2 < lVar10 - 0xbfeU) {
      do {
        *(undefined1 *)(*(longlong *)(puVar7 + 0x29b8) + lVar17) = 0;
        *(undefined1 *)(*(longlong *)(puVar7 + 0x29b8) + 1 + lVar17) = 0;
        *(undefined1 *)(*(longlong *)(puVar7 + 0x29b8) + 2 + lVar17) = 0;
        *(undefined1 *)(*(longlong *)(puVar7 + 0x29b8) + 3 + lVar17) = 0;
        lVar17 = lVar17 + 4;
      } while (lVar17 != 0xc01);
    }
  }
  *(undefined4 *)(puVar7 + 0x29b0) = 0xc01;
  auVar6 = _DAT_7ff70cb1d6f0;
  auVar5 = _DAT_7ff70cb1d6e0;
  auVar4 = _DAT_7ff70cb1d6d0;
  auVar3 = _DAT_7ff70cb1d6c0;
  iVar15 = 0x200;
  do {
    if (iVar15 - 0x218U < 0x24) {
LAB_7ff70c8108e0:
      *(uint *)(puVar7 + (longlong)(iVar15 + -0x200 >> 5) * 4 + 0x1520) =
           *(uint *)(puVar7 + (longlong)(iVar15 + -0x200 >> 5) * 4 + 0x1520) |
           1 << ((byte)iVar15 & 0x1f);
    }
    else {
      auVar23._4_4_ = iVar15;
      auVar23._0_4_ = iVar15;
      auVar23._8_4_ = iVar15;
      auVar23._12_4_ = iVar15;
      auVar24 = auVar23 & auVar3;
      auVar25._0_4_ = -(uint)(auVar24._0_4_ == auVar6._0_4_);
      auVar25._4_4_ = -(uint)(auVar24._4_4_ == auVar6._4_4_);
      auVar25._8_4_ = -(uint)(auVar24._8_4_ == auVar6._8_4_);
      auVar25._12_4_ = -(uint)(auVar24._12_4_ == auVar6._12_4_);
      auVar23 = auVar23 & auVar4;
      auVar24._0_4_ = -(uint)(auVar23._0_4_ == auVar5._0_4_);
      auVar24._4_4_ = -(uint)(auVar23._4_4_ == auVar5._4_4_);
      auVar24._8_4_ = -(uint)(auVar23._8_4_ == auVar5._8_4_);
      auVar24._12_4_ = -(uint)(auVar23._12_4_ == auVar5._12_4_);
      auVar23 = packssdw(auVar25,auVar24);
      if ((iVar15 - 0x25dU < 2 || iVar15 - 0x264U < 10) ||
          ((((((((((((((((SUB161(auVar23 >> 7,0) & 1) != 0 || (SUB161(auVar23 >> 0xf,0) & 1) != 0)
                       || (SUB161(auVar23 >> 0x17,0) & 1) != 0) ||
                      (SUB161(auVar23 >> 0x1f,0) & 1) != 0) || (SUB161(auVar23 >> 0x27,0) & 1) != 0)
                    || (SUB161(auVar23 >> 0x2f,0) & 1) != 0) || (SUB161(auVar23 >> 0x37,0) & 1) != 0
                   ) || (SUB161(auVar23 >> 0x3f,0) & 1) != 0) ||
                 (SUB161(auVar23 >> 0x47,0) & 1) != 0) || (SUB161(auVar23 >> 0x4f,0) & 1) != 0) ||
               (SUB161(auVar23 >> 0x57,0) & 1) != 0) || (SUB161(auVar23 >> 0x5f,0) & 1) != 0) ||
             (SUB161(auVar23 >> 0x67,0) & 1) != 0) || (SUB161(auVar23 >> 0x6f,0) & 1) != 0) ||
           (SUB161(auVar23 >> 0x77,0) & 1) != 0) || auVar23[0xf] < '\0')) goto LAB_7ff70c8108e0;
    }
    iVar15 = iVar15 + 1;
    if (iVar15 == 0x29b) {
      lVar10 = *(longlong *)(puVar7 + 0x40);
      *(undefined1 **)(puVar7 + 0x11b0) = puVar7;
      puVar8 = _DAT_7ff70cc1a3c0;
      *(int *)(lVar10 + 0x2d4) = *(int *)(lVar10 + 0x2d4) + 1;
      iVar15 = *(int *)(puVar8 + 0x1110);
      if (iVar15 == *(int *)(puVar8 + 0x1114)) {
        if (iVar15 == 0) {
          iVar14 = 8;
        }
        else {
          iVar14 = iVar15 / 2 + iVar15;
        }
        iVar19 = iVar15 + 1;
        if (iVar15 + 1 < iVar14) {
          iVar19 = iVar14;
        }
        lVar17 = (*_DAT_7ff70cbe9460)
                           ((longlong)iVar19 << 3,_DAT_7ff70cc1a3d0,auVar5._0_8_,auVar6._0_8_,
                            puVar26);
        puVar9 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x2874) == *piVar1) {
            sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + lVar21 * 8 + 0x2878) + 1;
          }
          else {
            iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
            lVar21 = (longlong)iVar15;
            *(int *)(puVar9 + lVar21 * 8 + 0x2874) = *piVar1;
            *(undefined4 *)(puVar9 + lVar21 * 8 + 0x2878) = 0;
            sVar13 = 1;
          }
          *(short *)(puVar9 + lVar21 * 8 + 0x2878) = sVar13;
          *(int *)(puVar9 + 0x2868) = *(int *)(puVar9 + 0x2868) + 1;
        }
        if (*(longlong *)(puVar8 + 0x1118) != 0) {
          FUN_7ff70cb12b60(lVar17,*(longlong *)(puVar8 + 0x1118),
                           (longlong)*(int *)(puVar8 + 0x1110) << 3);
          puVar9 = _DAT_7ff70cc1a3c0;
          lVar21 = *(longlong *)(puVar8 + 0x1118);
          if ((lVar21 != 0) && (_DAT_7ff70cc1a3c0 != (undefined1 *)0x0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar22 * 8 + 0x2874) == *piVar1) {
              sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + lVar22 * 8 + 0x287a) + 1;
            }
            else {
              iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
              lVar22 = (longlong)iVar15;
              *(int *)(puVar9 + lVar22 * 8 + 0x2874) = *piVar1;
              *(undefined4 *)(puVar9 + lVar22 * 8 + 0x2878) = 0;
              sVar13 = 1;
            }
            *(short *)(puVar9 + lVar22 * 8 + 0x287a) = sVar13;
            *(int *)(puVar9 + 0x286c) = *(int *)(puVar9 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar21,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(puVar8 + 0x1118) = lVar17;
        *(int *)(puVar8 + 0x1114) = iVar19;
        iVar15 = *(int *)(puVar8 + 0x1110);
      }
      else {
        lVar17 = *(longlong *)(puVar8 + 0x1118);
      }
      *(longlong *)(lVar17 + (longlong)iVar15 * 8) = lVar10;
      *(int *)(puVar8 + 0x1110) = *(int *)(puVar8 + 0x1110) + 1;
      FUN_7ff70c7e91b0(lVar10,puVar8 + 0x1148);
      *puVar7 = 1;
      return;
    }
  } while( true );
}


