/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cdb48
 */

int LZ4_compress_fast_extState
              (void *param_1,long *param_2,short *param_3,uint param_4,int param_5,uint param_6)

{
  char *pcVar1;
  ulong *puVar2;
  char *pcVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long *plVar7;
  short sVar8;
  bool bVar9;
  uint uVar10;
  long *plVar12;
  long *plVar11;
  short *psVar13;
  int *piVar14;
  long *plVar15;
  long *plVar16;
  uint uVar17;
  long *plVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong *puVar21;
  ulong uVar22;
  ulong uVar23;
  int iVar24;
  ulong uVar25;
  long *plVar26;
  int iVar27;
  long lVar28;
  long lVar29;
  size_t __n;
  long *plVar30;
  void *pvVar31;
  long *plVar32;
  int iVar33;
  ulong *puVar34;
  long lVar35;
  long lVar36;
  
  pvVar31 = (void *)0x0;
  if ((param_1 != (void *)0x0) && (((ulong)param_1 & 7) == 0)) {
    memset(param_1,0,0x4020);
    pvVar31 = param_1;
  }
  if ((int)param_6 < 2) {
    param_6 = 1;
  }
  if (0x10000 < (int)param_6) {
    param_6 = 0x10001;
  }
  if (param_4 < 0x7e000001) {
    iVar27 = (uint)((ulong)param_4 * 0x8080808081 >> 0x27) + 0x10;
  }
  else {
    iVar27 = 0;
  }
  iVar33 = (int)param_3;
  plVar18 = param_2;
  if (param_5 < iVar27) {
    if (0x1000a < (int)param_4) {
      if (0x7e000000 < param_4) {
        return 0;
      }
      plVar32 = (long *)((long)param_2 + 1);
      lVar28 = *param_2;
      uVar25 = (ulong)param_4;
      uVar4 = *(uint *)((long)pvVar31 + 0x4010);
      *(undefined4 *)((long)pvVar31 + 0x4014) = 2;
      *(uint *)((long)pvVar31 + 0x4018) = *(int *)((long)pvVar31 + 0x4018) + param_4;
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      plVar18 = (long *)((long)param_2 + 2);
      *(uint *)((long)pvVar31 + 0x4010) = uVar4 + param_4;
      lVar29 = (long)param_2 - (ulong)uVar4;
      plVar15 = (long *)((long)param_2 + (uVar25 - 0xb));
      puVar34 = (ulong *)((long)param_2 + (uVar25 - 0xc));
      *(uint *)((long)pvVar31 + ((ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar4;
      plVar30 = param_2;
LAB_008ceb28:
      uVar10 = param_6 << 6 | 1;
      lVar28 = *plVar32;
      uVar17 = param_6;
      while( true ) {
        plVar16 = plVar18;
        iVar27 = (int)lVar29;
        uVar6 = (int)plVar32 - iVar27;
        uVar19 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        lVar28 = *plVar16;
        uVar5 = *(uint *)((long)pvVar31 + uVar19);
        uVar22 = (ulong)uVar5;
        *(uint *)((long)pvVar31 + uVar19) = uVar6;
        if ((uVar6 <= uVar5 + 0xffff) && (*(int *)(lVar29 + uVar22) == (int)*plVar32)) break;
        uVar22 = (ulong)uVar17;
        uVar17 = uVar10 >> 6;
        uVar10 = uVar10 + 1;
        plVar18 = (long *)((long)plVar16 + uVar22);
        plVar32 = plVar16;
        if (plVar15 < (long *)((long)plVar16 + uVar22)) goto LAB_008cefe8;
      }
      plVar18 = (long *)(lVar29 + uVar22);
      if ((param_2 < plVar18) && (*(char *)((long)plVar32 - 1) == *(char *)((long)plVar18 - 1))) {
        plVar11 = (long *)((long)plVar32 - 1U);
        plVar12 = (long *)((long)param_2 + uVar22 + ~(ulong)uVar4);
        plVar26 = (long *)((long)plVar32 - 1U);
        do {
          plVar32 = plVar26;
          plVar18 = plVar12;
          plVar16 = plVar11;
          if ((plVar18 <= param_2) || (plVar16 <= plVar30)) break;
          plVar11 = (long *)((long)plVar16 + -1);
          plVar12 = (long *)((long)plVar18 + -1);
          plVar26 = (long *)((long)plVar32 - 1);
        } while (*(char *)((long)plVar16 + -1) == *(char *)((long)plVar18 + -1));
      }
      else {
        plVar16 = plVar32;
      }
      plVar11 = (long *)((long)param_3 + 1);
      uVar22 = (long)plVar32 - (long)plVar30 & 0xffffffff;
      if (pcVar1 < (char *)((long)plVar11 + uVar22 / 0xff + uVar22 + 8)) {
        return 0;
      }
      uVar17 = (uint)((long)plVar32 - (long)plVar30);
      uVar10 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)param_3 = (char)(uVar17 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar12 = plVar11;
        if (0xfe < uVar10) {
          uVar10 = ((int)plVar32 - (int)plVar30) - 0x10e;
          uVar19 = (ulong)uVar10 / 0xff;
          memset(plVar11,0xff,uVar19 + 1);
          plVar12 = (long *)((long)param_3 + uVar19 + 2);
          uVar10 = uVar10 + (int)uVar19;
        }
        plVar11 = (long *)((long)plVar12 + 1);
        *(char *)plVar12 = (char)uVar10;
      }
      uVar19 = uVar22;
      if (uVar22 < 9) {
        uVar19 = 8;
      }
      plVar32 = (long *)((long)plVar11 + uVar22);
      if ((0x18 < uVar22) && (0x1f < (ulong)((long)plVar11 - (long)plVar30))) {
        plVar12 = plVar11 + 2;
        plVar26 = plVar30 + 2;
        uVar22 = (uVar19 - 1 >> 3) + 1;
        uVar23 = uVar22 & 0x3ffffffffffffffc;
        uVar19 = uVar23;
        do {
          plVar7 = plVar26 + -1;
          lVar28 = plVar26[-2];
          lVar36 = plVar26[1];
          lVar35 = *plVar26;
          uVar19 = uVar19 - 4;
          plVar26 = plVar26 + 4;
          plVar12[-1] = *plVar7;
          plVar12[-2] = lVar28;
          plVar12[1] = lVar36;
          *plVar12 = lVar35;
          plVar12 = plVar12 + 4;
        } while (uVar19 != 0);
        plVar30 = plVar30 + uVar23;
        plVar11 = plVar11 + uVar23;
        if (uVar22 == uVar23) goto LAB_008cecd4;
      }
      do {
        plVar12 = plVar11 + 1;
        *plVar11 = *plVar30;
        plVar30 = plVar30 + 1;
        plVar11 = plVar12;
      } while (plVar12 < plVar32);
LAB_008cecd4:
      do {
        puVar2 = (ulong *)((long)plVar16 + 4);
        puVar21 = (ulong *)((long)plVar18 + 4);
        psVar13 = (short *)((long)plVar32 + 2);
        *(short *)plVar32 = (short)plVar16 - (short)plVar18;
        puVar20 = puVar2;
        if (puVar2 < puVar34) {
          if (*puVar21 == *puVar2) {
            puVar21 = (ulong *)((long)plVar18 + 0xc);
            puVar20 = (ulong *)((long)plVar16 + 0xc);
            goto joined_r0x008cef1c;
          }
          uVar22 = *puVar2 ^ *puVar21;
          uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
          uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
          uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          uVar10 = (uint)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
        }
        else {
joined_r0x008cef1c:
          if (puVar20 < puVar34) {
            iVar24 = ((int)puVar20 - (int)plVar16) + -4;
            do {
              if (*puVar21 != *puVar20) {
                uVar22 = *puVar20 ^ *puVar21;
                uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
                uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
                uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
                uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
                uVar10 = (int)((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) + iVar24;
                goto LAB_008cede4;
              }
              puVar20 = puVar20 + 1;
              puVar21 = puVar21 + 1;
              iVar24 = iVar24 + 8;
            } while (puVar20 < puVar34);
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 8))) {
            if ((int)*puVar21 == (int)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 4);
              puVar21 = (ulong *)((long)puVar21 + 4);
            }
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 6))) {
            if ((short)*puVar21 == (short)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 2);
              puVar21 = (ulong *)((long)puVar21 + 2);
            }
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 5))) {
            if ((char)*puVar21 == (char)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 1);
            }
          }
          uVar10 = (int)puVar20 - (int)puVar2;
        }
