/* 7ff70c84a8c0 FUN_7ff70c84a8c0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c84a8c0(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  undefined1 uVar5;
  code *pcVar6;
  longlong lVar7;
  float fVar8;
  float fVar9;
  undefined4 uVar10;
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
  undefined8 uVar24;
  ulonglong uVar25;
  char cVar26;
  uint uVar27;
  longlong lVar28;
  longlong lVar29;
  longlong lVar30;
  short sVar31;
  int iVar32;
  undefined4 uVar33;
  uint *puVar34;
  bool bVar35;
  int iVar36;
  undefined *puVar37;
  char *pcVar38;
  uint *puVar39;
  longlong lVar40;
  longlong *plVar41;
  int iVar42;
  longlong lVar43;
  longlong lVar44;
  ulonglong uVar45;
  longlong lVar46;
  longlong lVar47;
  float fVar48;
  float fVar49;
  float fVar50;
  float fVar51;
  float fVar52;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  longlong lStack_50;
  undefined1 auStack_48 [24];
  
  lVar7 = _DAT_7ff70cc1a3c0;
  plVar41 = (longlong *)auStack_48;
  lVar44 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if ((1 < (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410)) ||
     (*(char *)(_DAT_7ff70cc1a3c0 + 0x1399) != '\x01')) {
    lVar43 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) * 0x78 +
             *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418);
    if (((*(byte *)(lVar44 + 0x17) & 1) != 0) &&
       (*(int *)(_DAT_7ff70cc1a3c0 + 0x1394) != *(int *)(lVar44 + 0x10))) {
      lStack_50 = 0x7ff70c84a951;
      FUN_7ff70c80af70(&UNK_7ff70cb9067f);
    }
    if (*(longlong *)(lVar44 + 0x1c8) != 0) {
      lStack_50 = 0x7ff70c84a960;
      FUN_7ff70c912b60();
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    if (*(char *)(lVar44 + 0xd2) == '\0') {
      *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
      lVar30 = *(longlong *)(lVar30 + 0x1440);
      lStack_50 = 0x7ff70c84a991;
      FUN_7ff70c7b8130(*(undefined8 *)(lVar30 + 0x2c8));
      puVar3 = (undefined4 *)
               (*(longlong *)(*(longlong *)(lVar30 + 0x2c8) + 0xa8) + -0x10 +
               (longlong)*(int *)(*(longlong *)(lVar30 + 0x2c8) + 0xa0) * 0x10);
      uVar33 = puVar3[1];
      uVar10 = puVar3[2];
      uVar11 = puVar3[3];
      *(undefined4 *)(lVar30 + 0x260) = *puVar3;
      *(undefined4 *)(lVar30 + 0x264) = uVar33;
      *(undefined4 *)(lVar30 + 0x268) = uVar10;
      *(undefined4 *)(lVar30 + 0x26c) = uVar11;
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20);
    if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x27a8) + 0xc) < iVar36) {
      *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20) = iVar36 + -1;
      if (iVar36 + -1 == 0) {
        uVar33 = 0;
      }
      else {
        uVar33 = *(undefined4 *)(*(longlong *)(lVar30 + 0x1f28) + -0x10 + (longlong)iVar36 * 8);
      }
      *(undefined4 *)(lVar30 + 0x1ddc) = uVar33;
      if (*(char *)(lVar43 + -10) != '\x01') goto LAB_7ff70c84aa1c;
LAB_7ff70c84aa0f:
      lVar30 = _DAT_7ff70cc1a3c0;
      if (*(longlong *)(lVar44 + 0x3c0) != lVar44) goto LAB_7ff70c84aa1c;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) = *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) + -1;
      iVar36 = *(int *)(lVar30 + 0x1f30);
      *(int *)(lVar30 + 0x1f30) = iVar36 + -1;
      *(undefined4 *)(lVar30 + 0x1de0) =
           *(undefined4 *)(*(longlong *)(lVar30 + 0x1f38) + -8 + (longlong)iVar36 * 4);
      *(undefined4 *)(lVar30 + 0xc4c) =
           *(undefined4 *)
            (*(longlong *)(lVar30 + 0x1418) + -8 + (longlong)*(int *)(lVar30 + 0x1410) * 0x78);
      cVar26 = *(char *)(lVar44 + 0xd2);
    }
    else {
      lStack_50 = 0x7ff70c84a9f9;
      FUN_7ff70c80af70(&UNK_7ff70cb90134);
      if (*(char *)(lVar43 + -10) == '\x01') goto LAB_7ff70c84aa0f;
LAB_7ff70c84aa1c:
      cVar26 = *(char *)(lVar44 + 0xd2);
    }
    if (cVar26 == '\x01') {
      *(longlong *)(lVar44 + 0x2c8) = lVar44 + 0x2d0;
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    plVar41 = (longlong *)auStack_48;
    if ((*(longlong *)(lVar7 + 0x2728) == lVar44) &&
       (plVar41 = (longlong *)auStack_48, *(char *)(_DAT_7ff70cc1a3c0 + 0x2720) == '\x01')) {
      lStack_50 = 0x7ff70c84aa61;
      FUN_7ff70c856f00(&UNK_7ff70cb922d3);
      uVar27 = *(uint *)(lVar30 + 0x2724) & 0xf;
      plVar41 = (longlong *)auStack_48;
      if (POPCOUNT(uVar27) == 1) {
        iVar36 = 0;
        for (; (uVar27 & 1) == 0; uVar27 = uVar27 >> 1 | 0x80000000) {
          iVar36 = iVar36 + 1;
        }
        if (iVar36 == 3) {
          plVar41 = (longlong *)auStack_48;
          if ((1 < *(int *)(lVar30 + 0x2738)) &&
             (plVar41 = (longlong *)auStack_48, *(code **)(_DAT_7ff70cc1a3c0 + 0xbe8) != (code *)0x0
             )) {
            lVar29 = 0x7ff70cc1a3c8;
            if (*(longlong *)(lVar30 + 0x2740) != 0) {
              lVar29 = *(longlong *)(lVar30 + 0x2740);
            }
            lStack_50 = 0x7ff70c84ab4b;
            (**(code **)(_DAT_7ff70cc1a3c0 + 0xbe8))(_DAT_7ff70cc1a3c0,lVar29);
            plVar41 = (longlong *)auStack_48;
          }
        }
        else if (iVar36 == 1) {
          uStack_58 = 0x7ff70c84ab15;
          lStack_50 = lVar43;
          func_0x7ff70d8b0830(*(undefined8 *)(lVar30 + 0x2730));
          plVar41 = &lStack_50;
        }
        else {
          plVar41 = (longlong *)auStack_48;
          if (iVar36 == 0) {
            lStack_50 = *(longlong *)(lVar30 + 0x2730);
            uStack_58 = 0x7ff70c84aaa1;
            func_0x7ff70d9df013();
            plVar41 = &lStack_50;
          }
        }
      }
      *(undefined1 *)(lVar30 + 0x14b2) = 0;
      *(undefined1 *)(lVar30 + 0x2720) = 0;
      *(undefined4 *)(lVar30 + 0x2724) = 0;
      *(undefined8 *)(lVar30 + 0x2730) = 0;
      lVar29 = *(longlong *)(lVar30 + 0x2740);
      if (lVar29 != 0) {
        *(undefined8 *)(lVar30 + 0x2738) = 0;
        lVar40 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
            sVar31 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar47 = (longlong)iVar36;
            *(int *)(lVar40 + 0x2874 + lVar47 * 8) = *piVar2;
            *(undefined4 *)(lVar40 + 0x2878 + lVar47 * 8) = 0;
            sVar31 = 1;
          }
          *(short *)(lVar40 + 0x287a + lVar47 * 8) = sVar31;
          *(int *)(lVar40 + 0x286c) = *(int *)(lVar40 + 0x286c) + 1;
        }
        *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c84ac21;
        (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
        *(undefined8 *)(lVar30 + 0x2740) = 0;
      }
    }
    if (*(char *)(lVar44 + 0x159) == '\x01') {
      lVar30 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      *(undefined1 *)(lVar30 + 0x159) = 0;
      if (((*(float *)(lVar30 + 0x130) < *(float *)(lVar30 + 0x118)) ||
          (*(float *)(lVar30 + 0x134) < *(float *)(lVar30 + 0x11c))) &&
         (*(char *)(lVar30 + 0xd1) == '\0')) {
        *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c84ac81;
        FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
      }
    }
    uVar24 = *(undefined8 *)(lVar43 + -0x28);
    *(undefined8 *)(lVar7 + 0x1e60) = *(undefined8 *)(lVar43 + -0x30);
    *(undefined8 *)(lVar7 + 0x1e68) = uVar24;
    uVar33 = *(undefined4 *)(lVar43 + -0x70);
    uVar10 = *(undefined4 *)(lVar43 + -0x6c);
    uVar11 = *(undefined4 *)(lVar43 + -0x68);
    uVar12 = *(undefined4 *)(lVar43 + -100);
    uVar13 = *(undefined4 *)(lVar43 + -0x60);
    uVar14 = *(undefined4 *)(lVar43 + -0x5c);
    uVar15 = *(undefined4 *)(lVar43 + -0x58);
    uVar16 = *(undefined4 *)(lVar43 + -0x54);
    uVar17 = *(undefined4 *)(lVar43 + -0x50);
    uVar18 = *(undefined4 *)(lVar43 + -0x4c);
    uVar19 = *(undefined4 *)(lVar43 + -0x48);
    uVar20 = *(undefined4 *)(lVar43 + -0x44);
    uVar21 = *(undefined4 *)(lVar43 + -0x3c);
    uVar22 = *(undefined4 *)(lVar43 + -0x38);
    uVar23 = *(undefined4 *)(lVar43 + -0x34);
    *(undefined4 *)(lVar7 + 0x1e50) = *(undefined4 *)(lVar43 + -0x40);
    *(undefined4 *)(lVar7 + 0x1e54) = uVar21;
    *(undefined4 *)(lVar7 + 0x1e58) = uVar22;
    *(undefined4 *)(lVar7 + 0x1e5c) = uVar23;
    *(undefined4 *)(lVar7 + 0x1e40) = uVar17;
    *(undefined4 *)(lVar7 + 0x1e44) = uVar18;
    *(undefined4 *)(lVar7 + 0x1e48) = uVar19;
    *(undefined4 *)(lVar7 + 0x1e4c) = uVar20;
    *(undefined4 *)(lVar7 + 0x1e30) = uVar13;
    *(undefined4 *)(lVar7 + 0x1e34) = uVar14;
    *(undefined4 *)(lVar7 + 0x1e38) = uVar15;
    *(undefined4 *)(lVar7 + 0x1e3c) = uVar16;
    *(undefined4 *)(lVar7 + 0x1e20) = uVar33;
    *(undefined4 *)(lVar7 + 0x1e24) = uVar10;
    *(undefined4 *)(lVar7 + 0x1e28) = uVar11;
    *(undefined4 *)(lVar7 + 0x1e2c) = uVar12;
    if ((*(uint *)(lVar44 + 0x14) & 0x10000000) == 0) {
      if ((*(uint *)(lVar44 + 0x14) & 0x4000000) == 0) goto LAB_7ff70c84acd1;
LAB_7ff70c84ad6f:
      *(int *)(lVar7 + 0x1f60) = *(int *)(lVar7 + 0x1f60) + -1;
      cVar26 = *(char *)(lVar7 + 0x7c);
    }
    else {
      *(int *)(lVar7 + 0x2510) = *(int *)(lVar7 + 0x2510) + -1;
      if ((*(uint *)(lVar44 + 0x14) & 0x4000000) != 0) goto LAB_7ff70c84ad6f;
LAB_7ff70c84acd1:
      cVar26 = *(char *)(lVar7 + 0x7c);
    }
    if (cVar26 == '\x01') {
      *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c84ace3;
      FUN_7ff70c83b170(lVar43 + -0x20);
    }
    lVar43 = (longlong)*(int *)(lVar7 + 0x1410) + -1;
    iVar36 = (int)lVar43;
    *(int *)(lVar7 + 0x1410) = iVar36;
    lVar44 = _DAT_7ff70cc1a3c0;
    if (iVar36 == 0) {
      *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1440) = 0;
LAB_7ff70c84ad96:
      *(undefined8 *)(lVar44 + 0x27a8) = 0;
      *(undefined8 *)(lVar44 + 0x2278) = 0;
      *(undefined4 *)(lVar44 + 0x1140) = 0x3f800000;
    }
    else {
      lVar7 = *(longlong *)(*(longlong *)(lVar7 + 0x1418) + -0x78 + lVar43 * 0x78);
      *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) = lVar7;
      if (lVar7 == 0) goto LAB_7ff70c84ad96;
      *(longlong *)(lVar44 + 0x27a8) =
           *(longlong *)(lVar44 + 0x1418) + (longlong)*(int *)(lVar44 + 0x1410) * 0x78 + -0x20;
      if ((longlong)*(int *)(lVar7 + 0x1d0) == -1) {
        lVar43 = 0;
      }
      else {
        lVar43 = (longlong)*(int *)(lVar7 + 0x1d0) * 0x250 + *(longlong *)(lVar44 + 0x22a0);
      }
      *(longlong *)(lVar44 + 0x2278) = lVar43;
      *(undefined4 *)(lVar44 + 0x1140) = 0x3f800000;
      uVar5 = *(undefined1 *)(lVar7 + 0xd1);
      *(undefined1 *)(lVar7 + 0xd1) = 0;
      if ((*(uint *)(lVar44 + 0xc) & 0x10) != 0) {
        fVar48 = *(float *)(*(longlong *)(lVar7 + 0x20) + 0x18);
        if ((fVar48 == 0.0) && (!NAN(fVar48))) {
          fVar48 = *(float *)(lVar44 + 0x18);
        }
        *(float *)(lVar44 + 0x113c) = fVar48;
      }
      lVar43 = *(longlong *)(lVar44 + 0x1440);
      fVar48 = *(float *)(lVar44 + 0x1134);
      *(float *)(lVar44 + 0xc40) = fVar48;
      if (lVar43 == 0) {
        fVar48 = fVar48 * *(float *)(lVar44 + 0xc44) * *(float *)(lVar44 + 0xc48) *
                 *(float *)(lVar44 + 0xbc0);
        lVar30 = *(longlong *)(lVar44 + 0x1120);
joined_r0x7ff70c84af36:
        if (lVar30 != 0) {
          fVar48 = fVar48 * *(float *)(lVar30 + 0x48);
        }
        iVar36 = (int)(fVar48 + _DAT_7ff70cb1ba70);
        if (iVar36 < 1) {
          fVar48 = _DAT_7ff70cb1ba2c;
          if (lVar30 == 0) goto LAB_7ff70c84aefc;
LAB_7ff70c84aea1:
          if ((*(uint *)(lVar44 + 0xc) & 0x10) != 0) {
            *(undefined4 *)(lVar30 + 0x14) = *(undefined4 *)(lVar44 + 0x113c);
            lVar30 = *(longlong *)(lVar44 + 0x1120);
          }
          *(float *)(lVar44 + 0x1130) = fVar48;
          bVar35 = lVar30 == 0 || lVar43 == 0;
          if (bVar35) {
            lVar29 = 0;
          }
          else {
            *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c84aede;
            lVar29 = FUN_7ff70c7e5630(lVar30,CONCAT31((int3)((uint)iVar36 >> 8),bVar35),
                                      _DAT_7ff70cb1bae8);
            lVar30 = *(longlong *)(lVar44 + 0x1120);
            fVar48 = *(float *)(lVar44 + 0x1130);
          }
          *(longlong *)(lVar44 + 0x1128) = lVar29;
          fVar49 = 0.0;
          if ((lVar43 != 0) && (lVar30 != 0)) {
            fVar49 = fVar48 / *(float *)(lVar29 + 0x14);
          }
        }
        else {
          fVar49 = (float)(int)(fVar48 + _DAT_7ff70cb1ba70);
          fVar48 = _DAT_7ff70cb1d620;
          if (fVar49 <= _DAT_7ff70cb1d620) {
            fVar48 = fVar49;
          }
          if (lVar30 != 0) goto LAB_7ff70c84aea1;
LAB_7ff70c84aefc:
          *(float *)(lVar44 + 0x1130) = fVar48;
          *(undefined8 *)(lVar44 + 0x1128) = 0;
          fVar49 = 0.0;
        }
        *(float *)(lVar44 + 0x1138) = fVar49;
        *(float *)(lVar44 + 0x1168) = fVar48;
        *(float *)(lVar44 + 0x116c) = fVar49;
        lVar44 = _DAT_7ff70cc1a3c0;
      }
      else if ((*(char *)(lVar43 + 0xd1) != '\x01') ||
              ((*(longlong *)(lVar44 + 0x2278) != 0 &&
               (*(int *)(*(longlong *)(lVar44 + 0x2278) + 0x74) == -1)))) {
        fVar48 = fVar48 * *(float *)(lVar44 + 0xc44) * *(float *)(lVar44 + 0xc48) *
                 *(float *)(lVar43 + 0x2b8) * *(float *)(lVar44 + 0xbc0);
        lVar30 = *(longlong *)(lVar44 + 0x1120);
        goto joined_r0x7ff70c84af36;
      }
      *(undefined1 *)(lVar7 + 0xd1) = uVar5;
      if (*(longlong *)(lVar44 + 0x2278) == 0) {
        bVar35 = *(longlong *)(*(longlong *)(lVar44 + 0x1440) + 0x1c8) == 0;
      }
      else {
        bVar35 = false;
      }
      *(bool *)(*(longlong *)(lVar44 + 0x1440) + 0x178) = bVar35;
    }
    if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41)) {
      return *(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41;
    }
LAB_7ff70c84afc8:
    *(undefined8 *)((longlong)plVar41 + -8) = 0x7ff70c84afd5;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar41 + 0x20) ^ (ulonglong)plVar41);
    pcVar6 = (code *)swi(3);
    uVar45 = (*pcVar6)();
    return uVar45;
  }
  if (_DAT_7ff70cbebd80 != (_DAT_7ff70cbebd80 ^ (ulonglong)auStack_48 ^ (ulonglong)auStack_48))
  goto LAB_7ff70c84afc8;
  lVar44 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
        goto LAB_7ff70c80aff6;
      }
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
      cVar26 = *(char *)(lVar7 + 0x7f);
      lVar43 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar44 == 0) {
        puVar37 = &UNK_7ff70cb8a129;
      }
      else {
        puVar37 = *(undefined **)(lVar44 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar37,&UNK_7ff70cb9015c);
      *(undefined1 *)(lVar7 + 0x2788) = 0;
      cVar26 = *(char *)(lVar7 + 0x7f);
      lVar43 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar26 = *(char *)(lVar7 + 0x7f);
    lVar43 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar43;
  if (cVar26 != '\x01') {
    pcVar6 = *(code **)(lVar7 + 0x2770);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(lVar7 + 0x1398) == '\x01') {
    pcVar38 = "Tooltip_Error";
    uVar27 = 0xffffffff;
    do {
      cVar26 = pcVar38[-2];
      if (cVar26 == '#') {
        if ((pcVar38[-1] == '#') && (*pcVar38 == '#')) {
          uVar27 = 0xffffffff;
        }
      }
      else if (cVar26 == '\0') goto LAB_7ff70c80b0c7;
      uVar27 = crc32(uVar27,cVar26);
      pcVar38 = pcVar38 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar34 = *(uint **)(lVar43 + 0x1428);
  puVar39 = puVar34 + (longlong)*(int *)(lVar43 + 0x1420) * 4;
  uVar45 = (longlong)*(int *)(lVar43 + 0x1420);
  while (uVar25 = uVar45, uVar25 != 0) {
    uVar45 = uVar25 >> 1;
    if (puVar34[uVar45 * 4] < ~uVar27) {
      puVar34 = puVar34 + uVar45 * 4 + 4;
      uVar45 = ~uVar45 + uVar25;
    }
  }
  if ((((puVar34 == puVar39) || (*puVar34 != ~uVar27)) || (*(longlong *)(puVar34 + 2) == 0)) ||
     (*(char *)(lVar43 + 0xfc) == '\0')) {
    fVar48 = *(float *)(lVar43 + 0xd94);
    fVar49 = *(float *)(lVar43 + 0xd98);
    fVar8 = *(float *)(lVar43 + 0xd9c);
    fVar9 = *(float *)(lVar43 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar43 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar43 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar43 + 0xda0);
    iVar36 = *(int *)(lVar43 + 0x1ef0);
    if (iVar36 == *(int *)(lVar43 + 0x1ef4)) {
      if (iVar36 == 0) {
        iVar32 = 8;
      }
      else {
        iVar32 = iVar36 / 2 + iVar36;
      }
      iVar42 = iVar36 + 1;
      if (iVar36 + 1 < iVar32) {
        iVar42 = iVar32;
      }
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar42 * 0x14,_DAT_7ff70cc1a3d0);
      lVar29 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar40 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar40 * 8) == *piVar2) {
          sVar31 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar40 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar40 = (longlong)iVar36;
          *(int *)(lVar29 + 0x2874 + lVar40 * 8) = *piVar2;
          *(undefined4 *)(lVar29 + 0x2878 + lVar40 * 8) = 0;
          sVar31 = 1;
        }
        *(short *)(lVar29 + 0x2878 + lVar40 * 8) = sVar31;
        *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar43 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar43 + 0x1ef8),
                         (longlong)*(int *)(lVar43 + 0x1ef0) * 0x14);
        lVar40 = _DAT_7ff70cc1a3c0;
        lVar29 = *(longlong *)(lVar43 + 0x1ef8);
        if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
            sVar31 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar47 = (longlong)iVar36;
            *(int *)(lVar40 + 0x2874 + lVar47 * 8) = *piVar2;
            *(undefined4 *)(lVar40 + 0x2878 + lVar47 * 8) = 0;
            sVar31 = 1;
          }
          *(short *)(lVar40 + 0x287a + lVar47 * 8) = sVar31;
          *(int *)(lVar40 + 0x286c) = *(int *)(lVar40 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar43 + 0x1ef8) = lVar30;
      *(int *)(lVar43 + 0x1ef4) = iVar42;
      iVar36 = *(int *)(lVar43 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar43 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar36 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar30 + 4 + (longlong)iVar36 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar43 + 0x1ef0) = *(int *)(lVar43 + 0x1ef0) + 1;
    if (*(int *)(lVar43 + 0x1eec) != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar8) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar9) * _UNK_7ff70cb1d64c;
      *(float *)(lVar43 + 0xd94) = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      *(float *)(lVar43 + 0xd98) = fVar50 + fVar49;
      *(float *)(lVar43 + 0xd9c) = fVar51 + fVar8;
      *(float *)(lVar43 + 0xda0) = fVar52 + fVar9;
    }
  }
  else {
    cVar26 = *(char *)(*(longlong *)(puVar34 + 2) + 0xcd);
    fVar48 = *(float *)(lVar43 + 0xd94);
    fVar49 = *(float *)(lVar43 + 0xd98);
    fVar8 = *(float *)(lVar43 + 0xd9c);
    fVar9 = *(float *)(lVar43 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar43 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar43 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar43 + 0xda0);
    iVar36 = *(int *)(lVar43 + 0x1ef0);
    if (iVar36 == *(int *)(lVar43 + 0x1ef4)) {
      if (iVar36 == 0) {
        iVar32 = 8;
      }
      else {
        iVar32 = iVar36 / 2 + iVar36;
      }
      iVar42 = iVar36 + 1;
      if (iVar36 + 1 < iVar32) {
        iVar42 = iVar32;
      }
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar42 * 0x14,_DAT_7ff70cc1a3d0);
      lVar29 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar40 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar40 * 8) == *piVar2) {
          sVar31 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar40 * 8) + 1;
        }
        else {
          iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
          lVar40 = (longlong)iVar36;
          *(int *)(lVar29 + 0x2874 + lVar40 * 8) = *piVar2;
          *(undefined4 *)(lVar29 + 0x2878 + lVar40 * 8) = 0;
          sVar31 = 1;
        }
        *(short *)(lVar29 + 0x2878 + lVar40 * 8) = sVar31;
        *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar43 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar43 + 0x1ef8),
                         (longlong)*(int *)(lVar43 + 0x1ef0) * 0x14);
        lVar40 = _DAT_7ff70cc1a3c0;
        lVar29 = *(longlong *)(lVar43 + 0x1ef8);
        if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
            sVar31 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
          }
          else {
            iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
            lVar47 = (longlong)iVar36;
            *(int *)(lVar40 + 0x2874 + lVar47 * 8) = *piVar2;
            *(undefined4 *)(lVar40 + 0x2878 + lVar47 * 8) = 0;
            sVar31 = 1;
          }
          *(short *)(lVar40 + 0x287a + lVar47 * 8) = sVar31;
          *(int *)(lVar40 + 0x286c) = *(int *)(lVar40 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar43 + 0x1ef8) = lVar30;
      *(int *)(lVar43 + 0x1ef4) = iVar42;
      iVar36 = *(int *)(lVar43 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar43 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar36 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar30 + 4 + (longlong)iVar36 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar43 + 0x1ef0) = *(int *)(lVar43 + 0x1ef0) + 1;
    if (*(int *)(lVar43 + 0x1eec) != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar8) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar9) * _UNK_7ff70cb1d64c;
      *(float *)(lVar43 + 0xd94) = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      *(float *)(lVar43 + 0xd98) = fVar50 + fVar49;
      *(float *)(lVar43 + 0xd9c) = fVar51 + fVar8;
      *(float *)(lVar43 + 0xda0) = fVar52 + fVar9;
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    if (cVar26 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar30 + 0x1e80) = *(undefined8 *)(lVar43 + 0x2780);
      *(undefined8 *)(lVar30 + 0x1e88) = 0;
      *(undefined4 *)(lVar30 + 0x1e74) = 1;
    }
  }
  cVar26 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar26 != '\0') {
    if (*(short *)(*(longlong *)(lVar43 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar47 = _DAT_7ff70cc1a3c0;
      lVar30 = *(longlong *)(lVar43 + 0x1440);
      lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar36 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar40 = *(longlong *)(lVar29 + -8 + (longlong)iVar36 * 8);
      if (((lVar40 != lVar30) && (1 < iVar36)) && (*(longlong *)(lVar40 + 0x3c0) != lVar30)) {
        uVar45 = (ulonglong)(iVar36 - 1);
        iVar36 = 1;
        do {
          uVar27 = (int)uVar45 - 1;
          uVar45 = (ulonglong)uVar27;
          if (*(longlong *)(lVar29 + uVar45 * 8) == lVar30) {
            FUN_7ff70cb12b70(lVar29 + uVar45 * 8,lVar29 + uVar45 * 8 + 8,(longlong)iVar36 << 3);
            *(longlong *)
             (*(longlong *)(lVar47 + 0x13e8) + -8 + (longlong)*(int *)(lVar47 + 0x13e0) * 8) =
                 lVar30;
            lVar30 = *(longlong *)(lVar43 + 0x1440);
            break;
          }
          iVar36 = iVar36 + 1;
        } while (0 < (int)uVar27);
      }
      lVar40 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar29 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar30)
      {
        iVar32 = (int)*(short *)(lVar30 + 0xe2);
        lVar28 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar36 = (int)lVar28;
        lVar47 = lVar28;
        if (iVar36 - iVar32 != 0 && iVar32 <= iVar36) {
          lVar46 = (longlong)iVar32;
          lVar47 = (longlong)iVar36;
          lVar29 = lVar46;
          if ((iVar36 - iVar32 & 1U) != 0) {
            lVar29 = lVar46 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar46 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar46 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar40 + 0x13f8) + lVar46 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar47 + -1 != lVar46) {
            do {
              *(undefined8 *)(*(longlong *)(lVar40 + 0x13f8) + lVar29 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar40 + 0x13f8) + 8 + lVar29 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar40 + 0x13f8) + lVar29 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar40 + 0x13f8) + 8 + lVar29 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar40 + 0x13f8) + 0x10 + lVar29 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar40 + 0x13f8) + 8 + lVar29 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar29 = lVar29 + 2;
            } while (lVar47 != lVar29);
          }
          lVar29 = *(longlong *)(lVar40 + 0x13f8);
        }
        *(longlong *)(lVar29 + lVar47 * 8) = lVar30;
        *(short *)(lVar30 + 0xe2) = (short)lVar28;
      }
      *(undefined8 *)(lVar43 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
    else {
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
    if (iVar36 < 0x14) {
      if (lVar44 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9015c);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar44 + 8),&UNK_7ff70cb9015c);
        lVar43 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar44 + 0xd5) != '\x01') || (*(char *)(lVar44 + 0xcd) == '\x01')) {
          lVar30 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar29 = *(longlong *)(lVar30 + 0x50);
          if (lVar29 == 0) {
            lVar29 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar40 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
                sVar31 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar47 * 8) + 1;
              }
              else {
                iVar36 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar36;
                lVar47 = (longlong)iVar36;
                *(int *)(lVar40 + 0x2874 + lVar47 * 8) = *piVar2;
                *(undefined4 *)(lVar40 + 0x2878 + lVar47 * 8) = 0;
                sVar31 = 1;
              }
              *(short *)(lVar40 + 0x2878 + lVar47 * 8) = sVar31;
              *(int *)(lVar40 + 0x2868) = *(int *)(lVar40 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar29,lVar43 + 0x1148);
            *(undefined **)(lVar29 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar30 + 0x50) = lVar29;
          }
          if (*(int *)(lVar30 + 0x44) != *(int *)(lVar43 + 5000)) {
            FUN_7ff70c7b6160(lVar29);
            lVar40 = *(longlong *)(lVar43 + 0x40);
            uStack_68 = *(undefined8 *)(lVar40 + 0x28);
            uStack_60 = *(undefined4 *)(lVar40 + 0x30);
            uStack_5c = *(undefined4 *)(lVar40 + 0x34);
            FUN_7ff70c7b8300(lVar29,&uStack_68);
            lStack_50 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar30 + 0x10) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar30 + 8) >> 0x20),
                                 (float)*(undefined8 *)(lVar30 + 0x10) +
                                 (float)*(undefined8 *)(lVar30 + 8));
            FUN_7ff70c7b7c50(lVar29,lVar30 + 8,&lStack_50,0);
            *(undefined4 *)(lVar30 + 0x44) = *(undefined4 *)(lVar43 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar44 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar44 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar44 + 0x30) +
                               (float)*(undefined8 *)(lVar44 + 0x28));
          FUN_7ff70c7bd870(lVar29,lVar44 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar36 = *(int *)(lVar7 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar36 = *(int *)(lVar7 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar36 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar7 + 0x278c) = *(int *)(lVar7 + 0x278c) + 1;
  pcVar6 = *(code **)(lVar7 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar6 != (code *)0x0) {
    (*pcVar6)(lVar7,*(undefined8 *)(lVar7 + 0x2778),&UNK_7ff70cb9015c);
  }
  return (ulonglong)*(byte *)(lVar7 + 0x7d);
}


