
uint FUN_0056d444(long *param_1,long param_2,ulong param_3,undefined8 param_4)

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
  long lVar10;
  ulong uVar11;
  byte bVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  uint uVar17;
  ulong unaff_x25;
  uint uVar18;
  uint *puVar19;
  ulong uVar20;
  ulong uVar21;
  long *unaff_x28;
  long unaff_x29;
  byte bVar22;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  undefined8 uVar23;
  byte bVar29;
  undefined *in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
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
  
code_r0x0056d444:
  func_0x007abb04(param_1,param_2,param_3,param_4,0x108);
  param_2 = unaff_x28[2];
  param_3 = unaff_x25;
  param_1 = unaff_x28;
LAB_0056d384:
  _memcpy(param_1[1] + param_2 * 0x108,unaff_x22,in_stack_00000018);
  param_1[2] = param_2 + param_3;
  *(long *)(unaff_x29 + -0x68) = unaff_x22;
  func_0x00592e4c(unaff_x29 + -0x80);
  *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000080;
  *(undefined8 *)(unaff_x29 + -0x80) = uStack0000000000000078;
  *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000088;
  func_0x00584c34(unaff_x29 + -0x98);
  func_0x005581a0(unaff_x29 + -0x98);
  if (*(long *)(unaff_x29 + -0x98) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),*(long *)(unaff_x29 + -0x98) * 0x28,8);
  }
  uVar17 = 1;
  puVar19 = in_stack_00000068;
