
uint FUN_005d4794(long param_1)

{
  undefined4 *puVar1;
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  long *plVar8;
  dword *pdVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long *plVar13;
  long in_x9;
  long lVar14;
  long lVar15;
  ulong in_x10;
  ulong uVar16;
  ulong unaff_x19;
  undefined4 uVar17;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined4 uVar18;
  int iVar19;
  dword *pdVar21;
  dword *pdVar20;
  long unaff_x25;
  ulong uVar22;
  ulong unaff_x26;
  dword *pdVar23;
  ulong unaff_x28;
  undefined8 in_xzr;
  byte bVar24;
  char cVar26;
  char cVar27;
  char cVar28;
  char cVar29;
  char cVar30;
  char cVar31;
  undefined8 uVar25;
  char cVar32;
  undefined8 unaff_d8;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  char *in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  undefined1 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  dword *in_stack_00000088;
  ulong in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000b8;
  long in_stack_000000d8;
  long in_stack_000000e0;
  
code_r0x005d4794:
  uVar18 = *(undefined4 *)(in_x9 + 0x10);
  param_1 = param_1 + (unaff_x26 & 0xffffffff) * (in_x10 & 0xffffffff);
  uVar17 = *(undefined4 *)(param_1 + 0x14);
  *(int *)(in_x9 + 0x10) = (int)unaff_x25;
  *(int *)(param_1 + 0x14) = (int)unaff_x25;
  if (unaff_x25 != *(long *)(unaff_x21 + 0x18)) goto LAB_005d4380;
code_r0x005d47b4:
  func_0x005bd21c(unaff_x21 + 0x18,&UNK_009f25e0);
LAB_005d4380:
  puVar1 = (undefined4 *)(*(long *)(unaff_x21 + 0x20) + unaff_x25 * 0x10);
  *puVar1 = uVar18;
  puVar1[1] = uVar17;
  *(ulong *)(puVar1 + 2) = unaff_x28 | unaff_x26 << 0x20;
  *(long *)(unaff_x21 + 0x28) = unaff_x25 + 1;
code_r0x005d43a0:
  lVar5 = unaff_x23;
  unaff_x23 = lVar5 + 0x108;
  unaff_x22 = unaff_x22 + 1;
  if (unaff_x23 == in_stack_00000060) {
    if (*in_stack_00000050 == '\x01') {
      *in_stack_00000050 = (char)in_xzr;
    }
    else {
      func_0x007b05dc(in_stack_00000050,0);
    }
    lVar5 = *uStack0000000000000078;
    *uStack0000000000000078 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      func_0x005d2c74(&uStack0000000000000078);
    }
    return in_stack_00000070._4_4_;
  }
  lVar10 = *(long *)(lVar5 + 0x120);
  if (lVar10 == 0x17 || lVar10 == 0x1a) {
code_r0x005d4424:
    if (lVar10 < 0x14) goto code_r0x005d4704;
code_r0x005d442c:
    if (lVar10 == 0x14) goto code_r0x005d4714;
    if (lVar10 == 0x17) {
      plVar13 = *(long **)(lVar5 + 0x1f0);
      goto code_r0x005d471c;
    }
    if (lVar10 == 0x1a) goto code_r0x005d4444;
    goto code_r0x005d43a0;
  }
  uVar11 = lVar10 - 0xc;
  if (0x14 < uVar11) {
    uVar11 = 9;
  }
  if ((long)uVar11 < 0xb) {
    if (3 < (long)uVar11) {
      if (uVar11 - 4 < 5) {
code_r0x005d441c:
        uStack0000000000000080 = 0;
        lVar10 = *(long *)(lVar5 + 0x120);
        goto code_r0x005d4424;
      }
      if (uVar11 != 9) {
        if (*(long *)(lVar5 + 0x1a8) != -0x8000000000000000) {
          lVar10 = 0;
          goto code_r0x005d4a0c;
        }
        pdVar9 = (dword *)func_0x00187bd0(8,8);
        if (pdVar9 == (dword *)0x0) goto code_r0x005d4b3c;
        *(long *)pdVar9 = lVar5 + 0x1b0;
        lVar10 = 1;
        uVar22 = 1;
        goto code_r0x005d453c;
      }
      func_0x005da864(&uStack0000000000000080,unaff_x23);
code_r0x005d4530:
      uVar22 = in_stack_00000090;
      lVar10 = uStack0000000000000080;
      pdVar9 = in_stack_00000088;
code_r0x005d453c:
      if (uVar22 != 0) {
        pdVar23 = pdVar9 + uVar22 * 2;
        goto code_r0x005d4544;
      }
      goto code_r0x005d46e4;
    }
    if (2 < uVar11) {
      in_stack_000000d8 = *(long *)(lVar5 + 0x130);
      in_stack_000000e0 = in_stack_000000d8 + *(long *)(lVar5 + 0x138) * 0x18;
      uStack0000000000000098 = 0;
      in_stack_000000b8 = 0;
      func_0x005a11d0(&uStack0000000000000080,&uStack0000000000000098,&UNK_009f3020);
      goto code_r0x005d4530;
    }
  }
  else {
    if (0xd < (long)uVar11) {
      if (uVar11 - 0xf < 6) goto code_r0x005d441c;
      lVar10 = *(long *)(lVar5 + 0x138);
      if (lVar10 == 0) {
code_r0x005d4a0c:
        uVar22 = 0;
        pdVar9 = &MACH_HEADER.cpusubtype;
        goto code_r0x005d453c;
      }
      lVar4 = *(long *)(lVar5 + 0x130);
      pdVar9 = (dword *)func_0x00187bd0(lVar10 << 3,8);
      if (pdVar9 == (dword *)0x0) {
        func_0x007a1f00(8,lVar10 << 3,&UNK_009f30a0);
        goto code_r0x005d4b7c;
      }
      uVar11 = lVar10 - 1U & 0x1fffffffffffffff;
      if (uVar11 < 7) {
        uVar22 = 0;
        lVar15 = lVar4;
      }
      else {
        uVar11 = uVar11 + 1;
        uVar22 = uVar11 & 0x3ffffffffffffff8;
        lVar15 = lVar4 + uVar22 * 8;
        plVar13 = (long *)(pdVar9 + 8);
        uVar16 = uVar22;
        lVar14 = lVar4;
        do {
          plVar13[-3] = lVar14 + in_stack_00000048;
          plVar13[-4] = lVar14 + in_stack_00000040;
          plVar13[-1] = lVar14 + in_stack_00000038;
          plVar13[-2] = lVar14 + in_stack_00000030;
          plVar13[1] = lVar14 + in_stack_00000028;
          *plVar13 = lVar14 + in_stack_00000020;
          plVar13[3] = lVar14 + in_stack_00000018;
          plVar13[2] = lVar14 + in_stack_00000010;
          lVar14 = lVar14 + 0x40;
          uVar16 = uVar16 - 8;
          plVar13 = plVar13 + 8;
        } while (uVar16 != 0);
        if (uVar11 == uVar22) goto code_r0x005d453c;
      }
      do {
        *(long *)(pdVar9 + uVar22 * 2) = lVar15;
        lVar15 = lVar15 + 8;
        uVar22 = uVar22 + 1;
      } while (lVar15 != lVar4 + lVar10 * 8);
      goto code_r0x005d453c;
    }
    if (uVar11 != 0xb) {
      if (uVar11 == 0xc) {
        in_stack_000000d8 = *(long *)(lVar5 + 0x130);
        in_stack_000000e0 = in_stack_000000d8 + *(long *)(lVar5 + 0x138) * 0x18;
        uStack0000000000000098 = 0;
        in_stack_000000b8 = 0;
        func_0x005a11d0(&uStack0000000000000080,&uStack0000000000000098,&UNK_009f3020);
      }
      else {
        in_stack_000000d8 = *(long *)(lVar5 + 0x1b0);
        in_stack_000000e0 = in_stack_000000d8 + *(long *)(lVar5 + 0x1b8) * 0x18;
        uStack0000000000000098 = 0;
        in_stack_000000b8 = 0;
        func_0x005a11d0(&uStack0000000000000080,&uStack0000000000000098,&UNK_009f30a0);
      }
      goto code_r0x005d4530;
    }
    pdVar9 = (dword *)func_0x00187bd0(8,8);
    if (pdVar9 == (dword *)0x0) {
code_r0x005d4b3c:
      func_0x007a1f18(8,8);
      goto code_r0x005d4b7c;
    }
    pdVar23 = pdVar9 + 2;
    *(long *)pdVar9 = lVar5 + 0x1e8;
    lVar10 = 1;
code_r0x005d4544:
    pdVar20 = pdVar9;
    do {
      pdVar21 = pdVar20 + 2;
      puVar12 = *(undefined8 **)pdVar20;
      plVar13 = (long *)*puVar12;
      lVar4 = *plVar13;
      *plVar13 = lVar4 + 1;
      if (lVar4 < 0) {
        func_0x007a05dc();
        goto code_r0x005d4b7c;
      }
      func_0x005bf1b8(&uStack0000000000000098,unaff_x21 + 0x30,*puVar12);
      plVar8 = (long *)func_0x005bf3ec(&uStack0000000000000098);
      lVar4 = 0;
      plVar13 = (long *)*plVar8;
      uVar22 = plVar8[1];
      uVar11 = unaff_x19;
      while( true ) {
        uVar11 = uVar11 & uVar22;
        uVar25 = *(undefined8 *)((long)plVar13 + uVar11);
        cVar26 = (char)((ulong)uVar25 >> 8);
        cVar27 = (char)((ulong)uVar25 >> 0x10);
        cVar28 = (char)((ulong)uVar25 >> 0x18);
        cVar29 = (char)((ulong)uVar25 >> 0x20);
        cVar30 = (char)((ulong)uVar25 >> 0x28);
        cVar31 = (char)((ulong)uVar25 >> 0x30);
        cVar32 = (char)((ulong)uVar25 >> 0x38);
        for (uVar16 = CONCAT17(-(cVar32 == (char)((ulong)unaff_d8 >> 0x38)),
                               CONCAT16(-(cVar31 == (char)((ulong)unaff_d8 >> 0x30)),
                                        CONCAT15(-(cVar30 == (char)((ulong)unaff_d8 >> 0x28)),
                                                 CONCAT14(-(cVar29 ==
                                                           (char)((ulong)unaff_d8 >> 0x20)),
                                                          CONCAT13(-(cVar28 ==
                                                                    (char)((ulong)unaff_d8 >> 0x18))
                                                                   ,CONCAT12(-(cVar27 ==
                                                                              (char)((ulong)unaff_d8
                                                                                    >> 0x10)),
                                                                             CONCAT11(-(cVar26 ==
                                                                                       (char)((ulong
                                                  )unaff_d8 >> 8)),-((char)uVar25 == (char)unaff_d8)
                                                  ))))))) & 0x8080808080808080; uVar16 != 0;
            uVar16 = uVar16 - 1 & uVar16) {
          uVar2 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          if (*(uint *)(plVar13 +
                       (uVar11 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3) & uVar22) * -2
                       + -2) == in_stack_00000070._4_4_) goto code_r0x005d462c;
        }
        bVar24 = NEON_umaxv(CONCAT17(-(cVar32 == -1),
                                     CONCAT16(-(cVar31 == -1),
                                              CONCAT15(-(cVar30 == -1),
                                                       CONCAT14(-(cVar29 == -1),
                                                                CONCAT13(-(cVar28 == -1),
                                                                         CONCAT12(-(cVar27 == -1),
                                                                                  CONCAT11(-(cVar26 
                                                  == -1),-((char)uVar25 == -1)))))))),1);
        if ((bVar24 & 1) != 0) break;
        lVar4 = lVar4 + 8;
        uVar11 = uVar11 + lVar4;
      }
      if (plVar8[2] == 0) {
        func_0x007adc58(plVar8,1,plVar8 + 4,1);
        plVar13 = (long *)*plVar8;
        uVar22 = plVar8[1];
        uVar11 = uVar22 & unaff_x19;
        lVar4 = *(long *)((long)plVar13 + uVar11);
        uVar16 = CONCAT17(-(lVar4 < 0),
                          CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0')
                                                              ,CONCAT12(-((char)((ulong)lVar4 >>
                                                                                0x10) < '\0'),
                                                                        CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
      }
      else {
        uVar11 = uVar22 & unaff_x19;
        lVar4 = *(long *)((long)plVar13 + uVar11);
        uVar16 = CONCAT17(-(lVar4 < 0),
                          CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0')
                                                              ,CONCAT12(-((char)((ulong)lVar4 >>
                                                                                0x10) < '\0'),
                                                                        CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
      }
      if (uVar16 == 0) {
        lVar4 = 8;
        do {
          uVar11 = uVar11 + lVar4 & uVar22;
          lVar14 = *(long *)((long)plVar13 + uVar11);
          uVar16 = CONCAT17(-(lVar14 < 0),
                            CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
          lVar4 = lVar4 + 8;
        } while (uVar16 == 0);
      }
      uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
      uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
      uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
      uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
      uVar11 = uVar11 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) & uVar22;
      uVar16 = (ulong)*(char *)((long)plVar13 + uVar11);
      if (-1 < *(char *)((long)plVar13 + uVar11)) {
        lVar4 = *plVar13;
        uVar11 = CONCAT17(-(lVar4 < 0),
                          CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0')
                                                              ,CONCAT12(-((char)((ulong)lVar4 >>
                                                                                0x10) < '\0'),
                                                                        CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
        uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
        uVar16 = (ulong)*(byte *)((long)plVar13 + uVar11);
      }
      *(undefined1 *)((long)plVar13 + uVar11) = in_stack_00000068;
      *(undefined1 *)((long)plVar13 + (uVar11 - 8 & uVar22) + 8) = in_stack_00000068;
      plVar8[2] = plVar8[2] - (uVar16 & 1);
      *(uint *)(plVar13 + uVar11 * -2 + -2) = in_stack_00000070._4_4_;
      plVar13[uVar11 * -2 + -1] = unaff_x22;
      plVar8[3] = plVar8[3] + 1;
code_r0x005d462c:
      pdVar20 = pdVar21;
    } while (pdVar21 != pdVar23);
code_r0x005d46e4:
    if (lVar10 != 0) {
      func_0x00187bd4(pdVar9,lVar10 << 3,8);
    }
  }
  lVar10 = *(long *)(lVar5 + 0x120);
  if (0x13 < lVar10) goto code_r0x005d442c;
code_r0x005d4704:
  if (lVar10 == 0x10) {
    uVar7 = func_0x005c4434();
    lVar10 = *(long *)(unaff_x21 + 0x28);
    iVar19 = (int)lVar10;
    if (iVar19 == -1) goto code_r0x005d4af0;
    uVar22 = (ulong)uVar7;
    uVar11 = uVar22;
    if (uVar22 <= in_stack_00000058) {
      uVar11 = in_stack_00000058;
    }
    if (*(ulong *)(unaff_x21 + 0x10) <= uVar11) goto code_r0x005d4b4c;
    lVar4 = *(long *)(unaff_x21 + 8);
    if (in_stack_00000070._4_4_ == uVar7) {
      lVar4 = lVar4 + uVar22 * 0x18;
      uVar18 = *(undefined4 *)(lVar4 + 0x10);
      uVar17 = *(undefined4 *)(lVar4 + 0x14);
      *(int *)(lVar4 + 0x10) = iVar19;
      *(int *)(lVar4 + 0x14) = iVar19;
      lVar4 = *(long *)(unaff_x21 + 0x18);
    }
    else {
      lVar14 = lVar4 + (in_stack_00000058 & 0xffffffff) * 0x18;
      uVar18 = *(undefined4 *)(lVar14 + 0x10);
      lVar4 = lVar4 + uVar22 * 0x18;
      uVar17 = *(undefined4 *)(lVar4 + 0x14);
      *(int *)(lVar14 + 0x10) = iVar19;
      *(int *)(lVar4 + 0x14) = iVar19;
      lVar4 = *(long *)(unaff_x21 + 0x18);
    }
    if (lVar10 == lVar4) {
      func_0x005bd21c(unaff_x21 + 0x18,&UNK_009f25e0);
    }
    puVar1 = (undefined4 *)(*(long *)(unaff_x21 + 0x20) + lVar10 * 0x10);
    *puVar1 = uVar18;
    puVar1[1] = uVar17;
    *(ulong *)(puVar1 + 2) = in_stack_00000058 | (ulong)uVar7 << 0x20;
    *(long *)(unaff_x21 + 0x28) = lVar10 + 1;
    lVar10 = **(long **)(lVar5 + 0x168);
    **(long **)(lVar5 + 0x168) = lVar10 + 1;
    if (lVar10 < 0) goto code_r0x005d4b0c;
    uVar6 = func_0x005d4284();
    lVar10 = *(long *)(unaff_x21 + 0x28);
    iVar19 = (int)lVar10;
    if (iVar19 == -1) goto code_r0x005d4af0;
    uVar16 = (ulong)uVar6;
    uVar11 = uVar16;
    if (uVar16 <= uVar22) {
      uVar11 = uVar22;
    }
    if (*(ulong *)(unaff_x21 + 0x10) <= uVar11) goto code_r0x005d4b4c;
    lVar4 = *(long *)(unaff_x21 + 8);
    if (uVar7 == uVar6) {
      lVar4 = lVar4 + uVar16 * 0x18;
      uVar18 = *(undefined4 *)(lVar4 + 0x10);
      uVar17 = *(undefined4 *)(lVar4 + 0x14);
      *(int *)(lVar4 + 0x10) = iVar19;
      *(int *)(lVar4 + 0x14) = iVar19;
      lVar4 = *(long *)(unaff_x21 + 0x18);
    }
    else {
      lVar14 = lVar4 + uVar22 * 0x18;
      uVar18 = *(undefined4 *)(lVar14 + 0x10);
      lVar4 = lVar4 + uVar16 * 0x18;
      uVar17 = *(undefined4 *)(lVar4 + 0x14);
      *(int *)(lVar14 + 0x10) = iVar19;
      *(int *)(lVar4 + 0x14) = iVar19;
      lVar4 = *(long *)(unaff_x21 + 0x18);
    }
    if (lVar10 == lVar4) {
      func_0x005bd21c(unaff_x21 + 0x18,&UNK_009f25e0);
    }
    puVar1 = (undefined4 *)(*(long *)(unaff_x21 + 0x20) + lVar10 * 0x10);
    *puVar1 = uVar18;
    puVar1[1] = uVar17;
    *(ulong *)(puVar1 + 2) = CONCAT44(uVar6,uVar7);
    *(long *)(unaff_x21 + 0x28) = lVar10 + 1;
    lVar10 = **(long **)(lVar5 + 0x170);
    **(long **)(lVar5 + 0x170) = lVar10 + 1;
    if (lVar10 < 0) goto code_r0x005d4b0c;
    uVar6 = func_0x005d4284();
    goto code_r0x005d4738;
  }
  if (lVar10 == 0x13) {
code_r0x005d4714:
    plVar13 = *(long **)(lVar5 + 0x168);
    goto code_r0x005d471c;
  }
  goto code_r0x005d43a0;
code_r0x005d4444:
  plVar13 = *(long **)(lVar5 + 0x158);
code_r0x005d471c:
  lVar5 = *plVar13;
  *plVar13 = lVar5 + 1;
  if (lVar5 < 0) {
code_r0x005d4b0c:
    func_0x007a05dc();
  }
  else {
    uVar6 = func_0x005d4284();
    uVar7 = in_stack_00000070._4_4_;
code_r0x005d4738:
    unaff_x25 = *(long *)(unaff_x21 + 0x28);
    iVar19 = (int)unaff_x25;
    if (iVar19 == -1) {
code_r0x005d4af0:
      func_0x007a247c(&UNK_008b5451,0x58,&UNK_009f25c8);
    }
    else {
      unaff_x26 = (ulong)uVar6;
      unaff_x28 = (ulong)uVar7;
      uVar11 = unaff_x26;
      if (unaff_x26 <= unaff_x28) {
        uVar11 = unaff_x28;
      }
      if (uVar11 < *(ulong *)(unaff_x21 + 0x10)) {
        param_1 = *(long *)(unaff_x21 + 8);
        if (uVar7 != uVar6) {
          in_x10 = 0x18;
          in_x9 = param_1 + unaff_x28 * 0x18;
          goto code_r0x005d4794;
        }
        param_1 = param_1 + unaff_x26 * 0x18;
        uVar18 = *(undefined4 *)(param_1 + 0x10);
        uVar17 = *(undefined4 *)(param_1 + 0x14);
        *(int *)(param_1 + 0x10) = iVar19;
        *(int *)(param_1 + 0x14) = iVar19;
        if (unaff_x25 == *(long *)(unaff_x21 + 0x18)) goto code_r0x005d47b4;
        goto LAB_005d4380;
      }
code_r0x005d4b4c:
      func_0x007a11c0(&UNK_008b54a9,0x2b,&UNK_009f25f8);
    }
  }
code_r0x005d4b7c:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5d4b80);
  (*pcVar3)();
}

