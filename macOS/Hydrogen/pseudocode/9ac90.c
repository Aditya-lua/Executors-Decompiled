
/* WARNING: Type propagation algorithm not settling */

int FUN_0009ac90(ulong param_1,long *param_2,short *param_3,uint *param_4,uint param_5,uint param_6)

{
  ulong *puVar1;
  uint *puVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  short sVar6;
  bool bVar7;
  long *plVar8;
  short *psVar9;
  long *plVar11;
  long *plVar10;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long *plVar15;
  int *piVar16;
  long *plVar17;
  char *pcVar18;
  int iVar19;
  long *plVar20;
  uint uVar21;
  uint uVar22;
  char cVar23;
  ulong uVar24;
  ulong *puVar25;
  ulong *puVar26;
  ulong uVar27;
  long lVar28;
  ulong uVar29;
  long *plVar30;
  uint uVar31;
  long lVar32;
  long *plVar33;
  ulong uVar34;
  char *pcVar35;
  long *plVar36;
  int iVar37;
  short *psVar38;
  int iVar39;
  int iVar40;
  ulong *puVar41;
  long lVar42;
  long lVar43;
  long lVar44;
  long lVar45;
  
  if ((param_1 != 0) && ((param_1 & 7) == 0)) {
    _bzero(param_1,&UNK_00004020);
  }
  uVar31 = *param_4;
  uVar14 = (ulong)uVar31;
  iVar39 = (int)param_3;
  if (uVar31 < 0x7e000001) {
    if ((int)param_5 < (int)((uint)((ulong)uVar31 * 0x8080808081 >> 0x27) + 0x10))
    goto LAB_0009ad40;
  }
  else if (0x7fffffff < param_5) {
LAB_0009ad40:
    puVar2 = (uint *)(&UNK_00004010 + param_1);
    if ((int)uVar31 < 0x1000b) {
      if (uVar31 < 0x7e000001) {
        if (uVar31 == 0) {
          if (0 < (int)param_5) {
            *(char *)param_3 = '\0';
            *param_4 = 0;
            return 1;
          }
        }
        else if (0 < (int)param_5) {
          uVar3 = *puVar2;
          psVar9 = (short *)((long)param_3 + (long)(int)param_5);
          *(uint *)(&UNK_00004018 + param_1) = *(int *)(&UNK_00004018 + param_1) + uVar31;
          *puVar2 = uVar3 + uVar31;
          *(undefined4 *)(&UNK_00004014 + param_1) = 3;
          plVar20 = param_2;
          if (0xc < uVar31) {
            lVar32 = (long)param_2 - (ulong)uVar3;
            plVar33 = (long *)((long)param_2 + (uVar14 - 0xb));
            *(short *)(param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
                 (short)uVar3;
            puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
code_r0x0009b68c:
            iVar40 = 1;
            plVar36 = (long *)((long)plVar20 + 1);
            iVar37 = param_6 << 6;
            iVar19 = *(int *)((long)plVar20 + 1);
            do {
              plVar17 = plVar36;
              plVar36 = (long *)((long)plVar17 + (long)iVar40);
              if (plVar33 < plVar36) goto code_r0x0009adb0;
              iVar40 = iVar37 >> 6;
              iVar37 = iVar37 + 1;
              lVar28 = (ulong)((uint)(iVar19 * -0x61c8864f) >> 0x13) * 2;
              uVar34 = (ulong)*(ushort *)(param_1 + lVar28);
              sVar6 = (short)lVar32;
              lVar12 = *plVar36;
              *(short *)(param_1 + lVar28) = (short)plVar17 - sVar6;
              bVar7 = *(int *)(lVar32 + uVar34) != iVar19;
              iVar19 = (int)lVar12;
            } while (bVar7);
            plVar36 = (long *)(lVar32 + uVar34);
            plVar15 = plVar17;
            plVar8 = plVar17;
            if ((param_2 < plVar36) &&
               (*(char *)((long)plVar17 + -1) == *(char *)((long)plVar36 - 1))) {
              plVar10 = (long *)((long)param_2 + uVar34 + ~(ulong)uVar3);
              plVar11 = (long *)((long)plVar17 + -1);
              plVar30 = (long *)((long)plVar17 + -1);
              do {
                plVar15 = plVar30;
                plVar8 = plVar11;
                plVar36 = plVar10;
                if (plVar36 <= param_2) break;
                if (plVar8 <= plVar20) break;
                plVar10 = (long *)((long)plVar36 + -1);
                plVar11 = (long *)((long)plVar8 + -1);
                plVar30 = (long *)((long)plVar15 + -1);
              } while (*(char *)((long)plVar8 + -1) == *(char *)((long)plVar36 + -1));
            }
            plVar10 = (long *)((long)param_3 + 1);
            uVar31 = (uint)((long)plVar15 - (long)plVar20);
            uVar34 = (long)plVar15 - (long)plVar20 & 0xffffffff;
            if ((short *)((long)plVar10 + uVar34 + (ulong)(uVar31 + 0xf0) / 0xff + 0xb) <= psVar9) {
              uVar21 = uVar31 - 0xf;
              if (uVar31 < 0xf) {
                *(char *)param_3 = (char)(uVar31 << 4);
              }
              else {
                *(char *)param_3 = -0x10;
                plVar11 = plVar10;
                if (0xfe < uVar21) {
                  uVar21 = ((int)plVar15 - (int)plVar20) - 0x10e;
                  uVar24 = (ulong)uVar21 / 0xff;
                  _memset(plVar10,0xff,uVar24 + 1);
                  uVar21 = uVar21 + (int)uVar24;
                  plVar11 = (long *)((long)param_3 + uVar24 + 2);
                }
                plVar10 = (long *)((long)plVar11 + 1);
                *(char *)plVar11 = (char)uVar21;
              }
              plVar15 = (long *)((long)plVar10 + uVar34);
              plVar11 = plVar15;
              if (plVar15 <= plVar10 + 1) {
                plVar11 = plVar10 + 1;
              }
              if (((char *)((long)plVar11 + ~(ulong)plVar10) < &segment_command_00000020.vmaddr) ||
                 ((ulong)((long)plVar10 - (long)plVar20) < 0x40)) {
                plVar11 = plVar20;
LAB_0009b888:
                do {
                  plVar30 = plVar10 + 1;
                  *plVar10 = *plVar11;
                  plVar11 = plVar11 + 1;
                  plVar10 = plVar30;
                } while (plVar30 < plVar15);
              }
              else {
                uVar34 = ((long)plVar11 + ~(ulong)plVar10 >> 3) + 1;
                uVar29 = uVar34 & 0x3ffffffffffffff8;
                plVar11 = plVar20 + 4;
                plVar30 = plVar10 + 4;
                uVar24 = uVar29;
                do {
                  lVar28 = plVar11[-4];
                  lVar13 = plVar11[-1];
                  lVar12 = plVar11[-2];
                  lVar43 = plVar11[1];
                  lVar42 = *plVar11;
                  lVar45 = plVar11[3];
                  lVar44 = plVar11[2];
                  plVar30[-3] = plVar11[-3];
                  plVar30[-4] = lVar28;
                  plVar30[-1] = lVar13;
                  plVar30[-2] = lVar12;
                  plVar30[1] = lVar43;
                  *plVar30 = lVar42;
                  plVar30[3] = lVar45;
                  plVar30[2] = lVar44;
                  uVar24 = uVar24 - 8;
                  plVar11 = plVar11 + 8;
                  plVar30 = plVar30 + 8;
                } while (uVar24 != 0);
                plVar11 = plVar20 + uVar29;
                plVar10 = plVar10 + uVar29;
                if (uVar34 != uVar29) goto LAB_0009b888;
              }
              if ((short *)((long)plVar15 + 0xb) <= psVar9) {
                psVar38 = param_3;
                do {
                  param_3 = (short *)((long)plVar15 + 2);
                  *(short *)plVar15 = (short)plVar8 - (short)plVar36;
                  puVar1 = (ulong *)((long)plVar8 + 4);
                  puVar25 = (ulong *)((long)plVar36 + 4);
                  puVar26 = puVar1;
                  if (puVar1 < puVar41) {
                    uVar34 = *puVar1 ^ *puVar25;
                    if (uVar34 == 0) {
                      puVar25 = (ulong *)((long)plVar36 + 0xc);
                      puVar26 = (ulong *)((long)plVar8 + 0xc);
                      goto joined_r0x0009ba80;
                    }
                    uVar34 = (uVar34 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar34 & 0x5555555555555555) << 1
                    ;
                    uVar34 = (uVar34 & 0xcccccccccccccccc) >> 2 | (uVar34 & 0x3333333333333333) << 2
                    ;
                    uVar34 = (uVar34 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar34 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar34 = (uVar34 & 0xff00ff00ff00ff00) >> 8 | (uVar34 & 0xff00ff00ff00ff) << 8;
                    uVar34 = (uVar34 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar34 & 0xffff0000ffff) << 0x10;
                    uVar34 = (ulong)LZCOUNT(uVar34 >> 0x20 | uVar34 << 0x20) >> 3;
                  }
                  else {
joined_r0x0009ba80:
                    if (puVar26 < puVar41) {
                      iVar37 = ((int)puVar26 - (int)plVar8) + -4;
                      do {
                        uVar34 = *puVar26 ^ *puVar25;
                        if (uVar34 != 0) {
                          uVar34 = (uVar34 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar34 & 0x5555555555555555) << 1;
                          uVar34 = (uVar34 & 0xcccccccccccccccc) >> 2 |
                                   (uVar34 & 0x3333333333333333) << 2;
                          uVar34 = (uVar34 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar34 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar34 = (uVar34 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar34 & 0xff00ff00ff00ff) << 8;
                          uVar34 = (uVar34 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar34 & 0xffff0000ffff) << 0x10;
                          uVar34 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar34 >> 0x20 |
                                                                      uVar34 << 0x20) >> 3) + iVar37
                                                );
                          goto LAB_0009b990;
                        }
                        puVar26 = puVar26 + 1;
                        puVar25 = puVar25 + 1;
                        iVar37 = iVar37 + 8;
                      } while (puVar26 < puVar41);
                    }
                    if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 8))) {
                      if ((int)*puVar25 == (int)*puVar26) {
                        puVar26 = (ulong *)((long)puVar26 + 4);
                        puVar25 = (ulong *)((long)puVar25 + 4);
                      }
                    }
                    if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 6))) {
                      if ((short)*puVar25 == (short)*puVar26) {
                        puVar26 = (ulong *)((long)puVar26 + 2);
                        puVar25 = (ulong *)((long)puVar25 + 2);
                      }
                    }
                    if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 5))) {
                      if ((char)*puVar25 == (char)*puVar26) {
                        puVar26 = (ulong *)((long)puVar26 + 1);
                      }
                    }
                    uVar34 = (ulong)(uint)((int)puVar26 - (int)puVar1);
                  }
