
void FUN_001c07c4(long param_1,long param_2)

{
  long unaff_x19;
  long unaff_x20;
  
  if (param_2 != param_1) {
    _memmove(*(long *)(unaff_x19 + 8),*(long *)(unaff_x19 + 8) + param_1 * 0x28,unaff_x20 * 0x28);
    *(long *)(unaff_x19 + 0x10) = unaff_x20;
  }
  return;
}

