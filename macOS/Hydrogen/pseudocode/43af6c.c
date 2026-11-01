
/* WARNING: Type propagation algorithm not settling */

void FUN_0043af6c(ulong param_1,uint *param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  long lVar2;
  segment_command *psVar3;
  ulong uVar4;
  long *plVar5;
  qword qVar6;
  code *pcVar7;
  bool bVar8;
  int iVar9;
  segment_command *psVar10;
  long lVar11;
  int *piVar12;
  segment_command *extraout_x1;
  segment_command *extraout_x1_00;
  uint uVar13;
  long lVar14;
  segment_command *psVar15;
  ulong uVar16;
  undefined1 *puVar17;
  ulong uVar18;
  undefined8 *puVar19;
  segment_command *extraout_x9;
  dword dVar20;
  dword *pdVar21;
  ulong uVar22;
  segment_command *psVar23;
  long *plVar24;
  qword *pqVar25;
  int *piVar26;
  qword *pqVar27;
  undefined1 *puVar28;
  segment_command *psVar29;
  undefined8 uVar30;
  undefined1 auVar31 [8];
  segment_command *unaff_x20;
  segment_command *unaff_x21;
  segment_command *psVar32;
  int iVar33;
  segment_command *unaff_x22;
  ulong uVar34;
  undefined8 *puVar35;
  long *plVar36;
  segment_command *unaff_x28;
  long unaff_x29;
  undefined4 uVar37;
  undefined6 uVar38;
  uint7 uVar39;
  segment_command *psVar40;
  ushort uVar41;
  undefined4 uVar42;
  undefined6 uVar43;
  ulong uVar44;
  undefined1 auVar45 [16];
  undefined8 uStack_25f0;
  segment_command *psStack_25e8;
  segment_command *psStack_25d8;
  segment_command *psStack_25c8;
  segment_command *psStack_25c0;
  segment_command *psStack_25b8;
  segment_command *psStack_25b0;
  segment_command *psStack_25a0;
  segment_command *psStack_2598;
  segment_command *psStack_2590;
  segment_command *psStack_2588;
  segment_command *psStack_2580;
  segment_command *psStack_2578;
  segment_command *psStack_2570;
  undefined8 uStack_2568;
  undefined8 uStack_2560;
  long lStack_2558;
  undefined8 uStack_2550;
  undefined8 uStack_2000;
  segment_command *psStack_1c40;
  segment_command *psStack_1c38;
  segment_command *psStack_1c30;
  segment_command *psStack_1c28;
  segment_command *psStack_1c20;
  segment_command *psStack_1c18;
  segment_command *psStack_1c10;
  undefined8 uStack_1c08;
  undefined8 uStack_1c00;
  long lStack_1bf8;
  undefined8 uStack_1bf0;
  segment_command *psStack_1300;
  segment_command *psStack_12f8;
  segment_command *psStack_12f0;
  segment_command *psStack_12e8;
  segment_command *psStack_12e0;
  segment_command *psStack_12d8;
  qword qStack_12d0;
  qword qStack_12c8;
  qword qStack_12c0;
  undefined8 uStack_12b8;
  undefined8 uStack_12b0;
  ulong uStack_12a8;
  undefined1 auStack_10c8 [8];
  segment_command *psStack_10c0;
  segment_command *psStack_10b8;
  segment_command *psStack_10b0;
  segment_command *psStack_10a8;
  segment_command *psStack_10a0;
  segment_command *psStack_1098;
  segment_command *psStack_1090;
  dword dStack_1088;
  dword dStack_1084;
  undefined8 uStack_1080;
  undefined8 uStack_1078;
  undefined8 uStack_1070;
  undefined8 uStack_1068;
  undefined8 uStack_1060;
  undefined8 uStack_1058;
  undefined8 uStack_1050;
  undefined8 uStack_1000;
  segment_command *psStack_ec0;
  segment_command *psStack_eb8;
  segment_command *psStack_eb0;
  segment_command *psStack_ea8;
  segment_command *psStack_ea0;
  segment_command *psStack_e98;
  segment_command *psStack_e90;
  segment_command *psStack_e88;
  segment_command *psStack_e80;
  char cStack_e78;
  undefined1 auStack_e70 [16];
  segment_command *psStack_e60;
  undefined8 uStack_e58;
  segment_command *psStack_e50;
  segment_command *psStack_e48;
  segment_command *psStack_e40;
  segment_command *psStack_e38;
  dword dStack_e30;
  dword dStack_e2c;
  undefined8 uStack_e28;
  undefined8 uStack_e20;
  undefined8 uStack_e18;
  undefined8 uStack_e10;
  undefined8 uStack_e08;
  undefined8 uStack_e00;
  undefined8 uStack_df8;
  long lStack_a48;
  undefined8 uStack_a40;
  undefined8 uStack_a38;
  segment_command *psStack_a30;
  segment_command *psStack_a28;
  segment_command *psStack_a20;
  segment_command *psStack_a18;
  segment_command *psStack_a10;
  segment_command *psStack_a08;
  ulong uStack_a00;
  qword qStack_9f8;
  qword qStack_9f0;
  undefined8 uStack_9e8;
  undefined8 uStack_9e0;
  ulong uStack_9d8;
  segment_command *psStack_800;
  char cStack_7f8;
  segment_command *psStack_7f0;
  segment_command *psStack_7e8;
  segment_command *psStack_7e0;
  undefined8 uStack_7d8;
  segment_command *psStack_7d0;
  segment_command *psStack_7c8;
  segment_command *psStack_7c0;
  segment_command *psStack_7b8;
  short sStack_7b0;
  dword dStack_7ac;
  undefined8 uStack_7a8;
  undefined8 uStack_7a0;
  undefined8 uStack_798;
  undefined8 uStack_790;
  undefined8 uStack_788;
  undefined8 uStack_780;
  undefined8 uStack_778;
  segment_command *psStack_5e0;
  segment_command *psStack_5d8;
  segment_command *psStack_5d0;
  segment_command *psStack_5c8;
  segment_command *psStack_5c0;
  segment_command *psStack_5b8;
  segment_command *psStack_5b0;
  segment_command *psStack_5a8;
  segment_command *psStack_3c8;
  segment_command *psStack_3c0;
  segment_command *psStack_3b8;
  segment_command *psStack_3b0;
  segment_command *psStack_3a8;
  segment_command *psStack_3a0;
  segment_command *psStack_398;
  undefined8 uStack_390;
  long lStack_388;
  segment_command *psStack_380;
  segment_command *psStack_378;
  segment_command *psStack_370;
  int *piStack_190;
  long lStack_188;
  ulong uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  int *piStack_110;
  long lStack_108;
  ulong uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  
  uStack_1000 = 0;
  uStack_2000 = 0;
  if (((param_1 & 1) != 0) &&
     (uVar13 = *param_2, param_2 = *(uint **)(param_2 + 2), (uVar13 & 1) == 0)) {
    param_2 = (uint *)__Unwind_GetIP();
  }
  psVar23 = (segment_command *)0x0;
  if (param_2 != (uint *)0x0) {
    psVar23 = (segment_command *)((long)param_2 + -1);
  }
  if (lRam0000000000a29ca0 == -0x8000000000000000) {
    psStack_7f0 = (segment_command *)0x0;
    psStack_7e8 = (segment_command *)&MACH_HEADER.cpusubtype;
    psStack_7e0 = (segment_command *)0x0;
    psVar10 = (segment_command *)__dyld_image_count();
    if ((int)psVar10 != 0) {
      psVar29 = (segment_command *)0x0;
      iVar9 = 0;
      uStack_25f0 = 1;
      psStack_25d8 = (segment_command *)CONCAT44(psStack_25d8._4_4_,(int)psVar10);
      unaff_x22 = psVar10;
      do {
        lVar11 = __dyld_get_image_name(iVar9);
        if (lVar11 == 0) {
LAB_0043b080:
          unaff_x21 = (segment_command *)0x8000000000000000;
        }
        else {
          psStack_25c8 = (segment_command *)_strlen();
          piVar12 = (int *)__dyld_get_image_header(iVar9);
          if (piVar12 == (int *)0x0) goto LAB_0043b080;
          if (*piVar12 == -0x1120531) {
            lVar14 = 0x20;
          }
          else {
            if (*piVar12 != -0x1120532) goto LAB_0043b080;
            lVar14 = 0x1c;
          }
          iVar33 = piVar12[4];
          uVar22 = (ulong)(uint)piVar12[5];
          psStack_25a0 = (segment_command *)0x0;
          psStack_2598 = (segment_command *)&MACH_HEADER.cpusubtype;
          psStack_2590 = (segment_command *)0x0;
          if (iVar33 == 0) {
            __dyld_get_image_vmaddr_slide(iVar9);
            psVar29 = (segment_command *)0x0;
            psVar32 = (segment_command *)0x0;
code_r0x0043d10c:
            func_0x007a2570(psVar32,psVar29,&UNK_009dc3f0);
            goto code_r0x0043d268;
          }
          psVar29 = (segment_command *)0x0;
          psVar32 = (segment_command *)0x0;
          psStack_25c0 = (segment_command *)((ulong)psStack_25c0 & 0xffffffff00000000);
          piVar12 = (int *)((long)piVar12 + lVar14);
          psVar15 = (segment_command *)&MACH_HEADER.cpusubtype;
          do {
            if (uVar22 < 8) {
code_r0x0043b248:
              if (psStack_25a0 != (segment_command *)0x0) {
                func_0x00187bd4(psStack_2598,(long)psStack_25a0 << 4,8);
              }
              unaff_x21 = (segment_command *)0x8000000000000000;
              goto code_r0x0043b398;
            }
            uVar13 = piVar12[1];
            uVar34 = (ulong)uVar13;
            if ((uVar13 < 8) || (bVar8 = uVar22 < uVar34, uVar22 = uVar22 - uVar34, bVar8))
            goto code_r0x0043b248;
            if (*piVar12 == 0x19) {
              if (uVar13 < 0x48) goto code_r0x0043b248;
              uVar30 = *(undefined8 *)(piVar12 + 4);
              uVar44 = *(ulong *)(piVar12 + 2);
              if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
                 (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                                    CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                             CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                      -((char)uVar44 == '\0')))),
                 uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                                   CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
                 uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
                 uVar41 = CONCAT11(-((char)((ulong)uVar30 >> 8) == '\0'),-((char)uVar30 == '\0')),
                 uVar42 = CONCAT13(-((char)((ulong)uVar30 >> 0x18) == '\0'),
                                   CONCAT12(-((char)((ulong)uVar30 >> 0x10) == '\0'),uVar41)),
                 uVar43 = CONCAT15(-((char)((ulong)uVar30 >> 0x28) == '\0'),
                                   CONCAT14(-((char)((ulong)uVar30 >> 0x20) == '\0'),uVar42)),
                 uVar16 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar30 >> 0x38) == '\0'),
                                                   CONCAT16(-((char)((ulong)uVar30 >> 0x30) == '\0')
                                                            ,uVar43)) >> 0x34),
                                   CONCAT16((char)((uint6)uVar43 >> 0x24),
                                            CONCAT15((char)((uint)uVar42 >> 0x14),
                                                     CONCAT14((char)(uVar41 >> 4),
                                                              CONCAT13((char)(CONCAT17(-((char)(
                                                  uVar44 >> 0x38) == '\0'),uVar39) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar38 >> 0x24),
                                                           CONCAT11((char)((uint)uVar37 >> 0x14),
                                                                    (char)(((ulong)uVar39 & 0xfff0)
                                                                          >> 4)))))))) &
                          0x8888888888888888, uVar44 = uVar16 >> 3,
                 uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
                 uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
                 uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10,
                 uVar16 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
                if (*(long *)(piVar12 + 10) == 0) {
                  psStack_25c0 = (segment_command *)
                                 CONCAT44(psStack_25c0._4_4_,
                                          *(long *)(piVar12 + 0xc) != 0 | (uint)psStack_25c0);
                }
                psVar32 = psVar29;
              }
              uVar44 = *(ulong *)(piVar12 + 8);
              psVar40 = *(segment_command **)(piVar12 + 6);
              if (psVar29 == psStack_25a0) {
                func_0x00403e60(&psStack_25a0,&UNK_009dc3d8);
                psVar15 = psStack_2598;
              }
              psStack_25b0 = psVar40;