LAB_0009b990:
                  plVar20 = (long *)((long)plVar8 + uVar34 + 4);
                  uVar31 = (uint)uVar34;
                  if (psVar9 < (short *)((long)plVar15 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) {
                    iVar37 = ((int)psVar9 - (int)param_3) * 0xff;
                    uVar21 = iVar37 - 0x5ec;
                    uVar24 = (ulong)(uVar31 - uVar21);
                    plVar20 = (long *)((long)plVar20 - uVar24);
                    if (plVar17 < plVar20) {
                      cVar23 = (char)*psVar38;
                    }
                    else {
                      uVar29 = (((long)plVar8 + uVar34) - uVar24) + 5;
                      if (uVar29 <= (long)plVar17 + 1U) {
                        uVar29 = (long)plVar17 + 1U;
                      }
                      uVar29 = ((uVar29 + uVar24) - ((long)plVar8 + uVar34)) - 4;
                      plVar36 = plVar20;
                      if (uVar29 < 4) {
code_r0x0009bbdc:
                        do {
                          plVar8 = (long *)((long)plVar36 + 1);
                          *(undefined2 *)
                           (param_1 + (ulong)((uint)((int)*plVar36 * -0x61c8864f) >> 0x13) * 2) = 0;
                          plVar36 = plVar8;
                        } while (plVar8 <= plVar17);
                      }
                      else {
                        uVar27 = uVar29 & 0xfffffffffffffffc;
                        piVar16 = (int *)((long)plVar8 + (uVar34 - uVar24) + 7);
                        uVar34 = uVar27;
                        do {
                          iVar40 = *(int *)((long)piVar16 + -2);
                          iVar19 = *(int *)((long)piVar16 + -1);
                          iVar4 = *piVar16;
                          *(undefined2 *)
                           (param_1 +
                           (ulong)((uint)(*(int *)((long)piVar16 + -3) * -0x61c8864f) >> 0x13) * 2)
                               = 0;
                          *(undefined2 *)
                           (param_1 + (ulong)((uint)(iVar40 * -0x61c8864f) >> 0x13) * 2) = 0;
                          *(undefined2 *)
                           (param_1 + (ulong)((uint)(iVar19 * -0x61c8864f) >> 0x13) * 2) = 0;
                          *(undefined2 *)
                           (param_1 + (ulong)((uint)(iVar4 * -0x61c8864f) >> 0x13) * 2) = 0;
                          uVar34 = uVar34 - 4;
                          piVar16 = piVar16 + 1;
                        } while (uVar34 != 0);
                        plVar36 = (long *)((long)plVar20 + uVar27);
                        if (uVar29 != uVar27) goto code_r0x0009bbdc;
                      }
                      cVar23 = (char)*psVar38;
                    }
                    uVar22 = iVar37 - 0x5fb;
                    if (uVar21 < 0xf) goto LAB_0009babc;
code_r0x0009b9c4:
                    *(char *)psVar38 = cVar23 + '\x0f';
                    param_3[0] = -1;
                    param_3[1] = -1;
                    if (0x3fb < uVar22) {
                      uVar34 = (ulong)((uVar21 - 0x40b) / 0x3fc << 2);
                      _memset((short *)((long)plVar15 + 6),0xff,uVar34 + 4);
                      uVar22 = (uVar21 - 0x40b) % 0x3fc;
                      param_3 = (short *)((long)plVar15 + 6 + uVar34);
                    }
                    uVar31 = (uVar22 & 0xffff) / 0xff;
                    pcVar35 = (char *)((long)param_3 + (ulong)uVar31);
                    param_3 = (short *)(pcVar35 + 1);
                    *pcVar35 = (char)uVar22 + (char)uVar31;
                  }
                  else {
                    cVar23 = (char)*psVar38;
                    uVar22 = uVar31 - 0xf;
                    uVar21 = uVar31;
                    if (0xe < uVar31) goto code_r0x0009b9c4;
LAB_0009babc:
                    *(char *)psVar38 = cVar23 + (char)uVar21;
                  }
                  if (plVar33 <= plVar20) break;
                  *(short *)(param_1 +
                            (ulong)((uint)(*(int *)((long)plVar20 + -2) * -0x61c8864f) >> 0x13) * 2)
                       = (short)(int *)((long)plVar20 + -2) - sVar6;
                  lVar12 = *plVar20;
                  lVar28 = (ulong)((uint)((int)lVar12 * -0x61c8864f) >> 0x13) * 2;
                  plVar36 = (long *)(lVar32 + (ulong)*(ushort *)(param_1 + lVar28));
                  *(short *)(param_1 + lVar28) = (short)plVar20 - sVar6;
                  if ((int)*plVar36 != (int)lVar12) goto code_r0x0009b68c;
                  plVar15 = (long *)((long)param_3 + 1);
                  *(char *)param_3 = '\0';
                  plVar8 = plVar20;
                  psVar38 = param_3;
                  if (psVar9 < param_3 + 6) break;
                } while( true );
              }
            }
          }
