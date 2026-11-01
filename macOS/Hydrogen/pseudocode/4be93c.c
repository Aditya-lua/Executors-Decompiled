
/* WARNING: Type propagation algorithm not settling */

undefined8 thunk_FUN_004be9d4(undefined8 param_1,undefined8 param_2,ulong param_3,ulong param_4)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  uint *puVar8;
  uint *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  uint uVar12;
  byte bVar13;
  uint *puVar14;
  ulong uVar15;
  uint *puVar16;
  ulong uVar17;
  long lVar18;
  long *plVar19;
  ulong uVar20;
  uint uVar21;
  uint uVar22;
  uint *puVar23;
  ulong unaff_x23;
  ulong unaff_x24;
  byte bVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined8 uStack0000000000000030;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  uint *puStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  uint *puStack_e0;
  uint *puStack_d8;
  ulong uStack_d0;
  uint *puStack_c0;
  uint *puStack_b8;
  ulong uStack_b0;
  uint *puStack_a8;
  uint *puStack_a0;
  uint *puStack_98;
  uint *puStack_90;
  uint *puStack_88;
  uint uStack_80;
  
  if (uStack0000000000000030 == 2) {
    if ((unaff_x24 & 1) != 0) {
      func_0x004bc150((ulong)&uStack0000000000000030 | 8);
    }
  }
  else if (uStack0000000000000030 == 3) {
    if ((unaff_x23 & 1) != 0) {
      func_0x004bc4a8((ulong)&uStack0000000000000030 | 8);
    }
  }
  else {
    func_0x004bb4f4(&uStack0000000000000030);
  }
  __Unwind_Resume();
  auVar26 = func_0x007a2668();
  uVar11 = auVar26._8_8_;
  lVar4 = auVar26._0_8_;
  uVar21 = auVar26._8_4_;
  if ((param_3 & 1) == 0) {
    lVar5 = func_0x005847cc(lVar4,uVar11);
    if (lVar5 == 0) {
      func_0x007a23bc(&UNK_009e60d8);
    }
    else {
      lVar18 = *(long *)(lVar5 + 8);
      lVar5 = *(long *)(lVar5 + 0x10) * 0x108;
      while (lVar5 != 0) {
        plVar19 = (long *)(lVar18 + 0x18);
        lVar18 = lVar18 + 0x108;
        lVar5 = lVar5 + -0x108;
        if (*plVar19 != 0x20) {
          return 0;
        }
      }
      if (*(int *)(lVar4 + 0x78) == 1 && *(uint *)(lVar4 + 0x7c) == uVar21) {
        return 0;
      }
      if (*(long *)(lVar4 + 0xa8) != 0) {
        lVar5 = 0;
        uVar15 = (uVar11 & 0xffffffff) * 0x517cc1b727220a95;
        lVar18 = *(long *)(lVar4 + 0x90);
        uVar6 = *(ulong *)(lVar4 + 0x98);
        bVar13 = (byte)(uVar15 >> 0x39);
        uVar15 = uVar15 & uVar6;
        uVar25 = *(undefined8 *)(lVar18 + uVar15);
        uVar7 = CONCAT17(-((byte)((ulong)uVar25 >> 0x38) == bVar13),
                         CONCAT16(-((byte)((ulong)uVar25 >> 0x30) == bVar13),
                                  CONCAT15(-((byte)((ulong)uVar25 >> 0x28) == bVar13),
                                           CONCAT14(-((byte)((ulong)uVar25 >> 0x20) == bVar13),
                                                    CONCAT13(-((byte)((ulong)uVar25 >> 0x18) ==
                                                              bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar25 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar25 >> 8) == bVar13),
                                                           -((byte)uVar25 == bVar13)))))))) &
                0x8080808080808080;
        while( true ) {
          for (; uVar7 != 0; uVar7 = uVar7 - 1 & uVar7) {
            uVar17 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
            if (uVar21 == *(uint *)(lVar18 + -4 +
                                   (uVar15 + ((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3)
                                   & uVar6) * -4)) {
              return 0;
            }
          }
          bVar24 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar25 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar25 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar25 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar25 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar25 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar25 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar25 >> 8) ==
                                                                     -1),-((char)uVar25 == -1)))))))
                                      ),1);
          if ((bVar24 & 1) != 0) break;
          lVar5 = lVar5 + 8;
          uVar15 = uVar15 + lVar5 & uVar6;
          uVar25 = *(undefined8 *)(lVar18 + uVar15);
          uVar7 = CONCAT17(-((byte)((ulong)uVar25 >> 0x38) == bVar13),
                           CONCAT16(-((byte)((ulong)uVar25 >> 0x30) == bVar13),
                                    CONCAT15(-((byte)((ulong)uVar25 >> 0x28) == bVar13),
                                             CONCAT14(-((byte)((ulong)uVar25 >> 0x20) == bVar13),
                                                      CONCAT13(-((byte)((ulong)uVar25 >> 0x18) ==
                                                                bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar25 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar25 >> 8) == bVar13),
                                                           -((byte)uVar25 == bVar13)))))))) &
                  0x8080808080808080;
        }
      }
      lVar5 = func_0x005847cc(lVar4,uVar11);
      if (lVar5 != 0) {
        if ((*(long *)(lVar5 + 0x10) != 0) &&
           (lVar5 = *(long *)(*(long *)(lVar5 + 8) + 0x18), lVar5 == 0x16 || lVar5 == 0x19)) {
          return 0;
        }
        func_0x0058485c(&puStack_a0,lVar4,uVar11);
        func_0x004d0228(&puStack_c0,&puStack_a0,&UNK_009e5910);
        puVar14 = puStack_b8;
        puVar23 = puStack_c0;
        if (uStack_b0 != 0) {
          lVar5 = 0;
          lVar18 = uStack_b0 * 4;
          do {
            func_0x00584800(&puStack_c0,lVar4,*(undefined4 *)((long)puVar14 + lVar5));
            puStack_98 = puStack_b8;
            puStack_a0 = puStack_c0;
            puStack_88 = puStack_a8;
            puStack_90 = (uint *)uStack_b0;
            func_0x004d0228(&puStack_e0,&puStack_a0,&UNK_009e5910);
            if (uStack_d0 != 1) {
              if (puStack_e0 != (uint *)0x0) {
                func_0x00187bd4(puStack_d8,(long)puStack_e0 << 2,4);
              }
              if (puVar23 == (uint *)0x0) {
                return 0;
              }
              func_0x00187bd4(puVar14,(long)puVar23 << 2,4);
              return 0;
            }
            if (puStack_e0 != (uint *)0x0) {
              func_0x00187bd4(puStack_d8,(long)puStack_e0 << 2,4);
            }
            lVar5 = lVar5 + 4;
          } while (lVar18 != lVar5);
        }
        if (puVar23 != (uint *)0x0) {
          func_0x00187bd4(puVar14,(long)puVar23 << 2,4);
        }
        puStack_98 = *(uint **)(lVar4 + 0x38);
        puStack_90 = *(uint **)(lVar4 + 0x40);
        if (((uVar11 & 0xffffffff) < *(ulong *)(lVar4 + 0x28)) &&
           (plVar19 = (long *)(*(long *)(lVar4 + 0x20) + (uVar11 & 0xffffffff) * 0x20),
           *plVar19 != -0x8000000000000000)) {
          puStack_88 = (uint *)plVar19[3];
        }
        else {
          puStack_88 = (uint *)0xffffffffffffffff;
        }
        puStack_a0 = (uint *)0x1;
        uStack_80 = uVar21;
        func_0x004cfda8(&puStack_c0,&puStack_a0,&UNK_009e5910);
        puVar14 = puStack_b8;
        puVar23 = puStack_c0;
        if (uStack_b0 != 0) {
          puVar16 = puStack_b8 + uStack_b0;
          puVar8 = puStack_b8;
          do {
            puVar9 = puVar8 + 1;
            uVar21 = *puVar8;
            uVar7 = (ulong)uVar21;
            uVar6 = *(ulong *)(lVar4 + 0x40);
            if (uVar6 <= uVar7) {
code_r0x004bf798:
              func_0x007a23bc(&UNK_009e60f0);
              goto LAB_004bf7c0;
            }
            lVar5 = *(long *)(lVar4 + 0x38);
            plVar19 = (long *)(lVar5 + uVar7 * 0x30);
            if (*plVar19 == -0x8000000000000000) goto code_r0x004bf798;
            uVar15 = plVar19[5];
            uVar17 = *(ulong *)(lVar4 + 0x28);
            uVar20 = uVar15 & 0xffffffff;
            if (uVar20 < uVar17) {
              uVar12 = *(uint *)((long)plVar19 + 0x24);
              lVar18 = *(long *)(lVar4 + 0x20);
              puVar8 = (uint *)(lVar18 + uVar20 * 0x20 + 0x18);
              uVar22 = *puVar8;
              while (uVar20 = (ulong)uVar22, uVar20 != uVar7) {
                if (uVar6 <= uVar20) goto code_r0x004bf188;
                puVar8 = (uint *)(lVar5 + uVar20 * 0x30 + 0x20);
                uVar22 = *puVar8;
              }
              *puVar8 = *(uint *)(plVar19 + 4);
code_r0x004bf188:
              uVar15 = uVar15 >> 0x20;
              if (uVar15 < uVar17) {
                puVar8 = (uint *)(lVar18 + uVar15 * 0x20 + 0x1c);
                uVar22 = *puVar8;
                while (uVar15 = (ulong)uVar22, uVar15 != uVar7) {
                  if (uVar6 <= uVar15) goto code_r0x004bf1c0;
                  puVar8 = (uint *)(lVar5 + uVar15 * 0x30 + 0x24);
                  uVar22 = *puVar8;
                }
                *puVar8 = uVar12;
              }
            }
code_r0x004bf1c0:
            *(undefined4 *)(plVar19 + 4) = *(undefined4 *)(lVar4 + 0x5c);
            *(undefined8 *)((long)plVar19 + 0x24) = 0xffffffffffffffff;
            *(undefined4 *)((long)plVar19 + 0x2c) = 0xffffffff;
            *(uint *)(lVar4 + 0x5c) = uVar21;
            *(long *)(lVar4 + 0x50) = *(long *)(lVar4 + 0x50) + -1;
            puVar8 = (uint *)*plVar19;
            *plVar19 = -0x8000000000000000;
            if (puVar8 == (uint *)0x8000000000000000) goto code_r0x004bf798;
            uStack_b0 = plVar19[2];
            puStack_b8 = (uint *)plVar19[1];
            puStack_a8 = (uint *)plVar19[3];
            puStack_c0 = puVar8;
            if ((char)puStack_a8 != '\0') {
              puStack_a0 = (uint *)0x0;
              func_0x007a5458(0,&puStack_a8,"",&puStack_a0,&UNK_009e6108);
              goto LAB_004bf7c0;
            }
            func_0x004ce418(&puStack_c0);
            if (puVar8 != (uint *)0x0) {
              func_0x00187bd4(puStack_b8,(long)puVar8 * 0x48,8);
            }
            puVar8 = puVar9;
          } while (puVar9 != puVar16);
        }
        if (puVar23 == (uint *)0x0) goto code_r0x004bf3cc;
        lVar5 = (long)puVar23 << 2;
        goto code_r0x004bf3c4;
      }
    }
