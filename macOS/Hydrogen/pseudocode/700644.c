
undefined8 FUN_00700644(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  byte bVar2;
  code cVar3;
  uint uVar4;
  undefined8 uVar5;
  long *plVar6;
  int iVar7;
  long *plVar8;
  code *pcVar9;
  undefined8 *puVar10;
  long in_x9;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined4 *puVar15;
  long lVar16;
  undefined8 *puVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  long unaff_x19;
  code *unaff_x20;
  long unaff_x22;
  int unaff_w23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar24 [16];
  undefined4 uStack000000000000002c;
  
  if (unaff_x25 != *(long *)(in_x9 + 0x10) + (long)*(int *)(in_x9 + 0x88) * 4) {
    *(long *)(param_1 + 0x18) = unaff_x25 + 4;
  }
  lVar11 = unaff_x26;
  if (*(long *)(unaff_x19 + 0x28) - unaff_x26 < 0x141) {
    func_0x006ee1d4();
    lVar11 = *(long *)(unaff_x19 + 8);
    param_1 = *(long *)(unaff_x19 + 0x20);
  }
  *(long *)(param_1 + 0x10) = lVar11 + 0x140;
  if (*(char *)(unaff_x28 + 3) == '\0') {
    lVar11 = *(long *)(param_1 + 0x18);
    if (lVar11 == 0) {
      iVar7 = 0;
    }
    else {
      lVar12 = *(long *)(*(long *)(unaff_x28 + 0x18) + 0x10);
      iVar7 = 0;
      if (lVar11 != lVar12) {
        iVar7 = (int)((ulong)(lVar11 - lVar12) >> 2) + -1;
      }
    }
    uStack000000000000002c = func_0x006ed460(*(long *)(unaff_x28 + 0x18),iVar7);
  }
  else {
    uStack000000000000002c = 0xffffffff;
  }
  uVar5 = (*unaff_x20)();
  lVar12 = *(long *)(unaff_x19 + 0x20);
  *(long *)(lVar12 + 0x18) = unaff_x25;
  lVar11 = *(long *)(unaff_x19 + 0x30);
  *(long *)(lVar12 + 0x10) = lVar11 + (unaff_x27 - unaff_x24);
  *(long *)(unaff_x19 + 8) = lVar11 + (unaff_x26 - unaff_x24);
  if ((unaff_w23 == 6) || ((unaff_w23 == 1 && (*(char *)(unaff_x19 + 3) != '\x01')))) {
    *(char *)(unaff_x19 + 3) = (char)unaff_w23;
    *(long *)(unaff_x19 + 0x10) = lVar11 + (unaff_x22 - unaff_x24);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar5;
  }
  auVar24 = ___stack_chk_fail();
  plVar8 = auVar24._8_8_;
  lVar11 = auVar24._0_8_;
  if (*(int *)((long)plVar8 + 0xc) != 7) {
    func_0x007048fc(lVar11,plVar8);
  }
  lVar12 = *plVar8;
  if (*(long *)(lVar11 + 0x20) == *(long *)(lVar11 + 0x38)) {
    plVar6 = (long *)func_0x006ee1f8(lVar11);
  }
  else {
    plVar6 = (long *)(*(long *)(lVar11 + 0x20) + 0x28);
    *(long **)(lVar11 + 0x20) = plVar6;
  }
  *plVar6 = (long)(plVar8 + 2);
  plVar6[1] = (long)plVar8;
  lVar16 = *(long *)(lVar11 + 8);
  bVar2 = *(byte *)(lVar12 + 5);
  plVar6[2] = lVar16 + (ulong)bVar2 * 0x10;
  plVar6[3] = 0;
  *(int *)(plVar6 + 4) = (int)param_4;
  *(undefined4 *)((long)plVar6 + 0x24) = 0;
  *(long **)(lVar11 + 0x10) = plVar8 + 2;
  if (*(long *)(lVar11 + 0x28) - lVar16 <= (long)((ulong)bVar2 * 0x10)) {
    uVar4 = *(uint *)(lVar11 + 0x48) ^ (uint)(uint *)(lVar11 + 0x48);
    iVar7 = uVar4 + bVar2;
    if ((int)(uint)bVar2 <= (int)uVar4) {
      iVar7 = uVar4 << 1;
    }
    func_0x006edfb0(lVar11,iVar7,1);
  }
  pcVar9 = *(code **)(lVar12 + 0x18);
  if (*(char *)(lVar12 + 3) != '\0') {
    uVar4 = (*pcVar9)(lVar11);
    if ((int)uVar4 < 0) {
      return 2;
    }
    puVar10 = (undefined8 *)(*(long *)(lVar11 + 0x20) + -0x28);
    puVar13 = *(undefined8 **)(*(long *)(lVar11 + 0x20) + 8);
    if (((int)param_4 != 0) && (uVar4 != 0)) {
      puVar17 = *(undefined8 **)(lVar11 + 8);
      puVar14 = puVar13;
      puVar20 = puVar17 + (ulong)uVar4 * -2;
      do {
        puVar19 = puVar20 + 2;
        uVar5 = *puVar20;
        puVar13 = puVar14 + 2;
        puVar14[1] = puVar20[1];
        *puVar14 = uVar5;
        uVar4 = (int)param_4 - 1;
        param_4 = (ulong)uVar4;
        if (uVar4 == 0) break;
        puVar14 = puVar13;
        puVar20 = puVar19;
      } while (puVar19 < puVar17);
    }
    uVar4 = (uint)param_4;
    if (0 < (int)uVar4) {
      if (uVar4 < 4) {
        puVar14 = puVar13;
      }
      else {
        uVar21 = param_4 & 0xfffffffc;
        uVar4 = uVar4 - (int)uVar21;
        puVar14 = puVar13 + uVar21 * 2;
        puVar15 = (undefined4 *)((long)puVar13 + 0x2c);
        uVar23 = uVar21;
        do {
          puVar15[-8] = 0;
          puVar15[-4] = 0;
          *puVar15 = 0;
          puVar15[4] = 0;
          puVar15 = puVar15 + 0x10;
          uVar23 = uVar23 - 4;
        } while (uVar23 != 0);
        puVar13 = puVar14;
        if (uVar21 == (param_4 & 0xffffffff)) goto code_r0x007009e0;
      }
      uVar4 = uVar4 + 1;
      do {
        *(undefined4 *)((long)puVar14 + 0xc) = 0;
        uVar4 = uVar4 - 1;
        puVar13 = puVar14 + 2;
        puVar14 = puVar14 + 2;
      } while (1 < uVar4);
    }
code_r0x007009e0:
    *(undefined8 **)(lVar11 + 0x20) = puVar10;
    uVar5 = *puVar10;
    *(undefined8 **)(lVar11 + 8) = puVar13;
    *(undefined8 *)(lVar11 + 0x10) = uVar5;
    return 1;
  }
  uVar21 = *(ulong *)(lVar11 + 8);
  uVar23 = *(long *)(lVar11 + 0x10) + (ulong)(byte)pcVar9[4] * 0x10;
  if (uVar23 <= uVar21) {
    cVar3 = pcVar9[5];
    uVar18 = uVar21;
    goto joined_r0x00700970;
  }
  uVar18 = uVar23;
  if (uVar23 <= uVar21 + 0x10) {
    uVar18 = uVar21 + 0x10;
  }
  if (uVar18 + ~uVar21 < 0x30) {
code_r0x00700910:
    do {
      uVar18 = uVar21 + 0x10;
      *(undefined4 *)(uVar21 + 0xc) = 0;
      uVar21 = uVar18;
    } while (uVar18 < uVar23);
  }
  else {
    uVar1 = (uVar18 + ~uVar21 >> 4) + 1;
    uVar22 = uVar1 & 0x1ffffffffffffffc;
    uVar18 = uVar21 + uVar22 * 0x10;
    puVar15 = (undefined4 *)(uVar21 + 0x2c);
    uVar21 = uVar22;
    do {
      puVar15[-8] = 0;
      puVar15[-4] = 0;
      *puVar15 = 0;
      puVar15[4] = 0;
      puVar15 = puVar15 + 0x10;
      uVar21 = uVar21 - 4;
    } while (uVar21 != 0);
    uVar21 = uVar18;
    if (uVar1 != uVar22) goto code_r0x00700910;
  }
  cVar3 = pcVar9[5];
joined_r0x00700970:
  if (cVar3 == (code)0x0) {
    uVar18 = plVar6[2];
  }
  *(ulong *)(lVar11 + 8) = uVar18;
  plVar6[3] = *(long *)(pcVar9 + 0x10);
  return 0;
}