code_r0x0056cdfc:
  do {
    do {
      if (puVar19 == in_stack_00000038) {
        if (in_stack_00000028 != 0) {
          func_0x00187bd4(in_stack_00000020,in_stack_00000028 << 2,4);
        }
        return uVar17 & 1;
      }
      in_stack_00000068 = puVar19 + 1;
      uVar3 = *puVar19;
      uVar21 = (ulong)uVar3;
      puVar19 = in_stack_00000068;
    } while ((*(ulong *)(unaff_x21 + 0x28) <= uVar21) ||
            (plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar21 * 0x20),
            *plVar9 == -0x8000000000000000));
    uVar23 = *(undefined8 *)(unaff_x21 + 0x38);
    uVar1 = *(undefined8 *)(unaff_x21 + 0x40);
    *(uint *)(unaff_x29 + -0x60) = uVar3;
    *(undefined8 *)(unaff_x29 + -0x78) = uVar23;
    *(undefined8 *)(unaff_x29 + -0x70) = uVar1;
    *(long *)(unaff_x29 + -0x68) = plVar9[3];
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    func_0x0055b13c(unaff_x29 + -0x98,unaff_x29 + -0x80,&UNK_009f0678);
    if (*(long *)(unaff_x29 + -0x88) == 1) {
      plVar9 = *(long **)(unaff_x29 + -0x90);
      uStack0000000000000064 = *(uint *)((long)plVar9 + 0xc);
      in_stack_00000070._4_4_ = *(uint *)(plVar9 + 2);
      bVar5 = *plVar9 == 0;
      lVar10 = *(long *)(unaff_x29 + -0x98);
    }
    else {
      bVar5 = true;
      lVar10 = *(long *)(unaff_x29 + -0x98);
    }
    if (lVar10 != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),lVar10 * 0x18,8);
    }
    if (uStack0000000000000064 == uVar3) {
      bVar5 = true;
    }
  } while (bVar5);
  uVar20 = (ulong)uStack0000000000000064;
  if (uVar20 < *(ulong *)(unaff_x21 + 0x28)) {
    plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar20 * 0x20);
    if (*plVar9 != -0x8000000000000000) {
      if ((plVar9[2] == 0) ||
         (!(*(long *)(plVar9[1] + 0x18) == 0x16 || *(long *)(plVar9[1] + 0x18) == 0x19))) {
        if ((*(ulong *)(unaff_x21 + 0x28) <= uVar21) ||
           (plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar21 * 0x20),
           *plVar9 == -0x8000000000000000)) {
          in_stack_00000008 = &UNK_009eede8;
          goto code_r0x0056d488;
        }
        if (plVar9[2] == 0) {
          uVar23 = *(undefined8 *)(unaff_x21 + 0x40);
          uVar2 = *(undefined4 *)((long)plVar9 + 0x1c);
          *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x21 + 0x38);
          *(undefined8 *)(unaff_x29 + -0x78) = uVar23;
          *(undefined4 *)(unaff_x29 + -0x70) = 0xffffffff;
          *(undefined4 *)(unaff_x29 + -0x6c) = uVar2;
          *(undefined4 *)(unaff_x29 + -0x68) = 0xffffffff;
          func_0x0055ba04(unaff_x29 + -0x98,unaff_x29 + -0x80,&UNK_009ee258);
          lVar13 = *(long *)(unaff_x29 + -0x98);
          uVar23 = *(undefined8 *)(unaff_x29 + -0x90);
          lVar10 = *(long *)(unaff_x29 + -0x88);
          if (lVar10 == 0) {
            uVar18 = 1;
          }
          else {
            lVar15 = 0;
            uVar18 = 1;
            do {
              uVar6 = func_0x0056c050();
              uVar7 = func_0x0056c534();
              lVar15 = lVar15 + 4;
              uVar17 = uVar6 | uVar7 | uVar17;
              uVar18 = uVar18 & (uVar6 | uVar7);
            } while (lVar10 * 4 != lVar15);
          }
          if (lVar13 != 0) {
            func_0x00187bd4(uVar23,lVar13 << 2,4);
          }
          if (uVar18 == 0) {
            uVar11 = *(ulong *)(unaff_x21 + 0x28);
          }
          else {
            if ((*(int *)(unaff_x21 + 0x78) != 1) || (*(uint *)(unaff_x21 + 0x7c) != uVar3)) {
              func_0x00594630(unaff_x29 + -0x80,unaff_x21 + 0x18,uVar21);
              lVar10 = *(long *)(unaff_x29 + -0x80);
              if (lVar10 != -0x8000000000000000) {
                lVar15 = *(long *)(unaff_x29 + -0x78);
                lVar13 = *(long *)(unaff_x29 + -0x70) + 1;
                lVar8 = lVar15;
                while (lVar13 = lVar13 + -1, lVar13 != 0) {
                  func_0x00554164(lVar8);
                  lVar8 = lVar8 + 0x108;
                }
                if (lVar10 != 0) {
                  func_0x00187bd4(lVar15,lVar10 * 0x108,8);
                }
              }
              goto code_r0x0056cdfc;
            }
            uVar11 = *(ulong *)(unaff_x21 + 0x28);
          }
          if (uVar20 < uVar11) goto code_r0x0056d01c;
code_r0x0056d030:
          uVar20 = 0xffffffff;
        }
        else {
          if (*(ulong *)(unaff_x21 + 0x28) <= uVar20) goto code_r0x0056d030;
code_r0x0056d01c:
          plVar9 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar20 * 0x20);
          if (*plVar9 == -0x8000000000000000) goto code_r0x0056d030;
          uVar20 = (ulong)*(uint *)((long)plVar9 + 0x1c);
        }
        lVar13 = 0;
        lVar10 = *(long *)(unaff_x21 + 0x38);
        uVar11 = *(ulong *)(unaff_x21 + 0x40);
        uVar14 = 0xffffffff;
        if (0xffffffff < uVar11) goto code_r0x0056d07c;
        while (uVar20 < uVar11) {
          lVar15 = lVar10 + uVar20 * 0x30;
          uVar20 = (ulong)*(uint *)(lVar15 + 0x24);
          if (*(int *)(lVar15 + 0x28) != -1) {
            for (; lVar13 = lVar13 + 1, uVar14 < uVar11;
                uVar14 = (ulong)*(uint *)(lVar10 + uVar14 * 0x30 + 0x20)) {
code_r0x0056d07c:
            }
          }
        }
        if ((lVar13 == 1) &&
           (*(uint *)(unaff_x29 + -0x80) = uStack0000000000000064, in_stack_00000030 != 0)) {
          uVar20 = func_0x005763e4(unaff_x23 + 0x20,unaff_x29 + -0x80);
          lVar13 = 0;
          bVar12 = (byte)(uVar20 >> 0x39);
          while( true ) {
            uVar20 = uVar20 & in_stack_00000058;
            uVar23 = *(undefined8 *)(in_stack_00000050 + uVar20);
            bVar22 = (byte)((ulong)uVar23 >> 8);
            bVar24 = (byte)((ulong)uVar23 >> 0x10);
            bVar25 = (byte)((ulong)uVar23 >> 0x18);
            bVar26 = (byte)((ulong)uVar23 >> 0x20);
            bVar27 = (byte)((ulong)uVar23 >> 0x28);
            bVar28 = (byte)((ulong)uVar23 >> 0x30);
            bVar29 = (byte)((ulong)uVar23 >> 0x38);
            for (uVar14 = CONCAT17(-(bVar29 == bVar12),
                                   CONCAT16(-(bVar28 == bVar12),
                                            CONCAT15(-(bVar27 == bVar12),
                                                     CONCAT14(-(bVar26 == bVar12),
                                                              CONCAT13(-(bVar25 == bVar12),
                                                                       CONCAT12(-(bVar24 == bVar12),
                                                                                CONCAT11(-(bVar22 ==
                                                                                          bVar12),-(
                                                  (byte)uVar23 == bVar12)))))))) &
                          0x8080808080808080; uVar14 != 0; uVar14 = uVar14 - 1 & uVar14) {
              uVar16 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar14 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
              if (uStack0000000000000064 ==
                  *(uint *)(in_stack_00000048 +
                           (uVar20 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) &
                           in_stack_00000058) * -8)) {
                bVar5 = true;
                uVar14 = (ulong)uStack0000000000000064;
                goto code_r0x0056d1dc;
              }
            }
            bVar22 = NEON_umaxv(CONCAT17(-(bVar29 == 0xff),
                                         CONCAT16(-(bVar28 == 0xff),
                                                  CONCAT15(-(bVar27 == 0xff),
                                                           CONCAT14(-(bVar26 == 0xff),
                                                                    CONCAT13(-(bVar25 == 0xff),
                                                                             CONCAT12(-(bVar24 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar22 == 0xff),-((byte)uVar23 == 0xff)
                                                          ))))))),1);
            if ((bVar22 & 1) != 0) break;
            lVar13 = lVar13 + 8;
            uVar20 = uVar20 + lVar13;
          }
        }
      }
      goto code_r0x0056cdfc;
    }
  }
  goto code_r0x0056d488;