LAB_008cede4:
        if (pcVar1 < (char *)((long)plVar32 + (ulong)(uVar10 + 0xf0) / 0xff + 8)) {
          return 0;
        }
        uVar17 = uVar10 - 0xf;
        if (uVar10 < 0xf) {
          *(char *)param_3 = (char)*param_3 + (char)uVar10;
          param_3 = psVar13;
        }
        else {
          *(char *)param_3 = (char)*param_3 + '\x0f';
          psVar13[0] = -1;
          psVar13[1] = -1;
          if (0x3fb < uVar17) {
            uVar22 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
            memset((short *)((long)plVar32 + 6),0xff,uVar22 + 4);
            uVar17 = (uVar10 - 0x40b) % 0x3fc;
            psVar13 = (short *)((long)plVar32 + 6 + uVar22);
          }
          uVar5 = (uVar17 & 0xffff) / 0xff;
          pcVar3 = (char *)((long)psVar13 + (ulong)uVar5);
          *pcVar3 = (char)uVar17 + (char)uVar5;
          param_3 = (short *)(pcVar3 + 1);
        }
        plVar30 = (long *)((long)plVar16 + (ulong)uVar10 + 4);
        if (plVar15 <= plVar30) goto LAB_008cefe8;
        plVar18 = (long *)((long)plVar16 + (ulong)uVar10 + 2);
        lVar28 = *(long *)((long)plVar16 + (ulong)uVar10 + 4);
        *(int *)((long)pvVar31 + ((ulong)(*plVar18 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)plVar18 - iVar27;
        uVar22 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar5 = (int)plVar30 - iVar27;
        uVar17 = *(uint *)((long)pvVar31 + uVar22);
        *(uint *)((long)pvVar31 + uVar22) = uVar5;
        if ((uVar17 + 0xffff < uVar5) ||
           (plVar18 = (long *)(lVar29 + (ulong)uVar17), (int)*plVar18 != (int)*plVar30))
        goto LAB_008ceb10;
        plVar32 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
        plVar16 = plVar30;
      } while( true );
    }
    if (0x7e000000 < param_4) {
      return 0;
    }
    if (param_4 == 0) {
      if (param_5 < 1) {
        return 0;
      }
      goto LAB_008cf0b0;
    }
    uVar4 = *(uint *)((long)pvVar31 + 0x4010);
    uVar25 = (ulong)param_4;
    pcVar1 = (char *)((long)param_3 + (long)param_5);
    *(undefined4 *)((long)pvVar31 + 0x4014) = 3;
    *(uint *)((long)pvVar31 + 0x4018) = *(int *)((long)pvVar31 + 0x4018) + param_4;
    *(uint *)((long)pvVar31 + 0x4010) = uVar4 + param_4;
    if (0xc < param_4) {
      plVar32 = (long *)((long)param_2 + (uVar25 - 0xb));
      puVar34 = (ulong *)((long)param_2 + (uVar25 - 0xc));
      lVar28 = (long)param_2 - (ulong)uVar4;
      *(short *)((long)pvVar31 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
           (short)uVar4;
LAB_008cdcb8:
      uVar22 = 1;
      plVar30 = (long *)((long)plVar18 + 1U);
      uVar10 = param_6 << 6;
      iVar27 = *(int *)((long)plVar18 + 1U);
      do {
        plVar15 = plVar30;
        plVar30 = (long *)((long)plVar15 + uVar22);
        if (plVar32 < plVar30) goto LAB_008cf15c;
        lVar29 = *plVar30;
        uVar17 = (uint)(iVar27 * -0x61c8864f) >> 0x13;
        uVar19 = (ulong)*(ushort *)((long)pvVar31 + (ulong)uVar17 * 2);
        bVar9 = *(int *)(lVar28 + uVar19) != iVar27;
        uVar22 = (ulong)(uVar10 >> 6);
        sVar8 = (short)lVar28;
        uVar10 = uVar10 + 1;
        *(short *)((long)pvVar31 + (ulong)uVar17 * 2) = (short)plVar15 - sVar8;
        iVar27 = (int)lVar29;
      } while (bVar9);
      plVar30 = (long *)(lVar28 + uVar19);
      if ((param_2 < plVar30) && (*(char *)((long)plVar15 - 1) == *(char *)((long)plVar30 - 1))) {
        plVar11 = (long *)((long)plVar15 - 1U);
        plVar12 = (long *)((long)param_2 + uVar19 + ~(ulong)uVar4);
        plVar26 = (long *)((long)plVar15 - 1U);
        do {
          plVar15 = plVar26;
          plVar30 = plVar12;
          plVar16 = plVar11;
          if ((plVar30 <= param_2) || (plVar16 <= plVar18)) break;
          plVar11 = (long *)((long)plVar16 + -1);
          plVar12 = (long *)((long)plVar30 + -1);
          plVar26 = (long *)((long)plVar15 - 1);
        } while (*(char *)((long)plVar16 + -1) == *(char *)((long)plVar30 + -1));
      }
      else {
        plVar16 = plVar15;
      }
      plVar11 = (long *)((long)param_3 + 1);
      uVar22 = (long)plVar15 - (long)plVar18 & 0xffffffff;
      if (pcVar1 < (char *)((long)plVar11 + uVar22 / 0xff + uVar22 + 8)) {
        return 0;
      }
      uVar17 = (uint)((long)plVar15 - (long)plVar18);
      uVar10 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)param_3 = (char)(uVar17 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar12 = plVar11;
        if (0xfe < uVar10) {
          uVar10 = ((int)plVar15 - (int)plVar18) - 0x10e;
          uVar19 = (ulong)uVar10 / 0xff;
          memset(plVar11,0xff,uVar19 + 1);
          plVar12 = (long *)((long)param_3 + uVar19 + 2);
          uVar10 = uVar10 + (int)uVar19;
        }
        plVar11 = (long *)((long)plVar12 + 1);
        *(char *)plVar12 = (char)uVar10;
      }
      uVar19 = uVar22;
      if (uVar22 < 9) {
        uVar19 = 8;
      }
      plVar15 = (long *)((long)plVar11 + uVar22);
      psVar13 = param_3;
      if ((0x18 < uVar22) && (0x1f < (ulong)((long)plVar11 - (long)plVar18))) {
        plVar12 = plVar11 + 2;
        plVar26 = plVar18 + 2;
        uVar22 = (uVar19 - 1 >> 3) + 1;
        uVar23 = uVar22 & 0x3ffffffffffffffc;
        plVar18 = plVar18 + uVar23;
        plVar11 = plVar11 + uVar23;
        uVar19 = uVar23;
        do {
          plVar7 = plVar26 + -1;
          lVar29 = plVar26[-2];
          lVar36 = plVar26[1];
          lVar35 = *plVar26;
          uVar19 = uVar19 - 4;
          plVar26 = plVar26 + 4;
          plVar12[-1] = *plVar7;
          plVar12[-2] = lVar29;
          plVar12[1] = lVar36;
          *plVar12 = lVar35;
          plVar12 = plVar12 + 4;
        } while (uVar19 != 0);
        if (uVar22 == uVar23) goto LAB_008cde54;
      }
      do {
        plVar12 = plVar11 + 1;
        *plVar11 = *plVar18;
        plVar18 = plVar18 + 1;
        plVar11 = plVar12;
      } while (plVar12 < plVar15);
LAB_008cde54:
      do {
        puVar2 = (ulong *)((long)plVar16 + 4);
        puVar21 = (ulong *)((long)plVar30 + 4);
        param_3 = (short *)((long)plVar15 + 2);
        *(short *)plVar15 = (short)plVar16 - (short)plVar30;
        puVar20 = puVar2;
        if (puVar2 < puVar34) {
          if (*puVar21 == *puVar2) {
            puVar21 = (ulong *)((long)plVar30 + 0xc);
            puVar20 = (ulong *)((long)plVar16 + 0xc);
            goto joined_r0x008ce078;
          }
          uVar22 = *puVar2 ^ *puVar21;
          uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
          uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
          uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          uVar10 = (uint)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
        }
        else {
joined_r0x008ce078:
          if (puVar20 < puVar34) {
            iVar27 = ((int)puVar20 - (int)plVar16) + -4;
            do {
              if (*puVar21 != *puVar20) {
                uVar22 = *puVar20 ^ *puVar21;
                uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
                uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
                uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
                uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
                uVar10 = (int)((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) + iVar27;
                goto LAB_008cdf5c;
              }
              puVar20 = puVar20 + 1;
              puVar21 = puVar21 + 1;
              iVar27 = iVar27 + 8;
            } while (puVar20 < puVar34);
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 8))) {
            if ((int)*puVar21 == (int)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 4);
              puVar21 = (ulong *)((long)puVar21 + 4);
            }
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 6))) {
            if ((short)*puVar21 == (short)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 2);
              puVar21 = (ulong *)((long)puVar21 + 2);
            }
          }
          if (puVar20 < (ulong *)((long)param_2 + (uVar25 - 5))) {
            if ((char)*puVar21 == (char)*puVar20) {
              puVar20 = (ulong *)((long)puVar20 + 1);
            }
          }
          uVar10 = (int)puVar20 - (int)puVar2;
        }
