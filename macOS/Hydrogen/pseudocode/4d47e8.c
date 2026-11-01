
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004d47e8(long *param_1,undefined1 param_2 [16])

{
  ulong uVar1;
  undefined8 *puVar2;
  uint uVar3;
  undefined1 *puVar4;
  bool bVar5;
  bool bVar6;
  code *pcVar7;
  bool bVar8;
  long *plVar9;
  undefined8 *puVar10;
  long *plVar11;
  undefined *puVar12;
  long *plVar13;
  long lVar14;
  long lVar15;
  ulong in_x9;
  ulong uVar16;
  ulong in_x10;
  ulong uVar17;
  ulong in_x11;
  ulong uVar18;
  ulong uVar19;
  ulong unaff_x19;
  long unaff_x20;
  byte bVar20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined8 *puVar21;
  ulong unaff_x24;
  long *plVar22;
  ulong unaff_x26;
  long unaff_x27;
  long *plVar23;
  ulong unaff_x28;
  long unaff_x29;
  byte bVar24;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  undefined8 uVar25;
  byte bVar33;
  long lVar26;
  long lVar27;
  undefined1 auVar34 [16];
  undefined8 in_stack_00000008;
  undefined8 *in_stack_00000010;
  long *plStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  long *in_stack_00000040;
  undefined8 uStack0000000000000050;
  ulong in_stack_00000058;
  long *in_stack_00000060;
  long in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long *in_stack_00000098;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000a8;
  long *in_stack_000000b0;
  long in_stack_000000b8;
  undefined8 uStack00000000000000c0;
  ulong in_stack_000000c8;
  undefined8 uStack00000000000000d8;
  undefined4 uStack00000000000000e0;
  undefined4 uStack00000000000000e4;
  undefined4 uStack00000000000000e8;
  undefined4 uStack00000000000000ec;
  undefined4 uStack00000000000000f0;
  undefined4 uStack00000000000000f4;
  undefined4 uStack00000000000000f8;
  undefined4 uStack00000000000000fc;
  undefined8 in_stack_00000100;
  long *in_stack_00000148;
  ulong in_stack_00000150;
  long *in_stack_00000158;
  long in_stack_00000160;
  ulong in_stack_00000168;
  ulong in_stack_00000170;
  
  lVar15 = param_2._8_8_;
  lVar14 = param_2._0_8_;
  do {
    uVar18 = in_x10 + (in_x11 >> 3) & in_x9;
    uVar17 = (ulong)*(char *)((long)param_1 + uVar18);
    if (-1 < *(char *)((long)param_1 + uVar18)) {
      lVar26 = *param_1;
      uVar17 = CONCAT17(-(lVar26 < 0),
                        CONCAT16(-((char)((ulong)lVar26 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar26 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar26 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar26 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar26 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar26 >> 8) < '\0'),-((char)lVar26 < '\0'))
                                                  ))))));
      uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
      uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
      uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
      uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
      uVar18 = (ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3;
      uVar17 = (ulong)*(byte *)((long)param_1 + uVar18);
    }
    *(char *)((long)param_1 + uVar18) = (char)unaff_x21;
    *(char *)((long)param_1 + (uVar18 - 8 & in_x9) + 8) = (char)unaff_x21;
    param_1 = (long *)((long)param_1 - uVar18 * unaff_x23);
    in_stack_000000b0 = (long *)((long)in_stack_000000b0 - (uVar17 & 1));
    *(ulong *)((long)param_1 + -0x2c) = CONCAT44(uStack00000000000000e4,uStack00000000000000e0);
    *(ulong *)((long)param_1 + -0x34) =
         CONCAT44(uStack00000000000000d8._4_4_,(undefined4)uStack00000000000000d8);
    *(int *)(param_1 + -7) = (int)unaff_x24;
    *(ulong *)((long)param_1 + -0x1c) = CONCAT44(uStack00000000000000f4,uStack00000000000000f0);
    *(ulong *)((long)param_1 + -0x24) = CONCAT44(uStack00000000000000ec,uStack00000000000000e8);
    *(undefined4 *)((long)param_1 + -0x14) = uStack00000000000000f8;
    param_1[-1] = lVar15;
    param_1[-2] = lVar14;
    in_stack_000000b8 = in_stack_000000b8 + 1;
