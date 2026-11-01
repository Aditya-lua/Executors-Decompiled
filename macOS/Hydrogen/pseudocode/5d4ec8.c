
void FUN_005d4ec8(void)

{
  char cVar1;
  uint uVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  code *pcVar5;
  bool bVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  long extraout_x1;
  long extraout_x1_00;
  long extraout_x1_01;
  long extraout_x1_02;
  long extraout_x1_03;
  long extraout_x1_04;
  long extraout_x1_05;
  long extraout_x1_06;
  long extraout_x1_07;
  long extraout_x1_08;
  long extraout_x1_09;
  undefined8 extraout_x1_10;
  undefined8 extraout_x1_11;
  undefined8 extraout_x1_12;
  undefined8 extraout_x1_13;
  long lVar10;
  long *plVar11;
  long lVar12;
  undefined8 *puVar13;
  dword *pdVar14;
  byte bVar15;
  ulong uVar16;
  ulong uVar17;
  bool bVar18;
  long *plVar19;
  ulong uVar20;
  ulong uVar21;
  ulong unaff_x19;
  dword *pdVar22;
  dword *unaff_x20;
  dword *pdVar23;
  ulong uVar24;
  dword *pdVar25;
  dword *unaff_x22;
  ulong *puVar26;
  long *plVar27;
  long unaff_x23;
  long lVar28;
  ulong unaff_x24;
  ulong uVar29;
  uint *puVar30;
  undefined8 unaff_x25;
  ulong uVar31;
  dword *unaff_x26;
  dword *unaff_x27;
  long lVar32;
  long *unaff_x28;
  long *plVar34;
  long *plVar33;
  long in_xzr;
  long lVar35;
  byte bVar36;
  undefined8 in_stack_00000008;
  undefined *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000098;
  long in_stack_000000a0;
  ulong in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  long *in_stack_000000c0;
  long *in_stack_000000c8;
  ulong in_stack_000000d0;
  long *in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  dword *in_stack_000000f0;
  ulong in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 uStack0000000000000108;
  dword *in_stack_00000110;
  ulong in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 uStack0000000000000130;
  dword *in_stack_00000138;
  dword *in_stack_00000140;
  ulong in_stack_00000148;
  dword *in_stack_00000150;
  undefined8 in_stack_00000158;
  dword *in_stack_00000160;
  ulong in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 uStack0000000000000180;
  long in_stack_00000188;
  undefined8 *in_stack_00000190;
  ulong in_stack_00000198;
  undefined8 *in_stack_000001a0;
  ulong in_stack_000001a8;
  undefined8 in_stack_000001b0;
  long in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 uStack00000000000001d0;
  undefined8 *in_stack_000001d8;
  ulong in_stack_000001e0;
  undefined8 *in_stack_000001e8;
  long *in_stack_00000220;
  dword *in_stack_00000238;
  dword *in_stack_00000240;
  dword *in_stack_00000248;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x005d4ec8:
  uVar7 = 4;
  if (unaff_x26 != (dword *)0x0) {
    pdVar25 = unaff_x22;
LAB_005d4f48:
    _memcpy(unaff_x26,unaff_x25,unaff_x24);
    lVar8 = extraout_x1_02;
    uStack0000000000000130 = unaff_x22;
    in_stack_00000138 = unaff_x26;
    in_stack_00000140 = pdVar25;
    if (unaff_x28 != (long *)((long)&MACH_HEADER.magic + 1)) {
      puVar26 = (ulong *)(in_stack_00000050 + 0x28);
      lVar28 = (long)unaff_x28 * 0x18 + -0x18;
      uStack0000000000000130 = unaff_x22;
      in_stack_00000138 = unaff_x26;
      do {
        uVar24 = *puVar26;
        uVar29 = uVar24 * 4;
        if (uVar24 >> 0x3e != 0 || 0x7ffffffffffffffc < uVar29) {
          in_stack_00000008 = 0;
LAB_005d5b8c:
          func_0x007a1f00(in_stack_00000008,uVar29,&UNK_009f1b38);
          goto code_r0x005d5bf4;
        }
        uVar31 = puVar26[-1];
        if (uVar29 == 0) {
          uVar21 = 0;
          lVar8 = 4;
        }
        else {
          lVar8 = func_0x00187bd0(uVar29,4);
          if (lVar8 == 0) goto LAB_005d5b8c;
          uVar21 = uVar24;
        }
        _memcpy(lVar8,uVar31,uVar29);
        uStack0000000000000098 = uVar21;
        in_stack_000000a0 = lVar8;
        in_stack_000000a8 = uVar24;
        func_0x0059f70c(auStack_7ffffffe + 0x80000236,&uStack0000000000000130,
                        &uStack0000000000000098);
        lVar8 = extraout_x1_03;
        if (uStack0000000000000130 != (dword *)0x0) {
          func_0x00187bd4(in_stack_00000138,(long)uStack0000000000000130 << 2,4);
          lVar8 = extraout_x1_04;
        }
        puVar26 = puVar26 + 3;
        lVar28 = lVar28 + -0x18;
        uStack0000000000000130 = in_stack_00000238;
        in_stack_00000138 = in_stack_00000240;
        in_stack_00000140 = in_stack_00000248;
      } while (lVar28 != 0);
      unaff_x23 = in_stack_00000018;
    }
    if (in_stack_00000140 != (dword *)0x0) {
      lVar12 = in_stack_00000050 + (long)unaff_x28 * 0x18;
      uVar29 = (ulong)*in_stack_00000138;
      lVar28 = *(long *)unaff_x27;
      uVar24 = CONCAT17(-(-1 < lVar28),
                        CONCAT16(-(-1 < (char)((ulong)lVar28 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar28 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar28 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar28 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar28 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar28 >> 8)),-(-1 < (char)lVar28)))))))) &
               0x8080808080808080;
      lVar28 = in_stack_00000038 * 0x11 + 0x19;
      pdVar25 = unaff_x27 + in_stack_00000038 * -4 + -4;
      do {
        if (unaff_x19 == 0) {
          if (uVar29 < *(ulong *)(in_stack_00000048 + 0x10)) {
            uVar24 = (ulong)*(uint *)(*(long *)(in_stack_00000048 + 8) + uVar29 * 0x18 + 0x10);
          }
          else {
            uVar24 = 0xffffffff;
          }
          bVar18 = false;
          uVar31 = 0xffffffff;
          pdVar22 = (dword *)0x0;
          do {
            if (uVar24 < *(ulong *)(in_stack_00000048 + 0x28)) {
              puVar30 = (uint *)(*(long *)(in_stack_00000048 + 0x20) + uVar24 * 0x10);
              uVar24 = (ulong)*puVar30;
              uVar2 = puVar30[3];
            }
            else {
              do {
                if (*(ulong *)(in_stack_00000048 + 0x28) <= uVar31) {
                  if (!bVar18) goto LAB_005d5bec;
                  goto LAB_005d51e8;
                }
                lVar35 = *(long *)(in_stack_00000048 + 0x20) + uVar31 * 0x10;
                uVar31 = (ulong)*(uint *)(lVar35 + 4);
                uVar2 = *(uint *)(lVar35 + 8);
              } while (uVar2 == 0xffffffff);
            }
            uVar21 = (ulong)uVar2;
            lVar35 = in_stack_00000050;
            lVar32 = in_stack_00000050 + 0x18;
            if (uVar21 < *(ulong *)(in_stack_00000048 + 0x10)) {
              lVar8 = *(long *)(in_stack_00000048 + 8) + uVar21 * 0x18;
              do {
                lVar10 = *(long *)(lVar35 + 0x10) << 2;
                puVar30 = *(uint **)(lVar35 + 8);
                do {
                  if (lVar10 == 0) goto LAB_005d517c;
                  uVar2 = *puVar30;
                  lVar10 = lVar10 + -4;
                  puVar30 = puVar30 + 1;
                } while (uVar2 != uVar21);
                pdVar22 = *(dword **)(lVar8 + 8);
                bVar18 = true;
LAB_005d517c:
                bVar6 = lVar32 != lVar12;
                lVar10 = 0;
                if (bVar6) {
                  lVar10 = 0x18;
                }
                lVar35 = lVar32;
                lVar32 = lVar32 + lVar10;
              } while (bVar6);
            }
            else {
              do {
                lVar8 = lVar32;
                lVar32 = *(long *)(lVar35 + 0x10) << 2;
                puVar30 = *(uint **)(lVar35 + 8);
                while (lVar32 != 0) {
                  uVar2 = *puVar30;
                  lVar32 = lVar32 + -4;
                  puVar30 = puVar30 + 1;
                  if (uVar2 == uVar21) {
                    in_stack_00000010 = &UNK_009f2f98;
                    goto LAB_005d5bec;
                  }
                }
                lVar32 = 0;
                if (lVar8 != lVar12) {
                  lVar32 = 0x18;
                }
                lVar35 = lVar8;
                lVar32 = lVar8 + lVar32;
              } while (lVar8 != lVar12);
            }
          } while( true );
        }
        while (uVar24 == 0) {
          lVar35 = *(long *)unaff_x20;
          unaff_x27 = unaff_x27 + -0x20;
          unaff_x20 = unaff_x20 + 2;
          uVar24 = CONCAT17(-(-1 < lVar35),
                            CONCAT16(-(-1 < (char)((ulong)lVar35 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar35 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar35 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar35 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar35 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar35 >> 8)),
                                                           -(-1 < (char)lVar35)))))))) &
                   0x8080808080808080;
        }
        uVar31 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar24 = uVar24 - 1 & uVar24;
        uVar31 = LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) & 0x78;
        unaff_x19 = unaff_x19 - 1;
      } while (*(uint *)((long)unaff_x27 + uVar31 * -2 + -0x10) != uVar29);
      pdVar22 = *(dword **)((long)unaff_x27 + uVar31 * -2 + -8);
