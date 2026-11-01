
/* WARNING: Removing unreachable block (ram,0x0043b600) */
/* WARNING: Removing unreachable block (ram,0x0043b62c) */
/* WARNING: Removing unreachable block (ram,0x0043b664) */
/* WARNING: Removing unreachable block (ram,0x0043b6a4) */
/* WARNING: Removing unreachable block (ram,0x0043b6e4) */
/* WARNING: Removing unreachable block (ram,0x0043b564) */
/* WARNING: Removing unreachable block (ram,0x0043b57c) */
/* WARNING: Removing unreachable block (ram,0x0043b598) */
/* WARNING: Removing unreachable block (ram,0x0043b5b0) */
/* WARNING: Removing unreachable block (ram,0x0043b5c0) */
/* WARNING: Removing unreachable block (ram,0x0043b5d8) */
/* WARNING: Removing unreachable block (ram,0x0043b5e8) */
/* WARNING: Removing unreachable block (ram,0x0043b5f4) */
/* WARNING: Removing unreachable block (ram,0x0043b5d0) */
/* WARNING: Removing unreachable block (ram,0x0043b5a8) */
/* WARNING: Removing unreachable block (ram,0x0043b574) */
/* WARNING: Removing unreachable block (ram,0x0043b5f8) */
/* WARNING: Removing unreachable block (ram,0x0043c530) */
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

void FUN_0043b034(ulong param_1)

{
  long lVar1;
  segment_command *psVar2;
  segment_command *psVar3;
  segment_command *psVar4;
  long *plVar5;
  dword *pdVar6;
  qword qVar7;
  code *pcVar8;
  bool bVar9;
  int iVar10;
  long lVar11;
  int *piVar12;
  segment_command *extraout_x1;
  uint uVar13;
  long lVar14;
  ulong uVar15;
  undefined1 *puVar16;
  long lVar17;
  undefined8 *puVar18;
  ulong uVar19;
  segment_command *psVar20;
  long *plVar21;
  qword *pqVar22;
  int *piVar23;
  qword *pqVar24;
  undefined1 *puVar25;
  segment_command *unaff_x19;
  segment_command *psVar26;
  undefined8 uVar27;
  segment_command *unaff_x20;
  segment_command *psVar28;
  segment_command *psVar29;
  segment_command *unaff_x22;
  ulong unaff_x23;
  segment_command *psVar30;
  undefined8 *unaff_x25;
  ulong uVar31;
  undefined8 *puVar32;
  segment_command *unaff_x26;
  long unaff_x27;
  long *plVar33;
  segment_command *unaff_x28;
  long unaff_x29;
  undefined4 uVar34;
  undefined6 uVar35;
  uint7 uVar36;
  segment_command *psVar37;
  ushort uVar38;
  undefined4 uVar39;
  undefined6 uVar40;
  ulong uVar41;
  undefined1 auVar42 [16];
  undefined8 in_stack_00000000;
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
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  segment_command *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  segment_command *in_stack_000009b0;
  segment_command *in_stack_000009b8;
  segment_command *in_stack_000009c0;
  undefined8 in_stack_000009c8;
  undefined8 in_stack_000009d0;
  undefined8 in_stack_000009d8;
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
  undefined8 in_stack_00001348;
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
  undefined8 in_stack_00001c18;
  segment_command *in_stack_00001e00;
  segment_command *in_stack_00001e08;
  segment_command *in_stack_00001e10;
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
  
  psVar20 = _uStack0000000000000008;
  do {
    lVar11 = __dyld_get_image_name(param_1);
    if (lVar11 == 0) {
LAB_0043b080:
      psVar26 = (segment_command *)0x8000000000000000;
    }
    else {
      in_stack_00000028 = (segment_command *)_strlen();
      piVar12 = (int *)__dyld_get_image_header(unaff_x23);
      if (piVar12 == (int *)0x0) goto LAB_0043b080;
      if (*piVar12 == -0x1120531) {
        lVar14 = 0x20;
      }
      else {
        if (*piVar12 != -0x1120532) goto LAB_0043b080;
        lVar14 = 0x1c;
      }
      iVar10 = piVar12[4];
      uVar19 = (ulong)(uint)piVar12[5];
      uStack0000000000000050 = (segment_command *)0x0;
      uStack0000000000000058 = (segment_command *)&MACH_HEADER.cpusubtype;
      in_stack_00000060 = (segment_command *)0x0;
      if (iVar10 == 0) {
        __dyld_get_image_vmaddr_slide(unaff_x23);
        psVar26 = (segment_command *)0x0;
        psVar29 = (segment_command *)0x0;
code_r0x0043d10c:
        func_0x007a2570(psVar29,psVar26,&UNK_009dc3f0);
        goto code_r0x0043d268;
      }
      psVar26 = (segment_command *)0x0;
      psVar29 = (segment_command *)0x0;
      _uStack0000000000000030 =
           (segment_command *)((ulong)_uStack0000000000000030 & 0xffffffff00000000);
      piVar12 = (int *)((long)piVar12 + lVar14);
      psVar30 = (segment_command *)&MACH_HEADER.cpusubtype;
      do {
        if (uVar19 < 8) {
code_r0x0043b248:
          if (uStack0000000000000050 != (segment_command *)0x0) {
            func_0x00187bd4(uStack0000000000000058,(long)uStack0000000000000050 << 4,8);
          }
          psVar26 = (segment_command *)0x8000000000000000;
          goto code_r0x0043b398;
        }
        uVar13 = piVar12[1];
        uVar31 = (ulong)uVar13;
        if ((uVar13 < 8) || (bVar9 = uVar19 < uVar31, uVar19 = uVar19 - uVar31, bVar9))
        goto code_r0x0043b248;
        if (*piVar12 == 0x19) {
          if (uVar13 < 0x48) goto code_r0x0043b248;
          uVar27 = *(undefined8 *)(piVar12 + 4);
          uVar41 = *(ulong *)(piVar12 + 2);
          if (((uVar41 & 0xffffffffffff) == 0x545845545f5f) &&
             (uVar34 = CONCAT13(-((char)(uVar41 >> 0x18) == '\0'),
                                CONCAT12(-((char)(uVar41 >> 0x10) == '\0'),
                                         CONCAT11(-((char)(uVar41 >> 8) == '\0'),
                                                  -((char)uVar41 == '\0')))),
             uVar35 = CONCAT15(-((char)(uVar41 >> 0x28) == '\0'),
                               CONCAT14(-((char)(uVar41 >> 0x20) == '\0'),uVar34)),
             uVar36 = CONCAT16(-((char)(uVar41 >> 0x30) == '\0'),uVar35),
             uVar38 = CONCAT11(-((char)((ulong)uVar27 >> 8) == '\0'),-((char)uVar27 == '\0')),
             uVar39 = CONCAT13(-((char)((ulong)uVar27 >> 0x18) == '\0'),
                               CONCAT12(-((char)((ulong)uVar27 >> 0x10) == '\0'),uVar38)),
             uVar40 = CONCAT15(-((char)((ulong)uVar27 >> 0x28) == '\0'),
                               CONCAT14(-((char)((ulong)uVar27 >> 0x20) == '\0'),uVar39)),
             uVar15 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == '\0'),
                                               CONCAT16(-((char)((ulong)uVar27 >> 0x30) == '\0'),
                                                        uVar40)) >> 0x34),
                               CONCAT16((char)((uint6)uVar40 >> 0x24),
                                        CONCAT15((char)((uint)uVar39 >> 0x14),
                                                 CONCAT14((char)(uVar38 >> 4),
                                                          CONCAT13((char)(CONCAT17(-((char)(uVar41 
                                                  >> 0x38) == '\0'),uVar36) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar35 >> 0x24),
                                                           CONCAT11((char)((uint)uVar34 >> 0x14),
                                                                    (char)(((ulong)uVar36 & 0xfff0)
                                                                          >> 4)))))))) &
                      0x8888888888888888, uVar41 = uVar15 >> 3,
             uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar41 & 0xf0f0f0f0f0f0f0f) << 4,
             uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8,
             uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10,
             uVar15 != 0 && (LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) & 0x3cU) == 0x18)) {
            if (*(long *)(piVar12 + 10) == 0) {
              _uStack0000000000000030 =
                   (segment_command *)
                   CONCAT44(uStack0000000000000034,
                            *(long *)(piVar12 + 0xc) != 0 | uStack0000000000000030);
            }
            psVar29 = psVar26;
          }
          uVar41 = *(ulong *)(piVar12 + 8);
          psVar37 = *(segment_command **)(piVar12 + 6);
          if (psVar26 == uStack0000000000000050) {
            func_0x00403e60(&uStack0000000000000050,&UNK_009dc3d8);
            psVar30 = uStack0000000000000058;
          }
          in_stack_00000040 = psVar37;
