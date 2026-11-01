
long FUN_0057f46c(long param_1)

{
  int in_w9;
  ulong unaff_x19;
  
  if (in_w9 == 0) {
    if (unaff_x19 <= *(ulong *)(param_1 + 8)) {
      return param_1;
    }
  }
  else if (unaff_x19 < *(ulong *)(param_1 + 8)) {
    return param_1;
  }
  return 0;
}

