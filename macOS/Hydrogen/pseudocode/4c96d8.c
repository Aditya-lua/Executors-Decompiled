
/* WARNING: Type propagation algorithm not settling */

void FUN_004c96d8(void)

{
  uint uVar1;
  long *plVar2;
  undefined *puVar3;
  code *pcVar4;
  int iVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  byte bVar9;
  undefined *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x20;
  undefined *unaff_x21;
  long *plVar16;
  long *plVar17;
  undefined *unaff_x23;
  long lVar18;
  ulong uVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  long lVar23;
  long unaff_x28;
  long unaff_x29;
  long lVar24;
  long lVar25;
  byte bVar26;
  undefined8 uVar27;
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
  undefined1 uStack00000000000001f0;
  
code_r0x004c96d8:
  *(undefined **)(unaff_x29 + -0x88) =
       &
       __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  func_0x00459f08(&uStack00000000000001d8,&uStack00000000000001f0);
  lVar18 = in_stack_00000150;
  if (in_stack_00000150 == uStack0000000000000140) {
    func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a10);
  }
  _memcpy(in_stack_00000148 + lVar18 * unaff_x28,&uStack00000000000001f0,0x108);
  in_stack_00000150 = lVar18 + 1;
code_r0x004c9778:
  puVar3 = in_stack_00000198;
  puVar10 = uStack0000000000000190;
  if ((undefined *)(uStack0000000000000140 - in_stack_00000150) < unaff_x23) {
    func_0x007a535c(&uStack0000000000000140,in_stack_00000150,unaff_x23,8,0x108);
  }
  lVar18 = in_stack_00000150;
  _memcpy(in_stack_00000148 + in_stack_00000150 * unaff_x28,puVar3,(long)unaff_x23 * 0x108);
  in_stack_00000150 = lVar18 + (long)unaff_x23;
  func_0x004d3808(&uStack00000000000001f0);
  lVar18 = in_stack_00000090;
  while (in_stack_00000168 != 0) {
    in_stack_00000168 = in_stack_00000168 + -1;
    uVar1 = *(uint *)(in_stack_00000160 + in_stack_00000168 * 4);
    uVar8 = (ulong)uVar1;
    if (in_stack_00000188 == 0) goto code_r0x004c92b0;
    lVar24 = 0;
    bVar9 = (byte)(uVar8 * unaff_x20 >> 0x39);
    uVar15 = uVar8 * unaff_x20 & in_stack_00000178;
    uVar27 = *(undefined8 *)(uStack0000000000000170 + uVar15);
    uVar19 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar9),
                      CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar9),
                               CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar9),
                                        CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar9),
                                                 CONCAT13(-((byte)((ulong)uVar27 >> 0x18) == bVar9),
                                                          CONCAT12(-((byte)((ulong)uVar27 >> 0x10)
                                                                    == bVar9),
                                                                   CONCAT11(-((byte)((ulong)uVar27
                                                                                    >> 8) == bVar9),
                                                                            -((byte)uVar27 == bVar9)
                                                                           ))))))) &
             0x8080808080808080;
    while( true ) {
      while (uVar19 == 0) {
        bVar26 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar27 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar27
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar27 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar27 >> 8) == -1),
                                                           -((char)uVar27 == -1)))))))),1);
        if ((bVar26 & 1) != 0) goto code_r0x004c92b0;
        lVar24 = lVar24 + 8;
        uVar15 = uVar15 + lVar24 & in_stack_00000178;
        uVar27 = *(undefined8 *)(uStack0000000000000170 + uVar15);
        uVar19 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar9),
                          CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar9),
                                   CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar9),
                                            CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar9),
                                                     CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                               bVar9),CONCAT12(-((byte)((ulong)
                                                  uVar27 >> 0x10) == bVar9),
                                                  CONCAT11(-((byte)((ulong)uVar27 >> 8) == bVar9),
                                                           -((byte)uVar27 == bVar9)))))))) &
                 0x8080808080808080;
      }
      uVar14 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
      if (uVar1 == *(uint *)(uStack0000000000000170 + -4 +
                            (uVar15 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) &
                            in_stack_00000178) * -4)) break;
      uVar19 = uVar19 - 1 & uVar19;
    }
  }
  lVar24 = in_stack_00000090 + in_stack_00000098 * 0x20;
  func_0x004d03bc(&uStack00000000000001b0,&uStack00000000000001f0,&UNK_009e5910);
  lVar25 = in_stack_000001b8;
  plVar6 = uStack00000000000001b0;
  if (in_stack_000001c0 == 0) goto code_r0x004c9a8c;
  lVar21 = 0;
  lVar23 = in_stack_000001c0 * 4;
  uVar8 = 0;
  while( true ) {
    uVar19 = (ulong)*(uint *)(lVar25 + lVar21);
    func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,uVar19);
    if (lVar18 == -0x8000000000000000) break;
    *(long *)(unaff_x29 + -0x88) = lVar24;
    *(long *)(unaff_x29 + -0x90) = lVar18;
    *(ulong *)(unaff_x29 + -0x80) = uVar8;
    if ((uVar8 == 0) || (lVar18 = *(long *)(unaff_x29 + -0x88), *(long *)(lVar18 + 0x18) != 0x12)) {
      *(ulong *)(unaff_x29 + -0x98) = uVar19;
      uStack0000000000000190 = (undefined *)(unaff_x29 + -0x98);
      in_stack_00000198 =
           &
           __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
      ;
      func_0x00459f08(&uStack00000000000001b0,&uStack00000000000001f0);
      lVar18 = in_stack_00000150;
      if (in_stack_00000150 == uStack0000000000000140) {
        func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a70);
      }
      _memcpy(in_stack_00000148 + lVar18 * 0x108,&uStack00000000000001f0,0x108);
      in_stack_00000150 = lVar18 + 1;
      lVar18 = *(long *)(unaff_x29 + -0x88);
    }
    uVar19 = *(ulong *)(unaff_x29 + -0x90);
    if ((ulong)(uStack0000000000000140 - in_stack_00000150) < uVar8) {
      func_0x007a535c(&uStack0000000000000140,in_stack_00000150,uVar8,8,0x108);
    }
    lVar24 = in_stack_00000150;
    _memcpy(in_stack_00000148 + in_stack_00000150 * 0x108,lVar18,uVar8 * 0x108);
    in_stack_00000150 = lVar24 + uVar8;
    func_0x004d3808(&uStack00000000000001f0);
    lVar21 = lVar21 + 4;
    lVar24 = lVar18;
    uVar8 = uVar19;
    if (lVar23 == lVar21) {
code_r0x004c9a8c:
      if (plVar6 != (long *)0x0) {
        func_0x00187bd4(lVar25,(long)plVar6 << 2,4);
      }
      in_stack_00000030[1] = in_stack_00000148;
      *in_stack_00000030 = uStack0000000000000140;
      in_stack_00000030[2] = in_stack_00000150;
      if (in_stack_00000178 != 0) {
        uVar8 = in_stack_00000178 * 4 + 0xb & 0xfffffffffffffff8;
        lVar18 = in_stack_00000178 + uVar8 + 9;
        if (lVar18 != 0) {
          func_0x00187bd4(uStack0000000000000170 - uVar8,lVar18,8);
        }
      }
      if (uStack0000000000000158 != 0) {
        func_0x00187bd4(in_stack_00000160,uStack0000000000000158 << 2,4);
      }
      func_0x004bc638(&uStack0000000000000070);
      if (in_stack_00000108 != 0) {
        uVar8 = in_stack_00000108 * 4 + 0xbU & 0xfffffffffffffff8;
        lVar18 = in_stack_00000108 + uVar8 + 9;
        if (lVar18 != 0) {
          func_0x00187bd4(in_stack_00000100 - uVar8,lVar18,8);
        }
      }
      uVar8 = in_stack_00000128;
      if (in_stack_00000128 != 0) {
        if (in_stack_00000138 != 0) {
          plVar16 = in_stack_00000120 + 1;
          lVar18 = *in_stack_00000120;
          uVar19 = CONCAT17(-(-1 < lVar18),
                            CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar18 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8)),
                                                           -(-1 < (char)lVar18)))))))) &
                   0x8080808080808080;
          plVar6 = in_stack_00000120;
          lVar18 = in_stack_00000138;
          do {
            while (uVar19 == 0) {
              lVar24 = *plVar16;
              plVar6 = plVar6 + -0x20;
              plVar16 = plVar16 + 1;
              uVar19 = CONCAT17(-(-1 < lVar24),
                                CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar24 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8)),
                                                           -(-1 < (char)lVar24)))))))) &
                       0x8080808080808080;
            }
            uVar15 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
            uVar15 = LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) & 0x78;
            lVar24 = *(long *)((long)plVar6 + uVar15 * -4 + -0x20);
            if (lVar24 != 0) {
              func_0x00187bd4(*(undefined8 *)((long)plVar6 + uVar15 * -4 + -0x18),lVar24,1);
            }
            uVar19 = uVar19 - 1 & uVar19;
            lVar18 = lVar18 + -1;
          } while (lVar18 != 0);
        }
        lVar18 = uVar8 * 0x21 + 0x29;
        if (lVar18 != 0) {
          func_0x00187bd4(in_stack_00000120 + uVar8 * -4 + -4,lVar18,8);
        }
      }
      return;
    }
  }
  func_0x007a23bc(&UNK_009e6a58);
