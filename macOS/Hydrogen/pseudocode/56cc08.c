
uint FUN_0056cc08(long param_1,undefined8 param_2)

{
  uint *puVar1;
  long lVar2;
  ulong uVar3;
  uint uVar4;
  uint uVar5;
  undefined4 uVar6;
  long lVar7;
  uint *puVar8;
  code *pcVar9;
  bool bVar10;
  uint uVar11;
  uint uVar12;
  long lVar13;
  long lVar14;
  long *plVar15;
  long lVar16;
  ulong uVar17;
  long *plVar18;
  byte bVar19;
  long lVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  long lVar24;
  uint uVar25;
  uint uVar26;
  ulong unaff_x26;
  uint *puVar28;
  uint *puVar27;
  ulong uVar29;
  ulong uVar30;
  byte bVar31;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  undefined8 uVar32;
  byte bVar38;
  undefined1 auVar39 [16];
  ulong in_stack_00000008;
  undefined8 uStack0000000000000040;
  undefined *puStack_148;
  uint uStack_ec;
  uint uStack_dc;
  long lStack_d8;
  long lStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  long lStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  uint *puStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 uStack_80;
  long lStack_78;
  uint uStack_70;
  
  func_0x00187bd4(param_2,param_1 * 0x28,8);
  if ((unaff_x26 & 1) != 0) {
    if (uStack0000000000000040 == 2) {
      if ((in_stack_00000008 & 1) != 0) {
        func_0x005656ec((ulong)&uStack0000000000000040 | 8);
      }
    }
    else if (uStack0000000000000040 == 3) {
      if ((in_stack_00000008 & 0x100000000) != 0) {
        func_0x00565938((ulong)&uStack0000000000000040 | 8);
      }
    }
    else {
      func_0x005649d4(&uStack0000000000000040);
    }
  }
  __Unwind_Resume();
  auVar39 = func_0x007a2668();
  plVar15 = auVar39._8_8_;
  lVar13 = auVar39._0_8_;
  lStack_90 = *(long *)(lVar13 + 0x20);
  lStack_88 = lStack_90 + *(long *)(lVar13 + 0x28) * 0x20;
  uStack_80 = 0;
  func_0x00559d3c(&lStack_a8,&lStack_90,&UNK_009ee258);
  puVar8 = puStack_a0;
  lVar7 = lStack_a8;
  if (lStack_98 == 0) {
    uVar25 = 0;
code_r0x0056cdbc:
    if (lVar7 != 0) {
      func_0x00187bd4(puVar8,lVar7 << 2,4);
    }
    return uVar25 & 1;
  }
  uVar25 = 0;
  puVar1 = puStack_a0 + lStack_98;
  lVar2 = *plVar15;
  uVar3 = plVar15[1];
  lVar16 = plVar15[3];
  uVar4 = *(uint *)(plVar15 + 6);
  puStack_148 = &UNK_009eedd0;
  puVar27 = puStack_a0;
LAB_0056ce04:
  puVar28 = puVar27 + 1;
  uVar5 = *puVar27;
  uVar30 = (ulong)uVar5;
  if ((uVar30 < *(ulong *)(lVar13 + 0x28)) &&
     (plVar18 = (long *)(*(long *)(lVar13 + 0x20) + uVar30 * 0x20), *plVar18 != -0x8000000000000000)
     ) {
    lStack_88 = *(long *)(lVar13 + 0x38);
    uStack_80 = *(ulong *)(lVar13 + 0x40);
    lStack_78 = plVar18[3];
    lStack_90 = 0;
    uStack_70 = uVar5;
    func_0x0055b13c(&lStack_a8,&lStack_90,&UNK_009f0678);
    if (lStack_98 == 1) {
      uStack_ec = puStack_a0[3];
      uStack_dc = puStack_a0[4];
      bVar10 = *(long *)puStack_a0 == 0;
    }
    else {
      bVar10 = true;
    }
    if (lStack_a8 != 0) {
      func_0x00187bd4(puStack_a0,lStack_a8 * 0x18,8);
    }
    if (uStack_ec == uVar5) {
      bVar10 = true;
    }
    if (bVar10) goto LAB_0056cdfc;
    uVar29 = (ulong)uStack_ec;
    if (uVar29 < *(ulong *)(lVar13 + 0x28)) {
      plVar18 = (long *)(*(long *)(lVar13 + 0x20) + uVar29 * 0x20);
      if (*plVar18 != -0x8000000000000000) {
        if ((plVar18[2] != 0) &&
           (*(long *)(plVar18[1] + 0x18) == 0x16 || *(long *)(plVar18[1] + 0x18) == 0x19))
        goto LAB_0056cdfc;
        if ((*(ulong *)(lVar13 + 0x28) <= uVar30) ||
           (plVar18 = (long *)(*(long *)(lVar13 + 0x20) + uVar30 * 0x20),
           *plVar18 == -0x8000000000000000)) {
          puStack_148 = &UNK_009eede8;
          goto code_r0x0056d488;
        }
        if (plVar18[2] == 0) {
          lStack_90 = *(long *)(lVar13 + 0x38);
          lStack_88 = *(long *)(lVar13 + 0x40);
          uStack_80 = CONCAT44(*(undefined4 *)((long)plVar18 + 0x1c),0xffffffff);
          lStack_78 = CONCAT44(lStack_78._4_4_,0xffffffff);
          func_0x0055ba04(&lStack_a8,&lStack_90,&UNK_009ee258);
          puVar27 = puStack_a0;
          lVar24 = lStack_a8;
          if (lStack_98 == 0) {
            uVar26 = 1;
          }
          else {
            lVar20 = 0;
            lVar22 = lStack_98 * 4;
            uVar26 = 1;
            do {
              uVar6 = *(undefined4 *)((long)puVar27 + lVar20);
              uVar11 = func_0x0056c050(lVar13,uVar6,uStack_dc);
              uVar12 = func_0x0056c534(lVar13,uVar6);
              lVar20 = lVar20 + 4;
              uVar25 = uVar11 | uVar12 | uVar25;
              uVar26 = uVar26 & (uVar11 | uVar12);
            } while (lVar22 != lVar20);
          }
          if (lVar24 != 0) {
            func_0x00187bd4(puVar27,lVar24 << 2,4);
          }
          if (uVar26 == 0) {
            uVar17 = *(ulong *)(lVar13 + 0x28);
          }
          else {
            if ((*(int *)(lVar13 + 0x78) != 1) || (*(uint *)(lVar13 + 0x7c) != uVar5)) {
              func_0x00594630(&lStack_90,lVar13 + 0x18,uVar30);
              lVar20 = lStack_88;
              lVar24 = lStack_90;
              if (lStack_90 != -0x8000000000000000) {
                lVar22 = uStack_80 + 1;
                lVar14 = lStack_88;
                while (lVar22 = lVar22 + -1, lVar22 != 0) {
                  func_0x00554164(lVar14);
                  lVar14 = lVar14 + 0x108;
                }
                if (lVar24 != 0) {
                  func_0x00187bd4(lVar20,lVar24 * 0x108,8);
                }
              }
              goto LAB_0056cdfc;
            }
            uVar17 = *(ulong *)(lVar13 + 0x28);
          }
          if (uVar29 < uVar17) goto code_r0x0056d01c;
code_r0x0056d030:
          uVar29 = 0xffffffff;
        }
        else {
          if (*(ulong *)(lVar13 + 0x28) <= uVar29) goto code_r0x0056d030;
code_r0x0056d01c:
          plVar18 = (long *)(*(long *)(lVar13 + 0x20) + uVar29 * 0x20);
          if (*plVar18 == -0x8000000000000000) goto code_r0x0056d030;
          uVar29 = (ulong)*(uint *)((long)plVar18 + 0x1c);
        }
        lVar20 = 0;
        lVar24 = *(long *)(lVar13 + 0x38);
        uVar17 = *(ulong *)(lVar13 + 0x40);
        uVar21 = 0xffffffff;
        if (0xffffffff < uVar17) goto code_r0x0056d07c;
        while (uVar29 < uVar17) {
          lVar22 = lVar24 + uVar29 * 0x30;
          uVar29 = (ulong)*(uint *)(lVar22 + 0x24);
          if (*(int *)(lVar22 + 0x28) != -1) {
            for (; lVar20 = lVar20 + 1, uVar21 < uVar17;
                uVar21 = (ulong)*(uint *)(lVar24 + uVar21 * 0x30 + 0x20)) {
code_r0x0056d07c:
            }
          }
        }
        if (lVar20 == 1) {
          lStack_90 = CONCAT44(lStack_90._4_4_,uStack_ec);
          if (lVar16 != 0) {
            uVar29 = func_0x005763e4(plVar15 + 4,&lStack_90);
            lVar20 = 0;
            bVar19 = (byte)(uVar29 >> 0x39);
            while( true ) {
              uVar29 = uVar29 & uVar3;
              uVar32 = *(undefined8 *)(lVar2 + uVar29);
              bVar31 = (byte)((ulong)uVar32 >> 8);
              bVar33 = (byte)((ulong)uVar32 >> 0x10);
              bVar34 = (byte)((ulong)uVar32 >> 0x18);
              bVar35 = (byte)((ulong)uVar32 >> 0x20);
              bVar36 = (byte)((ulong)uVar32 >> 0x28);
              bVar37 = (byte)((ulong)uVar32 >> 0x30);
              bVar38 = (byte)((ulong)uVar32 >> 0x38);
              for (uVar21 = CONCAT17(-(bVar38 == bVar19),
                                     CONCAT16(-(bVar37 == bVar19),
                                              CONCAT15(-(bVar36 == bVar19),
                                                       CONCAT14(-(bVar35 == bVar19),
                                                                CONCAT13(-(bVar34 == bVar19),
                                                                         CONCAT12(-(bVar33 == bVar19
                                                                                   ),CONCAT11(-(
                                                  bVar31 == bVar19),-((byte)uVar32 == bVar19))))))))
                            & 0x8080808080808080; uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
                uVar23 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
                if (uStack_ec ==
                    *(uint *)(lVar2 + -8 +
                             (uVar29 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) &
                             uVar3) * -8)) {
                  bVar10 = true;
                  uVar21 = (ulong)uStack_ec;
                  goto code_r0x0056d1dc;
                }
              }
              bVar31 = NEON_umaxv(CONCAT17(-(bVar38 == 0xff),
                                           CONCAT16(-(bVar37 == 0xff),
                                                    CONCAT15(-(bVar36 == 0xff),
                                                             CONCAT14(-(bVar35 == 0xff),
                                                                      CONCAT13(-(bVar34 == 0xff),
                                                                               CONCAT12(-(bVar33 ==
                                                                                         0xff),
                                                  CONCAT11(-(bVar31 == 0xff),-((byte)uVar32 == 0xff)
                                                          ))))))),1);
              if ((bVar31 & 1) != 0) break;
              lVar20 = lVar20 + 8;
              uVar29 = uVar29 + lVar20;
            }
          }
        }
        goto LAB_0056cdfc;
      }
    }
    goto code_r0x0056d488;
  }
  goto LAB_0056cdfc;
