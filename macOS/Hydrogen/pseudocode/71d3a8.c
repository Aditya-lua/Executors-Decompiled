
ulong FUN_0071d3a8(ulong param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long unaff_x19;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000050;
  long *in_stack_00000060;
  long in_stack_00000068;
  ulong in_stack_00000070;
  long *in_stack_00000078;
  long in_stack_00000080;
  
  func_0x00708250(param_1,&uStack0000000000000050,&uStack0000000000000030);
  uVar6 = in_stack_00000070;
  lVar4 = in_stack_00000068;
  if (*(char *)(unaff_x19 + 0x58) == '\0') goto LAB_0071d644;
  uVar9 = *(undefined8 *)(unaff_x19 + 0xd8);
  if (in_stack_00000070 != 0) {
    lVar10 = *in_stack_00000060;
    lVar1 = func_0x00704c24(uVar9,in_stack_00000070 << 3);
    if ((uVar6 < 8) || ((ulong)((lVar1 + lVar4 * -8) - lVar10) < 0x40)) {
      uVar2 = 0;
    }
    else {
      uVar2 = uVar6 & 0xfffffffffffffff8;
      puVar3 = (undefined8 *)(lVar1 + 0x20);
      puVar7 = (undefined8 *)(lVar4 * 8 + lVar10 + 0x20);
      uVar8 = uVar2;
      do {
        uVar11 = puVar7[-4];
        uVar13 = puVar7[-1];
        uVar12 = puVar7[-2];
        uVar15 = puVar7[1];
        uVar14 = *puVar7;
        uVar17 = puVar7[3];
        uVar16 = puVar7[2];
        puVar3[-3] = puVar7[-3];
        puVar3[-4] = uVar11;
        puVar3[-1] = uVar13;
        puVar3[-2] = uVar12;
        puVar3[1] = uVar15;
        *puVar3 = uVar14;
        puVar3[3] = uVar17;
        puVar3[2] = uVar16;
        uVar8 = uVar8 - 8;
        puVar3 = puVar3 + 8;
        puVar7 = puVar7 + 8;
      } while (uVar8 != 0);
      if (uVar6 == uVar2) goto LAB_0071d54c;
    }
    lVar5 = uVar6 - uVar2;
    puVar3 = (undefined8 *)(lVar10 + uVar2 * 8 + lVar4 * 8);
    puVar7 = (undefined8 *)(lVar1 + uVar2 * 8);
    do {
      *puVar7 = *puVar3;
      lVar5 = lVar5 + -1;
      puVar3 = puVar3 + 1;
      puVar7 = puVar7 + 1;
    } while (lVar5 != 0);
  }
LAB_0071d54c:
  uVar9 = func_0x00704c24(uVar9,0x20);
  func_0x00709758();
  lVar4 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar4 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (param_1 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar6 = 0;
      uVar2 = param_1 >> 4 ^ param_1 >> 9;
      do {
        uVar2 = uVar2 & lVar4 - 1U;
        uVar8 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar2 * 0x10);
        if (uVar8 == param_1) goto LAB_0071d5dc;
        uVar6 = uVar6 + 1;
        uVar2 = uVar6 + uVar2;
      } while (uVar8 != *(ulong *)(unaff_x19 + 0x430) && uVar6 <= lVar4 - 1U);
    }
    func_0x006db93c();
    lVar4 = *(long *)(unaff_x19 + 0x420);
  }
LAB_0071d5dc:
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar6 = (param_1 >> 4 ^ param_1 >> 9) & lVar4 - 1U;
  uVar2 = *(ulong *)(lVar1 + uVar6 * 0x10);
  if (uVar2 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar10 = 1;
    do {
      if (uVar2 == param_1) goto LAB_0071d63c;
      uVar6 = uVar6 + lVar10 & lVar4 - 1U;
      uVar2 = *(ulong *)(lVar1 + uVar6 * 0x10);
      lVar10 = lVar10 + 1;
    } while (uVar2 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar6 * 0x10) = param_1;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0071d63c:
  *(undefined8 *)(lVar1 + uVar6 * 0x10 + 8) = uVar9;
LAB_0071d644:
  lVar4 = *in_stack_00000060 + in_stack_00000068 * 8;
  if (lVar4 != in_stack_00000060[1]) {
    in_stack_00000060[1] = lVar4;
  }
  lVar4 = *in_stack_00000078 + in_stack_00000080 * 8;
  if (lVar4 != in_stack_00000078[1]) {
    in_stack_00000078[1] = lVar4;
  }
  return param_1;
}

