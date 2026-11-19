/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b74a4
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_160(void)

{
  DAT_00d1f5a8 = 0x3f800000;
  uRam0000000000d1f590 = 0;
  _DAT_00d1f588 = 0;
  uRam0000000000d1f5a0 = 0;
  _DAT_00d1f598 = 0;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1f588,&PTR_LOOP_00c48880);
  DAT_00d1f5b0 = 0;
  DAT_00d1f5c8 = 0;
  DAT_00d1f5b8 = "FixMathNoisePrecision";
  DAT_00d1f5c0 = DAT_00d1eec0;
  DAT_00d1eec0 = &DAT_00d1f5b0;
  return;
}

