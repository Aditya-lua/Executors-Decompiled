
/* WARNING: Removing unreachable block (ram,0x0071ef98) */
/* WARNING: Removing unreachable block (ram,0x0071efc4) */
/* WARNING: Removing unreachable block (ram,0x0071f00c) */
/* WARNING: Removing unreachable block (ram,0x0071f044) */
/* WARNING: Removing unreachable block (ram,0x0071efe0) */
/* WARNING: Removing unreachable block (ram,0x0071f048) */
/* WARNING: Removing unreachable block (ram,0x0071f024) */
/* WARNING: Removing unreachable block (ram,0x0071f028) */
/* WARNING: Removing unreachable block (ram,0x0071eff4) */
/* WARNING: Removing unreachable block (ram,0x0071f050) */

undefined8 FUN_0071f4e8(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long in_x10;
  long lVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x25;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long *in_stack_00000040;
  long in_stack_00000048;
  long *in_stack_00000058;
  long in_stack_00000060;
  long *in_stack_00000070;
  long in_stack_00000078;
  long *in_stack_00000088;
  long in_stack_00000090;
  
  uVar4 = unaff_x23 & 0xfffffffffffffff8;
  puVar2 = (undefined8 *)(unaff_x25 + 0x20);
  puVar6 = (undefined8 *)(in_x10 + unaff_x21 + 0x20);
  uVar7 = uVar4;
  do {
    uVar1 = puVar6[-4];
    uVar11 = puVar6[-1];
    uVar10 = puVar6[-2];
    uVar13 = puVar6[1];
    uVar12 = *puVar6;
    uVar15 = puVar6[3];
    uVar14 = puVar6[2];
    puVar2[-3] = puVar6[-3];
    puVar2[-4] = uVar1;
    puVar2[-1] = uVar11;
    puVar2[-2] = uVar10;
    puVar2[1] = uVar13;
    *puVar2 = uVar12;
    puVar2[3] = uVar15;
    puVar2[2] = uVar14;
    uVar7 = uVar7 - 8;
    puVar2 = puVar2 + 8;
    puVar6 = puVar6 + 8;
  } while (uVar7 != 0);
  if (unaff_x23 != uVar4) {
    lVar5 = unaff_x23 - uVar4;
    puVar2 = (undefined8 *)(unaff_x21 + uVar4 * 8 + unaff_x20 * 8);
    puVar6 = (undefined8 *)(unaff_x25 + uVar4 * 8);
    do {
      *puVar6 = *puVar2;
      lVar5 = lVar5 + -1;
      puVar2 = puVar2 + 1;
      puVar6 = puVar6 + 1;
    } while (lVar5 != 0);
  }
  uVar1 = func_0x00704c24();
  func_0x007097ac(uVar1,in_stack_00000038,in_stack_00000030);
  lVar5 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar5 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x22 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar7 = 0;
      uVar4 = unaff_x22 >> 4 ^ unaff_x22 >> 9;
      do {
        uVar4 = uVar4 & lVar5 - 1U;
        uVar9 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar4 * 0x10);
        if (uVar9 == unaff_x22) goto code_r0x0071f42c;
        uVar7 = uVar7 + 1;
        uVar4 = uVar7 + uVar4;
      } while (uVar9 != *(ulong *)(unaff_x19 + 0x430) && uVar7 <= lVar5 - 1U);
    }
    func_0x006db93c();
    lVar5 = *(long *)(unaff_x19 + 0x420);
  }
code_r0x0071f42c:
  lVar3 = *(long *)(unaff_x19 + 0x418);
  uVar7 = (unaff_x22 >> 4 ^ unaff_x22 >> 9) & lVar5 - 1U;
  uVar4 = *(ulong *)(lVar3 + uVar7 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar8 = 1;
    do {
      if (uVar4 == unaff_x22) goto code_r0x0071f48c;
      uVar7 = uVar7 + lVar8 & lVar5 - 1U;
      uVar4 = *(ulong *)(lVar3 + uVar7 * 0x10);
      lVar8 = lVar8 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar3 + uVar7 * 0x10) = unaff_x22;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071f48c:
  *(undefined8 *)(lVar3 + uVar7 * 0x10 + 8) = uVar1;
  lVar5 = *in_stack_00000040 + in_stack_00000048 * 8;
  if (lVar5 != in_stack_00000040[1]) {
    in_stack_00000040[1] = lVar5;
  }
  lVar5 = *in_stack_00000058 + in_stack_00000060 * 0xc;
  if (lVar5 != in_stack_00000058[1]) {
    in_stack_00000058[1] = lVar5;
  }
  lVar5 = *in_stack_00000070 + in_stack_00000078 * 0x20;
  if (lVar5 != in_stack_00000070[1]) {
    in_stack_00000070[1] = lVar5;
  }
  lVar5 = *in_stack_00000088 + in_stack_00000090 * 8;
  if (lVar5 != in_stack_00000088[1]) {
    in_stack_00000088[1] = lVar5;
  }
  return 0;
}

