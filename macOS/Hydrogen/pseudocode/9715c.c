
/* WARNING: Type propagation algorithm not settling */

int FUN_0009715c(undefined8 param_1)

{
  ulong *puVar1;
  uint *puVar2;
  char *pcVar3;
  char *pcVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  short sVar8;
  int *piVar9;
  int *piVar10;
  int *piVar11;
  bool bVar12;
  long *plVar14;
  long *plVar13;
  short *psVar15;
  int *piVar16;
  int *piVar17;
  int *piVar18;
  long *plVar19;
  int *piVar20;
  int *piVar21;
  short *psVar22;
  long *plVar23;
  uint uVar24;
  long *plVar25;
  short *psVar26;
  ulong uVar27;
  ulong *puVar28;
  ulong *puVar29;
  long *plVar30;
  ulong uVar31;
  long lVar32;
  int iVar33;
  ulong uVar34;
  ulong uVar35;
  uint uVar36;
  long *plVar37;
  uint unaff_w21;
  uint unaff_w22;
  long lVar38;
  int *piVar39;
  uint unaff_w23;
  long *plVar40;
  int iVar41;
  long unaff_x24;
  short *psVar42;
  int iVar43;
  short *unaff_x27;
  long *plVar44;
  ulong *puVar45;
  int *piVar46;
  long unaff_x29;
  undefined8 uVar47;
  long lVar48;
  undefined8 uVar49;
  long lVar50;
  undefined8 uVar51;
  long lVar52;
  undefined8 uVar53;
  long lVar54;
  undefined8 uVar55;
  long lVar56;
  undefined8 uVar57;
  long lVar58;
  undefined8 uVar59;
  
  _bzero(param_1,&UNK_00004020);
  puVar2 = (uint *)(&UNK_00004010 + unaff_x24);
  if ((int)unaff_w23 < 2) {
    unaff_w23 = 1;
  }
  if (0x10000 < unaff_w23) {
    unaff_w23 = 0x10001;
  }
  iVar43 = (int)unaff_x27;
  if (unaff_w22 < 0x7e000001) {
    if ((int)((uint)((ulong)unaff_w22 * 0x8080808081 >> 0x27) + 0x10) <= (int)unaff_w21)
    goto code_r0x0009719c;
  }
  else if (unaff_w21 < 0x80000000) {
code_r0x0009719c:
    if (0x1000a < (int)unaff_w22) {
      if (0x7e000000 < unaff_w22) {
        return 0;
      }
      uVar5 = *puVar2;
      plVar40 = *(long **)(unaff_x29 + -0x58);
      lVar38 = (long)plVar40 - (ulong)uVar5;
      uVar35 = (ulong)unaff_w22;
      plVar37 = (long *)((long)plVar40 + (uVar35 - 0xb));
      *(uint *)(&UNK_00004018 + unaff_x24) = *(int *)(&UNK_00004018 + unaff_x24) + unaff_w22;
      *puVar2 = uVar5 + unaff_w22;
      *(undefined4 *)(&UNK_00004014 + unaff_x24) = 2;
      plVar23 = (long *)((long)plVar40 + 2);
      *(uint *)(unaff_x24 + ((ulong)(*plVar40 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar5;
      puVar45 = (ulong *)((long)plVar40 + (uVar35 - 0xc));
      plVar30 = plVar40;
code_r0x00097cf4:
      uVar36 = unaff_w23 << 6 | 1;
      lVar32 = *(long *)((long)plVar30 + 1U);
      plVar44 = (long *)((long)plVar30 + 1U);
      uVar24 = unaff_w23;
      while( true ) {
        uVar34 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar6 = *(uint *)(unaff_x24 + uVar34);
        uVar27 = (ulong)uVar6;
        iVar41 = (int)lVar38;
        uVar7 = (int)plVar44 - iVar41;
        lVar32 = *plVar23;
        *(uint *)(unaff_x24 + uVar34) = uVar7;
        if ((uVar7 <= uVar6 + 0xffff) && (*(int *)(lVar38 + uVar27) == (int)*plVar44)) break;
        plVar13 = (long *)((long)plVar23 + (ulong)uVar24);
        uVar24 = uVar36 >> 6;
        uVar36 = uVar36 + 1;
        plVar44 = plVar23;
        plVar23 = plVar13;
        if (plVar37 < plVar13) goto LAB_00098590;
      }
      piVar18 = (int *)(lVar38 + uVar27);
      if ((*(int **)(unaff_x29 + -0x58) < piVar18) &&
         (*(char *)((long)plVar44 - 1) == *(char *)((long)piVar18 - 1))) {
        piVar16 = (int *)((long)plVar40 + uVar27 + ~(ulong)uVar5);
        plVar13 = (long *)((long)plVar44 - 1U);
        plVar19 = (long *)((long)plVar44 - 1U);
        do {
          plVar44 = plVar19;
          plVar23 = plVar13;
          piVar18 = piVar16;
          if ((piVar18 <= *(int **)(unaff_x29 + -0x58)) || (plVar23 <= plVar30)) break;
          piVar16 = (int *)((long)piVar18 + -1);
          plVar13 = (long *)((long)plVar23 + -1);
          plVar19 = (long *)((long)plVar44 - 1);
        } while (*(char *)((long)plVar23 + -1) == *(char *)((long)piVar18 + -1));
      }
      else {
        plVar23 = plVar44;
      }
      plVar13 = (long *)((long)unaff_x27 + 1);
      uVar24 = (uint)((long)plVar44 - (long)plVar30);
      uVar36 = uVar24 - 0xf;
      if (uVar24 < 0xf) {
        *(char *)unaff_x27 = (char)(uVar24 << 4);
      }
      else {
        *(char *)unaff_x27 = -0x10;
        plVar19 = plVar13;
        if (0xfe < uVar36) {
          uVar36 = ((int)plVar44 - (int)plVar30) - 0x10e;
          uVar27 = (ulong)uVar36 / 0xff;
          _memset(plVar13,0xff,uVar27 + 1);
          uVar36 = uVar36 + (int)uVar27;
          plVar19 = (long *)((long)unaff_x27 + uVar27 + 2);
        }
        plVar13 = (long *)((long)plVar19 + 1);
        *(char *)plVar19 = (char)uVar36;
      }
      plVar44 = (long *)((long)plVar13 + ((long)plVar44 - (long)plVar30 & 0xffffffffU));
      plVar19 = plVar44;
      if (plVar44 <= plVar13 + 1) {
        plVar19 = plVar13 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar19 + ~(ulong)plVar13)) &&
         (0x3f < (ulong)((long)plVar13 - (long)plVar30))) {
        uVar27 = ((long)plVar19 + ~(ulong)plVar13 >> 3) + 1;
        uVar31 = uVar27 & 0x3ffffffffffffff8;
        plVar19 = plVar30 + 4;
        plVar14 = plVar13 + 4;
        uVar34 = uVar31;
        do {
          lVar32 = plVar19[-4];
          lVar50 = plVar19[-1];
          lVar48 = plVar19[-2];
          lVar54 = plVar19[1];
          lVar52 = *plVar19;
          lVar58 = plVar19[3];
          lVar56 = plVar19[2];
          plVar14[-3] = plVar19[-3];
          plVar14[-4] = lVar32;
          plVar14[-1] = lVar50;
          plVar14[-2] = lVar48;
          plVar14[1] = lVar54;
          *plVar14 = lVar52;
          plVar14[3] = lVar58;
          plVar14[2] = lVar56;
          uVar34 = uVar34 - 8;
          plVar19 = plVar19 + 8;
          plVar14 = plVar14 + 8;
        } while (uVar34 != 0);
        plVar30 = plVar30 + uVar31;
        plVar13 = plVar13 + uVar31;
        if (uVar27 == uVar31) goto code_r0x00097e88;
      }
      do {
        plVar19 = plVar13 + 1;
        *plVar13 = *plVar30;
        plVar30 = plVar30 + 1;
        plVar13 = plVar19;
      } while (plVar19 < plVar44);
code_r0x00097e88:
      plVar30 = plVar23;
      do {
        psVar15 = (short *)((long)plVar44 + 2);
        *(short *)plVar44 = (short)plVar30 - (short)piVar18;
        puVar1 = (ulong *)((long)plVar30 + 4);
        puVar29 = (ulong *)(piVar18 + 1);
        if (puVar1 < puVar45) {
          uVar27 = *puVar1 ^ *puVar29;
          if (uVar27 == 0) {
            puVar29 = (ulong *)(piVar18 + 3);
            puVar28 = (ulong *)((long)plVar30 + 0xc);
            goto LAB_00097edc;
          }
          uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
          uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
          uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
          uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
          uVar24 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
          plVar30 = (long *)((long)plVar30 + (ulong)(uVar24 + 4));
LAB_00097fa0:
          *(char *)unaff_x27 = (char)*unaff_x27 + (char)uVar24;
          unaff_x27 = psVar15;
        }
        else {
          puVar28 = puVar1;
LAB_00097edc:
          for (; puVar28 < puVar45; puVar28 = puVar28 + 1) {
            uVar27 = *puVar28 ^ *puVar29;
            if (uVar27 != 0) {
              uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
              uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
              uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
              uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
              puVar28 = (ulong *)((long)puVar28 +
                                 ((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3));
              goto code_r0x00097f0c;
            }
            puVar29 = puVar29 + 1;
          }
          if (puVar28 < (ulong *)((long)plVar40 + (uVar35 - 8))) {
            if ((int)*puVar29 == (int)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 4);
              puVar29 = (ulong *)((long)puVar29 + 4);
            }
          }
          if (puVar28 < (ulong *)((long)plVar40 + (uVar35 - 6))) {
            if ((short)*puVar29 == (short)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 2);
              puVar29 = (ulong *)((long)puVar29 + 2);
            }
          }
          if (puVar28 < (ulong *)((long)plVar40 + (uVar35 - 5))) {
            if ((char)*puVar29 == (char)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 1);
            }
          }
code_r0x00097f0c:
          plVar30 = (long *)((long)plVar30 + ((long)puVar28 - (long)puVar1 & 0xffffffffU) + 4);
          uVar24 = (uint)((long)puVar28 - (long)puVar1);
          uVar36 = uVar24 - 0xf;
          if (uVar24 < 0xf) goto LAB_00097fa0;
          *(char *)unaff_x27 = (char)*unaff_x27 + '\x0f';
          psVar15[0] = -1;
          psVar15[1] = -1;
          if (0x3fb < uVar36) {
            uVar27 = (ulong)((uVar24 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar44 + 6),0xff,uVar27 + 4);
            uVar36 = (uVar24 - 0x40b) % 0x3fc;
            psVar15 = (short *)((long)plVar44 + 6 + uVar27);
          }
          uVar24 = (uVar36 & 0xffff) / 0xff;
          pcVar3 = (char *)((long)psVar15 + (ulong)uVar24);
          *pcVar3 = (char)uVar36 + (char)uVar24;
          unaff_x27 = (short *)(pcVar3 + 1);
        }
        if (plVar37 <= plVar30) goto LAB_00098590;
        *(int *)(unaff_x24 +
                ((ulong)(*(long *)((long)plVar30 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)plVar30 + -2) - iVar41;
        uVar24 = (int)plVar30 - iVar41;
        uVar27 = (ulong)(*plVar30 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar36 = *(uint *)(unaff_x24 + uVar27);
        *(uint *)(unaff_x24 + uVar27) = uVar24;
        if ((uVar36 + 0xffff < uVar24) ||
           (piVar18 = (int *)(lVar38 + (ulong)uVar36), *piVar18 != (int)*plVar30))
        goto code_r0x00097ce0;
        plVar44 = (long *)((long)unaff_x27 + 1);
        *(char *)unaff_x27 = '\0';
      } while( true );
    }
    if (0x7e000000 < unaff_w22) {
      return 0;
    }
    if (unaff_w22 != 0) {
      uVar5 = *puVar2;
      uVar35 = (ulong)unaff_w22;
      plVar30 = *(long **)(unaff_x29 + -0x58);
      *(uint *)(&UNK_00004018 + unaff_x24) = *(int *)(&UNK_00004018 + unaff_x24) + unaff_w22;
      *puVar2 = uVar5 + unaff_w22;
      *(undefined4 *)(&UNK_00004014 + unaff_x24) = 3;
      plVar23 = plVar30;
      if (0xc < unaff_w22) {
        plVar44 = *(long **)(unaff_x29 + -0x58);
        lVar38 = (long)plVar44 - (ulong)uVar5;
        plVar40 = (long *)((long)plVar30 + (uVar35 - 0xb));
        *(short *)(unaff_x24 + (ulong)((uint)((int)*plVar44 * -0x61c8864f) >> 0x13) * 2) =
             (short)uVar5;
        puVar45 = (ulong *)((long)plVar30 + (uVar35 - 0xc));
        plVar37 = plVar44;
code_r0x00097258:
        uVar27 = 1;
        plVar13 = (long *)((long)plVar37 + 1U);
        uVar36 = unaff_w23 << 6;
        iVar41 = *(int *)((long)plVar37 + 1U);
        do {
          plVar19 = plVar13;
          plVar13 = (long *)((long)plVar19 + uVar27);
          plVar23 = plVar37;
          if (plVar40 < plVar13) goto LAB_000986e8;
          uVar27 = (ulong)(uVar36 >> 6);
          uVar36 = uVar36 + 1;
          lVar32 = (ulong)((uint)(iVar41 * -0x61c8864f) >> 0x13) * 2;
          uVar34 = (ulong)*(ushort *)(unaff_x24 + lVar32);
          sVar8 = (short)lVar38;
          lVar48 = *plVar13;
          *(short *)(unaff_x24 + lVar32) = (short)plVar19 - sVar8;
          bVar12 = *(int *)(lVar38 + uVar34) != iVar41;
          iVar41 = (int)lVar48;
        } while (bVar12);
        piVar18 = (int *)(lVar38 + uVar34);
        if ((*(int **)(unaff_x29 + -0x58) < piVar18) &&
           (*(char *)((long)plVar19 - 1) == *(char *)((long)piVar18 - 1))) {
          piVar16 = (int *)((long)plVar44 + uVar34 + ~(ulong)uVar5);
          plVar13 = (long *)((long)plVar19 - 1U);
          plVar14 = (long *)((long)plVar19 - 1U);
          do {
            plVar19 = plVar14;
            plVar23 = plVar13;
            piVar18 = piVar16;
            if ((piVar18 <= *(int **)(unaff_x29 + -0x58)) || (plVar23 <= plVar37)) break;
            piVar16 = (int *)((long)piVar18 + -1);
            plVar13 = (long *)((long)plVar23 + -1);
            plVar14 = (long *)((long)plVar19 - 1);
          } while (*(char *)((long)plVar23 + -1) == *(char *)((long)piVar18 + -1));
        }
        else {
          plVar23 = plVar19;
        }
        plVar13 = (long *)((long)unaff_x27 + 1);
        uVar24 = (uint)((long)plVar19 - (long)plVar37);
        uVar36 = uVar24 - 0xf;
        if (uVar24 < 0xf) {
          *(char *)unaff_x27 = (char)(uVar24 << 4);
        }
        else {
          *(char *)unaff_x27 = -0x10;
          plVar14 = plVar13;
          if (0xfe < uVar36) {
            uVar36 = ((int)plVar19 - (int)plVar37) - 0x10e;
            uVar27 = (ulong)uVar36 / 0xff;
            _memset(plVar13,0xff,uVar27 + 1);
            uVar36 = uVar36 + (int)uVar27;
            plVar14 = (long *)((long)unaff_x27 + uVar27 + 2);
          }
          plVar13 = (long *)((long)plVar14 + 1);
          *(char *)plVar14 = (char)uVar36;
        }
        plVar19 = (long *)((long)plVar13 + ((long)plVar19 - (long)plVar37 & 0xffffffffU));
        plVar14 = plVar19;
        if (plVar19 <= plVar13 + 1) {
          plVar14 = plVar13 + 1;
        }
        psVar15 = unaff_x27;
        if (((char *)((long)plVar14 + ~(ulong)plVar13) < &segment_command_00000020.vmaddr) ||
           ((ulong)((long)plVar13 - (long)plVar37) < 0x40)) {
          plVar14 = plVar37;
          plVar25 = plVar13;
        }
        else {
          uVar27 = ((long)plVar14 + ~(ulong)plVar13 >> 3) + 1;
          uVar31 = uVar27 & 0x3ffffffffffffff8;
          plVar14 = plVar37 + uVar31;
          plVar25 = plVar13 + uVar31;
          plVar37 = plVar37 + 4;
          plVar13 = plVar13 + 4;
          uVar34 = uVar31;
          do {
            lVar32 = plVar37[-4];
            lVar50 = plVar37[-1];
            lVar48 = plVar37[-2];
            lVar54 = plVar37[1];
            lVar52 = *plVar37;
            lVar58 = plVar37[3];
            lVar56 = plVar37[2];
            plVar13[-3] = plVar37[-3];
            plVar13[-4] = lVar32;
            plVar13[-1] = lVar50;
            plVar13[-2] = lVar48;
            plVar13[1] = lVar54;
            *plVar13 = lVar52;
            plVar13[3] = lVar58;
            plVar13[2] = lVar56;
            uVar34 = uVar34 - 8;
            plVar37 = plVar37 + 8;
            plVar13 = plVar13 + 8;
          } while (uVar34 != 0);
          if (uVar27 == uVar31) goto LAB_000973d8;
        }
        do {
          plVar37 = plVar25 + 1;
          *plVar25 = *plVar14;
          plVar14 = plVar14 + 1;
          plVar25 = plVar37;
        } while (plVar37 < plVar19);
LAB_000973d8:
        do {
          unaff_x27 = (short *)((long)plVar19 + 2);
          *(short *)plVar19 = (short)plVar23 - (short)piVar18;
          puVar1 = (ulong *)((long)plVar23 + 4);
          puVar29 = (ulong *)(piVar18 + 1);
          if (puVar1 < puVar45) {
            uVar27 = *puVar1 ^ *puVar29;
            if (uVar27 == 0) {
              puVar29 = (ulong *)(piVar18 + 3);
              puVar28 = (ulong *)((long)plVar23 + 0xc);
              goto LAB_00097424;
            }
            uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
            uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
            uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
            uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
            uVar24 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
            plVar23 = (long *)((long)plVar23 + (ulong)(uVar24 + 4));
code_r0x000974dc:
            *(char *)psVar15 = (char)*psVar15 + (char)uVar24;
          }
          else {
            puVar28 = puVar1;
LAB_00097424:
            for (; puVar28 < puVar45; puVar28 = puVar28 + 1) {
              uVar27 = *puVar28 ^ *puVar29;
              if (uVar27 != 0) {
                uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
                uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
                uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
                uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
                puVar28 = (ulong *)((long)puVar28 +
                                   ((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3));
                goto code_r0x00097454;
              }
              puVar29 = puVar29 + 1;
            }
            if (puVar28 < (ulong *)((long)plVar30 + (uVar35 - 8))) {
              if ((int)*puVar29 == (int)*puVar28) {
                puVar28 = (ulong *)((long)puVar28 + 4);
                puVar29 = (ulong *)((long)puVar29 + 4);
              }
            }
            if (puVar28 < (ulong *)((long)plVar30 + (uVar35 - 6))) {
              if ((short)*puVar29 == (short)*puVar28) {
                puVar28 = (ulong *)((long)puVar28 + 2);
                puVar29 = (ulong *)((long)puVar29 + 2);
              }
            }
            if (puVar28 < (ulong *)((long)plVar30 + (uVar35 - 5))) {
              if ((char)*puVar29 == (char)*puVar28) {
                puVar28 = (ulong *)((long)puVar28 + 1);
              }
            }
code_r0x00097454:
            plVar23 = (long *)((long)plVar23 + ((long)puVar28 - (long)puVar1 & 0xffffffffU) + 4);
            uVar24 = (uint)((long)puVar28 - (long)puVar1);
            uVar36 = uVar24 - 0xf;
            if (uVar24 < 0xf) goto code_r0x000974dc;
            *(char *)psVar15 = (char)*psVar15 + '\x0f';
            unaff_x27[0] = -1;
            unaff_x27[1] = -1;
            if (0x3fb < uVar36) {
              uVar27 = (ulong)((uVar24 - 0x40b) / 0x3fc << 2);
              _memset((short *)((long)plVar19 + 6),0xff,uVar27 + 4);
              uVar36 = (uVar24 - 0x40b) % 0x3fc;
              unaff_x27 = (short *)((long)plVar19 + 6 + uVar27);
            }
            uVar24 = (uVar36 & 0xffff) / 0xff;
            pcVar3 = (char *)((long)unaff_x27 + (ulong)uVar24);
            unaff_x27 = (short *)(pcVar3 + 1);
            *pcVar3 = (char)uVar36 + (char)uVar24;
          }
          if (plVar40 <= plVar23) break;
          *(short *)(unaff_x24 +
                    (ulong)((uint)(*(int *)((long)plVar23 + -2) * -0x61c8864f) >> 0x13) * 2) =
               (short)(int *)((long)plVar23 + -2) - sVar8;
          lVar48 = *plVar23;
          lVar32 = (ulong)((uint)((int)lVar48 * -0x61c8864f) >> 0x13) * 2;
          piVar18 = (int *)(lVar38 + (ulong)*(ushort *)(unaff_x24 + lVar32));
          *(short *)(unaff_x24 + lVar32) = (short)plVar23 - sVar8;
          if (*piVar18 != (int)lVar48) goto code_r0x000975dc;
          plVar19 = (long *)((long)unaff_x27 + 1);
          *(char *)unaff_x27 = '\0';
          psVar15 = unaff_x27;
        } while( true );
      }
LAB_000986e8:
      uVar34 = (long)plVar30 + (uVar35 - (long)plVar23);
      uVar27 = uVar34 - 0xf;
      if (uVar34 < 0xf) {
        *(char *)unaff_x27 = (char)((int)uVar34 << 4);
      }
      else {
        psVar15 = (short *)((long)unaff_x27 + 1);
        *(char *)unaff_x27 = -0x10;
        if (0xfe < uVar27) {
          uVar27 = ((*(long *)(unaff_x29 + -0x58) + uVar35) - (long)plVar23) - 0x10e;
          uVar35 = uVar27 / 0xff;
          _memset(psVar15,0xff,uVar35 + 1);
          uVar27 = uVar27 % 0xff;
          psVar15 = (short *)((long)unaff_x27 + uVar35 + 2);
        }
        *(char *)psVar15 = (char)uVar27;
        unaff_x27 = psVar15;
      }
LAB_00098840:
      _memcpy((char *)((long)unaff_x27 + 1),plVar23,uVar34);
      return ((int)(char *)((long)unaff_x27 + 1) + (int)uVar34) - iVar43;
    }
    goto code_r0x000986cc;
  }
  if ((int)unaff_w22 < 0x1000b) {
    if (unaff_w22 < 0x7e000001) {
      if (unaff_w22 == 0) {
        if (0 < (int)unaff_w21) {
code_r0x000986cc:
          *(char *)unaff_x27 = '\0';
          return 1;
        }
      }
      else {
        uVar5 = *puVar2;
        uVar35 = (ulong)unaff_w22;
        piVar16 = *(int **)(unaff_x29 + -0x58);
        pcVar3 = (char *)((long)unaff_x27 + (long)(int)unaff_w21);
        *(uint *)(&UNK_00004018 + unaff_x24) = *(int *)(&UNK_00004018 + unaff_x24) + unaff_w22;
        *puVar2 = uVar5 + unaff_w22;
        *(undefined4 *)(&UNK_00004014 + unaff_x24) = 3;
        piVar18 = piVar16;
        if (0xc < unaff_w22) {
          piVar17 = *(int **)(unaff_x29 + -0x58);
          lVar38 = (long)piVar17 - (ulong)uVar5;
          piVar39 = (int *)((long)piVar16 + (uVar35 - 0xb));
          *(short *)(unaff_x24 + (ulong)((uint)(*piVar17 * -0x61c8864f) >> 0x13) * 2) = (short)uVar5
          ;
          puVar45 = (ulong *)((long)piVar16 + (uVar35 - 0xc));
          piVar18 = piVar17;
code_r0x00097720:
          uVar27 = 1;
          piVar46 = (int *)((long)piVar18 + 1U);
          uVar36 = unaff_w23 << 6;
          iVar41 = *(int *)((long)piVar18 + 1U);
          do {
            piVar20 = piVar46;
            piVar46 = (int *)((long)piVar20 + uVar27);
            if (piVar39 < piVar46) goto code_r0x00098774;
            uVar27 = (ulong)(uVar36 >> 6);
            uVar36 = uVar36 + 1;
            lVar32 = (ulong)((uint)(iVar41 * -0x61c8864f) >> 0x13) * 2;
            uVar34 = (ulong)*(ushort *)(unaff_x24 + lVar32);
            sVar8 = (short)lVar38;
            iVar33 = *piVar46;
            *(short *)(unaff_x24 + lVar32) = (short)piVar20 - sVar8;
            bVar12 = *(int *)(lVar38 + uVar34) != iVar41;
            iVar41 = iVar33;
          } while (bVar12);
          piVar46 = (int *)(lVar38 + uVar34);
          if ((*(int **)(unaff_x29 + -0x58) < piVar46) &&
             (*(char *)((long)piVar20 - 1) == *(char *)((long)piVar46 - 1))) {
            piVar9 = (int *)((long)piVar17 + uVar34 + ~(ulong)uVar5);
            piVar10 = (int *)((long)piVar20 - 1U);
            piVar11 = (int *)((long)piVar20 - 1U);
            do {
              piVar20 = piVar11;
              piVar21 = piVar10;
              piVar46 = piVar9;
              if ((piVar46 <= *(int **)(unaff_x29 + -0x58)) || (piVar21 <= piVar18)) break;
              piVar9 = (int *)((long)piVar46 + -1);
              piVar10 = (int *)((long)piVar21 + -1);
              piVar11 = (int *)((long)piVar20 - 1);
            } while (*(char *)((long)piVar21 + -1) == *(char *)((long)piVar46 + -1));
          }
          else {
            piVar21 = piVar20;
          }
          psVar15 = (short *)((long)unaff_x27 + 1);
          uVar27 = (long)piVar20 - (long)piVar18 & 0xffffffff;
          if (pcVar3 < (char *)((long)psVar15 + uVar27 / 0xff + uVar27 + 8)) {
            return 0;
          }
          uVar24 = (uint)((long)piVar20 - (long)piVar18);
          uVar36 = uVar24 - 0xf;
          if (uVar24 < 0xf) {
            *(char *)unaff_x27 = (char)(uVar24 << 4);
          }
          else {
            *(char *)unaff_x27 = -0x10;
            psVar22 = psVar15;
            if (0xfe < uVar36) {
              uVar36 = ((int)piVar20 - (int)piVar18) - 0x10e;
              uVar34 = (ulong)uVar36 / 0xff;
              _memset(psVar15,0xff,uVar34 + 1);
              uVar36 = uVar36 + (int)uVar34;
              psVar22 = (short *)((long)unaff_x27 + uVar34 + 2);
            }
            psVar15 = (short *)((long)psVar22 + 1);
            *(char *)psVar22 = (char)uVar36;
          }
          psVar22 = (short *)((long)psVar15 + uVar27);
          psVar26 = psVar22;
          if (psVar22 <= psVar15 + 4) {
            psVar26 = psVar15 + 4;
          }
          psVar42 = unaff_x27;
          if (((char *)((long)psVar26 + ~(ulong)psVar15) < &segment_command_00000020.vmaddr) ||
             ((ulong)((long)psVar15 - (long)piVar18) < 0x40)) {
            piVar20 = piVar18;
            psVar26 = psVar15;
          }
          else {
            uVar27 = ((long)psVar26 + ~(ulong)psVar15 >> 3) + 1;
            uVar31 = uVar27 & 0x3ffffffffffffff8;
            piVar20 = piVar18 + uVar31 * 2;
            psVar26 = psVar15 + uVar31 * 4;
            piVar18 = piVar18 + 8;
            psVar15 = psVar15 + 0x10;
            uVar34 = uVar31;
            do {
              uVar47 = *(undefined8 *)(piVar18 + -8);
              uVar51 = *(undefined8 *)(piVar18 + -2);
              uVar49 = *(undefined8 *)(piVar18 + -4);
              uVar55 = *(undefined8 *)(piVar18 + 2);
              uVar53 = *(undefined8 *)piVar18;
              uVar59 = *(undefined8 *)(piVar18 + 6);
              uVar57 = *(undefined8 *)(piVar18 + 4);
              *(undefined8 *)(psVar15 + -0xc) = *(undefined8 *)(piVar18 + -6);
              *(undefined8 *)(psVar15 + -0x10) = uVar47;
              *(undefined8 *)(psVar15 + -4) = uVar51;
              *(undefined8 *)(psVar15 + -8) = uVar49;
              *(undefined8 *)(psVar15 + 4) = uVar55;
              *(undefined8 *)psVar15 = uVar53;
              *(undefined8 *)(psVar15 + 0xc) = uVar59;
              *(undefined8 *)(psVar15 + 8) = uVar57;
              uVar34 = uVar34 - 8;
              piVar18 = piVar18 + 0x10;
              psVar15 = psVar15 + 0x20;
            } while (uVar34 != 0);
            if (uVar27 == uVar31) goto code_r0x000978cc;
          }
          do {
            psVar15 = psVar26 + 4;
            *(undefined8 *)psVar26 = *(undefined8 *)piVar20;
            piVar20 = piVar20 + 2;
            psVar26 = psVar15;
          } while (psVar15 < psVar22);
code_r0x000978cc:
          do {
            unaff_x27 = psVar22 + 1;
            *psVar22 = (short)piVar21 - (short)piVar46;
            puVar1 = (ulong *)(piVar21 + 1);
            puVar28 = (ulong *)(piVar46 + 1);
            puVar29 = puVar1;
            if (puVar1 < puVar45) {
              uVar27 = *puVar1 ^ *puVar28;
              if (uVar27 == 0) {
                puVar28 = (ulong *)(piVar46 + 3);
                puVar29 = (ulong *)(piVar21 + 3);
                goto joined_r0x00097b0c;
              }
              uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
              uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
              uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
              uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
              uVar36 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
            }
            else {
joined_r0x00097b0c:
              if (puVar29 < puVar45) {
                iVar41 = ((int)puVar29 - (int)piVar21) + -4;
                do {
                  uVar27 = *puVar29 ^ *puVar28;
                  if (uVar27 != 0) {
                    uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1
                    ;
                    uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2
                    ;
                    uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
                    uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar27 & 0xffff0000ffff) << 0x10;
                    uVar36 = (int)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3) + iVar41;
                    goto code_r0x000979b0;
                  }
                  puVar29 = puVar29 + 1;
                  puVar28 = puVar28 + 1;
                  iVar41 = iVar41 + 8;
                } while (puVar29 < puVar45);
              }
              if (puVar29 < (ulong *)((long)piVar16 + (uVar35 - 8))) {
                if ((int)*puVar28 == (int)*puVar29) {
                  puVar29 = (ulong *)((long)puVar29 + 4);
                  puVar28 = (ulong *)((long)puVar28 + 4);
                }
              }
              if (puVar29 < (ulong *)((long)piVar16 + (uVar35 - 6))) {
                if ((short)*puVar28 == (short)*puVar29) {
                  puVar29 = (ulong *)((long)puVar29 + 2);
                  puVar28 = (ulong *)((long)puVar28 + 2);
                }
              }
              if (puVar29 < (ulong *)((long)piVar16 + (uVar35 - 5))) {
                if ((char)*puVar28 == (char)*puVar29) {
                  puVar29 = (ulong *)((long)puVar29 + 1);
                }
              }
              uVar36 = (int)puVar29 - (int)puVar1;
            }
code_r0x000979b0:
            if (pcVar3 < (char *)((long)psVar22 + (ulong)(uVar36 + 0xf0) / 0xff + 8)) {
              return 0;
            }
            uVar24 = uVar36 - 0xf;
            if (uVar36 < 0xf) {
              *(char *)psVar42 = (char)*psVar42 + (char)uVar36;
            }
            else {
              *(char *)psVar42 = (char)*psVar42 + '\x0f';
              unaff_x27[0] = -1;
              unaff_x27[1] = -1;
              if (0x3fb < uVar24) {
                uVar27 = (ulong)((uVar36 - 0x40b) / 0x3fc << 2);
                _memset(psVar22 + 3,0xff,uVar27 + 4);
                uVar24 = (uVar36 - 0x40b) % 0x3fc;
                unaff_x27 = (short *)((long)(psVar22 + 3) + uVar27);
              }
              uVar6 = (uVar24 & 0xffff) / 0xff;
              pcVar4 = (char *)((long)unaff_x27 + (ulong)uVar6);
              unaff_x27 = (short *)(pcVar4 + 1);
              *pcVar4 = (char)uVar24 + (char)uVar6;
            }
            piVar18 = (int *)((long)piVar21 + (ulong)uVar36 + 4);
            if (piVar39 <= piVar18) break;
            piVar21 = (int *)((long)piVar21 + (ulong)uVar36 + 2);
            *(short *)(unaff_x24 + (ulong)((uint)(*piVar21 * -0x61c8864f) >> 0x13) * 2) =
                 (short)piVar21 - sVar8;
            iVar41 = *piVar18;
            lVar32 = (ulong)((uint)(iVar41 * -0x61c8864f) >> 0x13) * 2;
            piVar46 = (int *)(lVar38 + (ulong)*(ushort *)(unaff_x24 + lVar32));
            *(short *)(unaff_x24 + lVar32) = (short)piVar18 - sVar8;
            if (*piVar46 != iVar41) goto code_r0x00097720;
            psVar22 = (short *)((long)unaff_x27 + 1);
            *(char *)unaff_x27 = '\0';
            piVar21 = piVar18;
            psVar42 = unaff_x27;
          } while( true );
        }
code_r0x00098774:
        uVar27 = (long)piVar16 + (uVar35 - (long)piVar18);
        if ((char *)((long)unaff_x27 + (uVar27 + 0xf0) / 0xff + uVar27 + 1) <= pcVar3) {
          uVar34 = uVar27 - 0xf;
          if (uVar27 < 0xf) {
            *(char *)unaff_x27 = (char)((int)uVar27 << 4);
          }
          else {
            psVar15 = (short *)((long)unaff_x27 + 1);
            *(char *)unaff_x27 = -0x10;
            if (0xfe < uVar34) {
              uVar34 = ((*(long *)(unaff_x29 + -0x58) + uVar35) - (long)piVar18) - 0x10e;
              uVar35 = uVar34 / 0xff;
              _memset(psVar15,0xff,uVar35 + 1);
              uVar34 = uVar34 % 0xff;
              psVar15 = (short *)((long)unaff_x27 + uVar35 + 2);
            }
            *(char *)psVar15 = (char)uVar34;
            unaff_x27 = psVar15;
          }
          _memcpy((char *)((long)unaff_x27 + 1),piVar18,uVar27);
          return ((int)(char *)((long)unaff_x27 + 1) + (int)uVar27) - iVar43;
        }
      }
    }
  }
  else if (unaff_w22 < 0x7e000001) {
    uVar5 = *puVar2;
    plVar37 = *(long **)(unaff_x29 + -0x58);
    lVar38 = (long)plVar37 - (ulong)uVar5;
    uVar35 = (ulong)unaff_w22;
    plVar40 = (long *)((long)plVar37 + (uVar35 - 0xb));
    pcVar3 = (char *)((long)unaff_x27 + (long)(int)unaff_w21);
    *(uint *)(&UNK_00004018 + unaff_x24) = *(int *)(&UNK_00004018 + unaff_x24) + unaff_w22;
    *puVar2 = uVar5 + unaff_w22;
    *(undefined4 *)(&UNK_00004014 + unaff_x24) = 2;
    plVar30 = (long *)((long)plVar37 + 2);
    *(uint *)(unaff_x24 + ((ulong)(*plVar37 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar5;
    puVar45 = (ulong *)((long)plVar37 + (uVar35 - 0xc));
    plVar23 = plVar37;
code_r0x00098118:
    uVar36 = unaff_w23 << 6 | 1;
    lVar32 = *(long *)((long)plVar23 + 1U);
    plVar44 = (long *)((long)plVar23 + 1U);
    uVar24 = unaff_w23;
    while( true ) {
      uVar34 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
      uVar6 = *(uint *)(unaff_x24 + uVar34);
      uVar27 = (ulong)uVar6;
      iVar41 = (int)lVar38;
      uVar7 = (int)plVar44 - iVar41;
      lVar32 = *plVar30;
      *(uint *)(unaff_x24 + uVar34) = uVar7;
      if ((uVar7 <= uVar6 + 0xffff) && (*(int *)(lVar38 + uVar27) == (int)*plVar44)) break;
      plVar13 = (long *)((long)plVar30 + (ulong)uVar24);
      uVar24 = uVar36 >> 6;
      uVar36 = uVar36 + 1;
      plVar44 = plVar30;
      plVar30 = plVar13;
      if (plVar40 < plVar13) goto code_r0x00098604;
    }
    piVar18 = (int *)(lVar38 + uVar27);
    if ((*(int **)(unaff_x29 + -0x58) < piVar18) &&
       (*(char *)((long)plVar44 - 1) == *(char *)((long)piVar18 - 1))) {
      piVar16 = (int *)((long)plVar37 + uVar27 + ~(ulong)uVar5);
      plVar13 = (long *)((long)plVar44 - 1U);
      plVar19 = (long *)((long)plVar44 - 1U);
      do {
        plVar44 = plVar19;
        plVar30 = plVar13;
        piVar18 = piVar16;
        if ((piVar18 <= *(int **)(unaff_x29 + -0x58)) || (plVar30 <= plVar23)) break;
        piVar16 = (int *)((long)piVar18 + -1);
        plVar13 = (long *)((long)plVar30 + -1);
        plVar19 = (long *)((long)plVar44 - 1);
      } while (*(char *)((long)plVar30 + -1) == *(char *)((long)piVar18 + -1));
    }
    else {
      plVar30 = plVar44;
    }
    plVar13 = (long *)((long)unaff_x27 + 1);
    uVar27 = (long)plVar44 - (long)plVar23 & 0xffffffff;
    if ((char *)((long)plVar13 + uVar27 / 0xff + uVar27 + 8) <= pcVar3) {
      uVar24 = (uint)((long)plVar44 - (long)plVar23);
      uVar36 = uVar24 - 0xf;
      if (uVar24 < 0xf) {
        *(char *)unaff_x27 = (char)(uVar24 << 4);
      }
      else {
        *(char *)unaff_x27 = -0x10;
        plVar19 = plVar13;
        if (0xfe < uVar36) {
          uVar36 = ((int)plVar44 - (int)plVar23) - 0x10e;
          uVar34 = (ulong)uVar36 / 0xff;
          _memset(plVar13,0xff,uVar34 + 1);
          uVar36 = uVar36 + (int)uVar34;
          plVar19 = (long *)((long)unaff_x27 + uVar34 + 2);
        }
        plVar13 = (long *)((long)plVar19 + 1);
        *(char *)plVar19 = (char)uVar36;
      }
      plVar44 = (long *)((long)plVar13 + uVar27);
      plVar19 = plVar44;
      if (plVar44 <= plVar13 + 1) {
        plVar19 = plVar13 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar19 + ~(ulong)plVar13)) &&
         (0x3f < (ulong)((long)plVar13 - (long)plVar23))) {
        uVar27 = ((long)plVar19 + ~(ulong)plVar13 >> 3) + 1;
        uVar31 = uVar27 & 0x3ffffffffffffff8;
        plVar19 = plVar23 + 4;
        plVar14 = plVar13 + 4;
        uVar34 = uVar31;
        do {
          lVar32 = plVar19[-4];
          lVar50 = plVar19[-1];
          lVar48 = plVar19[-2];
          lVar54 = plVar19[1];
          lVar52 = *plVar19;
          lVar58 = plVar19[3];
          lVar56 = plVar19[2];
          plVar14[-3] = plVar19[-3];
          plVar14[-4] = lVar32;
          plVar14[-1] = lVar50;
          plVar14[-2] = lVar48;
          plVar14[1] = lVar54;
          *plVar14 = lVar52;
          plVar14[3] = lVar58;
          plVar14[2] = lVar56;
          uVar34 = uVar34 - 8;
          plVar19 = plVar19 + 8;
          plVar14 = plVar14 + 8;
        } while (uVar34 != 0);
        plVar23 = plVar23 + uVar31;
        plVar13 = plVar13 + uVar31;
        if (uVar27 == uVar31) goto code_r0x000982cc;
      }
      do {
        plVar19 = plVar13 + 1;
        *plVar13 = *plVar23;
        plVar23 = plVar23 + 1;
        plVar13 = plVar19;
      } while (plVar19 < plVar44);
code_r0x000982cc:
      plVar23 = plVar30;
      do {
        psVar15 = (short *)((long)plVar44 + 2);
        *(short *)plVar44 = (short)plVar23 - (short)piVar18;
        puVar1 = (ulong *)((long)plVar23 + 4);
        puVar28 = (ulong *)(piVar18 + 1);
        puVar29 = puVar1;
        if (puVar1 < puVar45) {
          uVar27 = *puVar1 ^ *puVar28;
          if (uVar27 == 0) {
            puVar28 = (ulong *)(piVar18 + 3);
            puVar29 = (ulong *)((long)plVar23 + 0xc);
            goto joined_r0x00098538;
          }
          uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
          uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
          uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
          uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
          uVar36 = (uint)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3);
        }
        else {
joined_r0x00098538:
          if (puVar29 < puVar45) {
            iVar33 = ((int)puVar29 - (int)plVar23) + -4;
            do {
              uVar27 = *puVar29 ^ *puVar28;
              if (uVar27 != 0) {
                uVar27 = (uVar27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar27 & 0x5555555555555555) << 1;
                uVar27 = (uVar27 & 0xcccccccccccccccc) >> 2 | (uVar27 & 0x3333333333333333) << 2;
                uVar27 = (uVar27 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar27 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar27 = (uVar27 & 0xff00ff00ff00ff00) >> 8 | (uVar27 & 0xff00ff00ff00ff) << 8;
                uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
                uVar36 = (int)((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20) >> 3) + iVar33;
                goto LAB_000983b8;
              }
              puVar29 = puVar29 + 1;
              puVar28 = puVar28 + 1;
              iVar33 = iVar33 + 8;
            } while (puVar29 < puVar45);
          }
          if (puVar29 < (ulong *)((long)plVar37 + (uVar35 - 8))) {
            if ((int)*puVar28 == (int)*puVar29) {
              puVar29 = (ulong *)((long)puVar29 + 4);
              puVar28 = (ulong *)((long)puVar28 + 4);
            }
          }
          if (puVar29 < (ulong *)((long)plVar37 + (uVar35 - 6))) {
            if ((short)*puVar28 == (short)*puVar29) {
              puVar29 = (ulong *)((long)puVar29 + 2);
              puVar28 = (ulong *)((long)puVar28 + 2);
            }
          }
          if (puVar29 < (ulong *)((long)plVar37 + (uVar35 - 5))) {
            if ((char)*puVar28 == (char)*puVar29) {
              puVar29 = (ulong *)((long)puVar29 + 1);
            }
          }
          uVar36 = (int)puVar29 - (int)puVar1;
        }
LAB_000983b8:
        if (pcVar3 < (char *)((long)plVar44 + (ulong)(uVar36 + 0xf0) / 0xff + 8)) {
          return 0;
        }
        uVar24 = uVar36 - 0xf;
        if (uVar36 < 0xf) {
          *(char *)unaff_x27 = (char)*unaff_x27 + (char)uVar36;
          unaff_x27 = psVar15;
        }
        else {
          *(char *)unaff_x27 = (char)*unaff_x27 + '\x0f';
          psVar15[0] = -1;
          psVar15[1] = -1;
          if (0x3fb < uVar24) {
            uVar27 = (ulong)((uVar36 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar44 + 6),0xff,uVar27 + 4);
            uVar24 = (uVar36 - 0x40b) % 0x3fc;
            psVar15 = (short *)((long)plVar44 + 6 + uVar27);
          }
          uVar6 = (uVar24 & 0xffff) / 0xff;
          pcVar4 = (char *)((long)psVar15 + (ulong)uVar6);
          unaff_x27 = (short *)(pcVar4 + 1);
          *pcVar4 = (char)uVar24 + (char)uVar6;
        }
        plVar23 = (long *)((long)plVar23 + (ulong)uVar36 + 4);
        if (plVar40 <= plVar23) goto code_r0x00098604;
        *(int *)(unaff_x24 +
                ((ulong)(*(long *)((long)plVar23 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)plVar23 + -2) - iVar41;
        uVar24 = (int)plVar23 - iVar41;
        uVar27 = (ulong)(*plVar23 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar36 = *(uint *)(unaff_x24 + uVar27);
        *(uint *)(unaff_x24 + uVar27) = uVar24;
        if ((uVar36 + 0xffff < uVar24) ||
           (piVar18 = (int *)(lVar38 + (ulong)uVar36), *piVar18 != (int)*plVar23))
        goto code_r0x00098104;
        plVar44 = (long *)((long)unaff_x27 + 1);
        *(char *)unaff_x27 = '\0';
      } while( true );
    }
  }
  return 0;
code_r0x00097ce0:
  plVar23 = (long *)((long)plVar30 + 2);
  if (plVar37 < plVar23) {
LAB_00098590:
    uVar34 = (long)plVar40 + (uVar35 - (long)plVar30);
    uVar27 = uVar34 - 0xf;
    if (uVar34 < 0xf) {
      *(char *)unaff_x27 = (char)((int)uVar34 << 4);
    }
    else {
      psVar15 = (short *)((long)unaff_x27 + 1);
      *(char *)unaff_x27 = -0x10;
      if (0xfe < uVar27) {
        uVar27 = ((*(long *)(unaff_x29 + -0x58) + uVar35) - (long)plVar30) - 0x10e;
        uVar35 = uVar27 / 0xff;
        _memset(psVar15,0xff,uVar35 + 1);
        uVar27 = uVar27 % 0xff;
        psVar15 = (short *)((long)unaff_x27 + uVar35 + 2);
      }
      *(char *)psVar15 = (char)uVar27;
      unaff_x27 = psVar15;
    }
    _memcpy((char *)((long)unaff_x27 + 1),plVar30,uVar34);
    return ((int)(char *)((long)unaff_x27 + 1) + (int)uVar34) - iVar43;
  }
  goto code_r0x00097cf4;
code_r0x000975dc:
  plVar37 = plVar23;
  goto code_r0x00097258;
code_r0x00098104:
  plVar30 = (long *)((long)plVar23 + 2);
  if (plVar40 < plVar30) goto code_r0x00098604;
  goto code_r0x00098118;
code_r0x00098604:
  uVar34 = (long)plVar37 + (uVar35 - (long)plVar23);
  if (pcVar3 < (char *)((long)unaff_x27 + (uVar34 + 0xf0) / 0xff + uVar34 + 1)) {
    return 0;
  }
  uVar27 = uVar34 - 0xf;
  if (uVar34 < 0xf) {
    *(char *)unaff_x27 = (char)((int)uVar34 << 4);
  }
  else {
    psVar15 = (short *)((long)unaff_x27 + 1);
    *(char *)unaff_x27 = -0x10;
    if (0xfe < uVar27) {
      uVar27 = ((*(long *)(unaff_x29 + -0x58) + uVar35) - (long)plVar23) - 0x10e;
      uVar35 = uVar27 / 0xff;
      _memset(psVar15,0xff,uVar35 + 1);
      uVar27 = uVar27 % 0xff;
      psVar15 = (short *)((long)unaff_x27 + uVar35 + 2);
    }
    *(char *)psVar15 = (char)uVar27;
    unaff_x27 = psVar15;
  }
  goto LAB_00098840;
}

