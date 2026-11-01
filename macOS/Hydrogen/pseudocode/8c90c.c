
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0008c90c(long param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  long lVar10;
  undefined8 uVar11;
  undefined *puVar12;
  code *pcVar13;
  int iVar14;
  byte *pbVar15;
  undefined1 *puVar16;
  undefined8 uVar17;
  char *pcVar18;
  long lVar19;
  long unaff_x19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  long lVar32;
  long lVar33;
  ulong uVar34;
  ulong uVar35;
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  long in_stack_00000060;
  
  iVar14 = ___cxa_guard_acquire(param_1 + 0xb70);
  if (iVar14 != 0) {
    uVar17 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb68) = uVar17;
    ___cxa_guard_release(0xa28b70);
  }
  lRam0000000000a338f8 = *(long *)(unaff_x19 + 0xb68) + 0x4e8df33;
  if (((bRam0000000000a28b80 & 1) == 0) && (iVar14 = ___cxa_guard_acquire(0xa28b80), iVar14 != 0)) {
    lRam0000000000a28b78 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b80);
  }
  lRam0000000000a33900 = lRam0000000000a28b78 + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar14 = ___cxa_guard_acquire(0xa28b90), iVar14 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  pcVar13 = pcRam0000000000a2b910;
  lRam0000000000a33908 = lRam0000000000a28b88 + 0x329897c;
  pbVar15 = (byte *)(*pcRam0000000000a2b910)(0xa2b910);
  if ((*pbVar15 & 1) == 0) {
    lVar19 = (*pcRam0000000000a2b8f8)(0xa2b8f8);
    (&UNK_00006533)[lVar19] = 1;
    _memcpy(lVar19,&UNK_007fce81,&UNK_00006533);
    __tlv_atexit(&DAT_0001717c,lVar19,0);
    puVar16 = (undefined1 *)(*pcVar13)(0xa2b910);
    *puVar16 = 1;
  }
  lRam0000000000a33910 = (*pcRam0000000000a2b8f8)(0xa2b8f8);
  uVar11 = _UNK_007fc2e8;
  uVar17 = _UNK_007fc2e0;
  if ((&UNK_00006533)[lRam0000000000a33910] != '\0') {
    lVar19 = -0x6530;
    lVar20 = _UNK_007fc260;
    lVar21 = _UNK_007fc268;
    lVar22 = _UNK_007fc270;
    lVar23 = _UNK_007fc278;
    lVar24 = _UNK_007fc280;
    lVar25 = _UNK_007fc288;
    lVar26 = _UNK_007fc290;
    lVar27 = _UNK_007fc298;
    uVar28 = _UNK_007fc2a0;
    uVar29 = _UNK_007fc2a8;
    uVar30 = _UNK_007fc2b0;
    uVar31 = _UNK_007fc2b8;
    lVar32 = _UNK_007fc2c0;
    lVar33 = _UNK_007fc2c8;
    uVar34 = _UNK_007fc2d0;
    uVar35 = _UNK_007fc2d8;
    do {
      auVar41._0_8_ = -(ulong)((byte)(lVar26 << 3) & 0x38);
      auVar41._8_8_ = -(ulong)((byte)(lVar27 << 3) & 0x38);
      auVar37._8_8_ = 0x4d572fb931ab63f7;
      auVar37._0_8_ = 0x4d572fb931ab63f7;
      auVar41 = NEON_ushl(auVar37,auVar41,8);
      auVar42._0_8_ = -(ulong)((byte)(lVar24 << 3) & 0x38);
      auVar42._8_8_ = -(ulong)((byte)(lVar25 << 3) & 0x38);
      auVar38._8_8_ = 0x4d572fb931ab63f7;
      auVar38._0_8_ = 0x4d572fb931ab63f7;
      auVar42 = NEON_ushl(auVar38,auVar42,8);
      auVar43._0_8_ = -(ulong)((byte)(lVar22 << 3) & 0x38);
      auVar43._8_8_ = -(ulong)((byte)(lVar23 << 3) & 0x38);
      auVar39._8_8_ = 0x4d572fb931ab63f7;
      auVar39._0_8_ = 0x4d572fb931ab63f7;
      auVar43 = NEON_ushl(auVar39,auVar43,8);
      auVar44._0_8_ = -(ulong)((byte)(lVar20 << 3) & 0x38);
      auVar44._8_8_ = -(ulong)((byte)(lVar21 << 3) & 0x38);
      auVar40._8_8_ = 0x4d572fb931ab63f7;
      auVar40._0_8_ = 0x4d572fb931ab63f7;
      auVar44 = NEON_ushl(auVar40,auVar44,8);
      auVar36._0_8_ = -(ulong)((byte)(lVar32 << 3) & 0x38);
      auVar36._8_8_ = -(ulong)((byte)(lVar33 << 3) & 0x38);
      auVar1._8_8_ = 0x4d572fb931ab63f7;
      auVar1._0_8_ = 0x4d572fb931ab63f7;
      auVar38 = NEON_ushl(auVar1,auVar36,8);
      lVar10 = (uVar35 & 7) * -8;
      auVar2._8_8_ = 0x4d572fb931ab63f7;
      auVar2._0_8_ = 0x4d572fb931ab63f7;
      auVar7[8] = (char)lVar10;
      auVar7._0_8_ = (uVar34 & 7) * -8;
      auVar7[9] = (char)((ulong)lVar10 >> 8);
      auVar7[10] = (char)((ulong)lVar10 >> 0x10);
      auVar7[0xb] = (char)((ulong)lVar10 >> 0x18);
      auVar7[0xc] = (char)((ulong)lVar10 >> 0x20);
      auVar7[0xd] = (char)((ulong)lVar10 >> 0x28);
      auVar7[0xe] = (char)((ulong)lVar10 >> 0x30);
      auVar7[0xf] = (char)((ulong)lVar10 >> 0x38);
      auVar37 = NEON_ushl(auVar2,auVar7,8);
      lVar10 = (uVar31 & 7) * -8;
      auVar3._8_8_ = 0x4d572fb931ab63f7;
      auVar3._0_8_ = 0x4d572fb931ab63f7;
      auVar8[8] = (char)lVar10;
      auVar8._0_8_ = (uVar30 & 7) * -8;
      auVar8[9] = (char)((ulong)lVar10 >> 8);
      auVar8[10] = (char)((ulong)lVar10 >> 0x10);
      auVar8[0xb] = (char)((ulong)lVar10 >> 0x18);
      auVar8[0xc] = (char)((ulong)lVar10 >> 0x20);
      auVar8[0xd] = (char)((ulong)lVar10 >> 0x28);
      auVar8[0xe] = (char)((ulong)lVar10 >> 0x30);
      auVar8[0xf] = (char)((ulong)lVar10 >> 0x38);
      auVar39 = NEON_ushl(auVar3,auVar8,8);
      lVar10 = (uVar29 & 7) * -8;
      auVar4._8_8_ = 0x4d572fb931ab63f7;
      auVar4._0_8_ = 0x4d572fb931ab63f7;
      auVar9[8] = (char)lVar10;
      auVar9._0_8_ = (uVar28 & 7) * -8;
      auVar9[9] = (char)((ulong)lVar10 >> 8);
      auVar9[10] = (char)((ulong)lVar10 >> 0x10);
      auVar9[0xb] = (char)((ulong)lVar10 >> 0x18);
      auVar9[0xc] = (char)((ulong)lVar10 >> 0x20);
      auVar9[0xd] = (char)((ulong)lVar10 >> 0x28);
      auVar9[0xe] = (char)((ulong)lVar10 >> 0x30);
      auVar9[0xf] = (char)((ulong)lVar10 >> 0x38);
      auVar40 = NEON_ushl(auVar4,auVar9,8);
      auVar5._8_8_ = uVar11;
      auVar5._0_8_ = uVar17;
      auVar37 = a64_TBL(ZEXT816(0),auVar37,auVar38,auVar39,auVar40,auVar5);
      auVar6._8_8_ = uVar11;
      auVar6._0_8_ = uVar17;
      auVar38 = a64_TBL(ZEXT816(0),auVar41,auVar42,auVar43,auVar44,auVar6);
      lVar10 = lRam0000000000a33910 + lVar19;
      (&UNK_00006538)[lVar10] = (&UNK_00006538)[lVar10] ^ auVar38[0];
      (&UNK_00006539)[lVar10] = (&UNK_00006539)[lVar10] ^ auVar38[1];
      (&UNK_0000653a)[lVar10] = (&UNK_0000653a)[lVar10] ^ auVar38[2];
      (&UNK_0000653b)[lVar10] = (&UNK_0000653b)[lVar10] ^ auVar38[3];
      (&UNK_0000653c)[lVar10] = (&UNK_0000653c)[lVar10] ^ auVar38[4];
      (&UNK_0000653d)[lVar10] = (&UNK_0000653d)[lVar10] ^ auVar38[5];
      (&UNK_0000653e)[lVar10] = (&UNK_0000653e)[lVar10] ^ auVar38[6];
      (&UNK_0000653f)[lVar10] = (&UNK_0000653f)[lVar10] ^ auVar38[7];
      (&UNK_00006530)[lVar10] = (&UNK_00006530)[lVar10] ^ auVar37[0];
      (&UNK_00006531)[lVar10] = (&UNK_00006531)[lVar10] ^ auVar37[1];
      (&UNK_00006532)[lVar10] = (&UNK_00006532)[lVar10] ^ auVar37[2];
      (&UNK_00006533)[lVar10] = (&UNK_00006533)[lVar10] ^ auVar37[3];
      (&UNK_00006534)[lVar10] = (&UNK_00006534)[lVar10] ^ auVar37[4];
      (&UNK_00006535)[lVar10] = (&UNK_00006535)[lVar10] ^ auVar37[5];
      (&UNK_00006536)[lVar10] = (&UNK_00006536)[lVar10] ^ auVar37[6];
      (&UNK_00006537)[lVar10] = (&UNK_00006537)[lVar10] ^ auVar37[7];
      uVar30 = uVar30 + 0x10;
      uVar31 = uVar31 + 0x10;
      lVar32 = lVar32 + 0x10;
      lVar33 = lVar33 + 0x10;
      uVar34 = uVar34 + 0x10;
      uVar35 = uVar35 + 0x10;
      uVar28 = uVar28 + 0x10;
      uVar29 = uVar29 + 0x10;
      lVar26 = lVar26 + 0x10;
      lVar27 = lVar27 + 0x10;
      lVar24 = lVar24 + 0x10;
      lVar25 = lVar25 + 0x10;
      lVar22 = lVar22 + 0x10;
      lVar23 = lVar23 + 0x10;
      lVar20 = lVar20 + 0x10;
      lVar21 = lVar21 + 0x10;
      lVar19 = lVar19 + 0x10;
    } while (lVar19 != 0);
    uVar28 = (ulong)_UNK_007fc0e0 >> 0x20;
    (&UNK_00006530)[lRam0000000000a33910] =
         (&UNK_00006530)[lRam0000000000a33910] ^ (byte)_UNK_007fc0e0;
    (&UNK_00006531)[lRam0000000000a33910] = (&UNK_00006531)[lRam0000000000a33910] ^ (byte)uVar28;
    (&UNK_00006532)[lRam0000000000a33910] = (&UNK_00006532)[lRam0000000000a33910] ^ 0xab;
    (&UNK_00006533)[lRam0000000000a33910] = 0;
  }
  uRam0000000000a33938 = 0;
  uRam0000000000a33940 = 0;
  uRam0000000000a33930 = 0;
  ___cxa_atexit(&DAT_00009f30,0xa33930,0);
  uRam0000000000a33950 = 0;
  uRam0000000000a33948 = 0xa33950;
  uRam0000000000a33958 = 0;
  ___cxa_atexit(&DAT_00009fb8,0xa33948,0);
  ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa288e8,0);
  lVar19 = _getenv("HOME");
  in_stack_00000040 = 0;
  in_stack_00000048 = 0;
  uStack0000000000000038 = 0;
  pcVar18 = (char *)(lVar19 + -1);
  do {
    pcVar18 = pcVar18 + 1;
  } while (*pcVar18 != '\0');
  func_0x00017184(&uStack0000000000000038,lVar19);
  uStack0000000000000020 = 0;
  in_stack_00000028 = 0;
  in_stack_00000030 = 0;
  func_0x00017184(&uStack0000000000000020,"Hydrogen","");
  if (in_stack_00000048 < 0) {
    func_0x00017634(&uStack0000000000000050,uStack0000000000000038,in_stack_00000040);
  }
  else {
    in_stack_00000058 = in_stack_00000040;
    uStack0000000000000050 = uStack0000000000000038;
    in_stack_00000060 = in_stack_00000048;
  }
  func_0x0001754c(&uStack0000000000000050,&uStack0000000000000020);
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  func_0x00017184(&uStack0000000000000008,"autoexecute","");
  if (in_stack_00000060 < 0) {
    func_0x00017634(0xa33220,uStack0000000000000050,in_stack_00000058);
  }
  else {
    uRam0000000000a33228 = in_stack_00000058;
    uRam0000000000a33220 = uStack0000000000000050;
    lRam0000000000a33230 = in_stack_00000060;
  }
  func_0x0001754c(0xa33220,&uStack0000000000000008);
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000060 < 0) {
    __ZdlPv(uStack0000000000000050);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000048 < 0) {
    __ZdlPv(uStack0000000000000038);
  }
  ___cxa_atexit(&DAT_00009f30,0xa33220,0);
  ___cxa_atexit(&DAT_00009fe0,0xa33238,0);
  ___cxa_atexit(&DAT_0000a010,0xa28928,0);
  ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa28980,0);
  ___cxa_atexit(&DAT_0000a088,0xa289c0,0);
  uRam0000000000a33258 = 0;
  uRam0000000000a33250 = 0;
  uRam0000000000a33268 = 0;
  uRam0000000000a33260 = 0;
  uRam0000000000a33270 = 0x3f800000;
  ___cxa_atexit(&DAT_0000aa18,0xa33250,0);
  uRam0000000000a33288 = 0;
  uRam0000000000a33280 = 0;
  uRam0000000000a33278 = 0xa33280;
  ___cxa_atexit(&DAT_0000aa60,0xa33278,0);
  uRam0000000000a332b8 = 0;
  uRam0000000000a332b0 = 0;
  uRam0000000000a332c8 = 0;
  uRam0000000000a332c0 = 0;
  uRam0000000000a332d0 = 0x3f800000;
  ___cxa_atexit(&DAT_0000aa88,0xa332b0,0);
  ___cxa_atexit(&DAT_0000aad0,0xa332d8,0);
  ___cxa_atexit(&DAT_0000ab40,0xa332f0,0);
  puVar12 = PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev_009b0078;
  ___cxa_atexit(PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev_009b0078,
                0xa33300,0);
  ___cxa_atexit(&DAT_0000aba0,0xa33318,0);
  uRam0000000000a33338 = 0;
  uRam0000000000a33330 = 0;
  uRam0000000000a33348 = 0;
  uRam0000000000a33340 = 0;
  uRam0000000000a33350 = 0x3f800000;
  ___cxa_atexit(&DAT_0000abd0,0xa33330,0);
  uRam0000000000a33368 = 0;
  uRam0000000000a33360 = 0;
  uRam0000000000a33358 = 0xa33360;
  ___cxa_atexit(&DAT_0000ac18,0xa33358,0);
  uRam0000000000a33380 = 0;
  uRam0000000000a33378 = 0;
  uRam0000000000a33370 = 0xa33378;
  ___cxa_atexit(&DAT_0000ac40,0xa33370,0);
  uRam0000000000a33398 = 0;
  uRam0000000000a33390 = 0;
  uRam0000000000a333a8 = 0;
  uRam0000000000a333a0 = 0;
  uRam0000000000a333b0 = 0x3f800000;
  ___cxa_atexit(&DAT_0000ac68,0xa33390,0);
  uRam0000000000a333c0 = 0;
  uRam0000000000a333b8 = 0;
  uRam0000000000a333d0 = 0;
  uRam0000000000a333c8 = 0;
  uRam0000000000a333d8 = 0x3f800000;
  ___cxa_atexit(&DAT_0000acd0,0xa333b8,0);
  ___cxa_atexit(puVar12,0xa333e0,0);
  uRam0000000000a2b8e0 = uRam0000000000a27948;
  puRam0000000000a2b8e8 = &DAT_0000e3fc;
  uRam0000000000a2b8f0 = 0xa28a20;
  return;
}

