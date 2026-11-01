
/* WARNING: Type propagation algorithm not settling */

int FUN_00098984(void)

{
  ulong *puVar1;
  char *pcVar2;
  int iVar3;
  ushort uVar4;
  long lVar5;
  short sVar6;
  int *piVar7;
  int *piVar8;
  int *piVar9;
  bool in_ZR;
  bool bVar10;
  short *psVar11;
  int in_w8;
  ulong uVar12;
  int *piVar13;
  int *piVar14;
  short *psVar15;
  int iVar16;
  int *piVar17;
  int *piVar18;
  uint uVar19;
  short *psVar20;
  ulong *puVar21;
  ulong uVar22;
  ulong *puVar23;
  uint uVar24;
  int *unaff_x19;
  ulong uVar25;
  long lVar26;
  uint *unaff_x20;
  long unaff_x21;
  ulong uVar27;
  int *piVar28;
  uint unaff_w23;
  uint unaff_w24;
  int *piVar29;
  uint uVar30;
  short *psVar31;
  ulong *puVar32;
  int iVar33;
  short *unaff_x28;
  long unaff_x29;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  
  iVar33 = (int)unaff_x28;
  if (in_ZR) {
    if ((0xfff < (int)unaff_w23) || (uVar30 = *unaff_x20, 0xfffe < uVar30 + unaff_w23))
    goto LAB_00099be0;
LAB_00099b1c:
    unaff_x20[2] = 0;
    *(undefined8 *)(&UNK_00004008 + unaff_x21) = 0;
    *(undefined8 *)(unaff_x21 + 0x4000) = 0;
    if (uVar30 != 0) {
      if (0x7e000000 < unaff_w23) {
        return 0;
      }
      if (unaff_w23 != 0) {
        uVar12 = (ulong)unaff_w23;
        *unaff_x20 = uVar30 + unaff_w23;
        unaff_x20[1] = 3;
        unaff_x20[2] = unaff_w23;
        piVar18 = unaff_x19;
        if (unaff_w23 < 0xd) {
LAB_00099b6c:
          uVar27 = (long)unaff_x19 + (uVar12 - (long)piVar18);
          uVar25 = uVar27 - 0xf;
          if (uVar27 < 0xf) {
            *(char *)unaff_x28 = (char)((int)uVar27 << 4);
          }
          else {
            psVar11 = (short *)((long)unaff_x28 + 1);
            *(char *)unaff_x28 = -0x10;
            if (0xfe < uVar25) {
              uVar25 = ((*(long *)(unaff_x29 + -0x58) + uVar12) - (long)piVar18) - 0x10e;
              uVar12 = uVar25 / 0xff;
              _memset(psVar11,0xff,uVar12 + 1);
              uVar25 = uVar25 % 0xff;
              psVar11 = (short *)((long)unaff_x28 + uVar12 + 2);
            }
            *(char *)psVar11 = (char)uVar25;
            unaff_x28 = psVar11;
          }
          _memcpy((char *)((long)unaff_x28 + 1),piVar18,uVar27);
          return ((int)(char *)((long)unaff_x28 + 1) + (int)uVar27) - iVar33;
        }
        piVar28 = *(int **)(unaff_x29 + -0x58);
        lVar26 = (long)piVar28 - (ulong)uVar30;
        piVar29 = (int *)((long)unaff_x19 + (uVar12 - 0xb));
        piVar17 = (int *)((long)piVar28 + 2);
        *(short *)(unaff_x21 + (ulong)((uint)(*piVar28 * -0x61c8864f) >> 0x13) * 2) = (short)uVar30;
        puVar32 = (ulong *)((long)unaff_x19 + (uVar12 - 0xc));
        piVar18 = piVar28;
code_r0x0009a79c:
        uVar24 = unaff_w24 << 6 | 1;
        iVar16 = *(int *)((long)piVar18 + 1U);
        piVar14 = (int *)((long)piVar18 + 1U);
        uVar19 = unaff_w24;
        while( true ) {
          lVar5 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
          uVar4 = *(ushort *)(unaff_x21 + lVar5);
          uVar25 = (ulong)uVar4;
          sVar6 = (short)lVar26;
          iVar16 = *piVar17;
          *(short *)(unaff_x21 + lVar5) = (short)piVar14 - sVar6;
          if ((uVar30 <= uVar4) && (*(int *)(lVar26 + uVar25) == *piVar14)) break;
          piVar13 = (int *)((long)piVar17 + (ulong)uVar19);
          uVar19 = uVar24 >> 6;
          uVar24 = uVar24 + 1;
          piVar14 = piVar17;
          piVar17 = piVar13;
          if (piVar29 < piVar13) goto LAB_00099b6c;
        }
        piVar17 = (int *)(lVar26 + uVar25);
        if ((*(int **)(unaff_x29 + -0x58) < piVar17) &&
           (*(char *)((long)piVar14 - 1) == *(char *)((long)piVar17 - 1))) {
          piVar7 = (int *)((long)piVar28 + uVar25 + ~(ulong)uVar30);
          piVar8 = (int *)((long)piVar14 - 1U);
          piVar9 = (int *)((long)piVar14 - 1U);
          do {
            piVar14 = piVar9;
            piVar13 = piVar8;
            piVar17 = piVar7;
            if ((piVar17 <= *(int **)(unaff_x29 + -0x58)) || (piVar13 <= piVar18)) break;
            piVar7 = (int *)((long)piVar17 + -1);
            piVar8 = (int *)((long)piVar13 + -1);
            piVar9 = (int *)((long)piVar14 - 1);
          } while (*(char *)((long)piVar13 + -1) == *(char *)((long)piVar17 + -1));
        }
        else {
          piVar13 = piVar14;
        }
        psVar11 = (short *)((long)unaff_x28 + 1);
        uVar19 = (uint)((long)piVar14 - (long)piVar18);
        uVar24 = uVar19 - 0xf;
        if (uVar19 < 0xf) {
          *(char *)unaff_x28 = (char)(uVar19 << 4);
        }
        else {
          *(char *)unaff_x28 = -0x10;
          psVar15 = psVar11;
          if (0xfe < uVar24) {
            uVar24 = ((int)piVar14 - (int)piVar18) - 0x10e;
            uVar25 = (ulong)uVar24 / 0xff;
            _memset(psVar11,0xff,uVar25 + 1);
            uVar24 = uVar24 + (int)uVar25;
            psVar15 = (short *)((long)unaff_x28 + uVar25 + 2);
          }
          psVar11 = (short *)((long)psVar15 + 1);
          *(char *)psVar15 = (char)uVar24;
        }
        psVar15 = (short *)((long)psVar11 + ((long)piVar14 - (long)piVar18 & 0xffffffffU));
        psVar20 = psVar15;
        if (psVar15 <= psVar11 + 4) {
          psVar20 = psVar11 + 4;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)psVar20 + ~(ulong)psVar11)) &&
           (0x3f < (ulong)((long)psVar11 - (long)piVar18))) {
          uVar25 = ((long)psVar20 + ~(ulong)psVar11 >> 3) + 1;
          uVar22 = uVar25 & 0x3ffffffffffffff8;
          piVar14 = piVar18 + 8;
          psVar20 = psVar11 + 0x10;
          uVar27 = uVar22;
          do {
            uVar34 = *(undefined8 *)(piVar14 + -8);
            uVar36 = *(undefined8 *)(piVar14 + -2);
            uVar35 = *(undefined8 *)(piVar14 + -4);
            uVar38 = *(undefined8 *)(piVar14 + 2);
            uVar37 = *(undefined8 *)piVar14;
            uVar40 = *(undefined8 *)(piVar14 + 6);
            uVar39 = *(undefined8 *)(piVar14 + 4);
            *(undefined8 *)(psVar20 + -0xc) = *(undefined8 *)(piVar14 + -6);
            *(undefined8 *)(psVar20 + -0x10) = uVar34;
            *(undefined8 *)(psVar20 + -4) = uVar36;
            *(undefined8 *)(psVar20 + -8) = uVar35;
            *(undefined8 *)(psVar20 + 4) = uVar38;
            *(undefined8 *)psVar20 = uVar37;
            *(undefined8 *)(psVar20 + 0xc) = uVar40;
            *(undefined8 *)(psVar20 + 8) = uVar39;
            uVar27 = uVar27 - 8;
            piVar14 = piVar14 + 0x10;
            psVar20 = psVar20 + 0x20;
          } while (uVar27 != 0);
          piVar18 = piVar18 + uVar22 * 2;
          psVar11 = psVar11 + uVar22 * 4;
          if (uVar25 == uVar22) goto LAB_0009a92c;
        }
        do {
          psVar20 = psVar11 + 4;
          *(undefined8 *)psVar11 = *(undefined8 *)piVar18;
          piVar18 = piVar18 + 2;
          psVar11 = psVar20;
        } while (psVar20 < psVar15);
LAB_0009a92c:
        piVar18 = piVar13;
        do {
          psVar11 = psVar15 + 1;
          *psVar15 = (short)piVar18 - (short)piVar17;
          puVar1 = (ulong *)(piVar18 + 1);
          puVar23 = (ulong *)(piVar17 + 1);
          if (puVar1 < puVar32) {
            uVar25 = *puVar1 ^ *puVar23;
            if (uVar25 == 0) {
              puVar23 = (ulong *)(piVar17 + 3);
              puVar21 = (ulong *)(piVar18 + 3);
              goto LAB_0009a980;
            }
            uVar25 = (uVar25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar25 & 0x5555555555555555) << 1;
            uVar25 = (uVar25 & 0xcccccccccccccccc) >> 2 | (uVar25 & 0x3333333333333333) << 2;
            uVar25 = (uVar25 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar25 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar25 = (uVar25 & 0xff00ff00ff00ff00) >> 8 | (uVar25 & 0xff00ff00ff00ff) << 8;
            uVar25 = (uVar25 & 0xffff0000ffff0000) >> 0x10 | (uVar25 & 0xffff0000ffff) << 0x10;
            uVar19 = (uint)((ulong)LZCOUNT(uVar25 >> 0x20 | uVar25 << 0x20) >> 3);
            piVar18 = (int *)((long)piVar18 + (ulong)(uVar19 + 4));
LAB_0009aa40:
            *(char *)unaff_x28 = (char)*unaff_x28 + (char)uVar19;
            unaff_x28 = psVar11;
          }
          else {
            puVar21 = puVar1;
LAB_0009a980:
            for (; puVar21 < puVar32; puVar21 = puVar21 + 1) {
              uVar25 = *puVar21 ^ *puVar23;
              if (uVar25 != 0) {
                uVar25 = (uVar25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar25 & 0x5555555555555555) << 1;
                uVar25 = (uVar25 & 0xcccccccccccccccc) >> 2 | (uVar25 & 0x3333333333333333) << 2;
                uVar25 = (uVar25 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar25 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar25 = (uVar25 & 0xff00ff00ff00ff00) >> 8 | (uVar25 & 0xff00ff00ff00ff) << 8;
                uVar25 = (uVar25 & 0xffff0000ffff0000) >> 0x10 | (uVar25 & 0xffff0000ffff) << 0x10;
                puVar21 = (ulong *)((long)puVar21 +
                                   ((ulong)LZCOUNT(uVar25 >> 0x20 | uVar25 << 0x20) >> 3));
                goto code_r0x0009a9b0;
              }
              puVar23 = puVar23 + 1;
            }
            if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 8))) {
              if ((int)*puVar23 == (int)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 4);
                puVar23 = (ulong *)((long)puVar23 + 4);
              }
            }
            if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 6))) {
              if ((short)*puVar23 == (short)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 2);
                puVar23 = (ulong *)((long)puVar23 + 2);
              }
            }
            if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 5))) {
              if ((char)*puVar23 == (char)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 1);
              }
            }
