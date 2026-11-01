
void FUN_007131d8(long param_1)

{
  long *plVar1;
  undefined8 in_x9;
  long lVar2;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
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