code_r0x0056d1dc:
  do {
    if (!bVar10) goto LAB_0056cdfc;
    uVar26 = (uint)uVar21;
    lStack_90 = CONCAT44(lStack_90._4_4_,uVar26);
    if (uVar26 != uVar4) {
      uVar29 = func_0x005763e4(plVar15 + 4,&lStack_90);
      lVar20 = 0;
      bVar19 = (byte)(uVar29 >> 0x39);
      while( true ) {
        uVar29 = uVar29 & uVar3;
        uVar32 = *(undefined8 *)(lVar2 + uVar29);
        bVar31 = (byte)((ulong)uVar32 >> 8);
        bVar33 = (byte)((ulong)uVar32 >> 0x10);
        bVar34 = (byte)((ulong)uVar32 >> 0x18);
        bVar35 = (byte)((ulong)uVar32 >> 0x20);
        bVar36 = (byte)((ulong)uVar32 >> 0x28);
        bVar37 = (byte)((ulong)uVar32 >> 0x30);
        bVar38 = (byte)((ulong)uVar32 >> 0x38);
        for (uVar21 = CONCAT17(-(bVar38 == bVar19),
                               CONCAT16(-(bVar37 == bVar19),
                                        CONCAT15(-(bVar36 == bVar19),
                                                 CONCAT14(-(bVar35 == bVar19),
                                                          CONCAT13(-(bVar34 == bVar19),
                                                                   CONCAT12(-(bVar33 == bVar19),
                                                                            CONCAT11(-(bVar31 ==
                                                                                      bVar19),-((
                                                  byte)uVar32 == bVar19)))))))) & 0x8080808080808080
            ; uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
          uVar23 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
          uVar23 = uVar29 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) & uVar3;
          if (uVar26 == *(uint *)(lVar2 + -8 + uVar23 * -8)) {
            uVar29 = (ulong)*(uint *)(lVar2 + -4 + uVar23 * -8);
            bVar10 = true;
            goto joined_r0x0056d1d8;
          }
        }
        bVar31 = NEON_umaxv(CONCAT17(-(bVar38 == 0xff),
                                     CONCAT16(-(bVar37 == 0xff),
                                              CONCAT15(-(bVar36 == 0xff),
                                                       CONCAT14(-(bVar35 == 0xff),
                                                                CONCAT13(-(bVar34 == 0xff),
                                                                         CONCAT12(-(bVar33 == 0xff),
                                                                                  CONCAT11(-(bVar31 
                                                  == 0xff),-((byte)uVar32 == 0xff)))))))),1);
        if ((bVar31 & 1) != 0) break;
        lVar20 = lVar20 + 8;
        uVar29 = uVar29 + lVar20;
      }
    }
    bVar10 = false;
