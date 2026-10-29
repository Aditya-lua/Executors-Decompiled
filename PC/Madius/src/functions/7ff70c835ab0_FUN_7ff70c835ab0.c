/* 7ff70c835ab0 FUN_7ff70c835ab0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c835ab0(undefined *param_1,uint param_2,ulonglong *param_3,uint param_4,
                          uint param_5)

{
  int *piVar1;
  undefined8 *puVar2;
  byte bVar3;
  code *pcVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  longlong lVar7;
  undefined4 uVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  undefined1 uVar12;
  short sVar13;
  uint uVar14;
  char *pcVar15;
  longlong lVar16;
  uint uVar17;
  longlong lVar18;
  uint uVar19;
  int iVar20;
  longlong lVar21;
  undefined *puVar22;
  longlong lVar23;
  uint uVar24;
  char cVar25;
  int iVar26;
  int iVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined4 uVar30;
  undefined4 uVar31;
  undefined4 uVar32;
  float fVar33;
  undefined8 uVar34;
  undefined1 auVar35 [16];
  float fVar37;
  undefined1 auVar36 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  float fVar40;
  float fVar41;
  float fVar42;
  float fVar43;
  undefined1 auStack_d8 [32];
  undefined8 uStack_b8;
  uint uStack_b0;
  longlong lStack_a0;
  ulonglong *puStack_98;
  undefined *puStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  ulonglong uStack_70;
  
  lVar7 = _DAT_7ff70cc1a3c0;
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uVar24 = param_4 & 0xfffffffb;
  if ((param_4 & 0x10) == 0) {
    uVar24 = param_4;
  }
  uVar19 = uVar24 & 0xfffffff7;
  if ((uVar24 & 0x20) == 0) {
    uVar19 = uVar24;
  }
  uVar24 = param_5 >> 0x15 & 0x100 | param_5 >> 0x1d & 2 | uVar19;
  uVar14 = 0x1000001;
  if ((uVar19 & 0xc) == 0) {
    uVar14 = 0x1000103;
  }
  uVar19 = uVar14 | param_5 | (uint)((uVar19 & 0x70) != 0) << 6 | *(uint *)(lVar18 + 0x14) & 4;
  if ((char)uVar24 < '\0') {
    uStack_88 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd84);
    uStack_80 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd8c);
    iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
    puStack_98 = param_3;
    if (iVar20 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef4)) {
      if (iVar20 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar20 / 2 + iVar20;
      }
      iVar27 = iVar20 + 1;
      if (iVar20 + 1 < iVar26) {
        iVar27 = iVar26;
      }
      lVar9 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0x14,_DAT_7ff70cc1a3d0);
      lVar10 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
          sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar16 * 8) + 1;
        }
        else {
          iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
          lVar16 = (longlong)iVar20;
          *(int *)(lVar10 + 0x2874 + lVar16 * 8) = *piVar1;
          *(undefined4 *)(lVar10 + 0x2878 + lVar16 * 8) = 0;
          sVar13 = 1;
        }
        *(short *)(lVar10 + 0x2878 + lVar16 * 8) = sVar13;
        *(int *)(lVar10 + 0x2868) = *(int *)(lVar10 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar7 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar9,*(longlong *)(lVar7 + 0x1ef8),
                         (longlong)*(int *)(lVar7 + 0x1ef0) * 0x14);
        lVar16 = _DAT_7ff70cc1a3c0;
        lVar10 = *(longlong *)(lVar7 + 0x1ef8);
        if ((lVar10 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
            sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar23 * 8) + 1;
          }
          else {
            iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
            lVar23 = (longlong)iVar20;
            *(int *)(lVar16 + 0x2874 + lVar23 * 8) = *piVar1;
            *(undefined4 *)(lVar16 + 0x2878 + lVar23 * 8) = 0;
            sVar13 = 1;
          }
          *(short *)(lVar16 + 0x287a + lVar23 * 8) = sVar13;
          *(int *)(lVar16 + 0x286c) = *(int *)(lVar16 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar7 + 0x1ef8) = lVar9;
      *(int *)(lVar7 + 0x1ef4) = iVar27;
      iVar20 = *(int *)(lVar7 + 0x1ef0);
    }
    else {
      lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1ef8);
    }
    *(undefined4 *)(lVar9 + (longlong)iVar20 * 0x14) = 3;
    puVar2 = (undefined8 *)(lVar9 + 4 + (longlong)iVar20 * 0x14);
    *puVar2 = uStack_88;
    puVar2[1] = uStack_80;
    *(int *)(lVar7 + 0x1ef0) = *(int *)(lVar7 + 0x1ef0) + 1;
    if (*(int *)(lVar7 + 0x1eec) != 3) {
      *(undefined8 *)(lVar7 + 0xd84) = *(undefined8 *)(lVar7 + 0xdc4);
      *(undefined8 *)(lVar7 + 0xd8c) = *(undefined8 *)(lVar7 + 0xdcc);
    }
    lVar9 = _DAT_7ff70cc1a3c0;
    uVar8 = *(undefined4 *)(lVar7 + 0xc94);
    uVar30 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc7c);
    iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
    puStack_90 = param_1;
    if (iVar20 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f04)) {
      if (iVar20 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar20 / 2 + iVar20;
      }
      iVar27 = iVar20 + 1;
      if (iVar20 + 1 < iVar26) {
        iVar27 = iVar26;
      }
      lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0xc,_DAT_7ff70cc1a3d0);
      lVar16 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
          sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar23 * 8) + 1;
        }
        else {
          iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
          lVar23 = (longlong)iVar20;
          *(int *)(lVar16 + 0x2874 + lVar23 * 8) = *piVar1;
          *(undefined4 *)(lVar16 + 0x2878 + lVar23 * 8) = 0;
          sVar13 = 1;
        }
        *(short *)(lVar16 + 0x2878 + lVar23 * 8) = sVar13;
        *(int *)(lVar16 + 0x2868) = *(int *)(lVar16 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar9 + 0x1f08) != 0) {
        FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar9 + 0x1f08),
                         (longlong)*(int *)(lVar9 + 0x1f00) * 0xc);
        lVar23 = _DAT_7ff70cc1a3c0;
        lVar16 = *(longlong *)(lVar9 + 0x1f08);
        if ((lVar16 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar21 * 8) == *piVar1) {
            sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar21 * 8) + 1;
          }
          else {
            iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
            lVar21 = (longlong)iVar20;
            *(int *)(lVar23 + 0x2874 + lVar21 * 8) = *piVar1;
            *(undefined4 *)(lVar23 + 0x2878 + lVar21 * 8) = 0;
            sVar13 = 1;
          }
          *(short *)(lVar23 + 0x287a + lVar21 * 8) = sVar13;
          *(int *)(lVar23 + 0x286c) = *(int *)(lVar23 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar16,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar9 + 0x1f08) = lVar10;
      *(int *)(lVar9 + 0x1f04) = iVar27;
      iVar20 = *(int *)(lVar9 + 0x1f00);
    }
    else {
      lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f08);
    }
    *(undefined4 *)(lVar10 + (longlong)iVar20 * 0xc) = 7;
    *(undefined4 *)(lVar10 + 4 + (longlong)iVar20 * 0xc) = uVar30;
    *(int *)(lVar9 + 0x1f00) = *(int *)(lVar9 + 0x1f00) + 1;
    *(undefined4 *)(lVar9 + 0xc7c) = uVar8;
    lVar9 = _DAT_7ff70cc1a3c0;
    uVar8 = *(undefined4 *)(lVar7 + 0xc98);
    uVar30 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc80);
    iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
    if (iVar20 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f04)) {
      if (iVar20 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar20 / 2 + iVar20;
      }
      iVar27 = iVar20 + 1;
      if (iVar20 + 1 < iVar26) {
        iVar27 = iVar26;
      }
      lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0xc,_DAT_7ff70cc1a3d0);
      lVar16 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
          sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar23 * 8) + 1;
        }
        else {
          iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
          lVar23 = (longlong)iVar20;
          *(int *)(lVar16 + 0x2874 + lVar23 * 8) = *piVar1;
          *(undefined4 *)(lVar16 + 0x2878 + lVar23 * 8) = 0;
          sVar13 = 1;
        }
        *(short *)(lVar16 + 0x2878 + lVar23 * 8) = sVar13;
        *(int *)(lVar16 + 0x2868) = *(int *)(lVar16 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar9 + 0x1f08) != 0) {
        FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar9 + 0x1f08),
                         (longlong)*(int *)(lVar9 + 0x1f00) * 0xc);
        lVar23 = _DAT_7ff70cc1a3c0;
        lVar16 = *(longlong *)(lVar9 + 0x1f08);
        if ((lVar16 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar21 * 8) == *piVar1) {
            sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar21 * 8) + 1;
          }
          else {
            iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
            lVar21 = (longlong)iVar20;
            *(int *)(lVar23 + 0x2874 + lVar21 * 8) = *piVar1;
            *(undefined4 *)(lVar23 + 0x2878 + lVar21 * 8) = 0;
            sVar13 = 1;
          }
          *(short *)(lVar23 + 0x287a + lVar21 * 8) = sVar13;
          *(int *)(lVar23 + 0x286c) = *(int *)(lVar23 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar16,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar9 + 0x1f08) = lVar10;
      *(int *)(lVar9 + 0x1f04) = iVar27;
      iVar20 = *(int *)(lVar9 + 0x1f00);
    }
    else {
      lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f08);
    }
    *(undefined4 *)(lVar10 + (longlong)iVar20 * 0xc) = 8;
    *(undefined4 *)(lVar10 + 4 + (longlong)iVar20 * 0xc) = uVar30;
    *(int *)(lVar9 + 0x1f00) = *(int *)(lVar9 + 0x1f00) + 1;
    *(undefined4 *)(lVar9 + 0xc80) = uVar8;
    lVar9 = _DAT_7ff70cc1a3c0;
    uVar34 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xc54);
    iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
    if (iVar20 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f04)) {
      if (iVar20 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar20 / 2 + iVar20;
      }
      iVar27 = iVar20 + 1;
      if (iVar20 + 1 < iVar26) {
        iVar27 = iVar26;
      }
      lStack_a0 = lVar18;
      lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar27 * 0xc,_DAT_7ff70cc1a3d0);
      lVar18 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
          sVar13 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar16 * 8) + 1;
        }
        else {
          iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
          lVar16 = (longlong)iVar20;
          *(int *)(lVar18 + 0x2874 + lVar16 * 8) = *piVar1;
          *(undefined4 *)(lVar18 + 0x2878 + lVar16 * 8) = 0;
          sVar13 = 1;
        }
        *(short *)(lVar18 + 0x2878 + lVar16 * 8) = sVar13;
        *(int *)(lVar18 + 0x2868) = *(int *)(lVar18 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar9 + 0x1f08) != 0) {
        FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar9 + 0x1f08),
                         (longlong)*(int *)(lVar9 + 0x1f00) * 0xc);
        lVar16 = _DAT_7ff70cc1a3c0;
        lVar18 = *(longlong *)(lVar9 + 0x1f08);
        if ((lVar18 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
            sVar13 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar23 * 8) + 1;
          }
          else {
            iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
            lVar23 = (longlong)iVar20;
            *(int *)(lVar16 + 0x2874 + lVar23 * 8) = *piVar1;
            *(undefined4 *)(lVar16 + 0x2878 + lVar23 * 8) = 0;
            sVar13 = 1;
          }
          *(short *)(lVar16 + 0x287a + lVar23 * 8) = sVar13;
          *(int *)(lVar16 + 0x286c) = *(int *)(lVar16 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar18,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar9 + 0x1f08) = lVar10;
      *(int *)(lVar9 + 0x1f04) = iVar27;
      iVar20 = *(int *)(lVar9 + 0x1f00);
      lVar18 = lStack_a0;
    }
    else {
      lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f08);
    }
    *(undefined4 *)(lVar10 + (longlong)iVar20 * 0xc) = 2;
    *(undefined8 *)(lVar10 + 4 + (longlong)iVar20 * 0xc) = uVar34;
    *(int *)(lVar9 + 0x1f00) = *(int *)(lVar9 + 0x1f00) + 1;
    *(undefined8 *)(lVar9 + 0xc54) = *(undefined8 *)(lVar7 + 0xc8c);
    uVar24 = uVar24 | 3;
    uVar19 = uVar19 | 4;
    lVar9 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1c8);
    lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    lVar16 = _DAT_7ff70cc1a3c0;
    param_3 = puStack_98;
    puVar22 = puStack_90;
    uVar8 = uStack_b8._4_4_;
  }
  else {
    lVar9 = *(longlong *)(lVar18 + 0x1c8);
    lVar10 = lVar18;
    lVar16 = _DAT_7ff70cc1a3c0;
    puVar22 = param_1;
    uVar8 = uStack_b8._4_4_;
  }
  uStack_b8 = puVar22;
  lVar23 = 0x248;
  if ((lVar9 == 0) && (lVar23 = 0x248, *(longlong *)(lVar16 + 0x2278) == 0)) {
    lVar23 = 0x278;
  }
  uVar11 = *param_3;
  auVar35._8_8_ = 0;
  auVar35._0_8_ = uVar11;
  fVar40 = (float)*(undefined8 *)(lVar10 + 0x118);
  fVar41 = (float)((ulonglong)*(undefined8 *)(lVar10 + 0x118) >> 0x20);
  auVar38._0_4_ = -(uint)((uVar24 & _DAT_7ff70cb1d8b0) == 0);
  auVar38._4_4_ = -(uint)((uVar24 & _UNK_7ff70cb1d8b4) == 0);
  auVar38._8_4_ = -(uint)((uVar24 & _UNK_7ff70cb1d8b8) == 0);
  auVar38._12_4_ = -(uint)((uVar24 & _UNK_7ff70cb1d8bc) == 0);
  auVar36._4_4_ = (float)((ulonglong)*(undefined8 *)(lVar10 + lVar23) >> 0x20) - fVar41;
  auVar36._0_4_ = (float)*(undefined8 *)(lVar10 + lVar23) - fVar40;
  auVar36._8_8_ = 0;
  fVar33 = (float)uVar11;
  fVar37 = (float)(uVar11 >> 0x20);
  iVar26 = -(uint)(fVar33 < 0.0);
  iVar27 = -(uint)(fVar37 < 0.0);
  auVar39._4_4_ = iVar26;
  auVar39._0_4_ = iVar26;
  auVar39._8_4_ = iVar27;
  auVar39._12_4_ = iVar27;
  iVar20 = movmskpd((int)param_3,auVar39);
  fVar42 = 0.0;
  fVar43 = 0.0;
  if (iVar20 != 0) {
    lVar23 = 0x248;
    if ((lVar9 == 0) && (*(longlong *)(lVar16 + 0x2278) == 0)) {
      lVar23 = 0x278;
    }
    fVar42 = (float)*(undefined8 *)(lVar10 + lVar23) - fVar40;
    fVar43 = (float)((ulonglong)*(undefined8 *)(lVar10 + lVar23) >> 0x20) - fVar41;
  }
  auVar28._4_4_ = -(uint)(fVar37 == 0.0);
  auVar28._0_4_ = -(uint)(fVar33 == 0.0);
  auVar28._8_4_ = 0xffffffff;
  auVar28._12_4_ = 0xffffffff;
  auVar36 = blendvps(auVar35,auVar38 & auVar36,auVar28);
  auVar6._4_4_ = fVar43 + fVar37;
  auVar6._0_4_ = fVar42 + fVar33;
  auVar6._8_8_ = 0;
  auVar39 = maxps(_DAT_7ff70cb1d8c0,auVar6);
  auVar29._4_4_ = iVar27;
  auVar29._0_4_ = iVar26;
  auVar29._8_8_ = 0;
  auVar36 = blendvps(auVar36,auVar39,auVar29);
  uVar34 = auVar36._0_8_;
  if (((*(byte *)(lVar7 + 0x1e70) & 2) != 0) && ((*(byte *)(lVar7 + 0x1e78) & 1) != 0)) {
    fVar33 = *(float *)(lVar7 + 0x1e90);
    uVar30 = 0;
    uVar31 = 0;
    uVar32 = 0;
    uVar14 = uVar24 & 0xfffffffb;
    if (fVar33 <= 0.0) {
      fVar33 = auVar36._0_4_;
      uVar30 = auVar36._4_4_;
      uVar31 = auVar36._8_4_;
      uVar32 = auVar36._12_4_;
      uVar14 = uVar24;
    }
    uVar24 = uVar14;
    auVar5._4_4_ = uVar30;
    auVar5._0_4_ = fVar33;
    auVar5._8_4_ = uVar31;
    auVar5._12_4_ = uVar32;
    auVar36 = blendps(auVar36,auVar5,1);
    uVar34 = auVar36._0_8_;
    if (0.0 < *(float *)(lVar7 + 0x1e94)) {
      uVar24 = uVar24 & 0xfffffff7;
      auVar36 = insertps(auVar36,ZEXT416((uint)*(float *)(lVar7 + 0x1e94)),0x10);
      uVar34 = auVar36._0_8_;
    }
  }
  _DAT_7ff70cc1a3c0 = lVar16;
  *(byte *)(lVar16 + 0x1e70) = *(byte *)(lVar16 + 0x1e70) | 2;
  *(undefined8 *)(lVar16 + 0x1e90) = uVar34;
  *(undefined4 *)(lVar16 + 0x1e78) = 1;
  uVar14 = uVar24;
  if ((*(uint *)(lVar7 + 0x1e70) & 0x200) != 0) {
    uVar14 = *(uint *)(lVar7 + 0x1eac) | uVar24;
  }
  *(uint *)(lVar7 + 0x1eac) = uVar14;
  *(uint *)(lVar7 + 0x1e70) = *(uint *)(lVar7 + 0x1e70) | 0x200;
  if (uStack_b8 == (undefined *)0x0) {
    uStack_b8 = (undefined *)CONCAT44(uVar8,param_2);
    puVar22 = &UNK_7ff70cb897ba;
  }
  else {
    puVar22 = &UNK_7ff70cb897a2;
    uStack_b0 = param_2;
  }
  FUN_7ff70c802b70(&uStack_88,0,puVar22,*(undefined8 *)(lVar18 + 8));
  uVar8 = *(undefined4 *)(lVar7 + 0xc80);
  if ((uVar24 & 1) == 0) {
    *(undefined4 *)(lVar7 + 0xc80) = 0;
  }
  uVar19 = FUN_7ff70c826d00(uStack_88,0,uVar19);
  *(undefined4 *)(lVar7 + 0xc80) = uVar8;
  lVar9 = _DAT_7ff70cc1a3c0;
  if (-1 < (char)uVar24) goto LAB_7ff70c836642;
  iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
  iVar26 = 3;
  if (iVar20 < 3) {
    FUN_7ff70c80af70(&UNK_7ff70cb90097);
    iVar20 = *(int *)(lVar9 + 0x1f00);
    iVar26 = iVar20;
    if (0 < iVar20) goto LAB_7ff70c836597;
  }
  else {
LAB_7ff70c836597:
    iVar26 = iVar26 + 1;
    do {
      lVar10 = *(longlong *)(lVar9 + 0x1f08) + (longlong)iVar20 * 0xc;
      iVar20 = *(int *)(*(longlong *)(lVar9 + 0x1f08) + -0xc + (longlong)iVar20 * 0xc);
      uVar11 = (ulonglong)*(ushort *)(&UNK_7ff70cb1d062 + (longlong)iVar20 * 4);
      if ((0x26ffd379bU >> ((longlong)iVar20 & 0x3fU) & 1) == 0) {
        if ((1L << ((byte)iVar20 & 0x3f) & 0xd9002c864U) != 0) {
          *(undefined4 *)(lVar9 + 0xc40 + uVar11) = *(undefined4 *)(lVar10 + -8);
          *(undefined4 *)(lVar9 + 0xc44 + uVar11) = *(undefined4 *)(lVar10 + -4);
        }
      }
      else {
        *(undefined4 *)(lVar9 + 0xc40 + uVar11) = *(undefined4 *)(lVar10 + -8);
      }
      iVar20 = *(int *)(lVar9 + 0x1f00) + -1;
      *(int *)(lVar9 + 0x1f00) = iVar20;
      iVar26 = iVar26 + -1;
    } while (1 < iVar26);
  }
  FUN_7ff70c80a7b0(1);
LAB_7ff70c836642:
  lVar9 = *(longlong *)(lVar7 + 0x1440);
  *(uint *)(lVar9 + 0x90) = param_2;
  if (*(short *)(lVar9 + 0xda) == 1) {
    *(undefined8 *)(lVar18 + 0x118) = *(undefined8 *)(lVar9 + 0x28);
  }
  lVar18 = _DAT_7ff70cc1a3c0;
  pcVar15 = "Child";
  uVar14 = ~param_2;
  do {
    cVar25 = pcVar15[-2];
    if (cVar25 == '#') {
      if ((pcVar15[-1] == '#') && (*pcVar15 == '#')) {
        uVar14 = ~param_2;
      }
    }
    else if (cVar25 == '\0') break;
    uVar14 = crc32(uVar14,cVar25);
    pcVar15 = pcVar15 + 1;
  } while( true );
  uVar17 = ~uVar14;
  if (*(uint *)(lVar7 + 0x14b4) == uVar17) {
    iVar20 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
    if (iVar20 == 0) {
      *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x14c0) = 0;
    }
    else {
      if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
         (iVar20 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
        if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
          FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
          iVar20 = *(int *)(lVar18 + 0x14b4);
        }
        *(undefined8 *)(lVar18 + 0x1460) = 0;
      }
      *(int *)(lVar18 + 0x14e8) = iVar20;
      *(uint *)(lVar18 + 0x14ec) =
           (uint)(*(int *)(lVar18 + 0x1e20) != iVar20) + *(int *)(lVar18 + 5000);
      *(undefined1 *)(lVar18 + 0x14f0) = *(undefined1 *)(lVar18 + 0x14c4);
      *(bool *)(lVar18 + 0x14f1) = *(int *)(lVar18 + 0x14b8) == iVar20;
      if (*(int *)(lVar18 + 0x241c) == iVar20) {
        FUN_7ff70c8934e0(iVar20);
        iVar20 = *(int *)(lVar18 + 0x14b4);
      }
      *(bool *)(lVar18 + 0x14c0) = iVar20 != 0;
      if (iVar20 != 0) {
        if ((*(byte *)(lVar18 + 0x27b4) & 2) != 0) {
          puVar22 = &UNK_7ff70cb923a7;
          if (*(longlong *)(lVar18 + 0x14d8) != 0) {
            puVar22 = *(undefined **)(*(longlong *)(lVar18 + 0x14d8) + 8);
          }
          uStack_b8 = &UNK_7ff70cb923a7;
          FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar20,puVar22,0);
        }
        *(undefined4 *)(lVar18 + 0x14bc) = 0;
        *(undefined2 *)(lVar18 + 0x14c3) = 0;
        *(undefined1 *)(lVar18 + 0x14c8) = 0xff;
      }
    }
    *(undefined4 *)(lVar18 + 0x14b4) = 0;
    *(undefined2 *)(lVar18 + 0x14c1) = 0;
    *(undefined8 *)(lVar18 + 0x14d8) = 0;
    *(undefined2 *)(lVar18 + 0x14c5) = 0;
    *(undefined4 *)(lVar18 + 0x1dd0) = 0;
    *(undefined1 *)(lVar18 + 0x1dd4) = 0;
  }
  if (((*(uint *)(lVar7 + 0x1fa8) != param_2) || ((uVar24 & 0x100) != 0)) ||
     ((*(short *)(lVar9 + 0x174) == 0 && (*(char *)(lVar9 + 0x17a) != '\x01'))))
  goto LAB_7ff70c836b38;
  FUN_7ff70c819c70(lVar9,0);
  lVar18 = _DAT_7ff70cc1a3c0;
  if ((*(uint *)(lVar9 + 0x14) & 0x10000) == 0) {
    if ((((*(uint *)(lVar9 + 0x14) & 0x4000000) == 0) && (lVar9 != *(longlong *)(lVar9 + 0x3c0))) &&
       (*(int *)(lVar9 + 0x3f0) != 0)) {
      cVar25 = '\0';
      bVar3 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4);
    }
    else {
      cVar25 = '\x01';
      bVar3 = *(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4);
    }
    if ((bVar3 & 0x10) != 0) {
      FUN_7ff70c800cf0(&UNK_7ff70cb91242,cVar25,*(undefined8 *)(lVar9 + 8),
                       *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1fa4));
    }
    lVar10 = _DAT_7ff70cc1a3c0;
    if (cVar25 == '\0') {
      *(undefined4 *)(lVar18 + 0x1f94) = *(undefined4 *)(lVar9 + 0x3f0);
      goto LAB_7ff70c8369b4;
    }
    uVar8 = *(undefined4 *)(lVar9 + 0x428);
    iVar20 = *(int *)(lVar18 + 0x1fa4);
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1f94) = 0;
    *(int *)(lVar10 + 0x1fa4) = iVar20;
    FUN_7ff70c83e1d0(uVar8);
    *(undefined4 *)(*(longlong *)(lVar10 + 0x1f98) + 0x3f0 + (longlong)iVar20 * 4) = 0;
    puVar2 = (undefined8 *)(*(longlong *)(lVar10 + 0x1f98) + 0x3f8 + (longlong)iVar20 * 0x10);
    *puVar2 = 0;
    puVar2[1] = 0;
    *(undefined4 *)
     (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x418 +
     (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
    *(undefined4 *)
     (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x41c +
     (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
    *(undefined2 *)(lVar18 + 0x1fea) = 1;
    *(undefined4 *)(lVar18 + 0x1ff8) = 0;
    uVar12 = 1;
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\0') {
      uVar12 = *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x1fea);
    }
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x1fe9) = uVar12;
    uVar24 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x14b4);
    if (uVar24 != 0) goto LAB_7ff70c8369d0;
LAB_7ff70c8369a1:
    uVar24 = 0;
    lVar18 = _DAT_7ff70cc1a3c0;
  }
  else {
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1f94) = 0;
LAB_7ff70c8369b4:
    FUN_7ff70c83e1d0(*(undefined4 *)(lVar9 + 0x428));
    uVar24 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x14b4);
    if (uVar24 == 0) goto LAB_7ff70c8369a1;
LAB_7ff70c8369d0:
    lVar18 = _DAT_7ff70cc1a3c0;
    if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
       (uVar24 == *(uint *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
        uVar24 = *(uint *)(lVar18 + 0x14b4);
      }
      *(undefined8 *)(lVar18 + 0x1460) = 0;
    }
    *(uint *)(lVar18 + 0x14e8) = uVar24;
    *(uint *)(lVar18 + 0x14ec) =
         (uint)(*(uint *)(lVar18 + 0x1e20) != uVar24) + *(int *)(lVar18 + 5000);
    *(undefined1 *)(lVar18 + 0x14f0) = *(undefined1 *)(lVar18 + 0x14c4);
    *(bool *)(lVar18 + 0x14f1) = *(uint *)(lVar18 + 0x14b8) == uVar24;
    if (*(uint *)(lVar18 + 0x241c) == uVar24) {
      FUN_7ff70c8934e0(uVar24);
      uVar24 = *(uint *)(lVar18 + 0x14b4);
    }
  }
  *(bool *)(lVar18 + 0x14c0) = uVar24 != uVar17;
  if (uVar24 != uVar17) {
    if ((*(byte *)(lVar18 + 0x27b4) & 2) != 0) {
      uStack_b8 = *(undefined **)(lVar9 + 8);
      if (*(longlong *)(lVar18 + 0x14d8) == 0) {
        puVar22 = &UNK_7ff70cb923a7;
      }
      else {
        puVar22 = *(undefined **)(*(longlong *)(lVar18 + 0x14d8) + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,uVar24,puVar22,uVar17);
    }
    *(undefined4 *)(lVar18 + 0x14bc) = 0;
    *(undefined2 *)(lVar18 + 0x14c3) = 0;
    *(undefined1 *)(lVar18 + 0x14c8) = 0xff;
    if (uVar14 != 0xffffffff) {
      *(uint *)(lVar18 + 0x14fc) = uVar17;
      *(undefined4 *)(lVar18 + 0x1500) = 0;
    }
  }
  *(uint *)(lVar18 + 0x14b4) = uVar17;
  *(undefined2 *)(lVar18 + 0x14c1) = 0;
  *(longlong *)(lVar18 + 0x14d8) = lVar9;
  *(undefined2 *)(lVar18 + 0x14c5) = 0;
  if (uVar14 != 0xffffffff) {
    *(uint *)(lVar18 + 0x14b8) = uVar17;
    if ((*(uint *)(lVar18 + 0x1fa8) == uVar17) || (uVar8 = 1, *(uint *)(lVar18 + 0x2154) == uVar17))
    {
      uVar8 = *(undefined4 *)(lVar18 + 0x1fd8);
    }
    *(undefined4 *)(lVar18 + 0x14e0) = uVar8;
  }
  *(undefined4 *)(lVar18 + 0x1dd0) = 0;
  *(undefined1 *)(lVar18 + 0x1dd4) = 0;
  *(undefined4 *)(lVar7 + 0x14e0) = *(undefined4 *)(lVar7 + 0x1fd8);
LAB_7ff70c836b38:
  if (_DAT_7ff70cbebd80 != (uStack_70 ^ (ulonglong)auStack_d8)) {
    FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_d8);
    pcVar4 = (code *)swi(3);
    uVar11 = (*pcVar4)();
    return uVar11;
  }
  return (ulonglong)uVar19;
}


