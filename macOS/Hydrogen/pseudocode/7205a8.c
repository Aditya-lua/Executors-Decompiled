
void FUN_007205a8(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  long in_x9;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  long unaff_x19;
  ulong unaff_x21;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  long *in_stack_00000088;
  long in_stack_00000090;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  
  puVar3 = (undefined8 *)(unaff_x27 + param_1 * 8 + unaff_x26 * 8);
  puVar6 = (undefined8 *)(unaff_x25 + param_1 * 8);
  do {
    *puVar6 = *puVar3;
    in_x9 = in_x9 + -1;
    puVar3 = puVar3 + 1;
    puVar6 = puVar6 + 1;
  } while (in_x9 != 0);
  uVar2 = func_0x00704c24();
  func_0x00709508();
  lVar4 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar4 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x21 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar7 = 0;
      uVar9 = unaff_x21 >> 4 ^ unaff_x21 >> 9;
      do {
        uVar9 = uVar9 & lVar4 - 1U;
        uVar10 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar9 * 0x10);
        if (uVar10 == unaff_x21) goto LAB_0072066c;
        uVar7 = uVar7 + 1;
        uVar9 = uVar7 + uVar9;
      } while (uVar10 != *(ulong *)(unaff_x19 + 0x430) && uVar7 <= lVar4 - 1U);
    }
    func_0x006db93c();
    lVar4 = *(long *)(unaff_x19 + 0x420);
  }
LAB_0072066c:
  lVar5 = *(long *)(unaff_x19 + 0x418);
  uVar7 = (unaff_x21 >> 4 ^ unaff_x21 >> 9) & lVar4 - 1U;
  uVar9 = *(ulong *)(lVar5 + uVar7 * 0x10);
  if (uVar9 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar8 = 1;
    do {
      if (uVar9 == unaff_x21) goto LAB_007206cc;
      uVar7 = uVar7 + lVar8 & lVar4 - 1U;
      uVar9 = *(ulong *)(lVar5 + uVar7 * 0x10);
      lVar8 = lVar8 + 1;
    } while (uVar9 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar5 + uVar7 * 0x10) = unaff_x21;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007206cc:
  *(undefined8 *)(lVar5 + uVar7 * 0x10 + 8) = uVar2;
  lVar4 = *in_stack_00000088 + in_stack_00000090 * 8;
  if (lVar4 != in_stack_00000088[1]) {
    in_stack_00000088[1] = lVar4;
  }
  lVar4 = *in_stack_000000a0 + in_stack_000000a8 * 8;
  if (lVar4 != in_stack_000000a0[1]) {
    in_stack_000000a0[1] = lVar4;
  }
  plVar1 = *(long **)(unaff_x29 + -0x88);
  lVar4 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x10;
  if (lVar4 != plVar1[1]) {
    plVar1[1] = lVar4;
  }
  plVar1 = *(long **)(unaff_x29 + -0x70);
  lVar4 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 0x10;
  if (lVar4 != plVar1[1]) {
    plVar1[1] = lVar4;
  }
  return;
}