LAB_004d4634:
    func_0x0049f328(param_1 + -6,unaff_x22);
    while (unaff_x19 <= unaff_x26) {
      while (unaff_x28 < unaff_x19) {
        lVar14 = unaff_x20 + unaff_x28 * unaff_x27;
        unaff_x28 = (ulong)*(uint *)(lVar14 + 0x24);
        uVar3 = *(uint *)(lVar14 + 0x28);
        if (uVar3 != 0xffffffff) goto code_r0x004d4670;
      }
      auVar34 = func_0x004d6a9c(unaff_x29 + -0xd0,*(undefined8 *)(unaff_x29 + -0x78));
      plVar9 = in_stack_00000060;
      unaff_x22 = auVar34._8_8_;
      if ((auVar34._0_8_ & 1) == 0) {
        if (*(long *)(unaff_x29 + -0xd0) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -200),*(long *)(unaff_x29 + -0xd0) << 2,4);
        }
        if (*(long *)(unaff_x29 + -0xb8) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb0),*(long *)(unaff_x29 + -0xb8) << 2,4);
        }
        if (*(long *)(unaff_x29 + -0x98) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),*(long *)(unaff_x29 + -0x98) << 2,4);
        }
        plVar9 = in_stack_00000060;
        uVar17 = in_stack_00000058;
        *(ulong *)(unaff_x29 + -200) = in_stack_00000058;
        *(long **)(unaff_x29 + -0xd0) = uStack0000000000000050;
        in_stack_00000150 = in_stack_000000a8;
        in_stack_00000148 = uStack00000000000000a0;
        in_stack_00000160 = in_stack_000000b8;
        in_stack_00000158 = in_stack_000000b0;
        in_stack_00000170 = in_stack_000000c8;
        in_stack_00000168 = uStack00000000000000c0;
        in_stack_00000038 = in_stack_00000058;
        uStack0000000000000030 = uStack0000000000000050;
        in_stack_00000040 = in_stack_00000060;
        in_stack_00000058 = in_stack_000000a8;
        uStack0000000000000050 = uStack00000000000000a0;
        in_stack_00000068 = in_stack_000000b8;
        in_stack_00000060 = in_stack_000000b0;
        in_stack_00000078 = in_stack_000000c8;
        in_stack_00000070 = uStack00000000000000c0;
        lVar14 = uVar17 + (long)plVar9 * 4;
        *(ulong *)(unaff_x29 + -0xd0) = uVar17;
        *(long *)(unaff_x29 + -200) = lVar14;
        *(long **)(unaff_x29 + -0xc0) = plVar9;
        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
        puVar21 = &uStack00000000000000a0;
        func_0x004d6eec(&uStack00000000000000a0,unaff_x29 + -0xd0);
        *(ulong *)(unaff_x29 + -200) = in_stack_00000058;
        *(long **)(unaff_x29 + -0xd0) = uStack0000000000000050;
        *(long *)(unaff_x29 + -0xb8) = in_stack_00000068;
        *(long **)(unaff_x29 + -0xc0) = in_stack_00000060;
        *(ulong *)(unaff_x29 + -0xa8) = in_stack_00000078;
        *(ulong *)(unaff_x29 + -0xb0) = in_stack_00000070;
        *(undefined8 **)(unaff_x29 + -0x68) = puVar21;
        uStack00000000000000d8._0_4_ = (undefined4)uVar17;
        uStack00000000000000d8._4_4_ = (undefined4)(uVar17 >> 0x20);
        _uStack00000000000000f0 = unaff_x29 + -0x68;
        _uStack00000000000000e0 = lVar14;
        _uStack00000000000000e8 = unaff_x29 + -0xd0;
        func_0x004d0844(&uStack0000000000000088,&uStack00000000000000d8,&UNK_009e6bd0);
        func_0x00490eb8(unaff_x29 + -0xd0);
        if ((ulong)plVar9 >> 0x3c == 0) {
          if (plVar9 == (long *)0x0) {
            plVar23 = (long *)0x0;
            plVar22 = (long *)0xffffffffffffffff;
            puVar12 = &UNK_009e6c00;
            goto code_r0x004d4c54;
          }
          puVar21 = (undefined8 *)((long)plVar9 * 8);
          uVar25 = 8;
          puVar10 = (undefined8 *)func_0x00187bd0(puVar21,8);
          if (puVar10 != (undefined8 *)0x0) {
            puVar4 = (undefined1 *)((long)plVar9 + -1);
            if (puVar4 == (undefined1 *)0x0) {
              plStack0000000000000018 = (long *)((long)&MACH_HEADER.magic + 1);
              puVar21 = puVar10;
            }
            else {
              _memset(puVar10,0xff,puVar21 + -1);
              puVar21 = (undefined8 *)((long)puVar10 + (long)(puVar21 + -1));
              plStack0000000000000018 = plVar9;
            }
            plVar23 = in_stack_00000098;
            lVar14 = in_stack_00000090;
            *puVar21 = 0xffffffffffffffff;
            puVar10[(long)puVar4] = puVar4;
            if (puVar4 == (undefined1 *)0x0) goto code_r0x004d4b08;
            plVar22 = (long *)((long)plVar9 + -2);
            bVar6 = false;
            goto code_r0x004d4a2c;
          }
        }
        else {
          uVar25 = 0;
        }
        func_0x007a1f00(uVar25,puVar21,&UNK_009e6be8);
        goto code_r0x004d4ca8;
      }
      if (in_stack_00000060 == uStack0000000000000050) {
        func_0x005bcf2c(&uStack0000000000000050,&UNK_009e6c98);
      }
      *(int *)(in_stack_00000058 + (long)plVar9 * 4) = auVar34._8_4_;
      in_stack_00000060 = (long *)((long)plVar9 + 1);
      if (((unaff_x22 & 0xffffffff) < in_stack_00000028) &&
         (plVar9 = (long *)(in_stack_00000020 + (unaff_x22 & 0xffffffff) * 0x20),
         *plVar9 != -0x8000000000000000)) {
        unaff_x26 = (ulong)*(uint *)(plVar9 + 3);
      }
      else {
        unaff_x26 = 0xffffffff;
      }
      unaff_x28 = 0xffffffff;
    }
    lVar14 = unaff_x20 + unaff_x26 * unaff_x27;
    unaff_x26 = (ulong)*(uint *)(lVar14 + 0x20);
    uVar3 = *(uint *)(lVar14 + 0x2c);