code_r0x0009adb0:
          pcVar35 = (char *)((long)param_2 + (uVar14 - (long)plVar20));
          if (psVar9 < (short *)((long)param_3 +
                                (long)(pcVar35 + (ulong)(pcVar35 + 0xf0) / 0xff + 1))) {
            pcVar35 = (char *)((long)psVar9 +
                              (~(ulong)param_3 -
                              ((ulong)((long)psVar9 + ~(ulong)param_3 + 0xf1) >> 8)));
          }
          pcVar18 = pcVar35 + -0xf;
          iVar37 = (int)pcVar35;
          if (pcVar35 < "") {
            *(char *)param_3 = (char)(iVar37 << 4);
          }
          else {
            psVar9 = (short *)((long)param_3 + 1);
            *(char *)param_3 = -0x10;
            if ("" < pcVar18) {
              uVar14 = (ulong)(pcVar35 + -0x10e) / 0xff;
              _memset(psVar9,0xff,uVar14 + 1);
              pcVar18 = (char *)((ulong)(pcVar35 + -0x10e) % 0xff);
              psVar9 = (short *)((long)param_3 + uVar14 + 2);
            }
            *(char *)psVar9 = (char)pcVar18;
            param_3 = psVar9;
          }
          _memcpy((char *)((long)param_3 + 1),plVar20,pcVar35);
          *param_4 = ((int)plVar20 + iVar37) - (int)param_2;
          return ((int)(char *)((long)param_3 + 1) + iVar37) - iVar39;
        }
      }
    }
    else if ((uVar31 < 0x7e000001) && (0 < (int)param_5)) {
      uVar3 = *puVar2;
      lVar32 = (long)param_2 - (ulong)uVar3;
      plVar36 = (long *)((long)param_2 + (uVar14 - 0xb));
      psVar9 = (short *)((long)param_3 + (long)(int)param_5);
      *(uint *)(&UNK_00004018 + param_1) = *(int *)(&UNK_00004018 + param_1) + uVar31;
      *puVar2 = uVar3 + uVar31;
      *(undefined4 *)(&UNK_00004014 + param_1) = 2;
      plVar20 = (long *)((long)param_2 + 2);
      *(uint *)(param_1 + ((ulong)(*param_2 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar3;
      puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
      plVar33 = param_2;
code_r0x0009af00:
      lVar28 = *(long *)((long)plVar33 + 1);
      plVar17 = (long *)((long)plVar33 + 1);
      iVar37 = param_6 << 6;
      while( true ) {
        plVar15 = plVar20;
        uVar34 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar31 = *(uint *)(param_1 + uVar34);
        uVar24 = (ulong)uVar31;
        iVar40 = (int)lVar32;
        uVar21 = (int)plVar17 - iVar40;
        lVar28 = *plVar15;
        *(uint *)(param_1 + uVar34) = uVar21;
        if ((uVar21 <= uVar31 + 0xffff) && (*(int *)(lVar32 + uVar24) == (int)*plVar17)) break;
        plVar20 = (long *)((long)plVar15 + (long)(iVar37 >> 6));
        iVar37 = iVar37 + 1;
        plVar17 = plVar15;
        if (plVar36 < plVar20) goto LAB_0009b508;
      }
      plVar20 = (long *)(lVar32 + uVar24);
      plVar15 = plVar17;
      plVar8 = plVar17;
      if ((param_2 < plVar20) && (*(char *)((long)plVar17 + -1) == *(char *)((long)plVar20 - 1))) {
        plVar10 = (long *)((long)param_2 + uVar24 + ~(ulong)uVar3);
        plVar11 = (long *)((long)plVar17 + -1);
        plVar30 = (long *)((long)plVar17 + -1);
        do {
          plVar15 = plVar30;
          plVar8 = plVar11;
          plVar20 = plVar10;
          if (plVar20 <= param_2) break;
          if (plVar8 <= plVar33) break;
          plVar10 = (long *)((long)plVar20 + -1);
          plVar11 = (long *)((long)plVar8 + -1);
          plVar30 = (long *)((long)plVar15 + -1);
        } while (*(char *)((long)plVar8 + -1) == *(char *)((long)plVar20 + -1));
      }
      plVar10 = (long *)((long)param_3 + 1);
      uVar31 = (uint)((long)plVar15 - (long)plVar33);
      uVar34 = (long)plVar15 - (long)plVar33 & 0xffffffff;
      if ((short *)((long)plVar10 + uVar34 + (ulong)(uVar31 + 0xf0) / 0xff + 0xb) <= psVar9) {
        uVar21 = uVar31 - 0xf;
        if (uVar31 < 0xf) {
          *(char *)param_3 = (char)(uVar31 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          plVar11 = plVar10;
          if (0xfe < uVar21) {
            uVar21 = ((int)plVar15 - (int)plVar33) - 0x10e;
            uVar24 = (ulong)uVar21 / 0xff;
            _memset(plVar10,0xff,uVar24 + 1);
            uVar21 = uVar21 + (int)uVar24;
            plVar11 = (long *)((long)param_3 + uVar24 + 2);
          }
          plVar10 = (long *)((long)plVar11 + 1);
          *(char *)plVar11 = (char)uVar21;
        }
        plVar15 = (long *)((long)plVar10 + uVar34);
        plVar11 = plVar15;
        if (plVar15 <= plVar10 + 1) {
          plVar11 = plVar10 + 1;
        }
        if (((char *)((long)plVar11 + ~(ulong)plVar10) < &segment_command_00000020.vmaddr) ||
           ((ulong)((long)plVar10 - (long)plVar33) < 0x40)) {
          plVar11 = plVar33;
code_r0x0009b114:
          do {
            plVar30 = plVar10 + 1;
            *plVar10 = *plVar11;
            plVar11 = plVar11 + 1;
            plVar10 = plVar30;
          } while (plVar30 < plVar15);
        }
        else {
          uVar34 = ((long)plVar11 + ~(ulong)plVar10 >> 3) + 1;
          uVar29 = uVar34 & 0x3ffffffffffffff8;
          plVar11 = plVar33 + 4;
          plVar30 = plVar10 + 4;
          uVar24 = uVar29;
          do {
            lVar28 = plVar11[-4];
            lVar13 = plVar11[-1];
            lVar12 = plVar11[-2];
            lVar43 = plVar11[1];
            lVar42 = *plVar11;
            lVar45 = plVar11[3];
            lVar44 = plVar11[2];
            plVar30[-3] = plVar11[-3];
            plVar30[-4] = lVar28;
            plVar30[-1] = lVar13;
            plVar30[-2] = lVar12;
            plVar30[1] = lVar43;
            *plVar30 = lVar42;
            plVar30[3] = lVar45;
            plVar30[2] = lVar44;
            uVar24 = uVar24 - 8;
            plVar11 = plVar11 + 8;
            plVar30 = plVar30 + 8;
          } while (uVar24 != 0);
          plVar11 = plVar33 + uVar29;
          plVar10 = plVar10 + uVar29;
          if (uVar34 != uVar29) goto code_r0x0009b114;
        }
        if ((short *)((long)plVar15 + 0xb) <= psVar9) {
          psVar38 = param_3;
          do {
            param_3 = (short *)((long)plVar15 + 2);
            *(short *)plVar15 = (short)plVar8 - (short)plVar20;
            puVar1 = (ulong *)((long)plVar8 + 4);
            puVar25 = (ulong *)((long)plVar20 + 4);
            puVar26 = puVar1;
            if (puVar1 < puVar41) {
              uVar34 = *puVar1 ^ *puVar25;
              if (uVar34 == 0) {
                puVar25 = (ulong *)((long)plVar20 + 0xc);
                puVar26 = (ulong *)((long)plVar8 + 0xc);
                goto joined_r0x0009b318;
              }
              uVar34 = (uVar34 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar34 & 0x5555555555555555) << 1;
              uVar34 = (uVar34 & 0xcccccccccccccccc) >> 2 | (uVar34 & 0x3333333333333333) << 2;
              uVar34 = (uVar34 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar34 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar34 = (uVar34 & 0xff00ff00ff00ff00) >> 8 | (uVar34 & 0xff00ff00ff00ff) << 8;
              uVar34 = (uVar34 & 0xffff0000ffff0000) >> 0x10 | (uVar34 & 0xffff0000ffff) << 0x10;
              uVar34 = (ulong)LZCOUNT(uVar34 >> 0x20 | uVar34 << 0x20) >> 3;
            }
            else {
joined_r0x0009b318:
              if (puVar26 < puVar41) {
                iVar37 = ((int)puVar26 - (int)plVar8) + -4;
                do {
                  uVar34 = *puVar26 ^ *puVar25;
                  if (uVar34 != 0) {
                    uVar34 = (uVar34 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar34 & 0x5555555555555555) << 1
                    ;
                    uVar34 = (uVar34 & 0xcccccccccccccccc) >> 2 | (uVar34 & 0x3333333333333333) << 2
                    ;
                    uVar34 = (uVar34 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar34 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar34 = (uVar34 & 0xff00ff00ff00ff00) >> 8 | (uVar34 & 0xff00ff00ff00ff) << 8;
                    uVar34 = (uVar34 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar34 & 0xffff0000ffff) << 0x10;
                    uVar34 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar34 >> 0x20 | uVar34 << 0x20) >>
                                                3) + iVar37);
                    goto FUN_0009b220;
                  }
                  puVar26 = puVar26 + 1;
                  puVar25 = puVar25 + 1;
                  iVar37 = iVar37 + 8;
                } while (puVar26 < puVar41);
              }
              if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 8))) {
                if ((int)*puVar25 == (int)*puVar26) {
                  puVar26 = (ulong *)((long)puVar26 + 4);
                  puVar25 = (ulong *)((long)puVar25 + 4);
                }
              }
              if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 6))) {
                if ((short)*puVar25 == (short)*puVar26) {
                  puVar26 = (ulong *)((long)puVar26 + 2);
                  puVar25 = (ulong *)((long)puVar25 + 2);
                }
              }
              if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 5))) {
                if ((char)*puVar25 == (char)*puVar26) {
                  puVar26 = (ulong *)((long)puVar26 + 1);
                }
              }
              uVar34 = (ulong)(uint)((int)puVar26 - (int)puVar1);
            }
