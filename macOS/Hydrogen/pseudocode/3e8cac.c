
void FUN_003e8cac(long param_1,long param_2,undefined8 param_3,ulong param_4)

{
  *(ulong *)(param_1 + 0x38) =
       (param_4 >> 8 | (ulong)*(byte *)(param_2 + 0x3e) << 0x38) >> 8 |
       (ulong)*(byte *)(param_2 + 0x3f) << 0x38;
  *(ulong *)(param_1 + 0x40) = (ulong)*(ushort *)(param_2 + 0x40);
  return;
}

