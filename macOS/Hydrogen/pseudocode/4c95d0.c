
/* WARNING: Type propagation algorithm not settling */

void FUN_004c95d0(void)

{
  uint uVar1;
  long *plVar2;
  undefined *puVar3;
  code *pcVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  byte bVar9;
  undefined *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  long *unaff_x19;
  long unaff_x20;
  undefined *unaff_x21;
  int unaff_w22;
  long *plVar14;
  long *unaff_x23;
  long lVar15;
  long unaff_x24;
  ulong uVar16;
  ulong uVar17;
  long unaff_x25;
  long lVar18;
  ulong uVar19;
  long lVar20;
  ulong unaff_x28;
  long unaff_x29;
  long lVar21;
  byte bVar22;
  undefined8 uVar23;
  long in_stack_00000010;
  ulong in_stack_00000018;
  long *in_stack_00000020;
  long *in_stack_00000030;
  long in_stack_00000038;
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
  undefined *in_stack_00000208;
  
  do {
    unaff_x24 = unaff_x24 + -1;
joined_r0x004c95d4:
    if (unaff_x24 == 0) {
LAB_004c956c:
      if ((in_stack_00000038 != 0) && (unaff_x25 != 0)) {
        func_0x00187bd4(in_stack_00000020,unaff_x25,8);
      }
      if (((in_stack_00000150 != 0) &&
          (lVar21 = in_stack_00000148 + in_stack_00000150 * 0x108, lVar21 != 0x108)) &&
         (*(long *)(lVar21 + -0xf0) == 0x11)) {
        lVar6 = *(long *)(lVar21 + -0x100);
        lVar21 = *(long *)(lVar21 + -0xf8);
        lVar15 = lVar21 + -1;
        if (lVar21 != 0 && lVar15 != 0) {
          if (*(char *)(lVar6 + 1) < -0x40) goto code_r0x004c9ba0;
        }
        else {
          if (lVar15 != 0) {
code_r0x004c9ba0:
            func_0x007a297c(lVar6,lVar21,1,lVar21,&UNK_009e69e8);
            goto code_r0x004c9be0;
          }
          lVar15 = 0;
        }
        *(ulong *)(unaff_x29 + -0x98) = in_stack_00000018;
        *(undefined8 *)(unaff_x29 + -0x90) = 0;
        *(undefined8 *)(unaff_x29 + -0x88) = 1;
        *(undefined8 *)(unaff_x29 + -0x80) = 0;
        iVar5 = func_0x00476678(unaff_x29 + -0x98,&uStack00000000000001f0);
        if (iVar5 != 0) {
          func_0x007a2810(&UNK_008a1efb,0x37,unaff_x29 + -0x69,&UNK_009e5928,&UNK_009e58f8);
          goto code_r0x004c9be0;
        }
        lVar21 = *(long *)(unaff_x29 + -0x90);
        uVar23 = *(undefined8 *)(unaff_x29 + -0x88);
        if ((lVar15 == *(long *)(unaff_x29 + -0x80)) &&
           (iVar5 = _memcmp(lVar6 + 1,uVar23,lVar15), iVar5 == 0)) {
          if (lVar21 != 0) {
            func_0x00187bd4(uVar23,lVar21,1);
          }
          if (in_stack_00000150 != 0) {
            in_stack_00000150 = in_stack_00000150 + -1;
            _memmove(&uStack00000000000001f0,in_stack_00000148 + in_stack_00000150 * 0x108,0x108);
            if (in_stack_00000208 != (undefined *)0x21) {
              func_0x004bba74(&uStack00000000000001f0);
            }
          }
        }
        else if (lVar21 != 0) {
          func_0x00187bd4(uVar23,lVar21,1);
        }
      }
      puVar10 = in_stack_000001a0;
      if ((in_stack_000001a0 == (undefined *)0x0) || (*(long *)(in_stack_00000198 + 0x18) != 0x12))
      {
        *(ulong *)(unaff_x29 + -0x98) = in_stack_00000018;
        *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x98;
        *(undefined **)(unaff_x29 + -0x88) =
             &
             __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
        ;
        func_0x00459f08(&uStack00000000000001d8,&uStack00000000000001f0);
        lVar21 = in_stack_00000150;
        if (in_stack_00000150 == uStack0000000000000140) {
          func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a10);
        }
        _memcpy(in_stack_00000148 + lVar21 * 0x108,&uStack00000000000001f0,0x108);
        in_stack_00000150 = lVar21 + 1;
      }
      in_stack_00000208 = in_stack_00000198;
      puVar3 = uStack0000000000000190;
      if ((undefined *)(uStack0000000000000140 - in_stack_00000150) < puVar10) {
        func_0x007a535c(&uStack0000000000000140,in_stack_00000150,puVar10,8,0x108);
      }
      lVar21 = in_stack_00000150;
      _memcpy(in_stack_00000148 + in_stack_00000150 * 0x108,in_stack_00000208,(long)puVar10 * 0x108)
      ;
      in_stack_00000150 = lVar21 + (long)puVar10;
      func_0x004d3808(&uStack00000000000001f0);
      lVar21 = in_stack_00000090;
      while (in_stack_00000168 != 0) {
        in_stack_00000168 = in_stack_00000168 + -1;
        uVar1 = *(uint *)(in_stack_00000160 + in_stack_00000168 * 4);
        in_stack_00000018 = (ulong)uVar1;
        if (in_stack_00000188 == 0) goto code_r0x004c92b0;
        lVar6 = 0;
        bVar9 = (byte)(in_stack_00000018 * unaff_x20 >> 0x39);
        uVar16 = in_stack_00000018 * unaff_x20 & in_stack_00000178;
        uVar23 = *(undefined8 *)(uStack0000000000000170 + uVar16);
        uVar8 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar9),
                         CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar9),
                                  CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar9),
                                           CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar9),
                                                    CONCAT13(-((byte)((ulong)uVar23 >> 0x18) ==
                                                              bVar9),CONCAT12(-((byte)((ulong)uVar23
                                                                                      >> 0x10) ==
                                                                               bVar9),CONCAT11(-((
                                                  byte)((ulong)uVar23 >> 8) == bVar9),
                                                  -((byte)uVar23 == bVar9)))))))) &
                0x8080808080808080;
        while( true ) {
          while (uVar8 == 0) {
            bVar22 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar23 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar23 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar23 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar23 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar23 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar23 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar23 >> 8) ==
                                                                     -1),-((char)uVar23 == -1)))))))
                                        ),1);
            if ((bVar22 & 1) != 0) goto code_r0x004c92b0;
            lVar6 = lVar6 + 8;
            uVar16 = uVar16 + lVar6 & in_stack_00000178;
            uVar23 = *(undefined8 *)(uStack0000000000000170 + uVar16);
            uVar8 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar9),
                             CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar9),
                                      CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar9),
                                               CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar9),
                                                        CONCAT13(-((byte)((ulong)uVar23 >> 0x18) ==
                                                                  bVar9),CONCAT12(-((byte)((ulong)
                                                  uVar23 >> 0x10) == bVar9),
                                                  CONCAT11(-((byte)((ulong)uVar23 >> 8) == bVar9),
                                                           -((byte)uVar23 == bVar9)))))))) &
                    0x8080808080808080;
          }
          uVar19 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
          if (uVar1 == *(uint *)(uStack0000000000000170 + -4 +
                                (uVar16 + ((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) &
                                in_stack_00000178) * -4)) break;
          uVar8 = uVar8 - 1 & uVar8;
        }
      }
      lVar6 = in_stack_00000090 + in_stack_00000098 * 0x20;
      func_0x004d03bc(&uStack00000000000001b0,&uStack00000000000001f0,&UNK_009e5910);
      lVar15 = in_stack_000001b8;
      plVar2 = uStack00000000000001b0;
      if (in_stack_000001c0 == 0) goto code_r0x004c9a8c;
      lVar18 = 0;
      lVar20 = in_stack_000001c0 * 4;
      uVar8 = 0;
      while( true ) {
        uVar16 = (ulong)*(uint *)(lVar15 + lVar18);
        func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,uVar16);
        if (lVar21 == -0x8000000000000000) break;
        *(long *)(unaff_x29 + -0x88) = lVar6;
        *(long *)(unaff_x29 + -0x90) = lVar21;
        *(ulong *)(unaff_x29 + -0x80) = uVar8;
        if ((uVar8 == 0) ||
           (lVar21 = *(long *)(unaff_x29 + -0x88), *(long *)(lVar21 + 0x18) != 0x12)) {
          *(ulong *)(unaff_x29 + -0x98) = uVar16;
          uStack0000000000000190 = (undefined *)(unaff_x29 + -0x98);
          in_stack_00000198 =
               &
               __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
          ;
          func_0x00459f08(&uStack00000000000001b0,&uStack00000000000001f0);
          lVar21 = in_stack_00000150;
          if (in_stack_00000150 == uStack0000000000000140) {
            func_0x005bd0a4(&uStack0000000000000140,&UNK_009e6a70);
          }
          _memcpy(in_stack_00000148 + lVar21 * 0x108,&uStack00000000000001f0,0x108);
          in_stack_00000150 = lVar21 + 1;
          lVar21 = *(long *)(unaff_x29 + -0x88);
        }
        uVar16 = *(ulong *)(unaff_x29 + -0x90);
        if ((ulong)(uStack0000000000000140 - in_stack_00000150) < uVar8) {
          func_0x007a535c(&uStack0000000000000140,in_stack_00000150,uVar8,8,0x108);
        }
        lVar6 = in_stack_00000150;
        _memcpy(in_stack_00000148 + in_stack_00000150 * 0x108,lVar21,uVar8 * 0x108);
        in_stack_00000150 = lVar6 + uVar8;
        func_0x004d3808(&uStack00000000000001f0);
        lVar18 = lVar18 + 4;
        lVar6 = lVar21;
        uVar8 = uVar16;
        if (lVar20 == lVar18) {
code_r0x004c9a8c:
          if (plVar2 != (long *)0x0) {
            func_0x00187bd4(lVar15,(long)plVar2 << 2,4);
          }
          in_stack_00000030[1] = in_stack_00000148;
          *in_stack_00000030 = uStack0000000000000140;
          in_stack_00000030[2] = in_stack_00000150;
          if (in_stack_00000178 != 0) {
            uVar8 = in_stack_00000178 * 4 + 0xb & 0xfffffffffffffff8;
            lVar21 = in_stack_00000178 + uVar8 + 9;
            if (lVar21 != 0) {
              func_0x00187bd4(uStack0000000000000170 - uVar8,lVar21,8);
            }
          }
          if (uStack0000000000000158 != 0) {
            func_0x00187bd4(in_stack_00000160,uStack0000000000000158 << 2,4);
          }
          func_0x004bc638(&uStack0000000000000070);
          if (in_stack_00000108 != 0) {
            uVar8 = in_stack_00000108 * 4 + 0xbU & 0xfffffffffffffff8;
            lVar21 = in_stack_00000108 + uVar8 + 9;
            if (lVar21 != 0) {
              func_0x00187bd4(in_stack_00000100 - uVar8,lVar21,8);
            }
          }
          uVar8 = in_stack_00000128;
          if (in_stack_00000128 != 0) {
            if (in_stack_00000138 != 0) {
              plVar14 = in_stack_00000120 + 1;
              lVar21 = *in_stack_00000120;
              uVar16 = CONCAT17(-(-1 < lVar21),
                                CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar21 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar21 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar21 >> 8)),
                                                           -(-1 < (char)lVar21)))))))) &
                       0x8080808080808080;
              plVar2 = in_stack_00000120;
              lVar21 = in_stack_00000138;
              do {
                while (uVar16 == 0) {
                  lVar6 = *plVar14;
                  plVar2 = plVar2 + -0x20;
                  plVar14 = plVar14 + 1;
                  uVar16 = CONCAT17(-(-1 < lVar6),
                                    CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                             CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                                      CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                               CONCAT13(-(-1 < (char)((ulong)lVar6
                                                                                     >> 0x18)),
                                                                        CONCAT12(-(-1 < (char)((
                                                  ulong)lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                           0x8080808080808080;
                }
                uVar19 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
                uVar19 = LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) & 0x78;
                lVar6 = *(long *)((long)plVar2 + uVar19 * -4 + -0x20);
                if (lVar6 != 0) {
                  func_0x00187bd4(*(undefined8 *)((long)plVar2 + uVar19 * -4 + -0x18),lVar6,1);
                }
                uVar16 = uVar16 - 1 & uVar16;
                lVar21 = lVar21 + -1;
              } while (lVar21 != 0);
            }
            lVar21 = uVar8 * 0x21 + 0x29;
            if (lVar21 != 0) {
              func_0x00187bd4(in_stack_00000120 + uVar8 * -4 + -4,lVar21,8);
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
    }
    while (unaff_x28 == 0) {
      lVar21 = *unaff_x19;
      unaff_x23 = unaff_x23 + -0x18;
      unaff_x19 = unaff_x19 + 1;
      unaff_x28 = CONCAT17(-(-1 < lVar21),
                           CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar21
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
                  0x8080808080808080;
    }
    uVar8 = (unaff_x28 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x28 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    lVar21 = (long)-(int)((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) * (long)unaff_w22;
    lVar6 = *(long *)((long)unaff_x23 + lVar21 + -0x18);
    if (lVar6 != 0) {
      func_0x00187bd4(*(undefined8 *)((long)unaff_x23 + lVar21 + -0x10),lVar6,1);
    }
    unaff_x28 = unaff_x28 - 1 & unaff_x28;
  } while( true );
code_r0x004c92b0:
  func_0x004d1c68(&uStack0000000000000170,in_stack_00000018);
  func_0x00584fc4(&uStack00000000000001f0,&uStack0000000000000070,in_stack_00000018);
  if (in_stack_00000208 == unaff_x21) {
    func_0x007a23bc(&UNK_009e69d0);
    goto code_r0x004c9be0;
  }
  in_stack_000001b8 = in_stack_00000058;
  uStack00000000000001b0 = in_stack_00000050;
  in_stack_000001c8 = in_stack_00000048;
  in_stack_000001c0 = in_stack_00000040;
  uStack0000000000000190 = in_stack_00000208;
  in_stack_00000198 = in_stack_00000208;
  in_stack_000001a0 = puVar3;
  func_0x004c86b0(&uStack0000000000000190,&uStack00000000000001b0);
  in_stack_00000038 = in_stack_000001b8;
  unaff_x25 = in_stack_00000010 + in_stack_000001b8 * 0x19;
  in_stack_00000020 = uStack00000000000001b0 + in_stack_000001b8 * -3 + -3;
  if (in_stack_000001c8 != 0) {
    unaff_x19 = uStack00000000000001b0 + 1;
    lVar21 = *uStack00000000000001b0;
    unaff_x28 = CONCAT17(-(-1 < lVar21),
                         CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar21 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
                0x8080808080808080;
    unaff_x23 = uStack00000000000001b0;
    unaff_x24 = in_stack_000001c8;
code_r0x004c9338:
    uVar8 = in_stack_00000128;
    plVar2 = in_stack_00000120;
    unaff_w22 = 0x18;
    while (unaff_x28 == 0) {
      lVar21 = *unaff_x19;
      unaff_x23 = unaff_x23 + -0x18;
      unaff_x19 = unaff_x19 + 1;
      unaff_x28 = CONCAT17(-(-1 < lVar21),
                           CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar21 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar21
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar21 >> 8)),-(-1 < (char)lVar21)))))))) &
                  0x8080808080808080;
    }
    uVar16 = (unaff_x28 >> 7 & 0xff00ff00ff00ff00) >> 8 | (unaff_x28 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
    unaff_x28 = unaff_x28 - 1 & unaff_x28;
    iVar5 = (int)((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3);
    unaff_x24 = unaff_x24 + -1;
    puVar10 = (undefined *)unaff_x23[(long)-iVar5 * 3 + -3];
    if (puVar10 == unaff_x21) goto joined_r0x004c95d4;
    puVar11 = (ulong *)unaff_x23[(long)-iVar5 * 3 + -2];
    if (in_stack_00000138 != 0) {
      uVar19 = unaff_x23[(long)-iVar5 * 3 + -1];
      uVar16 = uVar19;
      if (uVar19 < 8) {
        uVar7 = 0;
        puVar12 = puVar11;
        puVar13 = puVar11;
        if (3 < uVar19) goto code_r0x004c93c8;
code_r0x004c9548:
        if (uVar16 < 2) goto code_r0x004c93e0;
code_r0x004c9550:
        puVar13 = (ulong *)((long)puVar12 + 2);
        uVar7 = ((ulong)(ushort)*puVar12 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        if (uVar16 != 2) goto code_r0x004c93e4;
      }
      else {
        uVar7 = 0;
        puVar13 = puVar11;
        do {
          puVar12 = puVar13 + 1;
          uVar7 = (*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
          uVar16 = uVar16 - 8;
          puVar13 = puVar12;
        } while (7 < uVar16);
        if (uVar16 < 4) goto code_r0x004c9548;
code_r0x004c93c8:
        puVar12 = (ulong *)((long)puVar13 + 4);
        uVar7 = ((ulong)(uint)*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        uVar16 = uVar16 - 4;
        if (1 < uVar16) goto code_r0x004c9550;
code_r0x004c93e0:
        puVar13 = puVar12;
        if (uVar16 != 0) {
code_r0x004c93e4:
          uVar7 = ((ulong)(byte)*puVar13 ^ (uVar7 >> 0x3b | uVar7 << 5)) * unaff_x20;
        }
      }
      lVar21 = 0;
      uVar7 = ((uVar7 >> 0x3b | uVar7 << 5) ^ 0xff) * unaff_x20;
      bVar9 = (byte)(uVar7 >> 0x39);
      uVar7 = uVar7 & in_stack_00000128;
      uVar23 = *(undefined8 *)((long)in_stack_00000120 + uVar7);
      uVar16 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar9),
                        CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar9),
                                 CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar9),
                                          CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar9),
                                                   CONCAT13(-((byte)((ulong)uVar23 >> 0x18) == bVar9
                                                             ),CONCAT12(-((byte)((ulong)uVar23 >>
                                                                                0x10) == bVar9),
                                                                        CONCAT11(-((byte)((ulong)
                                                  uVar23 >> 8) == bVar9),-((byte)uVar23 == bVar9))))
                                                  ))));
      while( true ) {
        uVar16 = uVar16 & 0x8080808080808080;
        if (uVar16 != 0) {
          do {
            uVar17 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
            uVar17 = uVar7 + ((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) & uVar8;
            if ((uVar19 == plVar2[uVar17 * -4 + -2]) &&
               (iVar5 = _memcmp(puVar11,plVar2[uVar17 * -4 + -3],uVar19), iVar5 == 0)) {
              lVar21 = plVar2[uVar17 * -4 + -1];
              iVar5 = func_0x00584798(&uStack0000000000000070,(int)lVar21);
              lVar6 = in_stack_00000168;
              if (iVar5 != 0) {
                if (in_stack_00000168 == uStack0000000000000158) {
                  func_0x005bcf2c(&uStack0000000000000158,&UNK_009e6a40);
                }
                *(int *)(in_stack_00000160 + lVar6 * 4) = (int)lVar21;
                in_stack_00000168 = lVar6 + 1;
              }
              if (puVar10 != (undefined *)0x0) {
                func_0x00187bd4(puVar11,puVar10,1);
              }
              unaff_x20 = 0x517cc1b727220a95;
              unaff_x21 = (undefined *)0x8000000000000000;
              if (unaff_x24 != 0) goto code_r0x004c9338;
              goto LAB_004c956c;
            }
            uVar16 = uVar16 - 1 & uVar16;
          } while (uVar16 != 0);
        }
        bVar22 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar23 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar23 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar23 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar23 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar23
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar23 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar23 >> 8) == -1),
                                                           -((char)uVar23 == -1)))))))),1);
        if ((bVar22 & 1) != 0) break;
        lVar21 = lVar21 + 8;
        uVar7 = uVar7 + lVar21 & uVar8;
        uVar23 = *(undefined8 *)((long)plVar2 + uVar7);
        uVar16 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar9),
                          CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar9),
                                   CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar9),
                                            CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar9),
                                                     CONCAT13(-((byte)((ulong)uVar23 >> 0x18) ==
                                                               bVar9),CONCAT12(-((byte)((ulong)
                                                  uVar23 >> 0x10) == bVar9),
                                                  CONCAT11(-((byte)((ulong)uVar23 >> 8) == bVar9),
                                                           -((byte)uVar23 == bVar9))))))));
      }
    }
    func_0x007a23d8(&UNK_008a25de,0x16,&UNK_009e6a28);
    goto code_r0x004c9be0;
  }
  goto LAB_004c956c;
}