LAB_005d51e8:
      if (uStack0000000000000130 != (dword *)0x0) {
        func_0x00187bd4(in_stack_00000138,(long)uStack0000000000000130 << 2,4);
        lVar8 = extraout_x1_05;
      }
      puVar13 = (undefined8 *)(in_stack_00000050 + 8);
      do {
        if (puVar13[-1] != 0) {
          func_0x00187bd4(*puVar13,puVar13[-1] << 2,4);
          lVar8 = extraout_x1_06;
        }
        puVar13 = puVar13 + 3;
        unaff_x28 = (long *)((long)unaff_x28 + -1);
      } while (unaff_x28 != (long *)0x0);
      if (uStack00000000000000b0 != 0) {
        func_0x00187bd4(in_stack_00000050,uStack00000000000000b0 * 0x18,8);
        lVar8 = extraout_x1_07;
      }
      pdVar23 = &MACH_HEADER.flags;
      if ((in_stack_00000038 != 0) && (lVar28 != 0)) {
        func_0x00187bd4(pdVar25,lVar28,8);
        lVar8 = extraout_x1_08;
      }
code_r0x005d527c:
      if (uVar29 < *(ulong *)(in_stack_00000048 + 0x10)) {
        lVar28 = *(long *)(in_stack_00000048 + 8);
        puVar13 = (undefined8 *)(lVar28 + uVar29 * 0x18);
        plVar19 = (long *)*puVar13;
        if (plVar19 == (long *)0x0) {
          lVar12 = *(long *)(in_stack_00000048 + 0x20);
          uVar24 = *(ulong *)(in_stack_00000048 + 0x28);
          do {
            uVar21 = uVar29;
            uVar31 = (ulong)*(uint *)(lVar28 + uVar21 * 0x18 + 0x14);
            if (uVar24 >> 0x20 == 0) {
              do {
                if (uVar24 <= uVar31) goto code_r0x005d5b34;
                lVar35 = lVar12 + uVar31 * 0x10;
                uVar31 = (ulong)*(uint *)(lVar35 + 4);
                uVar2 = *(uint *)(lVar35 + 8);
              } while (uVar2 == 0xffffffff);
              uVar20 = 0xffffffff;
            }
            else {
              uVar20 = (ulong)*(uint *)(lVar12 + 0xffffffff0);
              uVar2 = *(uint *)(lVar12 + 0xffffffffc);
            }
            uVar29 = (ulong)uVar2;
            if (uVar20 < uVar24) {
code_r0x005d5b34:
              func_0x007a2810(&UNK_008b5ff5,0x2b,auStack_7ffffffe + 0x80000236,&UNK_009f2e98,
                              &UNK_009f2f80);
              goto code_r0x005d5bf4;
            }
            while (uVar31 < uVar24) {
              lVar35 = lVar12 + uVar31 * 0x10;
              uVar31 = (ulong)*(uint *)(lVar35 + 4);
              if (*(int *)(lVar35 + 8) != -1) goto code_r0x005d5b34;
            }
            if (*(ulong *)(in_stack_00000048 + 0x10) <= uVar29) goto LAB_005d5ad4;
            puVar13 = (undefined8 *)(lVar28 + uVar29 * 0x18);
            plVar19 = (long *)*puVar13;
          } while (plVar19 == (long *)0x0);
          pdVar22 = *(dword **)(lVar28 + uVar21 * 0x18 + 8);
        }
        lVar8 = *plVar19;
        *plVar19 = lVar8 + 1;
        if (-1 < lVar8) {
          func_0x005c52e8(auStack_7ffffffe + 0x80000236,in_stack_00000048 + 0x98,*puVar13);
          pdVar25 = in_stack_00000240;
          if (in_stack_00000238 != (dword *)0x0) {
            plVar19 = *(long **)in_stack_00000240;
            uVar24 = *(ulong *)(in_stack_00000240 + 2);
            uVar31 = uVar24 & (ulong)in_stack_00000248;
            lVar8 = *(long *)((long)plVar19 + uVar31);
            uVar21 = CONCAT17(-(lVar8 < 0),
                              CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar8 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar8 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar8 >> 8) < '\0'),
                                                           -((char)lVar8 < '\0'))))))));
            if (uVar21 == 0) {
              lVar8 = 8;
              do {
                uVar31 = uVar31 + lVar8 & uVar24;
                lVar28 = *(long *)((long)plVar19 + uVar31);
                uVar21 = CONCAT17(-(lVar28 < 0),
                                  CONCAT16(-((char)((ulong)lVar28 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar28 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar28 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar28 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar28 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar28 >> 8) < '\0'),
                                                           -((char)lVar28 < '\0'))))))));
                lVar8 = lVar8 + 8;
              } while (uVar21 == 0);
            }
            uVar21 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
            uVar21 = (uVar21 & 0xcccccccccccccccc) >> 2 | (uVar21 & 0x3333333333333333) << 2;
            uVar21 = (uVar21 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar21 = (uVar21 & 0xff00ff00ff00ff00) >> 8 | (uVar21 & 0xff00ff00ff00ff) << 8;
            uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
            uVar21 = uVar31 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) & uVar24;
            uVar31 = (ulong)*(char *)((long)plVar19 + uVar21);
            if (-1 < *(char *)((long)plVar19 + uVar21)) {
              lVar8 = *plVar19;
              uVar31 = CONCAT17(-(lVar8 < 0),
                                CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar8 >> 0x18) <
                                                                     '\0'),CONCAT12(-((char)((ulong)
                                                  lVar8 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar8 >> 8) < '\0'),
                                                           -((char)lVar8 < '\0'))))))));
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar21 = (ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
              uVar31 = (ulong)*(byte *)((long)plVar19 + uVar21);
            }
            bVar15 = (byte)((ulong)in_stack_00000248 >> 0x38);
            *(byte *)((long)plVar19 + uVar21) = bVar15 >> 1;
            *(byte *)((long)plVar19 + (uVar21 - 8 & uVar24) + 8) = bVar15 >> 1;
            pdVar25 = (dword *)(plVar19 + uVar21 * -4);
            *(ulong *)(in_stack_00000240 + 4) = *(long *)(in_stack_00000240 + 4) - (uVar31 & 1);
            *(dword **)(pdVar25 + -8) = in_stack_00000238;
            (pdVar25 + -6)[0] = 0;
            (pdVar25 + -6)[1] = 0;
            (pdVar25 + -2)[0] = 0;
            (pdVar25 + -2)[1] = 0;
            *(long *)(in_stack_00000240 + 6) = *(long *)(in_stack_00000240 + 6) + 1;
          }
          in_stack_00000238 = pdVar25 + -6;
          pdVar14 = *(dword **)in_stack_00000238;
          in_stack_00000240 = pdVar22;
          if (pdVar14 != (dword *)0x0) {
            in_stack_00000248 = *(dword **)(pdVar25 + -4);
            do {
              uVar24 = (ulong)*(ushort *)((long)pdVar14 + 0x37a);
              lVar28 = uVar24 << 3;
              lVar8 = 1;
              do {
                lVar12 = lVar8;
                if (lVar28 == 0) goto LAB_005d5408;
                cVar1 = *(uint **)(pdVar14 + lVar12 * 2) < pdVar22;
                if (pdVar22 < *(uint **)(pdVar14 + lVar12 * 2)) {
                  cVar1 = -1;
                }
                lVar28 = lVar28 + -8;
                lVar8 = lVar12 + 1;
              } while (cVar1 == '\x01');
              uVar24 = lVar12 - 1;
              if (cVar1 == '\0') {
                in_stack_00000238 = (dword *)0x0;
                in_stack_00000240 = pdVar14;
                goto LAB_005d5440;
              }
LAB_005d5408:
              if (in_stack_00000248 == (dword *)0x0) goto LAB_005d5454;
              pdVar14 = *(dword **)(pdVar14 + uVar24 * 2 + 0xe0);
              in_stack_00000248 = (dword *)((long)in_stack_00000248 + -1);
            } while( true );
          }
          in_stack_00000248 = (dword *)0x0;
          goto LAB_005d5440;
        }
        func_0x007a05dc();
      }
      else {
LAB_005d5ad4:
        func_0x007a23bc(&UNK_009f2f68,lVar8);
      }
      goto code_r0x005d5bf4;
    }
    func_0x007a2570(0,0,&UNK_009f2f38);
    goto code_r0x005d5bf4;
  }