LAB_004bf70c:
    func_0x007a23bc(&UNK_009e6120);
LAB_004bf718:
    func_0x007a247c(&UNK_008a241f,0x42,&UNK_009e60c0);
  }
  else {
    uVar12 = (uint)param_4;
    if (uVar21 == uVar12) {
      return 0;
    }
    lVar5 = func_0x005847cc(lVar4,uVar11);
    if (lVar5 == 0) goto LAB_004bf70c;
    if ((*(long *)(lVar5 + 0x10) != 0) &&
       (lVar5 = *(long *)(*(long *)(lVar5 + 8) + 0x18), lVar5 == 0x16 || lVar5 == 0x19)) {
      return 0;
    }
    func_0x00584ec0(&puStack_a0,lVar4,uVar11);
    if (puStack_a0 == (uint *)0x0) goto LAB_004bf718;
    lVar5 = func_0x005847cc(lVar4,uVar11);
    if (lVar5 != 0) {
      lVar18 = *(long *)(lVar5 + 8);
      lVar5 = *(long *)(lVar5 + 0x10) * 0x108;
      do {
        if (lVar5 == 0) {
          if (*(int *)(lVar4 + 0x78) != 1 || *(uint *)(lVar4 + 0x7c) != uVar21) {
            if (*(long *)(lVar4 + 0xa8) == 0) goto code_r0x004bf08c;
            lVar5 = 0;
            uVar15 = (uVar11 & 0xffffffff) * 0x517cc1b727220a95;
            lVar18 = *(long *)(lVar4 + 0x90);
            uVar6 = *(ulong *)(lVar4 + 0x98);
            bVar13 = (byte)(uVar15 >> 0x39);
            uVar15 = uVar15 & uVar6;
            uVar25 = *(undefined8 *)(lVar18 + uVar15);
            uVar7 = CONCAT17(-((byte)((ulong)uVar25 >> 0x38) == bVar13),
                             CONCAT16(-((byte)((ulong)uVar25 >> 0x30) == bVar13),
                                      CONCAT15(-((byte)((ulong)uVar25 >> 0x28) == bVar13),
                                               CONCAT14(-((byte)((ulong)uVar25 >> 0x20) == bVar13),
                                                        CONCAT13(-((byte)((ulong)uVar25 >> 0x18) ==
                                                                  bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar25 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar25 >> 8) == bVar13),
                                                           -((byte)uVar25 == bVar13)))))))) &
                    0x8080808080808080;
            goto joined_r0x004bed00;
          }
          break;
        }
        plVar19 = (long *)(lVar18 + 0x18);
        lVar18 = lVar18 + 0x108;
        lVar5 = lVar5 + -0x108;
      } while (*plVar19 == 0x20);
