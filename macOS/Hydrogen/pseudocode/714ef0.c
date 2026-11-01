
void FUN_00714ef0(void)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  ulong unaff_x21;
  ulong unaff_x25;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  long *in_stack_00000030;
  long in_stack_00000038;
  long *in_stack_00000048;
  long in_stack_00000050;
  long *in_stack_00000060;
  long in_stack_00000068;
  long *in_stack_00000078;
  long in_stack_00000080;
  
  lVar1 = func_0x00704c24();
  if ((unaff_x25 < 8) || (lVar5 = unaff_x27 * 8 + unaff_x28, (ulong)(lVar1 - lVar5) < 0x40)) {
    uVar3 = 0;
  }
  else {
    uVar3 = unaff_x25 & 0xfffffffffffffff8;
    puVar4 = (undefined8 *)(lVar1 + 0x20);
    puVar6 = (undefined8 *)(lVar5 + 0x20);
    uVar8 = uVar3;
    do {
      uVar2 = puVar6[-4];
      uVar11 = puVar6[-1];
      uVar10 = puVar6[-2];
      uVar13 = puVar6[1];
      uVar12 = *puVar6;
      uVar15 = puVar6[3];
      uVar14 = puVar6[2];
      puVar4[-3] = puVar6[-3];
      puVar4[-4] = uVar2;
      puVar4[-1] = uVar11;
      puVar4[-2] = uVar10;
      puVar4[1] = uVar13;
      *puVar4 = uVar12;
      puVar4[3] = uVar15;
      puVar4[2] = uVar14;
      uVar8 = uVar8 - 8;
      puVar4 = puVar4 + 8;
      puVar6 = puVar6 + 8;
    } while (uVar8 != 0);
    if (unaff_x25 == uVar3) goto LAB_00714f44;
  }
  lVar5 = unaff_x25 - uVar3;
  puVar4 = (undefined8 *)(unaff_x28 + uVar3 * 8 + unaff_x27 * 8);
  puVar6 = (undefined8 *)(lVar1 + uVar3 * 8);
  do {
    *puVar6 = *puVar4;
    lVar5 = lVar5 + -1;
    puVar4 = puVar4 + 1;
    puVar6 = puVar6 + 1;
  } while (lVar5 != 0);
LAB_00714f44:
  uVar2 = func_0x00704c24();
  func_0x007095f4();
  lVar1 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar1 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x21 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar3 = 0;
      uVar8 = unaff_x21 >> 4 ^ unaff_x21 >> 9;
      do {
        uVar8 = uVar8 & lVar1 - 1U;
        uVar9 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar8 * 0x10);
        if (uVar9 == unaff_x21) goto LAB_00714fd8;
        uVar3 = uVar3 + 1;
        uVar8 = uVar3 + uVar8;
      } while (uVar9 != *(ulong *)(unaff_x19 + 0x430) && uVar3 <= lVar1 - 1U);
    }
    func_0x006db93c();
    lVar1 = *(long *)(unaff_x19 + 0x420);
  }
LAB_00714fd8:
  lVar5 = *(long *)(unaff_x19 + 0x418);
  uVar3 = (unaff_x21 >> 4 ^ unaff_x21 >> 9) & lVar1 - 1U;
  uVar8 = *(ulong *)(lVar5 + uVar3 * 0x10);
  if (uVar8 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar7 = 1;
    do {
      if (uVar8 == unaff_x21) goto LAB_00715038;
      uVar3 = uVar3 + lVar7 & lVar1 - 1U;
      uVar8 = *(ulong *)(lVar5 + uVar3 * 0x10);
      lVar7 = lVar7 + 1;
    } while (uVar8 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar5 + uVar3 * 0x10) = unaff_x21;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00715038:
  *(undefined8 *)(lVar5 + uVar3 * 0x10 + 8) = uVar2;
  lVar1 = *in_stack_00000030 + in_stack_00000038 * 8;
  if (lVar1 != in_stack_00000030[1]) {
    in_stack_00000030[1] = lVar1;
  }
  lVar1 = *in_stack_00000048 + in_stack_00000050 * 8;
  if (lVar1 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar1;
  }
  lVar1 = *in_stack_00000060 + in_stack_00000068 * 8;
  if (lVar1 != in_stack_00000060[1]) {
    in_stack_00000060[1] = lVar1;
  }
  lVar1 = *in_stack_00000078 + in_stack_00000080 * 8;
  if (lVar1 != in_stack_00000078[1]) {
    in_stack_00000078[1] = lVar1;
  }
  return;
}

