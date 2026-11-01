
bool FUN_001c01c0(long param_1)

{
  long lVar1;
  long in_x9;
  ulong in_x10;
  
  lVar1 = 0;
  if (in_x10 <= *(ulong *)(param_1 + 0x18)) {
    lVar1 = *(ulong *)(param_1 + 0x18) - in_x10;
  }
  return in_x9 == lVar1;
}

