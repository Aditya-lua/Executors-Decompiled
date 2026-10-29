/* 7ff70c820ef0 FUN_7ff70c820ef0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c820ef0(char param_1)

{
  int *piVar1;
  uint *puVar2;
  undefined8 *puVar3;
  char cVar4;
  undefined4 uVar5;
  code *pcVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  float fVar10;
  longlong lVar11;
  int iVar12;
  longlong lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  byte bVar16;
  short sVar17;
  ulonglong uVar18;
  uint uVar19;
  uint uVar20;
  longlong lVar21;
  undefined *puVar22;
  int iVar23;
  ulonglong uVar24;
  longlong lVar25;
  undefined *puVar26;
  longlong lVar27;
  undefined *puVar28;
  uint uVar29;
  uint uVar30;
  int iVar31;
  ulonglong uVar32;
  undefined4 *puVar33;
  longlong lVar34;
  ulonglong uVar35;
  bool bVar36;
  float fVar37;
  float fVar38;
  undefined1 auStack_d8 [32];
  undefined8 uStack_b8;
  byte bStack_a2;
  char cStack_a1;
  undefined4 uStack_a0;
  uint uStack_9c;
  uint uStack_98;
  uint uStack_94;
  undefined8 uStack_90;
  ulonglong uStack_88;
  ulonglong uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined4 uStack_68;
  ulonglong uStack_60;
  
  lVar11 = _DAT_7ff70cc1a3c0;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  if (param_1 == '\0') {
    uStack_a0 = 0;
  }
  else {
    uStack_a0 = (undefined4)
                CONCAT71((int7)((_DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8) >> 8),
                         *(int *)(_DAT_7ff70cc1a3c0 + 0x29a8) == 1);
  }
  uStack_78 = 0;
  uStack_70 = 0;
  uStack_68 = 0;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x13b8) < 1) {
LAB_7ff70c821a14:
    uVar20 = *(uint *)(lVar11 + 0x13b8);
    uVar19 = 0;
  }
  else {
    bStack_a2 = (byte)uStack_a0 ^ 1;
    uVar24 = 0;
    lVar34 = 0;
    uVar35 = 0;
    uVar32 = 0;
    uStack_90 = 0;
    uStack_98 = 0;
    uVar20 = 0;
    uStack_9c = 0;
    cStack_a1 = param_1;
    do {
      lVar13 = *(longlong *)(lVar11 + 0x13c0);
      switch(*(undefined4 *)(lVar13 + lVar34)) {
      case 1:
        if (*(char *)(lVar11 + 0xb3) == '\0') {
          if ((param_1 != '\0') &&
             (((((byte)uVar32 | (byte)uStack_90) & 1) != 0 || uStack_9c != 0 || ((uVar20 & 1) != 0))
             )) goto code_r0x7ff70c821546;
          *(undefined8 *)(lVar11 + 0xe0) = *(undefined8 *)(lVar13 + 0xc + lVar34);
          *(undefined4 *)(lVar11 + 0xf8) = *(undefined4 *)(lVar13 + 0x14 + lVar34);
          uVar35 = CONCAT71((int7)(uVar35 >> 8),1);
        }
        break;
      case 2:
        if ((param_1 != '\0') && (uStack_9c != 0 || (uVar35 & 1) != 0)) {
code_r0x7ff70c821546:
          if (uVar24 == 0) goto LAB_7ff70c821a14;
          goto LAB_7ff70c82154f;
        }
        *(float *)(lVar11 + 0xf4) = *(float *)(lVar13 + 0xc + lVar34) + *(float *)(lVar11 + 0xf4);
        *(float *)(lVar11 + 0xf0) = *(float *)(lVar13 + 0x10 + lVar34) + *(float *)(lVar11 + 0xf0);
        *(undefined4 *)(lVar11 + 0xf8) = *(undefined4 *)(lVar13 + 0x14 + lVar34);
        uVar32 = CONCAT71((int7)(uVar32 >> 8),1);
        break;
      case 3:
        iVar31 = *(int *)(lVar13 + 0xc + lVar34);
        uVar19 = 1 << ((byte)iVar31 & 0x1f);
        if ((param_1 != '\0') &&
           ((((uStack_9c & uVar19) != 0 || ((uVar32 & 1) != 0)) ||
            ((*(int *)(lVar13 + 0x14 + lVar34) == 1 & (byte)uVar35) != 0))))
        goto code_r0x7ff70c821546;
        *(undefined1 *)(lVar11 + 0xe8 + (longlong)iVar31) = *(undefined1 *)(lVar13 + 0x10 + lVar34);
        *(undefined4 *)(lVar11 + 0xf8) = *(undefined4 *)(lVar13 + 0x14 + lVar34);
        uStack_9c = uStack_9c | uVar19;
        break;
      case 4:
        if ((*(byte *)(lVar11 + 8) & 0x40) == 0) {
          uVar19 = *(uint *)(lVar13 + 0xc + lVar34);
          uVar29 = uVar19;
          if (POPCOUNT(uVar19) == 1 && (uVar19 & 0xf000) != 0) {
            uVar30 = 0;
            for (; (uVar29 & 1) == 0; uVar29 = uVar29 >> 1 | 0x80000000) {
              uVar30 = uVar30 + 1;
            }
            uVar29 = uVar30 + 0x28b;
            if ((uVar30 & 0x1c) != 0xc) {
              uVar29 = uVar19;
            }
          }
          lVar27 = (longlong)(int)uVar29 * 0x10;
          uVar18 = (ulonglong)((_DAT_7ff70cc1a3c0 + lVar27 + -0x1efc) - (lVar11 + 0x104)) >> 4;
          bVar16 = (byte)uVar18;
          iVar31 = (int)uVar18 >> 5;
          if (((param_1 != '\0') &&
              (*(char *)(_DAT_7ff70cc1a3c0 + lVar27 + -0x1efc) != *(char *)(lVar13 + 0x10 + lVar34))
              ) && ((1 << (bVar16 & 0x1f) & *(uint *)((longlong)&uStack_78 + (longlong)iVar31 * 4))
                    != 0 || uStack_9c != 0)) goto code_r0x7ff70c821546;
          uVar29 = 0;
          if (*(char *)(_DAT_7ff70cc1a3c0 + 0xa74) == '\x01') {
            uVar29 = (uint)(*(char *)(_DAT_7ff70cc1a3c0 + 0x1c50) == '\0') << 0xc;
          }
          uVar30 = uVar29;
          if ((*(char *)(_DAT_7ff70cc1a3c0 + 0xa94) == '\x01') &&
             (uVar30 = uVar29 + 0x4000, *(char *)(_DAT_7ff70cc1a3c0 + 0x1c68) != '\0')) {
            uVar30 = uVar29;
          }
          if (((uVar30 | uVar19 & 0x5000) == 0x1000) ||
             (((((uVar30 | uVar19) & 0x1000) != 0 && (*(char *)(_DAT_7ff70cc1a3c0 + 0x59) != '\0'))
              || ((uVar19 & 0xffff0fff) == 0)))) {
            bVar36 = false;
code_r0x7ff70c8212a7:
            if ((byte)((byte)uStack_a0 & (byte)uVar20) != 0) goto code_r0x7ff70c821546;
          }
          else {
            bVar36 = (*(uint *)(_DAT_7ff70cc1a3c0 + 0x1520 +
                               (longlong)((int)((uVar19 & 0xffff0fff) - 0x200) >> 5) * 4) >>
                      (uVar19 & 0x1f) & 1) != 0;
            if (!bVar36) goto code_r0x7ff70c8212a7;
          }
          cVar4 = *(char *)(lVar13 + 0x10 + lVar34);
          if (*(char *)(_DAT_7ff70cc1a3c0 + lVar27 + -0x1efc) != cVar4) {
            puVar2 = (uint *)((longlong)&uStack_78 + (longlong)iVar31 * 4);
            *puVar2 = *puVar2 | 1 << (bVar16 & 0x1f);
            uVar19 = uStack_98 & 0xff;
            uStack_98 = 1;
            if (bStack_a2 != 0) {
              uStack_98 = uVar19;
            }
            if (bVar36) {
              uStack_98 = uVar19;
            }
            uStack_90 = 1;
          }
          lVar27 = _DAT_7ff70cc1a3c0 + lVar27;
          *(char *)(lVar27 + -0x1efc) = cVar4;
          *(undefined4 *)(lVar27 + -0x1ef0) = *(undefined4 *)(lVar13 + 0x14 + lVar34);
        }
        break;
      case 5:
        if ((*(byte *)(lVar11 + 8) & 0x40) == 0) {
          if (((param_1 != '\0') &&
              (((uStack_9c != 0 || ((uVar35 & 1) != 0)) || ((uVar32 & 1) != 0)))) ||
             (((byte)uStack_98 & (byte)uStack_a0) != 0)) goto code_r0x7ff70c821546;
          uVar19 = *(uint *)(lVar13 + 0xc + lVar34);
          if (0xffff < uVar19) {
            uVar19 = 0xfffd;
          }
          iVar31 = *(int *)(lVar11 + 0xbb0);
          uStack_94 = uVar20;
          uStack_80 = uVar32;
          if (iVar31 == *(int *)(lVar11 + 0xbb4)) {
            if (iVar31 == 0) {
              iVar12 = 8;
            }
            else {
              iVar12 = iVar31 / 2 + iVar31;
            }
            iVar23 = iVar31 + 1;
            if (iVar31 + 1 < iVar12) {
              iVar23 = iVar12;
            }
            uStack_88 = uVar35;
            lVar13 = (*_DAT_7ff70cbe9460)((longlong)iVar23 * 2,_DAT_7ff70cc1a3d0);
            lVar27 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar21 * 8) == *piVar1) {
                sVar17 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar21 * 8) + 1;
              }
              else {
                iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
                lVar21 = (longlong)iVar31;
                *(int *)(lVar27 + 0x2874 + lVar21 * 8) = *piVar1;
                *(undefined4 *)(lVar27 + 0x2878 + lVar21 * 8) = 0;
                sVar17 = 1;
              }
              *(short *)(lVar27 + 0x2878 + lVar21 * 8) = sVar17;
              *(int *)(lVar27 + 0x2868) = *(int *)(lVar27 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar11 + 3000) != 0) {
              FUN_7ff70cb12b60(lVar13,*(longlong *)(lVar11 + 3000),
                               (longlong)*(int *)(lVar11 + 0xbb0) * 2);
              lVar21 = _DAT_7ff70cc1a3c0;
              lVar27 = *(longlong *)(lVar11 + 3000);
              if ((lVar27 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
                  sVar17 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar25 * 8) + 1;
                }
                else {
                  iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
                  lVar25 = (longlong)iVar31;
                  *(int *)(lVar21 + 0x2874 + lVar25 * 8) = *piVar1;
                  *(undefined4 *)(lVar21 + 0x2878 + lVar25 * 8) = 0;
                  sVar17 = 1;
                }
                *(short *)(lVar21 + 0x287a + lVar25 * 8) = sVar17;
                *(int *)(lVar21 + 0x286c) = *(int *)(lVar21 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)(lVar27,_DAT_7ff70cc1a3d0);
            }
            *(longlong *)(lVar11 + 3000) = lVar13;
            *(int *)(lVar11 + 0xbb4) = iVar23;
            iVar31 = *(int *)(lVar11 + 0xbb0);
            uVar35 = uStack_88;
          }
          else {
            lVar13 = *(longlong *)(lVar11 + 3000);
          }
          *(short *)(lVar13 + (longlong)iVar31 * 2) = (short)uVar19;
          *(int *)(lVar11 + 0xbb0) = *(int *)(lVar11 + 0xbb0) + 1;
          uVar32 = uStack_80;
          param_1 = cStack_a1;
          uVar20 = uStack_94 & 0xff;
          if ((char)uStack_a0 != '\0') {
            uVar20 = 1;
          }
        }
        break;
      case 6:
        *(byte *)(lVar11 + 0xbac) = *(byte *)(lVar13 + 0xc + lVar34) ^ 1;
      }
      uVar24 = uVar24 + 1;
      lVar34 = lVar34 + 0x1c;
    } while ((longlong)uVar24 < (longlong)*(int *)(lVar11 + 0x13b8));
LAB_7ff70c82154f:
    uVar19 = (uint)uVar24;
    iVar31 = *(int *)(lVar11 + 0x13c8);
    lVar34 = 0;
    uVar35 = uVar24 & 0xffffffff;
    do {
      puVar33 = (undefined4 *)(*(longlong *)(lVar11 + 0x13c0) + lVar34);
      if (iVar31 == *(int *)(lVar11 + 0x13cc)) {
        if (iVar31 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar31 / 2 + iVar31;
        }
        iVar23 = iVar31 + 1;
        if (iVar31 + 1 < iVar12) {
          iVar23 = iVar12;
        }
        lVar13 = (*_DAT_7ff70cbe9460)((longlong)iVar23 * 0x1c,_DAT_7ff70cc1a3d0);
        lVar27 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar21 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar21 * 8) == *piVar1) {
            sVar17 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar21 * 8) + 1;
          }
          else {
            iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
            lVar21 = (longlong)iVar31;
            *(int *)(lVar27 + 0x2874 + lVar21 * 8) = *piVar1;
            *(undefined4 *)(lVar27 + 0x2878 + lVar21 * 8) = 0;
            sVar17 = 1;
          }
          *(short *)(lVar27 + 0x2878 + lVar21 * 8) = sVar17;
          *(int *)(lVar27 + 0x2868) = *(int *)(lVar27 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar11 + 0x13d0) != 0) {
          FUN_7ff70cb12b60(lVar13,*(longlong *)(lVar11 + 0x13d0),
                           (longlong)*(int *)(lVar11 + 0x13c8) * 0x1c);
          lVar21 = _DAT_7ff70cc1a3c0;
          lVar27 = *(longlong *)(lVar11 + 0x13d0);
          if ((lVar27 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar25 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar25 * 8) == *piVar1) {
              sVar17 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar25 * 8) + 1;
            }
            else {
              iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
              lVar25 = (longlong)iVar31;
              *(int *)(lVar21 + 0x2874 + lVar25 * 8) = *piVar1;
              *(undefined4 *)(lVar21 + 0x2878 + lVar25 * 8) = 0;
              sVar17 = 1;
            }
            *(short *)(lVar21 + 0x287a + lVar25 * 8) = sVar17;
            *(int *)(lVar21 + 0x286c) = *(int *)(lVar21 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar27,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar11 + 0x13d0) = lVar13;
        *(int *)(lVar11 + 0x13cc) = iVar23;
        iVar31 = *(int *)(lVar11 + 0x13c8);
      }
      else {
        lVar13 = *(longlong *)(lVar11 + 0x13d0);
      }
      uVar5 = *puVar33;
      uVar7 = puVar33[1];
      uVar8 = puVar33[2];
      uVar9 = puVar33[3];
      uVar14 = *(undefined8 *)(puVar33 + 5);
      puVar3 = (undefined8 *)(lVar13 + 0xc + (longlong)iVar31 * 0x1c);
      *puVar3 = *(undefined8 *)(puVar33 + 3);
      puVar3[1] = uVar14;
      puVar33 = (undefined4 *)(lVar13 + (longlong)iVar31 * 0x1c);
      *puVar33 = uVar5;
      puVar33[1] = uVar7;
      puVar33[2] = uVar8;
      puVar33[3] = uVar9;
      iVar31 = *(int *)(lVar11 + 0x13c8) + 1;
      *(int *)(lVar11 + 0x13c8) = iVar31;
      fVar10 = _DAT_7ff70cb1d570;
      lVar34 = lVar34 + 0x1c;
      uVar35 = uVar35 - 1;
    } while (uVar35 != 0);
    uVar20 = *(uint *)(lVar11 + 0x13b8);
    if ((0 < (int)uVar20 & *(byte *)(lVar11 + 0x27b4) >> 7) == 1) {
      lVar34 = 0x14;
      uVar35 = 0;
      do {
        puVar22 = &UNK_7ff70cb85953;
        if (uVar35 < (uVar24 & 0xffffffff)) {
          puVar22 = &UNK_7ff70cb87f7d;
        }
        lVar13 = *(longlong *)(lVar11 + 0x13c0);
        switch(*(undefined4 *)(lVar13 + -0x14 + lVar34)) {
        case 1:
          fVar37 = *(float *)(lVar13 + -8 + lVar34);
          if (fVar37 == fVar10) {
            fVar38 = *(float *)(lVar13 + -4 + lVar34);
            if ((fVar38 == fVar10) && (!NAN(fVar38) && !NAN(fVar10))) {
              if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
                FUN_7ff70c800cf0(&UNK_7ff70cb91a18,puVar22);
              }
              break;
            }
          }
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            uStack_b8 = *(undefined8 *)(&UNK_7ff70cb1d1c0 + (longlong)*(int *)(lVar13 + lVar34) * 8)
            ;
            fVar38 = *(float *)(lVar13 + -4 + lVar34);
            puVar28 = &UNK_7ff70cb918ed;
code_r0x7ff70c821a00:
            FUN_7ff70c800cf0(puVar28,puVar22,(double)fVar37,(double)fVar38);
          }
          break;
        case 2:
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            uStack_b8 = *(undefined8 *)(&UNK_7ff70cb1d1c0 + (longlong)*(int *)(lVar13 + lVar34) * 8)
            ;
            fVar37 = *(float *)(lVar13 + -8 + lVar34);
            fVar38 = *(float *)(lVar13 + -4 + lVar34);
            puVar28 = &UNK_7ff70cb918c6;
            goto code_r0x7ff70c821a00;
          }
          break;
        case 3:
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            uStack_b8 = *(undefined8 *)(&UNK_7ff70cb1d1c0 + (longlong)*(int *)(lVar13 + lVar34) * 8)
            ;
            puVar28 = &UNK_7ff70cb83ff2;
            if (*(char *)(lVar13 + -4 + lVar34) != '\0') {
              puVar28 = &UNK_7ff70cb841b3;
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb918a5,puVar22,*(undefined4 *)(lVar13 + -8 + lVar34),puVar28
                            );
          }
          break;
        case 4:
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            puVar28 = &UNK_7ff70cb83ff2;
            if (*(char *)(lVar13 + -4 + lVar34) != '\0') {
              puVar28 = &UNK_7ff70cb841b3;
            }
            uVar20 = *(uint *)(lVar13 + -8 + lVar34);
            puVar26 = &UNK_7ff70cb86ac2;
            if (uVar20 != 0) {
              uVar29 = uVar20;
              if ((uVar20 & uVar20 - 1) == 0 && (uVar20 & 0xf000) != 0) {
                uVar30 = 0;
                for (; (uVar29 & 1) == 0; uVar29 = uVar29 >> 1 | 0x80000000) {
                  uVar30 = uVar30 + 1;
                }
                uVar29 = uVar30 + 0x28b;
                if ((uVar30 & 0x1c) != 0xc) {
                  uVar29 = uVar20;
                }
              }
              puVar26 = &UNK_7ff70cb84132;
              if (uVar29 - 0x200 < 0x9b) {
                puVar26 = *(undefined **)(&UNK_7ff70cb1b940 + (ulonglong)uVar29 * 8);
              }
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb90f48,puVar22,puVar26,puVar28);
          }
          break;
        case 5:
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            uVar5 = *(undefined4 *)(lVar13 + -8 + lVar34);
            FUN_7ff70c800cf0(&UNK_7ff70cb91a80,puVar22,uVar5,uVar5);
          }
          break;
        case 6:
          if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 0x80) != 0) {
            FUN_7ff70c800cf0(&UNK_7ff70cb913b4,puVar22,*(undefined1 *)(lVar13 + -8 + lVar34));
          }
        }
        uVar35 = uVar35 + 1;
        uVar20 = *(uint *)(lVar11 + 0x13b8);
        lVar34 = lVar34 + 0x1c;
      } while ((longlong)uVar35 < (longlong)(int)uVar20);
    }
  }
  if (uVar19 == uVar20) {
    iVar31 = 0;
    if (*(int *)(lVar11 + 0x13bc) < 0) {
      uVar14 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
      lVar34 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
          sVar17 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
        }
        else {
          iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
          lVar13 = (longlong)iVar31;
          *(int *)(lVar34 + 0x2874 + lVar13 * 8) = *piVar1;
          *(undefined4 *)(lVar34 + 0x2878 + lVar13 * 8) = 0;
          sVar17 = 1;
        }
        *(short *)(lVar34 + 0x2878 + lVar13 * 8) = sVar17;
        *(int *)(lVar34 + 0x2868) = *(int *)(lVar34 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar11 + 0x13c0) != 0) {
        FUN_7ff70cb12b60(uVar14,*(longlong *)(lVar11 + 0x13c0),
                         (longlong)*(int *)(lVar11 + 0x13b8) * 0x1c);
        lVar13 = _DAT_7ff70cc1a3c0;
        lVar34 = *(longlong *)(lVar11 + 0x13c0);
        if ((lVar34 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
            sVar17 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
          }
          else {
            iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
            lVar27 = (longlong)iVar31;
            *(int *)(lVar13 + 0x2874 + lVar27 * 8) = *piVar1;
            *(undefined4 *)(lVar13 + 0x2878 + lVar27 * 8) = 0;
            sVar17 = 1;
          }
          *(short *)(lVar13 + 0x287a + lVar27 * 8) = sVar17;
          *(int *)(lVar13 + 0x286c) = *(int *)(lVar13 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar34,_DAT_7ff70cc1a3d0);
      }
      *(undefined8 *)(lVar11 + 0x13c0) = uVar14;
      *(undefined4 *)(lVar11 + 0x13bc) = 0;
      *(undefined4 *)(lVar11 + 0x13b8) = 0;
      cVar4 = *(char *)(lVar11 + 0xbac);
      uVar14 = _DAT_7ff70cb1d550;
      goto joined_r0x7ff70c821abc;
    }
  }
  else {
    FUN_7ff70cb12b70(*(longlong *)(lVar11 + 0x13c0),
                     (ulonglong)uVar19 * 0x1c + *(longlong *)(lVar11 + 0x13c0),
                     ((longlong)(int)uVar20 - (ulonglong)uVar19) * 0x1c);
    iVar31 = *(int *)(lVar11 + 0x13b8) - uVar19;
  }
  *(int *)(lVar11 + 0x13b8) = iVar31;
  cVar4 = *(char *)(lVar11 + 0xbac);
  uVar14 = _DAT_7ff70cb1d550;
joined_r0x7ff70c821abc:
  _DAT_7ff70cb1d550 = uVar14;
  if (cVar4 == '\x01') {
    lVar34 = *(longlong *)(lVar11 + 0xd8);
    lVar13 = 0x118;
    uVar20 = 0xffffff70;
    while( true ) {
      if (6 < uVar20) {
        *(undefined1 *)(lVar34 + -0x14 + lVar13) = 0;
        *(undefined8 *)(lVar34 + -0x10 + lVar13) = uVar14;
      }
      if (lVar13 == 0xab8) break;
      if (6 < uVar20 + 1) {
        *(undefined1 *)(lVar34 + -4 + lVar13) = 0;
        *(undefined8 *)(lVar34 + lVar13) = uVar14;
      }
      lVar13 = lVar13 + 0x20;
      uVar20 = uVar20 + 2;
    }
    *(undefined8 *)(lVar11 + 0xfc) = 0;
    if (*(int *)(lVar11 + 0xbb4) < 0) {
      uVar15 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
      lVar34 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
          sVar17 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
        }
        else {
          iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
          lVar13 = (longlong)iVar31;
          *(int *)(lVar34 + 0x2874 + lVar13 * 8) = *piVar1;
          *(undefined4 *)(lVar34 + 0x2878 + lVar13 * 8) = 0;
          sVar17 = 1;
        }
        *(short *)(lVar34 + 0x2878 + lVar13 * 8) = sVar17;
        *(int *)(lVar34 + 0x2868) = *(int *)(lVar34 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar11 + 3000) != 0) {
        FUN_7ff70cb12b60(uVar15,*(longlong *)(lVar11 + 3000),(longlong)*(int *)(lVar11 + 0xbb0) * 2)
        ;
        lVar13 = _DAT_7ff70cc1a3c0;
        lVar34 = *(longlong *)(lVar11 + 3000);
        if ((lVar34 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
            sVar17 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
          }
          else {
            iVar31 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar31;
            lVar27 = (longlong)iVar31;
            *(int *)(lVar13 + 0x2874 + lVar27 * 8) = *piVar1;
            *(undefined4 *)(lVar13 + 0x2878 + lVar27 * 8) = 0;
            sVar17 = 1;
          }
          *(short *)(lVar13 + 0x287a + lVar27 * 8) = sVar17;
          *(int *)(lVar13 + 0x286c) = *(int *)(lVar13 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar34,_DAT_7ff70cc1a3d0);
      }
      *(undefined8 *)(lVar11 + 3000) = uVar15;
      *(undefined4 *)(lVar11 + 0xbb4) = 0;
    }
    *(undefined4 *)(lVar11 + 0xbb0) = 0;
    *(undefined1 *)(lVar11 + 0xa04) = 0;
    *(undefined8 *)(lVar11 + 0xa08) = uVar14;
    *(undefined1 *)(lVar11 + 0xa14) = 0;
    *(undefined8 *)(lVar11 + 0xa18) = uVar14;
    *(undefined1 *)(lVar11 + 0xa24) = 0;
    *(undefined8 *)(lVar11 + 0xa28) = uVar14;
    *(undefined1 *)(lVar11 + 0xa34) = 0;
    *(undefined8 *)(lVar11 + 0xa38) = uVar14;
    *(undefined1 *)(lVar11 + 0xa44) = 0;
    *(undefined8 *)(lVar11 + 0xa48) = uVar14;
    *(undefined1 *)(lVar11 + 0xa54) = 0;
    *(undefined8 *)(lVar11 + 0xa58) = uVar14;
    *(undefined1 *)(lVar11 + 0xa64) = 0;
    *(undefined8 *)(lVar11 + 0xa68) = uVar14;
    *(undefined8 *)(lVar11 + 0xe0) = 0xff7fffffff7fffff;
    *(undefined4 *)(lVar11 + 0xe8) = 0;
    *(undefined1 *)(lVar11 + 0xec) = 0;
    uVar9 = _UNK_7ff70cb1d54c;
    uVar8 = _UNK_7ff70cb1d548;
    uVar7 = _UNK_7ff70cb1d544;
    uVar5 = _DAT_7ff70cb1d540;
    *(undefined4 *)(lVar11 + 0xb6c) = _DAT_7ff70cb1d540;
    *(undefined4 *)(lVar11 + 0xb70) = uVar7;
    *(undefined4 *)(lVar11 + 0xb74) = uVar8;
    *(undefined4 *)(lVar11 + 0xb78) = uVar9;
    *(undefined8 *)(lVar11 + 0xb8c) = uVar14;
    *(undefined4 *)(lVar11 + 0xb7c) = uVar5;
    *(undefined4 *)(lVar11 + 0xb80) = uVar7;
    *(undefined4 *)(lVar11 + 0xb84) = uVar8;
    *(undefined4 *)(lVar11 + 0xb88) = uVar9;
    *(undefined8 *)(lVar11 + 0xf0) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_d8);
  pcVar6 = (code *)swi(3);
  (*pcVar6)();
  return;
}