FUN_0009b220:
            plVar33 = (long *)((long)plVar8 + uVar34 + 4);
            uVar31 = (uint)uVar34;
            if (psVar9 < (short *)((long)plVar15 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) {
              iVar37 = ((int)psVar9 - (int)param_3) * 0xff;
              uVar21 = iVar37 - 0x5ec;
              uVar24 = (ulong)(uVar31 - uVar21);
              plVar33 = (long *)((long)plVar33 - uVar24);
              if (plVar17 < plVar33) {
                cVar23 = (char)*psVar38;
              }
              else {
                uVar29 = (((long)plVar8 + uVar34) - uVar24) + 5;
                if (uVar29 <= (long)plVar17 + 1U) {
                  uVar29 = (long)plVar17 + 1U;
                }
                uVar29 = ((uVar29 + uVar24) - ((long)plVar8 + uVar34)) - 4;
                plVar20 = plVar33;
                if (uVar29 < 4) {
LAB_0009b4a4:
                  do {
                    plVar8 = (long *)((long)plVar20 + 1);
                    *(undefined4 *)
                     (param_1 + ((ulong)(*plVar20 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                    plVar20 = plVar8;
                  } while (plVar8 <= plVar17);
                }
                else {
                  uVar27 = uVar29 & 0xfffffffffffffffc;
                  plVar20 = (long *)((long)plVar8 + (uVar34 - uVar24) + 7);
                  uVar34 = uVar27;
                  do {
                    lVar28 = *(long *)((long)plVar20 + -2);
                    lVar12 = *(long *)((long)plVar20 + -1);
                    lVar13 = *plVar20;
                    *(undefined4 *)
                     (param_1 +
                     ((ulong)(*(long *)((long)plVar20 + -3) * -0x30e4432345000000) >> 0x32 & 0x3ffc)
                     ) = 0;
                    *(undefined4 *)
                     (param_1 + ((ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                    *(undefined4 *)
                     (param_1 + ((ulong)(lVar12 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                    *(undefined4 *)
                     (param_1 + ((ulong)(lVar13 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                    uVar34 = uVar34 - 4;
                    plVar20 = (long *)((long)plVar20 + 4);
                  } while (uVar34 != 0);
                  plVar20 = (long *)((long)plVar33 + uVar27);
                  if (uVar29 != uVar27) goto LAB_0009b4a4;
                }
                cVar23 = (char)*psVar38;
              }
              uVar22 = iVar37 - 0x5fb;
              if (uVar21 < 0xf) goto LAB_0009b354;
LAB_0009b254:
              *(char *)psVar38 = cVar23 + '\x0f';
              param_3[0] = -1;
              param_3[1] = -1;
              if (0x3fb < uVar22) {
                uVar34 = (ulong)((uVar21 - 0x40b) / 0x3fc << 2);
                _memset((short *)((long)plVar15 + 6),0xff,uVar34 + 4);
                uVar22 = (uVar21 - 0x40b) % 0x3fc;
                param_3 = (short *)((long)plVar15 + 6 + uVar34);
              }
              uVar31 = (uVar22 & 0xffff) / 0xff;
              pcVar35 = (char *)((long)param_3 + (ulong)uVar31);
              param_3 = (short *)(pcVar35 + 1);
              *pcVar35 = (char)uVar22 + (char)uVar31;
            }
            else {
              cVar23 = (char)*psVar38;
              uVar22 = uVar31 - 0xf;
              uVar21 = uVar31;
              if (0xe < uVar31) goto LAB_0009b254;
LAB_0009b354:
              *(char *)psVar38 = cVar23 + (char)uVar21;
            }
            if (plVar36 <= plVar33) break;
            *(int *)(param_1 +
                    ((ulong)(*(long *)((long)plVar33 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc))
                 = (int)(long *)((long)plVar33 + -2) - iVar40;
            uVar21 = (int)plVar33 - iVar40;
            uVar34 = (ulong)(*plVar33 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
            uVar31 = *(uint *)(param_1 + uVar34);
            *(uint *)(param_1 + uVar34) = uVar21;
            if ((uVar31 + 0xffff < uVar21) ||
               (plVar20 = (long *)(lVar32 + (ulong)uVar31), (int)*plVar20 != (int)*plVar33))
            goto code_r0x0009b4fc;
            plVar15 = (long *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
            plVar8 = plVar33;
            psVar38 = param_3;
            if (psVar9 < param_3 + 6) break;
          } while( true );
        }
      }
      goto LAB_0009b508;
    }
    return 0;
  }
  uVar34 = 0;
  if ((param_1 != 0) && ((param_1 & 7) == 0)) {
    _bzero(param_1,&UNK_00004020);
    uVar34 = param_1;
  }
  puVar2 = (uint *)(&UNK_00004010 + uVar34);
  if ((int)param_6 < 2) {
    param_6 = 1;
  }
  if (0x10000 < param_6) {
    param_6 = 0x10001;
  }
  plVar20 = param_2;
  if (uVar31 < 0x7e000001) {
    if ((int)param_5 < (int)((uint)(uVar14 * 0x8080808081 >> 0x27) + 0x10)) goto code_r0x0009765c;
  }
  else if (0x7fffffff < param_5) {
code_r0x0009765c:
    if (0x1000a < (int)uVar31) {
      if (0x7e000000 < uVar31) {
        return 0;
      }
      uVar3 = *puVar2;
      lVar32 = (long)param_2 - (ulong)uVar3;
      plVar36 = (long *)((long)param_2 + (uVar14 - 0xb));
      pcVar35 = (char *)((long)param_3 + (long)(int)param_5);
      *(uint *)(&UNK_00004018 + uVar34) = *(int *)(&UNK_00004018 + uVar34) + uVar31;
      *puVar2 = uVar3 + uVar31;
      *(undefined4 *)(&UNK_00004014 + uVar34) = 2;
      plVar33 = (long *)((long)param_2 + 2);
      *(uint *)(uVar34 + ((ulong)(*param_2 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar3;
      puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
code_r0x00098118:
      uVar31 = param_6 << 6 | 1;
      lVar28 = *(long *)((long)plVar20 + 1U);
      plVar17 = (long *)((long)plVar20 + 1U);
      uVar21 = param_6;
      while( true ) {
        uVar29 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar22 = *(uint *)(uVar34 + uVar29);
        uVar24 = (ulong)uVar22;
        iVar37 = (int)lVar32;
        uVar5 = (int)plVar17 - iVar37;
        lVar28 = *plVar33;
        *(uint *)(uVar34 + uVar29) = uVar5;
        if ((uVar5 <= uVar22 + 0xffff) && (*(int *)(lVar32 + uVar24) == (int)*plVar17)) break;
        plVar15 = (long *)((long)plVar33 + (ulong)uVar21);
        uVar21 = uVar31 >> 6;
        uVar31 = uVar31 + 1;
        plVar17 = plVar33;
        plVar33 = plVar15;
        if (plVar36 < plVar15) goto code_r0x00098604;
      }
      plVar33 = (long *)(lVar32 + uVar24);
      if ((param_2 < plVar33) && (*(char *)((long)plVar17 - 1) == *(char *)((long)plVar33 - 1))) {
        plVar8 = (long *)((long)param_2 + uVar24 + ~(ulong)uVar3);
        plVar10 = (long *)((long)plVar17 - 1U);
        plVar11 = (long *)((long)plVar17 - 1U);
        do {
          plVar17 = plVar11;
          plVar15 = plVar10;
          plVar33 = plVar8;
          if ((plVar33 <= param_2) || (plVar15 <= plVar20)) break;
          plVar8 = (long *)((long)plVar33 + -1);
          plVar10 = (long *)((long)plVar15 + -1);
          plVar11 = (long *)((long)plVar17 - 1);
        } while (*(char *)((long)plVar15 + -1) == *(char *)((long)plVar33 + -1));
      }
      else {
        plVar15 = plVar17;
      }
      plVar8 = (long *)((long)param_3 + 1);
      uVar24 = (long)plVar17 - (long)plVar20 & 0xffffffff;
      if (pcVar35 < (char *)((long)plVar8 + uVar24 / 0xff + uVar24 + 8)) {
        return 0;
      }
      uVar21 = (uint)((long)plVar17 - (long)plVar20);
      uVar31 = uVar21 - 0xf;
      if (uVar21 < 0xf) {
        *(char *)param_3 = (char)(uVar21 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar10 = plVar8;
        if (0xfe < uVar31) {
          uVar31 = ((int)plVar17 - (int)plVar20) - 0x10e;
          uVar29 = (ulong)uVar31 / 0xff;
          _memset(plVar8,0xff,uVar29 + 1);
          uVar31 = uVar31 + (int)uVar29;
          plVar10 = (long *)((long)param_3 + uVar29 + 2);
        }
        plVar8 = (long *)((long)plVar10 + 1);
        *(char *)plVar10 = (char)uVar31;
      }
      plVar17 = (long *)((long)plVar8 + uVar24);
      plVar10 = plVar17;
      if (plVar17 <= plVar8 + 1) {
        plVar10 = plVar8 + 1;
      }
      if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar10 + ~(ulong)plVar8)) &&
         (0x3f < (ulong)((long)plVar8 - (long)plVar20))) {
        uVar24 = ((long)plVar10 + ~(ulong)plVar8 >> 3) + 1;
        uVar27 = uVar24 & 0x3ffffffffffffff8;
        plVar10 = plVar20 + 4;
        plVar11 = plVar8 + 4;
        uVar29 = uVar27;
        do {
          lVar28 = plVar10[-4];
          lVar13 = plVar10[-1];
          lVar12 = plVar10[-2];
          lVar43 = plVar10[1];
          lVar42 = *plVar10;
          lVar45 = plVar10[3];
          lVar44 = plVar10[2];
          plVar11[-3] = plVar10[-3];
          plVar11[-4] = lVar28;
          plVar11[-1] = lVar13;
          plVar11[-2] = lVar12;
          plVar11[1] = lVar43;
          *plVar11 = lVar42;
          plVar11[3] = lVar45;
          plVar11[2] = lVar44;
          uVar29 = uVar29 - 8;
          plVar10 = plVar10 + 8;
          plVar11 = plVar11 + 8;
        } while (uVar29 != 0);
        plVar20 = plVar20 + uVar27;
        plVar8 = plVar8 + uVar27;
        if (uVar24 == uVar27) goto code_r0x000982cc;
      }
      do {
        plVar10 = plVar8 + 1;
        *plVar8 = *plVar20;
        plVar20 = plVar20 + 1;
        plVar8 = plVar10;
      } while (plVar10 < plVar17);
code_r0x000982cc:
      plVar20 = plVar15;
      do {
        psVar9 = (short *)((long)plVar17 + 2);
        *(short *)plVar17 = (short)plVar20 - (short)plVar33;
        puVar1 = (ulong *)((long)plVar20 + 4);
        puVar25 = (ulong *)((long)plVar33 + 4);
        puVar26 = puVar1;
        if (puVar1 < puVar41) {
          uVar24 = *puVar1 ^ *puVar25;
          if (uVar24 == 0) {
            puVar25 = (ulong *)((long)plVar33 + 0xc);
            puVar26 = (ulong *)((long)plVar20 + 0xc);
            goto joined_r0x00098538;
          }
          uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
          uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
          uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
          uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
          uVar31 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
        }
        else {
joined_r0x00098538:
          if (puVar26 < puVar41) {
            iVar40 = ((int)puVar26 - (int)plVar20) + -4;
            do {
              uVar24 = *puVar26 ^ *puVar25;
              if (uVar24 != 0) {
                uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
                uVar31 = (int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) + iVar40;
                goto code_r0x000983b8;
              }
              puVar26 = puVar26 + 1;
              puVar25 = puVar25 + 1;
              iVar40 = iVar40 + 8;
            } while (puVar26 < puVar41);
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 8))) {
            if ((int)*puVar25 == (int)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 4);
              puVar25 = (ulong *)((long)puVar25 + 4);
            }
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 6))) {
            if ((short)*puVar25 == (short)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 2);
              puVar25 = (ulong *)((long)puVar25 + 2);
            }
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 5))) {
            if ((char)*puVar25 == (char)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 1);
            }
          }
          uVar31 = (int)puVar26 - (int)puVar1;
        }
code_r0x000983b8:
        if (pcVar35 < (char *)((long)plVar17 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) {
          return 0;
        }
        uVar21 = uVar31 - 0xf;
        if (uVar31 < 0xf) {
          *(char *)param_3 = (char)*param_3 + (char)uVar31;
          param_3 = psVar9;
        }
        else {
          *(char *)param_3 = (char)*param_3 + '\x0f';
          psVar9[0] = -1;
          psVar9[1] = -1;
          if (0x3fb < uVar21) {
            uVar24 = (ulong)((uVar31 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar17 + 6),0xff,uVar24 + 4);
            uVar21 = (uVar31 - 0x40b) % 0x3fc;
            psVar9 = (short *)((long)plVar17 + 6 + uVar24);
          }
          uVar22 = (uVar21 & 0xffff) / 0xff;
          pcVar18 = (char *)((long)psVar9 + (ulong)uVar22);
          param_3 = (short *)(pcVar18 + 1);
          *pcVar18 = (char)uVar21 + (char)uVar22;
        }
        plVar20 = (long *)((long)plVar20 + (ulong)uVar31 + 4);
        if (plVar36 <= plVar20) goto code_r0x00098604;
        *(int *)(uVar34 + ((ulong)(*(long *)((long)plVar20 + -2) * -0x30e4432345000000) >> 0x32 &
                          0x3ffc)) = (int)(long *)((long)plVar20 + -2) - iVar37;
        uVar21 = (int)plVar20 - iVar37;
        uVar24 = (ulong)(*plVar20 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
        uVar31 = *(uint *)(uVar34 + uVar24);
        *(uint *)(uVar34 + uVar24) = uVar21;
        if ((uVar31 + 0xffff < uVar21) ||
           (plVar33 = (long *)(lVar32 + (ulong)uVar31), (int)*plVar33 != (int)*plVar20))
        goto code_r0x00098104;
        plVar17 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
      } while( true );
    }
    if (0x7e000000 < uVar31) {
      return 0;
    }
    if (uVar31 != 0) {
      uVar3 = *puVar2;
      pcVar35 = (char *)((long)param_3 + (long)(int)param_5);
      *(uint *)(&UNK_00004018 + uVar34) = *(int *)(&UNK_00004018 + uVar34) + uVar31;
      *puVar2 = uVar3 + uVar31;
      *(undefined4 *)(&UNK_00004014 + uVar34) = 3;
      if (uVar31 < 0xd) {
code_r0x00098774:
        uVar34 = (long)param_2 + (uVar14 - (long)plVar20);
        if (pcVar35 < (char *)((long)param_3 + (uVar34 + 0xf0) / 0xff + uVar34 + 1)) {
          return 0;
        }
        uVar24 = uVar34 - 0xf;
        if (uVar34 < 0xf) {
          *(char *)param_3 = (char)((int)uVar34 << 4);
        }
        else {
          psVar9 = (short *)((long)param_3 + 1);
          *(char *)param_3 = -0x10;
          if (0xfe < uVar24) {
            uVar24 = (long)param_2 + (uVar14 - (long)plVar20) + -0x10e;
            uVar14 = uVar24 / 0xff;
            _memset(psVar9,0xff,uVar14 + 1);
            uVar24 = uVar24 % 0xff;
            psVar9 = (short *)((long)param_3 + uVar14 + 2);
          }
          *(char *)psVar9 = (char)uVar24;
          param_3 = psVar9;
        }
        _memcpy((char *)((long)param_3 + 1),plVar20,uVar34);
        return ((int)(char *)((long)param_3 + 1) + (int)uVar34) - iVar39;
      }
      lVar32 = (long)param_2 - (ulong)uVar3;
      plVar33 = (long *)((long)param_2 + (uVar14 - 0xb));
      *(short *)(uVar34 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) = (short)uVar3;
      puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
code_r0x00097720:
      uVar24 = 1;
      plVar36 = (long *)((long)plVar20 + 1U);
      uVar31 = param_6 << 6;
      iVar37 = *(int *)((long)plVar20 + 1U);
      do {
        plVar17 = plVar36;
        plVar36 = (long *)((long)plVar17 + uVar24);
        if (plVar33 < plVar36) goto code_r0x00098774;
        uVar24 = (ulong)(uVar31 >> 6);
        uVar31 = uVar31 + 1;
        lVar28 = (ulong)((uint)(iVar37 * -0x61c8864f) >> 0x13) * 2;
        uVar29 = (ulong)*(ushort *)(uVar34 + lVar28);
        sVar6 = (short)lVar32;
        lVar12 = *plVar36;
        *(short *)(uVar34 + lVar28) = (short)plVar17 - sVar6;
        bVar7 = *(int *)(lVar32 + uVar29) != iVar37;
        iVar37 = (int)lVar12;
      } while (bVar7);
      plVar36 = (long *)(lVar32 + uVar29);
      if ((param_2 < plVar36) && (*(char *)((long)plVar17 - 1) == *(char *)((long)plVar36 - 1))) {
        plVar8 = (long *)((long)param_2 + uVar29 + ~(ulong)uVar3);
        plVar10 = (long *)((long)plVar17 - 1U);
        plVar11 = (long *)((long)plVar17 - 1U);
        do {
          plVar17 = plVar11;
          plVar15 = plVar10;
          plVar36 = plVar8;
          if ((plVar36 <= param_2) || (plVar15 <= plVar20)) break;
          plVar8 = (long *)((long)plVar36 + -1);
          plVar10 = (long *)((long)plVar15 + -1);
          plVar11 = (long *)((long)plVar17 - 1);
        } while (*(char *)((long)plVar15 + -1) == *(char *)((long)plVar36 + -1));
      }
      else {
        plVar15 = plVar17;
      }
      plVar8 = (long *)((long)param_3 + 1);
      uVar24 = (long)plVar17 - (long)plVar20 & 0xffffffff;
      if (pcVar35 < (char *)((long)plVar8 + uVar24 / 0xff + uVar24 + 8)) {
        return 0;
      }
      uVar21 = (uint)((long)plVar17 - (long)plVar20);
      uVar31 = uVar21 - 0xf;
      if (uVar21 < 0xf) {
        *(char *)param_3 = (char)(uVar21 << 4);
      }
      else {
        *(char *)param_3 = -0x10;
        plVar10 = plVar8;
        if (0xfe < uVar31) {
          uVar31 = ((int)plVar17 - (int)plVar20) - 0x10e;
          uVar29 = (ulong)uVar31 / 0xff;
          _memset(plVar8,0xff,uVar29 + 1);
          uVar31 = uVar31 + (int)uVar29;
          plVar10 = (long *)((long)param_3 + uVar29 + 2);
        }
        plVar8 = (long *)((long)plVar10 + 1);
        *(char *)plVar10 = (char)uVar31;
      }
      plVar17 = (long *)((long)plVar8 + uVar24);
      plVar10 = plVar17;
      if (plVar17 <= plVar8 + 1) {
        plVar10 = plVar8 + 1;
      }
      psVar9 = param_3;
      if (((char *)((long)plVar10 + ~(ulong)plVar8) < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)plVar8 - (long)plVar20) < 0x40)) {
        plVar10 = plVar20;
        plVar11 = plVar8;
      }
      else {
        uVar24 = ((long)plVar10 + ~(ulong)plVar8 >> 3) + 1;
        uVar27 = uVar24 & 0x3ffffffffffffff8;
        plVar10 = plVar20 + uVar27;
        plVar11 = plVar8 + uVar27;
        plVar20 = plVar20 + 4;
        plVar8 = plVar8 + 4;
        uVar29 = uVar27;
        do {
          lVar28 = plVar20[-4];
          lVar13 = plVar20[-1];
          lVar12 = plVar20[-2];
          lVar43 = plVar20[1];
          lVar42 = *plVar20;
          lVar45 = plVar20[3];
          lVar44 = plVar20[2];
          plVar8[-3] = plVar20[-3];
          plVar8[-4] = lVar28;
          plVar8[-1] = lVar13;
          plVar8[-2] = lVar12;
          plVar8[1] = lVar43;
          *plVar8 = lVar42;
          plVar8[3] = lVar45;
          plVar8[2] = lVar44;
          uVar29 = uVar29 - 8;
          plVar20 = plVar20 + 8;
          plVar8 = plVar8 + 8;
        } while (uVar29 != 0);
        if (uVar24 == uVar27) goto code_r0x000978cc;
      }
      do {
        plVar20 = plVar11 + 1;
        *plVar11 = *plVar10;
        plVar10 = plVar10 + 1;
        plVar11 = plVar20;
      } while (plVar20 < plVar17);
code_r0x000978cc:
      do {
        param_3 = (short *)((long)plVar17 + 2);
        *(short *)plVar17 = (short)plVar15 - (short)plVar36;
        puVar1 = (ulong *)((long)plVar15 + 4);
        puVar25 = (ulong *)((long)plVar36 + 4);
        puVar26 = puVar1;
        if (puVar1 < puVar41) {
          uVar24 = *puVar1 ^ *puVar25;
          if (uVar24 == 0) {
            puVar25 = (ulong *)((long)plVar36 + 0xc);
            puVar26 = (ulong *)((long)plVar15 + 0xc);
            goto joined_r0x00097b0c;
          }
          uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
          uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
          uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
          uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
          uVar31 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
        }
        else {
joined_r0x00097b0c:
          if (puVar26 < puVar41) {
            iVar37 = ((int)puVar26 - (int)plVar15) + -4;
            do {
              uVar24 = *puVar26 ^ *puVar25;
              if (uVar24 != 0) {
                uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
                uVar31 = (int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) + iVar37;
                goto code_r0x000979b0;
              }
              puVar26 = puVar26 + 1;
              puVar25 = puVar25 + 1;
              iVar37 = iVar37 + 8;
            } while (puVar26 < puVar41);
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 8))) {
            if ((int)*puVar25 == (int)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 4);
              puVar25 = (ulong *)((long)puVar25 + 4);
            }
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 6))) {
            if ((short)*puVar25 == (short)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 2);
              puVar25 = (ulong *)((long)puVar25 + 2);
            }
          }
          if (puVar26 < (ulong *)((long)param_2 + (uVar14 - 5))) {
            if ((char)*puVar25 == (char)*puVar26) {
              puVar26 = (ulong *)((long)puVar26 + 1);
            }
          }
          uVar31 = (int)puVar26 - (int)puVar1;
        }
code_r0x000979b0:
        if (pcVar35 < (char *)((long)plVar17 + (ulong)(uVar31 + 0xf0) / 0xff + 8)) {
          return 0;
        }
        uVar21 = uVar31 - 0xf;
        if (uVar31 < 0xf) {
          *(char *)psVar9 = (char)*psVar9 + (char)uVar31;
        }
        else {
          *(char *)psVar9 = (char)*psVar9 + '\x0f';
          param_3[0] = -1;
          param_3[1] = -1;
          if (0x3fb < uVar21) {
            uVar24 = (ulong)((uVar31 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)plVar17 + 6),0xff,uVar24 + 4);
            uVar21 = (uVar31 - 0x40b) % 0x3fc;
            param_3 = (short *)((long)plVar17 + 6 + uVar24);
          }
          uVar22 = (uVar21 & 0xffff) / 0xff;
          pcVar18 = (char *)((long)param_3 + (ulong)uVar22);
          param_3 = (short *)(pcVar18 + 1);
          *pcVar18 = (char)uVar21 + (char)uVar22;
        }
        plVar20 = (long *)((long)plVar15 + (ulong)uVar31 + 4);
        if (plVar33 <= plVar20) goto code_r0x00098774;
        piVar16 = (int *)((long)plVar15 + (ulong)uVar31 + 2);
        *(short *)(uVar34 + (ulong)((uint)(*piVar16 * -0x61c8864f) >> 0x13) * 2) =
             (short)piVar16 - sVar6;
        lVar12 = *plVar20;
        lVar28 = (ulong)((uint)((int)lVar12 * -0x61c8864f) >> 0x13) * 2;
        plVar36 = (long *)(lVar32 + (ulong)*(ushort *)(uVar34 + lVar28));
        *(short *)(uVar34 + lVar28) = (short)plVar20 - sVar6;
        if ((int)*plVar36 != (int)lVar12) goto code_r0x00097720;
        plVar17 = (long *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
        plVar15 = plVar20;
        psVar9 = param_3;
      } while( true );
    }
    if ((int)param_5 < 1) {
      return 0;
    }
    goto code_r0x000986cc;
  }
  if ((int)uVar31 < 0x1000b) {
    if (uVar31 < 0x7e000001) {
      if (uVar31 != 0) {
        uVar3 = *puVar2;
        *(uint *)(&UNK_00004018 + uVar34) = *(int *)(&UNK_00004018 + uVar34) + uVar31;
        *puVar2 = uVar3 + uVar31;
        *(undefined4 *)(&UNK_00004014 + uVar34) = 3;
        if (0xc < uVar31) {
          lVar32 = (long)param_2 - (ulong)uVar3;
          plVar36 = (long *)((long)param_2 + (uVar14 - 0xb));
          *(short *)(uVar34 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
               (short)uVar3;
          puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
          plVar33 = param_2;
code_r0x00097258:
          uVar24 = 1;
          plVar17 = (long *)((long)plVar33 + 1U);
          uVar31 = param_6 << 6;
          iVar37 = *(int *)((long)plVar33 + 1U);
          do {
            plVar15 = plVar17;
            plVar17 = (long *)((long)plVar15 + uVar24);
            plVar20 = plVar33;
            if (plVar36 < plVar17) goto code_r0x000986e8;
            uVar24 = (ulong)(uVar31 >> 6);
            uVar31 = uVar31 + 1;
            lVar28 = (ulong)((uint)(iVar37 * -0x61c8864f) >> 0x13) * 2;
            uVar29 = (ulong)*(ushort *)(uVar34 + lVar28);
            sVar6 = (short)lVar32;
            lVar12 = *plVar17;
            *(short *)(uVar34 + lVar28) = (short)plVar15 - sVar6;
            bVar7 = *(int *)(lVar32 + uVar29) != iVar37;
            iVar37 = (int)lVar12;
          } while (bVar7);
          plVar17 = (long *)(lVar32 + uVar29);
          if ((param_2 < plVar17) && (*(char *)((long)plVar15 - 1) == *(char *)((long)plVar17 - 1)))
          {
            plVar8 = (long *)((long)param_2 + uVar29 + ~(ulong)uVar3);
            plVar10 = (long *)((long)plVar15 - 1U);
            plVar11 = (long *)((long)plVar15 - 1U);
            do {
              plVar15 = plVar11;
              plVar20 = plVar10;
              plVar17 = plVar8;
              if ((plVar17 <= param_2) || (plVar20 <= plVar33)) break;
              plVar8 = (long *)((long)plVar17 + -1);
              plVar10 = (long *)((long)plVar20 + -1);
              plVar11 = (long *)((long)plVar15 - 1);
            } while (*(char *)((long)plVar20 + -1) == *(char *)((long)plVar17 + -1));
          }
          else {
            plVar20 = plVar15;
          }
          plVar8 = (long *)((long)param_3 + 1);
          uVar21 = (uint)((long)plVar15 - (long)plVar33);
          uVar31 = uVar21 - 0xf;
          if (uVar21 < 0xf) {
            *(char *)param_3 = (char)(uVar21 << 4);
          }
          else {
            *(char *)param_3 = -0x10;
            plVar10 = plVar8;
            if (0xfe < uVar31) {
              uVar31 = ((int)plVar15 - (int)plVar33) - 0x10e;
              uVar24 = (ulong)uVar31 / 0xff;
              _memset(plVar8,0xff,uVar24 + 1);
              uVar31 = uVar31 + (int)uVar24;
              plVar10 = (long *)((long)param_3 + uVar24 + 2);
            }
            plVar8 = (long *)((long)plVar10 + 1);
            *(char *)plVar10 = (char)uVar31;
          }
          plVar15 = (long *)((long)plVar8 + ((long)plVar15 - (long)plVar33 & 0xffffffffU));
          plVar10 = plVar15;
          if (plVar15 <= plVar8 + 1) {
            plVar10 = plVar8 + 1;
          }
          psVar9 = param_3;
          if (((char *)((long)plVar10 + ~(ulong)plVar8) < &segment_command_00000020.vmaddr) ||
             ((ulong)((long)plVar8 - (long)plVar33) < 0x40)) {
            plVar10 = plVar33;
            plVar11 = plVar8;
          }
          else {
            uVar24 = ((long)plVar10 + ~(ulong)plVar8 >> 3) + 1;
            uVar27 = uVar24 & 0x3ffffffffffffff8;
            plVar10 = plVar33 + uVar27;
            plVar11 = plVar8 + uVar27;
            plVar33 = plVar33 + 4;
            plVar8 = plVar8 + 4;
            uVar29 = uVar27;
            do {
              lVar28 = plVar33[-4];
              lVar13 = plVar33[-1];
              lVar12 = plVar33[-2];
              lVar43 = plVar33[1];
              lVar42 = *plVar33;
              lVar45 = plVar33[3];
              lVar44 = plVar33[2];
              plVar8[-3] = plVar33[-3];
              plVar8[-4] = lVar28;
              plVar8[-1] = lVar13;
              plVar8[-2] = lVar12;
              plVar8[1] = lVar43;
              *plVar8 = lVar42;
              plVar8[3] = lVar45;
              plVar8[2] = lVar44;
              uVar29 = uVar29 - 8;
              plVar33 = plVar33 + 8;
              plVar8 = plVar8 + 8;
            } while (uVar29 != 0);
            if (uVar24 == uVar27) goto code_r0x000973d8;
          }
          do {
            plVar33 = plVar11 + 1;
            *plVar11 = *plVar10;
            plVar10 = plVar10 + 1;
            plVar11 = plVar33;
          } while (plVar33 < plVar15);
code_r0x000973d8:
          do {
            param_3 = (short *)((long)plVar15 + 2);
            *(short *)plVar15 = (short)plVar20 - (short)plVar17;
            puVar1 = (ulong *)((long)plVar20 + 4);
            puVar26 = (ulong *)((long)plVar17 + 4);
            if (puVar1 < puVar41) {
              uVar24 = *puVar1 ^ *puVar26;
              if (uVar24 == 0) {
                puVar26 = (ulong *)((long)plVar17 + 0xc);
                puVar25 = (ulong *)((long)plVar20 + 0xc);
                goto code_r0x00097424;
              }
              uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
              uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
              uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
              uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
              uVar21 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
              plVar20 = (long *)((long)plVar20 + (ulong)(uVar21 + 4));
code_r0x000974dc:
              *(char *)psVar9 = (char)*psVar9 + (char)uVar21;
            }
            else {
              puVar25 = puVar1;
code_r0x00097424:
              for (; puVar25 < puVar41; puVar25 = puVar25 + 1) {
                uVar24 = *puVar25 ^ *puVar26;
                if (uVar24 != 0) {
                  uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                  uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                  uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                  uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10
                  ;
                  puVar25 = (ulong *)((long)puVar25 +
                                     ((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3));
                  goto code_r0x00097454;
                }
                puVar26 = puVar26 + 1;
              }
              if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 8))) {
                if ((int)*puVar26 == (int)*puVar25) {
                  puVar25 = (ulong *)((long)puVar25 + 4);
                  puVar26 = (ulong *)((long)puVar26 + 4);
                }
              }
              if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 6))) {
                if ((short)*puVar26 == (short)*puVar25) {
                  puVar25 = (ulong *)((long)puVar25 + 2);
                  puVar26 = (ulong *)((long)puVar26 + 2);
                }
              }
              if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 5))) {
                if ((char)*puVar26 == (char)*puVar25) {
                  puVar25 = (ulong *)((long)puVar25 + 1);
                }
              }
