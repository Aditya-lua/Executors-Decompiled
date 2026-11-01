
void FUN_002b8eb4(undefined1 *param_1)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  uint uVar24;
  uint uVar25;
  uint uVar26;
  uint uVar27;
  ulong *puVar28;
  uint *puVar29;
  ulong *puVar30;
  ulong uVar31;
  ulong uVar32;
  undefined1 (*pauVar33) [16];
  long lVar34;
  long lVar35;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong *unaff_x21;
  undefined1 (*unaff_x22) [16];
  long unaff_x24;
  uint unaff_w25;
  ulong unaff_x27;
  long unaff_x29;
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined8 in_stack_00000008;
  undefined8 *in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 in_stack_00000020 [16];
  undefined1 in_stack_00000030 [16];
  undefined1 (*in_stack_00000040) [16];
  long in_stack_00000048;
  undefined1 uStack0000000000000050;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  
  do {
    func_0x002b8574(param_1);
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    func_0x002b91ec(&uStack0000000000000050);
    func_0x003074c0();
    func_0x003074c0();
    func_0x003074c0();
    uVar32 = unaff_x27;
    func_0x003074c0();
    unaff_w25 = unaff_w25 - 1;
    if (0x3f < unaff_w25) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return;
      }
LAB_002b8f9c:
      auVar41 = ___stack_chk_fail();
      puVar29 = auVar41._8_8_;
      puVar28 = auVar41._0_8_;
      bVar17 = *(byte *)((long)puVar29 + 0x1f);
      if ((char)bVar17 < '\0') {
        auVar41 = func_0x0079e5a4();
        puVar30 = auVar41._8_8_;
        puVar28 = auVar41._0_8_;
        uVar31 = (uVar32 & 0xffffffff) - 1;
        uVar32 = -(uVar32 & 0xffffffff);
        *puVar28 = *puVar30 & uVar32 | *puVar28 & uVar31;
        puVar28[1] = puVar30[1] & uVar32 | puVar28[1] & uVar31;
        puVar28[2] = puVar30[2] & uVar32 | puVar28[2] & uVar31;
        puVar28[3] = puVar30[3] & uVar32 | puVar28[3] & uVar31;
        puVar28[4] = puVar30[4] & uVar32 | puVar28[4] & uVar31;
        puVar28[5] = puVar30[5] & uVar32 | puVar28[5] & uVar31;
        puVar28[6] = puVar30[6] & uVar32 | puVar28[6] & uVar31;
        puVar28[7] = puVar30[7] & uVar32 | puVar28[7] & uVar31;
        puVar28[8] = puVar30[8] & uVar32 | puVar28[8] & uVar31;
        puVar28[9] = puVar30[9] & uVar32 | puVar28[9] & uVar31;
        puVar28[10] = puVar30[10] & uVar32 | puVar28[10] & uVar31;
        puVar28[0xb] = puVar30[0xb] & uVar32 | puVar28[0xb] & uVar31;
        puVar28[0xc] = puVar30[0xc] & uVar32 | puVar28[0xc] & uVar31;
        puVar28[0xd] = puVar30[0xd] & uVar32 | puVar28[0xd] & uVar31;
        puVar28[0xe] = puVar30[0xe] & uVar32 | puVar28[0xe] & uVar31;
        return;
      }
      bVar4 = *(byte *)((long)puVar29 + 0x1e);
      bVar5 = *(byte *)((long)puVar29 + 6);
      uVar24 = puVar29[3];
      bVar6 = *(byte *)((long)puVar29 + 0x1d);
      bVar7 = *(byte *)((long)puVar29 + 0xb);
      uVar25 = puVar29[7];
      bVar8 = *(byte *)((long)puVar29 + 10);
      bVar9 = *(byte *)((long)puVar29 + 0x1b);
      bVar10 = *(byte *)((long)puVar29 + 9);
      bVar11 = *(byte *)((long)puVar29 + 0x1a);
      uVar26 = puVar29[2];
      uVar3 = *(uint *)((long)puVar29 + 0x16);
      bVar12 = *(byte *)((long)puVar29 + 7);
      bVar13 = *(byte *)((long)puVar29 + 0x15);
      uVar27 = puVar29[5];
      uVar2 = puVar29[4];
      bVar14 = *(byte *)((long)puVar29 + 0xf);
      bVar15 = *(byte *)((long)puVar29 + 0xe);
      bVar16 = *(byte *)((long)puVar29 + 0xd);
      *puVar28 = (ulong)*(byte *)((long)puVar29 + 5) << 0x28 | ((ulong)bVar5 & 7) << 0x30 |
                 (ulong)*puVar29 | (ulong)(byte)puVar29[1] << 0x20;
      puVar28[1] = ((ulong)(byte)uVar24 & 0x3f) << 0x2d | (ulong)bVar7 << 0x25 |
                   (ulong)bVar8 << 0x1d | (ulong)bVar10 << 0x15 | (ulong)(byte)uVar26 << 0xd |
                   (ulong)bVar12 << 5 | (ulong)(bVar5 >> 3);
      puVar28[2] = ((ulong)uVar2 & 0x1ffffff) << 0x1a | (ulong)bVar14 << 0x12 | (ulong)bVar15 << 10
                   | (ulong)bVar16 << 2 | (ulong)(byte)((byte)uVar24 >> 6);
      puVar28[3] = ((ulong)uVar3 & 0xfffffff) << 0x17 | (ulong)bVar13 << 0xf |
                   (ulong)(byte)uVar27 << 7 | (ulong)(uVar2 >> 0x19);
      puVar28[4] = (ulong)bVar17 << 0x2c | (ulong)bVar4 << 0x24 | (ulong)bVar6 << 0x1c |
                   (ulong)(byte)uVar25 << 0x14 | (ulong)bVar9 << 0xc | (ulong)bVar11 << 4 |
                   (ulong)(uVar3 >> 0x1c);
      return;
    }
    uVar2 = unaff_w25 & 7;
    pbVar1 = (byte *)(in_stack_00000048 + (ulong)(unaff_w25 >> 3));
    lVar34 = 1;
    auVar36 = ZEXT816(0);
    auVar38 = ZEXT816(0);
    auVar39 = ZEXT816(0);
    auVar40 = ZEXT816(0);
    pauVar33 = in_stack_00000040;
    auVar41 = in_stack_00000020;
    auVar37 = in_stack_00000030;
    do {
      lVar35 = (long)(unaff_x24 +
                     ((ulong)((uint)lVar34 ^
                             (*pbVar1 >> (ulong)uVar2 & 1 | (pbVar1[8] >> (ulong)uVar2 & 1) << 1 |
                              (pbVar1[0x10] >> (ulong)uVar2 & 1) << 2 |
                             (pbVar1[0x18] >> (ulong)uVar2 & 1) << 3)) << 0x20)) >> 0x3f;
      auVar18._8_8_ = lVar35;
      auVar18._0_8_ = lVar35;
      auVar41 = auVar41 ^ (auVar41 ^ pauVar33[-4]) & auVar18;
      auVar19._8_8_ = lVar35;
      auVar19._0_8_ = lVar35;
      auVar36 = auVar36 ^ (auVar36 ^ pauVar33[-3]) & auVar19;
      auVar20._8_8_ = lVar35;
      auVar20._0_8_ = lVar35;
      auVar37 = auVar37 ^ (auVar37 ^ pauVar33[-2]) & auVar20;
      auVar21._8_8_ = lVar35;
      auVar21._0_8_ = lVar35;
      auVar38 = auVar38 ^ (auVar38 ^ pauVar33[-1]) & auVar21;
      auVar22._8_8_ = lVar35;
      auVar22._0_8_ = lVar35;
      auVar39 = auVar39 ^ (auVar39 ^ *pauVar33) & auVar22;
      auVar23._8_8_ = lVar35;
      auVar23._0_8_ = lVar35;
      auVar40 = auVar40 ^ (auVar40 ^ pauVar33[1]) & auVar23;
      lVar34 = lVar34 + 1;
      pauVar33 = (undefined1 (*) [16])(pauVar33[7] + 8);
    } while (lVar34 != 0x10);
    in_stack_00000198 = auVar41._8_8_;
    in_stack_00000190 = auVar41._0_8_;
    in_stack_000001a8 = auVar36._8_8_;
    in_stack_000001a0 = auVar36._0_8_;
    in_stack_000001b8 = auVar37._8_8_;
    in_stack_000001b0 = auVar37._0_8_;
    in_stack_000001c8 = auVar38._8_8_;
    in_stack_000001c0 = auVar38._0_8_;
    in_stack_000001d8 = auVar39._8_8_;
    in_stack_000001d0 = auVar39._0_8_;
    in_stack_000001e8 = auVar40._8_8_;
    in_stack_000001e0 = auVar40._0_8_;
    if ((((unaff_x19 < *unaff_x21) || (unaff_x19 < unaff_x20[6])) || (unaff_x19 < unaff_x20[7])) ||
       ((unaff_x19 < unaff_x20[8] || (unaff_x19 < unaff_x20[9])))) {
      func_0x0079e4ec();
code_r0x002b8f98:
      func_0x0079e55c();
      goto LAB_002b8f9c;
    }
    if (((unaff_x19 < *unaff_x20) || (unaff_x19 < unaff_x20[1])) ||
       ((unaff_x19 < unaff_x20[2] || ((unaff_x19 < unaff_x20[3] || (unaff_x19 < unaff_x20[4]))))))
    goto code_r0x002b8f98;
    in_stack_000000f0 = *unaff_x20 + *unaff_x21;
    in_stack_000000f8 = unaff_x20[1] + unaff_x20[6];
    in_stack_00000100 = unaff_x20[2] + unaff_x20[7];
    in_stack_00000108 = unaff_x20[3] + unaff_x20[8];
    in_stack_00000110 = unaff_x20[4] + unaff_x20[9];
    func_0x002b81b4(in_stack_00000018);
    auVar41 = *unaff_x22;
    auVar37 = unaff_x22[1];
    in_stack_00000010[1] = auVar41._8_8_;
    *in_stack_00000010 = auVar41._0_8_;
    in_stack_00000010[3] = auVar37._8_8_;
    in_stack_00000010[2] = auVar37._0_8_;
    in_stack_00000010[4] = *(undefined8 *)unaff_x22[2];
    func_0x003074c0(in_stack_00000008);
    param_1 = &uStack0000000000000050;
  } while( true );
}