LAB_008cdf5c:
        if (pcVar1 < (char *)((long)plVar15 + (ulong)(uVar10 + 0xf0) / 0xff + 8)) {
          return 0;
        }
        uVar17 = uVar10 - 0xf;
        if (uVar10 < 0xf) {
          *(char *)psVar13 = (char)*psVar13 + (char)uVar10;
        }
        else {
          *(char *)psVar13 = (char)*psVar13 + '\x0f';
          param_3[0] = -1;
          param_3[1] = -1;
          if (0x3fb < uVar17) {
            uVar22 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
            memset((short *)((long)plVar15 + 6),0xff,uVar22 + 4);
            param_3 = (short *)((long)plVar15 + 6 + uVar22);
            uVar17 = (uVar10 - 0x40b) % 0x3fc;
          }
          uVar5 = (uVar17 & 0xffff) / 0xff;
          pcVar3 = (char *)((long)param_3 + (ulong)uVar5);
          param_3 = (short *)(pcVar3 + 1);
          *pcVar3 = (char)uVar17 + (char)uVar5;
        }
        plVar18 = (long *)((long)plVar16 + (ulong)uVar10 + 4);
        if (plVar32 <= plVar18) break;
        piVar14 = (int *)((long)plVar16 + (ulong)uVar10 + 2);
        iVar27 = *(int *)((long)plVar16 + (ulong)uVar10 + 4);
        uVar10 = (uint)(iVar27 * -0x61c8864f) >> 0x13;
        *(short *)((long)pvVar31 + (ulong)((uint)(*piVar14 * -0x61c8864f) >> 0x13) * 2) =
             (short)piVar14 - sVar8;
        plVar30 = (long *)(lVar28 + (ulong)*(ushort *)((long)pvVar31 + (ulong)uVar10 * 2));
        lVar29 = *plVar30;
        *(short *)((long)pvVar31 + (ulong)uVar10 * 2) = (short)plVar18 - sVar8;
        if ((int)lVar29 != iVar27) goto LAB_008cdcb8;
        plVar15 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
        plVar16 = plVar18;
        psVar13 = param_3;
      } while( true );
    }