code_r0x0056d1dc:
  do {
    if (!bVar5) goto code_r0x0056cdfc;
    uVar18 = (uint)uVar14;
    *(uint *)(unaff_x29 + -0x80) = uVar18;
    if (uVar18 != uStack0000000000000060) {
      uVar20 = func_0x005763e4(unaff_x23 + 0x20,unaff_x29 + -0x80);
      lVar13 = 0;
      bVar12 = (byte)(uVar20 >> 0x39);
      while( true ) {
        uVar20 = uVar20 & in_stack_00000058;
        uVar23 = *(undefined8 *)(in_stack_00000050 + uVar20);
        bVar22 = (byte)((ulong)uVar23 >> 8);
        bVar24 = (byte)((ulong)uVar23 >> 0x10);
        bVar25 = (byte)((ulong)uVar23 >> 0x18);
        bVar26 = (byte)((ulong)uVar23 >> 0x20);
        bVar27 = (byte)((ulong)uVar23 >> 0x28);
        bVar28 = (byte)((ulong)uVar23 >> 0x30);
        bVar29 = (byte)((ulong)uVar23 >> 0x38);
        for (uVar14 = CONCAT17(-(bVar29 == bVar12),
                               CONCAT16(-(bVar28 == bVar12),
                                        CONCAT15(-(bVar27 == bVar12),
                                                 CONCAT14(-(bVar26 == bVar12),
                                                          CONCAT13(-(bVar25 == bVar12),
                                                                   CONCAT12(-(bVar24 == bVar12),
                                                                            CONCAT11(-(bVar22 ==
                                                                                      bVar12),-((
                                                  byte)uVar23 == bVar12)))))))) & 0x8080808080808080
            ; uVar14 != 0; uVar14 = uVar14 - 1 & uVar14) {
          uVar16 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar14 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
          uVar16 = uVar20 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) &
                   in_stack_00000058;
          if (uVar18 == *(uint *)(in_stack_00000048 + uVar16 * -8)) {
            uVar20 = (ulong)*(uint *)(in_stack_00000040 + uVar16 * -8);
            bVar5 = true;
            goto joined_r0x0056d1d8;
          }
        }
        bVar22 = NEON_umaxv(CONCAT17(-(bVar29 == 0xff),
                                     CONCAT16(-(bVar28 == 0xff),
                                              CONCAT15(-(bVar27 == 0xff),
                                                       CONCAT14(-(bVar26 == 0xff),
                                                                CONCAT13(-(bVar25 == 0xff),
                                                                         CONCAT12(-(bVar24 == 0xff),
                                                                                  CONCAT11(-(bVar22 
                                                  == 0xff),-((byte)uVar23 == 0xff)))))))),1);
        if ((bVar22 & 1) != 0) break;
        lVar13 = lVar13 + 8;
        uVar20 = uVar20 + lVar13;
      }
    }
    bVar5 = false;
