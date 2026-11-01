
void FUN_00421074(void)

{
  bool in_ZR;
  uint *puVar1;
  long unaff_x19;
  int in_stack_00000008;
  
  if (in_ZR) {
    puVar1 = (uint *)___error();
    *(ulong *)(unaff_x19 + 8) = (ulong)*puVar1 << 0x20 | 2;
  }
  else {
    *(bool *)(unaff_x19 + 1) = in_stack_00000008 != 0;
  }
  *(bool *)unaff_x19 = in_ZR;
  return;
}

