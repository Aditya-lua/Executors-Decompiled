
/* WARNING: Type propagation algorithm not settling */

void FUN_004c97d0(long param_1)

{
  uint uVar1;
  long *plVar2;
  long lVar3;
  code *pcVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  byte bVar8;
  undefined *puVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong uVar14;
  long *plVar15;
  long unaff_x19;
  long unaff_x20;
  undefined *unaff_x21;
  long *plVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  ulong uVar20;
  long unaff_x26;
  long lVar21;
  ulong uVar22;
  long unaff_x27;
  long lVar23;
  long unaff_x29;
  long lVar24;
  byte bVar25;
  undefined8 uVar26;
  long in_stack_00000010;
  long *in_stack_00000030;
  long in_stack_00000040;
  long in_stack_00000048;
  long *in_stack_00000050;
  long in_stack_00000058;
  undefined1 uStack0000000000000070;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_00000100;
  long in_stack_00000108;
  long *in_stack_00000120;
  ulong in_stack_00000128;
  long in_stack_00000138;
  undefined8 uStack0000000000000140;
  long in_stack_00000148;
  long in_stack_00000150;
  undefined8 uStack0000000000000158;
  long in_stack_00000160;
  long in_stack_00000168;
  undefined8 uStack0000000000000170;
  ulong in_stack_00000178;
  long in_stack_00000188;
  undefined8 uStack0000000000000190;
  undefined *in_stack_00000198;
  undefined *in_stack_000001a0;
  undefined8 uStack00000000000001b0;
  long in_stack_000001b8;
  long in_stack_000001c0;
  long in_stack_000001c8;
  undefined8 uStack00000000000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined8 uStack00000000000001f0;
  undefined *in_stack_000001f8;
  undefined *in_stack_00000200;
  undefined *in_stack_00000208;
  undefined8 auStack_7ffffff8 [268435455];
  
  uStack00000000000001f0 = uStack00000000000001f0;
code_r0x004c97d4:
  lVar17 = in_stack_00000090;
  if (param_1 != 0) {
    in_stack_00000168 = param_1 + -1;
    uVar1 = *(uint *)(in_stack_00000160 + in_stack_00000168 * 4);
    uVar7 = (ulong)uVar1;
    if (in_stack_00000188 != 0) goto code_r0x004c921c;
code_r0x004c92b0:
    func_0x004d1c68(&uStack0000000000000170,uVar7);
    func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,uVar7);
    if (uStack00000000000001f0 == unaff_x21) {
      func_0x007a23bc(&UNK_009e69d0);
    }
    else {
      in_stack_000001b8 = in_stack_00000058;
      uStack00000000000001b0 = in_stack_00000050;
      in_stack_000001c8 = in_stack_00000048;
      in_stack_000001c0 = in_stack_00000040;
      uStack0000000000000190 = uStack00000000000001f0;
      in_stack_00000198 = in_stack_000001f8;
      in_stack_000001a0 = in_stack_00000200;
      func_0x004c86b0(&uStack0000000000000190,&uStack00000000000001b0);
      lVar17 = in_stack_000001b8;
      lVar19 = unaff_x27 + in_stack_000001b8 * unaff_x26;
      lVar24 = (long)uStack00000000000001b0 + in_stack_000001b8 * unaff_x19 + -0x18;
      if (in_stack_000001c8 == 0) goto code_r0x004c956c;
      plVar15 = uStack00000000000001b0 + 1;
      lVar21 = *uStack00000000000001b0;
      uVar18 = CONCAT17(-(-1 < lVar21),
                        CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar21 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
               0x8080808080808080;
      plVar16 = uStack00000000000001b0;
      lVar21 = in_stack_000001c8;
joined_r0x004c9338:
      while( true ) {
        uVar14 = in_stack_00000128;
        plVar2 = in_stack_00000120;
        if (uVar18 != 0) break;
        lVar23 = *plVar15;
        uVar18 = CONCAT17(-(-1 < lVar23),
                          CONCAT16(-(-1 < (char)((ulong)lVar23 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar23 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar23 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar23 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar23
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar23 >> 8)),-(-1 < (char)lVar23)))))))) &
                 0x8080808080808080;
        plVar15 = plVar15 + 1;
        plVar16 = plVar16 + -0x18;
      }
      uVar13 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
      uVar18 = uVar18 - 1 & uVar18;
      iVar5 = (int)((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3);
      lVar21 = lVar21 + -1;
      puVar9 = (undefined *)plVar16[(long)-iVar5 * 3 + -3];
      if (puVar9 == unaff_x21) goto joined_r0x004c9568;
      puVar10 = (ulong *)plVar16[(long)-iVar5 * 3 + -2];
      if (in_stack_00000138 != 0) {
        uVar22 = plVar16[(long)-iVar5 * 3 + -1];
        uVar13 = uVar22;
        if (uVar22 < 8) {
          uVar6 = 0;
          puVar11 = puVar10;
          puVar12 = puVar10;
          if (3 < uVar22) goto code_r0x004c93c8;
code_r0x004c9548:
          if (uVar13 < 2) goto code_r0x004c93e0;
code_r0x004c9550:
          puVar12 = (ulong *)((long)puVar11 + 2);
          uVar6 = ((ulong)(ushort)*puVar11 ^ (uVar6 >> 0x3b | uVar6 << 5)) * unaff_x20;
          if (uVar13 != 2) goto code_r0x004c93e4;
        }
        else {
          uVar6 = 0;
          puVar12 = puVar10;
          do {
            puVar11 = puVar12 + 1;
            uVar6 = (*puVar12 ^ (uVar6 >> 0x3b | uVar6 << 5)) * unaff_x20;
            uVar13 = uVar13 - 8;
            puVar12 = puVar11;
          } while (7 < uVar13);
          if (uVar13 < 4) goto code_r0x004c9548;
code_r0x004c93c8:
          puVar11 = (ulong *)((long)puVar12 + 4);
          uVar6 = ((ulong)(uint)*puVar12 ^ (uVar6 >> 0x3b | uVar6 << 5)) * unaff_x20;
          uVar13 = uVar13 - 4;
          if (1 < uVar13) goto code_r0x004c9550;
code_r0x004c93e0:
          puVar12 = puVar11;
          if (uVar13 != 0) {
code_r0x004c93e4:
            uVar6 = ((ulong)(byte)*puVar12 ^ (uVar6 >> 0x3b | uVar6 << 5)) * unaff_x20;
          }
        }
        lVar23 = 0;
        uVar6 = ((uVar6 >> 0x3b | uVar6 << 5) ^ 0xff) * unaff_x20;
        bVar8 = (byte)(uVar6 >> 0x39);
        uVar6 = uVar6 & in_stack_00000128;
        uVar26 = *(undefined8 *)((long)in_stack_00000120 + uVar6);
        uVar13 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar8),
                          CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar8),
                                   CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar8),
                                            CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar8),
                                                     CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                               bVar8),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar8),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar8),
                                                           -((byte)uVar26 == bVar8))))))));
        while( true ) {
          uVar13 = uVar13 & 0x8080808080808080;
          if (uVar13 != 0) {
            do {
              uVar20 = (uVar13 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar13 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
              uVar20 = uVar6 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & uVar14;
              if ((uVar22 == plVar2[uVar20 * -4 + -2]) &&
                 (iVar5 = _memcmp(puVar10,plVar2[uVar20 * -4 + -3],uVar22), iVar5 == 0)) {
                lVar23 = plVar2[uVar20 * -4 + -1];
                iVar5 = func_0x00584798(&uStack0000000000000070,(int)lVar23);
                lVar3 = in_stack_00000168;
                if (iVar5 != 0) {
                  if (in_stack_00000168 == uStack0000000000000158) {
                    func_0x005bcf2c(&uStack0000000000000158,&UNK_009e6a40);
                  }
                  *(int *)(in_stack_00000160 + lVar3 * 4) = (int)lVar23;
                  in_stack_00000168 = lVar3 + 1;
                }
                if (puVar9 != (undefined *)0x0) {
                  func_0x00187bd4(puVar10,puVar9,1);
                }
                unaff_x20 = 0x517cc1b727220a95;
                unaff_x21 = (undefined *)0x8000000000000000;
                if (lVar21 != 0) goto joined_r0x004c9338;
                goto code_r0x004c956c;
              }
              uVar13 = uVar13 - 1 & uVar13;
            } while (uVar13 != 0);
          }
          bVar25 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar26 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar26 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar26 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar26 >> 8) ==
                                                                     -1),-((char)uVar26 == -1)))))))
                                      ),1);
          if ((bVar25 & 1) != 0) break;
          lVar23 = lVar23 + 8;
          uVar6 = uVar6 + lVar23 & uVar14;
          uVar26 = *(undefined8 *)((long)plVar2 + uVar6);
          uVar13 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar8),
                            CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar8),
                                     CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar8),
                                              CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar8),
                                                       CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                                 bVar8),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar8),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar8),
                                                           -((byte)uVar26 == bVar8))))))));
        }
      }
      func_0x007a23d8(&UNK_008a25de,0x16,&UNK_009e6a28);
    }
    goto LAB_004c9be0;
  }
  lVar24 = in_stack_00000090 + in_stack_00000098 * 0x20;
  func_0x004d03bc(&uStack00000000000001b0,&uStack00000000000001f0,&UNK_009e5910);
  lVar19 = in_stack_000001b8;
  plVar15 = uStack00000000000001b0;
  if (in_stack_000001c0 != 0) {
    lVar21 = 0;
    lVar23 = in_stack_000001c0 * 4;
    uVar7 = 0;
    do {
      uVar18 = (ulong)*(uint *)(lVar19 + lVar21);
      func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,uVar18);
      if (lVar17 == -0x8000000000000000) {
        func_0x007a23bc(&UNK_009e6a58);
LAB_004c9be0:
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x4c9be4);
        (*pcVar4)();
      }
      *(long *)(unaff_x29 + -0x88) = lVar24;
      *(long *)(unaff_x29 + -0x90) = lVar17;
      *(ulong *)(unaff_x29 + -0x80) = uVar7;
      if ((uVar7 == 0) || (lVar17 = *(long *)(unaff_x29 + -0x88), *(long *)(lVar17 + 0x18) != 0x12))
      {
        *(ulong *)(unaff_x29 + -0x98) = uVar18;
        uStack0000000000000190 = (undefined *)(unaff_x29 + -0x98);
        in_stack_00000198 =
             &
             __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
        ;
        func_0x00459f08(&uStack00000000000001b0,&uStack00000000000001f0);
        lVar17 = in_stack_00000150;
        if (in_stack_00000150 == uStack0000000000000140) {
          func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a70);
        }
        _memcpy(in_stack_00000148 + lVar17 * 0x108,&uStack00000000000001f0,0x108);
        in_stack_00000150 = lVar17 + 1;
        lVar17 = *(long *)(unaff_x29 + -0x88);
      }
      uVar18 = *(ulong *)(unaff_x29 + -0x90);
      if ((ulong)(uStack0000000000000140 - in_stack_00000150) < uVar7) {
        func_0x007a535c(&uStack0000000000000140,in_stack_00000150,uVar7,8,0x108);
      }
      lVar24 = in_stack_00000150;
      _memcpy(in_stack_00000148 + in_stack_00000150 * 0x108,lVar17,uVar7 * 0x108);
      in_stack_00000150 = lVar24 + uVar7;
      func_0x004d3808(&uStack00000000000001f0);
      lVar21 = lVar21 + 4;
      lVar24 = lVar17;
      uVar7 = uVar18;
    } while (lVar23 != lVar21);
  }
  if (plVar15 != (long *)0x0) {
    func_0x00187bd4(lVar19,(long)plVar15 << 2,4);
  }
  in_stack_00000030[1] = in_stack_00000148;
  *in_stack_00000030 = uStack0000000000000140;
  in_stack_00000030[2] = in_stack_00000150;
  if (in_stack_00000178 != 0) {
    uVar7 = in_stack_00000178 * 4 + 0xb & 0xfffffffffffffff8;
    lVar17 = in_stack_00000178 + uVar7 + 9;
    if (lVar17 != 0) {
      func_0x00187bd4(uStack0000000000000170 - uVar7,lVar17,8);
    }
  }
  if (uStack0000000000000158 != 0) {
    func_0x00187bd4(in_stack_00000160,uStack0000000000000158 << 2,4);
  }
  func_0x004bc638(&uStack0000000000000070);
  if (in_stack_00000108 != 0) {
    uVar7 = in_stack_00000108 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar17 = in_stack_00000108 + uVar7 + 9;
    if (lVar17 != 0) {
      func_0x00187bd4(in_stack_00000100 - uVar7,lVar17,8);
    }
  }
  uVar7 = in_stack_00000128;
  if (in_stack_00000128 != 0) {
    if (in_stack_00000138 != 0) {
      plVar16 = in_stack_00000120 + 1;
      lVar17 = *in_stack_00000120;
      uVar18 = CONCAT17(-(-1 < lVar17),
                        CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar17 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
               0x8080808080808080;
      plVar15 = in_stack_00000120;
      lVar17 = in_stack_00000138;
      do {
        while (uVar18 == 0) {
          lVar24 = *plVar16;
          plVar15 = plVar15 + -0x20;
          plVar16 = plVar16 + 1;
          uVar18 = CONCAT17(-(-1 < lVar24),
                            CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar24 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8)),
                                                           -(-1 < (char)lVar24)))))))) &
                   0x8080808080808080;
        }
        uVar14 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar14 = LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) & 0x78;
        lVar24 = *(long *)((long)plVar15 + uVar14 * -4 + -0x20);
        if (lVar24 != 0) {
          func_0x00187bd4(*(undefined8 *)((long)plVar15 + uVar14 * -4 + -0x18),lVar24,1);
        }
        uVar18 = uVar18 - 1 & uVar18;
        lVar17 = lVar17 + -1;
      } while (lVar17 != 0);
    }
    lVar17 = uVar7 * 0x21 + 0x29;
    if (lVar17 != 0) {
      func_0x00187bd4(in_stack_00000120 + uVar7 * -4 + -4,lVar17,8);
    }
  }
  return;