LAB_005d5ba4:
  func_0x007a1f00(uVar7,unaff_x24,&UNK_009f1b38);
code_r0x005d5bf4:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x5d5bf8);
  (*pcVar5)();
LAB_005d5bec:
  func_0x007a23bc(in_stack_00000010);
  goto code_r0x005d5bf4;
LAB_005d5454:
  in_stack_00000248 = pdVar14;
LAB_005d5440:
  uVar7 = func_0x005d240c(auStack_7ffffffe + 0x80000236);
  func_0x005becd0(uVar7,in_stack_00000220);
  lVar8 = extraout_x1_09;
LAB_005d4cd8:
  puVar13 = in_stack_000001d8;
  if (in_stack_000001d8 == in_stack_000001e8) {
code_r0x005d54b0:
    in_stack_000001d8 = puVar13;
    pdVar25 = (dword *)((long)&MACH_HEADER.magic + 1);
    func_0x005d81b8(&uStack00000000000001d0);
    in_stack_000000c8 = *(long **)(in_stack_00000048 + 0x98);
    lVar8 = *(long *)(in_stack_00000048 + 0xa0);
    in_stack_000000e8 = *(long *)(in_stack_00000048 + 0xb0);
    in_stack_000000e0 = (long)in_stack_000000c8 + lVar8 + 1;
    lVar28 = *in_stack_000000c8;
    in_stack_000000d8 = in_stack_000000c8 + 1;
    in_stack_000000b8 = lVar8 * 0x21 + 0x29;
    uStack00000000000000b0 = (ulong)(lVar8 != 0) << 3;
    in_stack_000000d0 =
         CONCAT17(-(-1 < lVar28),
                  CONCAT16(-(-1 < (char)((ulong)lVar28 >> 0x30)),
                           CONCAT15(-(-1 < (char)((ulong)lVar28 >> 0x28)),
                                    CONCAT14(-(-1 < (char)((ulong)lVar28 >> 0x20)),
                                             CONCAT13(-(-1 < (char)((ulong)lVar28 >> 0x18)),
                                                      CONCAT12(-(-1 < (char)((ulong)lVar28 >> 0x10))
                                                               ,CONCAT11(-(-1 < (char)((ulong)lVar28
                                                                                      >> 8)),
                                                                         -(-1 < (char)lVar28))))))))
         & 0x8080808080808080;
    in_stack_000000c0 = in_stack_000000c8 + lVar8 * -4 + -4;
    uVar7 = extraout_x1_10;
    goto joined_r0x005d5510;
  }
  puVar13 = in_stack_000001d8 + 6;
  in_stack_00000220 = (long *)*in_stack_000001d8;
  if (in_stack_00000220 == (long *)0x0) goto code_r0x005d54b0;
  in_stack_00000038 = in_stack_000001d8[2];
  unaff_x27 = (dword *)in_stack_000001d8[1];
  unaff_x19 = in_stack_000001d8[4];
  in_stack_00000190 = (undefined8 *)in_stack_000001d8[3];
  uStack0000000000000180 = unaff_x27;
  in_stack_00000188 = in_stack_00000038;
  in_stack_00000198 = unaff_x19;
  in_stack_000001d8 = puVar13;
  if (unaff_x23 != 0) {
    lVar28 = 0;
    bVar15 = (byte)((ulong)((long)(in_stack_00000220 + 1) * 0x517cc1b727220a95) >> 0x39);
    uVar31 = (long)(in_stack_00000220 + 1) * 0x517cc1b727220a95 & in_stack_00000028;
    uVar7 = *(undefined8 *)(in_stack_00000020 + uVar31);
    uVar24 = CONCAT17(-((byte)((ulong)uVar7 >> 0x38) == bVar15),
                      CONCAT16(-((byte)((ulong)uVar7 >> 0x30) == bVar15),
                               CONCAT15(-((byte)((ulong)uVar7 >> 0x28) == bVar15),
                                        CONCAT14(-((byte)((ulong)uVar7 >> 0x20) == bVar15),
                                                 CONCAT13(-((byte)((ulong)uVar7 >> 0x18) == bVar15),
                                                          CONCAT12(-((byte)((ulong)uVar7 >> 0x10) ==
                                                                    bVar15),CONCAT11(-((byte)((ulong
                                                  )uVar7 >> 8) == bVar15),-((byte)uVar7 == bVar15)))
                                                  ))))) & 0x8080808080808080;
    while( true ) {
      while (uVar24 == 0) {
        bVar36 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar7 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar7 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar7 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar7 >> 0x20) == -1
                                                                 ),CONCAT13(-((char)((ulong)uVar7 >>
                                                                                    0x18) == -1),
                                                                            CONCAT12(-((char)((ulong
                                                  )uVar7 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar7 >> 8) == -1),
                                                           -((char)uVar7 == -1)))))))),1);
        if ((bVar36 & 1) != 0) goto code_r0x005d4da0;
        lVar28 = lVar28 + 8;
        uVar31 = uVar31 + lVar28 & in_stack_00000028;
        uVar7 = *(undefined8 *)(in_stack_00000020 + uVar31);
        uVar24 = CONCAT17(-((byte)((ulong)uVar7 >> 0x38) == bVar15),
                          CONCAT16(-((byte)((ulong)uVar7 >> 0x30) == bVar15),
                                   CONCAT15(-((byte)((ulong)uVar7 >> 0x28) == bVar15),
                                            CONCAT14(-((byte)((ulong)uVar7 >> 0x20) == bVar15),
                                                     CONCAT13(-((byte)((ulong)uVar7 >> 0x18) ==
                                                               bVar15),CONCAT12(-((byte)((ulong)
                                                  uVar7 >> 0x10) == bVar15),
                                                  CONCAT11(-((byte)((ulong)uVar7 >> 8) == bVar15),
                                                           -((byte)uVar7 == bVar15)))))))) &
                 0x8080808080808080;
      }
      uVar21 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
      if (in_stack_00000220 ==
          *(long **)(in_stack_00000030 +
                    (uVar31 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) &
                    in_stack_00000028) * -8)) break;
      uVar24 = uVar24 - 1 & uVar24;
    }
    if ((in_stack_00000038 != 0) && (lVar8 = in_stack_00000038 * 0x11 + 0x19, lVar8 != 0)) {
      func_0x00187bd4(unaff_x27 + in_stack_00000038 * -4 + -4,lVar8,8);
      lVar8 = extraout_x1;
    }
    lVar28 = *in_stack_00000220;
    *in_stack_00000220 = lVar28 + -1;
    LORelease();
    if (lVar28 == 1) {
      in_xzr = *in_stack_00000220;
      func_0x005d2ac4(auStack_7ffffffe + 0x8000021e);
      lVar8 = extraout_x1_00;
    }
    goto LAB_005d4cd8;
  }
