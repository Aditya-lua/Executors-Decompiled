
void FUN_0047d484(long *param_1)

{
  long *plVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined4 *puVar4;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x19;
  long *unaff_x21;
  long *unaff_x22;
  long *plVar9;
  ulong uVar10;
  long lVar11;
  undefined *unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  long lVar12;
  byte bVar13;
  byte bVar14;
  undefined8 uVar15;
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  int iStack00000000000000c8;
  undefined4 uStack00000000000000cc;
  undefined8 *in_stack_000000e0;
  ulong in_stack_000000e8;
  long in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  long *in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000138;
  long *in_stack_00000140;
  long in_stack_00000148;
  long in_stack_00000158;
  undefined8 uStack0000000000000160;
  undefined4 *in_stack_00000168;
  undefined8 in_stack_00000170;
  long in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  
  while (param_1 != (long *)0x0) {
    in_stack_00000170 = *(undefined8 *)(unaff_x29 + -0xb0);
    lVar5 = *(long *)(unaff_x29 + -0xa8);
    uVar10 = *(ulong *)(unaff_x29 + -0xa0);
    in_stack_00000178 = lVar5 + uVar10 * 0x108;
    lVar11 = unaff_x22[2];
    uStack0000000000000160 = lVar5;
    in_stack_00000168 = (undefined4 *)lVar5;
    if ((ulong)(*unaff_x22 - lVar11) < uVar10) {
      func_0x007a4b4c(unaff_x22,lVar11,uVar10,8,0x108);
      lVar11 = unaff_x22[2];
    }
    _memcpy(unaff_x22[1] + lVar11 * 0x108,lVar5,uVar10 * 0x108);
    unaff_x22[2] = lVar11 + uVar10;
    in_stack_00000178 = lVar5;
    func_0x004b7f04(&uStack0000000000000160);
    if (iStack00000000000000c8 != 1) {
      func_0x007a23bc(&UNK_009e1178);
      goto code_r0x0047da70;
    }
    in_stack_00000168 = *(undefined4 **)(unaff_x29 + -0x88);
    uStack0000000000000160 = *(long *)(unaff_x29 + -0x90);
    in_stack_00000170 = *(undefined8 *)(unaff_x29 + -0x80);
    func_0x00584c34(unaff_x29 + -0x78,&uStack0000000000000020,uStack00000000000000cc,
                    &uStack0000000000000160);
    func_0x0048e1b8(unaff_x29 + -0x78);
    if (*(long *)(unaff_x29 + -0x78) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(long *)(unaff_x29 + -0x78) * 0x28,8);
    }
    if (unaff_x28 == unaff_x21) {
      if (unaff_x19 != 0) {
        func_0x00187bd4();
      }
      uVar3 = func_0x00584f94(&uStack0000000000000020);
      puVar4 = (undefined4 *)func_0x00187bd0(0x28,8);
      if (puVar4 == (undefined4 *)0x0) {
        func_0x007a1f18(8,0x28);
        goto code_r0x0047da70;
      }
      if (in_stack_000000f8 == 0) goto code_r0x0047d8f8;
      lVar5 = 0;
      uVar7 = 0;
      uVar15 = *in_stack_000000e0;
      uVar10 = CONCAT17(-((char)((ulong)uVar15 >> 0x38) == '\0'),
                        CONCAT16(-((char)((ulong)uVar15 >> 0x30) == '\0'),
                                 CONCAT15(-((char)((ulong)uVar15 >> 0x28) == '\0'),
                                          CONCAT14(-((char)((ulong)uVar15 >> 0x20) == '\0'),
                                                   CONCAT13(-((char)((ulong)uVar15 >> 0x18) == '\0')
                                                            ,CONCAT12(-((char)((ulong)uVar15 >> 0x10
                                                                              ) == '\0'),
                                                                      CONCAT11(-((char)((ulong)
                                                  uVar15 >> 8) == '\0'),-((char)uVar15 == '\0'))))))
                                )) & 0x8080808080808080;
      goto joined_r0x0047d5f0;
    }
    if (in_stack_000000f8 == 0) {
code_r0x0047d570:
      func_0x007a23bc(&UNK_009e1fc8);
      goto code_r0x0047da70;
    }
    lVar5 = 0;
    lVar11 = *unaff_x28;
    bVar14 = (byte)((ulong)(lVar11 * 0x517cc1b727220a95) >> 0x39);
    uVar7 = lVar11 * 0x517cc1b727220a95 & in_stack_000000e8;
    uVar3 = *(undefined8 *)((long)in_stack_000000e0 + uVar7);
    uVar10 = CONCAT17(-((byte)((ulong)uVar3 >> 0x38) == bVar14),
                      CONCAT16(-((byte)((ulong)uVar3 >> 0x30) == bVar14),
                               CONCAT15(-((byte)((ulong)uVar3 >> 0x28) == bVar14),
                                        CONCAT14(-((byte)((ulong)uVar3 >> 0x20) == bVar14),
                                                 CONCAT13(-((byte)((ulong)uVar3 >> 0x18) == bVar14),
                                                          CONCAT12(-((byte)((ulong)uVar3 >> 0x10) ==
                                                                    bVar14),CONCAT11(-((byte)((ulong
                                                  )uVar3 >> 8) == bVar14),-((byte)uVar3 == bVar14)))
                                                  ))))) & 0x8080808080808080;
    while( true ) {
      while (uVar10 == 0) {
        bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar3 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar3 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar3 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar3 >> 0x20) == -1
                                                                 ),CONCAT13(-((char)((ulong)uVar3 >>
                                                                                    0x18) == -1),
                                                                            CONCAT12(-((char)((ulong
                                                  )uVar3 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar3 >> 8) == -1),
                                                           -((char)uVar3 == -1)))))))),1);
        if ((bVar13 & 1) != 0) goto code_r0x0047d570;
        lVar5 = lVar5 + 8;
        uVar7 = uVar7 + lVar5 & in_stack_000000e8;
        uVar3 = *(undefined8 *)((long)in_stack_000000e0 + uVar7);
        uVar10 = CONCAT17(-((byte)((ulong)uVar3 >> 0x38) == bVar14),
                          CONCAT16(-((byte)((ulong)uVar3 >> 0x30) == bVar14),
                                   CONCAT15(-((byte)((ulong)uVar3 >> 0x28) == bVar14),
                                            CONCAT14(-((byte)((ulong)uVar3 >> 0x20) == bVar14),
                                                     CONCAT13(-((byte)((ulong)uVar3 >> 0x18) ==
                                                               bVar14),CONCAT12(-((byte)((ulong)
                                                  uVar3 >> 0x10) == bVar14),
                                                  CONCAT11(-((byte)((ulong)uVar3 >> 8) == bVar14),
                                                           -((byte)uVar3 == bVar14)))))))) &
                 0x8080808080808080;
      }
      uVar8 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar8 = uVar7 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & in_stack_000000e8;
      if (lVar11 == in_stack_000000e0[uVar8 * -2 + -2]) break;
      uVar10 = uVar10 - 1 & uVar10;
    }
    uStack00000000000000cc = *(undefined4 *)(in_stack_000000e0 + uVar8 * -2 + -1);
    iStack00000000000000c8 = 1;
    func_0x0047e16c(&uStack0000000000000160,&uStack0000000000000020,lVar11,unaff_x28[1]);
    *(undefined4 **)(unaff_x29 + -0xa8) = in_stack_00000168;
    *(long *)(unaff_x29 + -0xb0) = uStack0000000000000160;
    *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_00000170;
    *(undefined8 *)(unaff_x29 + -0x88) = in_stack_00000180;
    *(long *)(unaff_x29 + -0x90) = in_stack_00000178;
    *(undefined8 *)(unaff_x29 + -0x80) = in_stack_00000188;
    if (iStack00000000000000c8 != 1) goto code_r0x0047d9c4;
    param_1 = (long *)func_0x005847cc(&uStack0000000000000020,uStack00000000000000cc);
    unaff_x22 = param_1;
    unaff_x28 = unaff_x28 + 2;
  }
  unaff_x27 = &UNK_009e1160;
