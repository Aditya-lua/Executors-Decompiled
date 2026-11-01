
void FUN_00420a28(int param_1)

{
  uint *puVar1;
  long unaff_x19;
  int in_stack_00000008;
  
  if (param_1 == -1) {
    puVar1 = (uint *)___error();
    *(ulong *)(unaff_x19 + 8) = (ulong)*puVar1 << 0x20 | 2;
  }
  else {
    *(bool *)(unaff_x19 + 1) = in_stack_00000008 != 0;
  }
  *(bool *)unaff_x19 = param_1 == -1;
  return;
}