LAB_008cf15c:
    __n = (long)param_2 + (uVar25 - (long)plVar18);
    if (pcVar1 < (char *)((long)param_3 + (__n + 0xf0) / 0xff + __n + 1)) {
      return 0;
    }
    uVar22 = __n - 0xf;
    if (__n < 0xf) {
      *(char *)param_3 = (char)((int)__n << 4);
    }
    else {
      psVar13 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar22) {
        uVar22 = (long)param_2 + (uVar25 - (long)plVar18) + -0x10e;
        uVar25 = uVar22 / 0xff;
        memset(psVar13,0xff,uVar25 + 1);
        psVar13 = (short *)((long)param_3 + uVar25 + 2);
        uVar22 = uVar22 % 0xff;
      }
      *(char *)psVar13 = (char)uVar22;
      param_3 = psVar13;
    }
  }
  else {
    if (0x1000a < (int)param_4) {
      if (0x7e000000 < param_4) {
        return 0;
      }
      plVar18 = (long *)((long)param_2 + 2);
      lVar28 = *param_2;
      uVar25 = (ulong)param_4;
      uVar4 = *(uint *)((long)pvVar31 + 0x4010);
      lVar29 = (long)param_2 - (ulong)uVar4;
      *(undefined4 *)((long)pvVar31 + 0x4014) = 2;
      *(uint *)((long)pvVar31 + 0x4018) = *(int *)((long)pvVar31 + 0x4018) + param_4;
      *(uint *)((long)pvVar31 + 0x4010) = uVar4 + param_4;
      plVar30 = (long *)((long)param_2 + (uVar25 - 0xb));
      puVar34 = (ulong *)((long)param_2 + (uVar25 - 0xc));
      *(uint *)((long)pvVar31 + ((ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar4;
      plVar32 = param_2;
LAB_008ce704:
      uVar10 = param_6 << 6 | 1;
      lVar28 = *(long *)((long)plVar32 + 1U);
      plVar15 = (long *)((long)plVar32 + 1U);
      uVar17 = param_6;
      while( true ) {
        plVar16 = plVar18;
        iVar27 = (int)lVar29;
        uVar6 = (int)plVar15 - iVar27;
        uVar19 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        lVar28 = *plVar16;
        uVar5 = *(uint *)((long)pvVar31 + uVar19);
        uVar22 = (ulong)uVar5;
        *(uint *)((long)pvVar31 + uVar19) = uVar6;
        if ((uVar6 <= uVar5 + 0xffff) && (*(int *)(lVar29 + uVar22) == (int)*plVar15)) break;
        uVar22 = (ulong)uVar17;
        uVar17 = uVar10 >> 6;
        uVar10 = uVar10 + 1;
        plVar18 = (long *)((long)plVar16 + uVar22);
        plVar15 = plVar16;
        if (plVar30 < (long *)((long)plVar16 + uVar22)) goto LAB_008cef74;
      }
      plVar18 = (long *)(lVar29 + uVar22);
      if ((param_2 < plVar18) && (*(char *)((long)plVar15 - 1) == *(char *)((long)plVar18 - 1))) {
        plVar11 = (long *)((long)plVar15 - 1U);
        plVar12 = (long *)((long)param_2 + uVar22 + ~(ulong)uVar4);
        plVar26 = (long *)((long)plVar15 - 1U);
        do {
          plVar15 = plVar26;
          plVar18 = plVar12;
          plVar16 = plVar11;
          if ((plVar18 <= param_2) || (plVar16 <= plVar32)) break;
          plVar11 = (long *)((long)plVar16 + -1);
          plVar12 = (long *)((long)plVar18 + -1);
          plVar26 = (long *)((long)plVar15 - 1);
        } while (*(char *)((long)plVar16 + -1) == *(char *)((long)plVar18 + -1));
      }
      else {
        plVar16 = plVar15;
      }
      plVar11 = (long *)((long)param_3 + 1);
      uVar17 = (uint)((long)plVar15 - (long)plVar32);
      uVar10 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)param_3 = (char)(uVar17 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar12 = plVar11;
        if (0xfe < uVar10) {
          uVar10 = ((int)plVar15 - (int)plVar32) - 0x10e;
          uVar22 = (ulong)uVar10 / 0xff;
          memset(plVar11,0xff,uVar22 + 1);
          plVar12 = (long *)((long)param_3 + uVar22 + 2);
          uVar10 = uVar10 + (int)uVar22;
        }
        plVar11 = (long *)((long)plVar12 + 1);
        *(char *)plVar12 = (char)uVar10;
      }
      uVar19 = (long)plVar15 - (long)plVar32 & 0xffffffff;
      uVar22 = uVar19;
      if (uVar19 < 9) {
        uVar22 = 8;
      }
      plVar15 = (long *)((long)plVar11 + uVar19);
      if ((0x18 < uVar19) && (0x1f < (ulong)((long)plVar11 - (long)plVar32))) {
        plVar12 = plVar11 + 2;
        plVar26 = plVar32 + 2;
        uVar22 = (uVar22 - 1 >> 3) + 1;
        uVar23 = uVar22 & 0x3ffffffffffffffc;
        uVar19 = uVar23;
        do {
          plVar7 = plVar26 + -1;
          lVar28 = plVar26[-2];
          lVar36 = plVar26[1];
          lVar35 = *plVar26;
          uVar19 = uVar19 - 4;
          plVar26 = plVar26 + 4;
          plVar12[-1] = *plVar7;
          plVar12[-2] = lVar28;
          plVar12[1] = lVar36;
          *plVar12 = lVar35;
          plVar12 = plVar12 + 4;
        } while (uVar19 != 0);
        plVar32 = plVar32 + uVar23;
        plVar11 = plVar11 + uVar23;
        if (uVar22 == uVar23) goto LAB_008ce898;
      }
      do {
        plVar12 = plVar11 + 1;
        *plVar11 = *plVar32;
        plVar32 = plVar32 + 1;
        plVar11 = plVar12;
      } while (plVar12 < plVar15);
LAB_008ce898:
      plVar32 = plVar16;
      do {
        puVar2 = (ulong *)((long)plVar32 + 4);
        puVar20 = (ulong *)((long)plVar18 + 4);
        psVar13 = (short *)((long)plVar15 + 2);
        *(short *)plVar15 = (short)plVar32 - (short)plVar18;
        puVar21 = puVar2;
        if (puVar2 < puVar34) {
          if (*puVar20 == *puVar2) {
            puVar21 = (ulong *)((long)plVar32 + 0xc);
            puVar20 = (ulong *)((long)plVar18 + 0xc);
            goto joined_r0x008ceab8;
          }
          uVar22 = *puVar2 ^ *puVar20;
          uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
          uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
          uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          uVar22 = (ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
          uVar17 = (uint)uVar22;
          plVar32 = (long *)((long)plVar32 + uVar22 + 4);
LAB_008cea34:
          *(char *)param_3 = (char)*param_3 + (char)uVar17;
          param_3 = psVar13;
        }
        else {
joined_r0x008ceab8:
          for (; puVar21 < puVar34; puVar21 = puVar21 + 1) {
            if (*puVar20 != *puVar21) {
              uVar22 = *puVar21 ^ *puVar20;
              uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
              uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
              uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
              uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
              puVar21 = (ulong *)((long)puVar21 +
                                 ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3));
              goto LAB_008ce9a0;
            }
            puVar20 = puVar20 + 1;
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 8))) {
            if ((int)*puVar20 == (int)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 4);
              puVar20 = (ulong *)((long)puVar20 + 4);
            }
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 6))) {
            if ((short)*puVar20 == (short)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 2);
              puVar20 = (ulong *)((long)puVar20 + 2);
            }
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 5))) {
            if ((char)*puVar20 == (char)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 1);
            }
          }
