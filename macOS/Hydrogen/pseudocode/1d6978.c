
void FUN_001d6978(uint *param_1,undefined8 param_2,ulong param_3)

{
  uint *puVar1;
  uint *puVar2;
  uint *puVar3;
  uint uVar4;
  undefined8 *puVar5;
  uint *puVar6;
  uint *puVar7;
  code *pcVar8;
  bool in_ZR;
  bool in_CY;
  bool bVar9;
  bool bVar10;
  uint *puVar11;
  uint *puVar12;
  uint *puVar13;
  long lVar14;
  long lVar15;
  int in_w9;
  uint *in_x10;
  undefined8 *puVar16;
  uint *in_x11;
  uint *puVar17;
  long in_x12;
  long in_x13;
  ulong uVar18;
  uint *in_x14;
  long lVar19;
  uint in_w16;
  ulong uVar20;
  undefined8 *unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  uint auStack_30 [2];
  ulong uStack_28;
  uint auStack_20 [2];
  ulong uStack_18;
  uint auStack_10 [2];
  ulong uStack_8;
  
  if (!in_ZR) {
    in_w16 = (uint)!in_CY;
  }
  puVar11 = in_x11;
  if (in_w16 == 0) {
    puVar11 = param_1;
  }
  puVar17 = param_1;
  puVar12 = in_x10;
  if (in_w9 == 0) {
    puVar17 = in_x11;
    puVar12 = puVar11;
    in_x11 = in_x10;
  }
  puVar11 = in_x14;
  if (in_w16 == 0) {
    puVar11 = puVar17;
    param_1 = in_x14;
  }
  puVar17 = (uint *)((long)unaff_x19 + unaff_x22);
  bVar10 = *(ulong *)(puVar17 + 6) < *(ulong *)(puVar17 + 2);
  if (puVar17[4] != *puVar17) {
    bVar10 = puVar17[4] < *puVar17;
  }
  bVar9 = *(ulong *)(puVar17 + 0xe) < *(ulong *)(puVar17 + 10);
  if (puVar17[0xc] != puVar17[8]) {
    bVar9 = puVar17[0xc] < puVar17[8];
  }
  lVar19 = in_x13;
  if (!bVar9) {
    lVar19 = in_x12;
  }
  puVar1 = (uint *)((long)puVar17 + lVar19);
  puVar13 = puVar17 + (ulong)(uint)bVar10 * 4;
  puVar3 = puVar17 + (ulong)(bVar10 ^ 1) * 4;
  if (!bVar9) {
    in_x12 = in_x13;
  }
  puVar17 = (uint *)((long)puVar17 + in_x12);
  bVar10 = *(ulong *)(puVar1 + 2) < *(ulong *)(puVar13 + 2);
  if (*puVar1 != *puVar13) {
    bVar10 = *puVar1 < *puVar13;
  }
  bVar9 = *(ulong *)(puVar17 + 2) < *(ulong *)(puVar3 + 2);
  if (*puVar17 != *puVar3) {
    bVar9 = *puVar17 < *puVar3;
  }
  puVar2 = puVar1;
  puVar6 = puVar3;
  if (!bVar9) {
    puVar2 = puVar3;
    puVar6 = puVar17;
  }
  puVar7 = puVar13;
  if (!bVar10) {
    puVar3 = puVar1;
    puVar7 = puVar2;
    puVar1 = puVar13;
  }
  if (!bVar9) {
    puVar17 = puVar3;
  }
  bVar10 = *(ulong *)(puVar11 + 2) < *(ulong *)(puVar12 + 2);
  if (*puVar11 != *puVar12) {
    bVar10 = *puVar11 < *puVar12;
  }
  puVar13 = puVar12;
  if (!bVar10) {
    puVar13 = puVar11;
    puVar11 = puVar12;
  }
  uStack0000000000000008 = *(undefined8 *)(in_x11 + 2);
  uStack0000000000000000 = *(undefined8 *)in_x11;
  uStack0000000000000018 = *(undefined8 *)(puVar11 + 2);
  uStack0000000000000010 = *(undefined8 *)puVar11;
  uStack0000000000000028 = *(undefined8 *)(puVar13 + 2);
  uStack0000000000000020 = *(undefined8 *)puVar13;
  uStack0000000000000038 = *(undefined8 *)(param_1 + 2);
  uStack0000000000000030 = *(undefined8 *)param_1;
  puVar5 = (undefined8 *)((long)auStack_20 + unaff_x22 + 0x20);
  bVar10 = *(ulong *)(puVar17 + 2) < *(ulong *)(puVar7 + 2);
  if (*puVar17 != *puVar7) {
    bVar10 = *puVar17 < *puVar7;
  }
  puVar11 = puVar7;
  if (!bVar10) {
    puVar11 = puVar17;
    puVar17 = puVar7;
  }
  uVar21 = *(undefined8 *)puVar1;
  uVar23 = *(undefined8 *)(puVar17 + 2);
  uVar22 = *(undefined8 *)puVar17;
  puVar5[1] = *(undefined8 *)(puVar1 + 2);
  *puVar5 = uVar21;
  puVar5[3] = uVar23;
  puVar5[2] = uVar22;
  uVar21 = *(undefined8 *)puVar11;
  uVar23 = *(undefined8 *)(puVar6 + 2);
  uVar22 = *(undefined8 *)puVar6;
  puVar5[5] = *(undefined8 *)(puVar11 + 2);
  puVar5[4] = uVar21;
  puVar5[7] = uVar23;
  puVar5[6] = uVar22;
  if (4 < unaff_x21) {
    lVar19 = 0x40;
    uVar20 = 4;
    uVar18 = 5;
    do {
      uVar21 = unaff_x19[uVar20 * 2];
      puVar11 = auStack_20 + uVar20 * 4 + 8;
      *(undefined8 *)(puVar11 + 2) = (unaff_x19 + uVar20 * 2)[1];
      *(undefined8 *)puVar11 = uVar21;
      uVar4 = *puVar11;
      uVar20 = *(ulong *)(puVar11 + 2);
      bVar10 = uVar20 < *(ulong *)(puVar11 + -2);
      if (uVar4 != puVar11[-4]) {
        bVar10 = uVar4 < puVar11[-4];
      }
      if (bVar10) {
        lVar15 = lVar19;
        do {
          lVar14 = lVar15;
          puVar5 = (undefined8 *)((long)auStack_20 + lVar14 + 0x20);
          puVar5[1] = puVar5[-1];
          *puVar5 = puVar5[-2];
          puVar11 = (uint *)register0x00000008;
          if (lVar14 + -0x10 == 0) goto LAB_001d6b74;
          bVar10 = uVar20 < *(ulong *)((long)auStack_20 + lVar14 + 8);
          if (uVar4 != *(uint *)((long)auStack_20 + lVar14)) {
            bVar10 = uVar4 < *(uint *)((long)auStack_20 + lVar14);
          }
          lVar15 = lVar14 + -0x10;
        } while (bVar10);
        puVar11 = (uint *)((long)auStack_10 + lVar14);
LAB_001d6b74:
        *puVar11 = uVar4;
        *(ulong *)(puVar11 + 2) = uVar20;
      }
      lVar19 = lVar19 + 0x10;
      if (unaff_x21 <= uVar18) break;
      uVar20 = uVar18;
      uVar18 = uVar18 + 1;
    } while( true );
  }
  puVar11 = (uint *)((long)auStack_20 + unaff_x22 + 0x20);
  if (param_3 - unaff_x21 < 5) {
LAB_001d6ce0:
    lVar19 = param_3 * 0x10;
    puVar17 = auStack_10 + param_3 * 4;
    puVar12 = puVar11 + -4;
    puVar5 = unaff_x19;
    do {
      puVar16 = puVar5;
      lVar19 = lVar19 + -0x10;
      bVar10 = *(ulong *)(puVar11 + 2) < *(ulong *)((long)register0x00000008 + 8);
      if (*puVar11 != *(uint *)register0x00000008) {
        bVar10 = *puVar11 < *(uint *)register0x00000008;
      }
      uVar4 = (uint)bVar10;
      puVar13 = puVar11;
      if (uVar4 == 0) {
        puVar13 = (uint *)register0x00000008;
      }
      uVar21 = *(undefined8 *)puVar13;
      puVar16[1] = *(undefined8 *)(puVar13 + 2);
      *puVar16 = uVar21;
      puVar11 = puVar11 + (ulong)uVar4 * 4;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + (ulong)(uVar4 ^ 1) * 4 * 4);
      bVar10 = *(ulong *)(puVar17 + 2) < *(ulong *)(puVar12 + 2);
      if (*puVar17 != *puVar12) {
        bVar10 = *puVar17 < *puVar12;
      }
      uVar4 = (uint)bVar10;
      puVar13 = puVar12;
      if (uVar4 == 0) {
        puVar13 = puVar17;
      }
      uVar21 = *(undefined8 *)puVar13;
      ((undefined8 *)((long)unaff_x19 + lVar19))[1] = *(undefined8 *)(puVar13 + 2);
      *(undefined8 *)((long)unaff_x19 + lVar19) = uVar21;
      puVar13 = puVar17 + (ulong)uVar4 * 4;
      puVar17 = puVar13 + -4;
      puVar12 = puVar12 + (ulong)uVar4 * -4;
      unaff_x21 = unaff_x21 - 1;
      puVar5 = puVar16 + 2;
    } while (unaff_x21 != 0);
    if ((param_3 & 1) != 0) {
      bVar10 = puVar12 + 4 <= register0x00000008;
      puVar17 = (uint *)register0x00000008;
      if (bVar10) {
        puVar17 = puVar11;
      }
      uVar21 = *(undefined8 *)puVar17;
      puVar16[3] = *(undefined8 *)(puVar17 + 2);
      puVar16[2] = uVar21;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + (ulong)!bVar10 * 4 * 4);
      puVar11 = puVar11 + (ulong)bVar10 * 4;
    }
    if ((uint *)register0x00000008 != puVar12 + 4 || puVar11 != puVar13) {
      func_0x007a286c();
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x1d6de0);
      (*pcVar8)();
    }
    return;
  }
  lVar19 = 0x10;
  uVar20 = 4;
  uVar18 = 5;
  puVar17 = puVar11;
  do {
    puVar5 = (undefined8 *)((long)unaff_x19 + uVar20 * 0x10 + unaff_x22);
    uVar21 = *puVar5;
    puVar12 = puVar11 + uVar20 * 4;
    *(undefined8 *)(puVar12 + 2) = puVar5[1];
    *(undefined8 *)puVar12 = uVar21;
    uVar4 = *puVar12;
    uVar20 = *(ulong *)(puVar12 + 2);
    bVar10 = uVar20 < *(ulong *)(puVar12 + -2);
    if (uVar4 != puVar12[-4]) {
      bVar10 = uVar4 < puVar12[-4];
    }
    if (bVar10) {
      puVar12 = puVar17;
      lVar15 = lVar19;
      do {
        puVar13 = puVar12;
        *(undefined8 *)(puVar13 + 0x12) = *(undefined8 *)(puVar13 + 0xe);
        *(undefined8 *)(puVar13 + 0x10) = *(undefined8 *)(puVar13 + 0xc);
        if (lVar15 == 0x40) {
          puVar12 = puVar11;
          goto LAB_001d6c38;
        }
        bVar10 = uVar20 < *(ulong *)(puVar13 + 10);
        if (uVar4 != puVar13[8]) {
          bVar10 = uVar4 < puVar13[8];
        }
        lVar15 = lVar15 + 0x10;
        puVar12 = puVar13 + -4;
      } while (bVar10);
      puVar12 = puVar13 + 0xc;
LAB_001d6c38:
      *puVar12 = uVar4;
      *(ulong *)(puVar12 + 2) = uVar20;
    }
    lVar19 = lVar19 + -0x10;
    puVar17 = puVar17 + 4;
    if (param_3 - unaff_x21 <= uVar18) goto LAB_001d6ce0;
    uVar20 = uVar18;
    uVar18 = uVar18 + 1;
  } while( true );
}

