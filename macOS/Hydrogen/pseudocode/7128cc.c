
ulong FUN_007128cc(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  bool bVar5;
  undefined1 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar17;
  undefined8 unaff_x21;
  long unaff_x22;
  ulong uVar18;
  undefined8 unaff_x27;
  ulong uVar19;
  undefined8 unaff_x28;
  undefined8 uVar20;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000048;
  
  func_0x0072447c();
  uVar7 = func_0x007168a8();
  iVar4 = *(int *)(unaff_x19 + 0x80);
  bVar5 = iVar4 != 0x2c;
  if (bVar5) {
    uStack0000000000000048 = 0;
    uStack0000000000000028 = 0;
    uVar8 = *unaff_x20;
    uVar17 = unaff_x20[3];
    uVar20 = unaff_x20[2];
    *(undefined8 *)(unaff_x22 + 0x20) = unaff_x20[1];
    *(undefined8 *)(unaff_x22 + 0x18) = uVar8;
    *(undefined8 *)(unaff_x22 + 0x30) = uVar17;
    *(undefined8 *)(unaff_x22 + 0x28) = uVar20;
  }
  else {
    uStack0000000000000028 = *(undefined8 *)(unaff_x19 + 0x84);
    func_0x00710d48();
    uStack0000000000000048 = func_0x007168a8();
    iVar4 = *(int *)(unaff_x19 + 0x80);
    uVar8 = *unaff_x20;
    uVar17 = unaff_x20[3];
    uVar20 = unaff_x20[2];
    *(undefined8 *)(unaff_x22 + 0x20) = unaff_x20[1];
    *(undefined8 *)(unaff_x22 + 0x18) = uVar8;
    *(undefined8 *)(unaff_x22 + 0x30) = uVar17;
    *(undefined8 *)(unaff_x22 + 0x28) = uVar20;
  }
  if (iVar4 == 0x125) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  plVar1 = (long *)(unaff_x19 + 400);
  lVar13 = *(long *)(unaff_x19 + 400);
  lVar2 = *(long *)(unaff_x19 + 0x198);
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + 1;
  uVar8 = func_0x007170f8();
  lVar15 = *(long *)(unaff_x19 + 400);
  lVar3 = *(long *)(unaff_x19 + 0x198);
  lVar9 = func_0x00711360();
  lVar11 = *(long *)(unaff_x19 + 400);
  lVar12 = *(long *)(unaff_x19 + 0x198);
  uVar14 = lVar12 - lVar11 >> 3;
  uVar18 = (ulong)(lVar3 - lVar15) >> 3 & 0xffffffff;
  if (uVar18 < uVar14) {
    do {
      uVar19 = uVar14 - 1;
      uVar20 = *(undefined8 *)(*(long *)(*plVar1 + uVar14 * 8 + -8) + 0x18);
      puVar10 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      *puVar10 = uVar20;
      uVar14 = uVar19;
    } while (uVar18 < uVar19);
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar12 = *(long *)(unaff_x19 + 0x198);
    uVar14 = lVar12 - lVar11 >> 3;
  }
  if (uVar18 < uVar14 || uVar18 - uVar14 == 0) {
    if (uVar18 < uVar14) {
      lVar12 = lVar11 + uVar18 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar12;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar18 - uVar14);
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar12 = *(long *)(unaff_x19 + 0x198);
  }
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + -1;
  uVar14 = lVar12 - lVar11 >> 3;
  uVar18 = (ulong)(lVar2 - lVar13) >> 3 & 0xffffffff;
  if (uVar18 < uVar14) {
    do {
      uVar19 = uVar14 - 1;
      uVar20 = *(undefined8 *)(*(long *)(*plVar1 + uVar14 * 8 + -8) + 0x18);
      puVar10 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      *puVar10 = uVar20;
      uVar14 = uVar19;
    } while (uVar18 < uVar19);
    lVar11 = *(long *)(unaff_x19 + 400);
    uVar14 = *(long *)(unaff_x19 + 0x198) - lVar11 >> 3;
  }
  if (uVar18 < uVar14 || uVar18 - uVar14 == 0) {
    if (uVar18 < uVar14) {
      *(ulong *)(unaff_x19 + 0x198) = lVar11 + uVar18 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar18 - uVar14);
  }
  uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
  *(undefined4 *)(unaff_x29 + -200) = *(undefined4 *)(unaff_x29 + -0xb0);
  *(undefined8 *)(unaff_x29 + -0xc4) = *(undefined8 *)(unaff_x29 + -0xac);
  uVar6 = func_0x00716f30();
  *(undefined1 *)(lVar9 + 0x30) = uVar6;
  uVar20 = *(undefined8 *)(unaff_x19 + 0xd8);
  *(undefined8 *)(unaff_x29 + -200) = unaff_x28;
  *(undefined8 *)(unaff_x29 + -0xc0) = uVar17;
  uVar14 = func_0x00704c24(uVar20,0x60);
  func_0x0070728c(uVar14,unaff_x29 + -200,uVar8,unaff_x21,uVar7,uStack0000000000000048,lVar9,
                  iVar4 == 0x125);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar7 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
    func_0x007095b4(uVar7,*(undefined8 *)(unaff_x29 + -0x68),unaff_x27,in_stack_00000030,
                    uStack0000000000000028,!bVar5);
    lVar12 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar12 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar14 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar18 = 0;
        uVar19 = uVar14 >> 4 ^ uVar14 >> 9;
        do {
          uVar19 = uVar19 & lVar12 - 1U;
          uVar16 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar19 * 0x10);
          if (uVar16 == uVar14) goto code_r0x00712bcc;
          uVar18 = uVar18 + 1;
          uVar19 = uVar18 + uVar19;
        } while (uVar16 != *(ulong *)(unaff_x19 + 0x430) && uVar18 <= lVar12 - 1U);
      }
      func_0x006db93c();
      lVar12 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x00712bcc:
    lVar13 = *(long *)(unaff_x19 + 0x418);
    uVar18 = (uVar14 >> 4 ^ uVar14 >> 9) & lVar12 - 1U;
    uVar19 = *(ulong *)(lVar13 + uVar18 * 0x10);
    if (uVar19 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar15 = 1;
      do {
        if (uVar19 == uVar14) goto code_r0x00712c2c;
        uVar18 = uVar18 + lVar15 & lVar12 - 1U;
        uVar19 = *(ulong *)(lVar13 + uVar18 * 0x10);
        lVar15 = lVar15 + 1;
      } while (uVar19 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar13 + uVar18 * 0x10) = uVar14;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00712c2c:
    *(undefined8 *)(lVar13 + uVar18 * 0x10 + 8) = uVar7;
  }
  return uVar14;
}

