
void FUN_001d80a4(undefined8 param_1,ulong *param_2)

{
  undefined8 *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  code *pcVar6;
  undefined1 in_ZR;
  bool bVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  ulong uVar19;
  uint uVar20;
  uint uVar21;
  ulong *in_x7;
  ulong uVar22;
  ulong *puVar23;
  ulong *puVar24;
  ulong uVar25;
  ulong in_x10;
  ulong *puVar26;
  long lVar27;
  long lVar28;
  uint uVar29;
  uint uVar30;
  ulong uVar31;
  ulong *puVar32;
  uint uVar33;
  ulong uVar34;
  ulong *puVar35;
  ulong *puVar36;
  ulong *puVar37;
  ulong *puVar38;
  ulong *puVar39;
  ulong *puVar40;
  ulong *puVar41;
  ulong *puVar42;
  ulong unaff_x28;
  long in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000048;
  ulong *in_stack_00000050;
  ulong *in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000068;
  
  while ((bool)in_ZR) {
    if (in_x10 < 0xd) {
      if (in_x10 < 9) {
        uVar22 = 1;
      }
      else {
        puVar23 = in_x7 + 3;
        uVar10 = (uint)*puVar23;
        uVar17 = (uint)*in_x7;
        bVar7 = *(uint *)((long)in_x7 + 0x1c) < *(uint *)((long)in_x7 + 4);
        if (uVar10 != uVar17) {
          bVar7 = uVar10 < uVar17;
        }
        puVar24 = in_x7;
        puVar26 = puVar23;
        if (!bVar7) {
          puVar24 = puVar23;
          puVar26 = in_x7;
          uVar17 = uVar10;
        }
        uVar11 = *(uint *)((long)puVar24 + 4);
        uVar22 = *puVar26;
        *in_x7 = uVar22;
        *(uint *)puVar23 = uVar17;
        *(uint *)((long)in_x7 + 0x1c) = uVar11;
        puVar24 = in_x7 + 7;
        uVar20 = (uint)*puVar24;
        puVar26 = in_x7 + 1;
        uVar10 = (uint)*puVar26;
        bVar7 = *(uint *)((long)in_x7 + 0x3c) < *(uint *)((long)in_x7 + 0xc);
        if (uVar20 != uVar10) {
          bVar7 = uVar20 < uVar10;
        }
        if (!bVar7) {
          uVar10 = uVar20;
        }
        lVar27 = 0x38;
        puVar35 = puVar26;
        if (!bVar7) {
          lVar27 = 8;
          puVar35 = puVar24;
        }
        uVar14 = *(uint *)((long)puVar35 + 4);
        *puVar26 = *(ulong *)((long)in_x7 + lVar27);
        *(uint *)puVar24 = uVar10;
        *(uint *)((long)in_x7 + 0x3c) = uVar14;
        puVar35 = in_x7 + 5;
        uVar18 = (uint)*puVar35;
        puVar40 = in_x7 + 2;
        uVar20 = (uint)*puVar40;
        bVar7 = *(uint *)((long)in_x7 + 0x2c) < *(uint *)((long)in_x7 + 0x14);
        if (uVar18 != uVar20) {
          bVar7 = uVar18 < uVar20;
        }
        if (!bVar7) {
          uVar20 = uVar18;
        }
        lVar27 = 0x28;
        puVar36 = puVar40;
        if (!bVar7) {
          lVar27 = 0x10;
          puVar36 = puVar35;
        }
        uVar8 = *(uint *)((long)puVar36 + 4);
        uVar19 = *(ulong *)((long)in_x7 + lVar27);
        *puVar40 = uVar19;
        *(uint *)puVar35 = uVar20;
        *(uint *)((long)in_x7 + 0x2c) = uVar8;
        puVar36 = in_x7 + 8;
        uVar12 = (uint)*puVar36;
        puVar39 = in_x7 + 4;
        uVar18 = (uint)*puVar39;
        bVar7 = *(uint *)((long)in_x7 + 0x44) < *(uint *)((long)in_x7 + 0x24);
        if (uVar12 != uVar18) {
          bVar7 = uVar12 < uVar18;
        }
        if (!bVar7) {
          uVar18 = uVar12;
        }
        lVar27 = 0x40;
        puVar32 = puVar39;
        if (!bVar7) {
          lVar27 = 0x20;
          puVar32 = puVar36;
        }
        uVar34 = *(ulong *)((long)in_x7 + lVar27);
        uVar9 = *(uint *)((long)puVar32 + 4);
        *puVar39 = uVar34;
        *(uint *)puVar36 = uVar18;
        *(uint *)((long)in_x7 + 0x44) = uVar9;
        uVar12 = (uint)uVar22;
        bVar7 = uVar14 < (uint)(uVar22 >> 0x20);
        if (uVar10 != uVar12) {
          bVar7 = uVar10 < uVar12;
        }
        puVar32 = in_x7;
        puVar37 = puVar24;
        if (!bVar7) {
          puVar32 = puVar24;
          puVar37 = in_x7;
          uVar12 = uVar10;
        }
        uVar10 = *(uint *)((long)puVar32 + 4);
        uVar22 = *puVar37;
        *in_x7 = uVar22;
        *(uint *)puVar24 = uVar12;
        *(uint *)((long)in_x7 + 0x3c) = uVar10;
        uVar14 = (uint)uVar19;
        uVar21 = (uint)uVar34;
        bVar7 = uVar34 >> 0x20 < uVar19 >> 0x20;
        if (uVar21 != uVar14) {
          bVar7 = uVar21 < uVar14;
        }
        puVar32 = puVar40;
        if (!bVar7) {
          puVar32 = puVar39;
          uVar14 = uVar21;
        }
        uVar21 = *(uint *)((long)puVar32 + 4);
        if (!bVar7) {
          uVar34 = uVar19;
        }
        *puVar40 = uVar34;
        *(uint *)puVar39 = uVar14;
        *(uint *)((long)in_x7 + 0x24) = uVar21;
        bVar7 = uVar9 < uVar11;
        if (uVar18 != uVar17) {
          bVar7 = uVar18 < uVar17;
        }
        if (!bVar7) {
          uVar17 = uVar18;
        }
        lVar27 = 0x40;
        puVar32 = puVar23;
        if (!bVar7) {
          lVar27 = 0x18;
          puVar32 = puVar36;
        }
        uVar11 = *(uint *)((long)puVar32 + 4);
        uVar19 = *(ulong *)((long)in_x7 + lVar27);
        *puVar23 = uVar19;
        *(uint *)puVar36 = uVar17;
        *(uint *)((long)in_x7 + 0x44) = uVar11;
        puVar32 = in_x7 + 6;
        uVar18 = (uint)*puVar32;
        bVar7 = *(uint *)((long)in_x7 + 0x34) < uVar8;
        if (uVar18 != uVar20) {
          bVar7 = uVar18 < uVar20;
        }
        if (!bVar7) {
          uVar20 = uVar18;
        }
        lVar27 = 0x30;
        puVar37 = puVar35;
        if (!bVar7) {
          lVar27 = 0x28;
          puVar37 = puVar32;
        }
        uVar8 = *(uint *)((long)puVar37 + 4);
        uVar25 = *(ulong *)((long)in_x7 + lVar27);
        *puVar35 = uVar25;
        *(uint *)puVar32 = uVar20;
        *(uint *)((long)in_x7 + 0x34) = uVar8;
        uVar18 = (uint)uVar22;
        uVar9 = (uint)uVar34;
        bVar7 = uVar34 >> 0x20 < uVar22 >> 0x20;
        if (uVar9 != uVar18) {
          bVar7 = uVar9 < uVar18;
        }
        puVar37 = in_x7;
        if (!bVar7) {
          puVar37 = puVar40;
          uVar18 = uVar9;
        }
        uVar9 = *(uint *)((long)puVar37 + 4);
        if (!bVar7) {
          uVar34 = uVar22;
        }
        *in_x7 = uVar34;
        *(uint *)puVar40 = uVar18;
        *(uint *)((long)in_x7 + 0x14) = uVar9;
        uVar30 = (uint)*puVar26;
        uVar13 = (uint)uVar19;
        bVar7 = (uint)(uVar19 >> 0x20) < *(uint *)((long)in_x7 + 0xc);
        if (uVar30 != uVar13) {
          bVar7 = uVar13 < uVar30;
        }
        puVar37 = puVar26;
        if (!bVar7) {
          puVar37 = puVar23;
          uVar30 = uVar13;
        }
        uVar13 = *(uint *)((long)puVar37 + 4);
        if (!bVar7) {
          uVar19 = *puVar26;
        }
        *puVar26 = uVar19;
        *(uint *)puVar23 = uVar30;
        *(uint *)((long)in_x7 + 0x1c) = uVar13;
        uVar16 = (uint)uVar25;
        bVar7 = (uint)(uVar25 >> 0x20) < uVar21;
        if (uVar14 != uVar16) {
          bVar7 = uVar16 < uVar14;
        }
        puVar37 = puVar39;
        if (!bVar7) {
          puVar37 = puVar35;
          uVar14 = uVar16;
        }
        uVar21 = *(uint *)((long)puVar37 + 4);
        if (!bVar7) {
          uVar25 = *puVar39;
        }
        *puVar39 = uVar25;
        *(uint *)puVar35 = uVar14;
        *(uint *)((long)in_x7 + 0x2c) = uVar21;
        bVar7 = uVar11 < uVar10;
        if (uVar17 != uVar12) {
          bVar7 = uVar17 < uVar12;
        }
        if (!bVar7) {
          uVar12 = uVar17;
        }
        lVar27 = 0x40;
        puVar37 = puVar24;
        if (!bVar7) {
          lVar27 = 0x38;
          puVar37 = puVar36;
        }
        uVar17 = *(uint *)((long)puVar37 + 4);
        uVar22 = *(ulong *)((long)in_x7 + lVar27);
        *puVar24 = uVar22;
        uVar10 = (uint)uVar19;
        uVar11 = (uint)uVar25;
        bVar7 = uVar25 >> 0x20 < uVar19 >> 0x20;
        if (uVar11 != uVar10) {
          bVar7 = uVar11 < uVar10;
        }
        puVar37 = puVar26;
        if (!bVar7) {
          uVar25 = uVar19;
          puVar37 = puVar39;
          uVar10 = uVar11;
        }
        bVar7 = uVar8 < uVar13;
        if (uVar20 != uVar30) {
          bVar7 = uVar20 < uVar30;
        }
        if (!bVar7) {
          uVar30 = uVar20;
        }
        lVar27 = 0x30;
        puVar38 = puVar23;
        if (!bVar7) {
          lVar27 = 0x18;
          puVar38 = puVar32;
        }
        uVar11 = (uint)uVar22;
        bVar7 = (uint)(uVar22 >> 0x20) < uVar21;
        if (uVar14 != uVar11) {
          bVar7 = uVar11 < uVar14;
        }
        puVar41 = puVar35;
        if (!bVar7) {
          puVar41 = puVar24;
          uVar14 = uVar11;
        }
        if (!bVar7) {
          uVar22 = *puVar35;
        }
        uVar20 = (uint)uVar25;
        uVar11 = (uint)uVar34;
        bVar7 = uVar25 >> 0x20 < uVar34 >> 0x20;
        if (uVar11 != uVar20) {
          bVar7 = uVar20 < uVar11;
        }
        *(uint *)puVar36 = uVar12;
        *(uint *)((long)in_x7 + 0x44) = uVar17;
        uVar8 = *(uint *)((long)puVar37 + 4);
        *puVar26 = uVar25;
        *(uint *)puVar39 = uVar10;
        *(uint *)((long)in_x7 + 0x24) = uVar8;
        uVar21 = *(uint *)((long)puVar38 + 4);
        uVar19 = *(ulong *)((long)in_x7 + lVar27);
        *puVar23 = uVar19;
        *(uint *)puVar32 = uVar30;
        *(uint *)((long)in_x7 + 0x34) = uVar21;
        uVar13 = *(uint *)((long)puVar41 + 4);
        *puVar35 = uVar22;
        *(uint *)puVar24 = uVar14;
        *(uint *)((long)in_x7 + 0x3c) = uVar13;
        puVar37 = in_x7;
        if (!bVar7) {
          puVar37 = puVar26;
          uVar25 = uVar34;
          uVar11 = uVar20;
        }
        uVar20 = *(uint *)((long)puVar37 + 4);
        *in_x7 = uVar25;
        bVar7 = uVar8 < uVar9;
        if (uVar10 != uVar18) {
          bVar7 = uVar10 < uVar18;
        }
        puVar37 = puVar39;
        puVar38 = puVar40;
        if (!bVar7) {
          puVar37 = puVar40;
          puVar38 = puVar39;
          uVar18 = uVar10;
        }
        uVar8 = (uint)uVar22;
        uVar10 = (uint)uVar19;
        bVar7 = uVar22 >> 0x20 < uVar19 >> 0x20;
        if (uVar8 != uVar10) {
          bVar7 = uVar8 < uVar10;
        }
        puVar41 = puVar23;
        if (!bVar7) {
          puVar41 = puVar35;
          uVar22 = uVar19;
          uVar10 = uVar8;
        }
        bVar7 = uVar17 < uVar21;
        if (uVar12 != uVar30) {
          bVar7 = uVar12 < uVar30;
        }
        *(uint *)puVar26 = uVar11;
        *(uint *)((long)in_x7 + 0xc) = uVar20;
        uVar17 = *(uint *)((long)puVar38 + 4);
        uVar19 = *puVar37;
        *puVar40 = uVar19;
        *(uint *)puVar39 = uVar18;
        *(uint *)((long)in_x7 + 0x24) = uVar17;
        uVar8 = *(uint *)((long)puVar41 + 4);
        *puVar23 = uVar22;
        *(uint *)puVar35 = uVar10;
        *(uint *)((long)in_x7 + 0x2c) = uVar8;
        if (!bVar7) {
          uVar30 = uVar12;
        }
        lVar27 = 0x40;
        puVar37 = puVar32;
        if (!bVar7) {
          lVar27 = 0x30;
          puVar37 = puVar36;
        }
        uVar12 = *(uint *)((long)puVar37 + 4);
        uVar34 = *(ulong *)((long)in_x7 + lVar27);
        *(uint *)puVar36 = uVar30;
        *(uint *)((long)in_x7 + 0x44) = uVar12;
        uVar9 = (uint)uVar22;
        uVar12 = (uint)uVar19;
        bVar7 = uVar22 >> 0x20 < uVar19 >> 0x20;
        if (uVar9 != uVar12) {
          bVar7 = uVar9 < uVar12;
        }
        *puVar32 = uVar34;
        puVar36 = puVar40;
        if (!bVar7) {
          puVar36 = puVar23;
          uVar22 = uVar19;
          uVar12 = uVar9;
        }
        uVar9 = *(uint *)((long)puVar36 + 4);
        *puVar40 = uVar22;
        *(uint *)puVar23 = uVar12;
        *(uint *)((long)in_x7 + 0x1c) = uVar9;
        bVar7 = uVar8 < uVar17;
        if (uVar10 != uVar18) {
          bVar7 = uVar10 < uVar18;
        }
        puVar36 = puVar39;
        if (!bVar7) {
          puVar36 = puVar35;
          uVar18 = uVar10;
        }
        uVar17 = *(uint *)((long)puVar36 + 4);
        puVar36 = puVar35;
        if (!bVar7) {
          puVar36 = puVar39;
        }
        uVar19 = *puVar36;
        *puVar39 = uVar19;
        *(uint *)puVar35 = uVar18;
        *(uint *)((long)in_x7 + 0x2c) = uVar17;
        uVar10 = (uint)uVar34;
        bVar7 = uVar13 < (uint)(uVar34 >> 0x20);
        if (uVar14 != uVar10) {
          bVar7 = uVar14 < uVar10;
        }
        puVar36 = puVar32;
        if (!bVar7) {
          puVar36 = puVar24;
          uVar10 = uVar14;
        }
        uVar14 = *(uint *)((long)puVar36 + 4);
        uVar25 = *puVar24;
        *(uint *)puVar24 = uVar10;
        if (!bVar7) {
          uVar25 = uVar34;
        }
        *(uint *)((long)in_x7 + 0x3c) = uVar14;
        uVar10 = (uint)uVar22;
        bVar7 = (uint)(uVar22 >> 0x20) < uVar20;
        if (uVar11 != uVar10) {
          bVar7 = uVar10 < uVar11;
        }
        *puVar32 = uVar25;
        if (!bVar7) {
          uVar11 = uVar10;
        }
        puVar24 = puVar26;
        if (!bVar7) {
          puVar24 = puVar40;
          uVar22 = *puVar26;
        }
        uVar10 = *(uint *)((long)puVar24 + 4);
        *puVar26 = uVar22;
        *(uint *)puVar40 = uVar11;
        *(uint *)((long)in_x7 + 0x14) = uVar10;
        uVar10 = (uint)uVar19;
        bVar7 = (uint)(uVar19 >> 0x20) < uVar9;
        if (uVar12 != uVar10) {
          bVar7 = uVar10 < uVar12;
        }
        if (!bVar7) {
          uVar12 = uVar10;
        }
        puVar24 = puVar23;
        if (!bVar7) {
          puVar24 = puVar39;
          uVar19 = *puVar23;
        }
        uVar10 = *(uint *)((long)puVar24 + 4);
        *puVar23 = uVar19;
        *(uint *)puVar39 = uVar12;
        *(uint *)((long)in_x7 + 0x24) = uVar10;
        uVar10 = (uint)uVar25;
        bVar7 = (uint)(uVar25 >> 0x20) < uVar17;
        if (uVar18 != uVar10) {
          bVar7 = uVar10 < uVar18;
        }
        if (!bVar7) {
          uVar18 = uVar10;
        }
        puVar23 = puVar35;
        if (!bVar7) {
          puVar23 = puVar32;
          uVar25 = *puVar35;
        }
        uVar17 = *(uint *)((long)puVar23 + 4);
        *puVar35 = uVar25;
        *(uint *)puVar32 = uVar18;
        *(uint *)((long)in_x7 + 0x34) = uVar17;
        uVar22 = 9;
      }
    }
    else {
      puVar23 = in_x7 + 0xc;
      uVar10 = (uint)*puVar23;
      uVar17 = (uint)*in_x7;
      bVar7 = *(uint *)((long)in_x7 + 100) < *(uint *)((long)in_x7 + 4);
      if (uVar10 != uVar17) {
        bVar7 = uVar10 < uVar17;
      }
      puVar24 = in_x7;
      puVar26 = puVar23;
      if (!bVar7) {
        puVar24 = puVar23;
        puVar26 = in_x7;
        uVar17 = uVar10;
      }
      uVar11 = *(uint *)((long)puVar24 + 4);
      *in_x7 = *puVar26;
      *(uint *)puVar23 = uVar17;
      *(uint *)((long)in_x7 + 100) = uVar11;
      puVar26 = in_x7 + 10;
      uVar20 = (uint)*puVar26;
      puVar24 = in_x7 + 1;
      uVar10 = (uint)*puVar24;
      bVar7 = *(uint *)((long)in_x7 + 0x54) < *(uint *)((long)in_x7 + 0xc);
      if (uVar20 != uVar10) {
        bVar7 = uVar20 < uVar10;
      }
      if (!bVar7) {
        uVar10 = uVar20;
      }
      lVar27 = 0x50;
      puVar35 = puVar24;
      if (!bVar7) {
        lVar27 = 8;
        puVar35 = puVar26;
      }
      uVar22 = *(ulong *)((long)in_x7 + lVar27);
      uVar14 = *(uint *)((long)puVar35 + 4);
      *puVar24 = uVar22;
      *(uint *)puVar26 = uVar10;
      puVar35 = in_x7 + 9;
      uVar18 = (uint)*puVar35;
      *(uint *)((long)in_x7 + 0x54) = uVar14;
      puVar40 = in_x7 + 2;
      uVar20 = (uint)*puVar40;
      bVar7 = *(uint *)((long)in_x7 + 0x4c) < *(uint *)((long)in_x7 + 0x14);
      if (uVar18 != uVar20) {
        bVar7 = uVar18 < uVar20;
      }
      if (!bVar7) {
        uVar20 = uVar18;
      }
      lVar27 = 0x48;
      puVar36 = puVar40;
      if (!bVar7) {
        lVar27 = 0x10;
        puVar36 = puVar35;
      }
      uVar8 = *(uint *)((long)puVar36 + 4);
      uVar19 = *(ulong *)((long)in_x7 + lVar27);
      *puVar40 = uVar19;
      *(uint *)puVar35 = uVar20;
      *(uint *)((long)in_x7 + 0x4c) = uVar8;
      puVar39 = in_x7 + 7;
      uVar12 = (uint)*puVar39;
      puVar36 = in_x7 + 3;
      uVar18 = (uint)*puVar36;
      bVar7 = *(uint *)((long)in_x7 + 0x3c) < *(uint *)((long)in_x7 + 0x1c);
      if (uVar12 != uVar18) {
        bVar7 = uVar12 < uVar18;
      }
      if (!bVar7) {
        uVar18 = uVar12;
      }
      lVar27 = 0x38;
      puVar32 = puVar36;
      if (!bVar7) {
        lVar27 = 0x18;
        puVar32 = puVar39;
      }
      uVar9 = *(uint *)((long)puVar32 + 4);
      uVar34 = *(ulong *)((long)in_x7 + lVar27);
      *puVar36 = uVar34;
      *(uint *)puVar39 = uVar18;
      *(uint *)((long)in_x7 + 0x3c) = uVar9;
      puVar32 = in_x7 + 0xb;
      uVar21 = (uint)*puVar32;
      puVar37 = in_x7 + 5;
      uVar12 = (uint)*puVar37;
      bVar7 = *(uint *)((long)in_x7 + 0x5c) < *(uint *)((long)in_x7 + 0x2c);
      if (uVar21 != uVar12) {
        bVar7 = uVar21 < uVar12;
      }
      if (!bVar7) {
        uVar12 = uVar21;
      }
      lVar27 = 0x58;
      puVar38 = puVar37;
      if (!bVar7) {
        lVar27 = 0x28;
        puVar38 = puVar32;
      }
      uVar30 = *(uint *)((long)puVar38 + 4);
      *puVar37 = *(ulong *)((long)in_x7 + lVar27);
      *(uint *)puVar32 = uVar12;
      *(uint *)((long)in_x7 + 0x5c) = uVar30;
      puVar41 = in_x7 + 8;
      uVar13 = (uint)*puVar41;
      puVar38 = in_x7 + 6;
      uVar21 = (uint)*puVar38;
      bVar7 = *(uint *)((long)in_x7 + 0x44) < *(uint *)((long)in_x7 + 0x34);
      if (uVar13 != uVar21) {
        bVar7 = uVar13 < uVar21;
      }
      if (!bVar7) {
        uVar21 = uVar13;
      }
      lVar27 = 0x40;
      puVar4 = puVar38;
      if (!bVar7) {
        lVar27 = 0x30;
        puVar4 = puVar41;
      }
      uVar13 = *(uint *)((long)puVar4 + 4);
      uVar25 = *(ulong *)((long)in_x7 + lVar27);
      *puVar38 = uVar25;
      uVar16 = (uint)uVar22;
      uVar15 = (uint)uVar25;
      bVar7 = uVar25 >> 0x20 < uVar22 >> 0x20;
      if (uVar15 != uVar16) {
        bVar7 = uVar15 < uVar16;
      }
      puVar4 = puVar24;
      if (!bVar7) {
        uVar25 = uVar22;
        puVar4 = puVar38;
        uVar16 = uVar15;
      }
      uVar15 = (uint)uVar19;
      uVar33 = (uint)uVar34;
      bVar7 = uVar34 >> 0x20 < uVar19 >> 0x20;
      if (uVar33 != uVar15) {
        bVar7 = uVar33 < uVar15;
      }
      puVar5 = puVar40;
      if (!bVar7) {
        uVar34 = uVar19;
        puVar5 = puVar36;
        uVar15 = uVar33;
      }
      puVar42 = in_x7 + 4;
      uVar33 = (uint)*puVar42;
      bVar7 = uVar30 < *(uint *)((long)in_x7 + 0x24);
      if (uVar12 != uVar33) {
        bVar7 = uVar12 < uVar33;
      }
      *(uint *)puVar41 = uVar21;
      *(uint *)((long)in_x7 + 0x44) = uVar13;
      uVar30 = *(uint *)((long)puVar4 + 4);
      *(uint *)puVar38 = uVar16;
      *(uint *)((long)in_x7 + 0x34) = uVar30;
      if (!bVar7) {
        uVar33 = uVar12;
      }
      lVar27 = 0x58;
      puVar4 = puVar42;
      if (!bVar7) {
        lVar27 = 0x20;
        puVar4 = puVar32;
      }
      uVar22 = *(ulong *)((long)in_x7 + lVar27);
      bVar7 = uVar8 < uVar9;
      if (uVar20 != uVar18) {
        bVar7 = uVar20 < uVar18;
      }
      if (!bVar7) {
        uVar18 = uVar20;
      }
      lVar27 = 0x48;
      puVar2 = puVar39;
      if (!bVar7) {
        lVar27 = 0x38;
        puVar2 = puVar35;
      }
      bVar7 = uVar14 < uVar13;
      if (uVar10 != uVar21) {
        bVar7 = uVar10 < uVar21;
      }
      if (!bVar7) {
        uVar21 = uVar10;
      }
      lVar28 = 0x50;
      puVar3 = puVar41;
      if (!bVar7) {
        lVar28 = 0x40;
        puVar3 = puVar26;
      }
      uVar10 = (uint)*in_x7;
      uVar20 = (uint)uVar22;
      bVar7 = (uint)(uVar22 >> 0x20) < *(uint *)((long)in_x7 + 4);
      if (uVar10 != uVar20) {
        bVar7 = uVar20 < uVar10;
      }
      *puVar24 = uVar25;
      uVar14 = *(uint *)((long)puVar5 + 4);
      *puVar40 = uVar34;
      *(uint *)puVar36 = uVar15;
      *(uint *)((long)in_x7 + 0x1c) = uVar14;
      uVar8 = *(uint *)((long)puVar4 + 4);
      *puVar42 = uVar22;
      *(uint *)puVar32 = uVar33;
      *(uint *)((long)in_x7 + 0x5c) = uVar8;
      uVar12 = *(uint *)((long)puVar2 + 4);
      uVar31 = *(ulong *)((long)in_x7 + lVar27);
      *puVar39 = uVar31;
      *(uint *)puVar35 = uVar18;
      *(uint *)((long)in_x7 + 0x4c) = uVar12;
      uVar9 = *(uint *)((long)puVar3 + 4);
      uVar19 = *(ulong *)((long)in_x7 + lVar28);
      *puVar41 = uVar19;
      *(uint *)puVar26 = uVar21;
      *(uint *)((long)in_x7 + 0x54) = uVar9;
      if (!bVar7) {
        uVar10 = uVar20;
      }
      puVar4 = in_x7;
      if (!bVar7) {
        puVar4 = puVar42;
        uVar22 = *in_x7;
      }
      uVar20 = *(uint *)((long)puVar4 + 4);
      *in_x7 = uVar22;
      uVar13 = (uint)uVar25;
      uVar29 = (uint)uVar34;
      bVar7 = uVar34 >> 0x20 < uVar25 >> 0x20;
      if (uVar29 != uVar13) {
        bVar7 = uVar29 < uVar13;
      }
      *(uint *)puVar42 = uVar10;
      *(uint *)((long)in_x7 + 0x24) = uVar20;
      puVar4 = puVar24;
      if (!bVar7) {
        puVar4 = puVar40;
        uVar34 = uVar25;
        uVar13 = uVar29;
      }
      uVar29 = *(uint *)((long)puVar4 + 4);
      *puVar24 = uVar34;
      *(uint *)puVar40 = uVar13;
      *(uint *)((long)in_x7 + 0x14) = uVar29;
      bVar7 = uVar30 < uVar14;
      if (uVar16 != uVar15) {
        bVar7 = uVar16 < uVar15;
      }
      puVar4 = puVar36;
      if (!bVar7) {
        puVar4 = puVar38;
        uVar15 = uVar16;
      }
      uVar14 = *(uint *)((long)puVar4 + 4);
      puVar4 = puVar38;
      if (!bVar7) {
        puVar4 = puVar36;
      }
      *puVar36 = *puVar4;
      uVar16 = (uint)uVar19;
      uVar30 = (uint)uVar31;
      bVar7 = uVar19 >> 0x20 < uVar31 >> 0x20;
      if (uVar16 != uVar30) {
        bVar7 = uVar16 < uVar30;
      }
      *(uint *)puVar38 = uVar15;
      *(uint *)((long)in_x7 + 0x34) = uVar14;
      puVar4 = puVar39;
      if (!bVar7) {
        puVar4 = puVar41;
        uVar19 = uVar31;
        uVar30 = uVar16;
      }
      uVar16 = *(uint *)((long)puVar4 + 4);
      *puVar39 = uVar19;
      *(uint *)puVar41 = uVar30;
      *(uint *)((long)in_x7 + 0x44) = uVar16;
      bVar7 = uVar9 < uVar12;
      if (uVar21 != uVar18) {
        bVar7 = uVar21 < uVar18;
      }
      if (!bVar7) {
        uVar18 = uVar21;
      }
      lVar27 = 0x50;
      puVar4 = puVar35;
      if (!bVar7) {
        lVar27 = 0x48;
        puVar4 = puVar26;
      }
      uVar12 = *(uint *)((long)puVar4 + 4);
      uVar22 = *(ulong *)((long)in_x7 + lVar27);
      *puVar35 = uVar22;
      *(uint *)puVar26 = uVar18;
      *(uint *)((long)in_x7 + 0x54) = uVar12;
      bVar7 = uVar11 < uVar8;
      if (uVar17 != uVar33) {
        bVar7 = uVar17 < uVar33;
      }
      if (!bVar7) {
        uVar33 = uVar17;
      }
      lVar27 = 0x60;
      puVar4 = puVar32;
      if (!bVar7) {
        lVar27 = 0x58;
        puVar4 = puVar23;
      }
      uVar19 = *(ulong *)((long)in_x7 + lVar27);
      uVar17 = *(uint *)((long)puVar4 + 4);
      *puVar32 = uVar19;
      *(uint *)puVar23 = uVar33;
      *(uint *)((long)in_x7 + 100) = uVar17;
      bVar7 = uVar14 < uVar20;
      if (uVar15 != uVar10) {
        bVar7 = uVar15 < uVar10;
      }
      puVar4 = puVar42;
      if (!bVar7) {
        puVar4 = puVar38;
        uVar10 = uVar15;
      }
      uVar11 = *(uint *)((long)puVar4 + 4);
      puVar4 = puVar38;
      if (!bVar7) {
        puVar4 = puVar42;
      }
      uVar34 = *puVar4;
      *puVar42 = uVar34;
      *(uint *)puVar38 = uVar10;
      *(uint *)((long)in_x7 + 0x34) = uVar11;
      uVar20 = (uint)*puVar37;
      uVar14 = (uint)uVar22;
      bVar7 = (uint)(uVar22 >> 0x20) < *(uint *)((long)in_x7 + 0x2c);
      if (uVar20 != uVar14) {
        bVar7 = uVar14 < uVar20;
      }
      puVar4 = puVar37;
      if (!bVar7) {
        puVar4 = puVar35;
        uVar20 = uVar14;
      }
      uVar14 = *(uint *)((long)puVar4 + 4);
      if (!bVar7) {
        uVar22 = *puVar37;
      }
      *puVar37 = uVar22;
      *(uint *)puVar35 = uVar20;
      *(uint *)((long)in_x7 + 0x4c) = uVar14;
      uVar8 = (uint)uVar19;
      bVar7 = (uint)(uVar19 >> 0x20) < uVar16;
      if (uVar30 != uVar8) {
        bVar7 = uVar8 < uVar30;
      }
      puVar4 = puVar41;
      if (!bVar7) {
        puVar4 = puVar32;
        uVar30 = uVar8;
      }
      uVar8 = *(uint *)((long)puVar4 + 4);
      if (!bVar7) {
        uVar19 = *puVar41;
      }
      *puVar41 = uVar19;
      *(uint *)puVar32 = uVar30;
      *(uint *)((long)in_x7 + 0x5c) = uVar8;
      bVar7 = uVar17 < uVar12;
      if (uVar33 != uVar18) {
        bVar7 = uVar33 < uVar18;
      }
      if (!bVar7) {
        uVar18 = uVar33;
      }
      lVar27 = 0x60;
      puVar4 = puVar26;
      if (!bVar7) {
        lVar27 = 0x50;
        puVar4 = puVar23;
      }
      uVar17 = *(uint *)((long)puVar4 + 4);
      uVar25 = *(ulong *)((long)in_x7 + lVar27);
      *puVar26 = uVar25;
      *(uint *)puVar23 = uVar18;
      *(uint *)((long)in_x7 + 100) = uVar17;
      uVar17 = (uint)*in_x7;
      uVar18 = (uint)uVar22;
      bVar7 = (uint)(uVar22 >> 0x20) < *(uint *)((long)in_x7 + 4);
      if (uVar17 != uVar18) {
        bVar7 = uVar18 < uVar17;
      }
      puVar23 = in_x7;
      if (!bVar7) {
        puVar23 = puVar37;
        uVar17 = uVar18;
      }
      uVar18 = *(uint *)((long)puVar23 + 4);
      if (!bVar7) {
        uVar22 = *in_x7;
      }
      *in_x7 = uVar22;
      *(uint *)puVar37 = uVar17;
      *(uint *)((long)in_x7 + 0x2c) = uVar18;
      uVar12 = (uint)*puVar36;
      uVar9 = (uint)uVar19;
      bVar7 = (uint)(uVar19 >> 0x20) < *(uint *)((long)in_x7 + 0x1c);
      if (uVar12 != uVar9) {
        bVar7 = uVar9 < uVar12;
      }
      puVar23 = puVar36;
      if (!bVar7) {
        puVar23 = puVar41;
        uVar12 = uVar9;
      }
      uVar9 = *(uint *)((long)puVar23 + 4);
      if (!bVar7) {
        uVar19 = *puVar36;
      }
      *puVar36 = uVar19;
      *(uint *)puVar41 = uVar12;
      *(uint *)((long)in_x7 + 0x44) = uVar9;
      uVar21 = (uint)*puVar39;
      uVar16 = (uint)uVar34;
      bVar7 = *(uint *)((long)in_x7 + 0x3c) < (uint)(uVar34 >> 0x20);
      if (uVar21 != uVar16) {
        bVar7 = uVar21 < uVar16;
      }
      puVar23 = puVar42;
      if (!bVar7) {
        puVar23 = puVar39;
        uVar16 = uVar21;
      }
      uVar21 = *(uint *)((long)puVar23 + 4);
      uVar19 = *puVar39;
      if (!bVar7) {
        uVar19 = uVar34;
      }
      *puVar42 = uVar19;
      bVar7 = uVar8 < uVar11;
      if (uVar30 != uVar10) {
        bVar7 = uVar30 < uVar10;
      }
      puVar23 = puVar32;
      puVar4 = puVar38;
      if (!bVar7) {
        puVar23 = puVar38;
        puVar4 = puVar32;
        uVar10 = uVar30;
      }
      uVar11 = (uint)uVar25;
      bVar7 = (uint)(uVar25 >> 0x20) < uVar14;
      if (uVar20 != uVar11) {
        bVar7 = uVar11 < uVar20;
      }
      puVar5 = puVar35;
      if (!bVar7) {
        puVar5 = puVar26;
        uVar20 = uVar11;
      }
      if (!bVar7) {
        uVar25 = *puVar35;
      }
      uVar14 = (uint)*puVar24;
      uVar11 = (uint)uVar22;
      bVar7 = *(uint *)((long)in_x7 + 0xc) < (uint)(uVar22 >> 0x20);
      if (uVar14 != uVar11) {
        bVar7 = uVar14 < uVar11;
      }
      *(uint *)puVar39 = uVar16;
      *(uint *)((long)in_x7 + 0x3c) = uVar21;
      uVar8 = *(uint *)((long)puVar4 + 4);
      uVar19 = *puVar23;
      *puVar38 = uVar19;
      *(uint *)puVar32 = uVar10;
      *(uint *)((long)in_x7 + 0x5c) = uVar8;
      uVar30 = *(uint *)((long)puVar5 + 4);
      *puVar35 = uVar25;
      *(uint *)puVar26 = uVar20;
      *(uint *)((long)in_x7 + 0x54) = uVar30;
      if (!bVar7) {
        uVar11 = uVar14;
      }
      puVar23 = in_x7;
      uVar34 = *puVar24;
      if (!bVar7) {
        puVar23 = puVar24;
        uVar34 = uVar22;
      }
      uVar14 = *(uint *)((long)puVar23 + 4);
      *in_x7 = uVar34;
      bVar7 = uVar18 < uVar29;
      if (uVar17 != uVar13) {
        bVar7 = uVar17 < uVar13;
      }
      puVar23 = puVar37;
      puVar4 = puVar40;
      if (!bVar7) {
        puVar23 = puVar40;
        puVar4 = puVar37;
        uVar13 = uVar17;
      }
      uVar17 = (uint)uVar19;
      uVar18 = (uint)uVar25;
      bVar7 = uVar25 >> 0x20 < uVar19 >> 0x20;
      if (uVar18 != uVar17) {
        bVar7 = uVar18 < uVar17;
      }
      puVar5 = puVar38;
      if (!bVar7) {
        puVar5 = puVar35;
        uVar25 = uVar19;
        uVar17 = uVar18;
      }
      bVar7 = uVar9 < uVar21;
      if (uVar12 != uVar16) {
        bVar7 = uVar12 < uVar16;
      }
      *(uint *)puVar24 = uVar11;
      *(uint *)((long)in_x7 + 0xc) = uVar14;
      uVar18 = *(uint *)((long)puVar4 + 4);
      uVar22 = *puVar23;
      *puVar40 = uVar22;
      *(uint *)puVar37 = uVar13;
      *(uint *)((long)in_x7 + 0x2c) = uVar18;
      uVar9 = *(uint *)((long)puVar5 + 4);
      *puVar38 = uVar25;
      *(uint *)puVar35 = uVar17;
      *(uint *)((long)in_x7 + 0x4c) = uVar9;
      puVar23 = puVar39;
      if (!bVar7) {
        puVar23 = puVar41;
        uVar16 = uVar12;
      }
      uVar12 = *(uint *)((long)puVar23 + 4);
      puVar23 = puVar41;
      if (!bVar7) {
        puVar23 = puVar39;
      }
      *puVar39 = *puVar23;
      *(uint *)puVar41 = uVar16;
      *(uint *)((long)in_x7 + 0x44) = uVar12;
      bVar7 = uVar8 < uVar30;
      if (uVar10 != uVar20) {
        bVar7 = uVar10 < uVar20;
      }
      puVar23 = puVar26;
      if (!bVar7) {
        puVar23 = puVar32;
        uVar20 = uVar10;
      }
      uVar10 = *(uint *)((long)puVar23 + 4);
      puVar23 = puVar32;
      if (!bVar7) {
        puVar23 = puVar26;
      }
      uVar19 = *puVar23;
      *(uint *)puVar32 = uVar20;
      *(uint *)((long)in_x7 + 0x5c) = uVar10;
      uVar10 = (uint)*puVar36;
      bVar7 = *(uint *)((long)in_x7 + 0x1c) < uVar14;
      if (uVar10 != uVar11) {
        bVar7 = uVar10 < uVar11;
      }
      puVar23 = puVar36;
      puVar32 = puVar24;
      if (!bVar7) {
        puVar23 = puVar24;
        puVar32 = puVar36;
        uVar11 = uVar10;
      }
      uVar10 = (uint)*puVar42;
      uVar20 = (uint)uVar22;
      bVar7 = *(uint *)((long)in_x7 + 0x24) < (uint)(uVar22 >> 0x20);
      if (uVar10 != uVar20) {
        bVar7 = uVar10 < uVar20;
      }
      puVar4 = puVar40;
      if (!bVar7) {
        puVar4 = puVar42;
        uVar20 = uVar10;
      }
      uVar34 = *puVar42;
      if (!bVar7) {
        uVar34 = uVar22;
      }
      uVar10 = (uint)uVar25;
      bVar7 = (uint)(uVar25 >> 0x20) < uVar18;
      if (uVar13 != uVar10) {
        bVar7 = uVar10 < uVar13;
      }
      puVar5 = puVar37;
      if (!bVar7) {
        puVar5 = puVar38;
        uVar13 = uVar10;
      }
      if (!bVar7) {
        uVar25 = *puVar37;
      }
      uVar10 = (uint)uVar19;
      bVar7 = (uint)(uVar19 >> 0x20) < uVar9;
      if (uVar17 != uVar10) {
        bVar7 = uVar10 < uVar17;
      }
      *puVar26 = uVar19;
      uVar14 = *(uint *)((long)puVar32 + 4);
      uVar22 = *puVar23;
      *puVar24 = uVar22;
      *(uint *)puVar36 = uVar11;
      *(uint *)((long)in_x7 + 0x1c) = uVar14;
      uVar18 = *(uint *)((long)puVar4 + 4);
      *puVar40 = uVar34;
      *(uint *)puVar42 = uVar20;
      *(uint *)((long)in_x7 + 0x24) = uVar18;
      uVar8 = *(uint *)((long)puVar5 + 4);
      *puVar37 = uVar25;
      *(uint *)puVar38 = uVar13;
      *(uint *)((long)in_x7 + 0x34) = uVar8;
      puVar23 = puVar35;
      if (!bVar7) {
        puVar23 = puVar26;
        uVar17 = uVar10;
      }
      uVar10 = *(uint *)((long)puVar23 + 4);
      *(uint *)puVar26 = uVar17;
      if (!bVar7) {
        uVar19 = *puVar35;
      }
      *puVar35 = uVar19;
      *(uint *)((long)in_x7 + 0x54) = uVar10;
      uVar10 = (uint)uVar34;
      uVar17 = (uint)uVar22;
      bVar7 = uVar34 >> 0x20 < uVar22 >> 0x20;
      if (uVar10 != uVar17) {
        bVar7 = uVar10 < uVar17;
      }
      puVar23 = puVar24;
      if (!bVar7) {
        puVar23 = puVar40;
        uVar34 = uVar22;
        uVar17 = uVar10;
      }
      uVar10 = *(uint *)((long)puVar23 + 4);
      *puVar24 = uVar34;
      bVar7 = uVar18 < uVar14;
      if (uVar20 != uVar11) {
        bVar7 = uVar20 < uVar11;
      }
      puVar23 = puVar42;
      puVar24 = puVar36;
      if (!bVar7) {
        puVar23 = puVar36;
        puVar24 = puVar42;
        uVar11 = uVar20;
      }
      uVar14 = (uint)*puVar39;
      uVar20 = (uint)uVar25;
      bVar7 = *(uint *)((long)in_x7 + 0x3c) < (uint)(uVar25 >> 0x20);
      if (uVar14 != uVar20) {
        bVar7 = uVar14 < uVar20;
      }
      *(uint *)puVar40 = uVar17;
      *(uint *)((long)in_x7 + 0x14) = uVar10;
      uVar22 = *puVar23;
      if (!bVar7) {
        uVar20 = uVar14;
      }
      puVar23 = puVar37;
      uVar19 = *puVar39;
      if (!bVar7) {
        puVar23 = puVar39;
        uVar19 = uVar25;
      }
      bVar7 = uVar12 < uVar8;
      if (uVar16 != uVar13) {
        bVar7 = uVar16 < uVar13;
      }
      puVar26 = puVar41;
      puVar32 = puVar38;
      if (!bVar7) {
        puVar26 = puVar38;
        puVar32 = puVar41;
        uVar13 = uVar16;
      }
      uVar14 = (uint)uVar22;
      bVar7 = (uint)(uVar22 >> 0x20) < uVar10;
      if (uVar17 != uVar14) {
        bVar7 = uVar14 < uVar17;
      }
      uVar10 = *(uint *)((long)puVar24 + 4);
      *puVar36 = uVar22;
      *(uint *)puVar42 = uVar11;
      *(uint *)((long)in_x7 + 0x24) = uVar10;
      uVar18 = *(uint *)((long)puVar23 + 4);
      *puVar37 = uVar19;
      *(uint *)puVar39 = uVar20;
      *(uint *)((long)in_x7 + 0x3c) = uVar18;
      uVar8 = *(uint *)((long)puVar32 + 4);
      uVar34 = *puVar26;
      *puVar38 = uVar34;
      *(uint *)puVar41 = uVar13;
      *(uint *)((long)in_x7 + 0x44) = uVar8;
      if (!bVar7) {
        uVar17 = uVar14;
      }
      puVar23 = puVar40;
      if (!bVar7) {
        puVar23 = puVar36;
        uVar22 = *puVar40;
      }
      uVar14 = *(uint *)((long)puVar23 + 4);
      *puVar40 = uVar22;
      *(uint *)puVar36 = uVar17;
      *(uint *)((long)in_x7 + 0x1c) = uVar14;
      uVar12 = (uint)uVar19;
      bVar7 = (uint)(uVar19 >> 0x20) < uVar10;
      if (uVar11 != uVar12) {
        bVar7 = uVar12 < uVar11;
      }
      puVar23 = puVar42;
      if (!bVar7) {
        puVar23 = puVar37;
        uVar11 = uVar12;
      }
      uVar10 = *(uint *)((long)puVar23 + 4);
      if (!bVar7) {
        uVar19 = *puVar42;
      }
      *puVar42 = uVar19;
      *(uint *)puVar37 = uVar11;
      *(uint *)((long)in_x7 + 0x2c) = uVar10;
      uVar12 = (uint)uVar34;
      bVar7 = uVar18 < (uint)(uVar34 >> 0x20);
      if (uVar20 != uVar12) {
        bVar7 = uVar20 < uVar12;
      }
      puVar23 = puVar38;
      if (!bVar7) {
        puVar23 = puVar39;
        uVar12 = uVar20;
      }
      uVar20 = *(uint *)((long)puVar23 + 4);
      uVar22 = *puVar39;
      *(uint *)puVar39 = uVar12;
      if (!bVar7) {
        uVar22 = uVar34;
      }
      *(uint *)((long)in_x7 + 0x3c) = uVar20;
      uVar20 = (uint)*puVar35;
      bVar7 = *(uint *)((long)in_x7 + 0x4c) < uVar8;
      if (uVar20 != uVar13) {
        bVar7 = uVar20 < uVar13;
      }
      *puVar38 = uVar22;
      puVar23 = puVar41;
      if (!bVar7) {
        puVar23 = puVar35;
        uVar13 = uVar20;
      }
      uVar20 = *(uint *)((long)puVar23 + 4);
      puVar23 = puVar35;
      if (!bVar7) {
        puVar23 = puVar41;
      }
      *puVar41 = *puVar23;
      *(uint *)puVar35 = uVar13;
      *(uint *)((long)in_x7 + 0x4c) = uVar20;
      uVar20 = (uint)uVar19;
      bVar7 = (uint)(uVar19 >> 0x20) < uVar14;
      if (uVar17 != uVar20) {
        bVar7 = uVar20 < uVar17;
      }
      if (!bVar7) {
        uVar17 = uVar20;
      }
      puVar23 = puVar36;
      if (!bVar7) {
        puVar23 = puVar42;
        uVar19 = *puVar36;
      }
      uVar20 = *(uint *)((long)puVar23 + 4);
      *puVar36 = uVar19;
      *(uint *)puVar42 = uVar17;
      *(uint *)((long)in_x7 + 0x24) = uVar20;
      uVar17 = (uint)uVar22;
      bVar7 = (uint)(uVar22 >> 0x20) < uVar10;
      if (uVar11 != uVar17) {
        bVar7 = uVar17 < uVar11;
      }
      if (!bVar7) {
        uVar11 = uVar17;
      }
      puVar23 = puVar37;
      if (!bVar7) {
        puVar23 = puVar38;
        uVar22 = *puVar37;
      }
      uVar17 = *(uint *)((long)puVar23 + 4);
      *puVar37 = uVar22;
      *(uint *)puVar38 = uVar11;
      *(uint *)((long)in_x7 + 0x34) = uVar17;
      uVar22 = 0xd;
      unaff_x28 = in_stack_00000008;
    }
    if (in_x10 <= uVar22 - 1) goto code_r0x001d8248;
    if (uVar22 != in_x10) {
      lVar27 = uVar22 * 8;
      puVar23 = in_x7 + uVar22;
      do {
        uVar17 = (uint)*puVar23;
        uVar10 = *(uint *)((long)puVar23 + 4);
        uVar22 = *puVar23;
        bVar7 = uVar10 < *(uint *)((long)puVar23 + -4);
        if (uVar17 != (uint)puVar23[-1]) {
          bVar7 = uVar17 < (uint)puVar23[-1];
        }
        if (bVar7) {
          lVar28 = lVar27;
          do {
            puVar1 = (undefined8 *)((long)in_x7 + lVar28);
            *puVar1 = puVar1[-1];
            lVar28 = lVar28 + -8;
            if (lVar28 == 0) {
              puVar24 = in_x7;
              goto code_r0x001d80c0;
            }
            bVar7 = uVar10 < *(uint *)((long)puVar1 + -0xc);
            if (uVar17 != *(uint *)(puVar1 + -2)) {
              bVar7 = uVar17 < *(uint *)(puVar1 + -2);
            }
          } while (bVar7);
          puVar24 = (ulong *)((long)in_x7 + lVar28);
code_r0x001d80c0:
          *puVar24 = uVar22;
        }
        puVar23 = puVar23 + 1;
        lVar27 = lVar27 + 8;
      } while (puVar23 != in_x7 + in_x10);
    }
    if (unaff_x28 < 0x12) {
      return;
    }
    in_ZR = in_x7 == in_stack_00000058;
    param_2 = in_stack_00000050;
    in_x7 = in_stack_00000050;
    in_x10 = in_stack_00000048;
  }
  lVar27 = 0;
  puVar24 = in_stack_00000058 + (unaff_x28 - 1);
  puVar26 = param_2 + -1;
  puVar23 = in_stack_00000058;
  lVar28 = unaff_x28 * 8;
  do {
    bVar7 = *(uint *)((long)param_2 + 4) < *(uint *)((long)puVar23 + 4);
    if ((uint)*param_2 != (uint)*puVar23) {
      bVar7 = (uint)*param_2 < (uint)*puVar23;
    }
    uVar17 = (uint)bVar7;
    puVar35 = param_2;
    if (uVar17 == 0) {
      puVar35 = puVar23;
    }
    *(ulong *)(&uStack0000000000000068 + lVar27 * 8) = *puVar35;
    lVar27 = lVar27 + 1;
    param_2 = param_2 + uVar17;
    puVar23 = puVar23 + (uVar17 ^ 1);
    bVar7 = *(uint *)((long)puVar24 + 4) < *(uint *)((long)puVar26 + 4);
    if ((uint)*puVar24 != (uint)*puVar26) {
      bVar7 = (uint)*puVar24 < (uint)*puVar26;
    }
    uVar17 = (uint)bVar7;
    puVar35 = puVar26;
    if (uVar17 == 0) {
      puVar35 = puVar24;
    }
    *(ulong *)(&uStack0000000000000060 + lVar28) = *puVar35;
    puVar35 = puVar24 + uVar17;
    puVar24 = puVar35 + -1;
    puVar26 = puVar26 + -(ulong)uVar17;
    lVar28 = lVar28 + -8;
  } while (in_stack_00000000 != lVar27);
  if ((unaff_x28 & 1) != 0) {
    bVar7 = puVar26 + 1 <= puVar23;
    puVar24 = puVar23;
    if (bVar7) {
      puVar24 = param_2;
    }
    *(ulong *)(&uStack0000000000000068 + lVar27 * 8) = *puVar24;
    puVar23 = puVar23 + !bVar7;
    param_2 = param_2 + bVar7;
  }
  if (puVar23 == puVar26 + 1 && param_2 == puVar35) {
    _memcpy(in_stack_00000058,&uStack0000000000000068);
    return;
  }
  func_0x007a286c();
code_r0x001d8248:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x1d824c);
  (*pcVar6)();
}