code_r0x004d4670:
    unaff_x24 = (ulong)uVar3;
    lVar14 = 0;
    uVar18 = in_stack_000000c8 ^ 0x646f72616e646f6d;
    uVar16 = in_stack_000000c8 ^ 0x7065646279746573 ^ unaff_x24;
    uVar17 = uVar18 + (uStack00000000000000c0 ^ 0x736f6d6570736575);
    uVar19 = uVar17 ^ (uVar18 >> 0x33 | uVar18 << 0xd);
    uVar18 = uVar16 + (uStack00000000000000c0 ^ 0x6c7967656e657261);
    uVar1 = uVar19 + uVar18;
    uVar18 = uVar18 ^ ((in_stack_000000c8 ^ 0x7065646279746573) >> 0x30 | uVar16 << 0x10);
    uVar19 = uVar1 ^ (uVar19 >> 0x2f | uVar19 << 0x11);
    uVar17 = uVar18 + (uVar17 >> 0x20 | uVar17 << 0x20);
    uVar16 = uVar17 ^ (uVar18 >> 0x2b | uVar18 << 0x15);
    uVar17 = (uVar17 ^ (unaff_x24 | 0x400000000000000)) + uVar19;
    uVar19 = uVar17 ^ (uVar19 >> 0x33 | uVar19 << 0xd);
    uVar18 = ((uVar1 >> 0x20 | uVar1 << 0x20) ^ 0xff) + uVar16;
    uVar1 = uVar19 + uVar18;
    uVar18 = uVar18 ^ (uVar16 >> 0x30 | uVar16 << 0x10);
    uVar19 = uVar1 ^ (uVar19 >> 0x2f | uVar19 << 0x11);
    uVar17 = uVar18 + (uVar17 >> 0x20 | uVar17 << 0x20);
    uVar16 = uVar19 + uVar17;
    uVar17 = uVar17 ^ (uVar18 >> 0x2b | uVar18 << 0x15);
    uVar19 = uVar16 ^ (uVar19 >> 0x33 | uVar19 << 0xd);
    uVar18 = uVar17 + (uVar1 >> 0x20 | uVar1 << 0x20);
    uVar1 = uVar19 + uVar18;
    uVar18 = uVar18 ^ (uVar17 >> 0x30 | uVar17 << 0x10);
    uVar19 = uVar1 ^ (uVar19 >> 0x2f | uVar19 << 0x11);
    uVar17 = uVar18 + (uVar16 >> 0x20 | uVar16 << 0x20);
    uVar16 = uVar17 ^ (uVar18 >> 0x2b | uVar18 << 0x15);
    uVar19 = uVar19 + uVar17 ^ (uVar19 >> 0x33 | uVar19 << 0xd);
    uVar17 = uVar16 + (uVar1 >> 0x20 | uVar1 << 0x20);
    uVar18 = uVar19 + uVar17;
    uVar17 = uVar17 ^ (uVar16 >> 0x30 | uVar16 << 0x10);
    uVar18 = (uVar19 >> 0x2f | uVar19 << 0x11) ^ (uVar17 >> 0x2b | uVar17 << 0x15) ^
             (uVar18 >> 0x20 | uVar18 << 0x20) ^ uVar18;
    unaff_x21 = uVar18 >> 0x39;
    bVar20 = (byte)(uVar18 >> 0x39);
    uVar17 = uVar18;
    while( true ) {
      uVar17 = uVar17 & in_stack_000000a8;
      uVar25 = *(undefined8 *)((long)uStack00000000000000a0 + uVar17);
      bVar24 = (byte)((ulong)uVar25 >> 8);
      bVar28 = (byte)((ulong)uVar25 >> 0x10);
      bVar29 = (byte)((ulong)uVar25 >> 0x18);
      bVar30 = (byte)((ulong)uVar25 >> 0x20);
      bVar31 = (byte)((ulong)uVar25 >> 0x28);
      bVar32 = (byte)((ulong)uVar25 >> 0x30);
      bVar33 = (byte)((ulong)uVar25 >> 0x38);
      for (uVar1 = CONCAT17(-(bVar33 == bVar20),
                            CONCAT16(-(bVar32 == bVar20),
                                     CONCAT15(-(bVar31 == bVar20),
                                              CONCAT14(-(bVar30 == bVar20),
                                                       CONCAT13(-(bVar29 == bVar20),
                                                                CONCAT12(-(bVar28 == bVar20),
                                                                         CONCAT11(-(bVar24 == bVar20
                                                                                   ),-((byte)uVar25
                                                                                      == bVar20)))))
                                             ))) & 0x8080808080808080; uVar1 != 0;
          uVar1 = uVar1 - 1 & uVar1) {
        uVar16 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
        uVar16 = uVar17 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) & in_stack_000000a8
        ;
        if (*(uint *)((long)uStack00000000000000a0 + (-0x38 - uVar16 * unaff_x23)) == unaff_x24) {
          param_1 = (long *)((long)uStack00000000000000a0 + -uVar16 * unaff_x23);
          goto LAB_004d4634;
        }
      }
      bVar24 = NEON_umaxv(CONCAT17(-(bVar33 == 0xff),
                                   CONCAT16(-(bVar32 == 0xff),
                                            CONCAT15(-(bVar31 == 0xff),
                                                     CONCAT14(-(bVar30 == 0xff),
                                                              CONCAT13(-(bVar29 == 0xff),
                                                                       CONCAT12(-(bVar28 == 0xff),
                                                                                CONCAT11(-(bVar24 ==
                                                                                          0xff),-((
                                                  byte)uVar25 == 0xff)))))))),1);
      if ((bVar24 & 1) != 0) break;
      lVar14 = lVar14 + 8;
      uVar17 = uVar17 + lVar14;
    }
    if (in_stack_000000b0 == (long *)0x0) {
      func_0x007ad168(&uStack00000000000000a0,1,&uStack00000000000000c0,1);
    }
    plVar9 = (long *)func_0x004d14ec(0);
    if (plVar9 == (long *)0x0) goto code_r0x004d4c64;
    lVar15 = plVar9[1];
    lVar14 = *plVar9;
    *plVar9 = lVar14 + 1;
    uStack00000000000000e4 = (undefined4)_UNK_009e6b50;
    uStack00000000000000e8 = (undefined4)((ulong)_UNK_009e6b50 >> 0x20);
    uStack00000000000000d8._4_4_ = (undefined4)_UNK_009e6b48;
    uStack00000000000000e0 = (undefined4)((ulong)_UNK_009e6b48 >> 0x20);
    uStack00000000000000f4 = (undefined4)_UNK_009e6b60;
    uStack00000000000000f8 = (undefined4)((ulong)_UNK_009e6b60 >> 0x20);
    uStack00000000000000ec = (undefined4)_UNK_009e6b58;
    uStack00000000000000f0 = (undefined4)((ulong)_UNK_009e6b58 >> 0x20);
    in_x10 = in_stack_000000a8 & uVar18;
    lVar26 = *(long *)((long)uStack00000000000000a0 + in_x10);
    uVar17 = CONCAT17(-(lVar26 < 0),
                      CONCAT16(-((char)((ulong)lVar26 >> 0x30) < '\0'),
                               CONCAT15(-((char)((ulong)lVar26 >> 0x28) < '\0'),
                                        CONCAT14(-((char)((ulong)lVar26 >> 0x20) < '\0'),
                                                 CONCAT13(-((char)((ulong)lVar26 >> 0x18) < '\0'),
                                                          CONCAT12(-((char)((ulong)lVar26 >> 0x10) <
                                                                    '\0'),CONCAT11(-((char)((ulong)
                                                  lVar26 >> 8) < '\0'),-((char)lVar26 < '\0'))))))))
    ;
    if (uVar17 == 0) {
      lVar26 = 8;
      do {
        in_x10 = in_x10 + lVar26 & in_stack_000000a8;
        lVar27 = *(long *)((long)uStack00000000000000a0 + in_x10);
        uVar17 = CONCAT17(-(lVar27 < 0),
                          CONCAT16(-((char)((ulong)lVar27 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar27 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar27 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar27 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar27 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar27 >> 8) < '\0'),-((char)lVar27 < '\0'))))))))
        ;
        lVar26 = lVar26 + 8;
      } while (uVar17 == 0);
    }
    uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
    uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
    uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
    uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
    in_x11 = LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20);
    param_1 = uStack00000000000000a0;
    in_x9 = in_stack_000000a8;
  } while( true );