joined_r0x0056d1d8:
    uVar21 = uVar29;
  } while (uVar26 != uVar5);
  if ((uStack_dc < uVar17) &&
     (plVar18 = (long *)(lVar24 + (ulong)uStack_dc * 0x30), *plVar18 != -0x8000000000000000)) {
    if (plVar18[2] != 0) {
LAB_0056cdfc:
      puVar27 = puVar28;
      if (puVar28 == puVar1) goto code_r0x0056cdbc;
      goto LAB_0056ce04;
    }
    func_0x0058497c(&lStack_d8,lVar13,uStack_ec);
    func_0x00594630(&lStack_90,lVar13 + 0x18,uStack_ec);
    uVar29 = uStack_80;
    lVar20 = lStack_88;
    lVar24 = lStack_90;
    if (lStack_90 == -0x8000000000000000) {
      func_0x007a23bc(&UNK_009eee18);
    }
    else {
      lStack_b8 = lStack_88;
      lStack_c0 = lStack_90;
      uStack_b0 = uStack_80;
      if ((*(int *)(lVar13 + 0x78) == 1) && (uStack_ec == *(uint *)(lVar13 + 0x7c))) {
        if ((*(ulong *)(lVar13 + 0x28) <= uVar30) ||
           (*(long *)(*(long *)(lVar13 + 0x20) + uVar30 * 0x20) == -0x8000000000000000)) {
          func_0x007abc00();
          goto code_r0x0056d4c0;
        }
        *(undefined4 *)(lVar13 + 0x78) = 1;
        *(uint *)(lVar13 + 0x7c) = uVar5;
      }
      if (uVar30 < *(ulong *)(lVar13 + 0x28)) {
        plVar18 = (long *)(*(long *)(lVar13 + 0x20) + uVar30 * 0x20);
        if (*plVar18 != -0x8000000000000000) {
          lVar22 = uStack_80 * 0x108;
          lStack_78 = lStack_88 + lVar22;
          lStack_90 = lStack_88;
          uStack_80 = lVar24;
          lVar24 = plVar18[2];
          if ((ulong)(*plVar18 - lVar24) < uVar29) {
            func_0x007abb04(plVar18,lVar24,uVar29,8,0x108);
            lVar24 = plVar18[2];
          }
          _memcpy(plVar18[1] + lVar24 * 0x108,lVar20,lVar22);
          plVar18[2] = lVar24 + uVar29;
          lStack_78 = lVar20;
          func_0x00592e4c(&lStack_90);
          lStack_88 = lStack_d0;
          lStack_90 = lStack_d8;
          uStack_80 = uStack_c8;
          func_0x00584c34(&lStack_a8,lVar13,uVar30,&lStack_90);
          func_0x005581a0(&lStack_a8);
          if (lStack_a8 != 0) {
            func_0x00187bd4(puStack_a0,lStack_a8 * 0x28,8);
          }
          uVar25 = 1;
          goto LAB_0056cdfc;
        }
      }
      func_0x007a23bc(&UNK_009eee30);
    }
  }
  else {
    puStack_148 = &UNK_009eee00;
code_r0x0056d488:
    func_0x007a23bc(puStack_148);
  }
code_r0x0056d4c0:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x56d4c4);
  (*pcVar9)();
}

