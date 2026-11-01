
void FUN_007131c4(void)

{
  long *plVar1;
  long lVar2;
  long unaff_x29;
  long *in_stack_00000088;
  long in_stack_00000090;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
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