LAB_004bed64:
      func_0x0058485c(&puStack_a0,lVar4,param_4);
      lVar5 = 0;
      puVar23 = (uint *)((ulong)puStack_90 >> 0x20);
      puVar14 = (uint *)((ulong)puStack_90 & 0xffffffff);
      do {
        for (; puVar16 = puVar23, puVar14 < puStack_98;
            puVar14 = (uint *)(ulong)puStack_a0[(long)puVar14 * 0xc + 8]) {
          lVar5 = lVar5 + 1;
        }
        do {
          if (puStack_98 <= puVar16) {
            if (lVar5 != 1) {
              return 0;
            }
            func_0x005848b8(&puStack_a0,lVar4,uVar11);
            lVar5 = *(long *)(puStack_a0 + 0xe);
            uVar7 = *(ulong *)(puStack_a0 + 0x10);
            uVar6 = (ulong)puStack_98 & 0xffffffff;
            uVar15 = (ulong)puStack_98 >> 0x20;
            goto code_r0x004bee04;
          }
          puVar23 = (uint *)(ulong)puStack_a0[(long)puVar16 * 0xc + 9];
          lVar18 = (long)puVar16 * 0xc;
          puVar16 = puVar23;
        } while (puStack_a0[lVar18 + 10] == (uint)puStack_88);
        lVar5 = lVar5 + 1;
      } while( true );
    }
  }
  func_0x007a23bc(&UNK_009e5fd0);