code_r0x004c921c:
  lVar17 = 0;
  bVar8 = (byte)(uVar7 * unaff_x20 >> 0x39);
  uVar14 = uVar7 * unaff_x20 & in_stack_00000178;
  uVar26 = *(undefined8 *)(uStack0000000000000170 + uVar14);
  uVar18 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar8),
                    CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar8),
                             CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar8),
                                      CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar8),
                                               CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar8),
                                                        CONCAT12(-((byte)((ulong)uVar26 >> 0x10) ==
                                                                  bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar26 >> 8) == bVar8),-((byte)uVar26 == bVar8))))
                                              )))) & 0x8080808080808080;
  while( true ) {
    while (uVar18 == 0) {
      bVar25 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar26 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar26 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar26 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar26 >> 8) == -1),
                                                           -((char)uVar26 == -1)))))))),1);
      if ((bVar25 & 1) != 0) goto code_r0x004c92b0;
      lVar17 = lVar17 + 8;
      uVar14 = uVar14 + lVar17 & in_stack_00000178;
      uVar26 = *(undefined8 *)(uStack0000000000000170 + uVar14);
      uVar18 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar8),
                        CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar8),
                                 CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar8),
                                          CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar8),
                                                   CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar8
                                                             ),CONCAT12(-((byte)((ulong)uVar26 >>
                                                                                0x10) == bVar8),
                                                                        CONCAT11(-((byte)((ulong)
                                                  uVar26 >> 8) == bVar8),-((byte)uVar26 == bVar8))))
                                                  )))) & 0x8080808080808080;
    }
    uVar13 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
    param_1 = in_stack_00000168;
    if (uVar1 == *(uint *)(uStack0000000000000170 + -4 +
                          (uVar14 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) &
                          in_stack_00000178) * -4)) break;
    uVar18 = uVar18 - 1 & uVar18;
  }
  goto code_r0x004c97d4;
