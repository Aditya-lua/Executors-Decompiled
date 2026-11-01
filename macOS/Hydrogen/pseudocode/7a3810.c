
undefined8 FUN_007a3810(long param_1)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_1 + 8);
  if (7 < uVar1) {
    uVar1 = (uVar1 + 1 >> 3) * 7;
  }
  *(ulong *)(param_1 + 0x10) = uVar1 - *(long *)(param_1 + 0x18);
  return 0x8000000000000001;
}