code_r0x004d4aa8:
  if (puVar10[(long)plVar13] != -1) {
    plVar11 = (long *)func_0x005e2978(puVar10,plVar9);
  }
  uVar18 = uVar18 + 1;
  if (uVar17 >> 3 == uVar18) goto code_r0x004d4ac8;
  goto code_r0x004d4a9c;
code_r0x004d4c64:
  func_0x007a02f0(&UNK_009e7cc0);
  goto code_r0x004d4ca8;
code_r0x004d4a2c:
  bVar5 = bVar6;
  if (plVar23 <= plVar22) {
    puVar12 = &UNK_009e6c18;
    goto code_r0x004d4c54;
  }
  lVar15 = lVar14 + (long)plVar22 * 0x18;
  puVar21 = *(undefined8 **)(lVar15 + 8);
  lVar15 = *(long *)(lVar15 + 0x10);
  uVar17 = lVar15 * 8;
  puVar2 = puVar21 + lVar15;
  do {
    uVar17 = uVar17 - 8;
    if (puVar21 == puVar2) {
      func_0x007a23d8(&UNK_008a295c,0x9e,&UNK_009e6c30);
      goto code_r0x004d4ca8;
    }
    plVar11 = (long *)*puVar21;
    if (plVar9 <= plVar11) goto code_r0x004d4c48;
    puVar21 = puVar21 + 1;
  } while (puVar10[(long)plVar11] == -1);
  if (puVar21 != puVar2) {
    uVar18 = 0;
code_r0x004d4a9c:
    plVar13 = (long *)puVar21[uVar18];
    if (plVar13 < plVar9) goto code_r0x004d4aa8;
    plVar11 = plVar13;
code_r0x004d4c48:
    puVar12 = &UNK_009e6c60;
    plVar22 = plVar11;
    plVar23 = plVar9;
    goto code_r0x004d4c54;
  }