code_r0x004c9be0:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4c9be4);
  (*pcVar4)();
code_r0x004c92b0:
  func_0x004d1c68(&uStack0000000000000170,uVar8);
  func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,uVar8);
  if (puVar3 == unaff_x21) {
    func_0x007a23bc(&UNK_009e69d0);
    goto code_r0x004c9be0;
  }
  in_stack_000001b8 = in_stack_00000058;
  uStack00000000000001b0 = in_stack_00000050;
  in_stack_000001c8 = in_stack_00000048;
  in_stack_000001c0 = in_stack_00000040;
  uStack0000000000000190 = puVar3;
  in_stack_00000198 = puVar3;
  in_stack_000001a0 = puVar10;
  func_0x004c86b0(&uStack0000000000000190,&uStack00000000000001b0);
  lVar18 = in_stack_000001b8;
  lVar24 = in_stack_00000010 + in_stack_000001b8 * 0x19;
  plVar6 = uStack00000000000001b0 + in_stack_000001b8 * -3 + -3;
  if (in_stack_000001c8 != 0) {
    plVar16 = uStack00000000000001b0 + 1;
    lVar25 = *uStack00000000000001b0;
    uVar19 = CONCAT17(-(-1 < lVar25),
                      CONCAT16(-(-1 < (char)((ulong)lVar25 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar25 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar25 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar25 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar25 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar25 >> 8)),-(-1 < (char)lVar25)))))))) &
             0x8080808080808080;
    plVar17 = uStack00000000000001b0;
    lVar25 = in_stack_000001c8;
