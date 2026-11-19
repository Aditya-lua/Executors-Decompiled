/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00821414
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00821414(undefined8 param_1)

{
  undefined8 *******pppppppuVar1;
  basic_string_conflict *pbVar2;
  long lVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  uint3 uVar7;
  uint7 uVar8;
  undefined8 *******pppppppuVar9;
  undefined8 *puVar10;
  bool bVar11;
  byte *pbVar12;
  int iVar13;
  char *pcVar14;
  char *__s;
  basic_string_conflict *pbVar15;
  size_t sVar16;
  void *pvVar17;
  long lVar18;
  ulong uVar19;
  ulong *puVar20;
  undefined8 *puVar21;
  undefined8 uVar22;
  undefined **ppuVar23;
  ulong uVar24;
  undefined1 (*pauVar25) [16];
  byte *pbVar26;
  ulong uVar27;
  undefined8 uVar28;
  undefined8 *puVar29;
  undefined8 *******pppppppuVar30;
  byte *pbVar31;
  undefined8 *******pppppppuVar32;
  void *pvVar33;
  byte bVar34;
  byte bVar35;
  undefined8 uVar36;
  undefined4 uVar37;
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined8 local_380;
  size_t sStack_378;
  void *local_370;
  undefined8 local_270;
  basic_string_conflict *pbStack_268;
  void *local_260;
  undefined8 local_258;
  ulong local_250;
  long lStack_248;
  undefined8 *local_240;
  undefined8 local_238;
  undefined8 local_230;
  undefined **ppuStack_228;
  undefined8 local_220;
  undefined8 uStack_218;
  undefined8 local_210;
  undefined8 uStack_208;
  undefined1 local_200;
  undefined8 local_1f8;
  undefined8 uStack_1f0;
  undefined8 local_1e8;
  undefined8 uStack_1e0;
  undefined8 local_1d8;
  undefined8 uStack_1d0;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 uStack_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  size_t local_160;
  void *pvStack_158;
  void *local_150;
  undefined8 local_148;
  size_t sStack_140;
  void *local_138;
  void *local_130;
  undefined8 *******local_128;
  undefined8 *******local_120;
  undefined8 uStack_118;
  byte local_110;
  undefined7 uStack_10f;
  undefined8 uStack_108;
  void *local_100;
  byte local_f8;
  undefined7 uStack_f7;
  ulong uStack_f0;
  byte *pbStack_e8;
  byte local_e0;
  undefined7 uStack_df;
  void *pvStack_d8;
  void *local_d0;
  undefined1 uStack_c1;
  undefined ***local_c0;
  undefined8 uStack_b8;
  void *local_b0;
  undefined **local_a0;
  size_t sStack_98;
  void *local_90;
  void *local_88;
  long local_78;
  
  lVar6 = tpidr_el0;
  local_78 = *(long *)(lVar6 + 0x28);
  iVar13 = FUN_008ab0e0(param_1,1);
  if (iVar13 != 6) {
    FUN_008240e0();
    uVar28 = FUN_00824148(&DAT_00d1cb18);
    FUN_00824188();
    if (*(long *)(lVar6 + 0x28) == local_78) {
      uVar22 = FUN_00824264(&DAT_00d1cb28);
                    /* WARNING: Subroutine does not return */
      FUN_008aecb4(param_1,uVar28,uVar22);
    }
    goto LAB_00823c68;
  }
  if (((DAT_00d1cb58 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cb58), iVar13 != 0)) {
    DAT_00d1cb54 = '\x01';
    DAT_00d1cb50 = 0xc759d1ce;
    __cxa_atexit(&LAB_00825090,&DAT_00d1cb50,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb58);
  }
  if (DAT_00d1cb54 == '\x01') {
    DAT_00d1cb54 = '\0';
    uVar7 = CONCAT12((char)(DAT_00d1cb50 >> 8),(short)DAT_00d1cb50) & 0xff00ff;
    DAT_00d1cb50 = CONCAT13((char)(DAT_00d1cb50 >> 0x18),
                            CONCAT12((char)(DAT_00d1cb50 >> 0x10),
                                     CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0xc735a39b;
  }
  FUN_0082429c(&local_e0,param_1,&DAT_00d1cb50,&DAT_002ab32c);
  if (((DAT_00d1cb68 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cb68), iVar13 != 0)) {
    _DAT_00d1cb60 = 0x1d93124b581f28a;
    __cxa_atexit(&LAB_00825098,&DAT_00d1cb60,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb68);
  }
  if (DAT_00d1cb67 == '\x01') {
    uVar24 = _DAT_00d1cb60 >> 0x30;
    uVar7 = CONCAT12((char)(_DAT_00d1cb60 >> 8),(short)_DAT_00d1cb60) & 0xff00ff;
    uVar19 = _DAT_00d1cb60 >> 0x10;
    uVar27 = _DAT_00d1cb60 >> 0x18;
    _DAT_00d1cb60 = (uint5)(DAT_00d1cb64 ^ 0x4b) << 0x20;
    _DAT_00d1cb60 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar24,CONCAT15(DAT_00d1cb65,_DAT_00d1cb60)) >> 0x20)
                         ,CONCAT13((char)uVar27,
                                   CONCAT12((char)uVar19,CONCAT11((char)(uVar7 >> 0x10),(char)uVar7)
                                           ))) ^ 0xd95500ddf597c7;
  }
  if (((DAT_00d1cb78 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cb78), iVar13 != 0)) {
    DAT_00d1cb74 = '\x01';
    DAT_00d1cb70 = 0xdda1d280;
    __cxa_atexit(&LAB_008250a4,&DAT_00d1cb70,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb78);
  }
  if (DAT_00d1cb74 == '\x01') {
    DAT_00d1cb74 = '\0';
    uVar7 = CONCAT12((char)(DAT_00d1cb70 >> 8),(short)DAT_00d1cb70) & 0xff00ff;
    DAT_00d1cb70 = CONCAT13((char)(DAT_00d1cb70 >> 0x18),
                            CONCAT12((char)(DAT_00d1cb70 >> 0x10),
                                     CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0xddf597c7;
  }
                    /* try { // try from 00821574 to 0082158f has its CatchHandler @ 00823b30 */
  FUN_0082429c(&local_f8,param_1,&DAT_00d1cb60,&DAT_00d1cb70);
  if (((DAT_00d1cb88 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cb88), iVar13 != 0)) {
    _DAT_00d1cb84 = 0x1bf;
    DAT_00d1cb80 = 0x4fddeeb;
    __cxa_atexit(&LAB_008250ac,&DAT_00d1cb80,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb88);
  }
  if (DAT_00d1cb85 == '\x01') {
    uVar7 = CONCAT12((char)(DAT_00d1cb80 >> 8),(short)DAT_00d1cb80) & 0xff00ff;
    _DAT_00d1cb84 = (ushort)(DAT_00d1cb84 ^ 0xbf);
    DAT_00d1cb80 = CONCAT13((char)(DAT_00d1cb80 >> 0x18),
                            CONCAT12((char)(DAT_00d1cb80 >> 0x10),
                                     CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0x7d99b1a9;
  }
                    /* try { // try from 008215e4 to 008215ff has its CatchHandler @ 00823b20 */
  FUN_0082429c(&local_110,param_1,&DAT_00d1cb80,&DAT_002ab32c);
  pvVar33 = (void *)(ulong)(local_e0 >> 1);
  if ((local_e0 & 1) != 0) {
    pvVar33 = pvStack_d8;
  }
  if (pvVar33 == (void *)0x0) {
    uVar28 = 0;
  }
  else {
    local_120 = (undefined8 *******)0x0;
    uStack_118 = 0;
    local_128 = &local_120;
    if (((DAT_00d1cba0 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cba0), iVar13 != 0)) {
      DAT_00d1cb98 = '\x01';
      DAT_00d1cb90 = 0xbb268d3cbb381ec5;
      __cxa_atexit(&LAB_00825c74,&DAT_00d1cb90,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cba0);
    }
    if (DAT_00d1cb98 == '\x01') {
      DAT_00d1cb98 = '\0';
      DAT_00d1cb90 = DAT_00d1cb90 ^ 0xbb55ff59df597b8d;
    }
                    /* try { // try from 0082166c to 0082167f has its CatchHandler @ 00823b10 */
    FUN_008acba4(param_1,1,&DAT_00d1cb90);
                    /* try { // try from 00821680 to 0082169b has its CatchHandler @ 00823b40 */
    iVar13 = FUN_008ab0e0(param_1,0xffffffff);
    if (iVar13 == 6) {
      FUN_008ac024(param_1);
      pvVar33 = (void *)((ulong)&local_380 | 1);
                    /* try { // try from 008216c4 to 008216cf has its CatchHandler @ 00823ba4 */
      while (iVar13 = FUN_008ae174(param_1,0xfffffffe), iVar13 != 0) {
                    /* try { // try from 008216d4 to 008216e3 has its CatchHandler @ 00823b9c */
        pcVar14 = (char *)FUN_008ab8a4(param_1,0xfffffffe,0);
                    /* try { // try from 008216e4 to 008216f7 has its CatchHandler @ 00823bac */
        __s = (char *)FUN_008ab8a4(param_1,0xffffffff,0);
        if ((pcVar14 != (char *)0x0) && (__s != (char *)0x0)) {
          pbVar15 = (basic_string_conflict *)strlen(__s);
          if ((basic_string_conflict *)0xfffffffffffffff7 < pbVar15) {
            if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00822f3c to 00822f3f has its CatchHandler @ 00823b94 */
              FUN_007fe124();
            }
            goto LAB_00823c68;
          }
          if (pbVar15 < (basic_string_conflict *)0x17) {
            local_270 = CONCAT71(local_270._1_7_,(char)((int)pbVar15 << 1));
            pvVar17 = (void *)((ulong)&local_270 | 1);
            if (pbVar15 != (basic_string_conflict *)0x0) goto LAB_0082175c;
          }
          else {
            uVar19 = 0x1a;
            if (((ulong)pbVar15 | 7) != 0x17) {
              uVar19 = ((ulong)pbVar15 | 7) + 1;
            }
                    /* try { // try from 00821744 to 0082174b has its CatchHandler @ 00823b50 */
            pvVar17 = operator_new(uVar19);
            local_270 = uVar19 | 1;
            pbStack_268 = pbVar15;
            local_260 = pvVar17;
LAB_0082175c:
            memmove(pvVar17,__s,(size_t)pbVar15);
          }
          *(basic_string_conflict *)((long)pvVar17 + (long)pbVar15) = (basic_string_conflict)0x0;
          sVar16 = strlen(pcVar14);
          if (0xfffffffffffffff7 < sVar16) {
            if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00822f54 to 00822f57 has its CatchHandler @ 00823b5c */
              FUN_007fe124();
            }
            goto LAB_00823c68;
          }
          if (sVar16 < 0x17) {
            local_380 = (undefined *)CONCAT71(local_380._1_7_,(char)((int)sVar16 << 1));
            pvVar17 = pvVar33;
            if (sVar16 != 0) goto LAB_008217c8;
          }
          else {
            uVar19 = 0x1a;
            if ((sVar16 | 7) != 0x17) {
              uVar19 = (sVar16 | 7) + 1;
            }
                    /* try { // try from 008217b0 to 008217b7 has its CatchHandler @ 00823b48 */
            pvVar17 = operator_new(uVar19);
            local_380 = (undefined *)(uVar19 | 1);
            sStack_378 = sVar16;
            local_370 = pvVar17;
LAB_008217c8:
            memmove(pvVar17,pcVar14,sVar16);
          }
          *(undefined1 *)((long)pvVar17 + sVar16) = 0;
                    /* try { // try from 008217e0 to 008217f7 has its CatchHandler @ 00823b64 */
          local_148 = (undefined **)&local_380;
          lVar18 = FUN_00825c7c(&local_128,&local_380,&DAT_002dd6a5,&local_148,&local_a0);
          if ((*(byte *)(lVar18 + 0x38) & 1) != 0) {
            operator_delete(*(void **)(lVar18 + 0x48),*(ulong *)(lVar18 + 0x38) & 0xfffffffffffffffe
                           );
          }
          *(basic_string_conflict **)(lVar18 + 0x40) = pbStack_268;
          *(ulong *)(lVar18 + 0x38) = local_270;
          *(void **)(lVar18 + 0x48) = local_260;
          if (((ulong)local_380 & 1) != 0) {
            operator_delete(local_370,(ulong)local_380 & 0xfffffffffffffffe);
          }
        }
                    /* try { // try from 008216b8 to 008216c3 has its CatchHandler @ 00823bac */
        FUN_008aa994(param_1,0xfffffffe);
      }
    }
                    /* try { // try from 00821844 to 0082184f has its CatchHandler @ 00823b40 */
    FUN_008aa994(param_1,0xfffffffe);
    if (((DAT_00d1cbb8 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cbb8), iVar13 != 0)) {
      DAT_00d1cba8 = 0xda1626eae128f0ea;
      _DAT_00d1cbb0 = 0x14df7d1;
      __cxa_atexit(&LAB_0082601c,&DAT_00d1cba8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cbb8);
    }
    if (DAT_00d1cbb3 == '\x01') {
      DAT_00d1cba8 = DAT_00d1cba8 ^ 0xbf7167c7934d83bf;
      uVar7 = (uint3)_DAT_00d1cbb0;
      _DAT_00d1cbb0 = (uint)(uVar7 ^ 0x4d83bf);
    }
    pbVar15 = (basic_string_conflict *)strlen((char *)&DAT_00d1cba8);
    if ((basic_string_conflict *)0xfffffffffffffff7 < pbVar15) {
      if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823178 to 0082317b has its CatchHandler @ 00823b18 */
        FUN_007fe124();
      }
      goto LAB_00823c68;
    }
    if (pbVar15 < (basic_string_conflict *)0x17) {
      pvVar33 = (void *)((ulong)&local_270 | 1);
      local_270 = CONCAT71(local_270._1_7_,(char)((int)pbVar15 << 1));
      if (pbVar15 != (basic_string_conflict *)0x0) goto LAB_00821928;
    }
    else {
      uVar19 = 0x1a;
      if (((ulong)pbVar15 | 7) != 0x17) {
        uVar19 = ((ulong)pbVar15 | 7) + 1;
      }
                    /* try { // try from 00821910 to 00821917 has its CatchHandler @ 00823b18 */
      pvVar33 = operator_new(uVar19);
      local_270 = uVar19 | 1;
      pbStack_268 = pbVar15;
      local_260 = pvVar33;
LAB_00821928:
      memcpy(pvVar33,&DAT_00d1cba8,(size_t)pbVar15);
    }
    *(basic_string_conflict *)((long)pvVar33 + (long)pbVar15) = (basic_string_conflict)0x0;
    pppppppuVar9 = &local_120;
    if (local_120 != (undefined8 *******)0x0) {
      pppppppuVar30 = local_120;
      pppppppuVar1 = &local_120;
      do {
        pppppppuVar32 = pppppppuVar1;
        pbVar15 = (basic_string_conflict *)(pppppppuVar30 + 4);
        uVar19 = cpr::CaseInsensitiveCompare::operator()
                           ((CaseInsensitiveCompare *)&uStack_118,pbVar15,
                            (basic_string_conflict *)&local_270);
        lVar18 = 8;
        pppppppuVar1 = pppppppuVar32;
        if ((uVar19 & 1) == 0) {
          lVar18 = 0;
          pppppppuVar1 = pppppppuVar30;
        }
        pppppppuVar30 = *(undefined8 ********)((long)pppppppuVar30 + lVar18);
      } while (pppppppuVar30 != (undefined8 *******)0x0);
      if ((undefined8 ********)pppppppuVar1 != &local_120) {
        pbVar2 = (basic_string_conflict *)(pppppppuVar32 + 4);
        if ((uVar19 & 1) == 0) {
          pbVar2 = pbVar15;
        }
        uVar19 = cpr::CaseInsensitiveCompare::operator()
                           ((CaseInsensitiveCompare *)&uStack_118,
                            (basic_string_conflict *)&local_270,pbVar2);
        if ((uVar19 & 1) == 0) {
          pppppppuVar9 = pppppppuVar1;
        }
      }
    }
    if ((local_270 & 1) != 0) {
      operator_delete(local_260,local_270 & 0xfffffffffffffffe);
    }
    pcVar14 = DAT_00cca898;
    if ((undefined8 ********)pppppppuVar9 == &local_120) {
      sVar16 = strlen(DAT_00cca898);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082365c to 0082365f has its CatchHandler @ 00823a24 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_380 | 1);
        local_380 = (undefined *)CONCAT71(local_380._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_00821a48;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 00821a30 to 00821a37 has its CatchHandler @ 00823a24 */
        pvVar33 = operator_new(uVar19);
        local_380 = (undefined *)(uVar19 | 1);
        sStack_378 = sVar16;
        local_370 = pvVar33;
LAB_00821a48:
        memmove(pvVar33,pcVar14,sVar16);
      }
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 00821a5c to 00821a6b has its CatchHandler @ 008239a8 */
      puVar20 = (ulong *)std::__ndk1::
                         basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                         ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                   *)&local_380,"/");
      pcVar14 = DAT_00cca888;
      local_260 = (void *)puVar20[2];
      pbStack_268 = (basic_string_conflict *)puVar20[1];
      local_270 = *puVar20;
      puVar20[1] = 0;
      puVar20[2] = 0;
      *puVar20 = 0;
                    /* try { // try from 00821a8c to 00821a93 has its CatchHandler @ 00823998 */
      puVar21 = (undefined8 *)
                std::__ndk1::
                basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_270,pcVar14);
      uVar36 = puVar21[1];
      uVar22 = *puVar21;
      uVar28 = puVar21[2];
      *puVar21 = 0;
      puVar21[1] = 0;
      puVar21[2] = 0;
      if (((DAT_00d1cbd0 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cbd0), iVar13 != 0)) {
        DAT_00d1cbc0 = 0xce48a07ba448ee;
        _DAT_00d1cbc8 = 0x1c14fd5;
        __cxa_atexit(&LAB_00826028,&DAT_00d1cbc0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1cbd0);
      }
      if (DAT_00d1cbcb == '\x01') {
        DAT_00d1cbc0 = DAT_00d1cbc0 ^ 0x65a9098d09c13bbb;
        uVar7 = (uint3)_DAT_00d1cbc8;
        _DAT_00d1cbc8 = (uint)(uVar7 ^ 0xc13bbb);
      }
      sVar16 = strlen((char *)&DAT_00d1cbc0);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008236c4 to 008236c7 has its CatchHandler @ 008239c8 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_148 | 1);
        local_148 = (undefined **)CONCAT71(local_148._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_00821b70;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 00821b58 to 00821b5f has its CatchHandler @ 008239c8 */
        pvVar33 = operator_new(uVar19);
        local_148 = (undefined **)(uVar19 | 1);
        sStack_140 = sVar16;
        local_138 = pvVar33;
LAB_00821b70:
        memcpy(pvVar33,&DAT_00d1cbc0,sVar16);
      }
      local_a0 = (undefined **)&local_148;
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 00821b90 to 00821bab has its CatchHandler @ 00823978 */
      lVar18 = FUN_00825c7c(&local_128,&local_148,&DAT_002dd6a5,&local_a0,&local_c0);
      if ((*(byte *)(lVar18 + 0x38) & 1) != 0) {
        operator_delete(*(void **)(lVar18 + 0x48),*(ulong *)(lVar18 + 0x38) & 0xfffffffffffffffe);
      }
      *(undefined8 *)(lVar18 + 0x48) = uVar28;
      *(undefined8 *)(lVar18 + 0x40) = uVar36;
      *(undefined8 *)(lVar18 + 0x38) = uVar22;
      if (((ulong)local_148 & 1) != 0) {
        operator_delete(local_138,(ulong)local_148 & 0xfffffffffffffffe);
      }
      if ((local_270 & 1) != 0) {
        operator_delete(local_260,local_270 & 0xfffffffffffffffe);
      }
      if (((ulong)local_380 & 1) != 0) {
        operator_delete(local_370,(ulong)local_380 & 0xfffffffffffffffe);
      }
    }
                    /* try { // try from 00821bfc to 00821c07 has its CatchHandler @ 00823b08 */
    FUN_008250b8(&local_270,param_1);
    pbVar15 = (basic_string_conflict *)(local_270 >> 1 & 0x7f);
    if ((local_270 & 1) != 0) {
      pbVar15 = pbStack_268;
    }
    if (pbVar15 != (basic_string_conflict *)0x0) {
      if (((DAT_00d1cc10 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cc10), iVar13 != 0)) {
        _DAT_00d1cc08 = 0x10d2772e878b2d2;
        DAT_00d1cc00 = 0x14203b54a97fb0e1;
        __cxa_atexit(&LAB_0082604c,&DAT_00d1cc00,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1cc10);
      }
      if (DAT_00d1cc0f == '\x01') {
        uVar7 = CONCAT12((char)(_DAT_00d1cc08 >> 8),(short)_DAT_00d1cc08) & 0xff00ff;
        uVar19 = _DAT_00d1cc08 >> 0x10;
        uVar27 = _DAT_00d1cc08 >> 0x18;
        uVar24 = _DAT_00d1cc08 >> 0x30;
        _DAT_00d1cc08 = (uint5)(DAT_00d1cc0c ^ 0x3b) << 0x20;
        DAT_00d1cc00 = DAT_00d1cc00 ^ 0x530d433bc51ddfb3;
        _DAT_00d1cc08 =
             (ulong)CONCAT34((int3)(CONCAT16((char)uVar24,CONCAT15(DAT_00d1cc0d,_DAT_00d1cc08)) >>
                                   0x20),
                             CONCAT13((char)uVar27,
                                      CONCAT12((char)uVar19,
                                               CONCAT11((char)(uVar7 >> 0x10),(char)uVar7)))) ^
             0xd4300c51ddfb3;
      }
      sVar16 = strlen((char *)&DAT_00d1cc00);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082344c to 0082344f has its CatchHandler @ 00823ad4 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_380 | 1);
        local_380 = (undefined *)CONCAT71(local_380._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_00821d0c;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 00821cf4 to 00821cfb has its CatchHandler @ 00823ad4 */
        pvVar33 = operator_new(uVar19);
        local_380 = (undefined *)(uVar19 | 1);
        sStack_378 = sVar16;
        local_370 = pvVar33;
LAB_00821d0c:
        memcpy(pvVar33,&DAT_00d1cc00,sVar16);
      }
      local_148 = (undefined **)&local_380;
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 00821d2c to 00821dd7 has its CatchHandler @ 00823a8c */
      ppuVar23 = (undefined **)&DAT_002dd6a5;
      lVar18 = FUN_00825c7c(&local_128,&local_380,&DAT_002dd6a5,&local_148,&local_a0);
      puVar20 = (ulong *)(lVar18 + 0x38);
      if (puVar20 != &local_270) {
        if ((*(byte *)puVar20 & 1) == 0) {
          if ((local_270 & 1) == 0) {
            *(basic_string_conflict **)(lVar18 + 0x40) = pbStack_268;
            *puVar20 = local_270;
            *(void **)(lVar18 + 0x48) = local_260;
          }
          else {
            ppuVar23 = (undefined **)pbStack_268;
            FUN_007fdf5c(puVar20,local_260);
          }
        }
        else {
          if ((local_270 & 1) == 0) {
            ppuVar23 = (undefined **)(local_270 >> 1 & 0x7f);
            pvVar33 = (void *)((long)&local_270 + 1);
          }
          else {
            ppuVar23 = (undefined **)pbStack_268;
            pvVar33 = local_260;
          }
          FUN_007fe004(puVar20,pvVar33);
        }
      }
      if (((ulong)local_380 & 1) != 0) {
        operator_delete(local_370,(ulong)local_380 & 0xfffffffffffffffe);
      }
      if (((DAT_00d1cc28 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cc28), iVar13 != 0)) {
        ppuVar23 = &PTR_LOOP_00c48880;
        DAT_00d1cc24 = '\x01';
        DAT_00d1cc18 = 0x2d381cf042aedb00;
        DAT_00d1cc20 = 0x23cbc359;
        __cxa_atexit(&LAB_00826058,&DAT_00d1cc18);
        __cxa_guard_release(&DAT_00d1cc28);
      }
      if (DAT_00d1cc24 == '\x01') {
        DAT_00d1cc24 = '\0';
        uVar7 = CONCAT12((char)(DAT_00d1cc20 >> 8),(short)DAT_00d1cc20) & 0xff00ff;
        DAT_00d1cc20 = CONCAT13((char)(DAT_00d1cc20 >> 0x18),
                                CONCAT12((char)(DAT_00d1cc20 >> 0x10),
                                         CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0x23e9f97b;
        DAT_00d1cc18 = DAT_00d1cc18 ^ 0x4971799d23e9f97b;
      }
                    /* try { // try from 00821e4c to 00821e5f has its CatchHandler @ 00823a50 */
      std::__ndk1::operator+
                ((__ndk1 *)&DAT_00d1cc18,(char *)&local_270,(basic_string_conflict *)ppuVar23);
      if (((DAT_00d1cc38 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cc38), iVar13 != 0)) {
        _DAT_00d1cc30 = 0x1e98459;
        __cxa_atexit(&LAB_00826064,&DAT_00d1cc30,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1cc38);
      }
      if (DAT_00d1cc33 == '\x01') {
        uVar7 = (uint3)_DAT_00d1cc30;
        _DAT_00d1cc30 = (uint)(uVar7 ^ 0xe9f97b);
      }
                    /* try { // try from 00821eb8 to 00821ec7 has its CatchHandler @ 00823a4c */
      puVar21 = (undefined8 *)
                std::__ndk1::
                basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_380,&DAT_00d1cc30);
      uVar36 = puVar21[1];
      uVar22 = *puVar21;
      uVar28 = puVar21[2];
      *puVar21 = 0;
      puVar21[1] = 0;
      puVar21[2] = 0;
      sStack_98 = 0x5c17f24a9a8a1e;
      local_a0 = (undefined **)0x1a5c01f24f8b9629;
      local_90 = (void *)CONCAT62(local_90._2_6_,0xf91f);
      if (((DAT_00d1cc58 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cc58), iVar13 != 0)) {
                    /* try { // try from 008234fc to 0082350b has its CatchHandler @ 008238cc */
        FUN_00826070(&DAT_00d1cc40,&local_a0);
        __cxa_atexit(&LAB_0082610c,&DAT_00d1cc40,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1cc58);
      }
      FUN_00826118(&DAT_00d1cc40);
      sVar16 = strlen(&DAT_00d1cc40);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082354c to 0082354f has its CatchHandler @ 00823ab4 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_148 | 1);
        local_148 = (undefined **)CONCAT71(local_148._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_00821f70;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 00821f58 to 00821f5f has its CatchHandler @ 00823ab4 */
        pvVar33 = operator_new(uVar19);
        local_148 = (undefined **)(uVar19 | 1);
        sStack_140 = sVar16;
        local_138 = pvVar33;
LAB_00821f70:
        memcpy(pvVar33,&DAT_00d1cc40,sVar16);
      }
      local_a0 = (undefined **)&local_148;
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 00821f90 to 00821fab has its CatchHandler @ 00823a2c */
      lVar18 = FUN_00825c7c(&local_128,&local_148,&DAT_002dd6a5,&local_a0,&local_c0);
      if ((*(byte *)(lVar18 + 0x38) & 1) != 0) {
        operator_delete(*(void **)(lVar18 + 0x48),*(ulong *)(lVar18 + 0x38) & 0xfffffffffffffffe);
      }
      *(undefined8 *)(lVar18 + 0x48) = uVar28;
      *(undefined8 *)(lVar18 + 0x40) = uVar36;
      *(undefined8 *)(lVar18 + 0x38) = uVar22;
      if (((ulong)local_148 & 1) != 0) {
        operator_delete(local_138,(ulong)local_148 & 0xfffffffffffffffe);
      }
      if (((ulong)local_380 & 1) != 0) {
        operator_delete(local_370,(ulong)local_380 & 0xfffffffffffffffe);
      }
    }
                    /* try { // try from 00822004 to 0082200f has its CatchHandler @ 00823b00 */
    FUN_008253f8(&local_380,param_1);
    pcVar14 = DAT_00cca8a8;
    sVar16 = (ulong)local_380 >> 1 & 0x7f;
    if (((ulong)local_380 & 1) != 0) {
      sVar16 = sStack_378;
    }
    if (sVar16 != 0) {
      sVar16 = strlen(DAT_00cca8a8);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823564 to 00823567 has its CatchHandler @ 00823ab0 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_148 | 1);
        local_148 = (undefined **)CONCAT71(local_148._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_0082208c;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 00822074 to 0082207b has its CatchHandler @ 00823ab0 */
        pvVar33 = operator_new(uVar19);
        local_148 = (undefined **)(uVar19 | 1);
        sStack_140 = sVar16;
        local_138 = pvVar33;
LAB_0082208c:
        memmove(pvVar33,pcVar14,sVar16);
      }
      local_a0 = (undefined **)&local_148;
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 008220a8 to 0082211f has its CatchHandler @ 00823a7c */
      lVar18 = FUN_00825c7c(&local_128,&local_148,&DAT_002dd6a5,&local_a0,&local_c0);
      puVar20 = (ulong *)(lVar18 + 0x38);
      if (puVar20 != &local_380) {
        if ((*(byte *)puVar20 & 1) == 0) {
          if (((ulong)local_380 & 1) == 0) {
            *(size_t *)(lVar18 + 0x40) = sStack_378;
            *puVar20 = (ulong)local_380;
            *(void **)(lVar18 + 0x48) = local_370;
          }
          else {
            FUN_007fdf5c(puVar20,local_370,sStack_378);
          }
        }
        else {
          if (((ulong)local_380 & 1) == 0) {
            sVar16 = (ulong)local_380 >> 1 & 0x7f;
            pvVar33 = (void *)((long)&local_380 + 1);
          }
          else {
            sVar16 = sStack_378;
            pvVar33 = local_370;
          }
          FUN_007fe004(puVar20,pvVar33,sVar16);
        }
      }
      if (((ulong)local_148 & 1) != 0) {
        operator_delete(local_138,(ulong)local_148 & 0xfffffffffffffffe);
      }
    }
                    /* try { // try from 00822138 to 00822143 has its CatchHandler @ 00823af0 */
    FUN_00825648(&local_148,param_1);
    pcVar14 = DAT_00cca8b8;
    sVar16 = (ulong)((byte)local_148 >> 1);
    if (((ulong)local_148 & 1) != 0) {
      sVar16 = sStack_140;
    }
    if (sVar16 != 0) {
      sVar16 = strlen(DAT_00cca8b8);
      if (0xfffffffffffffff7 < sVar16) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082357c to 0082357f has its CatchHandler @ 00823a90 */
          FUN_007fe124();
        }
        goto LAB_00823c68;
      }
      if (sVar16 < 0x17) {
        pvVar33 = (void *)((ulong)&local_a0 | 1);
        local_a0 = (undefined **)CONCAT71(local_a0._1_7_,(char)((int)sVar16 << 1));
        if (sVar16 != 0) goto LAB_008221c4;
      }
      else {
        uVar19 = 0x1a;
        if ((sVar16 | 7) != 0x17) {
          uVar19 = (sVar16 | 7) + 1;
        }
                    /* try { // try from 008221ac to 008221b3 has its CatchHandler @ 00823a90 */
        pvVar33 = operator_new(uVar19);
        local_a0 = (undefined **)(uVar19 | 1);
        sStack_98 = sVar16;
        local_90 = pvVar33;
LAB_008221c4:
        memmove(pvVar33,pcVar14,sVar16);
      }
      local_c0 = &local_a0;
      *(undefined1 *)((long)pvVar33 + sVar16) = 0;
                    /* try { // try from 008221e0 to 00822257 has its CatchHandler @ 00823a5c */
      lVar18 = FUN_00825c7c(&local_128,&local_a0,&DAT_002dd6a5,&local_c0,&uStack_c1);
      pbVar31 = (byte *)(lVar18 + 0x38);
      if (pbVar31 != (byte *)&local_148) {
        if ((*pbVar31 & 1) == 0) {
          if (((ulong)local_148 & 1) == 0) {
            *(size_t *)(lVar18 + 0x40) = sStack_140;
            *(undefined ***)pbVar31 = local_148;
            *(void **)(lVar18 + 0x48) = local_138;
          }
          else {
            FUN_007fdf5c(pbVar31,local_138,sStack_140);
          }
        }
        else {
          if (((ulong)local_148 & 1) == 0) {
            sVar16 = (ulong)local_148 >> 1 & 0x7f;
            pvVar33 = (void *)((long)&local_148 + 1);
          }
          else {
            sVar16 = sStack_140;
            pvVar33 = local_138;
          }
          FUN_007fe004(pbVar31,pvVar33,sVar16);
        }
      }
      if (((ulong)local_a0 & 1) != 0) {
        operator_delete(local_90,(ulong)local_a0 & 0xfffffffffffffffe);
      }
    }
    if (((byte)local_148 & 1) != 0) {
      operator_delete(local_138,(ulong)local_148 & 0xfffffffffffffffe);
    }
    if (((ulong)local_380 & 1) == 0) {
      if ((local_270 & 1) != 0) goto LAB_008222d0;
LAB_0082229c:
      if ((local_e0 & 1) != 0) goto LAB_008222e8;
LAB_008222a4:
      local_160 = CONCAT71(uStack_df,local_e0);
      pvStack_158 = pvStack_d8;
      local_150 = local_d0;
    }
    else {
      operator_delete(local_370,(ulong)local_380 & 0xfffffffffffffffe);
      if ((local_270 & 1) == 0) goto LAB_0082229c;
LAB_008222d0:
      operator_delete(local_260,local_270 & 0xfffffffffffffffe);
      if ((local_e0 & 1) == 0) goto LAB_008222a4;
LAB_008222e8:
                    /* try { // try from 008222ec to 008222f3 has its CatchHandler @ 008239c0 */
      FUN_007ff40c(&local_160,local_d0,pvStack_d8);
    }
    local_130 = local_150;
    local_138 = pvStack_158;
    sStack_140 = local_160;
    local_200 = 1;
    local_148 = &PTR_LAB_00c48988;
    local_230 = 0;
    ppuStack_228 = &PTR_LAB_00c48988;
    bVar11 = (local_f8 & 1) != 0;
    pvStack_158 = (void *)0x0;
    local_150 = (void *)0x0;
    uStack_1f0 = 0;
    local_1f8 = 0;
    uVar19 = (ulong)(local_f8 >> 1);
    if (bVar11) {
      uVar19 = uStack_f0;
    }
    uStack_1e0 = 0;
    local_1e8 = 0;
    uStack_1d0 = 0;
    local_1d8 = 0;
    uStack_1c0 = 0;
    local_1c8 = 0;
    uStack_1b0 = 0;
    local_1b8 = 0;
    uStack_1a0 = 0;
    local_1a8 = 0;
    uStack_190 = 0;
    local_198 = 0;
    uStack_180 = 0;
    local_188 = 0;
    uStack_170 = 0;
    local_178 = 0;
    pbVar31 = pbStack_e8;
    if (!bVar11) {
      pbVar31 = (byte *)&uStack_f7;
    }
    local_160 = 0;
    pbStack_268 = (basic_string_conflict *)0x0;
    local_270 = 0;
    local_258 = 0;
    local_260 = (void *)0x0;
    lStack_248 = 0;
    local_250 = 0;
    local_238 = 0;
    local_220 = 0;
    uStack_218 = 0;
    local_210 = 0;
    uStack_208 = 0;
    local_168 = 0;
    if (uVar19 != 0) {
      pbVar26 = pbVar31;
      if (3 < uVar19) {
        if (uVar19 < 0x20) {
          uVar24 = 0;
        }
        else {
          uVar24 = uVar19 & 0xffffffffffffffe0;
          pauVar25 = (undefined1 (*) [16])(pbVar31 + 0x10);
          uVar27 = uVar24;
          do {
            auVar38 = pauVar25[-1];
            auVar39 = *pauVar25;
            uVar27 = uVar27 - 0x20;
            auVar40._8_4_ = 0xffffff0e;
            auVar40._0_8_ = 0xffffff0dffffff0c;
            auVar40._12_4_ = 0xffffff0f;
            auVar40 = a64_TBL(ZEXT816(0),auVar38,auVar40);
            auVar42._8_2_ = 0xff0a;
            auVar42._0_8_ = 0xffffff09ffffff08;
            auVar42._10_2_ = 0xffff;
            auVar42._12_2_ = 0xff0b;
            auVar42._14_2_ = 0xffff;
            auVar42 = a64_TBL(ZEXT816(0),auVar38,auVar42);
            auVar44._8_8_ = 0xffffff07ffffff06;
            auVar44._0_8_ = 0xffffff05ffffff04;
            auVar44 = a64_TBL(ZEXT816(0),auVar38,auVar44);
            auVar46._8_8_ = 0xffffff03ffffff02;
            auVar46._0_8_ = 0xffffff01ffffff00;
            auVar46 = a64_TBL(ZEXT816(0),auVar38,auVar46);
            auVar48._8_4_ = 0xffffff0e;
            auVar48._0_8_ = 0xffffff0dffffff0c;
            auVar48._12_4_ = 0xffffff0f;
            auVar48 = a64_TBL(ZEXT816(0),auVar39,auVar48);
            auVar49._8_2_ = 0xff0a;
            auVar49._0_8_ = 0xffffff09ffffff08;
            auVar49._10_2_ = 0xffff;
            auVar49._12_2_ = 0xff0b;
            auVar49._14_2_ = 0xffff;
            auVar49 = a64_TBL(ZEXT816(0),auVar39,auVar49);
            auVar50._8_8_ = 0xffffff07ffffff06;
            auVar50._0_8_ = 0xffffff05ffffff04;
            auVar50 = a64_TBL(ZEXT816(0),auVar39,auVar50);
            auVar51._8_8_ = 0xffffff03ffffff02;
            auVar51._0_8_ = 0xffffff01ffffff00;
            auVar51 = a64_TBL(ZEXT816(0),auVar39,auVar51);
            auVar41[1] = -(auVar46._4_4_ - 0x7bU < 0xffffffe6);
            auVar41[0] = -(auVar46._0_4_ - 0x7bU < 0xffffffe6);
            auVar41[2] = -(auVar46._8_4_ - 0x7bU < 0xffffffe6);
            auVar41[3] = -(auVar46._12_4_ - 0x7bU < 0xffffffe6);
            auVar41[4] = -(auVar44._0_4_ - 0x7bU < 0xffffffe6);
            auVar41[5] = -(auVar44._4_4_ - 0x7bU < 0xffffffe6);
            auVar41[6] = -(auVar44._8_4_ - 0x7bU < 0xffffffe6);
            auVar41[7] = -(auVar44._12_4_ - 0x7bU < 0xffffffe6);
            auVar41[8] = -(auVar42._0_4_ - 0x7bU < 0xffffffe6);
            auVar41[9] = -(auVar42._4_4_ - 0x7bU < 0xffffffe6);
            auVar41[10] = -(auVar42._8_4_ - 0x7bU < 0xffffffe6);
            auVar41[0xb] = -(auVar42._12_4_ - 0x7bU < 0xffffffe6);
            auVar41[0xc] = -(auVar40._0_4_ - 0x7bU < 0xffffffe6);
            auVar41[0xd] = -(auVar40._4_4_ - 0x7bU < 0xffffffe6);
            auVar41[0xe] = -(auVar40._8_4_ - 0x7bU < 0xffffffe6);
            auVar41[0xf] = -(auVar40._12_4_ - 0x7bU < 0xffffffe6);
            auVar43._0_8_ = auVar38._0_8_ ^ 0x2020202020202020;
            auVar43[8] = auVar38[8] ^ 0x20;
            auVar43[9] = auVar38[9] ^ 0x20;
            auVar43[10] = auVar38[10] ^ 0x20;
            auVar43[0xb] = auVar38[0xb] ^ 0x20;
            auVar43[0xc] = auVar38[0xc] ^ 0x20;
            auVar43[0xd] = auVar38[0xd] ^ 0x20;
            auVar43[0xe] = auVar38[0xe] ^ 0x20;
            auVar43[0xf] = auVar38[0xf] ^ 0x20;
            auVar45[1] = -(auVar51._4_4_ - 0x7bU < 0xffffffe6);
            auVar45[0] = -(auVar51._0_4_ - 0x7bU < 0xffffffe6);
            auVar45[2] = -(auVar51._8_4_ - 0x7bU < 0xffffffe6);
            auVar45[3] = -(auVar51._12_4_ - 0x7bU < 0xffffffe6);
            auVar45[4] = -(auVar50._0_4_ - 0x7bU < 0xffffffe6);
            auVar45[5] = -(auVar50._4_4_ - 0x7bU < 0xffffffe6);
            auVar45[6] = -(auVar50._8_4_ - 0x7bU < 0xffffffe6);
            auVar45[7] = -(auVar50._12_4_ - 0x7bU < 0xffffffe6);
            auVar45[8] = -(auVar49._0_4_ - 0x7bU < 0xffffffe6);
            auVar45[9] = -(auVar49._4_4_ - 0x7bU < 0xffffffe6);
            auVar45[10] = -(auVar49._8_4_ - 0x7bU < 0xffffffe6);
            auVar45[0xb] = -(auVar49._12_4_ - 0x7bU < 0xffffffe6);
            auVar45[0xc] = -(auVar48._0_4_ - 0x7bU < 0xffffffe6);
            auVar45[0xd] = -(auVar48._4_4_ - 0x7bU < 0xffffffe6);
            auVar45[0xe] = -(auVar48._8_4_ - 0x7bU < 0xffffffe6);
            auVar45[0xf] = -(auVar48._12_4_ - 0x7bU < 0xffffffe6);
            auVar47._0_8_ = auVar39._0_8_ ^ 0x2020202020202020;
            auVar47[8] = auVar39[8] ^ 0x20;
            auVar47[9] = auVar39[9] ^ 0x20;
            auVar47[10] = auVar39[10] ^ 0x20;
            auVar47[0xb] = auVar39[0xb] ^ 0x20;
            auVar47[0xc] = auVar39[0xc] ^ 0x20;
            auVar47[0xd] = auVar39[0xd] ^ 0x20;
            auVar47[0xe] = auVar39[0xe] ^ 0x20;
            auVar47[0xf] = auVar39[0xf] ^ 0x20;
            auVar38 = auVar38 ^ (auVar38 ^ auVar43) & ~auVar41;
            auVar39 = auVar39 ^ (auVar39 ^ auVar47) & ~auVar45;
            *(long *)(pauVar25[-1] + 8) = auVar38._8_8_;
            *(long *)pauVar25[-1] = auVar38._0_8_;
            *(long *)(*pauVar25 + 8) = auVar39._8_8_;
            *(long *)*pauVar25 = auVar39._0_8_;
            pauVar25 = pauVar25 + 2;
          } while (uVar27 != 0);
          if (uVar19 == uVar24) goto LAB_0082250c;
          if ((uVar19 & 0x1c) == 0) {
            pbVar26 = pbVar31 + uVar24;
            goto LAB_008224e8;
          }
        }
        uVar27 = uVar19 & 0xfffffffffffffffc;
        pbVar26 = pbVar31 + uVar27;
        pbVar12 = pbVar31 + uVar24;
        lVar18 = uVar24 - uVar27;
        do {
          uVar37 = *(undefined4 *)pbVar12;
          lVar18 = lVar18 + 4;
          uVar7 = CONCAT12((char)((uint)uVar37 >> 8),(short)uVar37) & 0xff00ff;
          bVar34 = (byte)((uint)uVar37 >> 0x10);
          bVar35 = (byte)((uint)uVar37 >> 0x18);
          uVar8 = CONCAT16(bVar35,(uint6)CONCAT14(bVar34,(uint)uVar7));
          bVar5 = (byte)(uVar7 >> 0x10);
          uVar24 = (ulong)uVar8 ^
                   (ulong)(uVar8 ^ CONCAT16(bVar35,(uint6)(CONCAT14(bVar34,(uint)(uint3)(CONCAT12(
                                                  bVar5,(ushort)(byte)((byte)uVar7 ^ 0x20)) ^
                                                  0x200000)) ^ 0x2000000000)) ^ 0x20000000000000) &
                   ~CONCAT26(-(ushort)(bVar35 - 0x7b < 0xffffffe6),
                             CONCAT24(-(ushort)(bVar34 - 0x7b < 0xffffffe6),
                                      CONCAT22(-(ushort)(bVar5 - 0x7b < 0xffffffe6),
                                               -(ushort)((uVar7 & 0xffff) - 0x7b < 0xffffffe6))));
          *(uint *)pbVar12 =
               CONCAT13((char)(uVar24 >> 0x30),
                        CONCAT12((char)(uVar24 >> 0x20),
                                 CONCAT11((char)(uVar24 >> 0x10),(char)uVar24)));
          pbVar12 = pbVar12 + 4;
        } while (lVar18 != 0);
        if (uVar19 == uVar27) goto LAB_0082250c;
      }
LAB_008224e8:
      do {
        bVar5 = *pbVar26;
        if (0xffffffe5 < bVar5 - 0x7b) {
          bVar5 = bVar5 ^ 0x20;
        }
        pbVar12 = pbVar26 + 1;
        *pbVar26 = bVar5;
        pbVar26 = pbVar12;
      } while (pbVar12 != pbVar31 + uVar19);
    }
