
/* WARNING: Possible PIC construction at 0x0071e07c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071df00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071e260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071e304: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0071e264) */
/* WARNING: Removing unreachable block (ram,0x0071e26c) */
/* WARNING: Removing unreachable block (ram,0x0071e2ac) */
/* WARNING: Removing unreachable block (ram,0x0071e298) */
/* WARNING: Removing unreachable block (ram,0x0071e2b8) */
/* WARNING: Removing unreachable block (ram,0x0071e2a0) */
/* WARNING: Removing unreachable block (ram,0x0071e2c0) */
/* WARNING: Removing unreachable block (ram,0x0071df04) */
/* WARNING: Removing unreachable block (ram,0x0071df0c) */
/* WARNING: Removing unreachable block (ram,0x0071dfbc) */
/* WARNING: Removing unreachable block (ram,0x0071df2c) */
/* WARNING: Removing unreachable block (ram,0x0071dfc8) */
/* WARNING: Removing unreachable block (ram,0x0071df34) */
/* WARNING: Removing unreachable block (ram,0x0071dfd0) */
/* WARNING: Removing unreachable block (ram,0x0071e080) */
/* WARNING: Removing unreachable block (ram,0x0071e308) */

uint * FUN_0071e0d4(void)

{
  byte *pbVar1;
  undefined4 uVar2;
  undefined1 uVar4;
  undefined1 uVar3;
  int iVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long lVar8;
  uint *puVar9;
  uint *puVar10;
  uint uVar11;
  uint in_w8;
  undefined8 *puVar12;
  long lVar13;
  long *extraout_x8;
  long *plVar14;
  ulong uVar15;
  long extraout_x9;
  uint *puVar16;
  uint *puVar17;
  ulong uVar18;
  byte *pbVar19;
  long lVar20;
  ulong uVar21;
  uint *puVar22;
  long unaff_x19;
  ulong *unaff_x20;
  ulong *puVar23;
  byte *unaff_x21;
  undefined8 uVar24;
  uint *unaff_x22;
  byte *unaff_x23;
  byte *pbVar25;
  undefined8 *puVar26;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined1 *unaff_x29;
  undefined *puVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 *in_stack_00000000;
  uint uStack0000000000000014;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 *in_stack_00000070;
  undefined8 *in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 in_stack_000000d8;
  char cStack00000000000000e0;
  undefined7 uStack00000000000000e1;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000128;
  undefined8 uStack0000000000000130;
  undefined4 uStack0000000000000138;
  undefined4 uStack000000000000013c;
  uint uStack0000000000000140;
  undefined4 uStack0000000000000144;
  undefined4 uStack0000000000000148;
  undefined4 uStack000000000000014c;
  undefined4 uStack0000000000000150;
  undefined1 uStack0000000000000154;
  undefined7 uStack0000000000000155;
  undefined1 uStack000000000000015c;
  undefined8 in_stack_00000160;
  undefined8 in_stack_000001ef;
  long lStack_50;
  ulong uStack_48;
  undefined8 *puStack_40;
  byte *pbStack_38;
  uint *puStack_30;
  byte *pbStack_28;
  ulong *puStack_20;
  undefined1 auStack_6 [6];
  
  auVar34._8_8_ = unaff_x22;
  auVar34._0_8_ = unaff_x19;
code_r0x0071e0d4:
  *(undefined8 *)(unaff_x29 + -0xf0) = 0;
  *(undefined8 *)(unaff_x29 + -0xe8) = 0;
  uStack0000000000000014 = in_w8;
code_r0x0071e0dc:
  do {
    func_0x0071af20(&uStack00000000000000d0);
    in_stack_00000020 = *(undefined8 *)unaff_x21;
    uStack0000000000000130._0_4_ = *(undefined4 *)(unaff_x29 + -0xe0);
    *(undefined8 *)((long)unaff_x24 + 4) = *(undefined8 *)((long)unaff_x24 + 0x54);
    if (*unaff_x22 == 0x5d) {
      func_0x00710d48();
    }
    else {
      func_0x00721808();
      func_0x007244d4();
    }
    in_stack_00000018 = *(undefined8 *)unaff_x21;
    if (*unaff_x22 == 0x3a) {
      func_0x00710d48();
    }
    else {
      func_0x0072447c();
    }
    uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
    uStack0000000000000138 = (undefined4)*(undefined8 *)(unaff_x21 + 8);
    uStack000000000000013c = (undefined4)((ulong)*(undefined8 *)(unaff_x21 + 8) >> 0x20);
    uStack0000000000000130._0_4_ = (uint)*(undefined8 *)unaff_x21;
    uStack0000000000000130._4_4_ = (undefined4)((ulong)*(undefined8 *)unaff_x21 >> 0x20);
    if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
      func_0x0071f5c8();
      *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    }
    uVar7 = func_0x0071cf0c();
    puVar23 = uStack00000000000000d0;
    *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    if ((cStack00000000000000e0 != '\0') &&
       (lVar8 = _memchr(uStack00000000000000d0,0,in_stack_000000d8), lVar8 == 0)) {
      uVar24 = *in_stack_00000040;
      in_stack_00000080[1] = in_stack_00000040[1];
      *in_stack_00000080 = uVar24;
      uStack0000000000000130._0_4_ = (uint)puVar23;
      uStack0000000000000130._4_4_ = (undefined4)((ulong)puVar23 >> 0x20);
      uStack0000000000000148 = (undefined4)uVar7;
      uStack000000000000014c = (undefined4)((ulong)uVar7 >> 0x20);
      uStack0000000000000150 = (int)unaff_x26;
      uStack0000000000000154 = (char)unaff_x25;
      *in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x78);
      unaff_x24 = &uStack0000000000000130;
      *(undefined8 *)((long)in_stack_00000078 + 7) = in_stack_000001ef;
      in_stack_00000160._4_1_ = (char)unaff_x23;
      auVar34._8_8_ = &uStack0000000000000130;
      auVar34._0_8_ = unaff_x29 + -0x90;
code_r0x0071e744:
      puVar6 = auVar34._8_8_;
      puVar22 = auVar34._0_8_;
      unaff_x29 = auStack_6 + -10;
      puVar23 = *(ulong **)puVar22;
      pbVar19 = (byte *)puVar23[1];
      if (pbVar19 < (byte *)puVar23[2]) {
        uVar24 = puVar6[1];
        uVar7 = *puVar6;
        uVar29 = puVar6[3];
        uVar28 = puVar6[2];
        uVar31 = puVar6[5];
        uVar30 = puVar6[4];
        *(undefined8 *)(pbVar19 + 0x30) = puVar6[6];
        *(undefined8 *)(pbVar19 + 0x18) = uVar29;
        *(undefined8 *)(pbVar19 + 0x10) = uVar28;
        *(undefined8 *)(pbVar19 + 0x28) = uVar31;
        *(undefined8 *)(pbVar19 + 0x20) = uVar30;
        *(undefined8 *)(pbVar19 + 8) = uVar24;
        *(undefined8 *)pbVar19 = uVar7;
        puVar10 = (uint *)(pbVar19 + 0x38);
        puVar9 = puVar22;
        goto code_r0x0071e89c;
      }
      pbVar25 = (byte *)*puVar23;
      lVar8 = (long)pbVar19 - (long)pbVar25 >> 3;
      puVar12 = (undefined8 *)(lVar8 * 0x6db6db6db6db6db7);
      uVar18 = (long)puVar12 + 1;
      lStack_50 = unaff_x26;
      uStack_48 = unaff_x25;
      puStack_40 = unaff_x24;
      pbStack_38 = unaff_x23;
      puStack_30 = unaff_x22;
      pbStack_28 = unaff_x21;
      puStack_20 = unaff_x20;
      if (uVar18 < 0x492492492492493) {
        lVar13 = (long)puVar23[2] - (long)pbVar25 >> 3;
        uVar21 = lVar13 * -0x2492492492492492;
        if (uVar21 <= uVar18) {
          uVar21 = uVar18;
        }
        if (0x249249249249248 < (ulong)(lVar13 * 0x6db6db6db6db6db7)) {
          uVar21 = 0x492492492492492;
        }
        if (uVar21 == 0) {
          puVar9 = (uint *)0x0;
        }
        else {
          if (0x492492492492492 < uVar21) goto code_r0x0071e8cc;
          puVar9 = (uint *)__Znwm(uVar21 * 0x38);
        }
        puVar17 = puVar9 + lVar8 * 2;
        uVar7 = *puVar6;
        uVar28 = puVar6[3];
        uVar24 = puVar6[2];
        *(undefined8 *)(puVar17 + 2) = puVar6[1];
        *(undefined8 *)puVar17 = uVar7;
        *(undefined8 *)(puVar17 + 6) = uVar28;
        *(undefined8 *)(puVar17 + 4) = uVar24;
        uVar7 = puVar6[4];
        *(undefined8 *)(puVar17 + 10) = puVar6[5];
        *(undefined8 *)(puVar17 + 8) = uVar7;
        *(undefined8 *)(puVar17 + 0xc) = puVar6[6];
        puVar10 = puVar17 + 0xe;
        if (pbVar19 != pbVar25) {
          do {
            uVar24 = *(undefined8 *)(pbVar19 + -0x30);
            uVar7 = *(undefined8 *)(pbVar19 + -0x38);
            uVar29 = *(undefined8 *)(pbVar19 + -0x20);
            uVar28 = *(undefined8 *)(pbVar19 + -0x28);
            uVar31 = *(undefined8 *)(pbVar19 + -0x10);
            uVar30 = *(undefined8 *)(pbVar19 + -0x18);
            pbVar1 = pbVar19 + -8;
            pbVar19 = pbVar19 + -0x38;
            *(undefined8 *)(puVar17 + -2) = *(undefined8 *)pbVar1;
            *(undefined8 *)(puVar17 + -4) = uVar31;
            *(undefined8 *)(puVar17 + -6) = uVar30;
            *(undefined8 *)(puVar17 + -8) = uVar29;
            *(undefined8 *)(puVar17 + -10) = uVar28;
            *(undefined8 *)(puVar17 + -0xc) = uVar24;
            *(undefined8 *)(puVar17 + -0xe) = uVar7;
            puVar17 = puVar17 + -0xe;
          } while (pbVar19 != pbVar25);
          pbVar19 = (byte *)*puVar23;
        }
        *puVar23 = (ulong)puVar17;
        puVar23[1] = (ulong)puVar10;
        puVar23[2] = (ulong)(puVar9 + uVar21 * 0xe);
        if (pbVar19 != (byte *)0x0) {
          puVar9 = (uint *)__ZdlPv(pbVar19);
        }
code_r0x0071e89c:
        puVar23[1] = (ulong)puVar10;
        *(long *)(puVar22 + 4) = *(long *)(puVar22 + 4) + 1;
        return puVar9;
      }
      func_0x00017f90(puVar23);
      uVar21 = unaff_x25;
code_r0x0071e8cc:
      unaff_x25 = uVar21;
      puVar27 = &DAT_0071e8d0;
      auVar35 = func_0x00017514();
      register0x00000008 = (BADSPACEBASE *)&lStack_50;
      unaff_x21 = pbVar19;
      unaff_x23 = pbVar25;
      unaff_x24 = puVar12;
code_r0x0071e8d0:
      puVar12 = auVar35._8_8_;
      puVar22 = auVar35._0_8_;
      *(long *)((long)register0x00000008 + -0x50) = unaff_x26;
      *(ulong *)((long)register0x00000008 + -0x48) = unaff_x25;
      *(undefined8 **)((long)register0x00000008 + -0x40) = unaff_x24;
      *(byte **)((long)register0x00000008 + -0x38) = unaff_x23;
      *(long *)((long)register0x00000008 + -0x30) = auVar34._8_8_;
      *(byte **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = puVar23;
      *(long *)((long)register0x00000008 + -0x18) = auVar34._0_8_;
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar27;
      puVar23 = *(ulong **)puVar22;
      puVar6 = (undefined8 *)puVar23[1];
      if (puVar6 < (undefined8 *)puVar23[2]) {
        uVar24 = puVar12[1];
        uVar7 = *puVar12;
        uVar29 = puVar12[3];
        uVar28 = puVar12[2];
        uVar30 = puVar12[4];
        uVar32 = puVar12[7];
        uVar31 = puVar12[6];
        puVar6[5] = puVar12[5];
        puVar6[4] = uVar30;
        puVar6[7] = uVar32;
        puVar6[6] = uVar31;
        puVar6[1] = uVar24;
        *puVar6 = uVar7;
        puVar6[3] = uVar29;
        puVar6[2] = uVar28;
        puVar9 = (uint *)(puVar6 + 8);
        puVar10 = puVar22;
      }
      else {
        puVar26 = (undefined8 *)*puVar23;
        lVar8 = (long)puVar6 - (long)puVar26 >> 6;
        uVar18 = lVar8 + 1;
        if (uVar18 >> 0x3a != 0) {
          func_0x00017f90(puVar23);
code_r0x0071e9f8:
          lVar8 = func_0x00017514();
          iVar5 = *(int *)(lVar8 + 0x80);
          uVar18 = 0x100000000;
          if (iVar5 != 0x3b) {
            uVar18 = 0;
          }
          uVar21 = 0x100000000;
          if (iVar5 != 0x2c) {
            uVar21 = uVar18;
          }
          uVar18 = 0;
          if (iVar5 != 0x2c) {
            uVar18 = (ulong)(iVar5 == 0x3b);
          }
          return (uint *)(uVar18 | uVar21);
        }
        uVar15 = (long)puVar23[2] - (long)puVar26;
        uVar21 = (long)uVar15 >> 5;
        if (uVar21 <= uVar18) {
          uVar21 = uVar18;
        }
        if (0x7fffffffffffffbf < uVar15) {
          uVar21 = 0x3ffffffffffffff;
        }
        if (uVar21 == 0) {
          puVar10 = (uint *)0x0;
        }
        else {
          if (uVar21 >> 0x3a != 0) goto code_r0x0071e9f8;
          puVar10 = (uint *)__Znwm(uVar21 << 6);
        }
        puVar17 = puVar10 + lVar8 * 0x10;
        uVar7 = *puVar12;
        uVar28 = puVar12[3];
        uVar24 = puVar12[2];
        *(undefined8 *)(puVar17 + 2) = puVar12[1];
        *(undefined8 *)puVar17 = uVar7;
        *(undefined8 *)(puVar17 + 6) = uVar28;
        *(undefined8 *)(puVar17 + 4) = uVar24;
        uVar7 = puVar12[4];
        uVar28 = puVar12[7];
        uVar24 = puVar12[6];
        *(undefined8 *)(puVar17 + 10) = puVar12[5];
        *(undefined8 *)(puVar17 + 8) = uVar7;
        *(undefined8 *)(puVar17 + 0xe) = uVar28;
        *(undefined8 *)(puVar17 + 0xc) = uVar24;
        puVar9 = puVar17 + 0x10;
        puVar16 = puVar17;
        if (puVar6 != puVar26) {
          do {
            uVar24 = puVar6[-7];
            uVar7 = puVar6[-8];
            uVar29 = puVar6[-5];
            uVar28 = puVar6[-6];
            puVar12 = puVar6 + -3;
            uVar30 = puVar6[-4];
            uVar32 = puVar6[-1];
            uVar31 = puVar6[-2];
            puVar6 = puVar6 + -8;
            *(undefined8 *)(puVar16 + -6) = *puVar12;
            *(undefined8 *)(puVar16 + -8) = uVar30;
            *(undefined8 *)(puVar16 + -2) = uVar32;
            *(undefined8 *)(puVar16 + -4) = uVar31;
            puVar17 = puVar16 + -0x10;
            *(undefined8 *)(puVar16 + -0xe) = uVar24;
            *(undefined8 *)puVar17 = uVar7;
            *(undefined8 *)(puVar16 + -10) = uVar29;
            *(undefined8 *)(puVar16 + -0xc) = uVar28;
            puVar16 = puVar17;
          } while (puVar6 != puVar26);
          puVar6 = (undefined8 *)*puVar23;
        }
        *puVar23 = (ulong)puVar17;
        puVar23[1] = (ulong)puVar9;
        puVar23[2] = (ulong)(puVar10 + uVar21 * 0x10);
        if (puVar6 != (undefined8 *)0x0) {
          puVar10 = (uint *)__ZdlPv(puVar6);
        }
      }
      puVar23[1] = (ulong)puVar9;
      *(long *)(puVar22 + 4) = *(long *)(puVar22 + 4) + 1;
      return puVar10;
    }
    func_0x007181dc();
    unaff_x24 = &uStack0000000000000130;
code_r0x0071e1f4:
    uVar11 = *unaff_x22;
    if ((uVar11 != 0x2c) && (uVar11 != 0x3b)) {
      if (uVar11 != 0x7d) {
        unaff_x21 = (byte *)0x0;
        uVar7 = *(undefined8 *)(unaff_x19 + 0x8c);
        goto code_r0x0071e620;
      }
code_r0x0071dbd0:
      unaff_x21 = (byte *)0x0;
      uVar7 = *(undefined8 *)(unaff_x19 + 0x8c);
code_r0x0071dbd8:
      func_0x00710d48();
code_r0x0071dbe0:
      uVar24 = *(undefined8 *)(unaff_x19 + 0xd8);
      uStack0000000000000130._0_4_ = (uint)in_stack_00000060;
      uStack0000000000000130._4_4_ = (undefined4)((ulong)in_stack_00000060 >> 0x20);
      uStack0000000000000138 = (undefined4)uVar7;
      uStack000000000000013c = (undefined4)((ulong)uVar7 >> 0x20);
      unaff_x23 = *(byte **)(unaff_x29 + -0x80);
      if (unaff_x23 == (byte *)0x0) {
        puVar6 = (undefined8 *)0x0;
      }
      else {
        unaff_x24 = *(undefined8 **)(unaff_x29 + -0x88);
        unaff_x25 = **(ulong **)(unaff_x29 + -0x90);
        puVar6 = (undefined8 *)func_0x00704c24(uVar24,(long)unaff_x23 * 0x38);
        puVar12 = (undefined8 *)(unaff_x25 + (long)unaff_x24 * 0x38);
        puVar26 = puVar6;
        pbVar19 = unaff_x23;
        do {
          uVar28 = puVar12[1];
          uVar7 = *puVar12;
          uVar30 = puVar12[3];
          uVar29 = puVar12[2];
          uVar32 = puVar12[5];
          uVar31 = puVar12[4];
          puVar26[6] = puVar12[6];
          puVar26[3] = uVar30;
          puVar26[2] = uVar29;
          puVar26[5] = uVar32;
          puVar26[4] = uVar31;
          puVar26[1] = uVar28;
          *puVar26 = uVar7;
          puVar12 = puVar12 + 7;
          pbVar19 = pbVar19 + -1;
          puVar26 = puVar26 + 7;
        } while (pbVar19 != (byte *)0x0);
      }
      *(undefined8 **)(unaff_x29 + -0xe0) = puVar6;
      *(byte **)(unaff_x29 + -0xd8) = unaff_x23;
      unaff_x22 = (uint *)func_0x00704c24(uVar24,0x38);
      func_0x00707e84(unaff_x22,&uStack0000000000000130,unaff_x29 + -0xe0,unaff_x20);
      if (*(char *)(unaff_x19 + 0x58) != '\0') {
        uVar7 = *(undefined8 *)(unaff_x19 + 0xd8);
        unaff_x23 = *(byte **)(unaff_x29 + -0x98);
        if (unaff_x23 == (byte *)0x0) {
          unaff_x24 = (undefined8 *)0x0;
        }
        else {
          unaff_x25 = *(ulong *)(unaff_x29 + -0xa0);
          unaff_x26 = **(long **)(unaff_x29 + -0xa8);
          unaff_x24 = (undefined8 *)func_0x00704c24(uVar7,(long)unaff_x23 << 6);
          puVar6 = (undefined8 *)(unaff_x26 + unaff_x25 * 0x40);
          puVar12 = unaff_x24;
          pbVar19 = unaff_x23;
          do {
            uVar28 = puVar6[1];
            uVar24 = *puVar6;
            uVar30 = puVar6[3];
            uVar29 = puVar6[2];
            uVar31 = puVar6[4];
            uVar33 = puVar6[7];
            uVar32 = puVar6[6];
            puVar12[5] = puVar6[5];
            puVar12[4] = uVar31;
            puVar12[7] = uVar33;
            puVar12[6] = uVar32;
            puVar12[1] = uVar28;
            *puVar12 = uVar24;
            puVar12[3] = uVar30;
            puVar12[2] = uVar29;
            puVar6 = puVar6 + 8;
            pbVar19 = pbVar19 + -1;
            puVar12 = puVar12 + 8;
          } while (pbVar19 != (byte *)0x0);
        }
        unaff_x20 = (ulong *)func_0x00704c24(uVar7,0x20);
        func_0x007096dc(unaff_x20,unaff_x24,unaff_x23,unaff_x21);
        lVar8 = *(long *)(unaff_x19 + 0x420);
        unaff_x21 = (byte *)((ulong)unaff_x22 >> 4);
        if ((ulong)(lVar8 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
          if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x22 != *(uint **)(unaff_x19 + 0x430)))
          {
            uVar18 = 0;
            uVar21 = (ulong)unaff_x21 ^ (ulong)unaff_x22 >> 9;
            do {
              uVar21 = uVar21 & lVar8 - 1U;
              puVar22 = *(uint **)(*(long *)(unaff_x19 + 0x418) + uVar21 * 0x10);
              if (puVar22 == unaff_x22) goto code_r0x0071e41c;
              uVar18 = uVar18 + 1;
              uVar21 = uVar18 + uVar21;
            } while (puVar22 != *(uint **)(unaff_x19 + 0x430) && uVar18 <= lVar8 - 1U);
          }
          func_0x006db93c();
          lVar8 = *(long *)(unaff_x19 + 0x420);
        }
code_r0x0071e41c:
        lVar13 = *(long *)(unaff_x19 + 0x418);
        uVar18 = ((ulong)unaff_x21 ^ (ulong)unaff_x22 >> 9) & lVar8 - 1U;
        puVar22 = *(uint **)(lVar13 + uVar18 * 0x10);
        if (puVar22 == *(uint **)(unaff_x19 + 0x430)) {
code_r0x0071e468:
          *(uint **)(lVar13 + uVar18 * 0x10) = unaff_x22;
          *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
        }
        else {
          lVar20 = 1;
          while (puVar22 != unaff_x22) {
            uVar18 = uVar18 + lVar20 & lVar8 - 1U;
            puVar22 = *(uint **)(lVar13 + uVar18 * 0x10);
            lVar20 = lVar20 + 1;
            if (puVar22 == *(uint **)(unaff_x19 + 0x430)) goto code_r0x0071e468;
          }
        }
        *(ulong **)(lVar13 + uVar18 * 0x10 + 8) = unaff_x20;
      }
      plVar14 = *(long **)(unaff_x29 + -0xa8);
      lVar8 = *plVar14 + *(long *)(unaff_x29 + -0xa0) * 0x40;
      if (lVar8 != plVar14[1]) {
        plVar14[1] = lVar8;
      }
      plVar14 = *(long **)(unaff_x29 + -0x90);
      lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
      if (lVar8 != plVar14[1]) {
        plVar14[1] = lVar8;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return unaff_x22;
      }
      ___stack_chk_fail();
      plVar14 = *(long **)(unaff_x29 + -0xa8);
      lVar8 = *plVar14 + *(long *)(unaff_x29 + -0xa0) * 0x40;
      if (lVar8 != plVar14[1]) goto code_r0x0071e718;
      plVar14 = *(long **)(unaff_x29 + -0x90);
      lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
      if (lVar8 == plVar14[1]) {
        do {
          __Unwind_Resume();
          plVar14 = extraout_x8;
          lVar8 = extraout_x9;
code_r0x0071e718:
          plVar14[1] = lVar8;
          plVar14 = *(long **)(unaff_x29 + -0x90);
          lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
        } while (lVar8 == plVar14[1]);
      }
      plVar14[1] = lVar8;
      auVar34 = __Unwind_Resume();
      goto code_r0x0071e744;
    }
    func_0x00710d48();
    if (*unaff_x22 == 0x7d) goto code_r0x0071dbd0;
    if (((*unaff_x22 == 0x119) &&
        (func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088),
        (uint)uStack0000000000000130 != 0x3a)) && (lVar8 = *(long *)(unaff_x19 + 0x98), lVar8 != 0))
    {
      iVar5 = _strcmp(lVar8,"read");
      if (iVar5 == 0) {
        unaff_x25 = (ulong)*unaff_x21;
        *(undefined8 *)(unaff_x29 + -0x78) = *in_stack_00000038;
        in_stack_000001ef = *(undefined8 *)((long)in_stack_00000038 + 7);
        func_0x0070ba44(in_stack_00000088);
        unaff_x23 = (byte *)((long)&MACH_HEADER.magic + 1);
        unaff_x26 = 1;
      }
      else {
        iVar5 = _strcmp(lVar8,"write");
        if (iVar5 != 0) goto code_r0x0071dcb8;
        unaff_x25 = (ulong)*unaff_x21;
        *(undefined8 *)(unaff_x29 + -0x78) = *in_stack_00000038;
        in_stack_000001ef = *(undefined8 *)((long)in_stack_00000038 + 7);
        func_0x0070ba44(in_stack_00000088);
        unaff_x26 = 2;
        unaff_x23 = (byte *)((long)&MACH_HEADER.magic + 1);
      }
    }
    else {
code_r0x0071dcb8:
      unaff_x25 = 0;
      unaff_x23 = (byte *)0x0;
      unaff_x26 = 3;
    }
    uVar11 = *unaff_x22;
    uVar3 = (undefined1)unaff_x25;
    uVar4 = SUB81(unaff_x23,0);
    if (uVar11 != 0x5b) {
      if (*(long *)(unaff_x29 + -0x80) == 0 && unaff_x20 == (ulong *)0x0) {
        if (uVar11 == 0x119) {
          func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088);
          uVar11 = *unaff_x22;
          if ((uint)uStack0000000000000130 == 0x3a) goto code_r0x0071dd6c;
        }
        uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
        uStack0000000000000138 = (undefined4)*(undefined8 *)(unaff_x21 + 8);
        uStack000000000000013c = (undefined4)((ulong)*(undefined8 *)(unaff_x21 + 8) >> 0x20);
        uStack0000000000000130._0_4_ = (uint)*(undefined8 *)unaff_x21;
        uStack0000000000000130._4_4_ = (undefined4)((ulong)*(undefined8 *)unaff_x21 >> 0x20);
        if ((uVar11 != 0x26) && (uVar11 != 0x7c)) {
          func_0x0071f5c8();
          *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
        }
        uVar18 = func_0x0071cf0c();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
        uVar21 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x70);
        puVar6 = (undefined8 *)(uVar18 + 0xc);
        uVar7 = *(undefined8 *)(unaff_x19 + 0x120);
        uStack0000000000000130._0_4_ = (uint)uStack0000000000000130 & 0xffffff00;
        uStack0000000000000140 = uStack0000000000000140 & 0xffffff00;
        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
        in_stack_00000000 = unaff_x29 + -0xe0;
        func_0x00707d58(uVar21,puVar6,0,0,uVar7,&uStack0000000000000130,puVar6,0);
        uStack0000000000000138 = (undefined4)*(undefined8 *)(uVar18 + 0x14);
        uStack000000000000013c = (undefined4)((ulong)*(undefined8 *)(uVar18 + 0x14) >> 0x20);
        uStack0000000000000130._0_4_ = (uint)*puVar6;
        uStack0000000000000130._4_4_ = (undefined4)((ulong)*puVar6 >> 0x20);
        unaff_x20 = (ulong *)func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x38);
        *unaff_x20 = uVar21;
        unaff_x20[1] = uVar18;
        unaff_x20[3] = CONCAT44(uStack000000000000013c,uStack0000000000000138);
        unaff_x20[2] = CONCAT44(uStack0000000000000130._4_4_,(uint)uStack0000000000000130);
        *(int *)(unaff_x20 + 4) = (int)unaff_x26;
        *(undefined1 *)((long)unaff_x20 + 0x24) = uVar3;
        *(undefined8 *)((long)unaff_x20 + 0x25) = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)unaff_x20 + 0x2c) = in_stack_000001ef;
        *(undefined1 *)((long)unaff_x20 + 0x34) = uVar4;
        unaff_x21 = (byte *)((long)&MACH_HEADER.magic + 1);
        uVar7 = *(undefined8 *)(unaff_x19 + 0x8c);
        if (*(int *)(unaff_x19 + 0x80) == 0x7d) goto code_r0x0071dbd8;
