
undefined8 FUN_0070057c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  char cVar2;
  byte bVar3;
  code cVar4;
  uint uVar5;
  undefined8 uVar6;
  long lVar7;
  long *plVar8;
  int iVar9;
  long *plVar10;
  undefined8 *puVar11;
  code *pcVar12;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined4 *puVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  undefined1 auVar31 [16];
  undefined1 auStack_1a8 [36];
  undefined4 uStack_184;
  ulong uStack_178;
  long lStack_70;
  
  ___cxa_guard_abort(0xa28b90);
  uVar6 = __Unwind_Resume(param_1);
  ___cxa_guard_abort(0xa28b80);
  uVar6 = __Unwind_Resume(uVar6);
  ___cxa_guard_abort(0xa28b70);
  auVar31 = __Unwind_Resume(uVar6);
  lVar7 = auVar31._0_8_;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar25 = *(long *)(lVar7 + 0x10);
  puVar11 = *(undefined8 **)(lVar7 + 0x20);
  lVar29 = puVar11[2];
  cVar2 = *(char *)(lVar7 + 3);
  if (cVar2 == '\x06' || cVar2 == '\x01') {
    *(undefined1 *)(lVar7 + 3) = 0;
    *(undefined8 *)(lVar7 + 0x10) = *puVar11;
  }
  lVar26 = *(long *)(lVar7 + 0x30);
  lVar28 = *(long *)(lVar7 + 8);
  lVar30 = *(long *)puVar11[1];
  lVar27 = puVar11[3];
  if ((lVar27 != 0) &&
     (lVar27 != *(long *)(*(long *)(lVar30 + 0x18) + 0x10) +
                (long)*(int *)(*(long *)(lVar30 + 0x18) + 0x88) * 4)) {
    puVar11[3] = lVar27 + 4;
  }
  uVar24 = param_3;
  lVar14 = lVar28;
  if (*(long *)(lVar7 + 0x28) - lVar28 < 0x141) {
    func_0x006ee1d4(lVar7,0x14);
    lVar14 = *(long *)(lVar7 + 8);
    puVar11 = *(undefined8 **)(lVar7 + 0x20);
  }
  puVar11[2] = lVar14 + 0x140;
  if (*(char *)(lVar30 + 3) == '\0') {
    lVar14 = puVar11[3];
    if (lVar14 == 0) {
      iVar9 = 0;
    }
    else {
      lVar15 = *(long *)(*(long *)(lVar30 + 0x18) + 0x10);
      iVar9 = 0;
      if (lVar14 != lVar15) {
        iVar9 = (int)((ulong)(lVar14 - lVar15) >> 2) + -1;
      }
    }
    uStack_184 = func_0x006ed460(*(long *)(lVar30 + 0x18),iVar9);
  }
  else {
    uStack_184 = 0xffffffff;
  }
  uStack_178 = param_3;
  uVar6 = (*auVar31._8_8_)(lVar7,auStack_1a8);
  lVar30 = *(long *)(lVar7 + 0x20);
  *(long *)(lVar30 + 0x18) = lVar27;
  lVar27 = *(long *)(lVar7 + 0x30);
  *(long *)(lVar30 + 0x10) = lVar27 + (lVar29 - lVar26);
  *(long *)(lVar7 + 8) = lVar27 + (lVar28 - lVar26);
  if ((cVar2 == '\x06') || ((cVar2 == '\x01' && (*(char *)(lVar7 + 3) != '\x01')))) {
    *(char *)(lVar7 + 3) = cVar2;
    *(long *)(lVar7 + 0x10) = lVar27 + (lVar25 - lVar26);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
    return uVar6;
  }
  auVar31 = ___stack_chk_fail();
  plVar10 = auVar31._8_8_;
  lVar7 = auVar31._0_8_;
  if (*(int *)((long)plVar10 + 0xc) != 7) {
    func_0x007048fc(lVar7,plVar10);
  }
  lVar25 = *plVar10;
  if (*(long *)(lVar7 + 0x20) == *(long *)(lVar7 + 0x38)) {
    plVar8 = (long *)func_0x006ee1f8(lVar7);
  }
  else {
    plVar8 = (long *)(*(long *)(lVar7 + 0x20) + 0x28);
    *(long **)(lVar7 + 0x20) = plVar8;
  }
  *plVar8 = (long)(plVar10 + 2);
  plVar8[1] = (long)plVar10;
  lVar29 = *(long *)(lVar7 + 8);
  bVar3 = *(byte *)(lVar25 + 5);
  plVar8[2] = lVar29 + (ulong)bVar3 * 0x10;
  plVar8[3] = 0;
  *(int *)(plVar8 + 4) = (int)uVar24;
  *(undefined4 *)((long)plVar8 + 0x24) = 0;
  *(long **)(lVar7 + 0x10) = plVar10 + 2;
  if (*(long *)(lVar7 + 0x28) - lVar29 <= (long)((ulong)bVar3 * 0x10)) {
    uVar5 = *(uint *)(lVar7 + 0x48) ^ (uint)(uint *)(lVar7 + 0x48);
    iVar9 = uVar5 + bVar3;
    if ((int)(uint)bVar3 <= (int)uVar5) {
      iVar9 = uVar5 << 1;
    }
    func_0x006edfb0(lVar7,iVar9,1);
  }
  pcVar12 = *(code **)(lVar25 + 0x18);
  if (*(char *)(lVar25 + 3) != '\0') {
    uVar5 = (*pcVar12)(lVar7);
    if ((int)uVar5 < 0) {
      return 2;
    }
    puVar13 = (undefined8 *)(*(long *)(lVar7 + 0x20) + -0x28);
    puVar11 = *(undefined8 **)(*(long *)(lVar7 + 0x20) + 8);
    if (((int)uVar24 != 0) && (uVar5 != 0)) {
      puVar18 = *(undefined8 **)(lVar7 + 8);
      puVar16 = puVar11;
      puVar20 = puVar18 + (ulong)uVar5 * -2;
      do {
        puVar19 = puVar20 + 2;
        uVar6 = *puVar20;
        puVar11 = puVar16 + 2;
        puVar16[1] = puVar20[1];
        *puVar16 = uVar6;
        uVar5 = (int)uVar24 - 1;
        uVar24 = (ulong)uVar5;
        if (uVar5 == 0) break;
        puVar16 = puVar11;
        puVar20 = puVar19;
      } while (puVar19 < puVar18);
    }
    uVar5 = (uint)uVar24;
    if (0 < (int)uVar5) {
      if (uVar5 < 4) {
        puVar16 = puVar11;
      }
      else {
        uVar22 = uVar24 & 0xfffffffc;
        uVar5 = uVar5 - (int)uVar22;
        puVar16 = puVar11 + uVar22 * 2;
        puVar17 = (undefined4 *)((long)puVar11 + 0x2c);
        uVar21 = uVar22;
        do {
          puVar17[-8] = 0;
          puVar17[-4] = 0;
          *puVar17 = 0;
          puVar17[4] = 0;
          puVar17 = puVar17 + 0x10;
          uVar21 = uVar21 - 4;
        } while (uVar21 != 0);
        puVar11 = puVar16;
        if (uVar22 == (uVar24 & 0xffffffff)) goto code_r0x007009e0;
      }
      uVar5 = uVar5 + 1;
      do {
        *(undefined4 *)((long)puVar16 + 0xc) = 0;
        uVar5 = uVar5 - 1;
        puVar11 = puVar16 + 2;
        puVar16 = puVar16 + 2;
      } while (1 < uVar5);
    }
code_r0x007009e0:
    *(undefined8 **)(lVar7 + 0x20) = puVar13;
    uVar6 = *puVar13;
    *(undefined8 **)(lVar7 + 8) = puVar11;
    *(undefined8 *)(lVar7 + 0x10) = uVar6;
    return 1;
  }
  uVar21 = *(ulong *)(lVar7 + 8);
  uVar24 = *(long *)(lVar7 + 0x10) + (ulong)(byte)pcVar12[4] * 0x10;
  if (uVar24 <= uVar21) {
    cVar4 = pcVar12[5];
    uVar22 = uVar21;
    goto joined_r0x00700970;
  }
  uVar22 = uVar24;
  if (uVar24 <= uVar21 + 0x10) {
    uVar22 = uVar21 + 0x10;
  }
  if (uVar22 + ~uVar21 < 0x30) {
code_r0x00700910:
    do {
      uVar22 = uVar21 + 0x10;
      *(undefined4 *)(uVar21 + 0xc) = 0;
      uVar21 = uVar22;
    } while (uVar22 < uVar24);
  }
  else {
    uVar1 = (uVar22 + ~uVar21 >> 4) + 1;
    uVar23 = uVar1 & 0x1ffffffffffffffc;
    uVar22 = uVar21 + uVar23 * 0x10;
    puVar17 = (undefined4 *)(uVar21 + 0x2c);
    uVar21 = uVar23;
    do {
      puVar17[-8] = 0;
      puVar17[-4] = 0;
      *puVar17 = 0;
      puVar17[4] = 0;
      puVar17 = puVar17 + 0x10;
      uVar21 = uVar21 - 4;
    } while (uVar21 != 0);
    uVar21 = uVar22;
    if (uVar1 != uVar23) goto code_r0x00700910;
  }
  cVar4 = pcVar12[5];
joined_r0x00700970:
  if (cVar4 == (code)0x0) {
    uVar22 = plVar8[2];
  }
  *(ulong *)(lVar7 + 8) = uVar22;
  plVar8[3] = *(long *)(pcVar12 + 0x10);
  return 0;
}