LAB_008ce9a0:
          uVar17 = (uint)((long)puVar21 - (long)puVar2);
          uVar10 = uVar17 - 0xf;
          plVar32 = (long *)((long)plVar32 + ((long)puVar21 - (long)puVar2 & 0xffffffffU) + 4);
          if (uVar17 < 0xf) goto LAB_008cea34;
          *(char *)param_3 = (char)*param_3 + '\x0f';
          psVar13[0] = -1;
          psVar13[1] = -1;
          if (0x3fb < uVar10) {
            uVar22 = (ulong)((uVar17 - 0x40b) / 0x3fc << 2);
            memset((short *)((long)plVar15 + 6),0xff,uVar22 + 4);
            uVar10 = (uVar17 - 0x40b) % 0x3fc;
            psVar13 = (short *)((long)plVar15 + 6 + uVar22);
          }
          uVar17 = (uVar10 & 0xffff) / 0xff;
          pcVar1 = (char *)((long)psVar13 + (ulong)uVar17);
          *pcVar1 = (char)uVar10 + (char)uVar17;
          param_3 = (short *)(pcVar1 + 1);
        }
        if (plVar30 <= plVar32) goto LAB_008cef74;
        lVar28 = *plVar32;
        *(int *)((long)pvVar31 +
                ((ulong)(*(long *)((long)plVar32 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)plVar32 + -2) - iVar27;
        uVar22 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar17 = (int)plVar32 - iVar27;
        uVar10 = *(uint *)((long)pvVar31 + uVar22);
        *(uint *)((long)pvVar31 + uVar22) = uVar17;
        if ((uVar10 + 0xffff < uVar17) ||
           (plVar18 = (long *)(lVar29 + (ulong)uVar10), (int)*plVar18 != (int)*plVar32))
        goto LAB_008ce6f0;
        plVar15 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
      } while( true );
    }
    if (0x7e000000 < param_4) {
      return 0;
    }
    if (param_4 == 0) {
LAB_008cf0b0:
      *(char *)param_3 = '\0';
      return 1;
    }
    uVar4 = *(uint *)((long)pvVar31 + 0x4010);
    uVar25 = (ulong)param_4;
    *(undefined4 *)((long)pvVar31 + 0x4014) = 3;
    *(uint *)((long)pvVar31 + 0x4018) = *(int *)((long)pvVar31 + 0x4018) + param_4;
    *(uint *)((long)pvVar31 + 0x4010) = uVar4 + param_4;
    if (0xc < param_4) {
      plVar30 = (long *)((long)param_2 + (uVar25 - 0xb));
      puVar34 = (ulong *)((long)param_2 + (uVar25 - 0xc));
      lVar28 = (long)param_2 - (ulong)uVar4;
      *(short *)((long)pvVar31 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
           (short)uVar4;
      plVar32 = param_2;
LAB_008ce19c:
      uVar22 = 1;
      plVar15 = (long *)((long)plVar32 + 1U);
      uVar10 = param_6 << 6;
      iVar27 = *(int *)((long)plVar32 + 1U);
      do {
        plVar16 = plVar15;
        plVar15 = (long *)((long)plVar16 + uVar22);
        plVar18 = plVar32;
        if (plVar30 < plVar15) goto LAB_008cf0d0;
        lVar29 = *plVar15;
        uVar17 = (uint)(iVar27 * -0x61c8864f) >> 0x13;
        uVar19 = (ulong)*(ushort *)((long)pvVar31 + (ulong)uVar17 * 2);
        bVar9 = *(int *)(lVar28 + uVar19) != iVar27;
        uVar22 = (ulong)(uVar10 >> 6);
        sVar8 = (short)lVar28;
        uVar10 = uVar10 + 1;
        *(short *)((long)pvVar31 + (ulong)uVar17 * 2) = (short)plVar16 - sVar8;
        iVar27 = (int)lVar29;
      } while (bVar9);
      plVar15 = (long *)(lVar28 + uVar19);
      if ((param_2 < plVar15) && (*(char *)((long)plVar16 - 1) == *(char *)((long)plVar15 - 1))) {
        plVar11 = (long *)((long)plVar16 - 1U);
        plVar12 = (long *)((long)param_2 + uVar19 + ~(ulong)uVar4);
        plVar26 = (long *)((long)plVar16 - 1U);
        do {
          plVar16 = plVar26;
          plVar15 = plVar12;
          plVar18 = plVar11;
          if ((plVar15 <= param_2) || (plVar18 <= plVar32)) break;
          plVar11 = (long *)((long)plVar18 + -1);
          plVar12 = (long *)((long)plVar15 + -1);
          plVar26 = (long *)((long)plVar16 - 1);
        } while (*(char *)((long)plVar18 + -1) == *(char *)((long)plVar15 + -1));
      }
      else {
        plVar18 = plVar16;
      }
      plVar11 = (long *)((long)param_3 + 1);
      uVar17 = (uint)((long)plVar16 - (long)plVar32);
      uVar10 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)param_3 = (char)(uVar17 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar12 = plVar11;
        if (0xfe < uVar10) {
          uVar10 = ((int)plVar16 - (int)plVar32) - 0x10e;
          uVar22 = (ulong)uVar10 / 0xff;
          memset(plVar11,0xff,uVar22 + 1);
          plVar12 = (long *)((long)param_3 + uVar22 + 2);
          uVar10 = uVar10 + (int)uVar22;
        }
        plVar11 = (long *)((long)plVar12 + 1);
        *(char *)plVar12 = (char)uVar10;
      }
      uVar19 = (long)plVar16 - (long)plVar32 & 0xffffffff;
      uVar22 = uVar19;
      if (uVar19 < 9) {
        uVar22 = 8;
      }
      plVar16 = (long *)((long)plVar11 + uVar19);
      psVar13 = param_3;
      if ((0x18 < uVar19) && (0x1f < (ulong)((long)plVar11 - (long)plVar32))) {
        plVar12 = plVar11 + 2;
        plVar26 = plVar32 + 2;
        uVar22 = (uVar22 - 1 >> 3) + 1;
        uVar23 = uVar22 & 0x3ffffffffffffffc;
        plVar32 = plVar32 + uVar23;
        plVar11 = plVar11 + uVar23;
        uVar19 = uVar23;
        do {
          plVar7 = plVar26 + -1;
          lVar29 = plVar26[-2];
          lVar36 = plVar26[1];
          lVar35 = *plVar26;
          uVar19 = uVar19 - 4;
          plVar26 = plVar26 + 4;
          plVar12[-1] = *plVar7;
          plVar12[-2] = lVar29;
          plVar12[1] = lVar36;
          *plVar12 = lVar35;
          plVar12 = plVar12 + 4;
        } while (uVar19 != 0);
        if (uVar22 == uVar23) goto LAB_008ce318;
      }
      do {
        plVar12 = plVar11 + 1;
        *plVar11 = *plVar32;
        plVar32 = plVar32 + 1;
        plVar11 = plVar12;
      } while (plVar12 < plVar16);
LAB_008ce318:
      do {
        puVar2 = (ulong *)((long)plVar18 + 4);
        puVar20 = (ulong *)((long)plVar15 + 4);
        param_3 = (short *)((long)plVar16 + 2);
        *(short *)plVar16 = (short)plVar18 - (short)plVar15;
        puVar21 = puVar2;
        if (puVar2 < puVar34) {
          if (*puVar20 == *puVar2) {
            puVar21 = (ulong *)((long)plVar18 + 0xc);
            puVar20 = (ulong *)((long)plVar15 + 0xc);
            goto joined_r0x008ce50c;
          }
          uVar22 = *puVar2 ^ *puVar20;
          uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
          uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
          uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          uVar22 = (ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
          uVar17 = (uint)uVar22;
          plVar18 = (long *)((long)plVar18 + uVar22 + 4);
LAB_008ce4a0:
          *(char *)psVar13 = (char)*psVar13 + (char)uVar17;
        }
        else {
joined_r0x008ce50c:
          for (; puVar21 < puVar34; puVar21 = puVar21 + 1) {
            if (*puVar20 != *puVar21) {
              uVar22 = *puVar21 ^ *puVar20;
              uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
              uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
              uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
              uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
              puVar21 = (ulong *)((long)puVar21 +
                                 ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3));
              goto LAB_008ce418;
            }
            puVar20 = puVar20 + 1;
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 8))) {
            if ((int)*puVar20 == (int)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 4);
              puVar20 = (ulong *)((long)puVar20 + 4);
            }
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 6))) {
            if ((short)*puVar20 == (short)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 2);
              puVar20 = (ulong *)((long)puVar20 + 2);
            }
          }
          if (puVar21 < (ulong *)((long)param_2 + (uVar25 - 5))) {
            if ((char)*puVar20 == (char)*puVar21) {
              puVar21 = (ulong *)((long)puVar21 + 1);
            }
          }
