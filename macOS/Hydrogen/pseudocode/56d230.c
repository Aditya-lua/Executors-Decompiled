
uint FUN_0056d230(void)

{
  undefined8 uVar1;
  undefined4 uVar2;
  uint uVar3;
  code *pcVar4;
  bool bVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  long *plVar9;
  ulong uVar10;
  byte bVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  uint unaff_w25;
  uint uVar17;
  uint *puVar18;
  ulong uVar19;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  byte bVar20;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  undefined8 uVar21;
  byte bVar27;
  undefined *in_stack_00000008;
  long in_stack_00000030;
  uint *in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  ulong in_stack_00000058;
  uint uStack0000000000000060;
  uint uStack0000000000000064;
  uint *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  ulong in_stack_000000a0;
  
code_r0x0056d230:
  func_0x00594630(unaff_x29 + -0x80,unaff_x21 + 0x18,unaff_x27);
  lVar16 = *(long *)(unaff_x29 + -0x80);
  puVar18 = in_stack_00000068;
  if (lVar16 != unaff_x22) {
    lVar14 = *(long *)(unaff_x29 + -0x78);
    lVar12 = *(long *)(unaff_x29 + -0x70) + 1;
    lVar8 = lVar14;
    while (lVar12 = lVar12 + -1, lVar12 != 0) {
      func_0x00554164(lVar8);
      lVar8 = lVar8 + 0x108;
    }
    unaff_x22 = -0x8000000000000000;
    if (lVar16 != 0) {
      func_0x00187bd4(lVar14,lVar16 * 0x108,8);
    }
  }
LAB_0056cdfc:
  do {
    do {
      do {
        if (puVar18 == in_stack_00000038) {
          if (unaff_x24 != 0) {
            func_0x00187bd4(unaff_x20,unaff_x24 << 2,4);
          }
          return unaff_w25 & 1;
        }
        in_stack_00000068 = puVar18 + 1;
        uVar3 = *puVar18;
        unaff_x27 = (ulong)uVar3;
        puVar18 = in_stack_00000068;
      } while ((*(ulong *)(unaff_x21 + 0x28) <= unaff_x27) ||
              (plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + unaff_x27 * 0x20),
              *plVar9 == unaff_x22));
      uVar21 = *(undefined8 *)(unaff_x21 + 0x38);
      uVar1 = *(undefined8 *)(unaff_x21 + 0x40);
      *(uint *)(unaff_x29 + -0x60) = uVar3;
      *(undefined8 *)(unaff_x29 + -0x78) = uVar21;
      *(undefined8 *)(unaff_x29 + -0x70) = uVar1;
      *(long *)(unaff_x29 + -0x68) = plVar9[3];
      *(undefined8 *)(unaff_x29 + -0x80) = 0;
      func_0x0055b13c(unaff_x29 + -0x98,unaff_x29 + -0x80,&UNK_009f0678);
      if (*(long *)(unaff_x29 + -0x88) == 1) {
        plVar9 = *(long **)(unaff_x29 + -0x90);
        uStack0000000000000064 = *(uint *)((long)plVar9 + 0xc);
        in_stack_00000070._4_4_ = *(uint *)(plVar9 + 2);
        bVar5 = *plVar9 == 0;
        lVar16 = *(long *)(unaff_x29 + -0x98);
      }
      else {
        bVar5 = true;
        lVar16 = *(long *)(unaff_x29 + -0x98);
      }
      if (lVar16 != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),lVar16 * 0x18,8);
      }
      if (uStack0000000000000064 == uVar3) {
        bVar5 = true;
      }
    } while (bVar5);
    uVar19 = (ulong)uStack0000000000000064;
    if (*(ulong *)(unaff_x21 + 0x28) <= uVar19) goto code_r0x0056d488;
    plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar19 * 0x20);
    if (*plVar9 == unaff_x22) goto code_r0x0056d488;
  } while ((plVar9[2] != 0) &&
          (*(long *)(plVar9[1] + 0x18) == 0x16 || *(long *)(plVar9[1] + 0x18) == 0x19));
  if ((*(ulong *)(unaff_x21 + 0x28) <= unaff_x27) ||
     (plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + unaff_x27 * 0x20), *plVar9 == unaff_x22)) {
    in_stack_00000008 = &UNK_009eede8;
code_r0x0056d488:
    func_0x007a23bc(in_stack_00000008);
code_r0x0056d4c0:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x56d4c4);
    (*pcVar4)();
  }
  if (plVar9[2] != 0) {
    uVar10 = *(ulong *)(unaff_x21 + 0x28);
joined_r0x0056d018:
    if (uVar19 < uVar10) goto code_r0x0056d01c;
    goto code_r0x0056d030;
  }
  uVar21 = *(undefined8 *)(unaff_x21 + 0x40);
  uVar2 = *(undefined4 *)((long)plVar9 + 0x1c);
  *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x21 + 0x38);
  *(undefined8 *)(unaff_x29 + -0x78) = uVar21;
  *(undefined4 *)(unaff_x29 + -0x70) = 0xffffffff;
  *(undefined4 *)(unaff_x29 + -0x6c) = uVar2;
  *(undefined4 *)(unaff_x29 + -0x68) = 0xffffffff;
  func_0x0055ba04(unaff_x29 + -0x98,unaff_x29 + -0x80,&UNK_009ee258);
  lVar12 = *(long *)(unaff_x29 + -0x98);
  uVar21 = *(undefined8 *)(unaff_x29 + -0x90);
  lVar16 = *(long *)(unaff_x29 + -0x88);
  if (lVar16 == 0) {
    uVar17 = 1;
  }
  else {
    lVar14 = 0;
    uVar17 = 1;
    do {
      uVar6 = func_0x0056c050();
      uVar7 = func_0x0056c534();
      lVar14 = lVar14 + 4;
      unaff_w25 = uVar6 | uVar7 | unaff_w25;
      uVar17 = uVar17 & (uVar6 | uVar7);
    } while (lVar16 * 4 != lVar14);
  }
  if (lVar12 != 0) {
    func_0x00187bd4(uVar21,lVar12 << 2,4);
  }
  unaff_x22 = -0x8000000000000000;
  if (uVar17 == 0) {
    uVar10 = *(ulong *)(unaff_x21 + 0x28);
    goto joined_r0x0056d018;
  }
  if ((*(int *)(unaff_x21 + 0x78) != 1) || (*(uint *)(unaff_x21 + 0x7c) != uVar3))
  goto code_r0x0056d230;
  if (uVar19 < *(ulong *)(unaff_x21 + 0x28)) {
code_r0x0056d01c:
    plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar19 * 0x20);
    if (*plVar9 != unaff_x22) {
      uVar19 = (ulong)*(uint *)((long)plVar9 + 0x1c);
      goto code_r0x0056d03c;
    }
  }