code_r0x005d4da0:
  if (unaff_x19 == 1) {
    lVar28 = *(long *)unaff_x27;
    uVar24 = CONCAT17(-(-1 < lVar28),
                      CONCAT16(-(-1 < (char)((ulong)lVar28 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar28 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar28 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar28 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar28 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar28 >> 8)),-(-1 < (char)lVar28)))))))) &
             0x8080808080808080;
    pdVar25 = unaff_x27;
    if (uVar24 == 0) {
      pdVar22 = unaff_x27;
      do {
        pdVar22 = pdVar22 + 2;
        lVar28 = *(long *)pdVar22;
        pdVar25 = pdVar25 + -0x20;
        uVar24 = CONCAT17(-(-1 < lVar28),
                          CONCAT16(-(-1 < (char)((ulong)lVar28 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar28 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar28 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar28 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar28
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar28 >> 8)),-(-1 < (char)lVar28)))))))) &
                 0x8080808080808080;
      } while (uVar24 == 0);
    }
    uVar24 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
    uVar24 = LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) & 0x78;
    uVar29 = (ulong)*(uint *)((long)pdVar25 + uVar24 * -2 + -0x10);
    pdVar22 = *(dword **)((long)pdVar25 + uVar24 * -2 + -8);
    if (in_stack_00000038 != 0) {
      lVar28 = in_stack_00000038 * 0x11 + 0x19;
      lVar8 = 0;
      if (lVar28 != 0) {
        func_0x00187bd4(unaff_x27 + in_stack_00000038 * -4 + -4,lVar28,8);
        lVar8 = extraout_x1_01;
      }
    }
    goto code_r0x005d527c;
  }
  lVar8 = *(long *)unaff_x27;
  unaff_x20 = unaff_x27 + 2;
  in_stack_00000240 =
       (dword *)(CONCAT17(-(-1 < lVar8),
                          CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar8 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar8 >>
                                                                                    0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar8 >> 8)),-(-1 < (char)lVar8)))))))) &
                0x8080808080808080);
  func_0x0059f9d4(&uStack00000000000000b0,auStack_7ffffffe + 0x80000236,&UNK_009f2e80);
  unaff_x28 = in_stack_000000c0;
  if (in_stack_000000c0 == (long *)0x0) {
    func_0x007a23bc(&UNK_009f2f20);
    goto code_r0x005d5bf4;
  }
  uVar7 = 0;
  in_stack_00000050 = in_stack_000000b8;
  pdVar25 = *(dword **)(in_stack_000000b8 + 0x10);
  unaff_x24 = (long)pdVar25 * 4;
  if (((ulong)pdVar25 >> 0x3e != 0) || (0x7ffffffffffffffc < unaff_x24)) goto LAB_005d5ba4;
  unaff_x25 = *(undefined8 *)(in_stack_000000b8 + 8);
  in_stack_00000238 = unaff_x27;
  in_stack_00000248 = unaff_x20;
  if (unaff_x24 != 0) goto code_r0x005d4eac;
  unaff_x22 = (dword *)0x0;
  unaff_x26 = &MACH_HEADER.cputype;
  goto LAB_005d4f48;
