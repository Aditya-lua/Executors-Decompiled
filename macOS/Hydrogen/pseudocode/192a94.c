
void FUN_00192a94(long param_1,long param_2,long param_3)

{
  undefined8 in_x9;
  ulong in_x10;
  ulong in_x11;
  
  *(ulong *)(param_2 + 0x38) = (ulong)*(byte *)(param_3 + param_1) << ((in_x11 & 7) << 3) | in_x10;
  *(undefined8 *)(param_2 + 0x40) = in_x9;
  return;
}