LAB_008ce418:
          uVar17 = (uint)((long)puVar21 - (long)puVar2);
          uVar10 = uVar17 - 0xf;
          plVar18 = (long *)((long)plVar18 + ((long)puVar21 - (long)puVar2 & 0xffffffffU) + 4);
          if (uVar17 < 0xf) goto LAB_008ce4a0;
          *(char *)psVar13 = (char)*psVar13 + '\x0f';
          param_3[0] = -1;
          param_3[1] = -1;
          if (0x3fb < uVar10) {
            uVar22 = (ulong)((uVar17 - 0x40b) / 0x3fc << 2);
            memset((short *)((long)plVar16 + 6),0xff,uVar22 + 4);
            uVar10 = (uVar17 - 0x40b) % 0x3fc;
            param_3 = (short *)((long)plVar16 + 6 + uVar22);
          }
          uVar17 = (uVar10 & 0xffff) / 0xff;
          pcVar1 = (char *)((long)param_3 + (ulong)uVar17);
          param_3 = (short *)(pcVar1 + 1);
          *pcVar1 = (char)uVar10 + (char)uVar17;
        }
        if (plVar30 <= plVar18) break;
        lVar29 = *plVar18;
        uVar10 = (uint)((int)lVar29 * -0x61c8864f) >> 0x13;
        *(short *)((long)pvVar31 +
                  (ulong)((uint)(*(int *)((long)plVar18 + -2) * -0x61c8864f) >> 0x13) * 2) =
             (short)(int *)((long)plVar18 + -2) - sVar8;
        plVar15 = (long *)(lVar28 + (ulong)*(ushort *)((long)pvVar31 + (ulong)uVar10 * 2));
        lVar35 = *plVar15;
        *(short *)((long)pvVar31 + (ulong)uVar10 * 2) = (short)plVar18 - sVar8;
        if ((int)lVar35 != (int)lVar29) goto LAB_008ce514;
        plVar16 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
        psVar13 = param_3;
      } while( true );
    }
