
void FUN_00713164(void)

{
  long *plVar1;
  long lVar2;
  ulong in_x9;
  ulong uVar3;
  ulong in_x10;
  long lVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x29;
  long *in_stack_00000088;
  long in_stack_00000090;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
  lVar2 = *(long *)(unaff_x19 + 0x418);
  uVar3 = in_x9 & in_x10;
  lVar5 = *(long *)(lVar2 + uVar3 * 0x10);
  if (lVar5 != *(long *)(unaff_x19 + 0x430)) {
    lVar4 = 1;
    do {
      if (lVar5 == unaff_x20) goto LAB_007131bc;
      uVar3 = uVar3 + lVar4 & in_x10;
      lVar5 = *(long *)(lVar2 + uVar3 * 0x10);
      lVar4 = lVar4 + 1;
    } while (lVar5 != *(long *)(unaff_x19 + 0x430));
  }
  *(long *)(lVar2 + uVar3 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007131bc:
  *(undefined8 *)(lVar2 + uVar3 * 0x10 + 8) = unaff_x21;
  lVar2 = *in_stack_00000088 + in_stack_00000090 * 8;
  if (lVar2 != in_stack_00000088[1]) {
    in_stack_00000088[1] = lVar2;
  }
  lVar2 = *in_stack_000000a0 + in_stack_000000a8 * 8;
  if (lVar2 != in_stack_000000a0[1]) {
    in_stack_000000a0[1] = lVar2;
  }
  lVar2 = *in_stack_000000b8 + in_stack_000000c0 * 8;
  if (lVar2 != in_stack_000000b8[1]) {
    in_stack_000000b8[1] = lVar2;
  }
  plVar1 = *(long **)(unaff_x29 + -200);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  return;
}