code_r0x0043b0c0:
          *(ulong *)((dword *)((long)psVar30->segname + ((long)psVar26 * 4 + -2) * 4) + 2) = uVar41;
          *(segment_command **)((long)psVar30->segname + ((long)psVar26 * 4 + -2) * 4) = psVar37;
          psVar26 = (segment_command *)((long)&psVar26->cmd + 1);
          in_stack_00000060 = psVar26;
        }
        else if (*piVar12 == 1) {
          if (0x37 < uVar13) {
            uVar27 = *(undefined8 *)(piVar12 + 4);
            uVar41 = *(ulong *)(piVar12 + 2);
            if (((uVar41 & 0xffffffffffff) == 0x545845545f5f) &&
               (uVar34 = CONCAT13(-((char)(uVar41 >> 0x18) == '\0'),
                                  CONCAT12(-((char)(uVar41 >> 0x10) == '\0'),
                                           CONCAT11(-((char)(uVar41 >> 8) == '\0'),
                                                    -((char)uVar41 == '\0')))),
               uVar35 = CONCAT15(-((char)(uVar41 >> 0x28) == '\0'),
                                 CONCAT14(-((char)(uVar41 >> 0x20) == '\0'),uVar34)),
               uVar36 = CONCAT16(-((char)(uVar41 >> 0x30) == '\0'),uVar35),
               uVar38 = CONCAT11(-((char)((ulong)uVar27 >> 8) == '\0'),-((char)uVar27 == '\0')),
               uVar39 = CONCAT13(-((char)((ulong)uVar27 >> 0x18) == '\0'),
                                 CONCAT12(-((char)((ulong)uVar27 >> 0x10) == '\0'),uVar38)),
               uVar40 = CONCAT15(-((char)((ulong)uVar27 >> 0x28) == '\0'),
                                 CONCAT14(-((char)((ulong)uVar27 >> 0x20) == '\0'),uVar39)),
               uVar15 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == '\0'),
                                                 CONCAT16(-((char)((ulong)uVar27 >> 0x30) == '\0'),
                                                          uVar40)) >> 0x34),
                                 CONCAT16((char)((uint6)uVar40 >> 0x24),
                                          CONCAT15((char)((uint)uVar39 >> 0x14),
                                                   CONCAT14((char)(uVar38 >> 4),
                                                            CONCAT13((char)(CONCAT17(-((char)(uVar41
                                                                                             >> 0x38
                                                  ) == '\0'),uVar36) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar35 >> 0x24),
                                                           CONCAT11((char)((uint)uVar34 >> 0x14),
                                                                    (char)(((ulong)uVar36 & 0xfff0)
                                                                          >> 4)))))))) &
                        0x8888888888888888, uVar41 = uVar15 >> 3,
               uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar41 & 0xf0f0f0f0f0f0f0f) << 4,
               uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8,
               uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10,
               uVar15 != 0 && (LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) & 0x3cU) == 0x18)) {
              if (piVar12[8] == 0) {
                _uStack0000000000000030 =
                     (segment_command *)
                     CONCAT44(uStack0000000000000034,piVar12[9] != 0 | uStack0000000000000030);
              }
              psVar29 = psVar26;
            }
            uVar41 = *(ulong *)(piVar12 + 6);
            if (psVar26 == uStack0000000000000050) {
              func_0x00403e60(&uStack0000000000000050,&UNK_009dc3c0);
            }
            psVar37 = (segment_command *)(uVar41 & 0xffffffff);
            uVar41 = uVar41 >> 0x20;
            psVar30 = uStack0000000000000058;
            goto code_r0x0043b0c0;
          }
          goto code_r0x0043b248;
        }
        piVar12 = (int *)((long)piVar12 + uVar31);
        iVar10 = iVar10 + -1;
      } while (iVar10 != 0);
      in_stack_00000038 = (segment_command *)__dyld_get_image_vmaddr_slide(unaff_x23);
      if (((ulong)_uStack0000000000000030 & 1) == 0) {
        if (psVar26 <= psVar29) goto code_r0x0043d10c;
        lVar14 = *(long *)((long)uStack0000000000000058->segname + ((long)psVar29 * 4 + -2) * 4);
        uVar19 = (ulong)((long)&psVar26[-1].flags + 3) & 0xfffffffffffffff;
        psVar29 = uStack0000000000000058;
        if (uVar19 < 3) {
code_r0x0043b318:
          do {
            pdVar6 = (dword *)psVar29->segname;
            *(long *)psVar29 = *(long *)psVar29 - lVar14;
            psVar29 = (segment_command *)(pdVar6 + 2);
          } while ((segment_command *)(pdVar6 + 2) !=
                   (segment_command *)
                   ((long)uStack0000000000000058->segname + ((long)psVar26 * 4 + -2) * 4));
        }
        else {
          uVar19 = uVar19 + 1;
          uVar41 = uVar19 & 0x1ffffffffffffffc;
          psVar29 = (segment_command *)
                    ((long)uStack0000000000000058->segname + (uVar41 * 4 + -2) * 4);
          pqVar24 = &uStack0000000000000058->vmsize;
          uVar31 = uVar41;
          do {
            *(long *)(pqVar24 + -4) = *(long *)(pqVar24 + -4) - lVar14;
            pqVar24[-2] = pqVar24[-2] - lVar14;
            *pqVar24 = *pqVar24 - lVar14;
            pqVar24[2] = pqVar24[2] - lVar14;
            pqVar24 = pqVar24 + 8;
            uVar31 = uVar31 - 4;
          } while (uVar31 != 0);
          if (uVar19 != uVar41) goto code_r0x0043b318;
        }
        in_stack_00000038 = (segment_command *)((long)in_stack_00000038->segname + lVar14 + -8);
      }
      if ((long)in_stack_00000028 < 0) {
        in_stack_00000000 = 0;
code_r0x0043d174:
        func_0x007a1f00(in_stack_00000000,in_stack_00000028,&UNK_009d9be8);
        goto code_r0x0043d268;
      }
      if (in_stack_00000028 == (segment_command *)0x0) {
        unaff_x28 = (segment_command *)((long)&MACH_HEADER.magic + 1);
      }
      else {
        unaff_x28 = (segment_command *)func_0x00187bd0(in_stack_00000028,1);
        if (unaff_x28 == (segment_command *)0x0) goto code_r0x0043d174;
      }
      _memcpy(unaff_x28,lVar11,in_stack_00000028);
      unaff_x20 = in_stack_00000028;
      psVar26 = in_stack_00000028;
      in_stack_000009b0 = uStack0000000000000050;
      in_stack_000009b8 = uStack0000000000000058;
      in_stack_000009c0 = in_stack_00000060;