code_r0x0043b0c0:
              *(ulong *)((dword *)((long)psVar15->segname + ((long)psVar29 * 4 + -2) * 4) + 2) =
                   uVar44;
              *(segment_command **)((long)psVar15->segname + ((long)psVar29 * 4 + -2) * 4) = psVar40
              ;
              psVar29 = (segment_command *)((long)&psVar29->cmd + 1);
              psStack_2590 = psVar29;
            }
            else if (*piVar12 == 1) {
              if (0x37 < uVar13) {
                uVar30 = *(undefined8 *)(piVar12 + 4);
                uVar44 = *(ulong *)(piVar12 + 2);
                if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
                   (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                                      CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                               CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                        -((char)uVar44 == '\0')))),
                   uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                                     CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
                   uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
                   uVar41 = CONCAT11(-((char)((ulong)uVar30 >> 8) == '\0'),-((char)uVar30 == '\0')),
                   uVar42 = CONCAT13(-((char)((ulong)uVar30 >> 0x18) == '\0'),
                                     CONCAT12(-((char)((ulong)uVar30 >> 0x10) == '\0'),uVar41)),
                   uVar43 = CONCAT15(-((char)((ulong)uVar30 >> 0x28) == '\0'),
                                     CONCAT14(-((char)((ulong)uVar30 >> 0x20) == '\0'),uVar42)),
                   uVar16 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar30 >> 0x38) == '\0'),
                                                     CONCAT16(-((char)((ulong)uVar30 >> 0x30) ==
                                                               '\0'),uVar43)) >> 0x34),
                                     CONCAT16((char)((uint6)uVar43 >> 0x24),
                                              CONCAT15((char)((uint)uVar42 >> 0x14),
                                                       CONCAT14((char)(uVar41 >> 4),
                                                                CONCAT13((char)(CONCAT17(-((char)(
                                                  uVar44 >> 0x38) == '\0'),uVar39) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar38 >> 0x24),
                                                           CONCAT11((char)((uint)uVar37 >> 0x14),
                                                                    (char)(((ulong)uVar39 & 0xfff0)
                                                                          >> 4)))))))) &
                            0x8888888888888888, uVar44 = uVar16 >> 3,
                   uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
                   uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
                   uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                            (uVar44 & 0xffff0000ffff) << 0x10,
                   uVar16 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
                  if (piVar12[8] == 0) {
                    psStack_25c0 = (segment_command *)
                                   CONCAT44(psStack_25c0._4_4_,piVar12[9] != 0 | (uint)psStack_25c0)
                    ;
                  }
                  psVar32 = psVar29;
                }
                uVar44 = *(ulong *)(piVar12 + 6);
                if (psVar29 == psStack_25a0) {
                  func_0x00403e60(&psStack_25a0,&UNK_009dc3c0);
                }
                psVar40 = (segment_command *)(uVar44 & 0xffffffff);
                uVar44 = uVar44 >> 0x20;
                psVar15 = psStack_2598;
                goto code_r0x0043b0c0;
              }
              goto code_r0x0043b248;
            }
            piVar12 = (int *)((long)piVar12 + uVar34);
            iVar33 = iVar33 + -1;
          } while (iVar33 != 0);
          psStack_25b8 = (segment_command *)__dyld_get_image_vmaddr_slide(iVar9);
          if (((ulong)psStack_25c0 & 1) == 0) {
            if (psVar29 <= psVar32) goto code_r0x0043d10c;
            lVar14 = *(long *)((long)psStack_2598->segname + ((long)psVar32 * 4 + -2) * 4);
            uVar22 = (ulong)((long)&psVar29[-1].flags + 3) & 0xfffffffffffffff;
            psVar32 = psStack_2598;
            if (uVar22 < 3) {
code_r0x0043b318:
              do {
                pdVar21 = (dword *)psVar32->segname;
                *(ulong *)psVar32 = *(ulong *)psVar32 - lVar14;
                psVar32 = (segment_command *)(pdVar21 + 2);
              } while ((segment_command *)(pdVar21 + 2) !=
                       (segment_command *)
                       ((long)psStack_2598->segname + ((long)psVar29 * 4 + -2) * 4));
            }
            else {
              uVar22 = uVar22 + 1;
              uVar44 = uVar22 & 0x1ffffffffffffffc;
              psVar32 = (segment_command *)((long)psStack_2598->segname + (uVar44 * 4 + -2) * 4);
              pqVar27 = &psStack_2598->vmsize;
              uVar34 = uVar44;
              do {
                *(long *)(pqVar27 + -4) = *(long *)(pqVar27 + -4) - lVar14;
                pqVar27[-2] = pqVar27[-2] - lVar14;
                *pqVar27 = *pqVar27 - lVar14;
                pqVar27[2] = pqVar27[2] - lVar14;
                pqVar27 = pqVar27 + 8;
                uVar34 = uVar34 - 4;
              } while (uVar34 != 0);
              if (uVar22 != uVar44) goto code_r0x0043b318;
            }
            psStack_25b8 = (segment_command *)((long)psStack_25b8->segname + lVar14 + -8);
          }
          if ((long)psStack_25c8 < 0) {
            uStack_25f0 = 0;
LAB_0043d174:
            func_0x007a1f00(uStack_25f0,psStack_25c8,&UNK_009d9be8);
            goto code_r0x0043d268;
          }
          if (psStack_25c8 == (segment_command *)0x0) {
            unaff_x28 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            unaff_x28 = (segment_command *)func_0x00187bd0(psStack_25c8,1);
            if (unaff_x28 == (segment_command *)0x0) goto LAB_0043d174;
          }
          _memcpy(unaff_x28,lVar11,psStack_25c8);
          psStack_1c38 = psStack_2598;
          psStack_1c40 = psStack_25a0;
          psStack_1c30 = psStack_2590;
          unaff_x20 = psStack_25c8;
          unaff_x21 = psStack_25c8;
