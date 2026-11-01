
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0043afac(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  segment_command *psVar3;
  ulong uVar4;
  long *plVar5;
  dword *pdVar6;
  qword qVar7;
  segment_command *psVar8;
  code *pcVar9;
  bool bVar10;
  int iVar11;
  segment_command *psVar12;
  long lVar13;
  int *piVar14;
  segment_command *extraout_x1;
  segment_command *extraout_x1_00;
  uint uVar15;
  long lVar16;
  segment_command *psVar17;
  ulong uVar18;
  undefined1 *puVar19;
  ulong uVar20;
  undefined8 *puVar21;
  dword dVar22;
  ulong uVar23;
  segment_command *psVar24;
  long *plVar25;
  qword *pqVar26;
  int *piVar27;
  qword *pqVar28;
  undefined1 *puVar29;
  segment_command *psVar30;
  undefined8 uVar31;
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
  undefined8 uStack0000000000000000;
  uint uStack0000000000000008;
  long in_stack_00000010;
  segment_command *in_stack_00000018;
  undefined8 in_stack_00000020;
  segment_command *in_stack_00000028;
  uint uStack0000000000000030;
  undefined4 uStack0000000000000034;
  segment_command *in_stack_00000038;
  segment_command *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  segment_command *in_stack_00000060;
  undefined8 uStack0000000000000068;
  segment_command *in_stack_00000070;
  segment_command *in_stack_00000078;
  segment_command *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  segment_command *in_stack_000009b0;
  segment_command *in_stack_000009b8;
  segment_command *in_stack_000009c0;
  segment_command *in_stack_000009c8;
  segment_command *in_stack_000009d0;
  segment_command *in_stack_000009d8;
  segment_command *in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  qword in_stack_00001320;
  qword in_stack_00001328;
  qword in_stack_00001330;
  undefined8 in_stack_00001338;
  undefined8 in_stack_00001340;
  ulong in_stack_00001348;
  segment_command *in_stack_00001528;
  segment_command *in_stack_00001530;
  segment_command *in_stack_00001538;
  long in_stack_00001540;
  segment_command *in_stack_00001548;
  ulong in_stack_00001550;
  segment_command *in_stack_00001730;
  segment_command *in_stack_00001738;
  segment_command *in_stack_00001780;
  segment_command *in_stack_00001788;
  undefined8 in_stack_00001790;
  undefined8 in_stack_00001798;
  short in_stack_000017c0;
  long in_stack_00001ba8;
  undefined8 in_stack_00001bb0;
  undefined8 in_stack_00001bb8;
  qword in_stack_00001bf0;
  qword in_stack_00001bf8;
  qword in_stack_00001c00;
  undefined8 in_stack_00001c08;
  undefined8 in_stack_00001c10;
  ulong in_stack_00001c18;
  segment_command *in_stack_00001e00;
  segment_command *psVar46;
  undefined8 in_stack_00001e18;
  short in_stack_00001e40;
  segment_command *in_stack_00002258;
  undefined8 in_stack_00002260;
  long in_stack_00002268;
  segment_command *in_stack_00002270;
  segment_command *in_stack_00002278;
  segment_command *in_stack_00002280;
  int *in_stack_00002460;
  long in_stack_00002468;
  ulong in_stack_00002470;
  undefined1 auStack_7ffffffe [6];
  undefined1 auStack_7ffffff8 [2147483640];
  
  psVar24 = (segment_command *)0x0;
  if (param_2 != 0) {
    psVar24 = (segment_command *)(param_2 + -1);
  }
  if (lRam0000000000a29ca0 == -0x8000000000000000) {
    in_stack_00001e00 = (segment_command *)0x0;
    psVar46 = (segment_command *)0x0;
    psVar12 = (segment_command *)__dyld_image_count();
    if ((int)psVar12 != 0) {
      iVar11 = 0;
      uStack0000000000000000 = 1;
      in_stack_00000018 = (segment_command *)CONCAT44(in_stack_00000018._4_4_,(int)psVar12);
      unaff_x22 = psVar12;
      do {
        lVar13 = __dyld_get_image_name(iVar11);
        if (lVar13 == 0) {
LAB_0043b080:
          unaff_x21 = (segment_command *)0x8000000000000000;
        }
        else {
          in_stack_00000028 = (segment_command *)_strlen();
          piVar14 = (int *)__dyld_get_image_header(iVar11);
          if (piVar14 == (int *)0x0) goto LAB_0043b080;
          if (*piVar14 == -0x1120531) {
            lVar16 = 0x20;
          }
          else {
            if (*piVar14 != -0x1120532) goto LAB_0043b080;
            lVar16 = 0x1c;
          }
          iVar33 = piVar14[4];
          uVar23 = (ulong)(uint)piVar14[5];
          uStack0000000000000050 = (segment_command *)0x0;
          uStack0000000000000058 = (segment_command *)&MACH_HEADER.cpusubtype;
          in_stack_00000060 = (segment_command *)0x0;
          if (iVar33 == 0) {
            __dyld_get_image_vmaddr_slide(iVar11);
            psVar30 = (segment_command *)0x0;
            psVar32 = (segment_command *)0x0;
code_r0x0043d10c:
            func_0x007a2570(psVar32,psVar30,&UNK_009dc3f0);
            goto code_r0x0043d268;
          }
          psVar30 = (segment_command *)0x0;
          psVar32 = (segment_command *)0x0;
          _uStack0000000000000030 =
               (segment_command *)((ulong)_uStack0000000000000030 & 0xffffffff00000000);
          piVar14 = (int *)((long)piVar14 + lVar16);
          psVar17 = (segment_command *)&MACH_HEADER.cpusubtype;
          do {
            if (uVar23 < 8) {
code_r0x0043b248:
              if (uStack0000000000000050 != (segment_command *)0x0) {
                func_0x00187bd4(uStack0000000000000058,(long)uStack0000000000000050 << 4,8);
              }
              unaff_x21 = (segment_command *)0x8000000000000000;
              goto code_r0x0043b398;
            }
            uVar15 = piVar14[1];
            uVar34 = (ulong)uVar15;
            if ((uVar15 < 8) || (bVar10 = uVar23 < uVar34, uVar23 = uVar23 - uVar34, bVar10))
            goto code_r0x0043b248;
            if (*piVar14 == 0x19) {
              if (uVar15 < 0x48) goto code_r0x0043b248;
              uVar31 = *(undefined8 *)(piVar14 + 4);
              uVar44 = *(ulong *)(piVar14 + 2);
              if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
                 (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                                    CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                             CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                      -((char)uVar44 == '\0')))),
                 uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                                   CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
                 uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
                 uVar41 = CONCAT11(-((char)((ulong)uVar31 >> 8) == '\0'),-((char)uVar31 == '\0')),
                 uVar42 = CONCAT13(-((char)((ulong)uVar31 >> 0x18) == '\0'),
                                   CONCAT12(-((char)((ulong)uVar31 >> 0x10) == '\0'),uVar41)),
                 uVar43 = CONCAT15(-((char)((ulong)uVar31 >> 0x28) == '\0'),
                                   CONCAT14(-((char)((ulong)uVar31 >> 0x20) == '\0'),uVar42)),
                 uVar18 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar31 >> 0x38) == '\0'),
                                                   CONCAT16(-((char)((ulong)uVar31 >> 0x30) == '\0')
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
                          0x8888888888888888, uVar44 = uVar18 >> 3,
                 uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
                 uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
                 uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10,
                 uVar18 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
                if (*(long *)(piVar14 + 10) == 0) {
                  _uStack0000000000000030 =
                       (segment_command *)
                       CONCAT44(uStack0000000000000034,
                                *(long *)(piVar14 + 0xc) != 0 | uStack0000000000000030);
                }
                psVar32 = psVar30;
              }
              uVar44 = *(ulong *)(piVar14 + 8);
              psVar40 = *(segment_command **)(piVar14 + 6);
              if (psVar30 == uStack0000000000000050) {
                func_0x00403e60(&uStack0000000000000050,&UNK_009dc3d8);
                psVar17 = uStack0000000000000058;
              }
              in_stack_00000040 = psVar40;
code_r0x0043b0c0:
              *(ulong *)((dword *)((long)psVar17->segname + ((long)psVar30 * 4 + -2) * 4) + 2) =
                   uVar44;
              *(segment_command **)((long)psVar17->segname + ((long)psVar30 * 4 + -2) * 4) = psVar40
              ;
              psVar30 = (segment_command *)((long)&psVar30->cmd + 1);
              in_stack_00000060 = psVar30;
            }
            else if (*piVar14 == 1) {
              if (0x37 < uVar15) {
                uVar31 = *(undefined8 *)(piVar14 + 4);
                uVar44 = *(ulong *)(piVar14 + 2);
                if (((uVar44 & 0xffffffffffff) == 0x545845545f5f) &&
                   (uVar37 = CONCAT13(-((char)(uVar44 >> 0x18) == '\0'),
                                      CONCAT12(-((char)(uVar44 >> 0x10) == '\0'),
                                               CONCAT11(-((char)(uVar44 >> 8) == '\0'),
                                                        -((char)uVar44 == '\0')))),
                   uVar38 = CONCAT15(-((char)(uVar44 >> 0x28) == '\0'),
                                     CONCAT14(-((char)(uVar44 >> 0x20) == '\0'),uVar37)),
                   uVar39 = CONCAT16(-((char)(uVar44 >> 0x30) == '\0'),uVar38),
                   uVar41 = CONCAT11(-((char)((ulong)uVar31 >> 8) == '\0'),-((char)uVar31 == '\0')),
                   uVar42 = CONCAT13(-((char)((ulong)uVar31 >> 0x18) == '\0'),
                                     CONCAT12(-((char)((ulong)uVar31 >> 0x10) == '\0'),uVar41)),
                   uVar43 = CONCAT15(-((char)((ulong)uVar31 >> 0x28) == '\0'),
                                     CONCAT14(-((char)((ulong)uVar31 >> 0x20) == '\0'),uVar42)),
                   uVar18 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar31 >> 0x38) == '\0'),
                                                     CONCAT16(-((char)((ulong)uVar31 >> 0x30) ==
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
                            0x8888888888888888, uVar44 = uVar18 >> 3,
                   uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4,
                   uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8,
                   uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                            (uVar44 & 0xffff0000ffff) << 0x10,
                   uVar18 != 0 && (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x3cU) == 0x18)) {
                  if (piVar14[8] == 0) {
                    _uStack0000000000000030 =
                         (segment_command *)
                         CONCAT44(uStack0000000000000034,piVar14[9] != 0 | uStack0000000000000030);
                  }
                  psVar32 = psVar30;
                }
                uVar44 = *(ulong *)(piVar14 + 6);
                if (psVar30 == uStack0000000000000050) {
                  func_0x00403e60(&uStack0000000000000050,&UNK_009dc3c0);
                }
                psVar40 = (segment_command *)(uVar44 & 0xffffffff);
                uVar44 = uVar44 >> 0x20;
                psVar17 = uStack0000000000000058;
                goto code_r0x0043b0c0;
              }
              goto code_r0x0043b248;
            }
            piVar14 = (int *)((long)piVar14 + uVar34);
            iVar33 = iVar33 + -1;
          } while (iVar33 != 0);
          in_stack_00000038 = (segment_command *)__dyld_get_image_vmaddr_slide(iVar11);
          if (((ulong)_uStack0000000000000030 & 1) == 0) {
            if (psVar30 <= psVar32) goto code_r0x0043d10c;
            lVar16 = *(long *)((long)uStack0000000000000058->segname + ((long)psVar32 * 4 + -2) * 4)
            ;
            uVar23 = (ulong)((long)&psVar30[-1].flags + 3) & 0xfffffffffffffff;
            psVar32 = uStack0000000000000058;
            if (uVar23 < 3) {
code_r0x0043b318:
              do {
                pdVar6 = (dword *)psVar32->segname;
                *(ulong *)psVar32 = *(ulong *)psVar32 - lVar16;
                psVar32 = (segment_command *)(pdVar6 + 2);
              } while ((segment_command *)(pdVar6 + 2) !=
                       (segment_command *)
                       ((long)uStack0000000000000058->segname + ((long)psVar30 * 4 + -2) * 4));
            }
            else {
              uVar23 = uVar23 + 1;
              uVar44 = uVar23 & 0x1ffffffffffffffc;
              psVar32 = (segment_command *)
                        ((long)uStack0000000000000058->segname + (uVar44 * 4 + -2) * 4);
              pqVar28 = &uStack0000000000000058->vmsize;
              uVar34 = uVar44;
              do {
                *(long *)(pqVar28 + -4) = *(long *)(pqVar28 + -4) - lVar16;
                pqVar28[-2] = pqVar28[-2] - lVar16;
                *pqVar28 = *pqVar28 - lVar16;
                pqVar28[2] = pqVar28[2] - lVar16;
                pqVar28 = pqVar28 + 8;
                uVar34 = uVar34 - 4;
              } while (uVar34 != 0);
              if (uVar23 != uVar44) goto code_r0x0043b318;
            }
            in_stack_00000038 = (segment_command *)((long)in_stack_00000038->segname + lVar16 + -8);
          }
          if ((long)in_stack_00000028 < 0) {
            uStack0000000000000000 = 0;
LAB_0043d174:
            func_0x007a1f00(uStack0000000000000000,in_stack_00000028,&UNK_009d9be8);
            goto code_r0x0043d268;
          }
          if (in_stack_00000028 == (segment_command *)0x0) {
            unaff_x28 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            unaff_x28 = (segment_command *)func_0x00187bd0(in_stack_00000028,1);
            if (unaff_x28 == (segment_command *)0x0) goto LAB_0043d174;
          }
          _memcpy(unaff_x28,lVar13,in_stack_00000028);
          unaff_x20 = in_stack_00000028;
          unaff_x21 = in_stack_00000028;
          in_stack_000009b0 = uStack0000000000000050;
          in_stack_000009b8 = uStack0000000000000058;
          in_stack_000009c0 = in_stack_00000060;
code_r0x0043b398:
          unaff_x22 = (segment_command *)((ulong)psVar12 & 0xffffffff);
        }
        in_stack_00000080 = in_stack_00000038;
        uStack0000000000000050 = unaff_x21;
        uStack0000000000000058 = unaff_x28;
        in_stack_00000060 = unaff_x20;
        uStack0000000000000068 = in_stack_000009b0;
        in_stack_00000070 = in_stack_000009b8;
        in_stack_00000078 = in_stack_000009c0;
        if ((ulong)-(long)psVar46 < (ulong)(unaff_x21 != (segment_command *)0x8000000000000000)) {
          func_0x007a0000(auStack_7ffffffe + 0x80001dfe,psVar46,
                          (ulong)(unaff_x21 != (segment_command *)0x8000000000000000),8,0x38);
        }
        if (unaff_x21 != (segment_command *)0x8000000000000000) {
          lVar13 = (long)psVar46 * 0x38;
          *(segment_command **)(lVar13 + 8) = unaff_x21;
          *(segment_command **)(lVar13 + 0x10) = unaff_x28;
          *(segment_command **)(lVar13 + 0x18) = unaff_x20;
          *(segment_command **)(lVar13 + 0x20) = uStack0000000000000068;
          *(segment_command **)(lVar13 + 0x28) = in_stack_00000070;
          *(segment_command **)(lVar13 + 0x38) = in_stack_00000080;
          *(segment_command **)(lVar13 + 0x30) = in_stack_00000078;
          psVar46 = (segment_command *)((long)&psVar46->cmd + 1);
        }
        iVar11 = iVar11 + 1;
      } while (iVar11 != (int)unaff_x22);
    }
    in_stack_00000060 = psVar46;
    uStack0000000000000050 = in_stack_00001e00;
    uStack0000000000000058 = (segment_command *)&MACH_HEADER.cpusubtype;
    _memcpy(&uStack0000000000000068,auStack_7ffffffe + 0x800009ae,0x940);
    lVar16 = lRam0000000000a29ca8;
    lVar13 = lRam0000000000a29ca0;
    if (lRam0000000000a29ca0 != -0x8000000000000000) {
      if (psRam0000000000a29cb0 != (segment_command *)0x0) {
        unaff_x22 = (segment_command *)(lRam0000000000a29ca8 + 0x20);
        psVar46 = psRam0000000000a29cb0;
        do {
          if (*(undefined8 *)((long)unaff_x22 + -0x20) != 0) {
            func_0x00187bd4(*(undefined8 *)((long)unaff_x22 + -0x18),
                            *(undefined8 *)((long)unaff_x22 + -0x20),1);
          }
          if (*(undefined8 *)((long)unaff_x22 + -8) != 0) {
            func_0x00187bd4(*(undefined8 *)unaff_x22,*(undefined8 *)((long)unaff_x22 + -8) << 4,8);
          }
          unaff_x22 = (segment_command *)((long)unaff_x22 + 0x38);
          psVar46 = (segment_command *)((long)&psVar46[-1].flags + 3);
        } while (psVar46 != (segment_command *)0x0);
      }
      unaff_x21 = (segment_command *)0x0;
      if (lVar13 != 0) {
        func_0x00187bd4(lVar16,lVar13 * 0x38,8);
      }
    }
    _memcpy(0xa29ca0,&uStack0000000000000050,0x958);
    psRam0000000000a2a5f8 = (segment_command *)0x0;
    _uStack0000000000000008 = psVar24;
  }
  psVar12 = psRam0000000000a29cb8;
  psVar46 = (segment_command *)0xa29ca0;
  if (psRam0000000000a29cb0 == (segment_command *)0x0) {
    return;
  }
  psVar30 = (segment_command *)0x0;
  lVar13 = lRam0000000000a29ca8;
  do {
    puVar21 = (undefined8 *)(lVar13 + 0x20);
    plVar25 = (long *)(lVar13 + 0x28);
    plVar36 = *(long **)(lVar13 + 0x30);
    lVar13 = lVar13 + 0x38;
    lVar16 = *plVar25 << 4;
    plVar25 = (long *)*puVar21;
    while (lVar16 != 0) {
      lVar2 = *plVar25;
      plVar5 = plVar25 + 1;
      lVar16 = lVar16 + -0x10;
      plVar25 = plVar25 + 2;
      if ((segment_command *)(lVar2 + (long)plVar36) <= psVar24 &&
          psVar24 < (segment_command *)
                    (((segment_command *)(lVar2 + (long)plVar36))->segname + *plVar5 + -8)) {
        if (&MACH_HEADER.cputype < psRam0000000000a2a5f8) {
          func_0x007a28b0(psRam0000000000a2a5f8,4,&UNK_009dc378);
          psVar12 = extraout_x1;
          psVar46 = in_stack_00002258;
          goto code_r0x0043c540;
        }
        if (psRam0000000000a2a5f8 != (segment_command *)0x0) {
          if (psRam0000000000a29cb8 == psVar30) {
            psVar46 = (segment_command *)0x0;
          }
          else {
            lVar13 = (long)psRam0000000000a2a5f8 * 0x250;
            unaff_x21 = psRam0000000000a29cb8;
            if (lVar13 == 0x250) goto LAB_0043b864;
            if (psRam0000000000a29f08 == psVar30) {
              psVar46 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            }
            else {
              if (lVar13 == 0x4a0) goto LAB_0043b864;
              if (psRam0000000000a2a158 == psVar30) {
                psVar46 = (segment_command *)((long)&MACH_HEADER.magic + 2);
              }
              else {
                if ((lVar13 == 0x6f0) || (psRam0000000000a2a3a8 != psVar30)) goto LAB_0043b864;
                psVar46 = (segment_command *)((long)&MACH_HEADER.magic + 3);
              }
            }
          }
          if (psRam0000000000a2a5f8 <= psVar46) {
            return;
          }
          lVar13 = (long)psVar46 * 0x250 + 0xa29cb8;
          _memcpy(auStack_7ffffffe + 0x800009ae,lVar13,0x250);
          if ((long)psVar46 * 0x250 != -0x250) {
            _memcpy(&uStack0000000000000050,0xa29cb8,0x250);
            _memcpy(0xa29cb8,auStack_7ffffffe + 0x800009ae,0x250);
            _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
            if (psVar12 != psVar30) {
              _memcpy(&uStack0000000000000050,0xa29f08,0x250);
              _memcpy(0xa29f08,auStack_7ffffffe + 0x800009ae,0x250);
              _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
              if (lVar13 != 0xa29f08) {
                _memcpy(&uStack0000000000000050,0xa2a158,0x250);
                _memcpy(0xa2a158,auStack_7ffffffe + 0x800009ae,0x250);
                _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
                if (lVar13 != 0xa2a158) {
                  _memcpy(&uStack0000000000000050,0xa2a3a8,0x250);
                  _memcpy(0xa2a3a8,auStack_7ffffffe + 0x800009ae,0x250);
                  _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
                }
              }
            }
          }
          goto LAB_0043b71c;
        }
LAB_0043b864:
        psVar12 = psRam0000000000a29cb0;
        if (psRam0000000000a29cb0 <= psVar30) goto code_r0x0043d1a0;
        lVar13 = lRam0000000000a29ca8 + (long)psVar30 * 0x38;
        psVar46 = *(segment_command **)(lVar13 + 8);
        psVar12 = *(segment_command **)(lVar13 + 0x10);
        func_0x0043add8(&uStack0000000000000050,psVar46,psVar12);
        psVar17 = in_stack_00000060;
        psVar32 = uStack0000000000000058;
        if (((ulong)uStack0000000000000050 & 1) == 0) {
          return;
        }
        func_0x0043d660(&uStack0000000000000050,uStack0000000000000058,in_stack_00000060);
        if ((((uStack0000000000000050 == (segment_command *)0x0) ||
             (uStack0000000000000050->cmd == 0xcffaedfe)) ||
            (in_stack_00000060 < &segment_command_00000020)) ||
           (puVar19 = (undefined1 *)(ulong)*(dword *)((long)uStack0000000000000050->segname + 0xc),
           &in_stack_00000060[-1].fileoff < puVar19)) goto LAB_0043b8c0;
        dVar22 = *(dword *)((long)uStack0000000000000050->segname + 8);
        pqVar28 = &uStack0000000000000058->vmsize;
        goto code_r0x0043bb40;
      }
    }
    psVar30 = (segment_command *)((long)&psVar30->cmd + 1);
    if (lVar13 == lRam0000000000a29ca8 + (long)psRam0000000000a29cb0 * 0x38) {
      return;
    }
  } while( true );
  while( true ) {
    if (puVar19 < &MACH_HEADER.cpusubtype) goto LAB_0043b8c0;
    uVar15 = *(uint *)((long)pqVar26 + 4);
    puVar29 = (undefined1 *)(ulong)uVar15;
    if (uVar15 < 8 || puVar19 < puVar29) goto LAB_0043b8c0;
    puVar19 = puVar19 + -(long)puVar29;
    dVar22 = dVar22 - 1;
    pqVar28 = (qword *)((long)pqVar26 + (long)puVar29);
    if ((int)*pqVar26 == 0x1b && 0x17 < uVar15) break;
code_r0x0043bb40:
    pqVar26 = pqVar28;
    if (dVar22 == 0) goto code_r0x0043c238;
  }
  if (psVar12 == (segment_command *)0x0) {
    bVar10 = false;
  }
  else {
    bVar10 = (char)psVar46->cmd == '/';
  }
  in_stack_00000040 = (segment_command *)(ulong)*(ushort *)((long)pqVar26 + 0xc);
  qVar7 = pqVar26[1];
  in_stack_00000038 = (segment_command *)(ulong)*(ushort *)((long)pqVar26 + 0x16);
  unaff_x28 = *(segment_command **)((long)pqVar26 + 0xe);
  in_stack_00000060 = (segment_command *)CONCAT71(in_stack_00000060._1_7_,6);
  in_stack_00000088 = CONCAT62(CONCAT51(in_stack_00000088._3_5_,bVar10),0x200);
  uStack0000000000000050 = psVar46;
  uStack0000000000000058 = psVar12;
  func_0x004248f4(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050);
  if (((byte)in_stack_000009b0 - 7 < 3) &&
     (lVar13 = func_0x00423fe0(&uStack0000000000000050), lVar13 != 0)) {
    func_0x00429d60(&uStack0000000000000050);
    psVar46 = uStack0000000000000050;
    if ((char)uStack0000000000000058 == '\x02') {
      if (((ulong)uStack0000000000000050 & 3) == 1) {
        puVar21 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
        uVar31 = *puVar21;
        puVar35 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
        if ((code *)*puVar35 != (code *)0x0) {
          (*(code *)*puVar35)(uVar31);
        }
        if (puVar35[1] != 0) {
          func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
        }
        func_0x00187bd4(puVar21,0x18,8);
      }
    }
    else {
      _uStack0000000000000030 =
           (segment_command *)((ulong)unaff_x28 >> 0x10 | (long)in_stack_00000038 << 0x30);
      in_stack_00000028 = (segment_command *)((ulong)(uint6)qVar7 | (long)unaff_x28 << 0x30);
      while( true ) {
        unaff_x28 = (segment_command *)(auStack_7ffffffe + 0x8000177e);
        func_0x0041743c(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x8000176e);
        if ((int)in_stack_000009b0 != 1) break;
        if (in_stack_000009b8 == (segment_command *)0x0) {
          if (((ulong)in_stack_000009c0 & 3) == 1) {
            puVar21 = (undefined8 *)((long)&in_stack_000009c0[-1].flags + 3);
            uVar31 = *puVar21;
            puVar35 = *(undefined8 **)((long)&in_stack_000009c0->cmdsize + 3);
            if ((code *)*puVar35 != (code *)0x0) {
              (*(code *)*puVar35)(uVar31);
            }
            if (puVar35[1] != 0) {
              func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
            }
            func_0x00187bd4(puVar21,0x18,8);
          }
          in_stack_00001528 = (segment_command *)0x8000000000000000;
          unaff_x22 = in_stack_00001730;
          unaff_x21 = in_stack_00001738;
code_r0x0043c4a8:
          uVar23 = *(ulong *)psVar46;
          *(ulong *)psVar46 = uVar23 - 1;
          LORelease();
          if (uVar23 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000176e);
          }
          if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto code_r0x0043c22c;
          _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
          _munmap(psVar32,psVar17);
          unaff_x28 = unaff_x21;
          goto code_r0x0043c358;
        }
        _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
        uVar41 = (ushort)((ulong)in_stack_00001798 >> 0x10);
        uVar23 = (ulong)uVar41;
        if (uVar41 == 0) {
          psVar12 = (segment_command *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          psVar12 = (segment_command *)func_0x00187bd0(uVar23,1);
          if (psVar12 == (segment_command *)0x0) {
            func_0x007a1f00(1,uVar23,&UNK_009d9be8);
code_r0x0043d268:
                    /* WARNING: Does not return */
            pcVar9 = (code *)SoftwareBreakpoint(1,0x43d26c);
            (*pcVar9)();
          }
        }
        _memcpy(psVar12,auStack_7ffffffe + 0x8000179b,uVar23);
        func_0x0046b8d0(&uStack0000000000000050,psVar12,uVar23);
        in_stack_00001780 = in_stack_000009b8;
        in_stack_00001788 = in_stack_000009c0;
        if ((((ulong)uStack0000000000000050 & 1) == 0) && (4 < uVar41)) {
          if (!(*(int *)((long)psVar12->segname + (uVar23 - 0xd)) == 0x5953642e &&
               *(char *)((long)psVar12->segname + (uVar23 - 9)) == 'M')) goto code_r0x0043bd4c;
          func_0x004261e4(&uStack0000000000000050,in_stack_000009b8->vmaddr,
                          in_stack_000009b8->vmsize,auStack_7ffffffe + 0x8000179b,uVar23);
          psVar40 = uStack0000000000000058;
          func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                          &UNK_00887de9,0x18);
          if (uStack0000000000000050 != (segment_command *)0x0) {
            func_0x00187bd4(psVar40,uStack0000000000000050,1);
          }
          func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
          psVar40 = uStack0000000000000050;
          in_stack_00000038 = psVar12;
          if ((char)uStack0000000000000058 == '\x02') {
            if (((ulong)uStack0000000000000050 & 3) == 1) {
              puVar21 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
              uVar31 = *puVar21;
              puVar35 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
              if ((code *)*puVar35 != (code *)0x0) {
                (*(code *)*puVar35)(uVar31);
              }
              if (puVar35[1] != 0) {
                func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
              }
              func_0x00187bd4(puVar21,0x18,8);
            }
          }
          else {
            while( true ) {
              func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
              psVar8 = uStack0000000000000058;
              if ((int)uStack0000000000000050 != 1) break;
              if (uStack0000000000000058 == (segment_command *)0x0) {
                if (((ulong)in_stack_00000060 & 3) == 1) {
                  puVar21 = (undefined8 *)((long)&in_stack_00000060[-1].flags + 3);
                  uVar31 = *puVar21;
                  puVar35 = *(undefined8 **)((long)&in_stack_00000060->cmdsize + 3);
                  if ((code *)*puVar35 != (code *)0x0) {
                    (*(code *)*puVar35)(uVar31);
                  }
                  if (puVar35[1] != 0) {
                    func_0x00187bd4(uVar31,puVar35[1],puVar35[2]);
                  }
                  func_0x00187bd4(puVar21,0x18,8);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c178:
                uVar34 = *(ulong *)psVar40;
                *(ulong *)psVar40 = uVar34 - 1;
                LORelease();
                if (uVar34 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dee);
                }
                if (unaff_x28 == (segment_command *)0x8000000000000000) goto code_r0x0043c1a8;
                _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
                if (in_stack_00001ba8 != 0) {
                  func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
                }
                func_0x00187bd4(psVar12,uVar23,1);
                uVar23 = *(ulong *)in_stack_000009b8;
                *(ulong *)in_stack_000009b8 = uVar23 - 1;
                LORelease();
                in_stack_00001528 = unaff_x28;
                unaff_x22 = in_stack_00000018;
                unaff_x21 = _uStack0000000000000008;
                if (uVar23 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x8000177e);
                  unaff_x22 = in_stack_00000018;
                  unaff_x21 = _uStack0000000000000008;
                }
                goto code_r0x0043c4a8;
              }
              _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
              func_0x004261e4(auStack_7ffffffe + 0x80002256,psVar8->vmaddr,psVar8->vmsize,
                              auStack_7ffffffe + 0x80001e1b,
                              (short)((ulong)in_stack_00001e18 >> 0x10));
              func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
              if (*(int *)(unaff_x29 + -0xf0) != 1) {
                if (in_stack_00002258 != (segment_command *)0x0) {
                  func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c158:
                uVar34 = *(ulong *)psVar8;
                *(ulong *)psVar8 = uVar34 - 1;
                LORelease();
                if (uVar34 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
                }
                goto code_r0x0043c178;
              }
              psVar3 = *(segment_command **)(unaff_x29 + -0xe8);
              in_stack_00000040 = *(segment_command **)(unaff_x29 + -0xe0);
              if (in_stack_00002258 != (segment_command *)0x0) {
                func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
              }
              func_0x0043d660(auStack_7ffffffe + 0x8000245e,psVar3,in_stack_00000040);
              if ((((in_stack_00002460 != (int *)0x0) && (*in_stack_00002460 != -0x30051202)) &&
                  (0x1f < in_stack_00002470)) &&
                 (uVar34 = (ulong)(uint)in_stack_00002460[5], uVar34 <= in_stack_00002470 - 0x20)) {
                iVar11 = in_stack_00002460[4];
                piVar14 = (int *)(in_stack_00002468 + 0x20);
                do {
                  piVar27 = piVar14;
                  if ((iVar11 == 0) || (uVar34 < 8)) goto code_r0x0043bf34;
                  uVar15 = piVar27[1];
                  uVar44 = (ulong)uVar15;
                  if (uVar15 < 8 || uVar34 < uVar44) goto code_r0x0043bf34;
                  uVar34 = uVar34 - uVar44;
                  iVar11 = iVar11 + -1;
                  piVar14 = (int *)((long)piVar27 + uVar44);
                } while (*piVar27 != 0x1b || uVar15 < 0x18);
                if ((*(segment_command **)(piVar27 + 4) == _uStack0000000000000030 &&
                     *(segment_command **)(piVar27 + 2) == in_stack_00000028) &&
                   (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
                   in_stack_00002460 != (int *)0x8000000000000000)) {
                  *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
                  func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,
                                  unaff_x29 + -0xf0,unaff_x29 + -0xf0);
                  if (in_stack_00002258 != (segment_command *)0x8000000000000000) {
                    _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
                    unaff_x28 = in_stack_00002258;
                    _uStack0000000000000008 = in_stack_00000040;
                    in_stack_00000018 = psVar3;
                    goto code_r0x0043c158;
                  }
                }
              }
code_r0x0043bf34:
              func_0x003f7334(auStack_7ffffffe + 0x80002226);
              _munmap(psVar3,in_stack_00000040);
              uVar34 = *(ulong *)psVar8;
              *(ulong *)psVar8 = uVar34 - 1;
              LORelease();
              if (uVar34 == 1) {
                DataMemoryBarrier(2,1);
                func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
              }
            }
            uVar34 = *(ulong *)psVar40;
            *(ulong *)psVar40 = uVar34 - 1;
            LORelease();
            if (uVar34 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(auStack_7ffffffe + 0x80001dee);
            }
          }
code_r0x0043c1a8:
          if (in_stack_00001ba8 != 0) {
            func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
          }
          func_0x00187bd4(psVar12,uVar23,1);
          uVar23 = *(ulong *)in_stack_000009b8;
          *(ulong *)in_stack_000009b8 = uVar23 - 1;
          LORelease();
          if (uVar23 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
        else {
          if (uVar41 != 0) {
code_r0x0043bd4c:
            func_0x00187bd4(psVar12,uVar23,1);
          }
          uVar23 = *(ulong *)in_stack_000009b8;
          *(ulong *)in_stack_000009b8 = uVar23 - 1;
          LORelease();
          if (uVar23 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
      }
      uVar23 = *(ulong *)psVar46;
      *(ulong *)psVar46 = uVar23 - 1;
      LORelease();
      if (uVar23 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x8000176e);
      }
    }
code_r0x0043c22c:
    func_0x003f7b28(auStack_7ffffffe + 0x80001526);
  }
code_r0x0043c238:
  in_stack_00001528 = (segment_command *)0x0;
  in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
  in_stack_00001540 = 0;
  in_stack_00001538 = (segment_command *)0x0;
  in_stack_00001548 = (segment_command *)&MACH_HEADER.cpusubtype;
  in_stack_00001550 = 0;
  func_0x0043d660(auStack_7ffffffe + 0x8000177e,psVar32,psVar17);
  if (((in_stack_00001780 == (segment_command *)0x0) || (in_stack_00001780->cmd == 0xcffaedfe)) ||
     (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                      in_stack_00001790), in_stack_00001780 == (segment_command *)0x8000000000000000
     )) {
code_r0x0043c314:
    func_0x003f7334(auStack_7ffffffe + 0x80001526);
LAB_0043b8c0:
    _munmap(psVar32,psVar17);
    return;
  }
  in_stack_000009b0 = (segment_command *)0x8000000000000000;
  func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                  auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
  if (uStack0000000000000050 == (segment_command *)0x8000000000000000) goto code_r0x0043c314;
  _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
  unaff_x21 = psVar17;
  unaff_x22 = psVar32;
  in_stack_00001e40 = in_stack_000017c0;