code_r0x00097454:
              plVar20 = (long *)((long)plVar20 + ((long)puVar25 - (long)puVar1 & 0xffffffffU) + 4);
              uVar21 = (uint)((long)puVar25 - (long)puVar1);
              uVar31 = uVar21 - 0xf;
              if (uVar21 < 0xf) goto code_r0x000974dc;
              *(char *)psVar9 = (char)*psVar9 + '\x0f';
              param_3[0] = -1;
              param_3[1] = -1;
              if (0x3fb < uVar31) {
                uVar24 = (ulong)((uVar21 - 0x40b) / 0x3fc << 2);
                _memset((short *)((long)plVar15 + 6),0xff,uVar24 + 4);
                uVar31 = (uVar21 - 0x40b) % 0x3fc;
                param_3 = (short *)((long)plVar15 + 6 + uVar24);
              }
              uVar21 = (uVar31 & 0xffff) / 0xff;
              pcVar35 = (char *)((long)param_3 + (ulong)uVar21);
              param_3 = (short *)(pcVar35 + 1);
              *pcVar35 = (char)uVar31 + (char)uVar21;
            }
            if (plVar36 <= plVar20) break;
            *(short *)(uVar34 + (ulong)((uint)(*(int *)((long)plVar20 + -2) * -0x61c8864f) >> 0x13)
                                * 2) = (short)(int *)((long)plVar20 + -2) - sVar6;
            lVar12 = *plVar20;
            lVar28 = (ulong)((uint)((int)lVar12 * -0x61c8864f) >> 0x13) * 2;
            plVar17 = (long *)(lVar32 + (ulong)*(ushort *)(uVar34 + lVar28));
            *(short *)(uVar34 + lVar28) = (short)plVar20 - sVar6;
            if ((int)*plVar17 != (int)lVar12) goto code_r0x000975dc;
            plVar15 = (long *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
            psVar9 = param_3;
          } while( true );
        }