LAB_0082250c:
    local_240 = &local_238;
    if (((DAT_00d1ccf0 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ccf0), iVar13 != 0)) {
      DAT_00d1ccec = '\x01';
      DAT_00d1cce8 = 0xdd4bfe2e;
      __cxa_atexit(&LAB_00826300,&DAT_00d1cce8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1ccf0);
    }
    if (DAT_00d1ccec == '\x01') {
      DAT_00d1ccec = '\0';
      uVar7 = CONCAT12((char)(DAT_00d1cce8 >> 8),(short)DAT_00d1cce8) & 0xff00ff;
      DAT_00d1cce8 = CONCAT13((char)(DAT_00d1cce8 >> 0x18),
                              CONCAT12((char)(DAT_00d1cce8 >> 0x10),
                                       CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0xdd1fbb69;
    }
    pbVar31 = (byte *)((ulong)&local_f8 | 1);
    sVar16 = strlen((char *)&DAT_00d1cce8);
    uVar19 = (ulong)(local_f8 >> 1);
    if ((local_f8 & 1) != 0) {
      uVar19 = uStack_f0;
    }
    if (sVar16 == uVar19) {
      if (sVar16 == 0xffffffffffffffff) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008235d8 to 008235db has its CatchHandler @ 008239bc */
          FUN_00814f80();
        }
        goto LAB_00823c68;
      }
      pbVar26 = pbVar31;
      if ((local_f8 & 1) != 0) {
        pbVar26 = pbStack_e8;
      }
      iVar13 = memcmp(pbVar26,&DAT_00d1cce8,sVar16);
      if (iVar13 != 0) goto LAB_008225a8;
      if (((DAT_00d1ce48 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce48), iVar13 != 0)) {
                    /* try { // try from 008237ac to 008237af has its CatchHandler @ 008238b8 */
        FUN_00826858();
        __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1ce48);
      }
                    /* try { // try from 008228b4 to 008228cb has its CatchHandler @ 00823960 */
      FUN_00824410(&local_380,&local_148,&local_128,&DAT_00d1ccf8);
