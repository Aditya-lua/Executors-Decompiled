
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_006b172c(undefined8 param_1)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  long *plVar6;
  uint *puVar7;
  ulong uVar8;
  long lVar9;
  undefined8 in_x9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  uint *puVar13;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 unaff_x24;
  undefined8 *puVar16;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined1 auVar24 [16];
  
  *(undefined8 *)(unaff_x19 + 0xa0) = in_x9;
  *(undefined8 *)(unaff_x19 + 0xa8) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0xb0) = param_1;
  if (unaff_x22 != 0) {
    __ZdlPv();
  }
  iVar5 = (int)((ulong)(unaff_x26 - unaff_x25) >> 2) * 0x3e0f83e1;
  *(undefined8 *)(unaff_x19 + 0xa8) = unaff_x24;
  puVar14 = *(undefined8 **)(unaff_x19 + 0x60);
  if (puVar14 < *(undefined8 **)(unaff_x19 + 0x68)) {
    *puVar14 = 6;
    *(int *)(puVar14 + 1) = iVar5;
    *(undefined8 *)((long)puVar14 + 0xc) = _UNK_008c6dcc;
    *(undefined4 *)((long)puVar14 + 0x14) = _UNK_008c6dd4;
    puVar16 = puVar14 + 3;
  }
  else {
    puVar15 = (undefined8 *)*unaff_x21;
    lVar11 = (long)puVar14 - (long)puVar15 >> 3;
    uVar8 = lVar11 * -0x5555555555555555 + 1;
    if (0xaaaaaaaaaaaaaaa < uVar8) {
code_r0x006b17ec:
      auVar24 = func_0x00017f90();
      puVar7 = auVar24._8_8_;
      plVar6 = auVar24._0_8_;
      if (((ulong)plVar6[2] < (ulong)(plVar6[1] * 3) >> 2) ||
         (lVar11 = func_0x006bbbf4(plVar6,puVar7), lVar11 != 0)) {
        lVar11 = plVar6[1];
        uVar2 = puVar7[0x20];
      }
      else {
        func_0x006bbd18(plVar6);
        lVar11 = plVar6[1];
        uVar2 = puVar7[0x20];
      }
      uVar8 = 0x811c9dc5;
      if (uVar2 != 0) {
        uVar8 = 0x811c9dc5;
        puVar13 = puVar7;
        uVar12 = (ulong)uVar2;
        do {
          uVar8 = (ulong)((*puVar13 ^ (uint)uVar8) * 0x1000193);
          uVar12 = uVar12 - 1;
          puVar13 = puVar13 + 1;
        } while (uVar12 != 0);
      }
      uVar12 = 0;
      lVar9 = *plVar6;
      uVar3 = *(uint *)(plVar6 + 0x13);
      do {
        uVar8 = uVar8 & lVar11 - 1U;
        puVar14 = (undefined8 *)(lVar9 + uVar8 * 0x88);
        uVar4 = *(uint *)(puVar14 + 0x10);
        if ((uVar4 == uVar3) && (iVar5 = _memcmp(puVar14,plVar6 + 3,(ulong)uVar3 << 2), iVar5 == 0))
        {
          uVar17 = *(undefined8 *)puVar7;
          puVar14[1] = *(undefined8 *)(puVar7 + 2);
          *puVar14 = uVar17;
          uVar18 = *(undefined8 *)(puVar7 + 6);
          uVar17 = *(undefined8 *)(puVar7 + 4);
          uVar20 = *(undefined8 *)(puVar7 + 10);
          uVar19 = *(undefined8 *)(puVar7 + 8);
          uVar21 = *(undefined8 *)(puVar7 + 0xc);
          uVar23 = *(undefined8 *)(puVar7 + 0x12);
          uVar22 = *(undefined8 *)(puVar7 + 0x10);
          puVar14[7] = *(undefined8 *)(puVar7 + 0xe);
          puVar14[6] = uVar21;
          puVar14[9] = uVar23;
          puVar14[8] = uVar22;
          puVar14[3] = uVar18;
          puVar14[2] = uVar17;
          puVar14[5] = uVar20;
          puVar14[4] = uVar19;
          uVar18 = *(undefined8 *)(puVar7 + 0x16);
          uVar17 = *(undefined8 *)(puVar7 + 0x14);
          uVar20 = *(undefined8 *)(puVar7 + 0x1a);
          uVar19 = *(undefined8 *)(puVar7 + 0x18);
          uVar22 = *(undefined8 *)(puVar7 + 0x1e);
          uVar21 = *(undefined8 *)(puVar7 + 0x1c);
          *(uint *)(puVar14 + 0x10) = puVar7[0x20];
          puVar14[0xd] = uVar20;
          puVar14[0xc] = uVar19;
          puVar14[0xf] = uVar22;
          puVar14[0xe] = uVar21;
          puVar14[0xb] = uVar18;
          puVar14[10] = uVar17;
          plVar6[2] = plVar6[2] + 1;
          goto code_r0x006b1944;
        }
        if ((uVar4 == uVar2) && (iVar5 = _memcmp(puVar14,puVar7,(ulong)uVar2 << 2), iVar5 == 0))
        goto code_r0x006b1944;
        uVar12 = uVar12 + 1;
        uVar8 = uVar12 + uVar8;
      } while (uVar12 <= lVar11 - 1U);
      puVar14 = (undefined8 *)0x0;
code_r0x006b1944:
      return (long)puVar14 + 0x84;
    }
    lVar9 = (long)*(undefined8 **)(unaff_x19 + 0x68) - (long)puVar15 >> 3;
    uVar12 = lVar9 * 0x5555555555555556;
    if (uVar12 <= uVar8) {
      uVar12 = uVar8;
    }
    if (0x555555555555554 < (ulong)(lVar9 * -0x5555555555555555)) {
      uVar12 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar12 == 0) {
      lVar9 = 0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar12) {
        func_0x00017514();
        func_0x00017f90(puVar15);
        goto code_r0x006b17ec;
      }
      lVar9 = __Znwm(uVar12 * 0x18);
    }
    puVar10 = (undefined8 *)(lVar9 + lVar11 * 8);
    *puVar10 = 6;
    *(int *)(puVar10 + 1) = iVar5;
    *(undefined8 *)((long)puVar10 + 0xc) = _UNK_008c6dcc;
    *(undefined4 *)((long)puVar10 + 0x14) = _UNK_008c6dd4;
    puVar16 = puVar10 + 3;
    if (puVar14 != puVar15) {
      do {
        uVar18 = puVar14[-2];
        uVar17 = puVar14[-3];
        puVar1 = puVar14 + -1;
        puVar14 = puVar14 + -3;
        puVar10[-1] = *puVar1;
        puVar10[-2] = uVar18;
        puVar10[-3] = uVar17;
        puVar10 = puVar10 + -3;
      } while (puVar14 != puVar15);
      puVar14 = (undefined8 *)*unaff_x21;
    }
    *(undefined8 **)(unaff_x19 + 0x58) = puVar10;
    *(undefined8 **)(unaff_x19 + 0x60) = puVar16;
    *(ulong *)(unaff_x19 + 0x68) = lVar9 + uVar12 * 0x18;
    if (puVar14 != (undefined8 *)0x0) {
      __ZdlPv(puVar14);
    }
  }
  *(undefined8 **)(unaff_x19 + 0x60) = puVar16;
  return unaff_x20;
}