code_r0x000986e8:
        uVar34 = (long)param_2 + (uVar14 - (long)plVar20);
        uVar24 = uVar34 - 0xf;
        if (uVar34 < 0xf) {
          *(char *)param_3 = (char)((int)uVar34 << 4);
        }
        else {
          psVar9 = (short *)((long)param_3 + 1);
          *(char *)param_3 = -0x10;
          if (0xfe < uVar24) {
            uVar24 = (long)param_2 + (uVar14 - (long)plVar20) + -0x10e;
            uVar14 = uVar24 / 0xff;
            _memset(psVar9,0xff,uVar14 + 1);
            uVar24 = uVar24 % 0xff;
            psVar9 = (short *)((long)param_3 + uVar14 + 2);
          }
          *(char *)psVar9 = (char)uVar24;
          param_3 = psVar9;
        }
code_r0x00098840:
        _memcpy((char *)((long)param_3 + 1),plVar20,uVar34);
        return ((int)(char *)((long)param_3 + 1) + (int)uVar34) - iVar39;
      }
code_r0x000986cc:
      *(char *)param_3 = '\0';
      return 1;
    }
  }
  else if (uVar31 < 0x7e000001) {
    uVar3 = *puVar2;
    lVar32 = (long)param_2 - (ulong)uVar3;
    plVar36 = (long *)((long)param_2 + (uVar14 - 0xb));
    *(uint *)(&UNK_00004018 + uVar34) = *(int *)(&UNK_00004018 + uVar34) + uVar31;
    *puVar2 = uVar3 + uVar31;
    *(undefined4 *)(&UNK_00004014 + uVar34) = 2;
    plVar20 = (long *)((long)param_2 + 2);
    *(uint *)(uVar34 + ((ulong)(*param_2 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar3;
    puVar41 = (ulong *)((long)param_2 + (uVar14 - 0xc));
    plVar33 = param_2;
code_r0x00097cf4:
    uVar31 = param_6 << 6 | 1;
    lVar28 = *(long *)((long)plVar33 + 1U);
    plVar17 = (long *)((long)plVar33 + 1U);
    uVar21 = param_6;
    while( true ) {
      uVar29 = (ulong)(lVar28 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
      uVar22 = *(uint *)(uVar34 + uVar29);
      uVar24 = (ulong)uVar22;
      iVar37 = (int)lVar32;
      uVar5 = (int)plVar17 - iVar37;
      lVar28 = *plVar20;
      *(uint *)(uVar34 + uVar29) = uVar5;
      if ((uVar5 <= uVar22 + 0xffff) && (*(int *)(lVar32 + uVar24) == (int)*plVar17)) break;
      plVar15 = (long *)((long)plVar20 + (ulong)uVar21);
      uVar21 = uVar31 >> 6;
      uVar31 = uVar31 + 1;
      plVar17 = plVar20;
      plVar20 = plVar15;
      if (plVar36 < plVar15) goto code_r0x00098590;
    }
    plVar20 = (long *)(lVar32 + uVar24);
    if ((param_2 < plVar20) && (*(char *)((long)plVar17 - 1) == *(char *)((long)plVar20 - 1))) {
      plVar8 = (long *)((long)param_2 + uVar24 + ~(ulong)uVar3);
      plVar10 = (long *)((long)plVar17 - 1U);
      plVar11 = (long *)((long)plVar17 - 1U);
      do {
        plVar17 = plVar11;
        plVar15 = plVar10;
        plVar20 = plVar8;
        if ((plVar20 <= param_2) || (plVar15 <= plVar33)) break;
        plVar8 = (long *)((long)plVar20 + -1);
        plVar10 = (long *)((long)plVar15 + -1);
        plVar11 = (long *)((long)plVar17 - 1);
      } while (*(char *)((long)plVar15 + -1) == *(char *)((long)plVar20 + -1));
    }
    else {
      plVar15 = plVar17;
    }
    plVar8 = (long *)((long)param_3 + 1);
    uVar21 = (uint)((long)plVar17 - (long)plVar33);
    uVar31 = uVar21 - 0xf;
    if (uVar21 < 0xf) {
      *(char *)param_3 = (char)(uVar21 << 4);
    }
    else {
      *(char *)param_3 = -0x10;
      plVar10 = plVar8;
      if (0xfe < uVar31) {
        uVar31 = ((int)plVar17 - (int)plVar33) - 0x10e;
        uVar24 = (ulong)uVar31 / 0xff;
        _memset(plVar8,0xff,uVar24 + 1);
        uVar31 = uVar31 + (int)uVar24;
        plVar10 = (long *)((long)param_3 + uVar24 + 2);
      }
      plVar8 = (long *)((long)plVar10 + 1);
      *(char *)plVar10 = (char)uVar31;
    }
    plVar17 = (long *)((long)plVar8 + ((long)plVar17 - (long)plVar33 & 0xffffffffU));
    plVar10 = plVar17;
    if (plVar17 <= plVar8 + 1) {
      plVar10 = plVar8 + 1;
    }
    if ((&segment_command_00000020.vmaddr <= (char *)((long)plVar10 + ~(ulong)plVar8)) &&
       (0x3f < (ulong)((long)plVar8 - (long)plVar33))) {
      uVar24 = ((long)plVar10 + ~(ulong)plVar8 >> 3) + 1;
      uVar27 = uVar24 & 0x3ffffffffffffff8;
      plVar10 = plVar33 + 4;
      plVar11 = plVar8 + 4;
      uVar29 = uVar27;
      do {
        lVar28 = plVar10[-4];
        lVar13 = plVar10[-1];
        lVar12 = plVar10[-2];
        lVar43 = plVar10[1];
        lVar42 = *plVar10;
        lVar45 = plVar10[3];
        lVar44 = plVar10[2];
        plVar11[-3] = plVar10[-3];
        plVar11[-4] = lVar28;
        plVar11[-1] = lVar13;
        plVar11[-2] = lVar12;
        plVar11[1] = lVar43;
        *plVar11 = lVar42;
        plVar11[3] = lVar45;
        plVar11[2] = lVar44;
        uVar29 = uVar29 - 8;
        plVar10 = plVar10 + 8;
        plVar11 = plVar11 + 8;
      } while (uVar29 != 0);
      plVar33 = plVar33 + uVar27;
      plVar8 = plVar8 + uVar27;
      if (uVar24 == uVar27) goto code_r0x00097e88;
    }
    do {
      plVar10 = plVar8 + 1;
      *plVar8 = *plVar33;
      plVar33 = plVar33 + 1;
      plVar8 = plVar10;
    } while (plVar10 < plVar17);
code_r0x00097e88:
    plVar33 = plVar15;
    do {
      psVar9 = (short *)((long)plVar17 + 2);
      *(short *)plVar17 = (short)plVar33 - (short)plVar20;
      puVar1 = (ulong *)((long)plVar33 + 4);
      puVar26 = (ulong *)((long)plVar20 + 4);
      if (puVar1 < puVar41) {
        uVar24 = *puVar1 ^ *puVar26;
        if (uVar24 == 0) {
          puVar26 = (ulong *)((long)plVar20 + 0xc);
          puVar25 = (ulong *)((long)plVar33 + 0xc);
          goto code_r0x00097edc;
        }
        uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
        uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
        uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
        uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
        uVar21 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
        plVar33 = (long *)((long)plVar33 + (ulong)(uVar21 + 4));
code_r0x00097fa0:
        *(char *)param_3 = (char)*param_3 + (char)uVar21;
        param_3 = psVar9;
      }
      else {
        puVar25 = puVar1;
code_r0x00097edc:
        for (; puVar25 < puVar41; puVar25 = puVar25 + 1) {
          uVar24 = *puVar25 ^ *puVar26;
          if (uVar24 != 0) {
            uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
            uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
            uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
            uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
            puVar25 = (ulong *)((long)puVar25 +
                               ((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3));
            goto code_r0x00097f0c;
          }
          puVar26 = puVar26 + 1;
        }
        if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 8))) {
          if ((int)*puVar26 == (int)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 4);
            puVar26 = (ulong *)((long)puVar26 + 4);
          }
        }
        if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 6))) {
          if ((short)*puVar26 == (short)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 2);
            puVar26 = (ulong *)((long)puVar26 + 2);
          }
        }
        if (puVar25 < (ulong *)((long)param_2 + (uVar14 - 5))) {
          if ((char)*puVar26 == (char)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 1);
          }
        }