LAB_008228cc:
      FUN_00824558(&local_270,&local_380);
      FUN_008247c0(&local_380);
    }
    else {
LAB_008225a8:
      if (((DAT_00d1ce58 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce58), iVar13 != 0)) {
        _DAT_00d1ce54 = 0x16f;
        DAT_00d1ce50 = 0x596e7c6d;
        __cxa_atexit(&LAB_00827278,&DAT_00d1ce50,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1ce58);
      }
      if (DAT_00d1ce55 == '\x01') {
        uVar7 = CONCAT12((char)(DAT_00d1ce50 >> 8),(short)DAT_00d1ce50) & 0xff00ff;
        _DAT_00d1ce54 = (ushort)(DAT_00d1ce54 ^ 0x6f);
        DAT_00d1ce50 = CONCAT13((char)(DAT_00d1ce50 >> 0x18),
                                CONCAT12((char)(DAT_00d1ce50 >> 0x10),
                                         CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0xd3d333d;
      }
      sVar16 = strlen((char *)&DAT_00d1ce50);
      uVar19 = (ulong)(local_f8 >> 1);
      if ((local_f8 & 1) != 0) {
        uVar19 = uStack_f0;
      }
      if (sVar16 != uVar19) {
LAB_00822650:
        if (((DAT_00d1ce68 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce68), iVar13 != 0))
        {
          DAT_00d1ce64 = '\x01';
          DAT_00d1ce60 = 0x19f74a0d;
          __cxa_atexit(&LAB_008274a0,&DAT_00d1ce60,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1ce68);
        }
        if (DAT_00d1ce64 == '\x01') {
          DAT_00d1ce64 = '\0';
          uVar7 = CONCAT12((char)(DAT_00d1ce60 >> 8),(short)DAT_00d1ce60) & 0xff00ff;
          DAT_00d1ce60 = CONCAT13((char)(DAT_00d1ce60 >> 0x18),
                                  CONCAT12((char)(DAT_00d1ce60 >> 0x10),
                                           CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^
                         0x19a31f5d;
        }
        sVar16 = strlen((char *)&DAT_00d1ce60);
        uVar19 = (ulong)(local_f8 >> 1);
        if ((local_f8 & 1) != 0) {
          uVar19 = uStack_f0;
        }
        if (sVar16 == uVar19) {
          if (sVar16 == 0xffffffffffffffff) {
            if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823768 to 0082376b has its CatchHandler @ 0082396c */
              FUN_00814f80();
            }
            goto LAB_00823c68;
          }
          pbVar26 = pbVar31;
          if ((local_f8 & 1) != 0) {
            pbVar26 = pbStack_e8;
          }
          iVar13 = memcmp(pbVar26,&DAT_00d1ce60,sVar16);
          if (iVar13 == 0) {
            if ((local_110 & 1) == 0) {
              local_c0 = (undefined ***)CONCAT71(uStack_10f,local_110);
              uStack_b8 = uStack_108;
              local_b0 = local_100;
            }
            else {
                    /* try { // try from 008229b0 to 008229b7 has its CatchHandler @ 008238e8 */
              FUN_007ff40c(&local_c0,local_100,uStack_108);
            }
                    /* try { // try from 008229b8 to 008229c7 has its CatchHandler @ 00823908 */
            FUN_00827284(&local_a0,&local_c0,1);
            local_a0 = &PTR_LAB_00c489f0;
            if (((DAT_00d1ce48 & 1) == 0) &&
               (iVar13 = __cxa_guard_acquire(&DAT_00d1ce48), iVar13 != 0)) {
                    /* try { // try from 0082382c to 0082382f has its CatchHandler @ 008238a0 */
              FUN_00826858();
              __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00d1ce48);
            }
                    /* try { // try from 008229e4 to 008229ff has its CatchHandler @ 00823904 */
            FUN_00824a34(&local_380,&local_148,&local_a0,&local_128,&DAT_00d1ccf8);
            goto LAB_00822aa4;
          }
        }
        if (((DAT_00d1ce78 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce78), iVar13 != 0))
        {
          _DAT_00d1ce70 = 0x1f1361bfc0f4e5d;
          __cxa_atexit(&LAB_008274a8,&DAT_00d1ce70,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1ce78);
        }
        if (DAT_00d1ce77 == '\x01') {
          uVar7 = CONCAT12((char)(_DAT_00d1ce70 >> 8),(short)_DAT_00d1ce70) & 0xff00ff;
          uVar19 = _DAT_00d1ce70 >> 0x10;
          uVar27 = _DAT_00d1ce70 >> 0x18;
          uVar24 = _DAT_00d1ce70 >> 0x30;
          _DAT_00d1ce70 = (uint5)(DAT_00d1ce74 ^ 0x4f) << 0x20;
          _DAT_00d1ce70 =
               (ulong)CONCAT34((int3)(CONCAT16((char)uVar24,CONCAT15(DAT_00d1ce75,_DAT_00d1ce70)) >>
                                     0x20),
                               CONCAT13((char)uVar27,
                                        CONCAT12((char)uVar19,
                                                 CONCAT11((char)(uVar7 >> 0x10),(char)uVar7)))) ^
               0xf17300b9430b19;
        }
        sVar16 = strlen((char *)&DAT_00d1ce70);
        uVar19 = (ulong)(local_f8 >> 1);
        if ((local_f8 & 1) != 0) {
          uVar19 = uStack_f0;
        }
        if (sVar16 == uVar19) {
          if (sVar16 == 0xffffffffffffffff) {
            if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823780 to 00823783 has its CatchHandler @ 00823968 */
              FUN_00814f80();
            }
            goto LAB_00823c68;
          }
          pbVar26 = pbVar31;
          if ((local_f8 & 1) != 0) {
            pbVar26 = pbStack_e8;
          }
          iVar13 = memcmp(pbVar26,&DAT_00d1ce70,sVar16);
          if (iVar13 == 0) {
            if ((local_110 & 1) == 0) {
              local_c0 = (undefined ***)CONCAT71(uStack_10f,local_110);
              uStack_b8 = uStack_108;
              local_b0 = local_100;
            }
            else {
                    /* try { // try from 00822a08 to 00822a0f has its CatchHandler @ 008238e4 */
              FUN_007ff40c(&local_c0,local_100,uStack_108);
            }
                    /* try { // try from 00822a10 to 00822a1f has its CatchHandler @ 008238fc */
            FUN_00827284(&local_a0,&local_c0,1);
            local_a0 = &PTR_LAB_00c489f0;
            if (((DAT_00d1ce48 & 1) == 0) &&
               (iVar13 = __cxa_guard_acquire(&DAT_00d1ce48), iVar13 != 0)) {
                    /* try { // try from 0082386c to 0082386f has its CatchHandler @ 0082389c */
              FUN_00826858();
              __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00d1ce48);
            }
                    /* try { // try from 00822a3c to 00822a57 has its CatchHandler @ 008238f8 */
            FUN_00824b10(&local_380,&local_148,&local_a0,&local_128,&DAT_00d1ccf8);
            goto LAB_00822aa4;
          }
        }
        if (((DAT_00d1ce88 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce88), iVar13 != 0))
        {
          DAT_00d1ce86 = '\x01';
          DAT_00d1ce80 = 0x7a615423;
          _DAT_00d1ce84 = 0x6f7d;
          __cxa_atexit(&LAB_008274b4,&DAT_00d1ce80,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1ce88);
        }
        if (DAT_00d1ce86 == '\x01') {
          uVar7 = CONCAT12((char)(DAT_00d1ce80 >> 8),(short)DAT_00d1ce80) & 0xff00ff;
          DAT_00d1ce86 = '\0';
          _DAT_00d1ce84 = _DAT_00d1ce84 ^ 0x6f35;
          DAT_00d1ce80 = CONCAT13((char)(DAT_00d1ce80 >> 0x18),
                                  CONCAT12((char)(DAT_00d1ce80 >> 0x10),
                                           CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^
                         0x39351573;
        }
        sVar16 = strlen((char *)&DAT_00d1ce80);
        uVar19 = (ulong)(local_f8 >> 1);
        if ((local_f8 & 1) != 0) {
          uVar19 = uStack_f0;
        }
        if (sVar16 == uVar19) {
          if (sVar16 == 0xffffffffffffffff) {
            if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823798 to 0082379b has its CatchHandler @ 00823964 */
              FUN_00814f80();
            }
            goto LAB_00823c68;
          }
          if ((local_f8 & 1) != 0) {
            pbVar31 = pbStack_e8;
          }
          iVar13 = memcmp(pbVar31,&DAT_00d1ce80,sVar16);
          if (iVar13 == 0) {
            if ((local_110 & 1) == 0) {
              local_c0 = (undefined ***)CONCAT71(uStack_10f,local_110);
              uStack_b8 = uStack_108;
              local_b0 = local_100;
            }
            else {
                    /* try { // try from 00822a60 to 00822a67 has its CatchHandler @ 008238e0 */
              FUN_007ff40c(&local_c0,local_100,uStack_108);
            }
                    /* try { // try from 00822a68 to 00822a77 has its CatchHandler @ 008238f0 */
            FUN_00827284(&local_a0,&local_c0,1);
            local_a0 = &PTR_LAB_00c489f0;
                    /* try { // try from 00822a84 to 00822aa3 has its CatchHandler @ 0082391c */
            FUN_008244d4();
            FUN_00824bec(&local_380,&local_148,&local_a0,&local_128,&DAT_00d1ccf8);
            goto LAB_00822aa4;
          }
        }
        FUN_00824cc8();
                    /* try { // try from 00822868 to 00822877 has its CatchHandler @ 00823974 */
        uVar28 = FUN_00824d38(&DAT_00d1ce90);
        uVar19 = FUN_00824394(&local_f8,uVar28);
        if ((uVar19 & 1) == 0) {
          FUN_00824e38();
          if (DAT_00d1cea3 == '\x01') {
            DAT_00d1cea3 = '\0';
            DAT_00d1cea0 = DAT_00d1cea0 ^ 0xd;
            DAT_00d1cea1 = DAT_00d1cea1 ^ 0xf5;
            DAT_00d1cea2 = DAT_00d1cea2 ^ 0xc9;
          }
                    /* try { // try from 00823718 to 00823753 has its CatchHandler @ 00823970 */
          FUN_00824ea0();
          FUN_00827588(&DAT_00d1ceb0);
          if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
            FUN_008aecb4(param_1,&DAT_00d1cea0,&DAT_00d1ceb0);
          }
          goto LAB_00823c68;
        }
                    /* try { // try from 00822884 to 0082289f has its CatchHandler @ 00823a58 */
        FUN_008244d4();
        FUN_00824d74(&local_380,&local_148,&local_128,&DAT_00d1ccf8);
        goto LAB_008228cc;
      }
      if (sVar16 == 0xffffffffffffffff) {
        if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00823644 to 00823647 has its CatchHandler @ 008239b8 */
          FUN_00814f80();
        }
        goto LAB_00823c68;
      }
      pbVar26 = pbVar31;
      if ((local_f8 & 1) != 0) {
        pbVar26 = pbStack_e8;
      }
      iVar13 = memcmp(pbVar26,&DAT_00d1ce50,sVar16);
      if (iVar13 != 0) goto LAB_00822650;
      if ((local_110 & 1) == 0) {
        local_c0 = (undefined ***)CONCAT71(uStack_10f,local_110);
        uStack_b8 = uStack_108;
        local_b0 = local_100;
      }
      else {
                    /* try { // try from 00822958 to 0082295f has its CatchHandler @ 008238ec */
        FUN_007ff40c(&local_c0,local_100,uStack_108);
      }
                    /* try { // try from 00822960 to 0082296f has its CatchHandler @ 00823914 */
      FUN_00827284(&local_a0,&local_c0,1);
      local_a0 = &PTR_LAB_00c489f0;
      if (((DAT_00d1ce48 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1ce48), iVar13 != 0)) {
                    /* try { // try from 008237ec to 008237ef has its CatchHandler @ 008238a4 */
        FUN_00826858();
        __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1ce48);
      }
                    /* try { // try from 0082298c to 008229a7 has its CatchHandler @ 00823910 */
      FUN_0082492c(&local_380,&local_148,&local_a0,&local_128,&DAT_00d1ccf8);