code_r0x0043c358:
  _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
  if (psRam0000000000a2a5f8 == (segment_command *)&MACH_HEADER.cputype) {
    psRam0000000000a2a5f8 = (segment_command *)((long)&MACH_HEADER.magic + 3);
    func_0x003f70a4();
    _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
    func_0x003f7334(0xa2a5c8);
  }
  psVar12 = psRam0000000000a2a5f8;
  psVar46 = (segment_command *)((long)&psRam0000000000a2a5f8->cmd + 1);
  _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
  in_stack_00001e00 = psVar30;
  if (&MACH_HEADER.cputype < psVar46) {
    func_0x007a28b0(psVar46,4,&UNK_009dc360);
    psVar12 = extraout_x1_00;
code_r0x0043d1a0:
    func_0x007a2570(psVar30,psVar12,&UNK_009dc390);
code_r0x0043d1b0:
    if (in_stack_00002258 < _uStack0000000000000030) {
      func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,_uStack0000000000000030,
                      auStack_7ffffffe + 0x80002256,1,0,(ulong)_uStack0000000000000008 & 0xffffffff)
      ;
      if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2U))
      goto LAB_0043cc70;
      if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
      uVar34._0_4_ = in_stack_00001538->cmd;
      uVar34._4_4_ = in_stack_00001538->cmdsize;
      in_stack_00001530 = in_stack_00002258;
      if (uVar34 != 0x424d595343453c2f || *(int5 *)in_stack_00001538->segname != 0x2f3e534c4f) {
        in_stack_00001530 = psVar46;
      }
    }
    else {
code_r0x0043d288:
      in_stack_00001530 = psVar46;
    }
    uVar23 = 0;
    lVar13 = 1;
    in_stack_00001528 = (segment_command *)0x0;
    in_stack_00001538 = _uStack0000000000000030;
    goto code_r0x0043c9e4;
  }
  if (psVar46 != (segment_command *)0x0) {
    lVar13 = (long)psVar12 * 0x250 + 0x250;
    lVar16 = 0xa29cb8;
    do {
      _memcpy(&uStack0000000000000050,lVar16,0x250);
      _memcpy(lVar16,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      lVar13 = lVar13 + -0x250;
      lVar16 = lVar16 + 0x250;
    } while (lVar13 != 0);
  }
  psRam0000000000a2a5f8 = psVar46;
LAB_0043b71c:
  unaff_x21 = (segment_command *)((long)psVar24 - (long)plVar36);
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,unaff_x21);
  plVar36 = (long *)0xa29cc8;
  if ((int)in_stack_000009b0 != 5) {
    bVar10 = false;
    pcVar9 = *(code **)(in_stack_00000010 + 0x20);
    uStack0000000000000050 = in_stack_000009b0;
    uStack0000000000000058 = in_stack_000009b8;
    in_stack_00000060 = in_stack_000009c0;
    uStack0000000000000068 = in_stack_000009c8;
    in_stack_00000070 = in_stack_000009d0;
    in_stack_00000078 = in_stack_000009d8;
    in_stack_00000080 = in_stack_000009e0;
    in_stack_00000088 = in_stack_000009e8;
    in_stack_00000090 = in_stack_000009f0;
    in_stack_00000098 = in_stack_000009f8;
    in_stack_000000a0 = in_stack_00000a00;
    while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
          in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
      if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) && (uRam0000000000a29cd0 != 1))
      {
        lVar13 = 0;
        uVar23 = uRam0000000000a29cd0;
        do {
          lVar16 = (uVar23 >> 1) + lVar13;
          if (*(segment_command **)(lRam0000000000a29cc8 + lVar16 * 0x18 + 0x10) <= unaff_x21) {
            lVar13 = lVar16;
          }
          uVar23 = uVar23 - (uVar23 >> 1);
        } while (1 < uVar23);
      }
      (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar10 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar10) {
      return;
    }
  }
  psVar24 = (segment_command *)(auStack_7ffffffe + 0x80001526);
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (in_stack_00000040 = (segment_command *)func_0x004432ec(0xa29cd8,unaff_x21),
     in_stack_00000040 == (segment_command *)0x0)) goto code_r0x0043cef0;
  uVar23 = in_stack_00000040->vmsize;
  unaff_x22 = (segment_command *)(lRam0000000000a29d18 + uVar23 * 0x248);
  if (uRam0000000000a29d20 <= uVar23) goto code_r0x0043cef0;
  psVar46 = *(segment_command **)unaff_x22;
  if (psVar46 == (segment_command *)0x8000000000000001) {
    if (uRam0000000000a29d00 <= uVar23) goto code_r0x0043cef0;
    puVar21 = (undefined8 *)(lRam0000000000a29cf8 + uVar23 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar21,puVar21[1]);
    psVar30 = in_stack_00000060;
    psVar12 = uStack0000000000000058;
    unaff_x28 = unaff_x22;
    if ((int)uStack0000000000000050 == 1) {
      in_stack_00000018 = (segment_command *)puVar21[2];
      in_stack_00000028 = (segment_command *)puVar21[3];
      _uStack0000000000000030 = in_stack_00000060;
      in_stack_00001bf0 = 0;
      in_stack_00001bf8 = 8;
      in_stack_00001c08 = 0;
      in_stack_00001c00 = 0;
      in_stack_00001c10 = 8;
      in_stack_00001c18 = 0;
      in_stack_00000038 = uStack0000000000000058;
      psVar46 = uStack0000000000000058;
      if (in_stack_00000018 != (segment_command *)0x0) {
        if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
        psVar46 = (segment_command *)&MACH_HEADER.cpusubtype;
        uVar23._0_4_ = uStack0000000000000058->cmd;
        uVar23._4_4_ = uStack0000000000000058->cmdsize;
        if (uVar23 == 0xa3e6e6968743c21) {
          uVar15 = 1;
code_r0x0043c54c:
          in_stack_00002258 = psVar46;
          uStack0000000000000008 = uVar15;
          if (_uStack0000000000000030 == (segment_command *)&MACH_HEADER.cpusubtype) {
            uVar23 = 0;
            in_stack_00001528 = (segment_command *)0x0;
            lVar13 = 1;
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            in_stack_00001538 = (segment_command *)&MACH_HEADER.cpusubtype;
          }
          else {
            _uStack0000000000000008 = (segment_command *)(ulong)uVar15;
            func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar12,_uStack0000000000000030,
                            auStack_7ffffffe + 0x80002256,1,0);
            if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2U))
            goto LAB_0043cc70;
            uVar23 = 0;
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            lVar13 = 1;
            if (in_stack_00001540 < 9) {
              if (in_stack_00001540 == 1) {
                if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9cc;
                in_stack_00001530 = psVar46;
                if (psVar46 < _uStack0000000000000030) {
                  func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,
                                  _uStack0000000000000030,auStack_7ffffffe + 0x80002256,1,0,uVar15);
                  if (in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2U)) {
                    if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9d8;
                    in_stack_00001540 = 1;
                    if ((_uStack0000000000000030 <= psVar46) ||
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,
                                        _uStack0000000000000030,auStack_7ffffffe + 0x80002256,1,0,
                                        uVar15),
                       in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2U)))
                    goto code_r0x0043d1b0;
                  }
                  goto LAB_0043cc70;
                }
                goto code_r0x0043c9d8;
              }
              if (in_stack_00001540 != 2) {
                if (in_stack_00001540 != 7) goto code_r0x0043c9e0;
                if (*(int7 *)in_stack_00001538 == 0x2f34364d59532f) {
                  in_stack_00001530 = psVar46;
                  if (psVar46 < _uStack0000000000000030) {
                    func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,
                                    _uStack0000000000000030,auStack_7ffffffe + 0x80002256,1,0,uVar15
                                   );
                    if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2U))
                    goto LAB_0043cc70;
                  }
                  goto code_r0x0043c9d8;
                }
                goto code_r0x0043c9cc;
              }
              if ((short)in_stack_00001538->cmd != 0x2f2f) goto code_r0x0043c9cc;
              if (in_stack_00001548 == (segment_command *)0x0) {
                uVar23 = 0;
                lVar13 = 1;
                in_stack_00001530 = psVar46;
              }
              else {
                if ((_uStack0000000000000030 < in_stack_00001548) ||
                   ((ulong)((long)_uStack0000000000000030 - (long)in_stack_00001548) <
                    in_stack_00001550)) goto LAB_0043cc70;
                lVar13 = (long)in_stack_00001548->segname +
                         (long)((long)in_stack_00000038->segname + -0x10);
                uVar23 = in_stack_00001550;
                in_stack_00001530 = psVar46;
              }
            }
            else {
              if (in_stack_00001540 < 0x10) {
                if (in_stack_00001540 != 9) {
                  if (in_stack_00001540 != 0xc) goto code_r0x0043c9e0;
                  uVar44._0_4_ = in_stack_00001538->cmd;
                  uVar44._4_4_ = in_stack_00001538->cmdsize;
                  uVar23 = (ulong)*(uint *)in_stack_00001538->segname;
                  uVar34 = 0x34365f46;
                  goto code_r0x0043c960;
                }
                uVar44._0_4_ = in_stack_00001538->cmd;
                uVar44._4_4_ = in_stack_00001538->cmdsize;
                bVar10 = (char)*(dword *)in_stack_00001538->segname == 'F';
code_r0x0043c964:
                if (!bVar10 || uVar44 != 0x45444d59532e5f5f) {
code_r0x0043c9cc:
                  in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
                  goto code_r0x0043c9d8;
                }
              }
              else {
                if (in_stack_00001540 == 0x10) {
                  uVar44._0_4_ = in_stack_00001538->cmd;
                  uVar44._4_4_ = in_stack_00001538->cmdsize;
                  uVar23 = *(ulong *)in_stack_00001538->segname;
                  uVar34 = 0x444554524f532046;
code_r0x0043c960:
                  bVar10 = uVar23 == uVar34;
                  goto code_r0x0043c964;
                }
                if (in_stack_00001540 != 0x13) goto code_r0x0043c9e0;
                uVar18._0_4_ = in_stack_00001538->cmd;
                uVar18._4_4_ = in_stack_00001538->cmdsize;
                if ((uVar18 != 0x45444d59532e5f5f ||
                    *(long *)in_stack_00001538->segname != 0x524f532034365f46) ||
                    *(long *)((long)in_stack_00001538->segname + 3) != 0x444554524f532034)
                goto code_r0x0043c9cc;
              }
              in_stack_00001530 = psVar46;
code_r0x0043c9d8:
              lVar13 = 1;
              uVar23 = 0;
            }
