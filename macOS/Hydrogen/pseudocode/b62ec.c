
ulong FUN_000b62ec(long param_1,undefined8 param_2,byte *param_3)

{
  long in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  ulong uVar1;
  
  uVar1 = (ulong)*param_3 * in_x11 ^ in_x9 + (in_x12 >> 0x29 | in_x12 << 0x17) * param_1;
  uVar1 = (ulong)param_3[1] * in_x11 ^ (uVar1 >> 0x35 | uVar1 << 0xb) * in_x10;
  uVar1 = (ulong)param_3[2] * in_x11 ^ (uVar1 >> 0x35 | uVar1 << 0xb) * in_x10;
  uVar1 = (uVar1 >> 0x35 | uVar1 << 0xb) * in_x10;
  uVar1 = (uVar1 ^ uVar1 >> 0x21) * param_1;
  uVar1 = (uVar1 ^ uVar1 >> 0x1d) * in_x9;
  return uVar1 ^ uVar1 >> 0x20;
}