LAB_00822aa4:
      FUN_00824558(&local_270,&local_380);
      FUN_008247c0(&local_380);
      local_a0 = &PTR_LAB_00c48a38;
      if ((sStack_98 & 1) != 0) {
        operator_delete(local_88,sStack_98 & 0xfffffffffffffffe);
      }
      if (((ulong)local_c0 & 1) != 0) {
        operator_delete(local_b0,(ulong)local_c0 & 0xfffffffffffffffe);
      }
    }
    pvVar33 = local_260;
    iVar13 = (int)uStack_1e0;
                    /* try { // try from 00822afc to 00822b1f has its CatchHandler @ 00823b58 */
    FUN_008ad0b0(param_1,0,0);
    FUN_008ac964(param_1,(iVar13 == 0 && pvVar33 != (void *)0x0) &&
                         (iVar13 != 0 || -1 < (long)pvVar33));
    if (((DAT_00d1cee0 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cee0), iVar13 != 0)) {
      DAT_00d1ced8 = '\x01';
      DAT_00d1ced0 = 0x319a5814c0c6782a;
      __cxa_atexit(&LAB_008275e0,&DAT_00d1ced0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cee0);
    }
    if (DAT_00d1ced8 == '\x01') {
      DAT_00d1ced8 = '\0';
      DAT_00d1ced0 = DAT_00d1ced0 ^ 0x31e92b71a3a50d79;
    }
                    /* try { // try from 00822b60 to 00822b73 has its CatchHandler @ 00823aec */
    FUN_008ad800(param_1,0xfffffffe,&DAT_00d1ced0);
                    /* try { // try from 00822b78 to 00822b7f has its CatchHandler @ 00823b58 */
    FUN_008ac230(param_1,(ulong)local_260 & 0xffffffff);
    if (((DAT_00d1cef8 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cef8), iVar13 != 0)) {
      DAT_00d1cee8 = 0x32c67ac09f0c031a;
      _DAT_00d1cef0 = 0x16d122d;
      __cxa_atexit(&LAB_008275e8,&DAT_00d1cee8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cef8);
    }
    if (DAT_00d1cef3 == '\x01') {
      DAT_00d1cee8 = DAT_00d1cee8 ^ 0x5d8509b5eb6d7749;
      uVar7 = (uint3)_DAT_00d1cef0;
      _DAT_00d1cef0 = (uint)(uVar7 ^ 0x6d7749);
    }
                    /* try { // try from 00822bec to 00822bff has its CatchHandler @ 00823ae8 */
    FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cee8);
    bVar11 = (int)uStack_1e0 != 0;
    lVar18 = 0xe0;
    if (bVar11) {
      lVar18 = 0x98;
    }
    lVar3 = 0xf0;
    if (bVar11) {
      lVar3 = 0xa8;
    }
    lVar4 = 0xe1;
    if (bVar11) {
      lVar4 = 0x99;
    }
    lVar4 = (long)&local_270 + lVar4;
    if ((*(byte *)((long)&local_270 + lVar18) & 1) != 0) {
      lVar4 = *(long *)((long)&local_270 + lVar3);
    }
                    /* try { // try from 00822c44 to 00822c4b has its CatchHandler @ 00823b58 */
    FUN_008ac4a8(param_1,lVar4);
    if (((DAT_00d1cf10 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cf10), iVar13 != 0)) {
      DAT_00d1cf0e = '\x01';
      DAT_00d1cf00 = 0x4ee0042d7a0ba0;
      DAT_00d1cf08 = 0x3e7a0c80;
      _DAT_00d1cf0c = 0x9314;
      __cxa_atexit(&LAB_008275f4,&DAT_00d1cf00,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cf10);
    }
    if (DAT_00d1cf0e == '\x01') {
      uVar7 = CONCAT12((char)(DAT_00d1cf08 >> 8),(short)DAT_00d1cf08) & 0xff00ff;
      DAT_00d1cf0e = '\0';
      DAT_00d1cf08 = CONCAT13((char)(DAT_00d1cf08 >> 0x18),
                              CONCAT12((char)(DAT_00d1cf08 >> 0x10),
                                       CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0x591b7ff3;
      _DAT_00d1cf0c = _DAT_00d1cf0c ^ 0x9371;
      DAT_00d1cf00 = DAT_00d1cf00 ^ 0x65039371591b7ff3;
    }
                    /* try { // try from 00822cc8 to 00822cdb has its CatchHandler @ 00823ae4 */
    FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cf00);
    uVar19 = local_258 >> 1 & 0x7f;
    lVar18 = (long)&local_258 + 1;
    if ((local_258 & 1) != 0) {
      uVar19 = local_250;
      lVar18 = lStack_248;
    }
                    /* try { // try from 00822cfc to 00822d03 has its CatchHandler @ 00823b58 */
    FUN_008ac34c(param_1,lVar18,uVar19);
    if (((DAT_00d1cf20 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cf20), iVar13 != 0)) {
      _DAT_00d1cf1c = 0x145;
      DAT_00d1cf18 = 0x6293dc39;
      __cxa_atexit(&LAB_00827600,&DAT_00d1cf18,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cf20);
    }
    if (DAT_00d1cf1d == '\x01') {
      uVar7 = CONCAT12((char)(DAT_00d1cf18 >> 8),(short)DAT_00d1cf18) & 0xff00ff;
      _DAT_00d1cf1c = (ushort)(DAT_00d1cf1c ^ 0x45);
      DAT_00d1cf18 = CONCAT13((char)(DAT_00d1cf18 >> 0x18),
                              CONCAT12((char)(DAT_00d1cf18 >> 0x10),
                                       CONCAT11((char)(uVar7 >> 0x10),(char)uVar7))) ^ 0x1bf7b37b;
    }
                    /* try { // try from 00822d5c to 00822d6f has its CatchHandler @ 00823ae0 */
    FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cf18);
                    /* try { // try from 00822d70 to 00822d7f has its CatchHandler @ 00823b58 */
    FUN_008ad0b0(param_1,0,0);
    puVar21 = local_240;
    while (puVar21 != &local_238) {
      lVar18 = (long)puVar21 + 0x21;
      if ((*(byte *)(puVar21 + 4) & 1) != 0) {
        lVar18 = puVar21[6];
      }
                    /* try { // try from 00822eac to 00822edb has its CatchHandler @ 00823bb4 */
      FUN_008ac4a8(param_1,lVar18);
      lVar18 = (long)puVar21 + 0x39;
      if ((*(byte *)(puVar21 + 7) & 1) != 0) {
        lVar18 = puVar21[9];
      }
      FUN_008ac4a8(param_1,lVar18);
      FUN_008ad70c(param_1,0xfffffffd);
      puVar10 = (undefined8 *)puVar21[1];
      puVar29 = puVar21;
      if ((undefined8 *)puVar21[1] == (undefined8 *)0x0) {
        do {
          puVar21 = (undefined8 *)puVar29[2];
          bVar11 = puVar29 != (undefined8 *)*puVar21;
          puVar29 = puVar21;
        } while (bVar11);
      }
      else {
        do {
          puVar21 = puVar10;
          puVar10 = (undefined8 *)*puVar21;
        } while ((undefined8 *)*puVar21 != (undefined8 *)0x0);
      }
    }
    if (((DAT_00d1cf38 & 1) == 0) && (iVar13 = __cxa_guard_acquire(&DAT_00d1cf38), iVar13 != 0)) {
      DAT_00d1cf30 = '\x01';
      DAT_00d1cf28 = 0xc38a690815cc6633;
      __cxa_atexit(&LAB_0082760c,&DAT_00d1cf28,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cf38);
    }
    if (DAT_00d1cf30 == '\x01') {
      DAT_00d1cf30 = '\0';
      DAT_00d1cf28 = DAT_00d1cf28 ^ 0xc3f91b6d71ad037b;
    }
                    /* try { // try from 00822dcc to 00822ddf has its CatchHandler @ 00823adc */
    FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cf28);
    FUN_008247c0(&local_270);
    local_148 = &PTR_LAB_00c489d0;
    if ((sStack_140 & 1) != 0) {
      operator_delete(local_130,sStack_140 & 0xfffffffffffffffe);
    }
    FUN_00827168(&local_128,local_120);
    uVar28 = 1;
  }
  if ((local_110 & 1) != 0) {
    operator_delete(local_100,CONCAT71(uStack_10f,local_110) & 0xfffffffffffffffe);
  }
  if ((local_f8 & 1) != 0) {
    operator_delete(pbStack_e8,CONCAT71(uStack_f7,local_f8) & 0xfffffffffffffffe);
  }
  if ((local_e0 & 1) != 0) {
    operator_delete(local_d0,CONCAT71(uStack_df,local_e0) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar6 + 0x28) == local_78) {
    return uVar28;
  }
LAB_00823c68:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

