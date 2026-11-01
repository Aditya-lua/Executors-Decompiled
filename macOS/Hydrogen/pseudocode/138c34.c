
void FUN_00138c34(undefined8 param_1,long param_2)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  long unaff_x19;
  int unaff_w20;
  long *plVar5;
  int unaff_w21;
  long *plVar6;
  undefined8 unaff_x22;
  long *plVar7;
  long lVar8;
  long lVar9;
  long in_stack_00000010;
  ulong in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  undefined4 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  
  *(undefined8 *)(unaff_x19 + 0x250) = param_1;
  if (param_2 != 0) {
    __ZdlPv();
  }
  *(ulong *)(unaff_x19 + 600) = in_stack_00000018;
  *(long *)(unaff_x19 + 0x268) = in_stack_00000028;
  *(undefined4 *)(unaff_x19 + 0x270) = in_stack_00000030;
  *(long **)(unaff_x19 + 0x260) = in_stack_00000020;
  if (in_stack_00000028 != 0) {
    uVar4 = *(ulong *)((long)in_stack_00000020 + 8);
    if ((in_stack_00000018 & in_stack_00000018 - 1) == 0) {
      uVar4 = uVar4 & in_stack_00000018 - 1;
    }
    else if (in_stack_00000018 <= uVar4) {
      uVar3 = 0;
      if (in_stack_00000018 != 0) {
        uVar3 = uVar4 / in_stack_00000018;
      }
      uVar4 = uVar4 - uVar3 * in_stack_00000018;
    }
    *(undefined8 *)(*(long *)(unaff_x19 + 0x250) + uVar4 * 8) = unaff_x22;
    in_stack_00000020 = (long *)0x0;
  }
  if (unaff_w21 != unaff_w20) {
    plVar7 = *(long **)(unaff_x19 + 0x10);
    plVar6 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x18);
    plVar5 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x18);
    if (plVar5 != plVar7) {
      lVar8 = 0;
      do {
        plVar2 = (long *)((long)plVar6 + lVar8);
        if (*plVar2 != 0) {
          plVar2[1] = *plVar2;
          __ZdlPv();
          *plVar2 = 0;
          plVar2[1] = 0;
          plVar2[2] = 0;
        }
        plVar1 = (long *)((long)plVar5 + lVar8);
        lVar9 = *plVar1;
        plVar2[1] = plVar1[1];
        *plVar2 = lVar9;
        plVar2[2] = plVar1[2];
        *plVar1 = 0;
        plVar1[1] = 0;
        plVar1[2] = 0;
        lVar8 = lVar8 + 0x18;
      } while ((long *)((long)plVar5 + lVar8) != plVar7);
      plVar5 = *(long **)(unaff_x19 + 0x10);
      plVar6 = (long *)((long)plVar6 + lVar8);
    }
    if (plVar5 != plVar6) {
      do {
        plVar7 = plVar5 + -3;
        if (*plVar7 != 0) {
          plVar5[-2] = *plVar7;
          __ZdlPv();
        }
        plVar5 = plVar7;
      } while (plVar7 != plVar6);
    }
    *(long **)(unaff_x19 + 0x10) = plVar6;
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  while (in_stack_00000020 != (long *)0x0) {
    in_stack_00000020 = (long *)*in_stack_00000020;
    __ZdlPv();
  }
  if (in_stack_00000010 != 0) {
    __ZdlPv();
  }
  func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
  return;
}