joined_r0x004c9338:
    while( true ) {
      uVar15 = in_stack_00000128;
      plVar2 = in_stack_00000120;
      if (uVar19 != 0) break;
      lVar21 = *plVar16;
      uVar19 = CONCAT17(-(-1 < lVar21),
                        CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar21 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
               0x8080808080808080;
      plVar16 = plVar16 + 1;
      plVar17 = plVar17 + -0x18;
    }
    uVar14 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    uVar19 = uVar19 - 1 & uVar19;
    iVar5 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3);
    lVar25 = lVar25 + -1;
    puVar10 = (undefined *)plVar17[(long)-iVar5 * 3 + -3];
    if (puVar10 == unaff_x21) goto joined_r0x004c9568;
    puVar11 = (ulong *)plVar17[(long)-iVar5 * 3 + -2];
    if (in_stack_00000138 != 0) {
      uVar22 = plVar17[(long)-iVar5 * 3 + -1];
      uVar14 = uVar22;
      if (uVar22 < 8) {
        uVar7 = 0;
        puVar12 = puVar11;
        puVar13 = puVar11;
        if (3 < uVar22) goto code_r0x004c93c8;
code_r0x004c9548:
        if (uVar14 < 2) goto code_r0x004c93e0;
code_r0x004c9550:
        puVar13 = (ulong *)((long)puVar12 + 2);
        uVar7 = ((ulong)(ushort)*puVar12 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        if (uVar14 != 2) goto code_r0x004c93e4;
      }
      else {
        uVar7 = 0;
        puVar13 = puVar11;
        do {
          puVar12 = puVar13 + 1;
          uVar7 = (*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
          uVar14 = uVar14 - 8;
          puVar13 = puVar12;
        } while (7 < uVar14);
        if (uVar14 < 4) goto code_r0x004c9548;
code_r0x004c93c8:
        puVar12 = (ulong *)((long)puVar13 + 4);
        uVar7 = ((ulong)(uint)*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        uVar14 = uVar14 - 4;
        if (1 < uVar14) goto code_r0x004c9550;
code_r0x004c93e0:
        puVar13 = puVar12;
        if (uVar14 != 0) {
code_r0x004c93e4:
          uVar7 = ((ulong)(byte)*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        }
      }
      lVar21 = 0;
      uVar7 = ((uVar7 >> 0x3b | uVar7 << 5) ^ 0xff) * unaff_x20;
      bVar9 = (byte)(uVar7 >> 0x39);
      uVar7 = uVar7 & in_stack_00000128;
      uVar27 = *(undefined8 *)((long)in_stack_00000120 + uVar7);
      uVar14 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar9),
                        CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar9),
                                 CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar9),
                                          CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar9),
                                                   CONCAT13(-((byte)((ulong)uVar27 >> 0x18) == bVar9
                                                             ),CONCAT12(-((byte)((ulong)uVar27 >>
                                                                                0x10) == bVar9),
                                                                        CONCAT11(-((byte)((ulong)
                                                  uVar27 >> 8) == bVar9),-((byte)uVar27 == bVar9))))
                                                  ))));
      while( true ) {
        uVar14 = uVar14 & 0x8080808080808080;
        if (uVar14 != 0) {
          do {
            uVar20 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar14 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            uVar20 = uVar7 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & uVar15;
            if ((uVar22 == plVar2[uVar20 * -4 + -2]) &&
               (iVar5 = _memcmp(puVar11,plVar2[uVar20 * -4 + -3],uVar22), iVar5 == 0)) {
              lVar21 = plVar2[uVar20 * -4 + -1];
              iVar5 = func_0x00584798(&uStack0000000000000070,(int)lVar21);
              lVar23 = in_stack_00000168;
              if (iVar5 != 0) {
                if (in_stack_00000168 == uStack0000000000000158) {
                  func_0x005bcf2c(&uStack0000000000000158,&UNK_009e6a40);
                }
                *(int *)(in_stack_00000160 + lVar23 * 4) = (int)lVar21;
                in_stack_00000168 = lVar23 + 1;
              }
              if (puVar10 != (undefined *)0x0) {
                func_0x00187bd4(puVar11,puVar10,1);
              }
              unaff_x20 = 0x517cc1b727220a95;
              unaff_x21 = (undefined *)0x8000000000000000;
              if (lVar25 != 0) goto joined_r0x004c9338;
              goto code_r0x004c956c;
            }
            uVar14 = uVar14 - 1 & uVar14;
          } while (uVar14 != 0);
        }
        bVar26 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar27 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar27
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar27 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar27 >> 8) == -1),
                                                           -((char)uVar27 == -1)))))))),1);
        if ((bVar26 & 1) != 0) break;
        lVar21 = lVar21 + 8;
        uVar7 = uVar7 + lVar21 & uVar15;
        uVar27 = *(undefined8 *)((long)plVar2 + uVar7);
        uVar14 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar9),
                          CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar9),
                                   CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar9),
                                            CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar9),
                                                     CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                               bVar9),CONCAT12(-((byte)((ulong)
                                                  uVar27 >> 0x10) == bVar9),
                                                  CONCAT11(-((byte)((ulong)uVar27 >> 8) == bVar9),
                                                           -((byte)uVar27 == bVar9))))))));
      }
    }
    func_0x007a23d8(&UNK_008a25de,0x16,&UNK_009e6a28);
    goto code_r0x004c9be0;
  }