joined_r0x004c9568:
  for (; lVar21 != 0; lVar21 = lVar21 + -1) {
    while (uVar18 == 0) {
      lVar23 = *plVar15;
      plVar16 = plVar16 + -0x18;
      plVar15 = plVar15 + 1;
      uVar18 = CONCAT17(-(-1 < lVar23),
                        CONCAT16(-(-1 < (char)((ulong)lVar23 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar23 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar23 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar23 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar23 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar23 >> 8)),-(-1 < (char)lVar23)))))))) &
               0x8080808080808080;
    }
    uVar14 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    iVar5 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3);
    if (plVar16[(long)-iVar5 * 3 + -3] != 0) {
      func_0x00187bd4(plVar16[(long)-iVar5 * 3 + -2],plVar16[(long)-iVar5 * 3 + -3],1);
    }
    uVar18 = uVar18 - 1 & uVar18;
  }
code_r0x004c956c:
  if ((lVar17 != 0) && (lVar19 != 0)) {
    func_0x00187bd4(lVar24,lVar19,8);
  }
  if (((in_stack_00000150 != 0) &&
      (lVar17 = in_stack_00000148 + in_stack_00000150 * 0x108, lVar17 != 0x108)) &&
     (*(long *)(lVar17 + -0xf0) == 0x11)) {
    lVar24 = *(long *)(lVar17 + -0x100);
    lVar17 = *(long *)(lVar17 + -0xf8);
    lVar19 = lVar17 + -1;
    if (lVar17 != 0 && lVar19 != 0) {
      if (*(char *)(lVar24 + 1) < -0x40) goto code_r0x004c9ba0;
    }
    else {
      if (lVar19 != 0) {
code_r0x004c9ba0:
        func_0x007a297c(lVar24,lVar17,1,lVar17,&UNK_009e69e8);
        goto LAB_004c9be0;
      }
      lVar19 = 0;
    }
    *(ulong *)(unaff_x29 + -0x98) = uVar7;
    *(undefined8 *)(unaff_x29 + -0x90) = 0;
    *(undefined8 *)(unaff_x29 + -0x88) = 1;
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    iVar5 = func_0x00476678(unaff_x29 + -0x98,&uStack00000000000001f0);
    if (iVar5 != 0) {
      func_0x007a2810(&UNK_008a1efb,0x37,unaff_x29 + -0x69,&UNK_009e5928,&UNK_009e58f8);
      goto LAB_004c9be0;
    }
    lVar17 = *(long *)(unaff_x29 + -0x90);
    uVar26 = *(undefined8 *)(unaff_x29 + -0x88);
    if ((lVar19 == *(long *)(unaff_x29 + -0x80)) &&
       (iVar5 = _memcmp(lVar24 + 1,uVar26,lVar19), iVar5 == 0)) {
      if (lVar17 != 0) {
        func_0x00187bd4(uVar26,lVar17,1);
      }
      if (in_stack_00000150 != 0) {
        in_stack_00000150 = in_stack_00000150 + -1;
        _memmove(&uStack00000000000001f0,in_stack_00000148 + in_stack_00000150 * 0x108,0x108);
        if (in_stack_00000208 != (undefined *)0x21) {
          func_0x004bba74(&uStack00000000000001f0);
        }
      }
    }
    else if (lVar17 != 0) {
      func_0x00187bd4(uVar26,lVar17,1);
    }
  }
  puVar9 = in_stack_000001a0;
  if ((in_stack_000001a0 == (undefined *)0x0) || (*(long *)(in_stack_00000198 + 0x18) != 0x12)) {
    *(ulong *)(unaff_x29 + -0x98) = uVar7;
    *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x98;
    *(undefined **)(unaff_x29 + -0x88) =
         &
         __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
    ;
    func_0x00459f08(&uStack00000000000001d8,&uStack00000000000001f0);
    lVar17 = in_stack_00000150;
    if (in_stack_00000150 == uStack0000000000000140) {
      func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a10);
    }
    _memcpy(in_stack_00000148 + lVar17 * 0x108,&uStack00000000000001f0,0x108);
    in_stack_00000150 = lVar17 + 1;
  }
  in_stack_00000208 = in_stack_00000198;
  in_stack_00000200 = uStack0000000000000190;
  unaff_x26 = 0x19;
  unaff_x19 = -0x18;
  if ((undefined *)(uStack0000000000000140 - in_stack_00000150) < puVar9) {
    func_0x007a535c(&uStack0000000000000140,in_stack_00000150,puVar9,8,0x108);
  }
  lVar17 = in_stack_00000150;
  _memcpy(in_stack_00000148 + in_stack_00000150 * 0x108,in_stack_00000208,(long)puVar9 * 0x108);
  in_stack_00000150 = lVar17 + (long)puVar9;
  func_0x004d3808(&uStack00000000000001f0);
  param_1 = in_stack_00000168;
  in_stack_000001f8 = in_stack_00000208;
  uStack00000000000001f0 = in_stack_00000208;
  unaff_x27 = in_stack_00000010;
  goto code_r0x004c97d4;
}

