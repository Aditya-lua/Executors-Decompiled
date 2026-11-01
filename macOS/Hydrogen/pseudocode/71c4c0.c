
/* WARNING: Removing unreachable block (ram,0x0071cb84) */
/* WARNING: Removing unreachable block (ram,0x0071cbcc) */
/* WARNING: Removing unreachable block (ram,0x0071cc14) */
/* WARNING: Removing unreachable block (ram,0x0071cc4c) */
/* WARNING: Removing unreachable block (ram,0x0071cbe8) */
/* WARNING: Removing unreachable block (ram,0x0071cc50) */
/* WARNING: Removing unreachable block (ram,0x0071cc2c) */
/* WARNING: Removing unreachable block (ram,0x0071cc30) */
/* WARNING: Removing unreachable block (ram,0x0071cbfc) */
/* WARNING: Removing unreachable block (ram,0x0071cc58) */

ulong FUN_0071c4c0(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong *puVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  undefined8 uVar10;
  ulong uVar11;
  long unaff_x19;
  long unaff_x24;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long unaff_x29;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  long *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long *in_stack_00000068;
  long in_stack_00000070;
  ulong in_stack_00000078;
  long *in_stack_00000080;
  long in_stack_00000088;
  long *in_stack_00000098;
  long in_stack_000000a0;
  
  lVar6 = in_stack_00000088;
  lVar13 = *in_stack_00000080;
  puVar1 = (undefined8 *)func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),unaff_x24 << 5);
  puVar3 = (undefined8 *)(lVar13 + lVar6 * 0x20);
  do {
    uVar12 = *puVar3;
    uVar16 = puVar3[3];
    uVar10 = puVar3[2];
    puVar1[1] = puVar3[1];
    *puVar1 = uVar12;
    puVar1[3] = uVar16;
    puVar1[2] = uVar10;
    unaff_x24 = unaff_x24 + -1;
    puVar3 = puVar3 + 4;
    puVar1 = puVar1 + 4;
  } while (unaff_x24 != 0);
  uVar2 = func_0x0071d868();
  lVar13 = in_stack_00000060;
  lVar6 = in_stack_00000058;
  if ((*(char *)(unaff_x19 + 0x58) == '\0') || (*(int *)(uVar2 + 8) != iRam0000000000a27cd8))
  goto LAB_0071ca28;
  uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
  if (in_stack_00000060 == 0) {
    puVar3 = (undefined8 *)0x0;
    lVar6 = in_stack_00000070;
    uVar9 = in_stack_00000078;
  }
  else {
    lVar14 = *in_stack_00000050;
    puVar3 = (undefined8 *)func_0x00704c24(uVar12,in_stack_00000060 * 0xc);
    puVar1 = (undefined8 *)(lVar14 + lVar6 * 0xc);
    puVar7 = puVar3;
    lVar14 = lVar13;
    do {
      uVar10 = *puVar1;
      *(undefined4 *)(puVar7 + 1) = *(undefined4 *)(puVar1 + 1);
      *puVar7 = uVar10;
      puVar1 = (undefined8 *)((long)puVar1 + 0xc);
      lVar14 = lVar14 + -1;
      puVar7 = (undefined8 *)((long)puVar7 + 0xc);
      lVar6 = in_stack_00000070;
      uVar9 = in_stack_00000078;
    } while (lVar14 != 0);
  }
  in_stack_00000070 = lVar6;
  in_stack_00000078 = uVar9;
  if (uVar9 != 0) {
    lVar15 = *in_stack_00000068;
    lVar14 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),uVar9 << 3);
    if ((uVar9 < 8) || (lVar8 = lVar6 * 8 + lVar15, (ulong)(lVar14 - lVar8) < 0x40)) {
      uVar5 = 0;
    }
    else {
      uVar5 = uVar9 & 0xfffffffffffffff8;
      puVar1 = (undefined8 *)(lVar14 + 0x20);
      puVar7 = (undefined8 *)(lVar8 + 0x20);
      uVar11 = uVar5;
      do {
        uVar10 = puVar7[-4];
        uVar17 = puVar7[-1];
        uVar16 = puVar7[-2];
        uVar19 = puVar7[1];
        uVar18 = *puVar7;
        uVar21 = puVar7[3];
        uVar20 = puVar7[2];
        puVar1[-3] = puVar7[-3];
        puVar1[-4] = uVar10;
        puVar1[-1] = uVar17;
        puVar1[-2] = uVar16;
        puVar1[1] = uVar19;
        *puVar1 = uVar18;
        puVar1[3] = uVar21;
        puVar1[2] = uVar20;
        uVar11 = uVar11 - 8;
        puVar1 = puVar1 + 8;
        puVar7 = puVar7 + 8;
      } while (uVar11 != 0);
      if (uVar9 == uVar5) goto LAB_0071c918;
    }
    lVar8 = uVar9 - uVar5;
    puVar1 = (undefined8 *)(lVar15 + uVar5 * 8 + lVar6 * 8);
    puVar7 = (undefined8 *)(lVar14 + uVar5 * 8);
    do {
      *puVar7 = *puVar1;
      lVar8 = lVar8 + -1;
      puVar1 = puVar1 + 1;
      puVar7 = puVar7 + 1;
    } while (lVar8 != 0);
  }