code_r0x004bf73c:
  func_0x007a23bc(&UNK_009e6048);
code_r0x004bf748:
  func_0x007a23bc(&UNK_009e6060);
LAB_004bf7c0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4bf7c4);
  (*pcVar2)();
joined_r0x004bed00:
  if (uVar7 == 0) {
    bVar24 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar25 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar25 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar25 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar25 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar25 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar25 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar25 >> 8) == -1),
                                                           -((char)uVar25 == -1)))))))),1);
    if ((bVar24 & 1) != 0) goto code_r0x004bf08c;
    lVar5 = lVar5 + 8;
    uVar15 = uVar15 + lVar5 & uVar6;
    uVar25 = *(undefined8 *)(lVar18 + uVar15);
    uVar7 = CONCAT17(-((byte)((ulong)uVar25 >> 0x38) == bVar13),
                     CONCAT16(-((byte)((ulong)uVar25 >> 0x30) == bVar13),
                              CONCAT15(-((byte)((ulong)uVar25 >> 0x28) == bVar13),
                                       CONCAT14(-((byte)((ulong)uVar25 >> 0x20) == bVar13),
                                                CONCAT13(-((byte)((ulong)uVar25 >> 0x18) == bVar13),
                                                         CONCAT12(-((byte)((ulong)uVar25 >> 0x10) ==
                                                                   bVar13),CONCAT11(-((byte)((ulong)
                                                  uVar25 >> 8) == bVar13),-((byte)uVar25 == bVar13))
                                                  )))))) & 0x8080808080808080;
    goto joined_r0x004bed00;
  }
  uVar17 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
  if (uVar21 == *(uint *)(lVar18 + -4 +
                         (uVar15 + ((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) & uVar6) *
                         -4)) goto LAB_004bed64;
  uVar7 = uVar7 - 1 & uVar7;
  goto joined_r0x004bed00;
code_r0x004bee04:
  if (uVar6 < uVar7) {
    uVar20 = (ulong)*(uint *)(lVar5 + uVar6 * 0x30 + 0x20);
    uVar17 = uVar15;
    uVar15 = uVar6;
    if (*(ulong *)(puStack_88 + 0x10) <= uVar6) goto code_r0x004bf7a8;
  }
  else {
    if (uVar7 <= uVar15) {
code_r0x004bee9c:
      func_0x005848b8(&puStack_a0,lVar4,param_4);
      lVar5 = *(long *)(puStack_a0 + 0xe);
      uVar7 = *(ulong *)(puStack_a0 + 0x10);
      uVar6 = (ulong)puStack_98 & 0xffffffff;
      uVar15 = (ulong)puStack_98 >> 0x20;
      goto code_r0x004beecc;
    }
    lVar18 = lVar5 + uVar15 * 0x30;
    uVar17 = (ulong)*(uint *)(lVar18 + 0x24);
    if (*(int *)(lVar18 + 0x28) == (int)puStack_90) {
      do {
        uVar15 = uVar17;
        if (uVar7 <= uVar15) goto code_r0x004bee9c;
        lVar18 = lVar5 + uVar15 * 0x30;
        uVar17 = (ulong)*(uint *)(lVar18 + 0x24);
      } while (*(int *)(lVar18 + 0x28) == (int)puStack_90);
    }
    uVar20 = uVar6;
    if (*(ulong *)(puStack_88 + 0x10) <= uVar15) goto code_r0x004bf7a8;
  }
  plVar19 = (long *)(*(long *)(puStack_88 + 0xe) + uVar15 * 0x30);
  if (*plVar19 == -0x8000000000000000) goto code_r0x004bf7a8;
  uVar6 = uVar20;
  uVar15 = uVar17;
  if (*(uint *)((long)plVar19 + 0x2c) == uStack_80 && *(uint *)(plVar19 + 5) == uVar12) {
    return 0;
  }
  goto code_r0x004bee04;
code_r0x004beecc:
  if (uVar6 < uVar7) {
    uVar20 = (ulong)*(uint *)(lVar5 + uVar6 * 0x30 + 0x20);
    uVar17 = uVar15;
    uVar15 = uVar6;
    if (*(ulong *)(puStack_88 + 0x10) <= uVar6) goto code_r0x004bf7a8;
  }
  else {
    if (uVar7 <= uVar15) {
code_r0x004bef64:
      uVar22 = *(uint *)(lVar4 + 0x78);
      uVar1 = *(uint *)(lVar4 + 0x7c);
      if (uVar22 == 1 && uVar1 == uVar12) {
        uVar7 = param_4;
      }
      else {
        uVar6 = func_0x004bf8d0(lVar4,param_4);
        uVar7 = (ulong)uVar1;
        if ((uVar6 & 1) == 0) {
          iVar3 = func_0x004bf990(lVar4,param_4);
          if (iVar3 == 0) {
            func_0x0058497c(&puStack_118,lVar4,param_4);
            func_0x00584fc4(&puStack_a0,lVar4,param_4);
            if (puStack_a0 == (uint *)0x8000000000000000) {
              func_0x007a23bc(&UNK_009e6000);
            }
            else {
              puStack_d8 = puStack_98;
              puStack_e0 = puStack_a0;
              uStack_d0 = (ulong)puStack_90;
              lVar5 = func_0x005847cc(lVar4,uVar11);
              if (lVar5 != 0) {
                puStack_88 = puStack_d8 + uStack_d0 * 0x42;
                puStack_a0 = puStack_d8;
                puStack_98 = puStack_d8;
                puStack_90 = puStack_e0;
                func_0x004ca0e0(lVar5,&puStack_a0,&UNK_009e6030);
                puStack_98 = (uint *)uStack_110;
                puStack_a0 = puStack_118;
                puStack_90 = (uint *)uStack_108;
                func_0x00584c34(&puStack_c0,lVar4,uVar11,&puStack_a0);
                func_0x004bb068(&puStack_c0);
                return 1;
              }
              func_0x007a23bc(&UNK_009e6018);
            }
            goto LAB_004bf7c0;
          }
          uVar22 = *(uint *)(lVar4 + 0x78);
          uVar7 = (ulong)*(uint *)(lVar4 + 0x7c);
        }
      }
      if (((uVar22 & 1) != 0) && ((uint)uVar7 == uVar21)) {
        return 0;
      }
      uVar7 = func_0x004bf8d0(lVar4,uVar11);
      if ((uVar7 & 1) != 0) {
        return 0;
      }
      puStack_98 = *(uint **)(lVar4 + 0x38);
      puStack_90 = *(uint **)(lVar4 + 0x40);
      if (((uVar11 & 0xffffffff) < *(ulong *)(lVar4 + 0x28)) &&
         (plVar19 = (long *)(*(long *)(lVar4 + 0x20) + (uVar11 & 0xffffffff) * 0x20),
         *plVar19 != -0x8000000000000000)) {
        puStack_88 = (uint *)plVar19[3];
      }
      else {
        puStack_88 = (uint *)0xffffffffffffffff;
      }
      puStack_a0 = (uint *)0x1;
      uStack_80 = uVar21;
      func_0x004ceba8(&puStack_c0,&puStack_a0,&UNK_009e5910);
      puVar8 = puStack_b8;
      puVar16 = puStack_c0;
      puVar14 = puStack_b8 + uStack_b0 * 2;
      puVar23 = puStack_b8;
      goto code_r0x004bf4e0;
    }
    lVar18 = lVar5 + uVar15 * 0x30;
    uVar17 = (ulong)*(uint *)(lVar18 + 0x24);
    if (*(int *)(lVar18 + 0x28) == (int)puStack_90) {
      do {
        uVar15 = uVar17;
        if (uVar7 <= uVar15) goto code_r0x004bef64;
        lVar18 = lVar5 + uVar15 * 0x30;
        uVar17 = (ulong)*(uint *)(lVar18 + 0x24);
      } while (*(int *)(lVar18 + 0x28) == (int)puStack_90);
    }
    uVar20 = uVar6;
    if (*(ulong *)(puStack_88 + 0x10) <= uVar15) goto code_r0x004bf7a8;
  }
  plVar19 = (long *)(*(long *)(puStack_88 + 0xe) + uVar15 * 0x30);
  if (*plVar19 == -0x8000000000000000) goto code_r0x004bf7a8;
  uVar6 = uVar20;
  uVar15 = uVar17;
  if (*(uint *)((long)plVar19 + 0x2c) == uStack_80 && *(uint *)(plVar19 + 5) == uVar12) {
    return 0;
  }
  goto code_r0x004beecc;
code_r0x004bf4e0:
  if (puVar23 == puVar14) goto code_r0x004bf604;
  uVar21 = puVar23[1];
  uVar7 = (ulong)uVar21;
  uVar6 = *(ulong *)(lVar4 + 0x40);
  if (uVar6 <= uVar7) goto code_r0x004bf7b4;
  lVar5 = *(long *)(lVar4 + 0x38);
  plVar19 = (long *)(lVar5 + uVar7 * 0x30);
  if (*plVar19 == -0x8000000000000000) goto code_r0x004bf7b4;
  uVar12 = *puVar23;
  uVar15 = plVar19[5];
  uVar17 = *(ulong *)(lVar4 + 0x28);
  uVar20 = uVar15 & 0xffffffff;
  if (uVar20 < uVar17) {
    uVar22 = *(uint *)((long)plVar19 + 0x24);
    lVar18 = *(long *)(lVar4 + 0x20);
    puVar9 = (uint *)(lVar18 + uVar20 * 0x20 + 0x18);
    uVar1 = *puVar9;
    while (uVar20 = (ulong)uVar1, uVar20 != uVar7) {
      if (uVar6 <= uVar20) goto code_r0x004bf558;
      puVar9 = (uint *)(lVar5 + uVar20 * 0x30 + 0x20);
      uVar1 = *puVar9;
    }
    *puVar9 = *(uint *)(plVar19 + 4);
code_r0x004bf558:
    uVar15 = uVar15 >> 0x20;
    if (uVar15 < uVar17) {
      puVar9 = (uint *)(lVar18 + uVar15 * 0x20 + 0x1c);
      uVar1 = *puVar9;
      while (uVar15 = (ulong)uVar1, uVar15 != uVar7) {
        if (uVar6 <= uVar15) goto code_r0x004bf590;
        puVar9 = (uint *)(lVar5 + uVar15 * 0x30 + 0x24);
        uVar1 = *puVar9;
      }
      *puVar9 = uVar22;
    }
  }
code_r0x004bf590:
  *(undefined4 *)(plVar19 + 4) = *(undefined4 *)(lVar4 + 0x5c);
  *(undefined8 *)((long)plVar19 + 0x24) = 0xffffffffffffffff;
  *(undefined4 *)((long)plVar19 + 0x2c) = 0xffffffff;
  *(uint *)(lVar4 + 0x5c) = uVar21;
  *(long *)(lVar4 + 0x50) = *(long *)(lVar4 + 0x50) + -1;
  lVar5 = *plVar19;
  *plVar19 = -0x8000000000000000;
  if (lVar5 == -0x8000000000000000) goto code_r0x004bf7b4;
  lStack_f0 = plVar19[2];
  lStack_f8 = plVar19[1];
  lStack_e8 = plVar19[3];
  lStack_100 = lVar5;
  func_0x004d5990(lVar4 + 0x18,uVar12,param_4,&lStack_100);
  puVar23 = puVar23 + 2;
  func_0x004be348(lVar4,uVar12);
  goto code_r0x004bf4e0;
code_r0x004bf604:
  if (puVar16 != (uint *)0x0) {
    func_0x00187bd4(puVar8,(long)puVar16 << 3,4);
  }
  func_0x00584fc4(&puStack_a0,lVar4,uVar11);
  if (puStack_a0 == (uint *)0x8000000000000000) goto code_r0x004bf73c;
  puStack_b8 = puStack_98;
  puStack_c0 = puStack_a0;
  uStack_b0 = (ulong)puStack_90;
  puVar10 = (undefined8 *)func_0x005847cc(lVar4,param_4);
  if (puVar10 != (undefined8 *)0x0) {
    puStack_90 = (uint *)*puVar10;
    puStack_a0 = (uint *)puVar10[1];
    lVar5 = puVar10[2];
    *puVar10 = 0;
    puVar10[1] = 8;
    puVar10[2] = 0;
    puStack_88 = puStack_a0 + lVar5 * 0x42;
    puStack_98 = puStack_a0;
    func_0x004ca0e0(&puStack_c0,&puStack_a0,&UNK_009e6078);
    puStack_98 = puStack_b8;
    puStack_a0 = puStack_c0;
    puStack_90 = (uint *)uStack_b0;
    plVar19 = (long *)func_0x005847cc(lVar4,param_4);
    if (plVar19 != (long *)0x0) {
      func_0x004bb334(plVar19);
      plVar19[1] = (long)puStack_98;
      *plVar19 = (long)puStack_a0;
      plVar19[2] = (long)puStack_90;
      return 1;
    }
    func_0x007a23bc(&UNK_009e6090);
    goto LAB_004bf7c0;
  }
  goto code_r0x004bf748;
code_r0x004bf7a8:
  func_0x007a23bc(&UNK_009e58b0);
code_r0x004bf7b4:
  func_0x007a23bc(&UNK_009e60a8);
  goto LAB_004bf7c0;
code_r0x004bf08c:
  puStack_98 = *(uint **)(lVar4 + 0x38);
  puStack_90 = *(uint **)(lVar4 + 0x40);
  if (((uVar11 & 0xffffffff) < *(ulong *)(lVar4 + 0x28)) &&
     (plVar19 = (long *)(*(long *)(lVar4 + 0x20) + (uVar11 & 0xffffffff) * 0x20),
     *plVar19 != -0x8000000000000000)) {
    puStack_88 = (uint *)plVar19[3];
  }
  else {
    puStack_88 = (uint *)0xffffffffffffffff;
  }
  puStack_a0 = (uint *)0x1;
  uStack_80 = uVar21;
  func_0x004ceba8(&puStack_c0,&puStack_a0,&UNK_009e5910);
  puVar14 = puStack_b8;
  puVar8 = puStack_c0;
  puVar16 = puStack_b8 + uStack_b0 * 2;
  for (puVar23 = puStack_b8; puVar23 != puVar16; puVar23 = puVar23 + 2) {
    uVar21 = puVar23[1];
    uVar7 = (ulong)uVar21;
    uVar6 = *(ulong *)(lVar4 + 0x40);
    if (uVar6 <= uVar7) {
code_r0x004bf788:
      func_0x007a23bc(&UNK_009e5fe8);
      goto LAB_004bf7c0;
    }
    lVar5 = *(long *)(lVar4 + 0x38);
    plVar19 = (long *)(lVar5 + uVar7 * 0x30);
    if (*plVar19 == -0x8000000000000000) goto code_r0x004bf788;
    uVar12 = *puVar23;
    uVar15 = plVar19[5];
    uVar17 = *(ulong *)(lVar4 + 0x28);
    uVar20 = uVar15 & 0xffffffff;
    if (uVar20 < uVar17) {
      uVar22 = *(uint *)((long)plVar19 + 0x24);
      lVar18 = *(long *)(lVar4 + 0x20);
      puVar9 = (uint *)(lVar18 + uVar20 * 0x20 + 0x18);
      uVar1 = *puVar9;
      while (uVar20 = (ulong)uVar1, uVar20 != uVar7) {
        if (uVar6 <= uVar20) goto code_r0x004bf30c;
        puVar9 = (uint *)(lVar5 + uVar20 * 0x30 + 0x20);
        uVar1 = *puVar9;
      }
      *puVar9 = *(uint *)(plVar19 + 4);
code_r0x004bf30c:
      uVar15 = uVar15 >> 0x20;
      if (uVar15 < uVar17) {
        puVar9 = (uint *)(lVar18 + uVar15 * 0x20 + 0x1c);
        uVar1 = *puVar9;
        while (uVar15 = (ulong)uVar1, uVar15 != uVar7) {
          if (uVar6 <= uVar15) goto code_r0x004bf344;
          puVar9 = (uint *)(lVar5 + uVar15 * 0x30 + 0x24);
          uVar1 = *puVar9;
        }
        *puVar9 = uVar22;
      }
    }
code_r0x004bf344:
    *(undefined4 *)(plVar19 + 4) = *(undefined4 *)(lVar4 + 0x5c);
    *(undefined8 *)((long)plVar19 + 0x24) = 0xffffffffffffffff;
    *(undefined4 *)((long)plVar19 + 0x2c) = 0xffffffff;
    *(uint *)(lVar4 + 0x5c) = uVar21;
    *(long *)(lVar4 + 0x50) = *(long *)(lVar4 + 0x50) + -1;
    lVar5 = *plVar19;
    *plVar19 = -0x8000000000000000;
    if (lVar5 == -0x8000000000000000) goto code_r0x004bf788;
    lStack_128 = plVar19[2];
    lStack_130 = plVar19[1];
    lStack_120 = plVar19[3];
    lStack_138 = lVar5;
    func_0x004d5990(lVar4 + 0x18,uVar12,param_4,&lStack_138);
    func_0x004be348(lVar4,uVar12);
  }
  if (puVar8 == (uint *)0x0) goto code_r0x004bf3cc;
  lVar5 = (long)puVar8 << 3;
code_r0x004bf3c4:
  func_0x00187bd4(puVar14,lVar5,4);
code_r0x004bf3cc:
  func_0x00584fc4(&puStack_a0,lVar4,uVar11);
  func_0x004bcba8(&puStack_a0);
  return 1;
}