code_r0x00097f0c:
        plVar33 = (long *)((long)plVar33 + ((long)puVar25 - (long)puVar1 & 0xffffffffU) + 4);
        uVar21 = (uint)((long)puVar25 - (long)puVar1);
        uVar31 = uVar21 - 0xf;
        if (uVar21 < 0xf) goto code_r0x00097fa0;
        *(char *)param_3 = (char)*param_3 + '\x0f';
        psVar9[0] = -1;
        psVar9[1] = -1;
        if (0x3fb < uVar31) {
          uVar24 = (ulong)((uVar21 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)plVar17 + 6),0xff,uVar24 + 4);
          uVar31 = (uVar21 - 0x40b) % 0x3fc;
          psVar9 = (short *)((long)plVar17 + 6 + uVar24);
        }
        uVar21 = (uVar31 & 0xffff) / 0xff;
        pcVar35 = (char *)((long)psVar9 + (ulong)uVar21);
        *pcVar35 = (char)uVar31 + (char)uVar21;
        param_3 = (short *)(pcVar35 + 1);
      }
      if (plVar36 <= plVar33) goto code_r0x00098590;
      *(int *)(uVar34 + ((ulong)(*(long *)((long)plVar33 + -2) * -0x30e4432345000000) >> 0x32 &
                        0x3ffc)) = (int)(long *)((long)plVar33 + -2) - iVar37;
      uVar21 = (int)plVar33 - iVar37;
      uVar24 = (ulong)(*plVar33 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
      uVar31 = *(uint *)(uVar34 + uVar24);
      *(uint *)(uVar34 + uVar24) = uVar21;
      if ((uVar31 + 0xffff < uVar21) ||
         (plVar20 = (long *)(lVar32 + (ulong)uVar31), (int)*plVar20 != (int)*plVar33))
      goto code_r0x00097ce0;
      plVar17 = (long *)((long)param_3 + 1);
      *(char *)param_3 = '\0';
    } while( true );
  }
  return 0;
