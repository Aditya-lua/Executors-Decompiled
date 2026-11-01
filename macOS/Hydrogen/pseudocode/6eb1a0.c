
undefined8 FUN_006eb1a0(ulong param_1)

{
  ulong in_x9;
  ulong in_x10;
  ulong unaff_x21;
  ulong uStack0000000000000000;
  
  uStack0000000000000000 =
       in_x10 | (unaff_x21 & 0xffffffff & (in_x9 ^ 0xffffffffffffffff)) << (param_1 & 0x3f);
  _memcpy();
  return 0;
}