code_r0x0009a9b0:
            piVar18 = (int *)((long)piVar18 + ((long)puVar21 - (long)puVar1 & 0xffffffffU) + 4);
            uVar19 = (uint)((long)puVar21 - (long)puVar1);
            uVar24 = uVar19 - 0xf;
            if (uVar19 < 0xf) goto LAB_0009aa40;
            *(char *)unaff_x28 = (char)*unaff_x28 + '\x0f';
            psVar11[0] = -1;
            psVar11[1] = -1;
            if (0x3fb < uVar24) {
              uVar25 = (ulong)((uVar19 - 0x40b) / 0x3fc << 2);
              _memset(psVar15 + 3,0xff,uVar25 + 4);
              uVar24 = (uVar19 - 0x40b) % 0x3fc;
              psVar11 = (short *)((long)(psVar15 + 3) + uVar25);
            }
            uVar19 = (uVar24 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar11 + (ulong)uVar19);
            unaff_x28 = (short *)(pcVar2 + 1);
            *pcVar2 = (char)uVar24 + (char)uVar19;
          }
          if (piVar29 <= piVar18) goto LAB_00099b6c;
          *(short *)(unaff_x21 +
                    (ulong)((uint)(*(int *)((long)piVar18 + -2) * -0x61c8864f) >> 0x13) * 2) =
               (short)(int *)((long)piVar18 + -2) - sVar6;
          iVar16 = *piVar18;
          lVar5 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
          uVar4 = *(ushort *)(unaff_x21 + lVar5);
          *(short *)(unaff_x21 + lVar5) = (short)piVar18 - sVar6;
          if ((uVar4 < uVar30) || (piVar17 = (int *)(lVar26 + (ulong)uVar4), *piVar17 != iVar16))
          goto LAB_0009a78c;
          psVar15 = (short *)((long)unaff_x28 + 1);
          *(char *)unaff_x28 = '\0';
        } while( true );
      }
      goto code_r0x0009a088;
    }
  }
  else {
    if (in_w8 == 0) {
      uVar30 = *unaff_x20;
      goto LAB_00099b1c;
    }
LAB_00099be0:
    _bzero();
    *(undefined4 *)(&UNK_00004018 + unaff_x21) = 0;
    *(undefined8 *)(&UNK_00004010 + unaff_x21) = 0;
    *(undefined8 *)(&UNK_00004008 + unaff_x21) = 0;
    *(undefined8 *)(unaff_x21 + 0x4000) = 0;
  }
  if (0x7e000000 < unaff_w23) {
    return 0;
  }
  if (unaff_w23 != 0) {
    uVar12 = (ulong)unaff_w23;
    *unaff_x20 = unaff_w23;
    unaff_x20[1] = 3;
    unaff_x20[2] = unaff_w23;
    piVar17 = unaff_x19;
    piVar18 = unaff_x19;
    if (unaff_w23 < 0xd) {
code_r0x0009a0a0:
      uVar27 = (long)unaff_x19 + (uVar12 - (long)piVar18);
      uVar25 = uVar27 - 0xf;
      if (uVar27 < 0xf) {
        *(char *)unaff_x28 = (char)((int)uVar27 << 4);
      }
      else {
        psVar11 = (short *)((long)unaff_x28 + 1);
        *(char *)unaff_x28 = -0x10;
        if (0xfe < uVar25) {
          uVar25 = (long)piVar17 + (uVar12 - (long)piVar18) + -0x10e;
          uVar12 = uVar25 / 0xff;
          _memset(psVar11,0xff,uVar12 + 1);
          uVar25 = uVar25 % 0xff;
          psVar11 = (short *)((long)unaff_x28 + uVar12 + 2);
        }
        *(char *)psVar11 = (char)uVar25;
        unaff_x28 = psVar11;
      }
      _memcpy((char *)((long)unaff_x28 + 1),piVar18,uVar27);
      return ((int)(char *)((long)unaff_x28 + 1) + (int)uVar27) - iVar33;
    }
    piVar29 = (int *)((long)unaff_x19 + (uVar12 - 0xb));
    *(undefined2 *)(unaff_x21 + (ulong)((uint)(*unaff_x19 * -0x61c8864f) >> 0x13) * 2) = 0;
    puVar32 = (ulong *)((long)unaff_x19 + (uVar12 - 0xc));
    piVar28 = unaff_x19;
LAB_00099c90:
    uVar25 = 1;
    piVar14 = (int *)((long)piVar28 + 1U);
    uVar30 = unaff_w24 << 6;
    iVar16 = *(int *)((long)piVar28 + 1U);
    do {
      piVar13 = piVar14;
      piVar14 = (int *)((long)piVar13 + uVar25);
      piVar18 = piVar28;
      if (piVar29 < piVar14) goto code_r0x0009a0a0;
      uVar25 = (ulong)(uVar30 >> 6);
      uVar30 = uVar30 + 1;
      lVar26 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
      uVar4 = *(ushort *)(unaff_x21 + lVar26);
      uVar27 = (ulong)uVar4;
      iVar3 = *piVar14;
      *(short *)(unaff_x21 + lVar26) = (short)piVar13 - (short)piVar17;
      bVar10 = *(int *)((long)piVar17 + uVar27) != iVar16;
      iVar16 = iVar3;
    } while (bVar10);
    piVar14 = (int *)((long)piVar17 + uVar27);
    if ((uVar4 == 0) || (*(char *)((long)piVar13 - 1) != *(char *)((long)piVar14 + -1))) {
      piVar18 = piVar13;
    }
    else {
      piVar7 = (int *)((long)unaff_x19 + (uVar27 - 1));
      piVar8 = (int *)((long)piVar13 - 1U);
      piVar9 = (int *)((long)piVar13 - 1U);
      do {
        piVar13 = piVar9;
        piVar18 = piVar8;
        piVar14 = piVar7;
        if ((piVar14 <= piVar17) || (piVar18 <= piVar28)) break;
        piVar7 = (int *)((long)piVar14 + -1);
        piVar8 = (int *)((long)piVar18 + -1);
        piVar9 = (int *)((long)piVar13 - 1);
      } while (*(char *)((long)piVar18 + -1) == *(char *)((long)piVar14 + -1));
    }
    psVar11 = (short *)((long)unaff_x28 + 1);
    uVar24 = (uint)((long)piVar13 - (long)piVar28);
    uVar30 = uVar24 - 0xf;
    if (uVar24 < 0xf) {
      *(char *)unaff_x28 = (char)(uVar24 << 4);
    }
    else {
      *(char *)unaff_x28 = -0x10;
      psVar15 = psVar11;
      if (0xfe < uVar30) {
        uVar24 = ((int)piVar13 - (int)piVar28) - 0x10e;
        _memset(psVar11,0xff,(ulong)uVar24 / 0xff + 1);
        uVar30 = uVar24 + uVar24 / 0xff;
        psVar15 = (short *)((long)unaff_x28 + (ulong)uVar24 / 0xff + 2);
      }
      psVar11 = (short *)((long)psVar15 + 1);
      *(char *)psVar15 = (char)uVar30;
    }
    psVar15 = (short *)((long)psVar11 + ((long)piVar13 - (long)piVar28 & 0xffffffffU));
    psVar20 = psVar15;
    if (psVar15 <= psVar11 + 4) {
      psVar20 = psVar11 + 4;
    }
    piVar13 = piVar28;
    psVar31 = unaff_x28;
    if ((char *)((long)psVar20 + ~(ulong)psVar11) < &segment_command_00000020.vmaddr) {
      piVar17 = *(int **)(unaff_x29 + -0x58);
      psVar20 = psVar11;
    }
    else {
      piVar17 = *(int **)(unaff_x29 + -0x58);
      if ((ulong)((long)psVar11 - (long)piVar28) < 0x40) {
        psVar20 = psVar11;
      }
      else {
        uVar25 = ((long)psVar20 + ~(ulong)psVar11 >> 3) + 1;
        uVar22 = uVar25 & 0x3ffffffffffffff8;
        piVar13 = piVar28 + uVar22 * 2;
        psVar20 = psVar11 + uVar22 * 4;
        piVar28 = piVar28 + 8;
        psVar11 = psVar11 + 0x10;
        uVar27 = uVar22;
        do {
          uVar34 = *(undefined8 *)(piVar28 + -8);
          uVar36 = *(undefined8 *)(piVar28 + -2);
          uVar35 = *(undefined8 *)(piVar28 + -4);
          uVar38 = *(undefined8 *)(piVar28 + 2);
          uVar37 = *(undefined8 *)piVar28;
          uVar40 = *(undefined8 *)(piVar28 + 6);
          uVar39 = *(undefined8 *)(piVar28 + 4);
          *(undefined8 *)(psVar11 + -0xc) = *(undefined8 *)(piVar28 + -6);
          *(undefined8 *)(psVar11 + -0x10) = uVar34;
          *(undefined8 *)(psVar11 + -4) = uVar36;
          *(undefined8 *)(psVar11 + -8) = uVar35;
          *(undefined8 *)(psVar11 + 4) = uVar38;
          *(undefined8 *)psVar11 = uVar37;
          *(undefined8 *)(psVar11 + 0xc) = uVar40;
          *(undefined8 *)(psVar11 + 8) = uVar39;
          uVar27 = uVar27 - 8;
          piVar28 = piVar28 + 0x10;
          psVar11 = psVar11 + 0x20;
        } while (uVar27 != 0);
        if (uVar25 == uVar22) goto LAB_00099e1c;
      }
    }
    do {
      psVar11 = psVar20 + 4;
      *(undefined8 *)psVar20 = *(undefined8 *)piVar13;
      piVar13 = piVar13 + 2;
      psVar20 = psVar11;
    } while (psVar11 < psVar15);
LAB_00099e1c:
    do {
      unaff_x28 = psVar15 + 1;
      *psVar15 = (short)piVar18 - (short)piVar14;
      puVar1 = (ulong *)(piVar18 + 1);
      puVar23 = (ulong *)(piVar14 + 1);
      if (puVar1 < puVar32) {
        uVar25 = *puVar1 ^ *puVar23;
        if (uVar25 == 0) {
          puVar23 = (ulong *)(piVar14 + 3);
          puVar21 = (ulong *)(piVar18 + 3);
          goto LAB_00099e68;
        }
        uVar25 = (uVar25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar25 & 0x5555555555555555) << 1;
        uVar25 = (uVar25 & 0xcccccccccccccccc) >> 2 | (uVar25 & 0x3333333333333333) << 2;
        uVar25 = (uVar25 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar25 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar25 = (uVar25 & 0xff00ff00ff00ff00) >> 8 | (uVar25 & 0xff00ff00ff00ff) << 8;
        uVar25 = (uVar25 & 0xffff0000ffff0000) >> 0x10 | (uVar25 & 0xffff0000ffff) << 0x10;
        uVar24 = (uint)((ulong)LZCOUNT(uVar25 >> 0x20 | uVar25 << 0x20) >> 3);
        piVar18 = (int *)((long)piVar18 + (ulong)(uVar24 + 4));
LAB_00099f24:
        *(char *)psVar31 = (char)*psVar31 + (char)uVar24;
      }
      else {
        puVar21 = puVar1;
LAB_00099e68:
        for (; puVar21 < puVar32; puVar21 = puVar21 + 1) {
          uVar25 = *puVar21 ^ *puVar23;
          if (uVar25 != 0) {
            uVar25 = (uVar25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar25 & 0x5555555555555555) << 1;
            uVar25 = (uVar25 & 0xcccccccccccccccc) >> 2 | (uVar25 & 0x3333333333333333) << 2;
            uVar25 = (uVar25 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar25 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar25 = (uVar25 & 0xff00ff00ff00ff00) >> 8 | (uVar25 & 0xff00ff00ff00ff) << 8;
            uVar25 = (uVar25 & 0xffff0000ffff0000) >> 0x10 | (uVar25 & 0xffff0000ffff) << 0x10;
            puVar21 = (ulong *)((long)puVar21 +
                               ((ulong)LZCOUNT(uVar25 >> 0x20 | uVar25 << 0x20) >> 3));
            goto LAB_00099e98;
          }
          puVar23 = puVar23 + 1;
        }
        if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 8))) {
          if ((int)*puVar23 == (int)*puVar21) {
            puVar21 = (ulong *)((long)puVar21 + 4);
            puVar23 = (ulong *)((long)puVar23 + 4);
          }
        }
        if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 6))) {
          if ((short)*puVar23 == (short)*puVar21) {
            puVar21 = (ulong *)((long)puVar21 + 2);
            puVar23 = (ulong *)((long)puVar23 + 2);
          }
        }
        if (puVar21 < (ulong *)((long)unaff_x19 + (uVar12 - 5))) {
          if ((char)*puVar23 == (char)*puVar21) {
            puVar21 = (ulong *)((long)puVar21 + 1);
          }
        }
