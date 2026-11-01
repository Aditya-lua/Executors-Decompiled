
void FUN_006c34e8(void)

{
  ulong *puVar1;
  undefined8 *puVar2;
  uint uVar3;
  uint uVar4;
  code *pcVar5;
  bool in_CY;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  char *pcVar11;
  ulong uVar12;
  ulong *puVar13;
  long lVar14;
  uint uVar15;
  long in_x9;
  long lVar16;
  ulong *puVar17;
  byte bVar18;
  byte bVar19;
  bool bVar20;
  ulong uVar21;
  ulong uVar22;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong *unaff_x22;
  ulong *puVar23;
  ulong uVar24;
  undefined1 auVar25 [16];
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  
  if (in_CY) {
    puVar2 = unaff_x19 + 0x9d;
    puVar13 = (ulong *)*puVar2;
    lVar14 = (long)unaff_x22 - (long)puVar13 >> 3;
    uVar24 = lVar14 * -0x5555555555555555 + 1;
    if (0xaaaaaaaaaaaaaaa < uVar24) {
      func_0x00017f90(puVar2);
      goto code_r0x006c3a20;
    }
    lVar16 = in_x9 - (long)puVar13 >> 3;
    uVar21 = lVar16 * 0x5555555555555556;
    if (uVar21 <= uVar24) {
      uVar21 = uVar24;
    }
    if (0x555555555555554 < (ulong)(lVar16 * -0x5555555555555555)) {
      uVar21 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar21 == 0) {
      lVar16 = 0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar21) {
        func_0x00017514();
        goto code_r0x006c3a20;
      }
      lVar16 = __Znwm(uVar21 * 0x18);
    }
    puVar17 = (ulong *)(lVar16 + lVar14 * 8);
    *puVar17 = unaff_x21;
    puVar17[1] = unaff_x21;
    puVar17[2] = 0;
    puVar23 = puVar17 + 3;
    if (unaff_x22 != puVar13) {
      do {
        uVar22 = unaff_x22[-2];
        uVar24 = unaff_x22[-3];
        puVar1 = unaff_x22 + -1;
        unaff_x22 = unaff_x22 + -3;
        puVar17[-1] = *puVar1;
        puVar17[-2] = uVar22;
        puVar17[-3] = uVar24;
        puVar17 = puVar17 + -3;
      } while (unaff_x22 != puVar13);
      unaff_x22 = (ulong *)*puVar2;
    }
    unaff_x19[0x9d] = puVar17;
    unaff_x19[0x9e] = puVar23;
    unaff_x19[0x9f] = lVar16 + uVar21 * 0x18;
    if (unaff_x22 != (ulong *)0x0) {
      __ZdlPv(unaff_x22);
    }
  }
  else {
    *unaff_x22 = unaff_x21;
    unaff_x22[1] = unaff_x21;
    puVar23 = unaff_x22 + 3;
    unaff_x22[2] = 0;
  }
  unaff_x19[0x9e] = puVar23;
  *(undefined1 *)(unaff_x19 + 0x93) = 1;
  uVar4 = *(uint *)((long)unaff_x19 + 0x484);
  uVar15 = uVar4 + 3;
  if (0xff < uVar15) {
    func_0x006bc388(unaff_x20 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
    goto code_r0x006c3a20;
  }
  *(uint *)((long)unaff_x19 + 0x484) = uVar15;
  uVar3 = *(uint *)(unaff_x19 + 0x91);
  if (*(uint *)(unaff_x19 + 0x91) <= uVar15) {
    uVar3 = uVar15;
  }
  *(uint *)(unaff_x19 + 0x91) = uVar3;
  func_0x006cba58();
  uVar15 = *(uint *)(unaff_x20 + 0x28);
  if (uVar15 < 3) {
    uVar15 = 2;
  }
  uVar15 = uVar15 + *(int *)((long)unaff_x19 + 0x484);
  if (0xff < uVar15) {
    func_0x006bc388(unaff_x20 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
    goto code_r0x006c3a20;
  }
  *(uint *)((long)unaff_x19 + 0x484) = uVar15;
  uVar3 = *(uint *)(unaff_x19 + 0x91);
  if (*(uint *)(unaff_x19 + 0x91) <= uVar15) {
    uVar3 = uVar15;
  }
  *(uint *)(unaff_x19 + 0x91) = uVar3;
  func_0x006b3150(*unaff_x19);
  if ((*(int *)(unaff_x19 + 1) < 1) || (2 < *(ulong *)(unaff_x20 + 0x28))) {
LAB_006c36ec:
    iVar6 = 0x4c;
  }
  else if (*(long *)(unaff_x20 + 0x38) == 2) {
    auVar25 = func_0x006d1ff8(**(undefined8 **)(unaff_x20 + 0x30),unaff_x19 + 0x16,unaff_x19 + 0x1b)
    ;
    lVar14 = auVar25._8_8_;
    iVar6 = 0x4c;
    if ((auVar25._0_8_ == 0) && (lVar14 != 0)) {
      pcVar11 = "next";
LAB_006c39a0:
      iVar7 = _strcmp(lVar14,pcVar11);
      iVar6 = 0x3d;
      if (iVar7 != 0) {
        iVar6 = 0x4c;
      }
    }
  }
  else {
    if ((*(long *)(unaff_x20 + 0x38) != 1) ||
       (lVar14 = **(long **)(unaff_x20 + 0x30), *(int *)(lVar14 + 8) != iRam0000000000a27ac8))
    goto LAB_006c36ec;
    auVar25 = func_0x006d1ff8(*(undefined8 *)(lVar14 + 0x20),unaff_x19 + 0x16,unaff_x19 + 0x1b);
    lVar14 = auVar25._8_8_;
    iVar6 = 0x4c;
    if ((auVar25._0_8_ == 0) && (lVar14 != 0)) {
      iVar6 = _strcmp(lVar14,"ipairs");
      if (iVar6 != 0) {
        pcVar11 = "pairs";
        goto LAB_006c39a0;
      }
      iVar6 = 0x3b;
    }
  }
  uVar8 = func_0x006b2784(*unaff_x19);
  func_0x006b1f78(*unaff_x19,iVar6,uVar4 & 0xff,0);
  uVar9 = func_0x006b2784(*unaff_x19);
  if (*(long *)(unaff_x20 + 0x28) != 0) {
    uVar24 = 0;
    do {
      func_0x006bea90();
      uVar24 = uVar24 + 1;
    } while (uVar24 < *(ulong *)(unaff_x20 + 0x28));
  }
  func_0x006bed0c();
  uVar24 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
  if ((unaff_x21 < uVar24) && (unaff_x19[0x13] != 0)) {
    bVar20 = false;
    bVar18 = 0xff;
LAB_006c3794:
    do {
      uVar21 = *(ulong *)(unaff_x19[0x94] + unaff_x21 * 8);
      if (uVar21 != unaff_x19[0x14]) {
        uVar22 = 0;
        uVar12 = uVar21 >> 4 ^ uVar21 >> 9;
        do {
          uVar12 = uVar12 & unaff_x19[0x12] - 1;
          puVar13 = (ulong *)(unaff_x19[0x11] + uVar12 * 0x18);
          if (*puVar13 == uVar21) goto LAB_006c37e4;
          if (*puVar13 == unaff_x19[0x14]) break;
          uVar22 = uVar22 + 1;
          uVar12 = uVar22 + uVar12;
        } while (uVar22 <= unaff_x19[0x12] - 1);
      }
      puVar13 = (ulong *)0x0;
LAB_006c37e4:
      puVar23 = (ulong *)0x0;
      if (puVar13 != (ulong *)0x0) {
        puVar23 = puVar13 + 1;
      }
      if (*(byte *)((long)puVar23 + 2) == 0) {
        unaff_x21 = unaff_x21 + 1;
        if (unaff_x21 == uVar24) {
          bVar19 = bVar18;
          if (!bVar20) goto LAB_006c3848;
          break;
        }
        goto LAB_006c3794;
      }
      bVar19 = (byte)*puVar23;
      if (bVar18 <= (byte)*puVar23) {
        bVar19 = bVar18;
      }
      unaff_x21 = unaff_x21 + 1;
      bVar20 = true;
      bVar18 = bVar19;
    } while (unaff_x21 != uVar24);
    func_0x006b1ccc(*unaff_x19,0xb,bVar19,0,0);
  }
LAB_006c3848:
  func_0x006bf744();
  if (0 < *(int *)((long)unaff_x19 + 0xc)) {
    func_0x006b2e98(*unaff_x19,*(int *)(unaff_x20 + 0xc) + 1);
  }
  func_0x006b2784(*unaff_x19);
  uVar10 = func_0x006b2784(*unaff_x19);
  func_0x006b1f78(*unaff_x19,0x3a,uVar4 & 0xff,0);
  func_0x006b24c4(*unaff_x19,*(uint *)(unaff_x20 + 0x28) | (uint)(iVar6 == 0x3b) << 0x1f);
  func_0x006b2784(*unaff_x19);
  iVar6 = func_0x006b2794(*unaff_x19,uVar8,uVar10);
  if ((iVar6 != 0) && (uVar24 = func_0x006b2794(*unaff_x19,uVar10,uVar9), (uVar24 & 1) != 0)) {
    uVar21 = in_stack_00000020 - in_stack_00000018 >> 4;
    func_0x006cb1e0();
    uVar24 = (long)(unaff_x19[0x9b] - unaff_x19[0x9a]) >> 4;
    if (uVar21 < uVar24 || uVar21 - uVar24 == 0) {
      if (uVar21 < uVar24) {
        unaff_x19[0x9b] = unaff_x19[0x9a] + uVar21 * 0x10;
      }
    }
    else {
      func_0x006cb2a8(unaff_x19 + 0x9a,uVar21 - uVar24);
    }
    unaff_x19[0x9e] = unaff_x19[0x9e] + -0x18;
    *(undefined4 *)((long)unaff_x19 + 0x484) = in_stack_00000028._4_4_;
    return;
  }
  func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
code_r0x006c3a20:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x6c3a24);
  (*pcVar5)();
}