code_r0x0043b398:
      unaff_x27 = 0x38;
      unaff_x26 = (segment_command *)0x8000000000000000;
      unaff_x25 = &uStack0000000000000050;
      unaff_x22 = (segment_command *)((ulong)in_stack_00000018 & 0xffffffff);
      unaff_x19 = in_stack_00001e10;
    }
    unaff_x25[4] = in_stack_000009b8;
    unaff_x25[3] = in_stack_000009b0;
    unaff_x25[5] = in_stack_000009c0;
    in_stack_00000080 = in_stack_00000038;
    uStack0000000000000050 = psVar26;
    uStack0000000000000058 = unaff_x28;
    in_stack_00000060 = unaff_x20;
    if ((ulong)((long)in_stack_00001e00 - (long)unaff_x19) < (ulong)(psVar26 != unaff_x26)) {
      func_0x007a0000(auStack_7ffffffe + 0x80001dfe,unaff_x19,(ulong)(psVar26 != unaff_x26),8,0x38);
      unaff_x19 = in_stack_00001e10;
    }
    if (psVar26 != unaff_x26) {
      puVar18 = (undefined8 *)((long)in_stack_00001e08->segname + (long)unaff_x19 * unaff_x27 + -8);
      *puVar18 = psVar26;
      puVar18[1] = unaff_x28;
      puVar18[2] = unaff_x20;
      puVar18[3] = uStack0000000000000068;
      puVar18[4] = in_stack_00000070;
      uVar27 = unaff_x25[5];
      puVar18[6] = unaff_x25[6];
      puVar18[5] = uVar27;
      unaff_x19 = (segment_command *)((long)&unaff_x19->cmd + 1);
    }
    uVar13 = (int)unaff_x23 + 1;
    param_1 = (ulong)uVar13;
    if (uVar13 == (uint)unaff_x22) {
      uStack0000000000000050 = in_stack_00001e00;
      uStack0000000000000058 = in_stack_00001e08;
      in_stack_00000060 = unaff_x19;
      _memcpy(&uStack0000000000000068,auStack_7ffffffe + 0x800009ae,0x940);
      lVar14 = lRam0000000000a29ca8;
      lVar11 = lRam0000000000a29ca0;
      if (lRam0000000000a29ca0 != -0x8000000000000000) {
        if (psRam0000000000a29cb0 != (segment_command *)0x0) {
          unaff_x22 = (segment_command *)(lRam0000000000a29ca8 + 0x20);
          psVar26 = psRam0000000000a29cb0;
          do {
            if (*(undefined8 *)((long)unaff_x22 + -0x20) != 0) {
              func_0x00187bd4(*(undefined8 *)((long)unaff_x22 + -0x18),
                              *(undefined8 *)((long)unaff_x22 + -0x20),1);
            }
            if (*(undefined8 *)((long)unaff_x22 + -8) != 0) {
              func_0x00187bd4(*(undefined8 *)unaff_x22,*(undefined8 *)((long)unaff_x22 + -8) << 4,8)
              ;
            }
            unaff_x22 = (segment_command *)((long)unaff_x22 + 0x38);
            psVar26 = (segment_command *)((long)&psVar26[-1].flags + 3);
          } while (psVar26 != (segment_command *)0x0);
        }
        psVar26 = (segment_command *)0x0;
        if (lVar11 != 0) {
          func_0x00187bd4(lVar14,lVar11 * 0x38,8);
        }
      }
      psVar29 = (segment_command *)0xa29ca0;
      _memcpy(0xa29ca0,&uStack0000000000000050,0x958);
      psRam0000000000a2a5f8 = (segment_command *)0x0;
      if (psRam0000000000a29cb0 == (segment_command *)0x0) {
        psRam0000000000a2a5f8 = (segment_command *)0x0;
        return;
      }
      psVar30 = (segment_command *)0x0;
      lVar11 = lRam0000000000a29ca8;
      do {
        puVar18 = (undefined8 *)(lVar11 + 0x20);
        plVar21 = (long *)(lVar11 + 0x28);
        plVar33 = *(long **)(lVar11 + 0x30);
        lVar11 = lVar11 + 0x38;
        lVar14 = *plVar21 << 4;
        plVar21 = (long *)*puVar18;
        while (lVar14 != 0) {
          lVar17 = *plVar21;
          plVar5 = plVar21 + 1;
          lVar14 = lVar14 + -0x10;
          plVar21 = plVar21 + 2;
          if ((segment_command *)(lVar17 + (long)plVar33) <= _uStack0000000000000008 &&
              _uStack0000000000000008 <
              (segment_command *)
              (((segment_command *)(lVar17 + (long)plVar33))->segname + *plVar5 + -8)) {
            psVar37 = psRam0000000000a29cb0;
            if (psRam0000000000a29cb0 <= psVar30) goto code_r0x0043d1a0;
            lVar11 = lRam0000000000a29ca8 + (long)psVar30 * 0x38;
            psVar26 = *(segment_command **)(lVar11 + 8);
            psVar29 = *(segment_command **)(lVar11 + 0x10);
            func_0x0043add8(&uStack0000000000000050,psVar26,psVar29);
            psVar28 = in_stack_00000060;
            psVar37 = uStack0000000000000058;
            if (((ulong)uStack0000000000000050 & 1) == 0) {
              return;
            }
            func_0x0043d660(&uStack0000000000000050,uStack0000000000000058,in_stack_00000060);
            if ((((uStack0000000000000050 == (segment_command *)0x0) ||
                 (uStack0000000000000050->cmd == 0xcffaedfe)) ||
                (in_stack_00000060 < &segment_command_00000020)) ||
               (puVar16 = (undefined1 *)(ulong)*(uint *)(uStack0000000000000050->segname + 0xc),
               &in_stack_00000060[-1].fileoff < puVar16)) goto code_r0x0043b8c0;
            iVar10 = *(int *)(uStack0000000000000050->segname + 8);
            pqVar24 = &uStack0000000000000058->vmsize;
            goto code_r0x0043bb40;
          }
        }
        psVar30 = (segment_command *)((long)&psVar30->cmd + 1);
        if (lVar11 == lRam0000000000a29ca8 + (long)psRam0000000000a29cb0 * 0x38) {
          psRam0000000000a2a5f8 = (segment_command *)0x0;
          return;
        }
      } while( true );
    }
    unaff_x23 = param_1;
    in_stack_00001e10 = unaff_x19;
  } while( true );
  while( true ) {
    if (puVar16 < &MACH_HEADER.cpusubtype) goto code_r0x0043b8c0;
    uVar13 = *(uint *)((long)pqVar22 + 4);
    puVar25 = (undefined1 *)(ulong)uVar13;
    if (uVar13 < 8 || puVar16 < puVar25) goto code_r0x0043b8c0;
    puVar16 = puVar16 + -(long)puVar25;
    iVar10 = iVar10 + -1;
    pqVar24 = (qword *)((long)pqVar22 + (long)puVar25);
    if ((int)*pqVar22 == 0x1b && 0x17 < uVar13) break;
code_r0x0043bb40:
    pqVar22 = pqVar24;
    if (iVar10 == 0) goto code_r0x0043c238;
  }
  if (psVar29 == (segment_command *)0x0) {
    bVar9 = false;
  }
  else {
    bVar9 = (char)psVar26->cmd == '/';
  }
  in_stack_00000040 = (segment_command *)(ulong)*(ushort *)((long)pqVar22 + 0xc);
  qVar7 = pqVar22[1];
  in_stack_00000038 = (segment_command *)(ulong)*(ushort *)((long)pqVar22 + 0x16);
  unaff_x28 = *(segment_command **)((long)pqVar22 + 0xe);
  in_stack_00000060 = (segment_command *)CONCAT71(in_stack_00000060._1_7_,6);
  in_stack_00000088 = CONCAT62(CONCAT51(in_stack_00000088._3_5_,bVar9),0x200);
  uStack0000000000000050 = psVar26;
  uStack0000000000000058 = psVar29;
  func_0x004248f4(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050);
  if (((byte)in_stack_000009b0 - 7 < 3) &&
     (lVar11 = func_0x00423fe0(&uStack0000000000000050), lVar11 != 0)) {
    func_0x00429d60(&uStack0000000000000050);
    psVar29 = uStack0000000000000050;
    if ((char)uStack0000000000000058 == '\x02') {
      if (((ulong)uStack0000000000000050 & 3) == 1) {
        puVar18 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
        uVar27 = *puVar18;
        puVar32 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
        if ((code *)*puVar32 != (code *)0x0) {
          (*(code *)*puVar32)(uVar27);
        }
        if (puVar32[1] != 0) {
          func_0x00187bd4(uVar27,puVar32[1],puVar32[2]);
        }
        func_0x00187bd4(puVar18,0x18,8);
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
            puVar18 = (undefined8 *)((long)&in_stack_000009c0[-1].flags + 3);
            uVar27 = *puVar18;
            puVar32 = *(undefined8 **)((long)&in_stack_000009c0->cmdsize + 3);
            if ((code *)*puVar32 != (code *)0x0) {
              (*(code *)*puVar32)(uVar27);
            }
            if (puVar32[1] != 0) {
              func_0x00187bd4(uVar27,puVar32[1],puVar32[2]);
            }
            func_0x00187bd4(puVar18,0x18,8);
          }
          in_stack_00001528 = (segment_command *)0x8000000000000000;
          unaff_x22 = in_stack_00001730;
          psVar26 = in_stack_00001738;
code_r0x0043c4a8:
          lVar11 = *(long *)psVar29;
          *(long *)psVar29 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000176e);
          }
          if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto code_r0x0043c22c;
          _memcpy(auStack_7ffffffe + 0x8000131e,auStack_7ffffffe + 0x8000152e,0x200);
          _munmap(psVar37,psVar28);
          unaff_x28 = psVar26;
          goto LAB_0043c358;
        }
        _memcpy(auStack_7ffffffe + 0x8000178e,auStack_7ffffffe + 0x800009c6,0x410);
        uVar38 = (ushort)((ulong)in_stack_00001798 >> 0x10);
        uVar19 = (ulong)uVar38;
        if (uVar38 == 0) {
          psVar26 = (segment_command *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          psVar26 = (segment_command *)func_0x00187bd0(uVar19,1);
          if (psVar26 == (segment_command *)0x0) {
            func_0x007a1f00(1,uVar19,&UNK_009d9be8);
code_r0x0043d268:
                    /* WARNING: Does not return */
            pcVar8 = (code *)SoftwareBreakpoint(1,0x43d26c);
            (*pcVar8)();
          }
        }
        _memcpy(psVar26,auStack_7ffffffe + 0x8000179b,uVar19);
        func_0x0046b8d0(&uStack0000000000000050,psVar26,uVar19);
        in_stack_00001780 = in_stack_000009b8;
        in_stack_00001788 = in_stack_000009c0;
        if ((((ulong)uStack0000000000000050 & 1) == 0) && (4 < uVar38)) {
          if (*(int *)((long)psVar26->segname + (uVar19 - 0xd)) != 0x5953642e ||
              *(char *)((long)psVar26->segname + (uVar19 - 9)) != 'M') goto code_r0x0043bd4c;
          func_0x004261e4(&uStack0000000000000050,in_stack_000009b8->vmaddr,
                          in_stack_000009b8->vmsize,auStack_7ffffffe + 0x8000179b,uVar19);
          psVar3 = uStack0000000000000058;
          func_0x004261e4(auStack_7ffffffe + 0x80001ba6,uStack0000000000000058,in_stack_00000060,
                          &UNK_00887de9,0x18);
          if (uStack0000000000000050 != (segment_command *)0x0) {
            func_0x00187bd4(psVar3,uStack0000000000000050,1);
          }
          func_0x00429d60(&uStack0000000000000050,in_stack_00001bb0,in_stack_00001bb8);
          psVar3 = uStack0000000000000050;
          in_stack_00000038 = psVar26;
          if ((char)uStack0000000000000058 == '\x02') {
            if (((ulong)uStack0000000000000050 & 3) == 1) {
              puVar18 = (undefined8 *)((long)&uStack0000000000000050[-1].flags + 3);
              uVar27 = *puVar18;
              puVar32 = *(undefined8 **)((long)&uStack0000000000000050->cmdsize + 3);
              if ((code *)*puVar32 != (code *)0x0) {
                (*(code *)*puVar32)(uVar27);
              }
              if (puVar32[1] != 0) {
                func_0x00187bd4(uVar27,puVar32[1],puVar32[2]);
              }
              func_0x00187bd4(puVar18,0x18,8);
            }
          }
          else {
            while( true ) {
              func_0x0041743c(&uStack0000000000000050,auStack_7ffffffe + 0x80001dee);
              psVar2 = uStack0000000000000058;
              if ((int)uStack0000000000000050 != 1) break;
              if (uStack0000000000000058 == (segment_command *)0x0) {
                if (((ulong)in_stack_00000060 & 3) == 1) {
                  puVar18 = (undefined8 *)((long)&in_stack_00000060[-1].flags + 3);
                  uVar27 = *puVar18;
                  puVar32 = *(undefined8 **)((long)&in_stack_00000060->cmdsize + 3);
                  if ((code *)*puVar32 != (code *)0x0) {
                    (*(code *)*puVar32)(uVar27);
                  }
                  if (puVar32[1] != 0) {
                    func_0x00187bd4(uVar27,puVar32[1],puVar32[2]);
                  }
                  func_0x00187bd4(puVar18,0x18,8);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c178:
                lVar11 = *(long *)psVar3;
                *(long *)psVar3 = lVar11 + -1;
                LORelease();
                if (lVar11 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dee);
                }
                if (unaff_x28 == (segment_command *)0x8000000000000000) goto code_r0x0043c1a8;
                _memcpy(auStack_7ffffffe + 0x8000152e,auStack_7ffffffe + 0x80001bee,0x200);
                if (in_stack_00001ba8 != 0) {
                  func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
                }
                func_0x00187bd4(psVar26,uVar19,1);
                lVar11 = *(long *)in_stack_000009b8;
                *(long *)in_stack_000009b8 = lVar11 + -1;
                LORelease();
                in_stack_00001528 = unaff_x28;
                unaff_x22 = in_stack_00000018;
                psVar26 = _uStack0000000000000008;
                if (lVar11 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x8000177e);
                  unaff_x22 = in_stack_00000018;
                }
                goto code_r0x0043c4a8;
              }
              _memcpy(auStack_7ffffffe + 0x80001e0e,&uStack0000000000000068,0x410);
              func_0x004261e4(auStack_7ffffffe + 0x80002256,psVar2->vmaddr,psVar2->vmsize,
                              auStack_7ffffffe + 0x80001e1b,
                              (short)((ulong)in_stack_00001e18 >> 0x10));
              func_0x0043add8(unaff_x29 + -0xf0,in_stack_00002260,in_stack_00002268);
              if (*(int *)(unaff_x29 + -0xf0) != 1) {
                if (in_stack_00002258 != (segment_command *)0x0) {
                  func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
                }
                unaff_x28 = (segment_command *)0x8000000000000000;
code_r0x0043c158:
                lVar11 = *(long *)psVar2;
                *(long *)psVar2 = lVar11 + -1;
                LORelease();
                if (lVar11 == 1) {
                  DataMemoryBarrier(2,1);
                  func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
                }
                goto code_r0x0043c178;
              }
              psVar4 = *(segment_command **)(unaff_x29 + -0xe8);
              in_stack_00000040 = *(segment_command **)(unaff_x29 + -0xe0);
              if (in_stack_00002258 != (segment_command *)0x0) {
                func_0x00187bd4(in_stack_00002260,in_stack_00002258,1);
              }
              func_0x0043d660(auStack_7ffffffe + 0x8000245e,psVar4,in_stack_00000040);
              if ((((in_stack_00002460 != (int *)0x0) && (*in_stack_00002460 != -0x30051202)) &&
                  (0x1f < in_stack_00002470)) &&
                 (uVar31 = (ulong)(uint)in_stack_00002460[5], uVar31 <= in_stack_00002470 - 0x20)) {
                iVar10 = in_stack_00002460[4];
                piVar12 = (int *)(in_stack_00002468 + 0x20);
                do {
                  piVar23 = piVar12;
                  if ((iVar10 == 0) || (uVar31 < 8)) goto LAB_0043bf34;
                  uVar13 = piVar23[1];
                  uVar41 = (ulong)uVar13;
                  if (uVar13 < 8 || uVar31 < uVar41) goto LAB_0043bf34;
                  uVar31 = uVar31 - uVar41;
                  iVar10 = iVar10 + -1;
                  piVar12 = (int *)((long)piVar23 + uVar41);
                } while (*piVar23 != 0x1b || uVar13 < 0x18);
                if ((*(segment_command **)(piVar23 + 4) == _uStack0000000000000030 &&
                     *(segment_command **)(piVar23 + 2) == in_stack_00000028) &&
                   (func_0x0043d840(auStack_7ffffffe + 0x8000245e),
                   in_stack_00002460 != (int *)0x8000000000000000)) {
                  *(undefined8 *)(unaff_x29 + -0xf0) = 0x8000000000000000;
                  func_0x004385b0(auStack_7ffffffe + 0x80002256,auStack_7ffffffe + 0x800024de,
                                  unaff_x29 + -0xf0,unaff_x29 + -0xf0);
                  if (in_stack_00002258 != (segment_command *)0x8000000000000000) {
                    _memcpy(auStack_7ffffffe + 0x80001bee,auStack_7ffffffe + 0x8000225e,0x200);
                    unaff_x28 = in_stack_00002258;
                    _uStack0000000000000008 = in_stack_00000040;
                    in_stack_00000018 = psVar4;
                    goto code_r0x0043c158;
                  }
                }
              }
LAB_0043bf34:
              func_0x003f7334(auStack_7ffffffe + 0x80002226);
              _munmap(psVar4,in_stack_00000040);
              lVar11 = *(long *)psVar2;
              *(long *)psVar2 = lVar11 + -1;
              LORelease();
              if (lVar11 == 1) {
                DataMemoryBarrier(2,1);
                func_0x004037b4(auStack_7ffffffe + 0x80001dfe);
              }
            }
            lVar11 = *(long *)psVar3;
            *(long *)psVar3 = lVar11 + -1;
            LORelease();
            if (lVar11 == 1) {
              DataMemoryBarrier(2,1);
              func_0x004037b4(auStack_7ffffffe + 0x80001dee);
            }
          }
code_r0x0043c1a8:
          if (in_stack_00001ba8 != 0) {
            func_0x00187bd4(in_stack_00001bb0,in_stack_00001ba8,1);
          }
          func_0x00187bd4(psVar26,uVar19,1);
          lVar11 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
        else {
          if (uVar38 != 0) {
code_r0x0043bd4c:
            func_0x00187bd4(psVar26,uVar19,1);
          }
          lVar11 = *(long *)in_stack_000009b8;
          *(long *)in_stack_000009b8 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            DataMemoryBarrier(2,1);
            func_0x004037b4(auStack_7ffffffe + 0x8000177e);
          }
        }
      }
      lVar11 = *(long *)psVar29;
      *(long *)psVar29 = lVar11 + -1;
      LORelease();
      if (lVar11 == 1) {
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
  func_0x0043d660(auStack_7ffffffe + 0x8000177e,psVar37,psVar28);
  if (((in_stack_00001780 == (segment_command *)0x0) || (in_stack_00001780->cmd == 0xcffaedfe)) ||
     (func_0x0043d840(auStack_7ffffffe + 0x8000177e,in_stack_00001780,in_stack_00001788,
                      in_stack_00001790), in_stack_00001780 == (segment_command *)0x8000000000000000
     )) {
code_r0x0043c314:
    func_0x003f7334(auStack_7ffffffe + 0x80001526);
code_r0x0043b8c0:
    _munmap(psVar37,psVar28);
    return;
  }
  in_stack_000009b0 = (segment_command *)0x8000000000000000;
  func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x80001dfe,
                  auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x800009ae);
  if (uStack0000000000000050 == (segment_command *)0x8000000000000000) goto code_r0x0043c314;
  _memcpy(auStack_7ffffffe + 0x8000131e,&uStack0000000000000058,0x200);
  psVar26 = psVar28;
  unaff_x22 = psVar37;
  in_stack_00001e40 = in_stack_000017c0;
