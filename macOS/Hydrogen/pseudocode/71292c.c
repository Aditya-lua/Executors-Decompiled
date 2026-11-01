
ulong FUN_0071292c(undefined1 param_1 [16],undefined1 param_2 [16])

{
  long *plVar1;
  long lVar2;
  long lVar3;
  undefined1 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long unaff_x19;
  undefined8 uVar14;
  undefined8 unaff_x21;
  long unaff_x22;
  int unaff_w25;
  ulong uVar15;
  undefined8 unaff_x27;
  ulong uVar16;
  undefined8 unaff_x28;
  undefined8 uVar17;
  long unaff_x29;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  *(long *)(unaff_x22 + 0x20) = param_1._8_8_;
  *(long *)(unaff_x22 + 0x18) = param_1._0_8_;
  *(long *)(unaff_x22 + 0x30) = param_2._8_8_;
  *(long *)(unaff_x22 + 0x28) = param_2._0_8_;
  if (unaff_w25 == 0x125) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  plVar1 = (long *)(unaff_x19 + 400);
  lVar10 = *(long *)(unaff_x19 + 400);
  lVar2 = *(long *)(unaff_x19 + 0x198);
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + 1;
  uVar5 = func_0x007170f8();
  lVar12 = *(long *)(unaff_x19 + 400);
  lVar3 = *(long *)(unaff_x19 + 0x198);
  lVar6 = func_0x00711360();
  lVar8 = *(long *)(unaff_x19 + 400);
  lVar9 = *(long *)(unaff_x19 + 0x198);
  uVar11 = lVar9 - lVar8 >> 3;
  uVar15 = (ulong)(lVar3 - lVar12) >> 3 & 0xffffffff;
  if (uVar15 < uVar11) {
    do {
      uVar16 = uVar11 - 1;
      uVar17 = *(undefined8 *)(*(long *)(*plVar1 + uVar11 * 8 + -8) + 0x18);
      puVar7 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      *puVar7 = uVar17;
      uVar11 = uVar16;
    } while (uVar15 < uVar16);
    lVar8 = *(long *)(unaff_x19 + 400);
    lVar9 = *(long *)(unaff_x19 + 0x198);
    uVar11 = lVar9 - lVar8 >> 3;
  }
  if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
    if (uVar15 < uVar11) {
      lVar9 = lVar8 + uVar15 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar9;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar15 - uVar11);
    lVar8 = *(long *)(unaff_x19 + 400);
    lVar9 = *(long *)(unaff_x19 + 0x198);
  }
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + -1;
  uVar11 = lVar9 - lVar8 >> 3;
  uVar15 = (ulong)(lVar2 - lVar10) >> 3 & 0xffffffff;
  if (uVar15 < uVar11) {
    do {
      uVar16 = uVar11 - 1;
      uVar17 = *(undefined8 *)(*(long *)(*plVar1 + uVar11 * 8 + -8) + 0x18);
      puVar7 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      *puVar7 = uVar17;
      uVar11 = uVar16;
    } while (uVar15 < uVar16);
    lVar8 = *(long *)(unaff_x19 + 400);
    uVar11 = *(long *)(unaff_x19 + 0x198) - lVar8 >> 3;
  }
  if (uVar15 < uVar11 || uVar15 - uVar11 == 0) {
    if (uVar15 < uVar11) {
      *(ulong *)(unaff_x19 + 0x198) = lVar8 + uVar15 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar15 - uVar11);
  }
  uVar14 = *(undefined8 *)(unaff_x19 + 0x8c);
  *(undefined4 *)(unaff_x29 + -200) = *(undefined4 *)(unaff_x29 + -0xb0);
  *(undefined8 *)(unaff_x29 + -0xc4) = *(undefined8 *)(unaff_x29 + -0xac);
  uVar4 = func_0x00716f30();
  *(undefined1 *)(lVar6 + 0x30) = uVar4;
  uVar17 = *(undefined8 *)(unaff_x19 + 0xd8);
  *(undefined8 *)(unaff_x29 + -200) = unaff_x28;
  *(undefined8 *)(unaff_x29 + -0xc0) = uVar14;
  uVar11 = func_0x00704c24(uVar17,0x60);
  func_0x0070728c(uVar11,unaff_x29 + -200,uVar5,unaff_x21,in_stack_00000050,in_stack_00000048,lVar6,
                  unaff_w25 == 0x125);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
    func_0x007095b4(uVar5,*(undefined8 *)(unaff_x29 + -0x68),unaff_x27,in_stack_00000030,
                    in_stack_00000028,in_stack_00000020);
    lVar9 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar11 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar15 = 0;
        uVar16 = uVar11 >> 4 ^ uVar11 >> 9;
        do {
          uVar16 = uVar16 & lVar9 - 1U;
          uVar13 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar16 * 0x10);
          if (uVar13 == uVar11) goto code_r0x00712bcc;
          uVar15 = uVar15 + 1;
          uVar16 = uVar15 + uVar16;
        } while (uVar13 != *(ulong *)(unaff_x19 + 0x430) && uVar15 <= lVar9 - 1U);
      }
      func_0x006db93c();
      lVar9 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x00712bcc:
    lVar10 = *(long *)(unaff_x19 + 0x418);
    uVar15 = (uVar11 >> 4 ^ uVar11 >> 9) & lVar9 - 1U;
    uVar16 = *(ulong *)(lVar10 + uVar15 * 0x10);
    if (uVar16 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar12 = 1;
      do {
        if (uVar16 == uVar11) goto code_r0x00712c2c;
        uVar15 = uVar15 + lVar12 & lVar9 - 1U;
        uVar16 = *(ulong *)(lVar10 + uVar15 * 0x10);
        lVar12 = lVar12 + 1;
      } while (uVar16 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar10 + uVar15 * 0x10) = uVar11;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00712c2c:
    *(undefined8 *)(lVar10 + uVar15 * 0x10 + 8) = uVar5;
  }
  return uVar11;
}