code_r0x0043c9e0:
            in_stack_00001528 = (segment_command *)0x0;
            in_stack_00001538 = _uStack0000000000000030;
          }
        }
        else {
          if (uVar23 == 0xa3e686372613c21) {
code_r0x0043c540:
            uVar15 = 0;
            goto code_r0x0043c54c;
          }
          if ((uVar23 != 0xa3e66616769623c) ||
             (in_stack_00000060 < (segment_command *)(section_00000068.segname + 8)))
          goto LAB_0043cc70;
          auVar45 = func_0x0043fb2c(&uStack0000000000000058->filesize,0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar30) && (0x6f < (ulong)((long)psVar30 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar12->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar28 = &psVar32[1].fileoff;
                if ((pqVar28 <= psVar30) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar30 - (long)pqVar28))) {
                  psVar40 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                  psVar17 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar17 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar17;
                  }
                  if (((psVar40 <= psVar30) && (1 < (ulong)((long)psVar30 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar12->segname + -0x10)) == 0xa60
                     )) {
                    uVar23 = func_0x0043fb2c(psVar32->segname +
                                             (long)((long)psVar12->segname + -0x10),0x14,10);
code_r0x0043bb10:
                    if ((uVar23 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          auVar45 = func_0x0043fb2c((undefined1 *)((long)&psVar12->vmaddr + 4),0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar30) && (0x6f < (ulong)((long)psVar30 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar12->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar28 = &psVar32[1].fileoff;
                if ((pqVar28 <= psVar30) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar30 - (long)pqVar28))) {
                  psVar40 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                  psVar17 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar17 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar17;
                  }
                  if (((psVar40 <= psVar30) && (1 < (ulong)((long)psVar30 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar12->segname + -0x10)) == 0xa60
                     )) {
                    uVar23 = func_0x0043fb2c(psVar32->segname +
                                             (long)((long)psVar12->segname + -0x10),0x14,10);
                    goto code_r0x0043bb10;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
code_r0x0043cfd4:
          auVar45 = func_0x0043fb2c(psVar12->segname,0x14,10);
          psVar32 = auVar45._8_8_;
          if ((auVar45._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (psVar32 != (segment_command *)0x0) {
            if ((psVar32 <= psVar30) && (0x6f < (ulong)((long)psVar30 - (long)psVar32))) {
              auVar45 = func_0x0043fb2c((long)(psVar32->segname +
                                              (long)((long)psVar12->segname + -0x10)) + 0x6c,4,10);
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar28 = &psVar32[1].fileoff;
                if ((pqVar28 <= psVar30) &&
                   (auVar45._8_8_ <= (ulong)((long)psVar30 - (long)pqVar28))) {
                  psVar40 = (segment_command *)((long)pqVar28 + auVar45._8_8_);
                  psVar17 = (segment_command *)((long)&psVar40->cmd + 1);
                  if (psVar40 == (segment_command *)0xffffffffffffffff) {
                    psVar17 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar40 & 1) != 0) {
                    psVar40 = psVar17;
                  }
                  if (((psVar40 <= psVar30) && (1 < (ulong)((long)psVar30 - (long)psVar40))) &&
                     (*(short *)(psVar40->segname + (long)((long)psVar12->segname + -0x10)) == 0xa60
                     )) {
                    auVar45 = func_0x0043fb2c(psVar32->segname +
                                              (long)((long)psVar12->segname + -0x10),0x14,10);
                    uVar23 = auVar45._8_8_;
                    if ((((auVar45._0_8_ & 1) != 0) &&
                        (psVar32 = (segment_command *)((long)&psVar40->cmd + 2),
                        psVar32 != (segment_command *)0x0)) &&
                       ((psVar32 <= psVar30 &&
                        ((uVar23 <= (ulong)((long)psVar30 - (long)psVar32) && (0x13 < uVar23)))))) {
                      auVar45 = func_0x0043fb2c(psVar32->segname +
                                                (long)((long)psVar12->segname + -0x10),0x14,10);
                      in_stack_00001538 = auVar45._8_8_;
                      if (((auVar45._0_8_ & 1) != 0) &&
                         ((auVar45._8_8_ = 0, auVar45._0_8_ = in_stack_00001538,
                          SUB168(auVar45 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)in_stack_00001538 * 0x14) <= uVar23 - 0x14)))) {
                        in_stack_00001530 =
                             (segment_command *)
                             (psVar32->segname + (long)((long)psVar12->segname + -0x10) + 0x14);
                        goto LAB_0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          in_stack_00001538 = (segment_command *)0x0;
          in_stack_00001530 = (segment_command *)((long)&MACH_HEADER.magic + 1);
LAB_0043d168:
          lVar13 = 1;
          uVar23 = 0;
          in_stack_00001528 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          in_stack_00002258 = psVar46;
          uStack0000000000000008 = 0;
        }
code_r0x0043c9e4:
        *(char *)&psVar24->maxprot = (char)uStack0000000000000008;
        if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
        while (in_stack_00001530 < in_stack_00001538) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,_uStack0000000000000030,
                          auStack_7ffffffe + 0x8000152e,lVar13,uVar23,(char)psVar24->maxprot);
          psVar32 = in_stack_00001538;
          psVar30 = in_stack_00002280;
          psVar46 = in_stack_00002278;
          lVar16 = in_stack_00002268;
          psVar12 = in_stack_00002270;
          if (in_stack_00002258 != (segment_command *)((long)&MACH_HEADER.magic + 2))
          goto joined_r0x0043ca80;
joined_r0x0043ca60:
          in_stack_00001530 = psVar32;
          if (in_stack_00001528 != (segment_command *)0x0) {
code_r0x0043ca98:
            if (in_stack_00001538 == (segment_command *)0x0) break;
            in_stack_00001538 = (segment_command *)((long)&in_stack_00001538[-1].flags + 3);
            auVar45 = func_0x0043fb2c(in_stack_00001530,0x14,10);
            psVar46 = auVar45._8_8_;
            if ((((auVar45._0_8_ & 1) != 0) && (psVar46 <= _uStack0000000000000030)) &&
               (0x6f < (ulong)((long)_uStack0000000000000030 - (long)psVar46))) {
              auVar45 = func_0x0043fb2c((long)(psVar46->segname +
                                              (long)((long)in_stack_00000038->segname + -0x10)) +
                                        0x6c,4,10);
              psVar12 = auVar45._8_8_;
              if ((auVar45._0_8_ & 1) != 0) {
                pqVar28 = &psVar46[1].fileoff;
                if ((pqVar28 <= _uStack0000000000000030) &&
                   (psVar12 <= (segment_command *)((long)_uStack0000000000000030 - (long)pqVar28)))
                {
                  psVar32 = (segment_command *)(psVar12->segname + (long)(pqVar28 + -1));
                  psVar30 = (segment_command *)((long)&psVar32->cmd + 1);
                  if (psVar32 == (segment_command *)0xffffffffffffffff) {
                    psVar30 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar32 & 1) != 0) {
                    psVar32 = psVar30;
                  }
                  if ((!(_uStack0000000000000030 < psVar32 ||
                        (ulong)((long)_uStack0000000000000030 - (long)psVar32) < 2)) &&
                     (*(short *)(psVar32->segname + (long)((long)in_stack_00000038->segname + -0x10)
                                ) == 0xa60)) {
                    auVar45 = func_0x0043fb2c(psVar46->segname +
                                              (long)((long)in_stack_00000038->segname + -0x10),0x14,
                                              10);
                    if ((auVar45._0_8_ & 1) != 0) {
                      in_stack_00001530 =
                           (segment_command *)((long)in_stack_00001530->segname + 0xc);
                      psVar30 = auVar45._8_8_;
                      psVar46 = (segment_command *)((long)&psVar32->cmd + 2);
                      lVar16 = (long)(pqVar28 + -1) + (long)in_stack_00000038->segname;
joined_r0x0043ca80:
                      psVar32 = in_stack_00001530;
                      if ((psVar12 == in_stack_00000028) &&
                         (iVar11 = _memcmp(lVar16,in_stack_00000018,in_stack_00000028), iVar11 == 0)
                         ) {
                        if (psVar46 == (segment_command *)0x0) {
                          psVar30 = (segment_command *)0x0;
                          psVar46 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                        }
                        else {
                          if ((_uStack0000000000000030 < psVar46) ||
                             ((segment_command *)((long)_uStack0000000000000030 - (long)psVar46) <
                              psVar30)) break;
                          psVar46 = (segment_command *)
                                    (psVar46->segname +
                                    (long)((long)in_stack_00000038->segname + -0x10));
                        }
                        goto code_r0x0043cbb4;
                      }
                      goto joined_r0x0043ca60;
                    }
                  }
                }
              }
            }
            in_stack_00001538 = (segment_command *)0x0;
            psVar32 = (segment_command *)((long)&MACH_HEADER.magic + 1);
            goto joined_r0x0043ca60;
          }
        }
LAB_0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(in_stack_00000038,_uStack0000000000000030);
        goto code_r0x0043cc84;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_7ffffffe + 0x80001526,psVar46,psVar30);
      if ((in_stack_00001528 == (segment_command *)0x0) || (in_stack_00001528->cmd == 0xcffaedfe))
      goto LAB_0043cc70;
      func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                      in_stack_00001538);
      if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
      in_stack_00001e00 = (segment_command *)0x8000000000000000;
      func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                      auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
      psVar46 = uStack0000000000000050;
      if (uStack0000000000000050 == (segment_command *)0x8000000000000000) goto LAB_0043cc70;
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      uVar20._0_4_ = unaff_x22->cmd;
      uVar20._4_4_ = unaff_x22->cmdsize;
      psVar24 = unaff_x22;
      unaff_x22 = unaff_x28;
    }
    else {
code_r0x0043cc84:
      psVar46 = (segment_command *)0x8000000000000000;
      uVar20._0_4_ = unaff_x22->cmd;
      uVar20._4_4_ = unaff_x22->cmdsize;
      psVar24 = unaff_x22;
      unaff_x22 = unaff_x28;
      in_stack_00001c18 = in_stack_00001348;
      in_stack_00001c10 = in_stack_00001340;
      in_stack_00001c08 = in_stack_00001338;
      in_stack_00001c00 = in_stack_00001330;
      in_stack_00001bf8 = in_stack_00001328;
      in_stack_00001bf0 = in_stack_00001320;
    }
    if ((uVar20 != 0x8000000000000001) && (uVar20 != 0x8000000000000000)) {
      func_0x003f70a4(psVar24);
      _munmap(*(undefined8 *)(psVar24[7].segname + 8),psVar24[7].vmaddr);
      func_0x003f7334(&psVar24[7].vmsize);
    }
    *(segment_command **)psVar24 = psVar46;
    _memcpy(psVar24->segname,auStack_7ffffffe + 0x800009ae,0x200);
    *(segment_command **)(psVar24[7].segname + 8) = in_stack_00000038;
    psVar24[7].vmaddr = (qword)_uStack0000000000000030;
    psVar24[7].fileoff = in_stack_00001bf8;
    psVar24[7].vmsize = in_stack_00001bf0;
    psVar24[7].maxprot = (int)in_stack_00001c08;
    psVar24[7].initprot = (int)((ulong)in_stack_00001c08 >> 0x20);
    psVar24[7].filesize = in_stack_00001c00;
    psVar24[8].cmd = (int)in_stack_00001c18;
    psVar24[8].cmdsize = (int)(in_stack_00001c18 >> 0x20);
    psVar24[7].nsects = (int)in_stack_00001c10;
    psVar24[7].flags = (int)((ulong)in_stack_00001c10 >> 0x20);
    if (psVar46 == (segment_command *)0x8000000000000001) goto code_r0x0043cef0;
  }
  if ((psVar46 != (segment_command *)0x8000000000000000) &&
     (uVar23 = *(ulong *)((long)unaff_x22->segname + 8), uVar23 != 0)) {
    lVar16 = *(long *)unaff_x22->segname;
    uVar4._0_4_ = in_stack_00000040->cmd;
    uVar4._4_4_ = in_stack_00000040->cmdsize;
    uVar34 = *(ulong *)in_stack_00000040->segname;
    lVar13 = 0;
    if (uVar23 != 1) {
      do {
        lVar2 = (uVar23 >> 1) + lVar13;
        puVar21 = (undefined8 *)(lVar16 + lVar2 * 0x18);
        uVar18 = puVar21[1];
        uVar44 = uVar18;
        if (uVar34 <= uVar18) {
          uVar44 = uVar34;
        }
        iVar11 = _memcmp(*puVar21,uVar4,uVar44);
        lVar1 = uVar18 - uVar34;
        if (iVar11 != 0) {
          lVar1 = (long)iVar11;
        }
        if (lVar1 < 1) {
          lVar13 = lVar2;
        }
        uVar23 = uVar23 - (uVar23 >> 1);
      } while (1 < uVar23);
    }
    puVar21 = (undefined8 *)(lVar16 + lVar13 * 0x18);
    uVar44 = puVar21[1];
    uVar23 = uVar44;
    if (uVar34 <= uVar44) {
      uVar23 = uVar34;
    }
    iVar11 = _memcmp(*puVar21,uVar4,uVar23);
    lVar2 = uVar44 - uVar34;
    if (iVar11 != 0) {
      lVar2 = (long)iVar11;
    }
    if ((lVar2 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x22,
                        (long)unaff_x21 +
                        (*(long *)(lVar16 + lVar13 * 0x18 + 0x10) -
                        *(long *)((long)in_stack_00000040->segname + 8))),
       (int)in_stack_000009b0 != 5)) {
      uStack0000000000000050 = in_stack_000009b0;
      uStack0000000000000058 = in_stack_000009b8;
      in_stack_00000060 = in_stack_000009c0;
      uStack0000000000000068 = in_stack_000009c8;
      in_stack_00000070 = in_stack_000009d0;
      in_stack_00000078 = in_stack_000009d8;
      in_stack_00000080 = in_stack_000009e0;
      in_stack_00000088 = in_stack_000009e8;
      in_stack_00000090 = in_stack_000009f0;
      in_stack_00000098 = in_stack_000009f8;
      in_stack_000000a0 = in_stack_00000a00;
      func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
      if (in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        pcVar9 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          (*pcVar9)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        }
      }
      if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
      }
      if (in_stack_00001e00 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        return;
      }
    }
  }
