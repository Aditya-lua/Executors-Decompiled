
undefined8 FUN_007a381c(ulong param_1,long param_2)

{
  long in_x9;
  
  if (7 < param_1) {
    param_1 = in_x9 * 7;
  }
  *(ulong *)(param_2 + 0x10) = param_1 - *(long *)(param_2 + 0x18);
  return 0x8000000000000001;
}