code_r0x0009b4fc:
  plVar20 = (long *)((long)plVar33 + 2);
  if (plVar36 < plVar20) {
LAB_0009b508:
    pcVar35 = (char *)((long)param_2 + (uVar14 - (long)plVar33));
    if (psVar9 < (short *)((long)param_3 + (long)(pcVar35 + (ulong)(pcVar35 + 0xf0) / 0xff + 1))) {
      pcVar35 = (char *)((long)psVar9 +
                        (~(ulong)param_3 - ((ulong)((long)psVar9 + ~(ulong)param_3 + 0xf1) >> 8)));
    }
    pcVar18 = pcVar35 + -0xf;
    iVar37 = (int)pcVar35;
    if (pcVar35 < "") {
      *(char *)param_3 = (char)(iVar37 << 4);
    }
    else {
      psVar9 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if ("" < pcVar18) {
        uVar14 = (ulong)(pcVar35 + -0x10e) / 0xff;
        _memset(psVar9,0xff,uVar14 + 1);
        pcVar18 = (char *)((ulong)(pcVar35 + -0x10e) % 0xff);
        psVar9 = (short *)((long)param_3 + uVar14 + 2);
      }
      *(char *)psVar9 = (char)pcVar18;
      param_3 = psVar9;
    }
    _memcpy((char *)((long)param_3 + 1),plVar33,pcVar35);
    *param_4 = ((int)plVar33 + iVar37) - (int)param_2;
    return ((int)(char *)((long)param_3 + 1) + iVar37) - iVar39;
  }
  goto code_r0x0009af00;
code_r0x00098104:
  plVar33 = (long *)((long)plVar20 + 2);
  if (plVar36 < plVar33) goto code_r0x00098604;
  goto code_r0x00098118;
code_r0x00098604:
  uVar34 = (long)param_2 + (uVar14 - (long)plVar20);
  if (pcVar35 < (char *)((long)param_3 + (uVar34 + 0xf0) / 0xff + uVar34 + 1)) {
    return 0;
  }
  uVar24 = uVar34 - 0xf;
  if (uVar34 < 0xf) {
    *(char *)param_3 = (char)((int)uVar34 << 4);
  }
  else {
    psVar9 = (short *)((long)param_3 + 1);
    *(char *)param_3 = -0x10;
    if (0xfe < uVar24) {
      uVar24 = (long)param_2 + (uVar14 - (long)plVar20) + -0x10e;
      uVar14 = uVar24 / 0xff;
      _memset(psVar9,0xff,uVar14 + 1);
      uVar24 = uVar24 % 0xff;
      psVar9 = (short *)((long)param_3 + uVar14 + 2);
    }
    *(char *)psVar9 = (char)uVar24;
    param_3 = psVar9;
  }
  goto code_r0x00098840;
code_r0x000975dc:
  plVar33 = plVar20;
  goto code_r0x00097258;
code_r0x00097ce0:
  plVar20 = (long *)((long)plVar33 + 2);
  if (plVar36 < plVar20) {
code_r0x00098590:
    uVar24 = (long)param_2 + (uVar14 - (long)plVar33);
    uVar34 = uVar24 - 0xf;
    if (uVar24 < 0xf) {
      *(char *)param_3 = (char)((int)uVar24 << 4);
    }
    else {
      psVar9 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar34) {
        uVar34 = (long)param_2 + (uVar14 - (long)plVar33) + -0x10e;
        uVar14 = uVar34 / 0xff;
        _memset(psVar9,0xff,uVar14 + 1);
        uVar34 = uVar34 % 0xff;
        psVar9 = (short *)((long)param_3 + uVar14 + 2);
      }
      *(char *)psVar9 = (char)uVar34;
      param_3 = psVar9;
    }
    _memcpy((char *)((long)param_3 + 1),plVar33,uVar24);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar24) - iVar39;
  }
  goto code_r0x00097cf4;
}

