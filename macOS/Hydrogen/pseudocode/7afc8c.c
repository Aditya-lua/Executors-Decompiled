
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_007afc8c(void)

{
  ulong *puVar1;
  bool bVar2;
  undefined *puVar3;
  byte bVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  code *pcVar7;
  bool bVar8;
  undefined8 uVar9;
  byte *pbVar10;
  long *plVar11;
  long *plVar12;
  ulong uVar13;
  uint uVar14;
  undefined *puVar15;
  undefined *puVar16;
  long in_x3;
  long in_x4;
  uint uVar17;
  int iVar18;
  code *extraout_x8;
  long lVar19;
  long lVar20;
  long *plVar21;
  ulong uVar22;
  byte bVar23;
  long *unaff_x19;
  undefined *unaff_x20;
  long lVar24;
  undefined1 auVar25 [12];
  undefined1 auVar26 [16];
  undefined *puStack_2f0;
  long lStack_2c8;
  long lStack_2c0;
  undefined8 uStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined8 uStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  long lStack_228;
  long lStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  int aiStack_120 [2];
  long lStack_118;
  undefined8 uStack_110;
  ulong uStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  undefined *puStack_f0;
  long *plStack_e8;
  undefined1 ***pppuStack_e0;
  undefined8 uStack_d8;
  int aiStack_d0 [2];
  long lStack_c8;
  undefined8 uStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  undefined *puStack_a0;
  long *plStack_98;
  undefined1 **ppuStack_90;
  undefined8 uStack_88;
  int aiStack_80 [2];
  long lStack_78;
  undefined8 uStack_70;
  ulong uStack_68;
  long lStack_60;
  long lStack_58;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  func_0x00593904();
  __Unwind_Resume();
  func_0x007a247c(&UNK_008b583c,0x13,&UNK_009f2900);
  uStack_18 = 0x7afcb8;
  puStack_20 = (undefined1 *)(aiStack_80 + 0x1c);
  func_0x007a247c(&UNK_008b583c,0x13,&UNK_009f2900);
  uStack_28 = 0x7afcd8;
  puVar15 = &UNK_009f2c20;
  puStack_30 = (undefined1 *)&puStack_20;
  auVar26 = func_0x007a247c(&UNK_008b5b50,0x13);
  uVar13 = auVar26._8_8_;
  plVar12 = auVar26._0_8_;
  uStack_38 = 0x7afcf8;
  if (CARRY8(uVar13,(ulong)puVar15)) {
LAB_007afdcc:
    puStack_40 = (undefined1 *)&puStack_30;
    func_0x007a1f00(0,uVar13,&UNK_009f3548);
LAB_007afdd8:
    auVar26._8_8_ = uStack_70;
    auVar26._0_8_ = unaff_x19;
    lVar24 = lStack_78;
  }
  else {
    lVar20 = *plVar12;
    unaff_x20 = puVar15 + uVar13;
    if (puVar15 + uVar13 <= (undefined *)(lVar20 * 2)) {
      unaff_x20 = (undefined *)(lVar20 * 2);
    }
    puVar15 = (undefined *)0x8;
    if (in_x4 != 1) {
      puVar15 = (undefined *)0x4;
    }
    if (unaff_x20 <= puVar15) {
      unaff_x20 = puVar15;
    }
    uVar22 = (in_x3 + in_x4) - 1U & -in_x3;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = uVar22;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = unaff_x20;
    unaff_x19 = plVar12;
    if (SUB168(auVar5 * auVar6,8) != 0) goto LAB_007afdcc;
    uVar22 = uVar22 * (long)unaff_x20;
    lVar24 = 0;
    puStack_40 = (undefined1 *)&puStack_30;
    if (uVar22 <= 0x8000000000000000U - in_x3) {
      lStack_60 = 0;
      if (lVar20 != 0) {
        uStack_68 = plVar12[1];
        lStack_58 = lVar20 * in_x4;
        lStack_60 = in_x3;
      }
      puStack_40 = (undefined1 *)&puStack_30;
      uVar9 = func_0x0079a108(aiStack_80,in_x3,uVar22,&uStack_68);
      if (aiStack_80[0] != 1) {
        *plVar12 = (long)unaff_x20;
        plVar12[1] = lStack_78;
        return uVar9;
      }
      goto LAB_007afdd8;
    }
  }
  plVar12 = auVar26._0_8_;
  puVar16 = &UNK_009f3548;
  auVar26 = func_0x007a1f00(lVar24,auVar26._8_8_);
  plVar11 = auVar26._0_8_;
  uStack_88 = 0x7afde8;
  lVar20 = *plVar11;
  puVar15 = puVar16 + auVar26._8_8_;
  if (puVar16 + auVar26._8_8_ <= (undefined *)(lVar20 * 2)) {
    puVar15 = (undefined *)(lVar20 * 2);
  }
  puVar16 = puVar15;
  if (puVar15 < (undefined *)0x5) {
    puVar16 = (undefined *)0x4;
  }
  uVar13 = (long)puVar16 * 0x10;
  puStack_a0 = unaff_x20;
  plStack_98 = plVar12;
  ppuStack_90 = &puStack_40;
  if ((ulong)puVar15 >> 0x3c == 0 && uVar13 < 0x7ffffffffffffff9) {
    uStack_b0 = 0;
    if (lVar20 != 0) {
      uStack_b8 = plVar11[1];
      lStack_a8 = lVar20 << 4;
      uStack_b0 = 8;
    }
    uVar9 = func_0x007a5e18(aiStack_d0,uVar13,&uStack_b8);
    plVar12 = plVar11;
    if (aiStack_d0[0] != 1) {
      *plVar11 = (long)puVar16;
      plVar11[1] = lStack_c8;
      return uVar9;
    }
  }
  else {
    func_0x007a1f00(0,uVar13,&UNK_009f35a0);
  }
  puVar15 = &UNK_009f35a0;
  auVar26 = func_0x007a1f00(lStack_c8,uStack_c0);
  uVar13 = auVar26._8_8_;
  plVar11 = auVar26._0_8_;
  uStack_d8 = 0x7afea0;
  puStack_f0 = puVar16;
  plStack_e8 = plVar12;
  pppuStack_e0 = &ppuStack_90;
  if (!CARRY8(uVar13,(ulong)puVar15)) {
    lVar20 = *plVar11;
    puVar3 = puVar15 + uVar13;
    if (puVar15 + uVar13 <= (undefined *)(lVar20 * 2)) {
      puVar3 = (undefined *)(lVar20 * 2);
    }
    puVar16 = puVar3;
    if (puVar3 < (undefined *)0x5) {
      puVar16 = (undefined *)0x4;
    }
    if ((ulong)puVar3 >> 0x3e == 0 && (ulong)((long)puVar16 * 4) < 0x7ffffffffffffffd) {
      uStack_100 = 0;
      if (lVar20 != 0) {
        uStack_108 = plVar11[1];
        lStack_f8 = lVar20 << 2;
        uStack_100 = 4;
      }
      uVar9 = func_0x0079a108(aiStack_120,4,(long)puVar16 * 4,&uStack_108);
      if (aiStack_120[0] != 1) {
        *plVar11 = (long)puVar16;
        plVar11[1] = lStack_118;
        return uVar9;
      }
      goto LAB_007aff54;
    }
  }
  func_0x007a1f00(0,uVar13,&UNK_009f37e0);
LAB_007aff54:
  uVar14 = 0x9f37e0;
  auVar26 = func_0x007a1f00(lStack_118,uStack_110);
  lVar20 = auVar26._8_8_;
  pbVar10 = auVar26._0_8_;
  puVar15 = (undefined *)0x0;
  puStack_2f0 = &UNK_009f3810;
  bVar4 = *pbVar10;
joined_r0x007affe4:
  while( true ) {
    while ((bVar4 & 1) == 0) {
      bVar23 = bVar4 | 1;
      bVar2 = *pbVar10 == bVar4;
      bVar4 = *pbVar10;
      if (bVar2) {
        *pbVar10 = bVar23;
        return 1;
      }
    }
    if ((bVar4 >> 1 & 1) != 0) goto LAB_007b0024;
    uVar17 = (uint)puVar15;
    if (9 < uVar17) goto code_r0x007b0010;
    puVar15 = (undefined *)(ulong)(uVar17 + 1);
    if (uVar17 < 3) break;
    func_0x00412518();
    puVar16 = puVar15;
    bVar4 = *pbVar10;
  }
  iVar18 = 2 << (ulong)(uVar17 & 0x1f);
  do {
    InstructionSynchronizationBarrier();
    iVar18 = iVar18 + -1;
  } while (iVar18 != 0);
  goto LAB_007b027c;
code_r0x007b0010:
  bVar23 = bVar4 | 2;
  bVar2 = *pbVar10 != bVar4;
  bVar4 = *pbVar10;
  if (bVar2) goto joined_r0x007affe4;
  *pbVar10 = bVar23;
LAB_007b0024:
  bVar2 = false;
  plVar11 = (long *)(*
                    ___ZN16parking_lot_core11parking_lot16with_thread_data11THREAD_DATA29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h1d6252a8b8badc7dE
                    )();
  plVar12 = plVar11 + 1;
  if (*plVar11 != 1) {
    if (*plVar11 == 2) {
      func_0x005e5d5c(&lStack_228);
      bVar2 = true;
      uStack_260 = uStack_1c0;
      uStack_268 = uStack_1c8;
      uStack_250 = uStack_1b0;
      uStack_258 = uStack_1b8;
      uStack_240 = uStack_1a0;
      uStack_248 = uStack_1a8;
      uStack_230 = uStack_190;
      uStack_238 = uStack_198;
      uStack_2a0 = uStack_200;
      uStack_2a8 = uStack_208;
      uStack_290 = uStack_1f0;
      uStack_298 = uStack_1f8;
      uStack_280 = uStack_1e0;
      uStack_288 = uStack_1e8;
      uStack_270 = uStack_1d0;
      uStack_278 = uStack_1d8;
      lStack_2c0 = lStack_220;
      lStack_2c8 = lStack_228;
      uStack_2b0 = uStack_210;
      uStack_2b8 = uStack_218;
      plVar12 = &lStack_2c8;
    }
    else {
      uVar9 = (*extraout_x8)(&
                             __ZN16parking_lot_core11parking_lot16with_thread_data11THREAD_DATA29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h1d6252a8b8badc7dE
                            );
      plVar12 = (long *)func_0x007b08e4(uVar9,0);
    }
  }
  while( true ) {
    if (___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E == (long *)0x0) {
      plVar11 = (long *)func_0x007b0c50();
      uVar13 = (ulong)((long)pbVar10 * -0x61c8864680b583eb) >>
               ((ulong)(uint)-(int)plVar11[3] & 0x3f);
      uVar22 = plVar11[1];
      if (uVar22 <= uVar13) goto LAB_007b0588;
    }
    else {
      uVar13 = (ulong)((long)pbVar10 * -0x61c8864680b583eb) >>
               ((ulong)(uint)-(int)___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E
                                   [3] & 0x3f);
      uVar22 = ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E[1];
      plVar11 = ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E;
      if (uVar22 <= uVar13) goto LAB_007b0588;
    }
    puVar1 = (ulong *)(*plVar11 + uVar13 * 0x40);
    if (*puVar1 == 0) {
      *puVar1 = 1;
    }
    else {
      func_0x007b0d40(puVar1);
    }
    if (___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E == plVar11) break;
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
  }
  if (*pbVar10 != 3) {
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    lVar24 = 1;
    goto joined_r0x007b0508;
  }
  *(bool *)(plVar12 + 0x13) = uVar14 != 1000000000;
  plVar12[0x10] = 0;
  plVar12[0xf] = (long)pbVar10;
  plVar12[0x12] = 0;
  *(undefined1 *)(plVar12 + 0xe) = 1;
  if ((*(byte *)((long)plVar12 + 0x71) & 1) == 0) {
    *(undefined1 *)((long)plVar12 + 0x71) = 1;
  }
  if (puVar1[1] == 0) {
    puVar1[1] = (ulong)plVar12;
    puVar1[2] = (ulong)plVar12;
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) goto LAB_007b0538;
  }
  else {
    *(long **)(puVar1[2] + 0x80) = plVar12;
    puVar1[2] = (ulong)plVar12;
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) {
LAB_007b0538:
      func_0x007b0f88(puVar1);
    }
  }
  _pthread_mutex_lock(plVar12);
  bVar4 = *(byte *)(plVar12 + 0xe);
  if (uVar14 != 1000000000) {
joined_r0x007b022c:
    if (bVar4 != 0) {
      do {
        auVar25 = func_0x00428c10();
        if (lVar20 == auVar25._0_8_) {
          if (uVar14 <= auVar25._8_4_) {
code_r0x007b0368:
            _pthread_mutex_unlock(plVar12);
            goto code_r0x007b0388;
          }
        }
        else if (lVar20 <= auVar25._0_8_) goto code_r0x007b0368;
        auVar26 = func_0x00428ed4(lVar20,uVar14);
        lVar24 = auVar26._0_8_;
        if (-1 < lVar24) {
          _gettimeofday(&lStack_228,0);
          lVar19 = lStack_228 + lVar24;
          if (!SCARRY8(lStack_228,lVar24)) {
            lVar24 = (long)(int)lStack_220 * 1000 + (auVar26._8_8_ & 0xffffffff);
            if (lVar24 < 1000000000) goto code_r0x007b0298;
            bVar8 = SCARRY8(lVar19,1);
            lVar19 = lVar19 + 1;
            if (!bVar8) goto code_r0x007b028c;
          }
        }
        _pthread_cond_wait(plVar12 + 8,plVar12);
        if ((*(byte *)(plVar12 + 0xe) & 1) == 0) break;
      } while( true );
    }
    goto LAB_007b0230;
  }
  while (bVar4 != 0) {
    _pthread_cond_wait(plVar12 + 8,plVar12);
    bVar4 = *(byte *)(plVar12 + 0xe) & 1;
  }