LAB_00099e98:
        piVar18 = (int *)((long)piVar18 + ((long)puVar21 - (long)puVar1 & 0xffffffffU) + 4);
        uVar24 = (uint)((long)puVar21 - (long)puVar1);
        uVar30 = uVar24 - 0xf;
        if (uVar24 < 0xf) goto LAB_00099f24;
        *(char *)psVar31 = (char)*psVar31 + '\x0f';
        unaff_x28[0] = -1;
        unaff_x28[1] = -1;
        if (0x3fb < uVar30) {
          uVar25 = (ulong)((uVar24 - 0x40b) / 0x3fc << 2);
          _memset(psVar15 + 3,0xff,uVar25 + 4);
          uVar30 = (uVar24 - 0x40b) % 0x3fc;
          piVar17 = *(int **)(unaff_x29 + -0x58);
          unaff_x28 = (short *)((long)(psVar15 + 3) + uVar25);
        }
        uVar24 = (uVar30 & 0xffff) / 0xff;
        pcVar2 = (char *)((long)unaff_x28 + (ulong)uVar24);
        unaff_x28 = (short *)(pcVar2 + 1);
        *pcVar2 = (char)uVar30 + (char)uVar24;
      }
      if (piVar29 <= piVar18) goto code_r0x0009a0a0;
      *(short *)(unaff_x21 + (ulong)((uint)(*(int *)((long)piVar18 + -2) * -0x61c8864f) >> 0x13) * 2
                ) = (short)(int *)((long)piVar18 + -2) - (short)piVar17;
      iVar16 = *piVar18;
      lVar26 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
      piVar14 = (int *)((long)piVar17 + (ulong)*(ushort *)(unaff_x21 + lVar26));
      *(short *)(unaff_x21 + lVar26) = (short)piVar18 - (short)piVar17;
      if (*piVar14 != iVar16) goto LAB_0009a024;
      psVar15 = (short *)((long)unaff_x28 + 1);
      *(char *)unaff_x28 = '\0';
      psVar31 = unaff_x28;
    } while( true );
  }
code_r0x0009a088:
  *(char *)unaff_x28 = '\0';
  return 1;
LAB_0009a78c:
  piVar17 = (int *)((long)piVar18 + 2);
  if (piVar29 < piVar17) goto LAB_00099b6c;
  goto code_r0x0009a79c;
LAB_0009a024:
  piVar28 = piVar18;
  goto LAB_00099c90;
}