joined_r0x0056d1d8:
    uVar14 = uVar20;
  } while (uVar18 != uVar3);
  if ((in_stack_00000070._4_4_ < uVar11) &&
     (plVar9 = (long *)(lVar10 + (ulong)in_stack_00000070._4_4_ * 0x30),
     *plVar9 != -0x8000000000000000)) {
    if (plVar9[2] == 0) goto code_r0x0056d2ac;
    goto code_r0x0056cdfc;
  }
  in_stack_00000008 = &UNK_009eee00;
code_r0x0056d488:
  func_0x007a23bc(in_stack_00000008);
  goto code_r0x0056d4c0;
code_r0x0056d430:
  param_4 = 8;
  unaff_x25 = param_3;
  unaff_x28 = param_1;
  goto code_r0x0056d444;
code_r0x0056d2ac:
  func_0x0058497c(&uStack0000000000000078);
  func_0x00594630(unaff_x29 + -0x80,unaff_x21 + 0x18,uStack0000000000000064);
  if (*(long *)(unaff_x29 + -0x80) == -0x8000000000000000) {
    func_0x007a23bc(&UNK_009eee18);
    goto code_r0x0056d4c0;
  }
  unaff_x22 = *(long *)(unaff_x29 + -0x78);
  in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0x80);
  param_3 = *(ulong *)(unaff_x29 + -0x70);
  in_stack_00000098 = unaff_x22;
  in_stack_000000a0 = param_3;
  if ((*(int *)(unaff_x21 + 0x78) == 1) && (uStack0000000000000064 == *(uint *)(unaff_x21 + 0x7c)))
  {
    if ((*(ulong *)(unaff_x21 + 0x28) <= uVar21) ||
       (*(long *)(*(long *)(unaff_x21 + 0x20) + uVar21 * 0x20) == -0x8000000000000000)) {
      func_0x007abc00();
      goto code_r0x0056d4c0;
    }
    *(undefined4 *)(unaff_x21 + 0x78) = 1;
    *(uint *)(unaff_x21 + 0x7c) = uVar3;
  }
  if (uVar21 < *(ulong *)(unaff_x21 + 0x28)) {
    param_1 = (long *)(*(long *)(unaff_x21 + 0x20) + uVar21 * 0x20);
    lVar10 = *param_1;
    if (lVar10 != -0x8000000000000000) {
      in_stack_00000018 = param_3 * 0x108;
      *(long *)(unaff_x29 + -0x80) = unaff_x22;
      *(long *)(unaff_x29 + -0x78) = unaff_x22;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000090;
      *(long *)(unaff_x29 + -0x68) = unaff_x22 + in_stack_00000018;
      param_2 = param_1[2];
      if ((ulong)(lVar10 - param_2) < param_3) goto code_r0x0056d430;
      goto LAB_0056d384;
    }
  }
  func_0x007a23bc(&UNK_009eee30);
code_r0x0056d4c0:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x56d4c4);
  (*pcVar4)();
}