code_r0x004d4ac8:
  if (plVar22 < plVar9) {
    if (plVar11 != (long *)puVar10[(long)plVar22]) {
      puVar10[(long)plVar22] = plVar11;
      bVar5 = true;
    }
    bVar8 = plVar22 != (long *)0x0;
    plVar22 = (long *)((long)plVar22 + -1);
    if (!bVar8) {
      plVar22 = (long *)((long)plVar9 + -2);
    }
    bVar6 = (bool)(bVar8 & bVar5);
    if ((!bVar8) && (!bVar5)) {
code_r0x004d4b08:
      *(undefined8 **)(unaff_x29 + -0xd0) = puVar10;
      *(undefined8 **)(unaff_x29 + -200) = puVar10;
      *(long **)(unaff_x29 + -0xc0) = plStack0000000000000018;
      *(undefined8 **)(unaff_x29 + -0xb8) = puVar10 + (long)plVar9;
      *(undefined8 *)(unaff_x29 + -0xb0) = 0;
      *(undefined8 **)(unaff_x29 + -0xa8) = &uStack0000000000000030;
      func_0x004d7180(&uStack00000000000000d8,unaff_x29 + -0xd0);
      lVar14 = in_stack_00000090;
      *(undefined4 *)(in_stack_00000010 + 6) = in_stack_00000008._4_4_;
      in_stack_00000010[1] = _uStack00000000000000e0;
      *in_stack_00000010 = CONCAT44(uStack00000000000000d8._4_4_,(undefined4)uStack00000000000000d8)
      ;
      in_stack_00000010[3] = _uStack00000000000000f0;
      in_stack_00000010[2] = _uStack00000000000000e8;
      in_stack_00000010[5] = in_stack_00000100;
      in_stack_00000010[4] = CONCAT44(uStack00000000000000fc,uStack00000000000000f8);
      if (in_stack_00000098 != (long *)0x0) {
        puVar21 = (undefined8 *)(in_stack_00000090 + 8);
        plVar9 = in_stack_00000098;
        do {
          if (puVar21[-1] != 0) {
            func_0x00187bd4(*puVar21,puVar21[-1] << 3,8);
          }
          puVar21 = puVar21 + 3;
          plVar9 = (long *)((long)plVar9 + -1);
        } while (plVar9 != (long *)0x0);
      }
      if (uStack0000000000000088 != 0) {
        func_0x00187bd4(lVar14,uStack0000000000000088 * 0x18,8);
      }
      if ((in_stack_000000a8 != 0) && (lVar14 = in_stack_000000a8 * 0x11 + 0x19, lVar14 != 0)) {
        func_0x00187bd4(uStack00000000000000a0 + in_stack_000000a8 * -2 + -2,lVar14,8);
      }
      if (uStack0000000000000030 != (long *)0x0) {
        func_0x00187bd4(in_stack_00000038,(long)uStack0000000000000030 << 2,4);
      }
      return;
    }
    goto code_r0x004d4a2c;
  }
  puVar12 = &UNK_009e6c48;
  plVar23 = plVar9;
code_r0x004d4c54:
  func_0x007a2570(plVar22,plVar23,puVar12);
code_r0x004d4ca8:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x4d4cac);
  (*pcVar7)();
}