code_r0x0047d9c4:
  func_0x007a23bc(unaff_x27);
code_r0x0047da70:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x47da74);
  (*pcVar2)();
code_r0x0047d8f8:
  func_0x007a23bc(&UNK_009e1fc8);
  goto code_r0x0047da70;
joined_r0x0047d5f0:
  if (uVar10 == 0) {
    bVar14 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar15 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar15 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar15 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar15 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar15 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar15 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar15 >> 8) == -1),
                                                           -((char)uVar15 == -1)))))))),1);
    if ((bVar14 & 1) != 0) goto code_r0x0047d8f8;
    lVar5 = lVar5 + 8;
    uVar7 = uVar7 + lVar5 & in_stack_000000e8;
    uVar15 = *(undefined8 *)((long)in_stack_000000e0 + uVar7);
    uVar10 = CONCAT17(-((char)((ulong)uVar15 >> 0x38) == '\0'),
                      CONCAT16(-((char)((ulong)uVar15 >> 0x30) == '\0'),
                               CONCAT15(-((char)((ulong)uVar15 >> 0x28) == '\0'),
                                        CONCAT14(-((char)((ulong)uVar15 >> 0x20) == '\0'),
                                                 CONCAT13(-((char)((ulong)uVar15 >> 0x18) == '\0'),
                                                          CONCAT12(-((char)((ulong)uVar15 >> 0x10)
                                                                    == '\0'),
                                                                   CONCAT11(-((char)((ulong)uVar15
                                                                                    >> 8) == '\0'),
                                                                            -((char)uVar15 == '\0'))
                                                                  )))))) & 0x8080808080808080;
    goto joined_r0x0047d5f0;
  }
  uVar8 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  uVar8 = uVar7 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & in_stack_000000e8;
  if (in_stack_000000e0[uVar8 * -2 + -2] != 0) {
    uVar10 = uVar10 - 1 & uVar10;
    goto joined_r0x0047d5f0;
  }
  *puVar4 = *(undefined4 *)(in_stack_000000e0 + uVar8 * -2 + -1);
  *(undefined8 *)(puVar4 + 2) = 0;
  *(undefined8 *)(puVar4 + 4) = 8;
  *(undefined8 *)(puVar4 + 6) = 0;
  *(undefined1 *)(puVar4 + 8) = 0;
  uStack0000000000000160 = 1;
  in_stack_00000170 = 1;
  in_stack_00000168 = puVar4;
  func_0x00584c34(unaff_x29 + -0x78,&uStack0000000000000020,uVar3,&uStack0000000000000160);
  func_0x0048e1b8(unaff_x29 + -0x78);
  if (*(long *)(unaff_x29 + -0x78) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(long *)(unaff_x29 + -0x78) * 0x28,8);
  }
  func_0x00585690(&uStack0000000000000020,uVar3);
  if (*(long *)(unaff_x29 + -200) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xc0),*(long *)(unaff_x29 + -200) << 3,8);
  }
  in_stack_00000008[0xd] = in_stack_00000088;
  in_stack_00000008[0xc] = in_stack_00000080;
  in_stack_00000008[0xf] = in_stack_00000098;
  in_stack_00000008[0xe] = in_stack_00000090;
  in_stack_00000008[5] = in_stack_00000048;
  in_stack_00000008[4] = in_stack_00000040;
  in_stack_00000008[7] = in_stack_00000058;
  in_stack_00000008[6] = in_stack_00000050;
  in_stack_00000008[9] = in_stack_00000068;
  in_stack_00000008[8] = in_stack_00000060;
  in_stack_00000008[0xb] = in_stack_00000078;
  in_stack_00000008[10] = in_stack_00000070;
  in_stack_00000008[1] = in_stack_00000028;
  *in_stack_00000008 = uStack0000000000000020;
  in_stack_00000008[3] = in_stack_00000038;
  in_stack_00000008[2] = in_stack_00000030;
  in_stack_00000008[0x11] = in_stack_000000a8;
  in_stack_00000008[0x10] = in_stack_000000a0;
  in_stack_00000008[0x13] = in_stack_000000b8;
  in_stack_00000008[0x12] = in_stack_000000b0;
  in_stack_00000008[0x16] = in_stack_00000108;
  in_stack_00000008[0x15] = in_stack_00000100;
  in_stack_00000008[0x14] = in_stack_000000c0;
  in_stack_00000008[0x18] = in_stack_00000118;
  in_stack_00000008[0x17] = in_stack_00000110;
  if ((in_stack_000000e8 != 0) && (lVar5 = in_stack_000000e8 * 0x11 + 0x19, lVar5 != 0)) {
    func_0x00187bd4(in_stack_000000e0 + in_stack_000000e8 * -2 + -2,lVar5,8);
  }
  lVar5 = in_stack_00000128;
  if (in_stack_00000128 != 0) {
    if (in_stack_00000138 != 0) {
      plVar9 = in_stack_00000120 + 1;
      lVar11 = *in_stack_00000120;
      uVar10 = CONCAT17(-(-1 < lVar11),
                        CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar11 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
               0x8080808080808080;
      plVar1 = in_stack_00000120;
      lVar11 = in_stack_00000138;
      do {
        while (uVar10 == 0) {
          lVar12 = *plVar9;
          plVar1 = plVar1 + -0x10;
          plVar9 = plVar9 + 1;
          uVar10 = CONCAT17(-(-1 < lVar12),
                            CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar12 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar12 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar12 >> 8)),
                                                           -(-1 < (char)lVar12)))))))) &
                   0x8080808080808080;
        }
        uVar7 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        plVar6 = *(long **)((long)plVar1 +
                           (LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) & 0x78U) * -2 + -8);
        lVar12 = *plVar6;
        *plVar6 = lVar12 + -1;
        LORelease();
        if (lVar12 == 1) {
          func_0x005d2ac4();
        }
        uVar10 = uVar10 - 1 & uVar10;
        lVar11 = lVar11 + -1;
      } while (lVar11 != 0);
    }
    lVar11 = lVar5 * 0x11 + 0x19;
    if (lVar11 != 0) {
      func_0x00187bd4(in_stack_00000120 + lVar5 * -2 + -2,lVar11,8);
    }
  }
  lVar5 = in_stack_00000148;
  if (in_stack_00000148 != 0) {
    if (in_stack_00000158 != 0) {
      plVar9 = in_stack_00000140 + 1;
      lVar11 = *in_stack_00000140;
      uVar10 = CONCAT17(-(-1 < lVar11),
                        CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar11 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
               0x8080808080808080;
      plVar1 = in_stack_00000140;
      lVar11 = in_stack_00000158;
      do {
        while( true ) {
          while (uVar10 == 0) {
            lVar12 = *plVar9;
            plVar1 = plVar1 + -0x20;
            plVar9 = plVar9 + 1;
            uVar10 = CONCAT17(-(-1 < lVar12),
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
          uVar7 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
          uVar7 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) & 0x78;
          lVar12 = *(long *)((long)plVar1 + uVar7 * -4 + -0x18);
          if (-0x7ffffffffffffffc < lVar12 && lVar12 != 0) break;
          uVar10 = uVar10 - 1 & uVar10;
          lVar11 = lVar11 + -1;
          if (lVar11 == 0) goto code_r0x0047d8b8;
        }
        func_0x00187bd4(*(undefined8 *)((long)plVar1 + uVar7 * -4 + -0x10),lVar12,1);
        uVar10 = uVar10 - 1 & uVar10;
        lVar11 = lVar11 + -1;
      } while (lVar11 != 0);
    }
code_r0x0047d8b8:
    lVar11 = lVar5 * 0x21 + 0x29;
    if (lVar11 != 0) {
      func_0x00187bd4(in_stack_00000140 + lVar5 * -4 + -4,lVar11,8);
    }
  }
  return;
}