code_r0x0071e620:
        func_0x00721808();
        uVar18 = func_0x007244d4();
        if ((uVar18 & 1) == 0) {
          uVar7 = *(undefined8 *)(unaff_x19 + 0xa8);
        }
        goto code_r0x0071dbe0;
      }
code_r0x0071dd6c:
      if (uVar11 != 0x119) {
        func_0x0072415c();
        unaff_x21 = (byte *)0x0;
        uVar7 = *(undefined8 *)(unaff_x19 + 0x8c);
        if (*(int *)(unaff_x19 + 0x80) != 0x7d) goto code_r0x0071e620;
        goto code_r0x0071dbd8;
      }
      uVar7 = *(undefined8 *)(unaff_x19 + 0x98);
      uStack0000000000000138 = (undefined4)*(undefined8 *)(unaff_x21 + 8);
      uStack000000000000013c = (undefined4)((ulong)*(undefined8 *)(unaff_x21 + 8) >> 0x20);
      uStack0000000000000130._0_4_ = (uint)*(undefined8 *)unaff_x21;
      uStack0000000000000130._4_4_ = (undefined4)((ulong)*(undefined8 *)unaff_x21 >> 0x20);
      func_0x00710d48();
      *(ulong *)(unaff_x29 + -0xd8) = CONCAT44(uStack000000000000013c,uStack0000000000000138);
      *(ulong *)(unaff_x29 + -0xe0) =
           CONCAT44(uStack0000000000000130._4_4_,(uint)uStack0000000000000130);
      if (*unaff_x22 == 0x3a) {
        func_0x00710d48();
      }
      else {
        func_0x0072447c();
      }
      uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
      uStack0000000000000138 = (undefined4)*(undefined8 *)(unaff_x21 + 8);
      uStack000000000000013c = (undefined4)((ulong)*(undefined8 *)(unaff_x21 + 8) >> 0x20);
      uStack0000000000000130._0_4_ = (uint)*(undefined8 *)unaff_x21;
      uStack0000000000000130._4_4_ = (undefined4)((ulong)*(undefined8 *)unaff_x21 >> 0x20);
      if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
        func_0x0071f5c8();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
      }
      uVar24 = func_0x0071cf0c();
      *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
      uVar28 = *(undefined8 *)(unaff_x29 + -0xe0);
      in_stack_00000080[1] = *(undefined8 *)(unaff_x29 + -0xd8);
      *in_stack_00000080 = uVar28;
      uStack0000000000000130._0_4_ = (uint)uVar7;
      uStack0000000000000130._4_4_ = (undefined4)((ulong)uVar7 >> 0x20);
      uStack0000000000000148 = (undefined4)uVar24;
      uStack000000000000014c = (undefined4)((ulong)uVar24 >> 0x20);
      uStack0000000000000150 = (int)unaff_x26;
      uStack0000000000000154 = uVar3;
      *in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x78);
      unaff_x24 = &uStack0000000000000130;
      *(undefined8 *)((long)in_stack_00000078 + 7) = in_stack_000001ef;
      in_stack_00000160._4_1_ = uVar4;
      auVar34._8_8_ = &uStack0000000000000130;
      auVar34._0_8_ = unaff_x29 + -0x90;
      goto code_r0x0071e744;
    }
    uVar7 = *(undefined8 *)unaff_x22;
    uVar28 = *(undefined8 *)(unaff_x22 + 6);
    uVar24 = *(undefined8 *)(unaff_x22 + 4);
    *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(unaff_x22 + 2);
    *(undefined8 *)(unaff_x29 + -0xe0) = uVar7;
    *(undefined8 *)(unaff_x29 + -200) = uVar28;
    *(undefined8 *)(unaff_x29 + -0xd0) = uVar24;
    func_0x00710d48();
    if (((*unaff_x22 & 0xfffffffe) != 0x116) ||
       (func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088),
       (uint)uStack0000000000000130 != 0x5d)) {
      if (unaff_x20 == (ulong *)0x0) {
        *in_stack_00000048 = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)in_stack_00000048 + 7) = in_stack_000001ef;
        in_stack_00000098 = *(undefined8 *)(unaff_x29 + -0xd8);
        in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0xe0);
        in_stack_000000a8 = *(undefined8 *)(unaff_x29 + -200);
        in_stack_000000a0 = *(undefined8 *)(unaff_x29 + -0xd0);
        in_stack_000000b8._4_1_ = uVar3;
        in_stack_000000c8._4_1_ = uVar4;
        func_0x0071b1d4(&uStack00000000000000d0);
        unaff_x20 = uStack00000000000000d0;
        if (*(char *)(unaff_x19 + 0x58) != '\0') {
          uStack0000000000000130._0_4_ = 0;
          uStack000000000000013c =
               (undefined4)CONCAT71(uStack00000000000000e1,cStack00000000000000e0);
          uStack0000000000000140 = (uint)((uint7)uStack00000000000000e1 >> 0x18);
          uStack0000000000000130._4_4_ = (undefined4)in_stack_000000d8;
          uStack0000000000000138 = (undefined4)((ulong)in_stack_000000d8 >> 0x20);
          uStack0000000000000144 = (undefined4)in_stack_000000e8;
          uStack0000000000000148 = (undefined4)((ulong)in_stack_000000e8 >> 0x20);
          if (*unaff_x22 == 0x2c) {
            uStack000000000000014c = 0;
            uStack0000000000000150 = 1;
          }
          else if (*unaff_x22 == 0x3b) {
            uStack0000000000000150 = 1;
            uStack000000000000014c = 1;
          }
          else {
            uStack0000000000000150 = 0;
            uStack000000000000014c = 0;
          }
          _uStack0000000000000154 = *(undefined8 *)unaff_x21;
          uStack000000000000015c = 1;
          *in_stack_00000070 = 0;
          in_stack_00000070[1] = 0;
          auVar35._8_8_ = &uStack0000000000000130;
          auVar35._0_8_ = unaff_x29 + -0xa8;
          puVar27 = &UNK_0071e080;
          puVar23 = uStack00000000000000d0;
          goto code_r0x0071e8d0;
        }
      }
      else {
        *in_stack_00000050 = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)in_stack_00000050 + 7) = in_stack_000001ef;
        in_stack_000000f8 = *(undefined8 *)(unaff_x29 + -0xd8);
        in_stack_000000f0 = *(undefined8 *)(unaff_x29 + -0xe0);
        in_stack_00000108 = *(undefined8 *)(unaff_x29 + -200);
        in_stack_00000100 = *(undefined8 *)(unaff_x29 + -0xd0);
        in_stack_00000118._4_1_ = uVar3;
        in_stack_00000128._4_1_ = uVar4;
        func_0x0071b1d4(&uStack0000000000000130);
        func_0x007181dc();
      }
      goto code_r0x0071e1f4;
    }
    if (*(char *)(unaff_x19 + 0x58) == '\0') {
      in_stack_00000030._4_4_ = 0;
      in_stack_00000028 = *(undefined8 *)unaff_x21;
      *(undefined8 *)(unaff_x29 + -0xf0) = 0;
      *(undefined8 *)(unaff_x29 + -0xe8) = 0;
      goto code_r0x0071e0dc;
    }
    if (*unaff_x22 == 0x116) {
      in_stack_00000030._4_4_ = func_0x0070b9b4();
      uStack0000000000000014 = 2;
    }
    else {
      if (*unaff_x22 != 0x117) break;
      iVar5 = func_0x0070b9dc();
      in_stack_00000030._4_4_ = 0;
      uStack0000000000000014 = (uint)(iVar5 == 1);
    }
    in_stack_00000028 = *(undefined8 *)(unaff_x19 + 0x84);
    *(undefined8 *)(unaff_x29 + -0xf0) = 0;
    *(undefined8 *)(unaff_x29 + -0xe8) = 0;
  } while( true );
  in_stack_00000030._4_4_ = 0;
  in_stack_00000028 = *(undefined8 *)unaff_x21;
  in_w8 = 3;
  goto code_r0x0071e0d4;
}