code_r0x0043b398:
          unaff_x22 = (segment_command *)((ulong)psVar10 & 0xffffffff);
          psVar29 = psStack_7e0;
        }
        psStack_2580 = psStack_1c38;
        psStack_2588 = psStack_1c40;
        psStack_2578 = psStack_1c30;
        psStack_2570 = psStack_25b8;
        psStack_25a0 = unaff_x21;
        psStack_2598 = unaff_x28;
        psStack_2590 = unaff_x20;
        if ((ulong)((long)psStack_7f0 - (long)psVar29) <
            (ulong)(unaff_x21 != (segment_command *)0x8000000000000000)) {
          func_0x007a0000(&psStack_7f0,psVar29,
                          (ulong)(unaff_x21 != (segment_command *)0x8000000000000000),8,0x38);
          psVar29 = psStack_7e0;
        }
        if (unaff_x21 != (segment_command *)0x8000000000000000) {
          pdVar21 = (dword *)((long)psStack_7e8->segname + ((long)psVar29 * 0xe + -2) * 4);
          *(segment_command **)pdVar21 = unaff_x21;
          *(segment_command **)(pdVar21 + 2) = unaff_x28;
          *(segment_command **)(pdVar21 + 4) = unaff_x20;
          *(segment_command **)(pdVar21 + 6) = psStack_2588;
          *(segment_command **)(pdVar21 + 8) = psStack_2580;
          *(segment_command **)(pdVar21 + 0xc) = psStack_2570;
          *(segment_command **)(pdVar21 + 10) = psStack_2578;
          psVar29 = (segment_command *)((long)&psVar29->cmd + 1);
        }
        iVar9 = iVar9 + 1;
        psStack_7e0 = psVar29;
      } while (iVar9 != (int)unaff_x22);
    }
    psStack_2598 = psStack_7e8;
    psStack_25a0 = psStack_7f0;
    psStack_2590 = psStack_7e0;
    _memcpy(&psStack_2588,&psStack_1c40,0x940);
    lVar14 = lRam0000000000a29ca8;
    lVar11 = lRam0000000000a29ca0;
    if (lRam0000000000a29ca0 != -0x8000000000000000) {
      if (psRam0000000000a29cb0 != (segment_command *)0x0) {
        unaff_x22 = (segment_command *)(lRam0000000000a29ca8 + 0x20);
        psVar10 = psRam0000000000a29cb0;
        do {
          if (*(undefined8 *)((long)unaff_x22 + -0x20) != 0) {
            func_0x00187bd4(*(undefined8 *)((long)unaff_x22 + -0x18),
                            *(undefined8 *)((long)unaff_x22 + -0x20),1);
          }
          if (*(undefined8 *)((long)unaff_x22 + -8) != 0) {
            func_0x00187bd4(*(undefined8 *)unaff_x22,*(undefined8 *)((long)unaff_x22 + -8) << 4,8);
          }
          unaff_x22 = (segment_command *)((long)unaff_x22 + 0x38);
          psVar10 = (segment_command *)((long)&psVar10[-1].flags + 3);
        } while (psVar10 != (segment_command *)0x0);
      }
      unaff_x21 = (segment_command *)0x0;
      if (lVar11 != 0) {
        func_0x00187bd4(lVar14,lVar11 * 0x38,8);
      }
    }
    _memcpy(0xa29ca0,&psStack_25a0,0x958);
    psRam0000000000a2a5f8 = (segment_command *)0x0;
    psStack_25e8 = psVar23;
  }
  psVar29 = psRam0000000000a29cb8;
  psVar10 = (segment_command *)0xa29ca0;
  if (psRam0000000000a29cb0 == (segment_command *)0x0) {
    return;
  }
  psVar32 = (segment_command *)0x0;
  lVar11 = lRam0000000000a29ca8;
  do {
    puVar19 = (undefined8 *)(lVar11 + 0x20);
    plVar24 = (long *)(lVar11 + 0x28);
    plVar36 = *(long **)(lVar11 + 0x30);
    lVar11 = lVar11 + 0x38;
    lVar14 = *plVar24 << 4;
    plVar24 = (long *)*puVar19;
    while (lVar14 != 0) {
      lVar2 = *plVar24;
      plVar5 = plVar24 + 1;
      lVar14 = lVar14 + -0x10;
      plVar24 = plVar24 + 2;
      if ((segment_command *)(lVar2 + (long)plVar36) <= psVar23 &&
          psVar23 < (segment_command *)
                    (((segment_command *)(lVar2 + (long)plVar36))->segname + *plVar5 + -8)) {
        if (&MACH_HEADER.cputype < psRam0000000000a2a5f8) {
          func_0x007a28b0(psRam0000000000a2a5f8,4,&UNK_009dc378);
          psVar10 = extraout_x1;
          goto code_r0x0043c540;
        }
        if (psRam0000000000a2a5f8 != (segment_command *)0x0) {
          if (psRam0000000000a29cb8 == psVar32) {
            psVar10 = (segment_command *)0x0;
          }
          else {
            lVar11 = (long)psRam0000000000a2a5f8 * 0x250;
            unaff_x21 = psRam0000000000a29cb8;
            if (lVar11 == 0x250) goto LAB_0043b864;
            if (psRam0000000000a29f08 == psVar32) {
              psVar10 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            }
            else {
              if (lVar11 == 0x4a0) goto LAB_0043b864;
              if (psRam0000000000a2a158 == psVar32) {
                psVar10 = (segment_command *)((long)&MACH_HEADER.magic + 2);
              }
              else {
                if ((lVar11 == 0x6f0) || (psRam0000000000a2a3a8 != psVar32)) goto LAB_0043b864;
                psVar10 = (segment_command *)((long)&MACH_HEADER.magic + 3);
              }
            }
          }
          if (psRam0000000000a2a5f8 <= psVar10) {
            return;
          }
          lVar11 = (long)psVar10 * 0x250 + 0xa29cb8;
          _memcpy(&psStack_1c40,lVar11,0x250);
          if ((long)psVar10 * 0x250 != -0x250) {
            _memcpy(&psStack_25a0,0xa29cb8,0x250);
            _memcpy(0xa29cb8,&psStack_1c40,0x250);
            _memcpy(&psStack_1c40,&psStack_25a0,0x250);
            if (psVar29 != psVar32) {
              _memcpy(&psStack_25a0,0xa29f08,0x250);
              _memcpy(0xa29f08,&psStack_1c40,0x250);
              _memcpy(&psStack_1c40,&psStack_25a0,0x250);
              if (lVar11 != 0xa29f08) {
                _memcpy(&psStack_25a0,0xa2a158,0x250);
                _memcpy(0xa2a158,&psStack_1c40,0x250);
                _memcpy(&psStack_1c40,&psStack_25a0,0x250);
                if (lVar11 != 0xa2a158) {
                  _memcpy(&psStack_25a0,0xa2a3a8,0x250);
                  _memcpy(0xa2a3a8,&psStack_1c40,0x250);
                  _memcpy(&psStack_1c40,&psStack_25a0,0x250);
                }
              }
            }
          }
          goto LAB_0043b71c;
        }
LAB_0043b864:
        psVar29 = psRam0000000000a29cb0;
        if (psRam0000000000a29cb0 <= psVar32) goto code_r0x0043d1a0;
        lVar11 = lRam0000000000a29ca8 + (long)psVar32 * 0x38;
        psVar10 = *(segment_command **)(lVar11 + 8);
        psVar29 = *(segment_command **)(lVar11 + 0x10);
        func_0x0043add8(&psStack_25a0,psVar10,psVar29);
        psVar40 = psStack_2590;
        psVar15 = psStack_2598;
        if (((ulong)psStack_25a0 & 1) == 0) {
          return;
        }
        func_0x0043d660(&psStack_25a0,psStack_2598,psStack_2590);
        if ((((psStack_25a0 == (segment_command *)0x0) || (psStack_25a0->cmd == 0xcffaedfe)) ||
            (psStack_2590 < &segment_command_00000020)) ||
           (puVar17 = (undefined1 *)(ulong)*(dword *)((long)psStack_25a0->segname + 0xc),
           &psStack_2590[-1].fileoff < puVar17)) goto LAB_0043b8c0;
        dVar20 = *(dword *)((long)psStack_25a0->segname + 8);
        pqVar27 = &psStack_2598->vmsize;
        goto code_r0x0043bb40;
      }
    }
    psVar32 = (segment_command *)((long)&psVar32->cmd + 1);
    if (lVar11 == lRam0000000000a29ca8 + (long)psRam0000000000a29cb0 * 0x38) {
      return;
    }
  } while( true );
  while( true ) {
    if (puVar17 < &MACH_HEADER.cpusubtype) goto LAB_0043b8c0;
    uVar13 = *(uint *)((long)pqVar25 + 4);
    puVar28 = (undefined1 *)(ulong)uVar13;
    if (uVar13 < 8 || puVar17 < puVar28) goto LAB_0043b8c0;
    puVar17 = puVar17 + -(long)puVar28;
    dVar20 = dVar20 - 1;
    pqVar27 = (qword *)((long)pqVar25 + (long)puVar28);
    if ((int)*pqVar25 == 0x1b && 0x17 < uVar13) break;
code_r0x0043bb40:
    pqVar25 = pqVar27;
    if (dVar20 == 0) goto code_r0x0043c238;
  }
  if (psVar29 == (segment_command *)0x0) {
    bVar8 = false;
  }
  else {
    bVar8 = (char)psVar10->cmd == '/';
  }
  psStack_25b0 = (segment_command *)(ulong)*(ushort *)((long)pqVar25 + 0xc);
  qVar6 = pqVar25[1];
  psStack_25b8 = (segment_command *)(ulong)*(ushort *)((long)pqVar25 + 0x16);
  unaff_x28 = *(segment_command **)((long)pqVar25 + 0xe);
  psStack_2590 = (segment_command *)CONCAT71(psStack_2590._1_7_,6);
  uStack_2568 = CONCAT62(CONCAT51(uStack_2568._3_5_,bVar8),0x200);
  psStack_25a0 = psVar10;
  psStack_2598 = psVar29;
  func_0x004248f4(&psStack_1c40,&psStack_25a0);
  if (((byte)psStack_1c40 - 7 < 3) && (lVar11 = func_0x00423fe0(&psStack_25a0), lVar11 != 0)) {
    func_0x00429d60(&psStack_25a0);
    if ((char)psStack_2598 == '\x02') {
      if (((ulong)psStack_25a0 & 3) == 1) {
        puVar19 = (undefined8 *)((long)&psStack_25a0[-1].flags + 3);
        uVar30 = *puVar19;
        puVar35 = *(undefined8 **)((long)&psStack_25a0->cmdsize + 3);
        if ((code *)*puVar35 != (code *)0x0) {
          (*(code *)*puVar35)(uVar30);
        }
        if (puVar35[1] != 0) {
          func_0x00187bd4(uVar30,puVar35[1],puVar35[2]);
        }
        func_0x00187bd4(puVar19,0x18,8);
      }
    }
    else {
      psStack_25c0 = (segment_command *)((ulong)unaff_x28 >> 0x10 | (long)psStack_25b8 << 0x30);
      psStack_25c8 = (segment_command *)((ulong)(uint6)qVar6 | (long)unaff_x28 << 0x30);
      psStack_e80 = psStack_25a0;
      cStack_e78 = (char)psStack_2598;
      while( true ) {
        unaff_x28 = (segment_command *)auStack_e70;
        func_0x0041743c(&psStack_1c40,&psStack_e80);
        psVar29 = psStack_1c30;
        psVar10 = psStack_1c38;
        if ((int)psStack_1c40 != 1) break;
        if (psStack_1c38 == (segment_command *)0x0) {
          if (((ulong)psStack_1c30 & 3) == 1) {
            puVar19 = (undefined8 *)((long)&psStack_1c30[-1].flags + 3);
            uVar30 = *puVar19;
            puVar35 = *(undefined8 **)((long)&psStack_1c30->cmdsize + 3);
            if ((code *)*puVar35 != (code *)0x0) {
              (*(code *)*puVar35)(uVar30);
            }
            if (puVar35[1] != 0) {
              func_0x00187bd4(uVar30,puVar35[1],puVar35[2]);
            }
            func_0x00187bd4(puVar19,0x18,8);
          }
          auStack_10c8 = (undefined1  [8])0x8000000000000000;
code_r0x0043c4a8:
          uVar22 = *(ulong *)psStack_e80;
          *(ulong *)psStack_e80 = uVar22 - 1;
          LORelease();
          if (uVar22 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(&psStack_e80);
          }
          auVar31 = auStack_10c8;
          if (auStack_10c8 == (undefined1  [8])0x8000000000000000) goto code_r0x0043c22c;
          _memcpy(&qStack_12d0,&psStack_10c0,0x200);
          unaff_x21 = psStack_eb8;
          unaff_x22 = psStack_ec0;
          psStack_12f8 = psStack_ea8;
          psStack_1300 = psStack_eb0;
          psStack_12e8 = psStack_e98;
          psStack_12f0 = psStack_ea0;
          psStack_12d8 = psStack_e88;
          psStack_12e0 = psStack_e90;
          _munmap(psVar15,psVar40);
          unaff_x28 = unaff_x21;
          goto code_r0x0043c358;
        }
        _memcpy(&psStack_e60,&psStack_1c28,0x410);
        auStack_e70._0_8_ = psVar10;
        auStack_e70._8_8_ = psVar29;
        uVar41 = uStack_e58._2_2_;
        uVar22 = (ulong)uStack_e58._2_2_;
        if (uStack_e58._2_2_ == 0) {
          psVar29 = (segment_command *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          psVar29 = (segment_command *)func_0x00187bd0(uVar22,1);
          if (psVar29 == (segment_command *)0x0) {
            func_0x007a1f00(1,uVar22,&UNK_009d9be8);
code_r0x0043d268:
                    /* WARNING: Does not return */
            pcVar7 = (code *)SoftwareBreakpoint(1,0x43d26c);
            (*pcVar7)();
          }
        }
        _memcpy(psVar29,(long)&uStack_e58 + 5,uVar22);
        func_0x0046b8d0(&psStack_25a0,psVar29,uVar22);
        if ((((ulong)psStack_25a0 & 1) == 0) && (4 < uVar41)) {
          if (*(int *)((long)psVar29->segname + (uVar22 - 0xd)) != 0x5953642e ||
              *(char *)((long)psVar29->segname + (uVar22 - 9)) != 'M') goto code_r0x0043bd4c;
          func_0x004261e4(&psStack_25a0,psVar10->vmaddr,psVar10->vmsize,(long)&uStack_e58 + 5,uVar22
                         );
          psVar10 = psStack_2598;
          func_0x004261e4(&lStack_a48,psStack_2598,psStack_2590,&UNK_00887de9,0x18);
          if (psStack_25a0 != (segment_command *)0x0) {
            func_0x00187bd4(psVar10,psStack_25a0,1);
          }
          func_0x00429d60(&psStack_25a0,uStack_a40,uStack_a38);
          psStack_25b8 = psVar29;
          if ((char)psStack_2598 == '\x02') {
            if (((ulong)psStack_25a0 & 3) == 1) {
              puVar19 = (undefined8 *)((long)&psStack_25a0[-1].flags + 3);
              uVar30 = *puVar19;
              puVar35 = *(undefined8 **)((long)&psStack_25a0->cmdsize + 3);
              if ((code *)*puVar35 != (code *)0x0) {
                (*(code *)*puVar35)(uVar30);
              }
              if (puVar35[1] != 0) {
                func_0x00187bd4(uVar30,puVar35[1],puVar35[2]);
              }
              func_0x00187bd4(puVar19,0x18,8);
            }
          }
          else {
            psStack_800 = psStack_25a0;
            cStack_7f8 = (char)psStack_2598;
            while( true ) {
              func_0x0041743c(&psStack_25a0,&psStack_800);
              psVar3 = psStack_2590;
              psVar10 = psStack_2598;
              if ((int)psStack_25a0 != 1) break;
              if (psStack_2598 == (segment_command *)0x0) {
                if (((ulong)psStack_2590 & 3) == 1) {
                  puVar19 = (undefined8 *)((long)&psStack_2590[-1].flags + 3);
                  uVar30 = *puVar19;
                  puVar35 = *(undefined8 **)((long)&psStack_2590->cmdsize + 3);
                  if ((code *)*puVar35 != (code *)0x0) {
                    (*(code *)*puVar35)(uVar30);
                  }
                  if (puVar35[1] != 0) {
                    func_0x00187bd4(uVar30,puVar35[1],puVar35[2]);
                  }
                  func_0x00187bd4(puVar19,0x18,8);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c178:
                uVar34 = *(ulong *)psStack_800;
                *(ulong *)psStack_800 = uVar34 - 1;
                LORelease();
                if (uVar34 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(&psStack_800);
                }
                if (unaff_x28 == (segment_command *)0x8000000000000000) goto code_r0x0043c1a8;
                _memcpy(&psStack_10c0,&uStack_a00,0x200);
                psStack_ea8 = psStack_a28;
                psStack_eb0 = psStack_a30;
                psStack_e98 = psStack_a18;
                psStack_ea0 = psStack_a20;
                psStack_e88 = psStack_a08;
                psStack_e90 = psStack_a10;
                psStack_ec0 = psStack_25d8;
                psStack_eb8 = psStack_25e8;
                auStack_10c8 = (undefined1  [8])unaff_x28;
                if (lStack_a48 != 0) {
                  func_0x00187bd4(uStack_a40,lStack_a48,1);
                }
                func_0x00187bd4(psVar29,uVar22,1);
                uVar22 = *(ulong *)auStack_e70._0_8_;
                *(ulong *)auStack_e70._0_8_ = uVar22 - 1;
                LORelease();
                if (uVar22 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_e70);
                }
                goto code_r0x0043c4a8;
              }
              _memcpy(&psStack_7e0,&psStack_2588,0x410);
              psStack_7f0 = psVar10;
              psStack_7e8 = psVar3;
              func_0x004261e4(&psStack_398,psVar10->vmaddr,psVar10->vmsize,(long)&uStack_7d8 + 5,
                              uStack_7d8._2_2_);
              uVar30 = uStack_390;
              func_0x0043add8(unaff_x29 + -0xf0,uStack_390,lStack_388);
              if (*(int *)(unaff_x29 + -0xf0) != 1) {
                if (psStack_398 != (segment_command *)0x0) {
                  func_0x00187bd4(uVar30,psStack_398,1);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c158:
                uVar34 = *(ulong *)psVar10;
                *(ulong *)psVar10 = uVar34 - 1;
                LORelease();
                if (uVar34 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(&psStack_7f0);
                }
                goto code_r0x0043c178;
              }
              psVar3 = *(segment_command **)(unaff_x29 + -0xe8);
              psStack_25b0 = *(segment_command **)(unaff_x29 + -0xe0);
              if (psStack_398 != (segment_command *)0x0) {
                func_0x00187bd4(uVar30,psStack_398,1);
              }
              psStack_3c8 = (segment_command *)0x0;
              psStack_3c0 = (segment_command *)&MACH_HEADER.cpusubtype;
              psStack_3b8 = (segment_command *)0x0;
              psStack_3b0 = (segment_command *)0x0;
              psStack_3a8 = (segment_command *)&MACH_HEADER.cpusubtype;
              psStack_3a0 = (segment_command *)0x0;
              func_0x0043d660(&piStack_190,psVar3,psStack_25b0);
              if ((((piStack_190 != (int *)0x0) && (*piStack_190 != -0x30051202)) &&
                  (0x1f < uStack_180)) &&
                 (uVar34 = (ulong)(uint)piStack_190[5], uVar34 <= uStack_180 - 0x20)) {
                iVar9 = piStack_190[4];
                piVar12 = (int *)(lStack_188 + 0x20);
                do {
                  piVar26 = piVar12;
                  if ((iVar9 == 0) || (uVar34 < 8)) goto code_r0x0043bf34;
                  uVar13 = piVar26[1];
                  uVar44 = (ulong)uVar13;
                  if (uVar13 < 8 || uVar34 < uVar44) goto code_r0x0043bf34;
                  uVar34 = uVar34 - uVar44;
                  iVar9 = iVar9 + -1;
                  piVar12 = (int *)((long)piVar26 + uVar44);
                } while (*piVar26 != 0x1b || uVar13 < 0x18);
                if ((*(segment_command **)(piVar26 + 4) == psStack_25c0 &&
                     *(segment_command **)(piVar26 + 2) == psStack_25c8) &&
                   (func_0x0043d840(&piStack_190), piStack_190 != (int *)0x8000000000000000)) {
                  uStack_c8 = uStack_148;
                  uStack_d0 = uStack_150;
                  uStack_b8 = uStack_138;
                  uStack_c0 = uStack_140;
                  uStack_a8 = uStack_128;
                  uStack_b0 = uStack_130;
                  uStack_98 = uStack_118;
                  uStack_a0 = uStack_120;
                  lStack_108 = lStack_188;
                  piStack_110 = piStack_190;
                  uStack_f8 = uStack_178;
                  uStack_100 = uStack_180;
                  uStack_e8 = uStack_168;
                  uStack_f0 = uStack_170;
                  uStack_d8 = uStack_158;
                  uStack_e0 = uStack_160;
                  *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
                  func_0x004385b0(&psStack_398,&piStack_110,unaff_x29 + -0xf0,unaff_x29 + -0xf0);
                  unaff_x28 = psStack_398;
                  if (psStack_398 != (segment_command *)0x8000000000000000) {
                    _memcpy(&uStack_a00,&uStack_390,0x200);
                    psStack_a28 = psStack_3c0;
                    psStack_a30 = psStack_3c8;
                    psStack_a18 = psStack_3b0;
                    psStack_a20 = psStack_3b8;
                    psStack_a08 = psStack_3a0;
                    psStack_a10 = psStack_3a8;
                    psStack_25e8 = psStack_25b0;
                    psStack_25d8 = psVar3;
                    goto code_r0x0043c158;
                  }
                }
              }
code_r0x0043bf34:
              func_0x003f7334(&psStack_3c8);
              _munmap(psVar3,psStack_25b0);
              uVar34 = *(ulong *)psVar10;
              *(ulong *)psVar10 = uVar34 - 1;
              LORelease();
              if (uVar34 == 1) {
                DataMemoryBarrier(2,1);
                func_0x004037b4(&psStack_7f0);
              }
            }
            uVar34 = *(ulong *)psStack_800;
            *(ulong *)psStack_800 = uVar34 - 1;
            LORelease();
            if (uVar34 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(&psStack_800);
            }
          }
code_r0x0043c1a8:
          if (lStack_a48 != 0) {
            func_0x00187bd4(uStack_a40,lStack_a48,1);
          }
          func_0x00187bd4(psVar29,uVar22,1);
          uVar22 = *(ulong *)auStack_e70._0_8_;
          *(ulong *)auStack_e70._0_8_ = uVar22 - 1;
          LORelease();
          if (uVar22 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_e70);
          }
        }
        else {
          if (uVar41 != 0) {
code_r0x0043bd4c:
            func_0x00187bd4(psVar29,uVar22,1);
          }
          uVar22 = *(ulong *)psVar10;
          *(ulong *)psVar10 = uVar22 - 1;
          LORelease();
          if (uVar22 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_e70);
          }
        }
      }
      uVar22 = *(ulong *)psStack_e80;
      *(ulong *)psStack_e80 = uVar22 - 1;
      LORelease();
      if (uVar22 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(&psStack_e80);
      }
    }
    auStack_10c8 = (undefined1  [8])0x8000000000000000;
code_r0x0043c22c:
    func_0x003f7b28(auStack_10c8);
  }
