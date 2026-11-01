
undefined8 * FUN_00086414(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  byte bVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  char *pcVar9;
  byte *pbVar10;
  undefined1 *puVar11;
  undefined8 *unaff_x20;
  long lVar12;
  long lVar13;
  undefined8 *puVar14;
  ulong unaff_x22;
  undefined8 *puVar15;
  undefined1 *unaff_x25;
  undefined8 *puVar16;
  undefined1 auVar17 [16];
  undefined8 uStack_b8;
  ulong uStack_b0;
  undefined8 uStack_a8;
  undefined8 *puStack_a0;
  undefined8 uStack_98;
  long lStack_90;
  undefined8 uStack_88;
  undefined8 *puStack_78;
  undefined8 *puStack_70;
  undefined8 *puStack_68;
  undefined8 *puStack_60;
  long *plStack_58;
  
  __ZdlPv();
  func_0x00078220();
  __Unwind_Resume(param_1);
  auVar17 = func_0x0001753c();
  puVar8 = auVar17._8_8_;
  puVar7 = auVar17._0_8_;
  lVar12 = (long)register0x00000008 + -0x10;
  puVar14 = (undefined8 *)*puVar7;
  puVar15 = (undefined8 *)puVar7[1];
  lVar13 = (long)puVar15 - (long)puVar14 >> 4;
  uVar1 = lVar13 + 1;
  if (uVar1 >> 0x3c != 0) {
    func_0x00017f90(puVar7);
LAB_00086618:
    uVar6 = func_0x00017514();
    __ZdlPv(unaff_x22);
    func_0x00078220(lVar13,*unaff_x25);
    func_0x00078824(&puStack_78);
    __Unwind_Resume(uVar6);
    func_0x0001753c();
    auVar17 = func_0x0001753c();
    puVar15 = auVar17._8_8_;
    puVar14 = auVar17._0_8_;
    uStack_88 = 0x86658;
    puStack_a0 = unaff_x20;
    uStack_98 = uVar6;
    lStack_90 = lVar12;
    if (puVar14[1] == puVar14[2]) {
      uVar6 = *puVar15;
      pbVar10 = (byte *)*puVar14;
      bVar4 = *pbVar10;
      *pbVar10 = 6;
      uStack_b0 = (ulong)bVar4;
      uStack_a8 = *(undefined8 *)(pbVar10 + 8);
      *(undefined8 *)(pbVar10 + 8) = uVar6;
      func_0x00078220(&uStack_a8);
      return (undefined8 *)*puVar14;
    }
    pcVar9 = *(char **)(puVar14[2] + -8);
    if (*pcVar9 != '\x02') {
      uVar6 = *puVar15;
      puVar11 = (undefined1 *)puVar14[4];
      *puVar11 = 6;
      uStack_b8 = *(undefined8 *)(puVar11 + 8);
      *(undefined8 *)(puVar11 + 8) = uVar6;
      func_0x00078220(&uStack_b8);
      return (undefined8 *)puVar14[4];
    }
    lVar12 = *(long *)(pcVar9 + 8);
    puVar7 = *(undefined8 **)(lVar12 + 8);
    if (puVar7 < *(undefined8 **)(lVar12 + 0x10)) {
      *puVar7 = 0;
      puVar7[1] = 0;
      uVar6 = *puVar15;
      *(undefined1 *)puVar7 = 6;
      puVar7[1] = uVar6;
      puVar7 = puVar7 + 2;
    }
    else {
      puVar7 = (undefined8 *)func_0x0008677c(lVar12);
    }
    *(undefined8 **)(lVar12 + 8) = puVar7;
    return (undefined8 *)(*(long *)(*(long *)(*(long *)(puVar14[2] + -8) + 8) + 8) + -0x10);
  }
  plStack_58 = puVar7 + 2;
  unaff_x22 = *plStack_58 - (long)puVar14 >> 3;
  if (unaff_x22 <= uVar1) {
    unaff_x22 = uVar1;
  }
  if (0x7fffffffffffffef < (ulong)(*plStack_58 - (long)puVar14)) {
    unaff_x22 = 0xfffffffffffffff;
  }
  if (unaff_x22 == 0) {
    puStack_78 = (undefined8 *)0x0;
  }
  else {
    unaff_x20 = puVar8;
    if (unaff_x22 >> 0x3c != 0) goto LAB_00086618;
    puStack_78 = (undefined8 *)__Znwm(unaff_x22 << 4);
  }
  puVar2 = puStack_78 + lVar13 * 2;
  puVar3 = puStack_78 + unaff_x22 * 2;
  puVar2[1] = 0;
  *puVar2 = 0;
  *(undefined1 *)puVar2 = 3;
  puStack_70 = puVar2;
  puStack_68 = puVar2;
  puStack_60 = puVar3;
  puVar5 = (undefined8 *)__Znwm(0x18);
  puVar16 = puVar2;
  if (*(char *)((long)puVar8 + 0x17) < '\0') {
    func_0x00017634(puVar5,*puVar8,puVar8[1]);
    puVar14 = (undefined8 *)*puVar7;
    puVar15 = (undefined8 *)puVar7[1];
    puVar2[1] = puVar5;
    if (puVar15 != puVar14) goto LAB_00086584;
  }
  else {
    uVar6 = *puVar8;
    puVar5[1] = puVar8[1];
    *puVar5 = uVar6;
    puVar5[2] = puVar8[2];
    puVar2[1] = puVar5;
    if (puVar15 != puVar14) {
LAB_00086584:
      do {
        uVar6 = puVar15[-2];
        puVar16[-1] = puVar15[-1];
        puVar16[-2] = uVar6;
        puVar16 = puVar16 + -2;
        *(undefined1 *)(puVar15 + -2) = 0;
        puVar15[-1] = 0;
        puVar15 = puVar15 + -2;
      } while (puVar15 != puVar14);
      puVar14 = (undefined8 *)*puVar7;
      puVar15 = (undefined8 *)puVar7[1];
      goto LAB_000865b4;
    }
  }
  puVar15 = puVar14;
LAB_000865b4:
  *puVar7 = puVar16;
  puVar7[1] = puVar2 + 2;
  puStack_60 = (undefined8 *)puVar7[2];
  puVar7[2] = puVar3;
  puStack_78 = puVar14;
  puStack_70 = puVar14;
  while (puVar15 != puVar14) {
    puVar7 = puVar15 + -2;
    puStack_68 = puVar7;
    func_0x00078220(puVar15 + -1,*(undefined1 *)puVar7);
    puVar15 = puVar7;
  }
  if (puStack_78 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  return puVar2 + 2;
}

