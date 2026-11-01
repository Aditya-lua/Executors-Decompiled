
void FUN_0071317c(long param_1)

{
  long *plVar1;
  bool in_ZR;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long lVar2;
  long in_x13;
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
  
  if (!in_ZR) {
    lVar2 = 1;
    do {
      if (in_x13 == unaff_x20) goto LAB_007131bc;
      in_x9 = in_x9 + lVar2 & in_x10;
      in_x13 = *(long *)(param_1 + in_x9 * 0x10);
      lVar2 = lVar2 + 1;
    } while (in_x13 != in_x11);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007131bc:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
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