code_r0x0043c238:
  auStack_10c8 = (undefined1  [8])0x0;
  psStack_10c0 = (segment_command *)&MACH_HEADER.cpusubtype;
  psStack_10b0 = (segment_command *)0x0;
  psStack_10b8 = (segment_command *)0x0;
  psStack_10a8 = (segment_command *)&MACH_HEADER.cpusubtype;
  psStack_10a0 = (segment_command *)0x0;
  func_0x0043d660(auStack_e70,psVar15,psVar40);
  if ((((segment_command *)auStack_e70._0_8_ == (segment_command *)0x0) ||
      (*(dword *)auStack_e70._0_8_ == 0xcffaedfe)) ||
     (func_0x0043d840(auStack_e70,auStack_e70._0_8_,auStack_e70._8_8_,psStack_e60),
     (segment_command *)auStack_e70._0_8_ == (segment_command *)0x8000000000000000)) {
code_r0x0043c314:
    func_0x003f7334(auStack_10c8);
LAB_0043b8c0:
    _munmap(psVar15,psVar40);
    return;
  }
  uStack_7a8 = uStack_e28;
  _sStack_7b0 = dStack_e30;
  dStack_7ac = dStack_e2c;
  uStack_798 = uStack_e18;
  uStack_7a0 = uStack_e20;
  uStack_788 = uStack_e08;
  uStack_790 = uStack_e10;
  uStack_778 = uStack_df8;
  uStack_780 = uStack_e00;
  psStack_7e8 = (segment_command *)auStack_e70._8_8_;
  psStack_7f0 = (segment_command *)auStack_e70._0_8_;
  uStack_7d8 = uStack_e58;
  psStack_7e0 = psStack_e60;
  psStack_7c8 = psStack_e48;
  psStack_7d0 = psStack_e50;
  psStack_7b8 = psStack_e38;
  psStack_7c0 = psStack_e40;
  psStack_1c40 = (segment_command *)0x8000000000000000;
  func_0x004385b0(&psStack_25a0,&psStack_7f0,&psStack_1c40,&psStack_1c40);
  auVar31 = (undefined1  [8])psStack_25a0;
  if (psStack_25a0 == (segment_command *)0x8000000000000000) goto code_r0x0043c314;
  _memcpy(&qStack_12d0,&psStack_2598,0x200);
  psStack_12f8 = psStack_10c0;
  psStack_1300 = (segment_command *)auStack_10c8;
  psStack_12e8 = psStack_10b0;
  psStack_12f0 = psStack_10b8;
  psStack_12d8 = psStack_10a0;
  psStack_12e0 = psStack_10a8;
  unaff_x21 = psVar40;
  unaff_x22 = psVar15;