LAB_007b0230:
  _pthread_mutex_unlock(plVar12);
code_r0x007b0238:
  lVar24 = 0;
  puVar16 = (undefined *)(ulong)(plVar12[0x11] == 1);
joined_r0x007b0508:
  if (bVar2) {
    func_0x005e6010(&lStack_2c8);
    _pthread_mutex_destroy(&lStack_2c8);
    _pthread_cond_destroy(&uStack_288);
  }
  if (lVar24 == 0) {
    if (((ulong)puVar16 & 1) != 0) {
      return 1;
    }
    puVar15 = (undefined *)0x0;
    puVar16 = puVar15;
    bVar4 = *pbVar10;
  }
  else {
    if (lVar24 != 1) {
      return 0;
    }
    puVar15 = (undefined *)0x0;
LAB_007b027c:
    puVar16 = puVar15;
    bVar4 = *pbVar10;
  }
  goto joined_r0x007affe4;
code_r0x007b0388:
  plVar11 = ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E;
  if (___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E == (long *)0x0) {
    plVar11 = (long *)func_0x007b0c50();
  }
  puVar16 = (undefined *)plVar12[0xf];
  uVar13 = (ulong)((long)puVar16 * -0x61c8864680b583eb) >> ((ulong)(uint)-(int)plVar11[3] & 0x3f);
  uVar22 = plVar11[1];
  if (uVar22 <= uVar13) {
    puStack_2f0 = &UNK_009f3828;
LAB_007b0588:
    func_0x007a2570(uVar13,uVar22,puStack_2f0);
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x7b0594);
    (*pcVar7)();
  }
  puVar1 = (ulong *)(*plVar11 + uVar13 * 0x40);
  if (*puVar1 == 0) {
    *puVar1 = 1;
  }
  else {
    func_0x007b0d40(puVar1);
  }
  if ((___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E != plVar11) ||
     ((undefined *)plVar12[0xf] != puVar16)) {
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    goto code_r0x007b0388;
  }
  _pthread_mutex_lock(plVar12);
  bVar4 = *(byte *)(plVar12 + 0xe);
  _pthread_mutex_unlock(plVar12);
  if ((bVar4 & 1) != 0) {
    plVar11 = (long *)puVar1[1];
    if (plVar11 != (long *)0x0) {
      if (plVar11 == plVar12) {
        uVar13 = plVar11[0x10];
        puVar1[1] = uVar13;
        if ((long *)puVar1[2] != plVar12) {
          bVar8 = true;
          goto joined_r0x007b04c0;
        }
        puVar1[2] = 0;
code_r0x007b04e4:
        *pbVar10 = *pbVar10 & 0xfd;
      }
      else {
        bVar8 = true;
        do {
          plVar21 = plVar11;
          plVar11 = (long *)plVar21[0x10];
          if (plVar11 == (long *)0x0) goto code_r0x007b04ec;
          bVar8 = (bool)((undefined *)plVar21[0xf] != puVar16 & bVar8);
        } while (plVar11 != plVar12);
        uVar13 = plVar11[0x10];
        plVar21[0x10] = uVar13;
        if ((long *)puVar1[2] == plVar12) {
          puVar1[2] = (ulong)plVar21;
          if (bVar8) goto code_r0x007b04e4;
        }
        else {
joined_r0x007b04c0:
          for (; uVar13 != 0; uVar13 = *(ulong *)(uVar13 + 0x80)) {
            if (*(undefined **)(uVar13 + 0x78) == puVar16) goto code_r0x007b04ec;
          }
          if (bVar8) goto code_r0x007b04e4;
        }
      }
    }
code_r0x007b04ec:
    uVar13 = *puVar1;
    *puVar1 = uVar13 - 1;
    LORelease();
    if (3 < uVar13 && (uVar13 & 2) == 0) {
      func_0x007b0f88(puVar1);
    }
    lVar24 = 2;
    goto joined_r0x007b0508;
  }
  uVar13 = *puVar1;
  *puVar1 = uVar13 - 1;
  LORelease();
  if (3 < uVar13 && (uVar13 & 2) == 0) {
    func_0x007b0f88(puVar1);
  }
  goto code_r0x007b0238;
code_r0x007b028c:
  lVar24 = lVar24 + -1000000000;
code_r0x007b0298:
  lStack_228 = lVar19;
  lStack_220 = lVar24;
  _pthread_cond_timedwait(plVar12 + 8,plVar12,&lStack_228);
  bVar4 = *(byte *)(plVar12 + 0xe) & 1;
  goto joined_r0x007b022c;
}