code_r0x0043cef0:
  uVar23 = plVar36[1];
  if (uVar23 == 0) {
    return;
  }
  lVar13 = *plVar36;
  if (uVar23 == 1) {
    uVar34 = 0;
  }
  else {
    uVar34 = 0;
    uVar44 = uVar23;
    do {
      uVar18 = (uVar44 >> 1) + uVar34;
      if (*(segment_command **)(lVar13 + uVar18 * 0x18 + 0x10) <= unaff_x21) {
        uVar34 = uVar18;
      }
      uVar44 = uVar44 - (uVar44 >> 1);
    } while (1 < uVar44);
  }
  psVar24 = *(segment_command **)(lVar13 + uVar34 * 0x18 + 0x10);
  if (psVar24 != unaff_x21) {
    if (psVar24 < unaff_x21) {
      uVar34 = uVar34 + 1;
    }
    if (uVar34 == 0) {
      return;
    }
    uVar34 = uVar34 - 1;
  }
  if (uVar34 < uVar23) {
    puVar21 = (undefined8 *)(lVar13 + uVar34 * 0x18);
    uStack0000000000000058 = (segment_command *)*puVar21;
    in_stack_00000060 = (segment_command *)puVar21[1];
    uStack0000000000000050 = (segment_command *)CONCAT44(uStack0000000000000050._4_4_,3);
    (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    return;
  }
  return;
}

