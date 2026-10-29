/* 7ff70c80a7b0 FUN_7ff70c80a7b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80a7b0(uint param_1)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  byte bVar5;
  undefined1 uVar6;
  code *pcVar7;
  undefined4 uVar8;
  undefined4 uVar9;
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
  uint uVar22;
  longlong lVar23;
  char cVar24;
  undefined8 uVar25;
  longlong lVar26;
  undefined4 uVar27;
  longlong lVar28;
  longlong lVar29;
  bool bVar30;
  uint uVar31;
  undefined *puVar32;
  longlong lVar33;
  longlong lVar34;
  int iVar35;
  float fVar36;
  float fVar37;
  undefined1 auStack_78 [32];
  undefined4 uStack_58;
  undefined4 uStack_50;
  undefined4 uStack_48;
  undefined8 uStack_40;
  ulonglong uStack_38;
  
  lVar23 = _DAT_7ff70cc1a3c0;
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  uVar31 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
  if ((int)param_1 <= (int)*(uint *)(_DAT_7ff70cc1a3c0 + 0x1ef0)) goto LAB_7ff70c80a825;
  lVar34 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
        goto LAB_7ff70c80a934;
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                       *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
      bVar5 = *(byte *)(lVar23 + 0x27b4);
    }
    else {
LAB_7ff70c80a934:
      bVar5 = *(byte *)(lVar23 + 0x27b4);
    }
    if ((bVar5 & 1) != 0) {
      if (lVar34 == 0) {
        puVar32 = &UNK_7ff70cb8a129;
      }
      else {
        puVar32 = *(undefined **)(lVar34 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar32,&UNK_7ff70cb9006f);
      *(undefined1 *)(lVar23 + 0x2788) = 0;
      cVar24 = *(char *)(lVar23 + 0x7f);
      goto joined_r0x7ff70c80a9aa;
    }
    *(int *)(lVar23 + 0x27e0) = *(int *)(lVar23 + 0x27e0) + 1;
    *(undefined1 *)(lVar23 + 0x2788) = 0;
    if (*(char *)(lVar23 + 0x7f) == '\x01') goto LAB_7ff70c80a9b0;
LAB_7ff70c80a7fe:
    pcVar7 = *(code **)(lVar23 + 0x2770);
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar24 = *(char *)(lVar23 + 0x7f);
joined_r0x7ff70c80a9aa:
    if (cVar24 != '\x01') goto LAB_7ff70c80a7fe;
LAB_7ff70c80a9b0:
    if ((*(char *)(lVar23 + 0x1398) == '\x01') && (cVar24 = FUN_7ff70c849860(), cVar24 != '\0')) {
      iVar35 = *(int *)(lVar23 + 0x278c);
      if (iVar35 < 0x14) {
        if (lVar34 == 0) {
          FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9006f);
        }
        else {
          FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar34 + 8),&UNK_7ff70cb9006f);
          if ((*(char *)(lVar34 + 0xd5) != '\x01') || (*(char *)(lVar34 + 0xcd) == '\x01')) {
            uVar25 = FUN_7ff70c8738c0(lVar34);
            uStack_40 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar34 + 0x30) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar34 + 0x28) >> 0x20),
                                 (float)*(undefined8 *)(lVar34 + 0x30) +
                                 (float)*(undefined8 *)(lVar34 + 0x28));
            uStack_48 = 0x3f800000;
            uStack_50 = 0;
            uStack_58 = 0;
            FUN_7ff70c7bd870(uVar25,lVar34 + 0x28,&uStack_40,0xff0000ff);
          }
        }
        iVar35 = *(int *)(lVar23 + 0x278c);
      }
      if (iVar35 == 0x14) {
        FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
      }
      lVar28 = _DAT_7ff70cc1a3c0;
      lVar34 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      if (((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) < 2) &&
         (*(char *)(_DAT_7ff70cc1a3c0 + 0x1399) == '\x01')) {
        FUN_7ff70c80af70(&UNK_7ff70cb9015c);
      }
      else {
        lVar33 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) * 0x78 +
                 *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418);
        if (((*(byte *)(lVar34 + 0x17) & 1) != 0) &&
           (*(int *)(_DAT_7ff70cc1a3c0 + 0x1394) != *(int *)(lVar34 + 0x10))) {
          FUN_7ff70c80af70(&UNK_7ff70cb9067f);
        }
        if (*(longlong *)(lVar34 + 0x1c8) != 0) {
          FUN_7ff70c912b60();
        }
        lVar29 = _DAT_7ff70cc1a3c0;
        if (*(char *)(lVar34 + 0xd2) == '\0') {
          *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
          lVar29 = *(longlong *)(lVar29 + 0x1440);
          FUN_7ff70c7b8130(*(undefined8 *)(lVar29 + 0x2c8));
          puVar2 = (undefined4 *)
                   (*(longlong *)(*(longlong *)(lVar29 + 0x2c8) + 0xa8) + -0x10 +
                   (longlong)*(int *)(*(longlong *)(lVar29 + 0x2c8) + 0xa0) * 0x10);
          uVar27 = puVar2[1];
          uVar8 = puVar2[2];
          uVar9 = puVar2[3];
          *(undefined4 *)(lVar29 + 0x260) = *puVar2;
          *(undefined4 *)(lVar29 + 0x264) = uVar27;
          *(undefined4 *)(lVar29 + 0x268) = uVar8;
          *(undefined4 *)(lVar29 + 0x26c) = uVar9;
        }
        lVar29 = _DAT_7ff70cc1a3c0;
        iVar35 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20);
        if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x27a8) + 0xc) < iVar35) {
          *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20) = iVar35 + -1;
          if (iVar35 + -1 == 0) {
            uVar27 = 0;
          }
          else {
            uVar27 = *(undefined4 *)(*(longlong *)(lVar29 + 0x1f28) + -0x10 + (longlong)iVar35 * 8);
          }
          *(undefined4 *)(lVar29 + 0x1ddc) = uVar27;
        }
        else {
          FUN_7ff70c80af70(&UNK_7ff70cb90134);
        }
        if ((*(char *)(lVar33 + -10) == '\x01') && (*(longlong *)(lVar34 + 0x3c0) == lVar34)) {
          FUN_7ff70c83ae80();
        }
        if (*(char *)(lVar34 + 0xd2) == '\x01') {
          *(longlong *)(lVar34 + 0x2c8) = lVar34 + 0x2d0;
          if (*(longlong *)(lVar28 + 0x2728) != lVar34) goto LAB_7ff70c80abbc;
LAB_7ff70c80abdf:
          FUN_7ff70c83af10();
          cVar24 = *(char *)(lVar34 + 0x159);
        }
        else {
          if (*(longlong *)(lVar28 + 0x2728) == lVar34) goto LAB_7ff70c80abdf;
LAB_7ff70c80abbc:
          cVar24 = *(char *)(lVar34 + 0x159);
        }
        if (cVar24 == '\x01') {
          lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
          *(undefined1 *)(lVar29 + 0x159) = 0;
          if (((*(float *)(lVar29 + 0x130) < *(float *)(lVar29 + 0x118)) ||
              (*(float *)(lVar29 + 0x134) < *(float *)(lVar29 + 0x11c))) &&
             (*(char *)(lVar29 + 0xd1) == '\0')) {
            FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
          }
        }
        uVar25 = *(undefined8 *)(lVar33 + -0x28);
        *(undefined8 *)(lVar28 + 0x1e60) = *(undefined8 *)(lVar33 + -0x30);
        *(undefined8 *)(lVar28 + 0x1e68) = uVar25;
        uVar27 = *(undefined4 *)(lVar33 + -0x70);
        uVar8 = *(undefined4 *)(lVar33 + -0x6c);
        uVar9 = *(undefined4 *)(lVar33 + -0x68);
        uVar10 = *(undefined4 *)(lVar33 + -100);
        uVar11 = *(undefined4 *)(lVar33 + -0x60);
        uVar12 = *(undefined4 *)(lVar33 + -0x5c);
        uVar13 = *(undefined4 *)(lVar33 + -0x58);
        uVar14 = *(undefined4 *)(lVar33 + -0x54);
        uVar15 = *(undefined4 *)(lVar33 + -0x50);
        uVar16 = *(undefined4 *)(lVar33 + -0x4c);
        uVar17 = *(undefined4 *)(lVar33 + -0x48);
        uVar18 = *(undefined4 *)(lVar33 + -0x44);
        uVar19 = *(undefined4 *)(lVar33 + -0x3c);
        uVar20 = *(undefined4 *)(lVar33 + -0x38);
        uVar21 = *(undefined4 *)(lVar33 + -0x34);
        *(undefined4 *)(lVar28 + 0x1e50) = *(undefined4 *)(lVar33 + -0x40);
        *(undefined4 *)(lVar28 + 0x1e54) = uVar19;
        *(undefined4 *)(lVar28 + 0x1e58) = uVar20;
        *(undefined4 *)(lVar28 + 0x1e5c) = uVar21;
        *(undefined4 *)(lVar28 + 0x1e40) = uVar15;
        *(undefined4 *)(lVar28 + 0x1e44) = uVar16;
        *(undefined4 *)(lVar28 + 0x1e48) = uVar17;
        *(undefined4 *)(lVar28 + 0x1e4c) = uVar18;
        *(undefined4 *)(lVar28 + 0x1e30) = uVar11;
        *(undefined4 *)(lVar28 + 0x1e34) = uVar12;
        *(undefined4 *)(lVar28 + 0x1e38) = uVar13;
        *(undefined4 *)(lVar28 + 0x1e3c) = uVar14;
        *(undefined4 *)(lVar28 + 0x1e20) = uVar27;
        *(undefined4 *)(lVar28 + 0x1e24) = uVar8;
        *(undefined4 *)(lVar28 + 0x1e28) = uVar9;
        *(undefined4 *)(lVar28 + 0x1e2c) = uVar10;
        if ((*(uint *)(lVar34 + 0x14) & 0x10000000) == 0) {
          if ((*(uint *)(lVar34 + 0x14) & 0x4000000) != 0) goto LAB_7ff70c80ad2a;
LAB_7ff70c80ac8b:
          cVar24 = *(char *)(lVar28 + 0x7c);
        }
        else {
          *(int *)(lVar28 + 0x2510) = *(int *)(lVar28 + 0x2510) + -1;
          if ((*(uint *)(lVar34 + 0x14) & 0x4000000) == 0) goto LAB_7ff70c80ac8b;
LAB_7ff70c80ad2a:
          *(int *)(lVar28 + 0x1f60) = *(int *)(lVar28 + 0x1f60) + -1;
          cVar24 = *(char *)(lVar28 + 0x7c);
        }
        if (cVar24 == '\x01') {
          FUN_7ff70c83b170(lVar33 + -0x20);
        }
        lVar33 = (longlong)*(int *)(lVar28 + 0x1410) + -1;
        iVar35 = (int)lVar33;
        *(int *)(lVar28 + 0x1410) = iVar35;
        lVar34 = _DAT_7ff70cc1a3c0;
        if (iVar35 == 0) {
          *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1440) = 0;
        }
        else {
          lVar28 = *(longlong *)(*(longlong *)(lVar28 + 0x1418) + -0x78 + lVar33 * 0x78);
          *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) = lVar28;
          if (lVar28 != 0) {
            *(longlong *)(lVar34 + 0x27a8) =
                 *(longlong *)(lVar34 + 0x1418) + (longlong)*(int *)(lVar34 + 0x1410) * 0x78 + -0x20
            ;
            if ((longlong)*(int *)(lVar28 + 0x1d0) == -1) {
              lVar33 = 0;
            }
            else {
              lVar33 = (longlong)*(int *)(lVar28 + 0x1d0) * 0x250 + *(longlong *)(lVar34 + 0x22a0);
            }
            *(longlong *)(lVar34 + 0x2278) = lVar33;
            *(undefined4 *)(lVar34 + 0x1140) = 0x3f800000;
            uVar6 = *(undefined1 *)(lVar28 + 0xd1);
            *(undefined1 *)(lVar28 + 0xd1) = 0;
            if ((*(uint *)(lVar34 + 0xc) & 0x10) != 0) {
              fVar36 = *(float *)(*(longlong *)(lVar28 + 0x20) + 0x18);
              if ((fVar36 == 0.0) && (!NAN(fVar36))) {
                fVar36 = *(float *)(lVar34 + 0x18);
              }
              *(float *)(lVar34 + 0x113c) = fVar36;
            }
            lVar33 = *(longlong *)(lVar34 + 0x1440);
            fVar36 = *(float *)(lVar34 + 0x1134);
            *(float *)(lVar34 + 0xc40) = fVar36;
            if (lVar33 == 0) {
              fVar36 = fVar36 * *(float *)(lVar34 + 0xc44) * *(float *)(lVar34 + 0xc48);
LAB_7ff70c80ae29:
              fVar36 = fVar36 * *(float *)(lVar34 + 0xbc0);
              lVar29 = *(longlong *)(lVar34 + 0x1120);
              if (lVar29 != 0) {
                fVar36 = fVar36 * *(float *)(lVar29 + 0x48);
              }
              iVar35 = (int)(fVar36 + _DAT_7ff70cb1ba70);
              fVar37 = _DAT_7ff70cb1ba2c;
              if ((0 < iVar35) &&
                 (fVar36 = (float)(int)(fVar36 + _DAT_7ff70cb1ba70), fVar37 = _DAT_7ff70cb1d620,
                 fVar36 <= _DAT_7ff70cb1d620)) {
                fVar37 = fVar36;
              }
              if (lVar29 == 0) {
                *(float *)(lVar34 + 0x1130) = fVar37;
                *(undefined8 *)(lVar34 + 0x1128) = 0;
                fVar36 = 0.0;
              }
              else {
                if ((*(uint *)(lVar34 + 0xc) & 0x10) != 0) {
                  *(undefined4 *)(lVar29 + 0x14) = *(undefined4 *)(lVar34 + 0x113c);
                  lVar29 = *(longlong *)(lVar34 + 0x1120);
                }
                *(float *)(lVar34 + 0x1130) = fVar37;
                bVar30 = lVar29 == 0 || lVar33 == 0;
                if (bVar30) {
                  lVar26 = 0;
                }
                else {
                  lVar26 = FUN_7ff70c7e5630(lVar29,CONCAT31((int3)((uint)iVar35 >> 8),bVar30),
                                            _DAT_7ff70cb1bae8);
                  lVar29 = *(longlong *)(lVar34 + 0x1120);
                  fVar37 = *(float *)(lVar34 + 0x1130);
                }
                *(longlong *)(lVar34 + 0x1128) = lVar26;
                fVar36 = 0.0;
                if ((lVar33 != 0) && (lVar29 != 0)) {
                  fVar36 = fVar37 / *(float *)(lVar26 + 0x14);
                }
              }
              *(float *)(lVar34 + 0x1138) = fVar36;
              *(float *)(lVar34 + 0x1168) = fVar37;
              *(float *)(lVar34 + 0x116c) = fVar36;
              lVar34 = _DAT_7ff70cc1a3c0;
            }
            else if ((*(char *)(lVar33 + 0xd1) != '\x01') ||
                    ((*(longlong *)(lVar34 + 0x2278) != 0 &&
                     (*(int *)(*(longlong *)(lVar34 + 0x2278) + 0x74) == -1)))) {
              fVar36 = fVar36 * *(float *)(lVar34 + 0xc44) * *(float *)(lVar34 + 0xc48) *
                       *(float *)(lVar33 + 0x2b8);
              goto LAB_7ff70c80ae29;
            }
            *(undefined1 *)(lVar28 + 0xd1) = uVar6;
            if (*(longlong *)(lVar34 + 0x2278) == 0) {
              bVar30 = *(longlong *)(*(longlong *)(lVar34 + 0x1440) + 0x1c8) == 0;
            }
            else {
              bVar30 = false;
            }
            *(bool *)(*(longlong *)(lVar34 + 0x1440) + 0x178) = bVar30;
            goto LAB_7ff70c80af44;
          }
        }
        *(undefined8 *)(lVar34 + 0x27a8) = 0;
        *(undefined8 *)(lVar34 + 0x2278) = 0;
        *(undefined4 *)(lVar34 + 0x1140) = 0x3f800000;
      }
    }
LAB_7ff70c80af44:
    *(int *)(lVar23 + 0x278c) = *(int *)(lVar23 + 0x278c) + 1;
    pcVar7 = *(code **)(lVar23 + 0x2770);
  }
  if (pcVar7 != (code *)0x0) {
    (*pcVar7)(lVar23,*(undefined8 *)(lVar23 + 0x2778),&UNK_7ff70cb9006f);
  }
  param_1 = *(uint *)(lVar23 + 0x1ef0);
  uVar31 = param_1;
LAB_7ff70c80a825:
  if (0 < (int)param_1) {
    lVar34 = lVar23 + 0xd54;
    uVar22 = param_1;
    if ((param_1 & 1) != 0) {
      puVar4 = (undefined4 *)(*(longlong *)(lVar23 + 0x1ef8) + -0x10 + (longlong)(int)uVar31 * 0x14)
      ;
      uVar27 = puVar4[1];
      uVar8 = puVar4[2];
      uVar9 = puVar4[3];
      puVar2 = (undefined4 *)
               (lVar34 + (longlong)
                         *(int *)(*(longlong *)(lVar23 + 0x1ef8) + -0x14 +
                                 (longlong)(int)uVar31 * 0x14) * 0x10);
      *puVar2 = *puVar4;
      puVar2[1] = uVar27;
      puVar2[2] = uVar8;
      puVar2[3] = uVar9;
      uVar31 = *(int *)(lVar23 + 0x1ef0) - 1;
      *(uint *)(lVar23 + 0x1ef0) = uVar31;
      uVar22 = param_1 - 1;
    }
    if (param_1 != 1) {
      iVar35 = uVar22 + 2;
      do {
        puVar3 = (undefined8 *)
                 (*(longlong *)(lVar23 + 0x1ef8) + -0x10 + (longlong)(int)uVar31 * 0x14);
        uVar25 = puVar3[1];
        puVar1 = (undefined8 *)
                 (lVar34 + (longlong)
                           *(int *)(*(longlong *)(lVar23 + 0x1ef8) + -0x14 +
                                   (longlong)(int)uVar31 * 0x14) * 0x10);
        *puVar1 = *puVar3;
        puVar1[1] = uVar25;
        lVar28 = (longlong)*(int *)(lVar23 + 0x1ef0) + -1;
        *(int *)(lVar23 + 0x1ef0) = (int)lVar28;
        puVar4 = (undefined4 *)(*(longlong *)(lVar23 + 0x1ef8) + -0x10 + lVar28 * 0x14);
        uVar27 = puVar4[1];
        uVar8 = puVar4[2];
        uVar9 = puVar4[3];
        puVar2 = (undefined4 *)
                 (lVar34 + (longlong)
                           *(int *)(*(longlong *)(lVar23 + 0x1ef8) + -0x14 + lVar28 * 0x14) * 0x10);
        *puVar2 = *puVar4;
        puVar2[1] = uVar27;
        puVar2[2] = uVar8;
        puVar2[3] = uVar9;
        uVar31 = *(int *)(lVar23 + 0x1ef0) - 1;
        *(uint *)(lVar23 + 0x1ef0) = uVar31;
        iVar35 = iVar35 + -2;
      } while (2 < iVar35);
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar7 = (code *)swi(3);
    (*pcVar7)();
    return;
  }
  return;
}