code_r0x0043c358:
  psStack_7f0 = psVar32;
  psStack_7e8 = (segment_command *)auVar31;
  _memcpy(&psStack_7e0,&qStack_12d0,0x200);
  psStack_5c8 = psStack_12f8;
  psStack_5d0 = psStack_1300;
  psStack_5b8 = psStack_12e8;
  psStack_5c0 = psStack_12f0;
  psStack_5a8 = psStack_12d8;
  psStack_5b0 = psStack_12e0;
  psStack_5e0 = unaff_x22;
  psStack_5d8 = unaff_x21;
  if (psRam0000000000a2a5f8 == (segment_command *)&MACH_HEADER.cputype) {
    psRam0000000000a2a5f8 = (segment_command *)((long)&MACH_HEADER.magic + 3);
    func_0x003f70a4();
    _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
    func_0x003f7334(0xa2a5c8);
  }
  psVar29 = psRam0000000000a2a5f8;
  psVar10 = (segment_command *)((long)&psRam0000000000a2a5f8->cmd + 1);
  _memcpy(&psStack_1c40,&psStack_7f0,0x250);
  if ((segment_command *)0x4 < psVar10) {
    func_0x007a28b0(psVar10,4,&UNK_009dc360);
    psVar29 = extraout_x1_00;
code_r0x0043d1a0:
    func_0x007a2570(psVar32,psVar29,&UNK_009dc390);
    goto code_r0x0043d1b0;
  }
  if (psVar10 != (segment_command *)0x0) {
    lVar11 = (long)psVar29 * 0x250 + 0x250;
    lVar14 = 0xa29cb8;
    do {
      _memcpy(&psStack_25a0,lVar14,0x250);
      _memcpy(lVar14,&psStack_1c40,0x250);
      _memcpy(&psStack_1c40,&psStack_25a0,0x250);
      lVar11 = lVar11 + -0x250;
      lVar14 = lVar14 + 0x250;
    } while (lVar11 != 0);
  }
  psRam0000000000a2a5f8 = psVar10;