LAB_0071c918:
  uVar12 = func_0x00704c24(uVar12,0x60);
  func_0x007096f4(uVar12,0,0,0,0,in_stack_00000040,puVar3,lVar13);
  lVar6 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar2 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar9 = 0;
      uVar5 = uVar2 >> 4 ^ uVar2 >> 9;
      do {
        uVar5 = uVar5 & lVar6 - 1U;
        uVar11 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10);
        if (uVar11 == uVar2) goto LAB_0071c9c0;
        uVar9 = uVar9 + 1;
        uVar5 = uVar9 + uVar5;
      } while (uVar11 != *(ulong *)(unaff_x19 + 0x430) && uVar9 <= lVar6 - 1U);
    }
    func_0x006db93c();
    lVar6 = *(long *)(unaff_x19 + 0x420);
  }
LAB_0071c9c0:
  lVar13 = *(long *)(unaff_x19 + 0x418);
  uVar9 = (uVar2 >> 4 ^ uVar2 >> 9) & lVar6 - 1U;
  uVar5 = *(ulong *)(lVar13 + uVar9 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar14 = 1;
    do {
      if (uVar5 == uVar2) goto LAB_0071ca20;
      uVar9 = uVar9 + lVar14 & lVar6 - 1U;
      uVar5 = *(ulong *)(lVar13 + uVar9 * 0x10);
      lVar14 = lVar14 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar13 + uVar9 * 0x10) = uVar2;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0071ca20:
  *(undefined8 *)(lVar13 + uVar9 * 0x10 + 8) = uVar12;
LAB_0071ca28:
  uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
  in_stack_00000038 = *(undefined8 *)(uVar2 + 0x14);
  uStack0000000000000030 = in_stack_00000040;
  puVar4 = (ulong *)func_0x00704c24(uVar12,8);
  *puVar4 = uVar2;
  uVar2 = func_0x00704c24(uVar12,0x38);
  *(ulong **)(unaff_x29 + -0x80) = puVar4;
  *(undefined8 *)(unaff_x29 + -0x78) = 1;
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  func_0x007084c4(uVar2,&uStack0000000000000030,unaff_x29 + -0x80);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar12 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
    func_0x0070978c();
    lVar6 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar2 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar9 = 0;
        uVar5 = uVar2 >> 4 ^ uVar2 >> 9;
        do {
          uVar5 = uVar5 & lVar6 - 1U;
          uVar11 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10);
          if (uVar11 == uVar2) goto LAB_0071cafc;
          uVar9 = uVar9 + 1;
          uVar5 = uVar9 + uVar5;
        } while (uVar11 != *(ulong *)(unaff_x19 + 0x430) && uVar9 <= lVar6 - 1U);
      }
      func_0x006db93c();
      lVar6 = *(long *)(unaff_x19 + 0x420);
    }
LAB_0071cafc:
    lVar13 = *(long *)(unaff_x19 + 0x418);
    uVar9 = (uVar2 >> 4 ^ uVar2 >> 9) & lVar6 - 1U;
    uVar5 = *(ulong *)(lVar13 + uVar9 * 0x10);
    if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar14 = 1;
      do {
        if (uVar5 == uVar2) goto LAB_0071cb5c;
        uVar9 = uVar9 + lVar14 & lVar6 - 1U;
        uVar5 = *(ulong *)(lVar13 + uVar9 * 0x10);
        lVar14 = lVar14 + 1;
      } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar13 + uVar9 * 0x10) = uVar2;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0071cb5c:
    *(undefined8 *)(lVar13 + uVar9 * 0x10 + 8) = uVar12;
  }
  lVar6 = *in_stack_00000050 + in_stack_00000058 * 0xc;
  if (lVar6 != in_stack_00000050[1]) {
    in_stack_00000050[1] = lVar6;
  }
  lVar6 = *in_stack_00000068 + in_stack_00000070 * 8;
  if (lVar6 != in_stack_00000068[1]) {
    in_stack_00000068[1] = lVar6;
  }
  lVar6 = *in_stack_00000080 + in_stack_00000088 * 0x20;
  if (lVar6 != in_stack_00000080[1]) {
    in_stack_00000080[1] = lVar6;
  }
  lVar6 = *in_stack_00000098 + in_stack_000000a0 * 8;
  if (lVar6 != in_stack_00000098[1]) {
    in_stack_00000098[1] = lVar6;
  }
  return uVar2;
}

