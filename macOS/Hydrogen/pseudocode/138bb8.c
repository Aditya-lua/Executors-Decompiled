
void FUN_00138bb8(void)

{
  long *plVar1;
  long *plVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long unaff_x19;
  int unaff_w20;
  long *plVar11;
  int unaff_w21;
  long *unaff_x22;
  long *plVar12;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined4 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  
  for (; unaff_x22 != (long *)0x0; unaff_x22 = (long *)*unaff_x22) {
    iVar3 = *(int *)(unaff_x22 + 2);
    if (unaff_w20 < iVar3 || iVar3 < unaff_w21) {
      uStack0000000000000008._4_4_ = iVar3 - (uint)(unaff_w21 <= iVar3);
      func_0x0014a7ec(&uStack0000000000000010,(long)&uStack0000000000000008 + 4,
                      (long)&uStack0000000000000008 + 4);
    }
  }
  if (*(long *)(unaff_x19 + 0x268) != 0) {
    plVar7 = *(long **)(unaff_x19 + 0x260);
    while (plVar7 != (long *)0x0) {
      plVar7 = (long *)*plVar7;
      __ZdlPv();
    }
    *(undefined8 *)(unaff_x19 + 0x260) = 0;
    lVar8 = *(long *)(unaff_x19 + 600);
    if (lVar8 != 0) {
      lVar9 = 0;
      do {
        *(undefined8 *)(*(long *)(unaff_x19 + 0x250) + lVar9 * 8) = 0;
        lVar9 = lVar9 + 1;
      } while (lVar8 != lVar9);
    }
    *(undefined8 *)(unaff_x19 + 0x268) = 0;
  }
  uVar5 = uStack0000000000000010;
  uStack0000000000000010 = 0;
  lVar8 = *(long *)(unaff_x19 + 0x250);
  *(undefined8 *)(unaff_x19 + 0x250) = uVar5;
  if (lVar8 != 0) {
    __ZdlPv();
  }
  uVar6 = in_stack_00000018;
  *(ulong *)(unaff_x19 + 600) = in_stack_00000018;
  in_stack_00000018 = 0;
  *(long *)(unaff_x19 + 0x268) = in_stack_00000028;
  *(undefined4 *)(unaff_x19 + 0x270) = in_stack_00000030;
  *(long *)(unaff_x19 + 0x260) = in_stack_00000020;
  if (in_stack_00000028 != 0) {
    uVar10 = *(ulong *)(in_stack_00000020 + 8);
    if ((uVar6 & uVar6 - 1) == 0) {
      uVar10 = uVar10 & uVar6 - 1;
    }
    else if (uVar6 <= uVar10) {
      uVar4 = 0;
      if (uVar6 != 0) {
        uVar4 = uVar10 / uVar6;
      }
      uVar10 = uVar10 - uVar4 * uVar6;
    }
    *(long **)(*(long *)(unaff_x19 + 0x250) + uVar10 * 8) = (long *)(unaff_x19 + 0x260);
    in_stack_00000020 = 0;
    in_stack_00000028 = 0;
  }
  if (unaff_w21 != unaff_w20) {
    plVar12 = *(long **)(unaff_x19 + 0x10);
    plVar7 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x18);
    plVar11 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x18);
    if (plVar11 != plVar12) {
      lVar8 = 0;
      do {
        plVar2 = (long *)((long)plVar7 + lVar8);
        if (*plVar2 != 0) {
          plVar2[1] = *plVar2;
          __ZdlPv();
          *plVar2 = 0;
          plVar2[1] = 0;
          plVar2[2] = 0;
        }
        plVar1 = (long *)((long)plVar11 + lVar8);
        lVar9 = *plVar1;
        plVar2[1] = plVar1[1];
        *plVar2 = lVar9;
        plVar2[2] = plVar1[2];
        *plVar1 = 0;
        plVar1[1] = 0;
        plVar1[2] = 0;
        lVar8 = lVar8 + 0x18;
      } while ((long *)((long)plVar11 + lVar8) != plVar12);
      plVar11 = *(long **)(unaff_x19 + 0x10);
      plVar7 = (long *)((long)plVar7 + lVar8);
    }
    if (plVar11 != plVar7) {
      do {
        plVar12 = plVar11 + -3;
        if (*plVar12 != 0) {
          plVar11[-2] = *plVar12;
          __ZdlPv();
        }
        plVar11 = plVar12;
      } while (plVar12 != plVar7);
    }
    *(long **)(unaff_x19 + 0x10) = plVar7;
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  lVar8 = uStack0000000000000010;
  plVar7 = (long *)in_stack_00000020;
  while (plVar7 != (long *)0x0) {
    plVar7 = (long *)*plVar7;
    uStack0000000000000010 = lVar8;
    __ZdlPv();
    lVar8 = uStack0000000000000010;
  }
  uStack0000000000000010 = 0;
  if (lVar8 != 0) {
    __ZdlPv();
  }
  func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
  return;
}