code_r0x004c956c:
  if ((lVar18 != 0) && (lVar24 != 0)) {
    func_0x00187bd4(plVar6,lVar24,8);
  }
  unaff_x28 = 0x108;
  if (((in_stack_00000150 != 0) &&
      (lVar18 = in_stack_00000148 + in_stack_00000150 * 0x108, lVar18 != 0x108)) &&
     (*(long *)(lVar18 + -0xf0) == 0x11)) {
    lVar24 = *(long *)(lVar18 + -0x100);
    lVar18 = *(long *)(lVar18 + -0xf8);
    lVar25 = lVar18 + -1;
    if (lVar18 != 0 && lVar25 != 0) {
      if (*(char *)(lVar24 + 1) < -0x40) goto code_r0x004c9ba0;
    }
    else {
      if (lVar25 != 0) {
code_r0x004c9ba0:
        func_0x007a297c(lVar24,lVar18,1,lVar18,&UNK_009e69e8);
        goto code_r0x004c9be0;
      }
      lVar25 = 0;
    }
    *(ulong *)(unaff_x29 + -0x98) = uVar8;
    *(undefined8 *)(unaff_x29 + -0x90) = 0;
    *(undefined8 *)(unaff_x29 + -0x88) = 1;
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    iVar5 = func_0x00476678(unaff_x29 + -0x98,&uStack00000000000001f0);
    if (iVar5 != 0) {
      func_0x007a2810(&UNK_008a1efb,0x37,unaff_x29 + -0x69,&UNK_009e5928,&UNK_009e58f8);
      goto code_r0x004c9be0;
    }
    lVar18 = *(long *)(unaff_x29 + -0x90);
    uVar27 = *(undefined8 *)(unaff_x29 + -0x88);
    if ((lVar25 == *(long *)(unaff_x29 + -0x80)) &&
       (iVar5 = _memcmp(lVar24 + 1,uVar27,lVar25), iVar5 == 0)) {
      if (lVar18 != 0) {
        func_0x00187bd4(uVar27,lVar18,1);
      }
      if (in_stack_00000150 != 0) {
        in_stack_00000150 = in_stack_00000150 + -1;
        _memmove(&uStack00000000000001f0,in_stack_00000148 + in_stack_00000150 * 0x108,0x108);
        if (puVar3 != (undefined *)0x21) {
          func_0x004bba74(&uStack00000000000001f0);
        }
      }
    }
    else if (lVar18 != 0) {
      func_0x00187bd4(uVar27,lVar18,1);
    }
  }
  unaff_x23 = in_stack_000001a0;
  if ((in_stack_000001a0 == (undefined *)0x0) || (*(long *)(in_stack_00000198 + 0x18) != 0x12))
  goto code_r0x004c96cc;
  goto code_r0x004c9778;
joined_r0x004c9568:
  for (; lVar25 != 0; lVar25 = lVar25 + -1) {
    while (uVar19 == 0) {
      lVar21 = *plVar16;
      plVar17 = plVar17 + -0x18;
      plVar16 = plVar16 + 1;
      uVar19 = CONCAT17(-(-1 < lVar21),
                        CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar21 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
               0x8080808080808080;
    }
    uVar15 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
    iVar5 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3);
    if (plVar17[(long)-iVar5 * 3 + -3] != 0) {
      func_0x00187bd4(plVar17[(long)-iVar5 * 3 + -2],plVar17[(long)-iVar5 * 3 + -3],1);
    }
    uVar19 = uVar19 - 1 & uVar19;
  }
  goto code_r0x004c956c;
code_r0x004c96cc:
  *(ulong *)(unaff_x29 + -0x98) = uVar8;
  *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x98;
  goto code_r0x004c96d8;
}

