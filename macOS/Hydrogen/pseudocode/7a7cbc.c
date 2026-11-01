
undefined8 FUN_007a7cbc(ulong param_1,long param_2)

{
  if (7 < param_1) {
    param_1 = (param_1 + 1 >> 3) * 7;
  }
  *(ulong *)(param_2 + 0x10) = param_1 - *(long *)(param_2 + 0x18);
  return 0x8000000000000001;
}