joined_r0x005d5510:
  if (in_stack_000000e8 == 0) {
code_r0x005d59b0:
    func_0x005ad898(&uStack00000000000000b0);
    if ((in_stack_00000068 != 0) && (lVar8 = in_stack_00000068 * 9 + 0x11, lVar8 != 0)) {
      func_0x00187bd4(in_stack_00000060 + in_stack_00000068 * -8 + -8,lVar8,8);
    }
    lVar8 = *(long *)(in_stack_00000048 + 0x80);
    if (lVar8 != 0) {
      lVar28 = *(long *)(in_stack_00000048 + 0x90);
      if (lVar28 != 0) {
        plVar19 = *(long **)(in_stack_00000048 + 0x78);
        plVar27 = plVar19 + 1;
        lVar12 = *plVar19;
        uVar24 = CONCAT17(-(-1 < lVar12),
                          CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar12 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar12
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar12 >> 8)),-(-1 < (char)lVar12)))))))) &
                 0x8080808080808080;
        do {
          while (uVar24 == 0) {
            lVar12 = *plVar27;
            plVar19 = plVar19 + -0x10;
            plVar27 = plVar27 + 1;
            uVar24 = CONCAT17(-(-1 < lVar12),
                              CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar12 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar12 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar12 >> 8)),
                                                           -(-1 < (char)lVar12)))))))) &
                     0x8080808080808080;
          }
          uVar29 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar29 = (uVar29 & 0xffff0000ffff0000) >> 0x10 | (uVar29 & 0xffff0000ffff) << 0x10;
          plVar11 = *(long **)((long)plVar19 +
                              (LZCOUNT(uVar29 >> 0x20 | uVar29 << 0x20) & 0x78U) * -2 + -0x10);
          lVar12 = *plVar11;
          *plVar11 = lVar12 + -1;
          LORelease();
          if (lVar12 == 1) {
            func_0x005d2c74();
          }
          uVar24 = uVar24 - 1 & uVar24;
          lVar28 = lVar28 + -1;
        } while (lVar28 != 0);
      }
      lVar28 = lVar8 * 0x11 + 0x19;
      if (lVar28 != 0) {
        func_0x00187bd4(*(long *)(in_stack_00000048 + 0x78) + lVar8 * -0x10 + -0x10,lVar28,8);
      }
    }
    func_0x005d3ef4(in_stack_00000048);
    return;
  }
  if (in_stack_000000d0 == 0) {
    plVar19 = in_stack_000000d8;
    do {
      in_stack_000000d8 = plVar19 + 1;
      lVar8 = *plVar19;
      in_stack_000000c8 = in_stack_000000c8 + -0x20;
      in_stack_000000d0 =
           CONCAT17(-(-1 < lVar8),
                    CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                             CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                      CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)),
                                               CONCAT13(-(-1 < (char)((ulong)lVar8 >> 0x18)),
                                                        CONCAT12(-(-1 < (char)((ulong)lVar8 >> 0x10)
                                                                  ),CONCAT11(-(-1 < (char)((ulong)
                                                  lVar8 >> 8)),-(-1 < (char)lVar8)))))))) &
           0x8080808080808080;
      plVar19 = in_stack_000000d8;
    } while (in_stack_000000d0 == 0);
  }
  uVar24 = (in_stack_000000d0 & 0xaaaaaaaaaaaaaaaa) >> 1 |
           (in_stack_000000d0 & 0x5555555555555555) << 1;
  uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
  uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
  uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
  in_stack_000000d0 = in_stack_000000d0 - 1 & in_stack_000000d0;
  uVar24 = LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) & 0x78;
  in_stack_000000e8 = in_stack_000000e8 + -1;
  plVar19 = *(long **)((long)in_stack_000000c8 + uVar24 * -4 + -0x20);
  in_stack_00000100 = *(undefined8 *)((long)in_stack_000000c8 + uVar24 * -4 + -8);
  in_stack_000000f8 = *(ulong *)((long)in_stack_000000c8 + uVar24 * -4 + -0x10);
  in_stack_000000f0 = *(dword **)((long)in_stack_000000c8 + uVar24 * -4 + -0x18);
  if (plVar19 == (long *)0x0) goto code_r0x005d59b0;
  plVar27 = plVar19 + 1;
  uStack0000000000000108 = plVar19;
  in_stack_00000110 = in_stack_000000f0;
  in_stack_00000118 = in_stack_000000f8;
  in_stack_00000120 = in_stack_00000100;
  if ((char)*plVar27 == '\0') {
    *(char *)plVar27 = '\x01';
  }
  else {
    func_0x007aff64(plVar27,uVar7,1000000000);
  }
  if (in_stack_00000110 == (dword *)0x0) {
    in_stack_00000170 = 0;
  }
  else {
    in_stack_00000170 = in_stack_00000120;
    pdVar25 = in_stack_00000110;
    pdVar23 = in_stack_00000110;
    uVar29 = in_stack_00000118;
  }
  uStack0000000000000130 = (dword *)(ulong)(in_stack_00000110 != (dword *)0x0);
  in_stack_00000138 = (dword *)0x0;
  in_stack_00000158 = 0;
  in_stack_00000140 = pdVar25;
  in_stack_00000148 = uVar29;
  in_stack_00000150 = uStack0000000000000130;
  in_stack_00000160 = pdVar23;
  in_stack_00000168 = uVar29;