LAB_0043b71c:
  unaff_x21 = (segment_command *)((long)psVar23 - (long)plVar36);
  func_0x0043aa50(&psStack_1c40,0xa29cc0,unaff_x21);
  plVar36 = (long *)0xa29cc8;
  if ((int)psStack_1c40 != 5) {
    bVar8 = false;
    psStack_2578 = psStack_1c18;
    psStack_2580 = psStack_1c20;
    uStack_2568 = uStack_1c08;
    psStack_2570 = psStack_1c10;
    lStack_2558 = lStack_1bf8;
    uStack_2560 = uStack_1c00;
    uStack_2550 = uStack_1bf0;
    psStack_2598 = psStack_1c38;
    psStack_25a0 = psStack_1c40;
    psStack_2588 = psStack_1c28;
    psStack_2590 = psStack_1c30;
    pcVar7 = *(code **)(param_4 + 0x20);
    while (func_0x0040f900(&psStack_7f0,&psStack_25a0),
          psStack_7f0 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
      if (sStack_7b0 == 2) {
        psStack_e48 = (segment_command *)0x0;
        psStack_e40 = extraout_x9;
        if (uRam0000000000a29cd0 != 0) {
          uVar22 = 0;
          if (uRam0000000000a29cd0 != 1) {
            uVar22 = 0;
            uVar34 = uRam0000000000a29cd0;
            do {
              uVar44 = (uVar34 >> 1) + uVar22;
              if (*(segment_command **)((long)psRam0000000000a29cc8->segname + (uVar44 * 6 + 2) * 4)
                  <= unaff_x21) {
                uVar22 = uVar44;
              }
              uVar34 = uVar34 - (uVar34 >> 1);
            } while (1 < uVar34);
          }
          if (*(segment_command **)((long)psRam0000000000a29cc8->segname + (uVar22 * 6 + 2) * 4) ==
              unaff_x21) {
code_r0x0043b810:
            if (uVar22 < uRam0000000000a29cd0) {
              psStack_e48 = *(segment_command **)
                             ((long)psRam0000000000a29cc8->segname + (uVar22 * 6 + -2) * 4);
              psStack_e40 = *(segment_command **)
                             ((dword *)((long)psRam0000000000a29cc8->segname + (uVar22 * 6 + -2) * 4
                                       ) + 2);
              goto LAB_0043b834;
            }
          }
          else {
            if (*(segment_command **)((long)psRam0000000000a29cc8->segname + (uVar22 * 6 + 2) * 4) <
                unaff_x21) {
              uVar22 = uVar22 + 1;
            }
            if (uVar22 != 0) {
              uVar22 = uVar22 - 1;
              goto code_r0x0043b810;
            }
          }
          psStack_e48 = (segment_command *)0x0;
          psStack_e40 = psRam0000000000a29cc8;
        }
      }
      else {
        psStack_e48 = psStack_7c0;
        psStack_e40 = psStack_7b8;
      }
LAB_0043b834:
      auStack_e70._8_8_ = uStack_7d8;
      auStack_e70._0_8_ = psStack_7e0;
      uStack_e58 = psStack_7c8;
      psStack_e60 = psStack_7d0;
      psStack_e50 = unaff_x21;
      (*pcVar7)(param_3,auStack_e70);
      bVar8 = true;
    }
    if ((1 < (int)psStack_25a0 - 3U) && (lStack_2558 != 0)) {
      func_0x00187bd4(uStack_2568,lStack_2558 << 3,8);
    }
    if (bVar8) {
      return;
    }
  }
  psVar23 = (segment_command *)auStack_10c8;
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (psStack_25b0 = (segment_command *)func_0x004432ec(0xa29cd8,unaff_x21),
     psStack_25b0 == (segment_command *)0x0)) goto code_r0x0043cef0;
  uVar22 = psStack_25b0->vmsize;
  unaff_x22 = (segment_command *)(lRam0000000000a29d18 + uVar22 * 0x248);
  if (uRam0000000000a29d20 <= uVar22) goto code_r0x0043cef0;
  psVar10 = *(segment_command **)unaff_x22;
  if (psVar10 == (segment_command *)0x8000000000000001) {
    if (uRam0000000000a29d00 <= uVar22) goto code_r0x0043cef0;
    puVar19 = (undefined8 *)(lRam0000000000a29cf8 + uVar22 * 0x20);
    func_0x0043add8(&psStack_25a0,*puVar19,puVar19[1]);
    psVar29 = psStack_2590;
    psVar10 = psStack_2598;
    unaff_x28 = unaff_x22;
    if ((int)psStack_25a0 == 1) {
      psStack_25d8 = (segment_command *)puVar19[2];
      psStack_25c8 = (segment_command *)puVar19[3];
      psStack_25c0 = psStack_2590;
      uStack_a00 = 0;
      qStack_9f8 = 8;
      uStack_9e8 = 0;
      qStack_9f0 = 0;
      uStack_9e0 = 8;
      uStack_9d8 = 0;
      psStack_25b8 = psStack_2598;
      if (psStack_25d8 != (segment_command *)0x0) {
        if (psStack_2590 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
        psStack_398 = (segment_command *)&MACH_HEADER.cpusubtype;
        uVar22._0_4_ = psStack_2598->cmd;
        uVar22._4_4_ = psStack_2598->cmdsize;
        if (uVar22 == 0xa3e6e6968743c21) {
          uVar13 = 1;
code_r0x0043c54c:
          psStack_25e8._0_4_ = uVar13;
          if (psStack_25c0 == (segment_command *)&MACH_HEADER.cpusubtype) {
            psVar40 = (segment_command *)0x0;
            auStack_10c8 = (undefined1  [8])0x0;
            psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            psVar32 = (segment_command *)&MACH_HEADER.cpusubtype;
            psStack_10b8 = (segment_command *)&MACH_HEADER.cpusubtype;
          }
          else {
            psStack_25e8 = (segment_command *)(ulong)uVar13;
            func_0x0040b7cc(auStack_10c8,psVar10,psStack_25c0,&psStack_398,1,0);
            psVar29 = psStack_398;
            if (auStack_10c8 == (undefined1  [8])((long)&MACH_HEADER.magic + 2)) goto LAB_0043cc70;
            psVar40 = (segment_command *)0x0;
            psVar32 = (segment_command *)&MACH_HEADER.cpusubtype;
            psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            if ((long)psStack_10b0 < 9) {
              if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.magic + 1U)) {
                if ((char)psStack_10b8->cmd != '/') goto code_r0x0043c9cc;
                if (psStack_25c0 <= psStack_398) goto code_r0x0043c9d8;
                func_0x0040b7cc(auStack_10c8,psStack_25b8,psStack_25c0,&psStack_398,1,0,uVar13);
                psVar10 = psStack_398;
                if (auStack_10c8 == (undefined1  [8])((long)&MACH_HEADER.magic + 2))
                goto LAB_0043cc70;
                if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.magic + 2U)) {
code_r0x0043d138:
                  if ((short)psStack_10b8->cmd == 0x2f2f) goto code_r0x0043c99c;
                }
                else if ((psStack_10b0 == (segment_command *)((long)&MACH_HEADER.magic + 1U)) &&
                        ((char)psStack_10b8->cmd == '/')) {
                  if (psStack_398 < psStack_25c0) {
                    func_0x0040b7cc(auStack_10c8,psStack_25b8,psStack_25c0,&psStack_398,1,0,uVar13);
                    if (auStack_10c8 == (undefined1  [8])((long)&MACH_HEADER.magic + 2))
                    goto LAB_0043cc70;
                    if ((psStack_10b0 != (segment_command *)((long)&MACH_HEADER.magic + 2U)) ||
                       ((short)psStack_10b8->cmd != 0x2f2f)) goto code_r0x0043d1b0;
                    if (psStack_10a8 == (segment_command *)0x0) {
                      psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                      psVar40 = (segment_command *)0x0;
                    }
                    else {
                      if ((psStack_25c0 < psStack_10a8) ||
                         ((segment_command *)((long)psStack_25c0 - (long)psStack_10a8) <
                          psStack_10a0)) goto LAB_0043cc70;
                      psVar15 = (segment_command *)
                                ((long)psStack_10a8->segname +
                                (long)((long)psStack_25b8->segname + -0x10));
                      psVar40 = psStack_10a0;
                    }
                    psVar10 = psStack_398;
                    if (psStack_398 < psStack_25c0) goto code_r0x0043d1c8;
code_r0x0043d288:
                    psStack_25e8._0_4_ = uVar13;
                    psVar32 = psVar10;
                  }
                  else {
code_r0x0043d1b0:
                    psVar40 = (segment_command *)0x0;
                    psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                    uVar13 = (uint)psStack_25e8;
                    if (psStack_25c0 <= psStack_398) goto code_r0x0043d288;
code_r0x0043d1c8:
                    func_0x0040b7cc(auStack_10c8,psStack_25b8,psStack_25c0,&psStack_398,psVar15,
                                    psVar40,(ulong)psStack_25e8 & 0xffffffff);
                    if (auStack_10c8 == (undefined1  [8])((long)&MACH_HEADER.magic + 2))
                    goto LAB_0043cc70;
                    uVar13 = (uint)psStack_25e8;
                    if (psStack_10b0 != (segment_command *)((long)&MACH_HEADER.filetype + 1U))
                    goto code_r0x0043d288;
                    uVar16._0_4_ = psStack_10b8->cmd;
                    uVar16._4_4_ = psStack_10b8->cmdsize;
                    psVar32 = psStack_398;
                    if (uVar16 != 0x424d595343453c2f ||
                        *(int5 *)psStack_10b8->segname != 0x2f3e534c4f) {
                      psVar32 = psVar10;
                    }
                  }
                  auStack_10c8 = (undefined1  [8])0x0;
                  psStack_10b8 = psStack_25c0;
                  goto code_r0x0043c9e4;
                }
code_r0x0043c9d8:
                psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                psVar40 = (segment_command *)0x0;
                psVar32 = psVar29;
              }
              else if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.magic + 2U)) {
                if ((short)psStack_10b8->cmd != 0x2f2f) goto code_r0x0043c9cc;
code_r0x0043c99c:
                psVar32 = psStack_398;
                if (psStack_10a8 == (segment_command *)0x0) {
                  psVar40 = (segment_command *)0x0;
                  psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                }
                else {
                  if ((psStack_25c0 < psStack_10a8) ||
                     ((segment_command *)((long)psStack_25c0 - (long)psStack_10a8) < psStack_10a0))
                  goto LAB_0043cc70;
                  psVar15 = (segment_command *)
                            ((long)psStack_10a8->segname +
                            (long)((long)psStack_25b8->segname + -0x10));
                  psVar40 = psStack_10a0;
                }
              }
              else if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.cputype + 3U)) {
                if (*(int7 *)psStack_10b8 == 0x2f34364d59532f) {
                  if (psStack_398 < psStack_25c0) {
                    func_0x0040b7cc(auStack_10c8,psStack_25b8,psStack_25c0,&psStack_398,1,0,uVar13);
                    if (auStack_10c8 == (undefined1  [8])((long)&MACH_HEADER.magic + 2))
                    goto LAB_0043cc70;
                    if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.magic + 2U))
                    goto code_r0x0043d138;
                  }
                  goto code_r0x0043c9d8;
                }
                goto code_r0x0043c9cc;
              }
            }
            else if ((long)psStack_10b0 < 0x10) {
              if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.cpusubtype + 1U)) {
                uVar34._0_4_ = psStack_10b8->cmd;
                uVar34._4_4_ = psStack_10b8->cmdsize;
                bVar8 = (char)*(dword *)psStack_10b8->segname == 'F';
                goto code_r0x0043c964;
              }
              if (psStack_10b0 == (segment_command *)&MACH_HEADER.filetype) {
                uVar34._0_4_ = psStack_10b8->cmd;
                uVar34._4_4_ = psStack_10b8->cmdsize;
                uVar22 = (ulong)*(uint *)psStack_10b8->segname;
                uVar44 = 0x34365f46;
                goto code_r0x0043c960;
              }
            }
            else {
              if (psStack_10b0 == (segment_command *)&MACH_HEADER.ncmds) {
                uVar34._0_4_ = psStack_10b8->cmd;
                uVar34._4_4_ = psStack_10b8->cmdsize;
                uVar22 = *(ulong *)psStack_10b8->segname;
                uVar44 = 0x444554524f532046;
code_r0x0043c960:
                bVar8 = uVar22 == uVar44;
code_r0x0043c964:
                if (!(!bVar8 || uVar34 != 0x45444d59532e5f5f)) goto code_r0x0043c9d8;
code_r0x0043c9cc:
                psVar29 = (segment_command *)&MACH_HEADER.cpusubtype;
                goto code_r0x0043c9d8;
              }
              if (psStack_10b0 == (segment_command *)((long)&MACH_HEADER.ncmds + 3U)) {
                uVar44._0_4_ = psStack_10b8->cmd;
                uVar44._4_4_ = psStack_10b8->cmdsize;
                if (!((uVar44 != 0x45444d59532e5f5f ||
                      *(long *)psStack_10b8->segname != 0x524f532034365f46) ||
                     *(long *)((long)psStack_10b8->segname + 3) != 0x444554524f532034))
                goto code_r0x0043c9d8;
                goto code_r0x0043c9cc;
              }
            }
            auStack_10c8 = (undefined1  [8])0x0;
            psStack_10b8 = psStack_25c0;
          }
        }
        else {
          if (uVar22 == 0xa3e686372613c21) {
code_r0x0043c540:
            uVar13 = 0;
            goto code_r0x0043c54c;
          }
          if ((uVar22 != 0xa3e66616769623c) ||
             (psStack_2590 < (segment_command *)(section_00000068.segname + 8))) goto LAB_0043cc70;
          auVar45 = func_0x0043fb2c(&psStack_2598->filesize,0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar29) && (0x6f < (ulong)((long)psVar29 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar10->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar27 = &psVar32[1].fileoff;
                if ((pqVar27 <= psVar29) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar29 - (long)pqVar27))) {
                  psVar40 = (segment_command *)((long)pqVar27 + auVar45._8_8_);
                  psVar15 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar15 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar15;
                  }
                  if (((psVar40 <= psVar29) && (1 < (ulong)((long)psVar29 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar10->segname + -0x10)) == 0xa60
                     )) {
                    uVar22 = func_0x0043fb2c(psVar32->segname +
                                             (long)((long)psVar10->segname + -0x10),0x14,10);
code_r0x0043bb10:
                    if ((uVar22 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          auVar45 = func_0x0043fb2c((undefined1 *)((long)&psVar10->vmaddr + 4),0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar29) && (0x6f < (ulong)((long)psVar29 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar10->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar27 = &psVar32[1].fileoff;
                if ((pqVar27 <= psVar29) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar29 - (long)pqVar27))) {
                  psVar40 = (segment_command *)((long)pqVar27 + auVar45._8_8_);
                  psVar15 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar15 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar15;
                  }
                  if (((psVar40 <= psVar29) && (1 < (ulong)((long)psVar29 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar10->segname + -0x10)) == 0xa60
                     )) {
                    uVar22 = func_0x0043fb2c(psVar32->segname +
                                             (long)((long)psVar10->segname + -0x10),0x14,10);
                    goto code_r0x0043bb10;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
code_r0x0043cfd4:
          auVar45 = func_0x0043fb2c(psVar10->segname,0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar29) && (0x6f < (ulong)((long)psVar29 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar10->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar27 = &psVar32[1].fileoff;
                if ((pqVar27 <= psVar29) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar29 - (long)pqVar27))) {
                  psVar40 = (segment_command *)((long)pqVar27 + auVar45._8_8_);
                  psVar15 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar15 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar15;
                  }
                  if (((psVar40 <= psVar29) && (1 < (ulong)((long)psVar29 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar10->segname + -0x10)) == 0xa60
                     )) {
                    auVar45 = func_0x0043fb2c(psVar32->segname +
                                              (long)((long)psVar10->segname + -0x10),0x14,10);
                    uVar22 = auVar45._8_8_;
                    if ((((auVar45._0_8_ & 1) != 0) &&
                        (psVar32 = (segment_command *)((long)&psVar40->cmd + 2),
                        psVar32 != (segment_command *)0x0)) &&
                       ((psVar32 <= psVar29 &&
                        ((uVar22 <= (ulong)((long)psVar29 - (long)psVar32) && (0x13 < uVar22)))))) {
                      auVar45 = func_0x0043fb2c(psVar32->segname +
                                                (long)((long)psVar10->segname + -0x10),0x14,10);
                      psVar29 = auVar45._8_8_;
                      if (((auVar45._0_8_ & 1) != 0) &&
                         ((auVar45._8_8_ = 0, auVar45._0_8_ = psVar29,
                          SUB168(auVar45 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)psVar29 * 0x14) <= uVar22 - 0x14)))) {
                        psVar32 = (segment_command *)
                                  (psVar32->segname + (long)((long)psVar10->segname + -0x10) + 0x14)
                        ;
                        goto LAB_0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          psVar29 = (segment_command *)0x0;
          psVar32 = (segment_command *)((long)&MACH_HEADER.magic + 1);
LAB_0043d168:
          psVar15 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          psVar40 = (segment_command *)0x0;
          auStack_10c8 = (undefined1  [8])((long)&MACH_HEADER.magic + 1);
          psStack_10b8 = psVar29;
          psStack_25e8._0_4_ = 0;
        }
code_r0x0043c9e4:
        psStack_10b0 = psStack_25b8;
        psStack_10a8 = psStack_25c0;
        *(char *)&psVar23->maxprot = (char)(uint)psStack_25e8;
        psStack_10c0 = psVar32;
        psStack_10a0 = psVar15;
        psStack_1098 = psVar40;
        if (SUB84(auStack_10c8,0) != 0) goto code_r0x0043ca98;
        while (psStack_10c0 < psStack_10b8) {
          func_0x0040b7cc(&psStack_398,psStack_10b0,psStack_10a8,&psStack_10c0,psStack_10a0,
                          psStack_1098,(char)psVar23->maxprot);
          lVar11 = lStack_388;
          psVar10 = psStack_378;
          psVar29 = psStack_370;
          psVar32 = psStack_380;
          if (psStack_398 != (segment_command *)((long)&MACH_HEADER.magic + 2))
          goto joined_r0x0043ca80;
          psStack_10c0 = psStack_10b8;
joined_r0x0043ca60:
          if (((ulong)auStack_10c8 & 1) != 0) {
code_r0x0043ca98:
            psVar15 = psStack_10a8;
            psVar29 = psStack_10b0;
            psVar10 = psStack_10c0;
            if (psStack_10b8 == (segment_command *)0x0) break;
            psStack_10c0 = (segment_command *)((long)psStack_10c0->segname + 0xc);
            psStack_10b8 = (segment_command *)((long)&psStack_10b8[-1].flags + 3);
            auVar45 = func_0x0043fb2c(psVar10,0x14,10);
            psVar10 = auVar45._8_8_;
            if ((((auVar45._0_8_ & 1) != 0) && (psVar10 <= psVar15)) &&
               (0x6f < (ulong)((long)psVar15 - (long)psVar10))) {
              auVar45 = func_0x0043fb2c((long)(psVar10->segname +
                                              (long)((long)psVar29->segname + -0x10)) + 0x6c,4,10);
              psVar32 = auVar45._8_8_;
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar27 = &psVar10[1].fileoff;
                if ((pqVar27 <= psVar15) &&
                   (psVar32 <= (segment_command *)((long)psVar15 - (long)pqVar27))) {
                  psVar3 = (segment_command *)(psVar32->segname + (long)(pqVar27 + -1));
                  psVar40 = (segment_command *)((long)&psVar3->cmd + 1);
                  if (psVar3 == (segment_command *)0xffffffffffffffff) {
                    psVar40 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar3 & 1) != 0) {
                    psVar3 = psVar40;
                  }
                  if ((!(psVar15 < psVar3 || (ulong)((long)psVar15 - (long)psVar3) < 2)) &&
                     (*(short *)(psVar3->segname + (long)((long)psVar29->segname + -0x10)) == 0xa60)
                     ) {
                    auVar45 = func_0x0043fb2c(psVar10->segname +
                                              (long)((long)psVar29->segname + -0x10),0x14,10);
                    if ((auVar45._0_8_ & 1) != 0) {
                      lVar11 = (long)(pqVar27 + -1) + (long)psVar29->segname;
                      psVar10 = (segment_command *)((long)&psVar3->cmd + 2);
                      psVar29 = auVar45._8_8_;
joined_r0x0043ca80:
                      if ((psVar32 == psStack_25c8) &&
                         (iVar9 = _memcmp(lVar11,psStack_25d8,psStack_25c8), iVar9 == 0)) {
                        if (psVar10 == (segment_command *)0x0) {
                          psVar29 = (segment_command *)0x0;
                          psVar10 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                        }
                        else {
                          if ((psStack_25c0 < psVar10) ||
                             ((segment_command *)((long)psStack_25c0 - (long)psVar10) < psVar29))
                          break;
                          psVar10 = (segment_command *)
                                    (psVar10->segname + (long)((long)psStack_25b8->segname + -0x10))
                          ;
                        }
                        goto code_r0x0043cbb4;
                      }
                      goto joined_r0x0043ca60;
                    }
                  }
                }
              }
            }
            psStack_10c0 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            psStack_10b8 = (segment_command *)0x0;
            goto joined_r0x0043ca60;
          }
        }
LAB_0043cc70:
        func_0x003f7334(&uStack_a00);
        _munmap(psStack_25b8,psStack_25c0);
        goto code_r0x0043cc84;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_10c8,psVar10,psVar29);
      if ((auStack_10c8 == (undefined1  [8])0x0) || (*(dword *)auStack_10c8 == 0xcffaedfe))
      goto LAB_0043cc70;
      func_0x0043d840(auStack_10c8,auStack_10c8,psStack_10c0,psStack_10b8);
      if (auStack_10c8 == (undefined1  [8])0x8000000000000000) goto LAB_0043cc70;
      uStack_e28 = uStack_1080;
      dStack_e30 = dStack_1088;
      dStack_e2c = dStack_1084;
      uStack_e18 = uStack_1070;
      uStack_e20 = uStack_1078;
      uStack_e08 = uStack_1060;
      uStack_e10 = uStack_1068;
      uStack_df8 = uStack_1050;
      uStack_e00 = uStack_1058;
      auStack_e70._8_8_ = psStack_10c0;
      auStack_e70._0_8_ = auStack_10c8;
      uStack_e58 = psStack_10b0;
      psStack_e60 = psStack_10b8;
      psStack_e48 = psStack_10a0;
      psStack_e50 = psStack_10a8;
      psStack_e38 = psStack_1090;
      psStack_e40 = psStack_1098;
      psStack_7f0 = (segment_command *)0x8000000000000000;
      func_0x004385b0(&psStack_25a0,auStack_e70,&psStack_7f0,&psStack_7f0);
      psVar10 = psStack_25a0;
      if (psStack_25a0 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
      _memcpy(&psStack_1c40,&psStack_2598,0x200);
      uVar18._0_4_ = unaff_x22->cmd;
      uVar18._4_4_ = unaff_x22->cmdsize;
      psVar23 = unaff_x22;
      unaff_x22 = unaff_x28;
      qStack_12d0 = uStack_a00;
      qStack_12c8 = qStack_9f8;
      qStack_12c0 = qStack_9f0;
      uStack_12b8 = uStack_9e8;
      uStack_12b0 = uStack_9e0;
      uStack_12a8 = uStack_9d8;
    }
    else {
code_r0x0043cc84:
      psVar10 = (segment_command *)0x8000000000000000;
      uVar18._0_4_ = unaff_x22->cmd;
      uVar18._4_4_ = unaff_x22->cmdsize;
      psVar23 = unaff_x22;
      unaff_x22 = unaff_x28;
    }
    if ((uVar18 != 0x8000000000000001) && (uVar18 != 0x8000000000000000)) {
      func_0x003f70a4(psVar23);
      _munmap(*(undefined8 *)(psVar23[7].segname + 8),psVar23[7].vmaddr);
      func_0x003f7334(&psVar23[7].vmsize);
    }
    *(segment_command **)psVar23 = psVar10;
    _memcpy(psVar23->segname,&psStack_1c40,0x200);
    *(segment_command **)(psVar23[7].segname + 8) = psStack_25b8;
    psVar23[7].vmaddr = (qword)psStack_25c0;
    psVar23[7].fileoff = qStack_12c8;
    psVar23[7].vmsize = qStack_12d0;
    psVar23[7].maxprot = (undefined4)uStack_12b8;
    psVar23[7].initprot = uStack_12b8._4_4_;
    psVar23[7].filesize = qStack_12c0;
    psVar23[8].cmd = (undefined4)uStack_12a8;
    psVar23[8].cmdsize = uStack_12a8._4_4_;
    psVar23[7].nsects = (undefined4)uStack_12b0;
    psVar23[7].flags = uStack_12b0._4_4_;
    if (psVar10 == (segment_command *)0x8000000000000001) goto code_r0x0043cef0;
  }
  if ((psVar10 != (segment_command *)0x8000000000000000) &&
     (uVar22 = *(ulong *)((long)unaff_x22->segname + 8), uVar22 != 0)) {
    lVar14 = *(long *)unaff_x22->segname;
    uVar4._0_4_ = psStack_25b0->cmd;
    uVar4._4_4_ = psStack_25b0->cmdsize;
    uVar34 = *(ulong *)psStack_25b0->segname;
    lVar11 = 0;
    if (uVar22 != 1) {
      do {
        lVar2 = (uVar22 >> 1) + lVar11;
        puVar19 = (undefined8 *)(lVar14 + lVar2 * 0x18);
        uVar16 = puVar19[1];
        uVar44 = uVar16;
        if (uVar34 <= uVar16) {
          uVar44 = uVar34;
        }
        iVar9 = _memcmp(*puVar19,uVar4,uVar44);
        lVar1 = uVar16 - uVar34;
        if (iVar9 != 0) {
          lVar1 = (long)iVar9;
        }
        if (lVar1 < 1) {
          lVar11 = lVar2;
        }
        uVar22 = uVar22 - (uVar22 >> 1);
      } while (1 < uVar22);
    }
    puVar19 = (undefined8 *)(lVar14 + lVar11 * 0x18);
    uVar44 = puVar19[1];
    uVar22 = uVar44;
    if (uVar34 <= uVar44) {
      uVar22 = uVar34;
    }
    iVar9 = _memcmp(*puVar19,uVar4,uVar22);
    lVar2 = uVar44 - uVar34;
    if (iVar9 != 0) {
      lVar2 = (long)iVar9;
    }
    if (lVar2 == 0) {
      func_0x0043aa50(&psStack_1c40,unaff_x22,
                      (long)unaff_x21 +
                      (*(long *)(lVar14 + lVar11 * 0x18 + 0x10) -
                      *(long *)((long)psStack_25b0->segname + 8)));
      if ((int)psStack_1c40 != 5) {
        psStack_2578 = psStack_1c18;
        psStack_2580 = psStack_1c20;
        uStack_2568 = uStack_1c08;
        psStack_2570 = psStack_1c10;
        lStack_2558 = lStack_1bf8;
        uStack_2560 = uStack_1c00;
        uStack_2550 = uStack_1bf0;
        psStack_2598 = psStack_1c38;
        psStack_25a0 = psStack_1c40;
        psStack_2588 = psStack_1c28;
        psStack_2590 = psStack_1c30;
        func_0x0040f900(&psStack_7f0,&psStack_25a0);
        psVar23 = psStack_7f0;
        if (psStack_7f0 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          psStack_e48 = (segment_command *)0x0;
          if (sStack_7b0 != 2) {
            psStack_e48 = psStack_7c0;
          }
          auStack_e70._8_8_ = uStack_7d8;
          auStack_e70._0_8_ = psStack_7e0;
          uStack_e58 = psStack_7c8;
          psStack_e60 = psStack_7d0;
          psStack_e40 = psStack_7b8;
          pcVar7 = *(code **)(param_4 + 0x20);
          psStack_e50 = unaff_x21;
          (*pcVar7)(param_3,auStack_e70);
          while (func_0x0040f900(&psStack_7f0,&psStack_25a0),
                psStack_7f0 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
            psStack_e48 = (segment_command *)0x0;
            if (sStack_7b0 != 2) {
              psStack_e48 = psStack_7c0;
            }
            auStack_e70._8_8_ = uStack_7d8;
            auStack_e70._0_8_ = psStack_7e0;
            uStack_e58 = psStack_7c8;
            psStack_e60 = psStack_7d0;
            psStack_e40 = psStack_7b8;
            psStack_e50 = unaff_x21;
            (*pcVar7)(param_3,auStack_e70);
          }
        }
        if ((1 < (int)psStack_25a0 - 3U) && (lStack_2558 != 0)) {
          func_0x00187bd4(uStack_2568,lStack_2558 << 3,8);
        }
        if (psVar23 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          return;
        }
      }
    }
  }
code_r0x0043cef0:
  uVar22 = plVar36[1];
  if (uVar22 == 0) {
    return;
  }
  lVar11 = *plVar36;
  if (uVar22 == 1) {
    uVar34 = 0;
  }
  else {
    uVar34 = 0;
    uVar44 = uVar22;
    do {
      uVar16 = (uVar44 >> 1) + uVar34;
      if (*(segment_command **)(lVar11 + uVar16 * 0x18 + 0x10) <= unaff_x21) {
        uVar34 = uVar16;
      }
      uVar44 = uVar44 - (uVar44 >> 1);
    } while (1 < uVar44);
  }
  psVar23 = *(segment_command **)(lVar11 + uVar34 * 0x18 + 0x10);
  if (psVar23 != unaff_x21) {
    if (psVar23 < unaff_x21) {
      uVar34 = uVar34 + 1;
    }
    if (uVar34 == 0) {
      return;
    }
    uVar34 = uVar34 - 1;
  }
  if (uVar34 < uVar22) {
    puVar19 = (undefined8 *)(lVar11 + uVar34 * 0x18);
    psStack_2598 = (segment_command *)*puVar19;
    psStack_2590 = (segment_command *)puVar19[1];
    psStack_25a0 = (segment_command *)CONCAT44(psStack_25a0._4_4_,3);
    (**(code **)(param_4 + 0x20))(param_3,&psStack_25a0);
    return;
  }
  return;
}