code_r0x0056d030:
  uVar19 = 0xffffffff;
code_r0x0056d03c:
  lVar12 = 0;
  lVar16 = *(long *)(unaff_x21 + 0x38);
  uVar10 = *(ulong *)(unaff_x21 + 0x40);
  uVar13 = 0xffffffff;
  if (0xffffffff < uVar10) goto code_r0x0056d07c;
  while (uVar19 < uVar10) {
    lVar14 = lVar16 + uVar19 * 0x30;
    uVar19 = (ulong)*(uint *)(lVar14 + 0x24);
    if (*(int *)(lVar14 + 0x28) != -1) {
      for (; lVar12 = lVar12 + 1, uVar13 < uVar10;
          uVar13 = (ulong)*(uint *)(lVar16 + uVar13 * 0x30 + 0x20)) {
code_r0x0056d07c:
      }
    }
  }
  if ((lVar12 == 1) &&
     (*(uint *)(unaff_x29 + -0x80) = uStack0000000000000064, in_stack_00000030 != 0)) {
    uVar19 = func_0x005763e4(unaff_x28 + 0x20,unaff_x29 + -0x80);
    lVar12 = 0;
    bVar11 = (byte)(uVar19 >> 0x39);
    while( true ) {
      uVar19 = uVar19 & in_stack_00000058;
      uVar21 = *(undefined8 *)(in_stack_00000050 + uVar19);
      bVar20 = (byte)((ulong)uVar21 >> 8);
      bVar22 = (byte)((ulong)uVar21 >> 0x10);
      bVar23 = (byte)((ulong)uVar21 >> 0x18);
      bVar24 = (byte)((ulong)uVar21 >> 0x20);
      bVar25 = (byte)((ulong)uVar21 >> 0x28);
      bVar26 = (byte)((ulong)uVar21 >> 0x30);
      bVar27 = (byte)((ulong)uVar21 >> 0x38);
      for (uVar13 = CONCAT17(-(bVar27 == bVar11),
                             CONCAT16(-(bVar26 == bVar11),
                                      CONCAT15(-(bVar25 == bVar11),
                                               CONCAT14(-(bVar24 == bVar11),
                                                        CONCAT13(-(bVar23 == bVar11),
                                                                 CONCAT12(-(bVar22 == bVar11),
                                                                          CONCAT11(-(bVar20 ==
                                                                                    bVar11),-((byte)
                                                  uVar21 == bVar11)))))))) & 0x8080808080808080;
          uVar13 != 0; uVar13 = uVar13 - 1 & uVar13) {
        uVar15 = (uVar13 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar13 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        if (uStack0000000000000064 ==
            *(uint *)(in_stack_00000048 +
                     (uVar19 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) &
                     in_stack_00000058) * -8)) {
          bVar5 = true;
          uVar13 = (ulong)uStack0000000000000064;
          goto code_r0x0056d1dc;
        }
      }
      bVar20 = NEON_umaxv(CONCAT17(-(bVar27 == 0xff),
                                   CONCAT16(-(bVar26 == 0xff),
                                            CONCAT15(-(bVar25 == 0xff),
                                                     CONCAT14(-(bVar24 == 0xff),
                                                              CONCAT13(-(bVar23 == 0xff),
                                                                       CONCAT12(-(bVar22 == 0xff),
                                                                                CONCAT11(-(bVar20 ==
                                                                                          0xff),-((
                                                  byte)uVar21 == 0xff)))))))),1);
      if ((bVar20 & 1) != 0) break;
      lVar12 = lVar12 + 8;
      uVar19 = uVar19 + lVar12;
    }
  }
  unaff_x22 = -0x8000000000000000;
  goto LAB_0056cdfc;