LAB_008cf0d0:
    __n = (long)param_2 + (uVar25 - (long)plVar18);
    uVar22 = __n - 0xf;
    if (__n < 0xf) {
      *(char *)param_3 = (char)((int)__n << 4);
    }
    else {
      psVar13 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar22) {
        uVar22 = (long)param_2 + (uVar25 - (long)plVar18) + -0x10e;
        uVar25 = uVar22 / 0xff;
        memset(psVar13,0xff,uVar25 + 1);
        psVar13 = (short *)((long)param_3 + uVar25 + 2);
        uVar22 = uVar22 % 0xff;
      }
      *(char *)psVar13 = (char)uVar22;
      param_3 = psVar13;
    }
  }
  memcpy((char *)((long)param_3 + 1),plVar18,__n);
  return ((int)(char *)((long)param_3 + 1) + (int)__n) - iVar33;
LAB_008ceb10:
  plVar18 = (long *)((long)plVar16 + (ulong)uVar10 + 6);
  plVar32 = (long *)((long)plVar16 + (ulong)uVar10 + 5);
  if (plVar15 < plVar18) {
LAB_008cefe8:
    uVar22 = (long)param_2 + (uVar25 - (long)plVar30);
    if (pcVar1 < (char *)((long)param_3 + (uVar22 + 0xf0) / 0xff + uVar22 + 1)) {
      return 0;
    }
    uVar19 = uVar22 - 0xf;
    if (uVar22 < 0xf) {
      *(char *)param_3 = (char)((int)uVar22 << 4);
    }
    else {
      psVar13 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar19) {
        uVar19 = (long)param_2 + (uVar25 - (long)plVar30) + -0x10e;
        uVar25 = uVar19 / 0xff;
        memset(psVar13,0xff,uVar25 + 1);
        psVar13 = (short *)((long)param_3 + uVar25 + 2);
        uVar19 = uVar19 % 0xff;
      }
      *(char *)psVar13 = (char)uVar19;
      param_3 = psVar13;
    }
    memcpy((char *)((long)param_3 + 1),plVar30,uVar22);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar22) - iVar33;
  }
  goto LAB_008ceb28;
LAB_008ce6f0:
  plVar18 = (long *)((long)plVar32 + 2);
  if (plVar30 < plVar18) {
LAB_008cef74:
    uVar19 = (long)param_2 + (uVar25 - (long)plVar32);
    uVar22 = uVar19 - 0xf;
    if (uVar19 < 0xf) {
      *(char *)param_3 = (char)((int)uVar19 << 4);
    }
    else {
      psVar13 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar22) {
        uVar22 = (long)param_2 + (uVar25 - (long)plVar32) + -0x10e;
        uVar25 = uVar22 / 0xff;
        memset(psVar13,0xff,uVar25 + 1);
        psVar13 = (short *)((long)param_3 + uVar25 + 2);
        uVar22 = uVar22 % 0xff;
      }
      *(char *)psVar13 = (char)uVar22;
      param_3 = psVar13;
    }
    memcpy((char *)((long)param_3 + 1),plVar32,uVar19);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar19) - iVar33;
  }
  goto LAB_008ce704;
LAB_008ce514:
  plVar32 = plVar18;
  goto LAB_008ce19c;
}

