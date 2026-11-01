
void FUN_002ba578(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  long *plVar18;
  ushort *puVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  undefined1 (*pauVar28) [16];
  long lVar29;
  ulong uVar30;
  long lVar31;
  uint uVar32;
  ulong unaff_x19;
  long lVar33;
  long lVar34;
  ulong uVar35;
  ulong uVar36;
  long lVar37;
  long lVar38;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  long lVar42;
  undefined1 (*unaff_x26) [16];
  ulong uVar43;
  long lVar44;
  long unaff_x29;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 in_stack_00000000 [16];
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
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
  undefined8 in_stack_000000c8;
  undefined1 uStack00000000000000d8;
  undefined1 uStack0000000000000178;
  ulong uStack_f0;
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  undefined1 auStack_a0 [32];
  long lStack_80;
  undefined1 auStack_78 [40];
  
  while( true ) {
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    func_0x002b9d20(&uStack0000000000000178);
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    func_0x002b9d20(&uStack0000000000000178);
    func_0x003074c0(&uStack00000000000000d8,&uStack0000000000000178);
    func_0x003074c0(in_stack_00000020);
    func_0x003074c0();
    func_0x003074c0();
    lVar26 = 0;
    uVar32 = (uint)unaff_x19;
    auVar45 = ZEXT816(0);
    auVar52 = ZEXT816(0);
    auVar46 = ZEXT816(0);
    auVar48 = ZEXT816(0);
    auVar49 = ZEXT816(0);
    auVar50 = ZEXT816(0);
    auVar51 = ZEXT816(0);
    pauVar28 = unaff_x26;
    auVar47 = in_stack_00000000;
    auVar53 = in_stack_00000000;
    in_stack_00000050 = in_stack_00000010;
    in_stack_00000058 = in_stack_00000018;
    do {
      uVar30 = -(ulong)((*(byte *)((in_stack_00000028 - (unaff_x19 >> 3 & 0x1fffffff)) + 0x1f) >>
                         (ulong)((uVar32 ^ 0xffffffff) & 4) & 0xf ^ (uint)lVar26) - 1 >> 0x1f);
      auVar9._8_8_ = uVar30;
      auVar9._0_8_ = uVar30;
      auVar53 = auVar53 ^ (auVar53 ^ pauVar28[-5]) & auVar9;
      auVar10._8_8_ = uVar30;
      auVar10._0_8_ = uVar30;
      auVar45 = auVar45 ^ (auVar45 ^ pauVar28[-4]) & auVar10;
      in_stack_00000050 = in_stack_00000050 ^ (in_stack_00000050 ^ *(ulong *)pauVar28[-3]) & uVar30;
      in_stack_00000058 =
           in_stack_00000058 ^ (in_stack_00000058 ^ *(ulong *)(pauVar28[-3] + 8)) & uVar30;
      auVar11._8_8_ = uVar30;
      auVar11._0_8_ = uVar30;
      auVar52 = auVar52 ^ (auVar52 ^ pauVar28[-2]) & auVar11;
      auVar12._8_8_ = uVar30;
      auVar12._0_8_ = uVar30;
      auVar46 = auVar46 ^ (auVar46 ^ pauVar28[-1]) & auVar12;
      auVar13._8_8_ = uVar30;
      auVar13._0_8_ = uVar30;
      auVar47 = auVar47 ^ (auVar47 ^ *pauVar28) & auVar13;
      auVar14._8_8_ = uVar30;
      auVar14._0_8_ = uVar30;
      auVar48 = auVar48 ^ (auVar48 ^ pauVar28[1]) & auVar14;
      auVar15._8_8_ = uVar30;
      auVar15._0_8_ = uVar30;
      auVar49 = auVar49 ^ (auVar49 ^ pauVar28[2]) & auVar15;
      auVar16._8_8_ = uVar30;
      auVar16._0_8_ = uVar30;
      auVar50 = auVar50 ^ (auVar50 ^ pauVar28[3]) & auVar16;
      auVar17._8_8_ = uVar30;
      auVar17._0_8_ = uVar30;
      auVar51 = auVar51 ^ (auVar51 ^ pauVar28[4]) & auVar17;
      lVar26 = lVar26 + 1;
      pauVar28 = pauVar28 + 10;
    } while (lVar26 != 0x10);
    in_stack_00000038 = auVar53._8_8_;
    uStack0000000000000030 = auVar53._0_8_;
    in_stack_00000048 = auVar45._8_8_;
    in_stack_00000040 = auVar45._0_8_;
    in_stack_00000068 = auVar52._8_8_;
    in_stack_00000060 = auVar52._0_8_;
    in_stack_00000078 = auVar46._8_8_;
    in_stack_00000070 = auVar46._0_8_;
    in_stack_00000088 = auVar47._8_8_;
    in_stack_00000080 = auVar47._0_8_;
    in_stack_00000098 = auVar48._8_8_;
    in_stack_00000090 = auVar48._0_8_;
    in_stack_000000a8 = auVar49._8_8_;
    in_stack_000000a0 = auVar49._0_8_;
    in_stack_000000b8 = auVar50._8_8_;
    in_stack_000000b0 = auVar50._0_8_;
    in_stack_000000c8 = auVar51._8_8_;
    in_stack_000000c0 = auVar51._0_8_;
    func_0x002b8574(&uStack0000000000000178,&uStack00000000000000d8,&uStack0000000000000030);
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    unaff_x19 = (ulong)(uVar32 + 4);
    if (0xfb < uVar32) break;
    func_0x002b9d20(&uStack0000000000000178);
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    func_0x002b9d20(&uStack0000000000000178);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return;
  }
  auVar47 = ___stack_chk_fail();
  lVar26 = auVar47._8_8_;
  plVar18 = auVar47._0_8_;
  func_0x003074c0(&uStack_f0,lVar26,lVar26 + 0x78);
  func_0x003074c0(&uStack_c8,lVar26 + 0x28,lVar26 + 0x50);
  func_0x003074c0(auStack_a0,lVar26 + 0x50,lVar26 + 0x78);
  func_0x003074c0(auStack_78,lVar26,lVar26 + 0x28);
  if ((((uStack_c8 < 0x8cccccccccccd) && (uStack_c0 < 0x8cccccccccccd)) &&
      (uStack_b8 < 0x8cccccccccccd)) &&
     ((uStack_b0 < 0x8cccccccccccd && (uStack_a8 < 0x8cccccccccccd)))) {
    if (((uStack_f0 < 0x8cccccccccccd) && (uStack_e8 < 0x8cccccccccccd)) &&
       ((uStack_e0 < 0x8cccccccccccd &&
        ((uStack_d8 < 0x8cccccccccccd && (uStack_d0 < 0x8cccccccccccd)))))) {
      *plVar18 = uStack_f0 + uStack_c8;
      plVar18[1] = uStack_e8 + uStack_c0;
      plVar18[2] = uStack_e0 + uStack_b8;
      plVar18[3] = uStack_d8 + uStack_b0;
      plVar18[4] = uStack_d0 + uStack_a8;
      plVar18[5] = (uStack_c8 - uStack_f0) + 0xfffffffffffda;
      plVar18[6] = (uStack_c0 - uStack_e8) + 0xffffffffffffe;
      plVar18[7] = (uStack_b8 - uStack_e0) + 0xffffffffffffe;
      plVar18[8] = (uStack_b0 - uStack_d8) + 0xffffffffffffe;
      plVar18[9] = (uStack_a8 - uStack_d0) + 0xffffffffffffe;
      plVar18[0xb] = auStack_a0._8_8_;
      plVar18[10] = auStack_a0._0_8_;
      plVar18[0xd] = auStack_a0._24_8_;
      plVar18[0xc] = auStack_a0._16_8_;
      plVar18[0xe] = lStack_80;
      func_0x003074c0(plVar18 + 0xf,auStack_78,&UNK_00831170);
      return;
    }
  }
  else {
    func_0x0079e4ec();
  }
  puVar19 = (ushort *)func_0x0079e55c();
  uVar41 = (ulong)((*(uint *)(puVar19 + 0x16) >> 0x18 | (uint)(byte)puVar19[0x18] << 8 |
                   (uint)*(byte *)((long)puVar19 + 0x31) << 0x10) >> 2) & 0x1fffff;
  uVar43 = (ulong)(*(uint *)((long)puVar19 + 0x31) >> 7) & 0x1fffff;
  uVar39 = (ulong)(*(uint *)(puVar19 + 0x1a) >> 4) & 0x1fffff;
  uVar36 = (ulong)((*(uint *)(puVar19 + 0x1a) >> 0x18 | (uint)(byte)puVar19[0x1c] << 8 |
                   (uint)*(byte *)((long)puVar19 + 0x39) << 0x10) >> 1) & 0x1fffff;
  lVar20 = ((ulong)(*(uint *)((long)puVar19 + 0xf) >> 6) & 0x1fffff) + uVar41 * 0xa2c13;
  lVar44 = ((ulong)*(ushort *)((long)puVar19 + 0x15) |
           ((ulong)*(byte *)((long)puVar19 + 0x17) & 0x1f) << 0x10) + uVar43 * 0x72d18 +
           uVar39 * 0xa2c13 + uVar41 * 0x9fb67;
  uVar30 = lVar20 + 0x100000;
  lVar26 = (((ulong)(*(uint *)((long)puVar19 + 0xf) >> 0x18) |
             (ulong)*(byte *)((long)puVar19 + 0x13) << 8 | (ulong)(byte)puVar19[10] << 0x10) >> 3) +
           uVar43 * 0xa2c13 + uVar41 * 0x72d18 + (uVar30 >> 0x15);
  uVar1 = lVar44 + 0x100000;
  lVar31 = ((ulong)(*(uint *)((long)puVar19 + 0x17) >> 5) & 0x1fffff) + uVar43 * 0x9fb67 +
           uVar39 * 0x72d18 + (long)(int)uVar41 * -0xf39ad + uVar36 * 0xa2c13 + (uVar1 >> 0x15);
  uVar32 = *(uint *)(puVar19 + 0x1e) >> 3;
  lVar34 = ((ulong)puVar19[0x15] | ((ulong)(byte)puVar19[0x16] & 0x1f) << 0x10) +
           (long)(int)uVar32 * -0xa6f7d;
  uVar40 = (ulong)(*(uint *)((long)puVar19 + 0x39) >> 6) & 0x1fffff;
  lVar33 = ((ulong)(*(uint *)(puVar19 + 0x12) >> 6) & 0x1fffff) + (long)(int)uVar32 * -0xf39ad +
           uVar40 * 0x215d1 + (long)(int)uVar36 * -0xa6f7d;
  lVar23 = ((ulong)(*(uint *)((long)puVar19 + 0x1f) >> 4) & 0x1fffff) + (long)(int)uVar43 * -0xa6f7d
           + uVar39 * 0x215d1 + (ulong)uVar32 * 0x72d18 + uVar40 * 0x9fb67 +
           (long)(int)uVar36 * -0xf39ad;
  lVar42 = ((ulong)((*(uint *)((long)puVar19 + 0x17) >> 0x18 |
                     (uint)*(byte *)((long)puVar19 + 0x1b) << 8 | (uint)(byte)puVar19[0xe] << 0x10)
                   >> 2) & 0x1fffff) + (long)(int)uVar43 * -0xf39ad + uVar39 * 0x9fb67 +
           uVar41 * 0x215d1 + uVar40 * 0xa2c13 + uVar36 * 0x72d18;
  uVar2 = lVar42 + 0x100000;
  lVar6 = ((ulong)(*(uint *)(puVar19 + 0xe) >> 7) & 0x1fffff) + uVar43 * 0x215d1 +
          (long)(int)uVar39 * -0xf39ad + (long)(int)uVar41 * -0xa6f7d + (ulong)uVar32 * 0xa2c13 +
          uVar40 * 0x72d18 + uVar36 * 0x9fb67 + ((long)uVar2 >> 0x15);
  uVar41 = lVar23 + 0x100000;
  lVar37 = ((ulong)((*(uint *)((long)puVar19 + 0x1f) >> 0x18 |
                     (uint)*(byte *)((long)puVar19 + 0x23) << 8 | (uint)(byte)puVar19[0x12] << 0x10)
                   >> 1) & 0x1fffff) + (long)(int)uVar39 * -0xa6f7d + (ulong)uVar32 * 0x9fb67 +
           (long)(int)uVar40 * -0xf39ad + uVar36 * 0x215d1 + ((long)uVar41 >> 0x15);
  uVar36 = lVar33 + 0x100000;
  lVar24 = (((ulong)(*(uint *)(puVar19 + 0x12) >> 0x18) | (ulong)(byte)puVar19[0x14] << 8 |
            (ulong)*(byte *)((long)puVar19 + 0x29) << 0x10) >> 3) + (ulong)uVar32 * 0x215d1 +
           (long)(int)uVar40 * -0xa6f7d + ((long)uVar36 >> 0x15);
  uVar39 = lVar34 + 0x100000;
  lVar7 = ((ulong)(*(uint *)(puVar19 + 0x16) >> 5) & 0x1fffff) + ((long)uVar39 >> 0x15);
  uVar40 = lVar26 + 0x100000;
  uVar43 = lVar6 + 0x100000;
  lVar23 = (lVar23 - (uVar41 & 0xffffffffffe00000)) + ((long)uVar43 >> 0x15);
  uVar41 = lVar37 + 0x100000;
  lVar33 = (lVar33 - (uVar36 & 0xffffffffffe00000)) + ((long)uVar41 >> 0x15);
  lVar37 = lVar37 - (uVar41 & 0xffffffffffe00000);
  uVar41 = lVar24 + 0x100000;
  lVar34 = (lVar34 - (uVar39 & 0xffffffffffe00000)) + ((long)uVar41 >> 0x15);
  lVar24 = lVar24 - (uVar41 & 0xffffffffffe00000);
  lVar25 = (lVar44 - (uVar1 & 0xfffffe00000)) + (uVar40 >> 0x15) + lVar7 * -0xf39ad +
           lVar34 * 0x215d1 + lVar24 * -0xa6f7d;
  lVar22 = (lVar20 - (uVar30 & 0x7ffffe00000)) + lVar7 * 0x72d18 + lVar34 * 0x9fb67 +
           lVar24 * -0xf39ad + lVar33 * 0x215d1 + lVar37 * -0xa6f7d;
  uVar30 = lVar31 + 0x100000;
  lVar20 = ((lVar42 + lVar7 * -0xa6f7d) - (uVar2 & 0xffffffffffe00000)) + ((long)uVar30 >> 0x15);
  lVar38 = ((ulong)*puVar19 | ((ulong)(byte)puVar19[1] & 0x1f) << 0x10) + lVar23 * 0xa2c13;
  lVar29 = ((ulong)((*(uint *)(puVar19 + 1) >> 0x18 | (uint)(byte)puVar19[3] << 8 |
                    (uint)*(byte *)((long)puVar19 + 7) << 0x10) >> 2) & 0x1fffff) + lVar33 * 0xa2c13
           + lVar37 * 0x72d18 + lVar23 * 0x9fb67;
  lVar27 = ((ulong)(*(uint *)(puVar19 + 5) >> 4) & 0x1fffff) + lVar34 * 0xa2c13 + lVar24 * 0x72d18 +
           lVar33 * 0x9fb67 + lVar37 * -0xf39ad + lVar23 * 0x215d1;
  uVar1 = lVar38 + 0x100000;
  lVar42 = ((ulong)(*(uint *)(puVar19 + 1) >> 5) & 0x1fffff) + lVar37 * 0xa2c13 + lVar23 * 0x72d18 +
           ((long)uVar1 >> 0x15);
  uVar2 = lVar22 + 0x100000;
  lVar26 = (lVar26 - (uVar40 & 0x7fffffffffe00000)) + lVar7 * 0x9fb67 + lVar34 * -0xf39ad +
           lVar24 * 0x215d1 + lVar33 * -0xa6f7d + ((long)uVar2 >> 0x15);
  uVar41 = lVar25 + 0x100000;
  lVar31 = ((lVar31 + lVar7 * 0x215d1) - (uVar30 & 0xffffffffffe00000)) + lVar34 * -0xa6f7d +
           ((long)uVar41 >> 0x15);
  uVar30 = lVar20 + 0x100000;
  lVar6 = (lVar6 - (uVar43 & 0xffffffffffe00000)) + ((long)uVar30 >> 0x15);
  uVar36 = lVar42 + 0x100000;
  uVar39 = lVar26 + 0x100000;
  uVar40 = lVar31 + 0x100000;
  uVar43 = lVar6 + 0x100000;
  lVar21 = (long)uVar43 >> 0x15;
  uVar3 = lVar29 + 0x100000;
  lVar44 = ((ulong)(*(uint *)((long)puVar19 + 7) >> 7) & 0x1fffff) + lVar24 * 0xa2c13 +
           lVar33 * 0x72d18 + lVar37 * 0x9fb67 + lVar23 * -0xf39ad + ((long)uVar3 >> 0x15);
  uVar4 = lVar44 + 0x100000;
  uVar5 = lVar27 + 0x100000;
  lVar37 = ((ulong)((*(uint *)(puVar19 + 5) >> 0x18 | (uint)(byte)puVar19[7] << 8 |
                    (uint)*(byte *)((long)puVar19 + 0xf) << 0x10) >> 1) & 0x1fffff) +
           lVar7 * 0xa2c13 + lVar34 * 0x72d18 + lVar24 * 0x9fb67 + lVar33 * -0xf39ad +
           lVar37 * 0x215d1 + lVar23 * -0xa6f7d + ((long)uVar5 >> 0x15);
  uVar35 = (lVar38 - (uVar1 & 0xffffffffffe00000)) + lVar21 * 0xa2c13;
  uVar1 = lVar37 + 0x100000;
  uVar8 = ((lVar42 + lVar21 * 0x72d18) - (uVar36 & 0xffffffffffe00000)) + ((long)uVar35 >> 0x15);
  uVar36 = ((lVar29 + lVar21 * 0x9fb67) - (uVar3 & 0xffffffffffe00000)) + ((long)uVar36 >> 0x15) +
           ((long)uVar8 >> 0x15);
  uVar3 = ((lVar44 + lVar21 * -0xf39ad) - (uVar4 & 0xffffffffffe00000)) + ((long)uVar36 >> 0x15);
  uVar4 = ((lVar27 + lVar21 * 0x215d1) - (uVar5 & 0xffffffffffe00000)) + ((long)uVar4 >> 0x15) +
          ((long)uVar3 >> 0x15);
  uVar5 = ((lVar37 + lVar21 * -0xa6f7d) - (uVar1 & 0xffffffffffe00000)) + ((long)uVar4 >> 0x15);
  uVar1 = (lVar22 - (uVar2 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15) + ((long)uVar5 >> 0x15);
  uVar2 = (lVar26 - (uVar39 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15);
  uVar41 = (lVar25 - (uVar41 & 0xffffffffffe00000)) + ((long)uVar39 >> 0x15) + ((long)uVar2 >> 0x15)
  ;
  uVar39 = (lVar31 - (uVar40 & 0xffffffffffe00000)) + ((long)uVar41 >> 0x15);
  uVar30 = (lVar20 - (uVar30 & 0xffffffffffe00000)) + ((long)uVar40 >> 0x15) +
           ((long)uVar39 >> 0x15);
  uVar40 = (lVar6 - (uVar43 & 0xffffffffffe00000)) + ((long)uVar30 >> 0x15);
  lVar26 = (long)uVar40 >> 0x15;
  lVar31 = (uVar35 & 0x1fffff) + lVar26 * 0xa2c13;
  *(char *)((long)puVar19 + 1) = (char)((ulong)lVar31 >> 8);
  uVar43 = (uVar8 & 0x1fffff) + lVar26 * 0x72d18 + (lVar31 >> 0x15);
  *(char *)puVar19 = (char)lVar31;
  *(byte *)(puVar19 + 1) = (byte)((ulong)lVar31 >> 0x10) & 0x1f | (byte)((uint)uVar43 << 5);
  *(char *)((long)puVar19 + 3) = (char)(uVar43 >> 3);
  *(char *)(puVar19 + 2) = (char)(uVar43 >> 0xb);
  uVar36 = (uVar36 & 0x1fffff) + lVar26 * 0x9fb67 + ((long)uVar43 >> 0x15);
  *(byte *)((long)puVar19 + 5) = (byte)((uint)uVar43 >> 0x13) & 3 | (byte)((uint)uVar36 << 2);
  *(char *)(puVar19 + 3) = (char)(uVar36 >> 6);
  uVar43 = (uVar3 & 0x1fffff) + lVar26 * -0xf39ad + ((long)uVar36 >> 0x15);
  *(byte *)((long)puVar19 + 7) = (byte)((uint)uVar36 >> 0xe) & 0x7f | (byte)((uint)uVar43 << 7);
  *(char *)(puVar19 + 4) = (char)(uVar43 >> 1);
  *(char *)((long)puVar19 + 9) = (char)(uVar43 >> 9);
  uVar36 = (uVar4 & 0x1fffff) + lVar26 * 0x215d1 + ((long)uVar43 >> 0x15);
  *(byte *)(puVar19 + 5) = (byte)((uint)uVar43 >> 0x11) & 0xf | (byte)((uint)uVar36 << 4);
  *(char *)((long)puVar19 + 0xb) = (char)(uVar36 >> 4);
  *(char *)(puVar19 + 6) = (char)(uVar36 >> 0xc);
  uVar43 = (uVar5 & 0x1fffff) + lVar26 * -0xa6f7d + ((long)uVar36 >> 0x15);
  *(byte *)((long)puVar19 + 0xd) = (byte)((uint)uVar36 >> 0x14) & 1 | (byte)((uint)uVar43 << 1);
  *(char *)(puVar19 + 7) = (char)(uVar43 >> 7);
  uVar1 = (uVar1 & 0x1fffff) + ((long)uVar43 >> 0x15);
  *(byte *)((long)puVar19 + 0xf) = (byte)((uint)uVar43 >> 0xf) & 0x3f | (byte)((uint)uVar1 << 6);
  *(char *)(puVar19 + 8) = (char)(uVar1 >> 2);
  *(char *)((long)puVar19 + 0x11) = (char)(uVar1 >> 10);
  uVar2 = (uVar2 & 0x1fffff) + ((long)uVar1 >> 0x15);
  *(byte *)(puVar19 + 9) = (byte)((uint)uVar1 >> 0x12) & 7 | (byte)((int)uVar2 << 3);
  *(char *)((long)puVar19 + 0x13) = (char)(uVar2 >> 5);
  lVar26 = (uVar41 & 0x1fffff) + ((long)uVar2 >> 0x15);
  *(char *)(puVar19 + 10) = (char)(uVar2 >> 0xd);
  *(char *)(puVar19 + 0xb) = (char)((ulong)lVar26 >> 8);
  uVar1 = (uVar39 & 0x1fffff) + (lVar26 >> 0x15);
  *(char *)((long)puVar19 + 0x15) = (char)lVar26;
  *(byte *)((long)puVar19 + 0x17) = (byte)((ulong)lVar26 >> 0x10) & 0x1f | (byte)((uint)uVar1 << 5);
  *(char *)(puVar19 + 0xc) = (char)(uVar1 >> 3);
  *(char *)((long)puVar19 + 0x19) = (char)(uVar1 >> 0xb);
  uVar30 = (uVar30 & 0x1fffff) + ((long)uVar1 >> 0x15);
  *(byte *)(puVar19 + 0xd) = (byte)((uint)uVar1 >> 0x13) & 3 | (byte)((uint)uVar30 << 2);
  *(char *)((long)puVar19 + 0x1b) = (char)(uVar30 >> 6);
  uVar1 = (uVar40 & 0x1fffff) + ((long)uVar30 >> 0x15);
  *(byte *)(puVar19 + 0xe) = (byte)((uint)uVar30 >> 0xe) & 0x7f | (byte)((int)uVar1 << 7);
  *(char *)((long)puVar19 + 0x1d) = (char)(uVar1 >> 1);
  *(char *)(puVar19 + 0xf) = (char)(uVar1 >> 9);
  *(char *)((long)puVar19 + 0x1f) = (char)(uVar1 >> 0x11);
  return;
}