code_r0x0056d1dc:
  do {
    if (!bVar5) {
      unaff_x22 = -0x8000000000000000;
      goto LAB_0056cdfc;
    }
    uVar17 = (uint)uVar13;
    *(uint *)(unaff_x29 + -0x80) = uVar17;
    if (uVar17 != uStack0000000000000060) {
      uVar19 = func_0x005763e4(unaff_x28 + 0x20,unaff_x29 + -0x80);
      lVar12 = 0;
      bVar11 = (byte)(uVar19 >> 0x39);
      while( true ) {
        uVar19 = uVar19 & in_stack_00000058;
        uVar21 = *(undefined8 *)(in_stack_00000050 + uVar19);
        bVar20 = (byte)((ulong)uVar21 >> 8);
        bVar22 = (byte)((ulong)uVar21 >> 0x10);
        bVar23 = (byte)((ulong)uVar21 >> 0x18);
        bVar24 = (byte)((ulong)uVar21 >> 0x20);
        bVar25 = (byte)((ulong)uVar21 >> 0x28);
        bVar26 = (byte)((ulong)uVar21 >> 0x30);
        bVar27 = (byte)((ulong)uVar21 >> 0x38);
        for (uVar13 = CONCAT17(-(bVar27 == bVar11),
                               CONCAT16(-(bVar26 == bVar11),
                                        CONCAT15(-(bVar25 == bVar11),
                                                 CONCAT14(-(bVar24 == bVar11),
                                                          CONCAT13(-(bVar23 == bVar11),
                                                                   CONCAT12(-(bVar22 == bVar11),
                                                                            CONCAT11(-(bVar20 ==
                                                                                      bVar11),-((
                                                  byte)uVar21 == bVar11)))))))) & 0x8080808080808080
            ; uVar13 != 0; uVar13 = uVar13 - 1 & uVar13) {
          uVar15 = (uVar13 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar13 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar15 = uVar19 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) &
                   in_stack_00000058;
          if (uVar17 == *(uint *)(in_stack_00000048 + uVar15 * -8)) {
            uVar19 = (ulong)*(uint *)(in_stack_00000040 + uVar15 * -8);
            bVar5 = true;
            goto joined_r0x0056d1d8;
          }
        }
        bVar20 = NEON_umaxv(CONCAT17(-(bVar27 == 0xff),
                                     CONCAT16(-(bVar26 == 0xff),
                                              CONCAT15(-(bVar25 == 0xff),
                                                       CONCAT14(-(bVar24 == 0xff),
                                                                CONCAT13(-(bVar23 == 0xff),
                                                                         CONCAT12(-(bVar22 == 0xff),
                                                                                  CONCAT11(-(bVar20 
                                                  == 0xff),-((byte)uVar21 == 0xff)))))))),1);
        if ((bVar20 & 1) != 0) break;
        lVar12 = lVar12 + 8;
        uVar19 = uVar19 + lVar12;
      }
    }
    bVar5 = false;
joined_r0x0056d1d8:
    uVar13 = uVar19;
  } while (uVar17 != uVar3);
  if (in_stack_00000070._4_4_ < uVar10) {
    plVar9 = (long *)(lVar16 + (ulong)in_stack_00000070._4_4_ * 0x30);
    unaff_x22 = -0x8000000000000000;
    if (*plVar9 != -0x8000000000000000) {
      if (plVar9[2] != 0) goto LAB_0056cdfc;
      func_0x0058497c(&uStack0000000000000078);
      func_0x00594630(unaff_x29 + -0x80,unaff_x21 + 0x18,uStack0000000000000064);
      if (*(long *)(unaff_x29 + -0x80) == -0x8000000000000000) {
        func_0x007a23bc(&UNK_009eee18);
        goto code_r0x0056d4c0;
      }
      lVar16 = *(long *)(unaff_x29 + -0x78);
      in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0x80);
      uVar19 = *(ulong *)(unaff_x29 + -0x70);
      in_stack_00000098 = lVar16;
      in_stack_000000a0 = uVar19;
      if ((*(int *)(unaff_x21 + 0x78) == 1) &&
         (uStack0000000000000064 == *(uint *)(unaff_x21 + 0x7c))) {
        if ((*(ulong *)(unaff_x21 + 0x28) <= unaff_x27) ||
           (*(long *)(*(long *)(unaff_x21 + 0x20) + unaff_x27 * 0x20) == -0x8000000000000000)) {
          func_0x007abc00();
          goto code_r0x0056d4c0;
        }
        *(undefined4 *)(unaff_x21 + 0x78) = 1;
        *(uint *)(unaff_x21 + 0x7c) = uVar3;
      }
      if (unaff_x27 < *(ulong *)(unaff_x21 + 0x28)) {
        plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + unaff_x27 * 0x20);
        lVar12 = *plVar9;
        if (lVar12 != -0x8000000000000000) {
          *(long *)(unaff_x29 + -0x80) = lVar16;
          *(long *)(unaff_x29 + -0x78) = lVar16;
          *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000090;
          *(ulong *)(unaff_x29 + -0x68) = lVar16 + uVar19 * 0x108;
          lVar14 = plVar9[2];
          if ((ulong)(lVar12 - lVar14) < uVar19) {
            func_0x007abb04(plVar9,lVar14,uVar19,8,0x108);
            lVar14 = plVar9[2];
          }
          _memcpy(plVar9[1] + lVar14 * 0x108,lVar16,uVar19 * 0x108);
          plVar9[2] = lVar14 + uVar19;
          *(long *)(unaff_x29 + -0x68) = lVar16;
          func_0x00592e4c(unaff_x29 + -0x80);
          *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000080;
          *(undefined8 *)(unaff_x29 + -0x80) = uStack0000000000000078;
          *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000088;
          func_0x00584c34(unaff_x29 + -0x98);
          unaff_x22 = -0x8000000000000000;
          func_0x005581a0(unaff_x29 + -0x98);
          if (*(long *)(unaff_x29 + -0x98) != 0) {
            func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),*(long *)(unaff_x29 + -0x98) * 0x28,8
                           );
          }
          unaff_w25 = 1;
          goto LAB_0056cdfc;
        }
      }
      func_0x007a23bc(&UNK_009eee30);
      goto code_r0x0056d4c0;
    }
  }
  in_stack_00000008 = &UNK_009eee00;
  goto code_r0x0056d488;
}