LAB_0043c358:
  _memcpy(auStack_7ffffffe + 0x80001e0e,auStack_7ffffffe + 0x8000131e,0x200);
  if (psRam0000000000a2a5f8 == (segment_command *)&MACH_HEADER.cputype) {
    psRam0000000000a2a5f8 = (segment_command *)((long)&MACH_HEADER.magic + 3);
    func_0x003f70a4();
    _munmap(uRam0000000000a2a5b8,uRam0000000000a2a5c0);
    func_0x003f7334(0xa2a5c8);
  }
  psVar37 = psRam0000000000a2a5f8;
  psVar29 = (segment_command *)((long)&psRam0000000000a2a5f8->cmd + 1);
  _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
  if (&MACH_HEADER.cputype < psVar29) {
    func_0x007a28b0(psVar29,4,&UNK_009dc360);
    psVar37 = extraout_x1;
    in_stack_00001e00 = psVar30;
code_r0x0043d1a0:
    func_0x007a2570(psVar30,psVar37,&UNK_009dc390);
    psVar30 = in_stack_00001e00;
code_r0x0043d1b0:
    if (in_stack_00002258 < _uStack0000000000000030) {
      func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,_uStack0000000000000030,
                      auStack_7ffffffe + 0x80002256,1,0,(ulong)_uStack0000000000000008 & 0xffffffff)
      ;
      if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2))
      goto code_r0x0043cc70;
      if (in_stack_00001540 != 0xd) goto code_r0x0043d288;
      lVar14._0_4_ = in_stack_00001538->cmd;
      lVar14._4_4_ = in_stack_00001538->cmdsize;
      in_stack_00001530 = in_stack_00002258;
      if (lVar14 != 0x424d595343453c2f || *(int5 *)in_stack_00001538->segname != 0x2f3e534c4f) {
        in_stack_00001530 = psVar29;
      }
    }
    else {
code_r0x0043d288:
      in_stack_00001530 = psVar29;
    }
    uVar19 = 0;
    lVar11 = 1;
    in_stack_00001528 = (segment_command *)0x0;
    in_stack_00001538 = _uStack0000000000000030;
