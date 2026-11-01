
void FUN_00513ccc(long param_1,long param_2)

{
  long in_x9;
  long in_x10;
  long unaff_x19;
  long unaff_x20;
  
  _memmove(in_x10 + unaff_x20 * 0x18,in_x10 + param_1 * 0x18,in_x9 * 0x18);
  *(long *)(unaff_x19 + 0x10) = *(long *)(param_2 + 0x20) + unaff_x20;
  return;
}

