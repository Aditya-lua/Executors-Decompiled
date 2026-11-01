
void FUN_00280a50(long param_1,undefined8 param_2,ulong param_3,ulong param_4,ulong param_5,
                 ulong param_6,ulong param_7,ulong param_8)

{
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x15;
  ulong in_x16;
  ulong unaff_x20;
  
  *(ulong *)(param_1 + 0x10) = param_8 ^ *(ulong *)(param_1 + 0x10) ^ in_x13;
  *(ulong *)(param_1 + 0x18) = param_3 ^ *(ulong *)(param_1 + 0x18) ^ in_x15;
  *(ulong *)(param_1 + 0x20) = unaff_x20 ^ *(ulong *)(param_1 + 0x20) ^ param_6;
  *(ulong *)(param_1 + 0x28) = param_7 ^ *(ulong *)(param_1 + 0x28) ^ param_5;
  *(ulong *)(param_1 + 0x30) = param_4 ^ *(ulong *)(param_1 + 0x30) ^ in_x16;
  *(ulong *)(param_1 + 0x38) = in_x12 ^ *(ulong *)(param_1 + 0x38) ^ in_x11;
  return;
}