code_r0x0043c9e4:
    *(char *)&psVar20->maxprot = (char)uStack0000000000000008;
    if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
    while (in_stack_00001530 < in_stack_00001538) {
      func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,_uStack0000000000000030,
                      auStack_7ffffffe + 0x8000152e,lVar11,uVar19,(char)psVar20->maxprot);
      psVar3 = in_stack_00001538;
      psVar28 = in_stack_00002280;
      psVar29 = in_stack_00002278;
      lVar14 = in_stack_00002268;
      psVar37 = in_stack_00002270;
      if (in_stack_00002258 != (segment_command *)((long)&MACH_HEADER.magic + 2))
      goto joined_r0x0043ca80;
joined_r0x0043ca60:
      in_stack_00001530 = psVar3;
      if (in_stack_00001528 != (segment_command *)0x0) {
code_r0x0043ca98:
        if (in_stack_00001538 == (segment_command *)0x0) break;
        in_stack_00001538 = (segment_command *)((long)&in_stack_00001538[-1].flags + 3);
        auVar42 = func_0x0043fb2c(in_stack_00001530,0x14,10);
        psVar29 = auVar42._8_8_;
        if ((((auVar42._0_8_ & 1) != 0) && (psVar29 <= _uStack0000000000000030)) &&
           (0x6f < (ulong)((long)_uStack0000000000000030 - (long)psVar29))) {
          auVar42 = func_0x0043fb2c((long)(psVar29->segname +
                                          (long)((long)in_stack_00000038->segname + -0x10)) + 0x6c,4
                                    ,10);
          psVar37 = auVar42._8_8_;
          if ((auVar42._0_8_ & 1) != 0) {
            pqVar24 = &psVar29[1].fileoff;
            if ((pqVar24 <= _uStack0000000000000030) &&
               (psVar37 <= (segment_command *)((long)_uStack0000000000000030 - (long)pqVar24))) {
              psVar3 = (segment_command *)(psVar37->segname + (long)(pqVar24 + -1));
              psVar28 = (segment_command *)((long)&psVar3->cmd + 1);
              if (psVar3 == (segment_command *)0xffffffffffffffff) {
                psVar28 = (segment_command *)0xffffffffffffffff;
              }
              if (((ulong)psVar3 & 1) != 0) {
                psVar3 = psVar28;
              }
              if ((!(_uStack0000000000000030 < psVar3 ||
                    (ulong)((long)_uStack0000000000000030 - (long)psVar3) < 2)) &&
                 (*(short *)(psVar3->segname + (long)((long)in_stack_00000038->segname + -0x10)) ==
                  0xa60)) {
                auVar42 = func_0x0043fb2c(psVar29->segname +
                                          (long)((long)in_stack_00000038->segname + -0x10),0x14,10);
                if ((auVar42._0_8_ & 1) != 0) {
                  in_stack_00001530 = (segment_command *)((long)in_stack_00001530->segname + 0xc);
                  psVar28 = auVar42._8_8_;
                  psVar29 = (segment_command *)((long)&psVar3->cmd + 2);
                  lVar14 = (long)(pqVar24 + -1) + (long)in_stack_00000038->segname;
joined_r0x0043ca80:
                  psVar3 = in_stack_00001530;
                  if ((psVar37 == in_stack_00000028) &&
                     (iVar10 = _memcmp(lVar14,in_stack_00000018,in_stack_00000028), iVar10 == 0)) {
                    if (psVar29 == (segment_command *)0x0) {
                      psVar28 = (segment_command *)0x0;
                      psVar29 = (segment_command *)((long)&MACH_HEADER.magic + 1);
                    }
                    else {
                      if ((_uStack0000000000000030 < psVar29) ||
                         ((segment_command *)((long)_uStack0000000000000030 - (long)psVar29) <
                          psVar28)) break;
                      psVar29 = (segment_command *)
                                (psVar29->segname + (long)((long)in_stack_00000038->segname + -0x10)
                                );
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
        psVar3 = (segment_command *)((long)&MACH_HEADER.magic + 1);
        goto joined_r0x0043ca60;
      }
    }
    goto code_r0x0043cc70;
  }
  if (psVar29 != (segment_command *)0x0) {
    lVar11 = (long)psVar37 * 0x250 + 0x250;
    lVar14 = 0xa29cb8;
    do {
      _memcpy(&uStack0000000000000050,lVar14,0x250);
      _memcpy(lVar14,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      lVar11 = lVar11 + -0x250;
      lVar14 = lVar14 + 0x250;
    } while (lVar11 != 0);
  }
  psVar26 = (segment_command *)((long)psVar20 - (long)plVar33);
  psRam0000000000a2a5f8 = psVar29;
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,psVar26);
  plVar33 = (long *)0xa29cc8;
  if ((int)in_stack_000009b0 != 5) {
    bVar9 = false;
    pcVar8 = *(code **)(in_stack_00000010 + 0x20);
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
          psVar30 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
      if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) && (uRam0000000000a29cd0 != 1))
      {
        lVar11 = 0;
        uVar19 = uRam0000000000a29cd0;
        do {
          lVar14 = (uVar19 >> 1) + lVar11;
          if (*(segment_command **)(lRam0000000000a29cc8 + lVar14 * 0x18 + 0x10) <= psVar26) {
            lVar11 = lVar14;
          }
          uVar19 = uVar19 - (uVar19 >> 1);
        } while (1 < uVar19);
      }
      (*pcVar8)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar9 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar9) {
      return;
    }
  }
  psVar20 = (segment_command *)(auStack_7ffffffe + 0x80001526);
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (in_stack_00000040 = (segment_command *)func_0x004432ec(0xa29cd8,psVar26),
     in_stack_00000040 == (segment_command *)0x0)) goto code_r0x0043cef0;
  uVar19 = in_stack_00000040->vmsize;
  unaff_x22 = (segment_command *)(lRam0000000000a29d18 + uVar19 * 0x248);
  if (uRam0000000000a29d20 <= uVar19) goto code_r0x0043cef0;
  psVar29 = *(segment_command **)unaff_x22;
  if (psVar29 == (segment_command *)0x8000000000000001) {
    if (uRam0000000000a29d00 <= uVar19) goto code_r0x0043cef0;
    puVar18 = (undefined8 *)(lRam0000000000a29cf8 + uVar19 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar18,puVar18[1]);
    psVar28 = in_stack_00000060;
    psVar37 = uStack0000000000000058;
    unaff_x28 = unaff_x22;
    if ((int)uStack0000000000000050 == 1) {
      in_stack_00000018 = (segment_command *)puVar18[2];
      in_stack_00000028 = (segment_command *)puVar18[3];
      _uStack0000000000000030 = in_stack_00000060;
      in_stack_00001bf0 = 0;
      in_stack_00001bf8 = 8;
      in_stack_00001c08 = 0;
      in_stack_00001c00 = 0;
      in_stack_00001c10 = 8;
      in_stack_00001c18 = 0;
      in_stack_00000038 = uStack0000000000000058;
      psVar29 = uStack0000000000000058;
      if (in_stack_00000018 != (segment_command *)0x0) {
        if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto code_r0x0043cc70;
        lVar11._0_4_ = uStack0000000000000058->cmd;
        lVar11._4_4_ = uStack0000000000000058->cmdsize;
        if (lVar11 == 0xa3e6e6968743c21) {
          uVar13 = 1;
code_r0x0043c54c:
          psVar29 = (segment_command *)&MACH_HEADER.cpusubtype;
          in_stack_00001c18 = 0;
          in_stack_00001c10 = 8;
          in_stack_00001c08 = 0;
          in_stack_00001c00 = 0;
          in_stack_00001bf8 = 8;
          in_stack_00001bf0 = 0;
          plVar33 = (long *)0xa29cc8;
          in_stack_00002258 = psVar29;
          uStack0000000000000008 = uVar13;
          if (in_stack_00000060 == (segment_command *)&MACH_HEADER.cpusubtype) {
            uVar19 = 0;
            in_stack_00001528 = (segment_command *)0x0;
            lVar11 = 1;
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            in_stack_00001538 = (segment_command *)&MACH_HEADER.cpusubtype;
          }
          else {
            _uStack0000000000000008 = (segment_command *)(ulong)uVar13;
            func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,in_stack_00000060,
                            auStack_7ffffffe + 0x80002256,1,0);
            if (in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2))
            goto code_r0x0043cc70;
            uVar19 = 0;
            lVar11 = 1;
            if (in_stack_00001540 < 9) {
              if (in_stack_00001540 == 1) {
                if (((char)in_stack_00001538->cmd == '/') && (&MACH_HEADER.cpusubtype < psVar28)) {
                  func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar37,psVar28,
                                  auStack_7ffffffe + 0x80002256,1,0,uVar13);
                  if (in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)) {
                    if ((char)in_stack_00001538->cmd != '/') goto code_r0x0043c9d8;
                    in_stack_00001540 = 1;
                    if ((psVar28 <= &MACH_HEADER.cpusubtype) ||
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar37,psVar28,
                                        auStack_7ffffffe + 0x80002256,1,0,uVar13),
                       in_stack_00001528 != (segment_command *)((long)&MACH_HEADER.magic + 2)))
                    goto code_r0x0043d1b0;
                  }
                  goto code_r0x0043cc70;
                }
                goto code_r0x0043c9d8;
              }
              if (in_stack_00001540 == 2) {
                if ((short)in_stack_00001538->cmd != 0x2f2f) goto code_r0x0043c9d8;
                if (in_stack_00001548 == (segment_command *)0x0) {
                  uVar19 = 0;
                  lVar11 = 1;
                }
                else {
                  if ((psVar28 < in_stack_00001548) ||
                     ((ulong)((long)psVar28 - (long)in_stack_00001548) < in_stack_00001550))
                  goto code_r0x0043cc70;
                  lVar11 = (long)in_stack_00001548->segname + (long)((long)psVar37->segname + -0x10)
                  ;
                  uVar19 = in_stack_00001550;
                }
              }
              else if (in_stack_00001540 == 7) {
                if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                    (&MACH_HEADER.cpusubtype < psVar28)) &&
                   (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,psVar37,psVar28,
                                    auStack_7ffffffe + 0x80002256,1,0,uVar13),
                   in_stack_00001528 == (segment_command *)((long)&MACH_HEADER.magic + 2)))
                goto code_r0x0043cc70;
                goto code_r0x0043c9d8;
              }
            }
            else if (in_stack_00001540 < 0x10) {
              if ((in_stack_00001540 == 9) || (in_stack_00001540 == 0xc)) goto code_r0x0043c9d8;
            }
            else if ((in_stack_00001540 == 0x10) || (in_stack_00001540 == 0x13)) {
code_r0x0043c9d8:
              lVar11 = 1;
              uVar19 = 0;
            }
            in_stack_00001530 = (segment_command *)&MACH_HEADER.cpusubtype;
            in_stack_00001528 = (segment_command *)0x0;
            in_stack_00001538 = psVar28;
          }
        }
        else {
          if (lVar11 == 0xa3e686372613c21) {
            uVar13 = 0;
            goto code_r0x0043c54c;
          }
          if ((lVar11 != 0xa3e66616769623c) ||
             (in_stack_00000060 < (segment_command *)(section_00000068.segname + 8)))
          goto code_r0x0043cc70;
          auVar42 = func_0x0043fb2c(&uStack0000000000000058->filesize,0x14,10);
          psVar29 = auVar42._8_8_;
          if ((auVar42._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (psVar29 != (segment_command *)0x0) {
            if ((psVar29 <= psVar28) && (0x6f < (ulong)((long)psVar28 - (long)psVar29))) {
              auVar42 = func_0x0043fb2c((long)(psVar29->segname +
                                              (long)((long)psVar37->segname + -0x10)) + 0x6c,4,10);
              if ((auVar42._0_8_ & 1) != 0) {
                pqVar24 = &psVar29[1].fileoff;
                if ((pqVar24 <= psVar28) &&
                   (auVar42._8_8_ <= (ulong)((long)psVar28 - (long)pqVar24))) {
                  psVar2 = (segment_command *)((long)pqVar24 + auVar42._8_8_);
                  psVar3 = (segment_command *)((long)&psVar2->cmd + 1);
                  if (psVar2 == (segment_command *)0xffffffffffffffff) {
                    psVar3 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar2 & 1) != 0) {
                    psVar2 = psVar3;
                  }
                  if (((psVar2 <= psVar28) && (1 < (ulong)((long)psVar28 - (long)psVar2))) &&
                     (*(short *)(psVar2->segname + (long)((long)psVar37->segname + -0x10)) == 0xa60)
                     ) {
                    uVar19 = func_0x0043fb2c(psVar29->segname +
                                             (long)((long)psVar37->segname + -0x10),0x14,10);
LAB_0043bb10:
                    if ((uVar19 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
          auVar42 = func_0x0043fb2c((undefined1 *)((long)&psVar37->vmaddr + 4),0x14,10);
          psVar29 = auVar42._8_8_;
          if ((auVar42._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (psVar29 != (segment_command *)0x0) {
            if ((psVar29 <= psVar28) && (0x6f < (ulong)((long)psVar28 - (long)psVar29))) {
              auVar42 = func_0x0043fb2c((long)(psVar29->segname +
                                              (long)((long)psVar37->segname + -0x10)) + 0x6c,4,10);
              if ((auVar42._0_8_ & 1) != 0) {
                pqVar24 = &psVar29[1].fileoff;
                if ((pqVar24 <= psVar28) &&
                   (auVar42._8_8_ <= (ulong)((long)psVar28 - (long)pqVar24))) {
                  psVar2 = (segment_command *)((long)pqVar24 + auVar42._8_8_);
                  psVar3 = (segment_command *)((long)&psVar2->cmd + 1);
                  if (psVar2 == (segment_command *)0xffffffffffffffff) {
                    psVar3 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar2 & 1) != 0) {
                    psVar2 = psVar3;
                  }
                  if (((psVar2 <= psVar28) && (1 < (ulong)((long)psVar28 - (long)psVar2))) &&
                     (*(short *)(psVar2->segname + (long)((long)psVar37->segname + -0x10)) == 0xa60)
                     ) {
                    uVar19 = func_0x0043fb2c(psVar29->segname +
                                             (long)((long)psVar37->segname + -0x10),0x14,10);
                    goto LAB_0043bb10;
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
code_r0x0043cfd4:
          auVar42 = func_0x0043fb2c(psVar37->segname,0x14,10);
          psVar29 = auVar42._8_8_;
          if ((auVar42._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (psVar29 != (segment_command *)0x0) {
            if ((psVar29 <= psVar28) && (0x6f < (ulong)((long)psVar28 - (long)psVar29))) {
              auVar42 = func_0x0043fb2c((long)(psVar29->segname +
                                              (long)((long)psVar37->segname + -0x10)) + 0x6c,4,10);
              if ((auVar42._0_8_ & 1) != 0) {
                pqVar24 = &psVar29[1].fileoff;
                if ((pqVar24 <= psVar28) &&
                   (auVar42._8_8_ <= (ulong)((long)psVar28 - (long)pqVar24))) {
                  psVar2 = (segment_command *)((long)pqVar24 + auVar42._8_8_);
                  psVar3 = (segment_command *)((long)&psVar2->cmd + 1);
                  if (psVar2 == (segment_command *)0xffffffffffffffff) {
                    psVar3 = (segment_command *)0xffffffffffffffff;
                  }
                  if (((ulong)psVar2 & 1) != 0) {
                    psVar2 = psVar3;
                  }
                  if (((psVar2 <= psVar28) && (1 < (ulong)((long)psVar28 - (long)psVar2))) &&
                     (*(short *)(psVar2->segname + (long)((long)psVar37->segname + -0x10)) == 0xa60)
                     ) {
                    auVar42 = func_0x0043fb2c(psVar29->segname +
                                              (long)((long)psVar37->segname + -0x10),0x14,10);
                    uVar19 = auVar42._8_8_;
                    if ((((auVar42._0_8_ & 1) != 0) &&
                        (psVar29 = (segment_command *)((long)&psVar2->cmd + 2),
                        psVar29 != (segment_command *)0x0)) &&
                       ((psVar29 <= psVar28 &&
                        ((uVar19 <= (ulong)((long)psVar28 - (long)psVar29) && (0x13 < uVar19)))))) {
                      auVar42 = func_0x0043fb2c(psVar29->segname +
                                                (long)((long)psVar37->segname + -0x10),0x14,10);
                      in_stack_00001538 = auVar42._8_8_;
                      if (((auVar42._0_8_ & 1) != 0) &&
                         ((auVar42._8_8_ = 0, auVar42._0_8_ = in_stack_00001538,
                          SUB168(auVar42 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)in_stack_00001538 * 0x14) <= uVar19 - 0x14)))) {
                        in_stack_00001530 =
                             (segment_command *)
                             (psVar29->segname + (long)((long)psVar37->segname + -0x10) + 0x14);
                        goto code_r0x0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
          in_stack_00001538 = (segment_command *)0x0;
          in_stack_00001530 = (segment_command *)((long)&MACH_HEADER.magic + 1);
code_r0x0043d168:
          lVar11 = 1;
          uVar19 = 0;
          in_stack_00001528 = (segment_command *)((long)&MACH_HEADER.magic + 1);
          in_stack_00002258 = (segment_command *)&MACH_HEADER.cpusubtype;
          uStack0000000000000008 = 0;
        }
        goto code_r0x0043c9e4;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_7ffffffe + 0x80001526,psVar29,psVar28);
      if ((in_stack_00001528 == (segment_command *)0x0) || (in_stack_00001528->cmd == 0xcffaedfe)) {
code_r0x0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(in_stack_00000038,_uStack0000000000000030);
        goto code_r0x0043cc84;
      }
      func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                      in_stack_00001538);
      if (in_stack_00001528 == (segment_command *)0x8000000000000000) goto code_r0x0043cc70;
      psVar30 = (segment_command *)0x8000000000000000;
      func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                      auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
      psVar29 = uStack0000000000000050;
      if (uStack0000000000000050 == (segment_command *)0x8000000000000000) goto code_r0x0043cc70;
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      lVar17._0_4_ = unaff_x22->cmd;
      lVar17._4_4_ = unaff_x22->cmdsize;
      psVar20 = unaff_x22;
      unaff_x22 = unaff_x28;
    }
    else {
code_r0x0043cc84:
      psVar29 = (segment_command *)0x8000000000000000;
      lVar17._0_4_ = unaff_x22->cmd;
      lVar17._4_4_ = unaff_x22->cmdsize;
      psVar20 = unaff_x22;
      unaff_x22 = unaff_x28;
      in_stack_00001c18 = in_stack_00001348;
      in_stack_00001c10 = in_stack_00001340;
      in_stack_00001c08 = in_stack_00001338;
      in_stack_00001c00 = in_stack_00001330;
      in_stack_00001bf8 = in_stack_00001328;
      in_stack_00001bf0 = in_stack_00001320;
    }
    if ((lVar17 != -0x7fffffffffffffff) && (lVar17 != -0x8000000000000000)) {
      func_0x003f70a4(psVar20);
      _munmap(*(undefined8 *)(psVar20[7].segname + 8),psVar20[7].vmaddr);
      func_0x003f7334(&psVar20[7].vmsize);
    }
    *(segment_command **)psVar20 = psVar29;
    _memcpy(psVar20->segname,auStack_7ffffffe + 0x800009ae,0x200);
    *(segment_command **)(psVar20[7].segname + 8) = in_stack_00000038;
    psVar20[7].vmaddr = (qword)_uStack0000000000000030;
    psVar20[7].fileoff = in_stack_00001bf8;
    psVar20[7].vmsize = in_stack_00001bf0;
    psVar20[7].maxprot = (int)in_stack_00001c08;
    psVar20[7].initprot = (int)((ulong)in_stack_00001c08 >> 0x20);
    psVar20[7].filesize = in_stack_00001c00;
    psVar20[8].cmd = (int)in_stack_00001c18;
    psVar20[8].cmdsize = (int)((ulong)in_stack_00001c18 >> 0x20);
    psVar20[7].nsects = (int)in_stack_00001c10;
    psVar20[7].flags = (int)((ulong)in_stack_00001c10 >> 0x20);
    if (psVar29 == (segment_command *)0x8000000000000001) goto code_r0x0043cef0;
  }
  if ((psVar29 != (segment_command *)0x8000000000000000) &&
     (uVar19 = *(ulong *)((long)unaff_x22->segname + 8), uVar19 != 0)) {
    lVar14 = *(long *)unaff_x22->segname;
    uVar27._0_4_ = in_stack_00000040->cmd;
    uVar27._4_4_ = in_stack_00000040->cmdsize;
    uVar31 = *(ulong *)in_stack_00000040->segname;
    lVar11 = 0;
    if (uVar19 != 1) {
      do {
        lVar17 = (uVar19 >> 1) + lVar11;
        puVar18 = (undefined8 *)(lVar14 + lVar17 * 0x18);
        uVar15 = puVar18[1];
        uVar41 = uVar15;
        if (uVar31 <= uVar15) {
          uVar41 = uVar31;
        }
        iVar10 = _memcmp(*puVar18,uVar27,uVar41);
        lVar1 = uVar15 - uVar31;
        if (iVar10 != 0) {
          lVar1 = (long)iVar10;
        }
        if (lVar1 < 1) {
          lVar11 = lVar17;
        }
        uVar19 = uVar19 - (uVar19 >> 1);
      } while (1 < uVar19);
    }
    puVar18 = (undefined8 *)(lVar14 + lVar11 * 0x18);
    uVar41 = puVar18[1];
    uVar19 = uVar41;
    if (uVar31 <= uVar41) {
      uVar19 = uVar31;
    }
    iVar10 = _memcmp(*puVar18,uVar27,uVar19);
    lVar17 = uVar41 - uVar31;
    if (iVar10 != 0) {
      lVar17 = (long)iVar10;
    }
    if ((lVar17 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x22,
                        (long)psVar26 +
                        (*(long *)(lVar14 + lVar11 * 0x18 + 0x10) -
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
      if (psVar30 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        pcVar8 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar8)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              psVar30 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
          (*pcVar8)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        }
      }
      if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
      }
      if (psVar30 < (segment_command *)((long)&MACH_HEADER.magic + 2)) {
        return;
      }
    }
  }
code_r0x0043cef0:
  uVar19 = plVar33[1];
  if (uVar19 == 0) {
    return;
  }
  lVar11 = *plVar33;
  if (uVar19 == 1) {
    uVar31 = 0;
  }
  else {
    uVar31 = 0;
    uVar41 = uVar19;
    do {
      uVar15 = (uVar41 >> 1) + uVar31;
      if (*(segment_command **)(lVar11 + uVar15 * 0x18 + 0x10) <= psVar26) {
        uVar31 = uVar15;
      }
      uVar41 = uVar41 - (uVar41 >> 1);
    } while (1 < uVar41);
  }
  psVar20 = *(segment_command **)(lVar11 + uVar31 * 0x18 + 0x10);
  if (psVar20 != psVar26) {
    if (psVar20 < psVar26) {
      uVar31 = uVar31 + 1;
    }
    if (uVar31 == 0) {
      return;
    }
    uVar31 = uVar31 - 1;
  }
  if (uVar31 < uVar19) {
    puVar18 = (undefined8 *)(lVar11 + uVar31 * 0x18);
    uStack0000000000000058 = (segment_command *)*puVar18;
    in_stack_00000060 = (segment_command *)puVar18[1];
    uStack0000000000000050 = (segment_command *)CONCAT44(uStack0000000000000050._4_4_,3);
    (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    return;
  }
  return;
}

