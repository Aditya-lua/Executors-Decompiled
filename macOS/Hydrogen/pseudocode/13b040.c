
void FUN_0013b040(void)

{
  long *plVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  long unaff_x19;
  int unaff_w20;
  long *plVar9;
  long *plVar10;
  long *plVar11;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined4 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  
  uStack0000000000000030 = 0x3f800000;
  for (plVar10 = *(long **)(unaff_x19 + 0x260); plVar10 != (long *)0x0; plVar10 = (long *)*plVar10)
  {
    iVar2 = *(int *)(plVar10 + 2);
    if (iVar2 != unaff_w20) {
      uStack0000000000000008._4_4_ = iVar2 - (uint)(unaff_w20 <= iVar2);
      func_0x0014a7ec(&uStack0000000000000010,(long)&uStack0000000000000008 + 4,
                      (long)&uStack0000000000000008 + 4);
    }
  }
  if (*(long *)(unaff_x19 + 0x268) != 0) {
    plVar10 = *(long **)(unaff_x19 + 0x260);
    while (plVar10 != (long *)0x0) {
      plVar10 = (long *)*plVar10;
      __ZdlPv();
    }
    *(undefined8 *)(unaff_x19 + 0x260) = 0;
    lVar6 = *(long *)(unaff_x19 + 600);
    if (lVar6 != 0) {
      lVar7 = 0;
      do {
        *(undefined8 *)(*(long *)(unaff_x19 + 0x250) + lVar7 * 8) = 0;
        lVar7 = lVar7 + 1;
      } while (lVar6 != lVar7);
    }
    *(undefined8 *)(unaff_x19 + 0x268) = 0;
  }
  uVar4 = uStack0000000000000010;
  uStack0000000000000010 = 0;
  lVar6 = *(long *)(unaff_x19 + 0x250);
  *(undefined8 *)(unaff_x19 + 0x250) = uVar4;
  if (lVar6 != 0) {
    __ZdlPv();
  }
  uVar5 = in_stack_00000018;
  *(ulong *)(unaff_x19 + 600) = in_stack_00000018;
  in_stack_00000018 = 0;
  *(long *)(unaff_x19 + 0x268) = in_stack_00000028;
  *(undefined4 *)(unaff_x19 + 0x270) = uStack0000000000000030;
  *(long *)(unaff_x19 + 0x260) = in_stack_00000020;
  if (in_stack_00000028 != 0) {
    uVar8 = *(ulong *)(in_stack_00000020 + 8);
    if ((uVar5 & uVar5 - 1) == 0) {
      uVar8 = uVar8 & uVar5 - 1;
    }
    else if (uVar5 <= uVar8) {
      uVar3 = 0;
      if (uVar5 != 0) {
        uVar3 = uVar8 / uVar5;
      }
      uVar8 = uVar8 - uVar3 * uVar5;
    }
    *(long **)(*(long *)(unaff_x19 + 0x250) + uVar8 * 8) = (long *)(unaff_x19 + 0x260);
    in_stack_00000020 = 0;
    in_stack_00000028 = 0;
  }
  plVar9 = *(long **)(unaff_x19 + 0x10);
  plVar11 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x18);
  plVar10 = plVar11 + 3;
  if (plVar10 != plVar9) {
    plVar10 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x18 + 8);
    do {
      if (plVar10[-1] != 0) {
        *plVar10 = plVar10[-1];
        __ZdlPv();
        *plVar10 = 0;
        plVar10[1] = 0;
      }
      *plVar10 = plVar10[3];
      plVar10[-1] = plVar10[2];
      plVar10[1] = plVar10[4];
      plVar10[3] = 0;
      plVar10[4] = 0;
      plVar10[2] = 0;
      plVar11 = plVar11 + 3;
      plVar1 = plVar10 + 5;
      plVar10 = plVar10 + 3;
    } while (plVar1 != plVar9);
    plVar10 = *(long **)(unaff_x19 + 0x10);
  }
  if (plVar10 != plVar11) {
    do {
      plVar9 = plVar10 + -3;
      if (*plVar9 != 0) {
        plVar10[-2] = *plVar9;
        __ZdlPv();
      }
      plVar10 = plVar9;
    } while (plVar9 != plVar11);
  }
  *(long **)(unaff_x19 + 0x10) = plVar11;
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  lVar6 = uStack0000000000000010;
  plVar10 = (long *)in_stack_00000020;
  while (plVar10 != (long *)0x0) {
    plVar10 = (long *)*plVar10;
    uStack0000000000000010 = lVar6;
    __ZdlPv();
    lVar6 = uStack0000000000000010;
  }
  uStack0000000000000010 = 0;
  if (lVar6 != 0) {
    __ZdlPv();
  }
  func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
  return;
}