code_r0x005d5610:
  func_0x005c5b7c(&uStack0000000000000180,&uStack0000000000000130);
  uVar4 = in_stack_000001c8;
  uVar7 = in_stack_000001c0;
  lVar8 = in_stack_000001b8;
  uVar31 = in_stack_000001a8;
  puVar3 = in_stack_000001a0;
  uVar24 = in_stack_00000198;
  puVar13 = in_stack_00000190;
  pdVar22 = uStack0000000000000180;
  if (in_stack_00000188 != -0x8000000000000000) {
    in_stack_000001d8 = in_stack_00000190;
    uStack00000000000001d0 = in_stack_00000188;
    in_stack_000001e8 = in_stack_000001a0;
    in_stack_000001e0 = in_stack_00000198;
    if ((uint *)plVar19[4] <= uStack0000000000000180) {
      func_0x007a2570(uStack0000000000000180,(uint *)plVar19[4],&UNK_009f2ef0);
      goto code_r0x005d5bf4;
    }
    lVar28 = plVar19[3] + (long)uStack0000000000000180 * 0x108;
    if (*(long *)(lVar28 + 0x18) == 0xf) {
      lVar12 = *(long *)(lVar28 + 0x30);
      if (lVar12 == 0) {
code_r0x005d578c:
        func_0x005bf7bc(&uStack00000000000001d0,lVar28 + 0x20);
        *(undefined1 *)(lVar28 + 0x50) = 1;
        goto code_r0x005d57b4;
      }
      plVar11 = *(long **)(lVar28 + 0x28);
      if (in_stack_000001b8 != 0) {
        plVar33 = plVar11;
code_r0x005d5754:
        plVar34 = plVar33 + 3;
        if (*plVar33 == -0x8000000000000000) {
          lVar32 = plVar33[1];
          uVar21 = func_0x005787f4(uVar7,uVar4,lVar32);
          lVar35 = 0;
          uVar20 = uVar21 >> 0x39;
          while( true ) {
            uVar21 = uVar21 & uVar31;
            uVar16 = *(ulong *)((long)puVar3 + uVar21);
            uVar17 = uVar16 ^ uVar20 * 0x101010101010101;
            for (uVar17 = uVar17 + 0xfefefefefefefeff & (uVar17 ^ 0xffffffffffffffff) &
                          0x8080808080808080; uVar17 != 0; uVar17 = uVar17 - 1 & uVar17) {
              uVar9 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                      (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
              uVar9 = puVar3[-1 - (uVar21 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) &
                                  uVar31)];
              if (uVar24 <= uVar9) {
                func_0x007a2570(uVar9,uVar24,&UNK_009f2240);
                goto code_r0x005d5bf4;
              }
              if (lVar32 == puVar13[uVar9 * 2]) {
                plVar33 = plVar34;
                if (plVar34 == plVar11 + lVar12 * 3) goto code_r0x005d578c;
                goto code_r0x005d5754;
              }
            }
            if ((uVar16 & uVar16 << 1 & 0x8080808080808080) != 0) break;
            lVar35 = lVar35 + 8;
            uVar21 = lVar35 + uVar21;
          }
        }
        goto code_r0x005d57b4;
      }
      if (*plVar11 != -0x8000000000000000) goto code_r0x005d57b4;
    }
    else {
code_r0x005d57b4:
      if (lVar8 != 0) {
        if (uVar31 != 0) {
          lVar8 = uVar31 * 8 + 8;
          func_0x00187bd4((long)in_stack_000001e8 - lVar8,uVar31 + lVar8 + 9,8);
        }
        func_0x005a30cc(auStack_7ffffffe + 0x8000021e,auStack_7ffffffe + 0x80000236,&UNK_009f2e80);
        puVar30 = (uint *)plVar19[4];
        if (puVar30 < pdVar22) {
          func_0x007a204c(pdVar22,puVar30,&UNK_009f2f08);
          goto code_r0x005d5bf4;
        }
        if (puVar30 == (uint *)plVar19[2]) {
          func_0x005bd0a4(plVar19 + 2,&UNK_009f2f08);
        }
        lVar8 = plVar19[3] + (long)pdVar22 * 0x108;
        if (pdVar22 <= puVar30 && (long)puVar30 - (long)pdVar22 != 0) {
          _memmove(lVar8 + 0x108,lVar8,((long)puVar30 - (long)pdVar22) * 0x108);
        }
        _memcpy(lVar8,auStack_7ffffffe + 0x80000236,0x108);
        plVar19[4] = (long)puVar30 + 1;
        goto code_r0x005d5610;
      }
    }
    if (uVar31 != 0) {
      lVar8 = uVar31 * 8 + 8;
      func_0x00187bd4((long)in_stack_000001e8 - lVar8,uVar31 + lVar8 + 9,8);
    }
    if (in_stack_000001e0 != 0) {
      lVar8 = 1 - in_stack_000001e0;
      puVar13 = in_stack_000001d8;
      do {
        lVar28 = *(long *)*puVar13;
        *(long *)*puVar13 = lVar28 + -1;
        LORelease();
        if (lVar28 == 1) {
          in_xzr = *(long *)*puVar13;
          func_0x005d2ac4(puVar13);
        }
        puVar13 = puVar13 + 2;
        lVar8 = lVar8 + 1;
      } while (lVar8 != 1);
    }
    if (uStack00000000000001d0 != 0) {
      func_0x00187bd4(in_stack_000001d8,uStack00000000000001d0 << 4,8);
    }
    goto code_r0x005d5610;
  }
  func_0x005c7d60(&uStack0000000000000130);
  if ((char)*plVar27 == '\x01') {
    *(char *)plVar27 = (char)in_xzr;
    uVar7 = extraout_x1_11;
  }
  else {
    func_0x007b05dc(plVar27,0);
    uVar7 = extraout_x1_13;
  }
  lVar8 = *uStack0000000000000108;
  *uStack0000000000000108 = lVar8 + -1;
  LORelease();
  if (lVar8 == 1) {
    in_xzr = *uStack0000000000000108;
    func_0x005d2c74(&uStack0000000000000108);
    uVar7 = extraout_x1_12;
  }
  goto joined_r0x005d5510;
code_r0x005d4eac:
  unaff_x26 = (dword *)func_0x00187bd0(unaff_x24,4);
  unaff_x22 = pdVar25;
  goto code_r0x005d4ec8;
}

