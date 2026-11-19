/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8c20
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_161(void)

{
  DAT_00d1f5f0 = 0x3f800000;
  uRam0000000000d1f5d8 = 0;
  _DAT_00d1f5d0 = 0;
  uRam0000000000d1f5e8 = 0;
  _DAT_00d1f5e0 = 0;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1f5d0,&PTR_LOOP_00c48880);
  _DAT_00d1f5f8 = 0;
  DAT_00d1f600 = "LuauBufferSweep";
  DAT_00d1f608 = DAT_00d1eec0;
  DAT_00d1f610 = 0;
  _DAT_00d1f618 = 0;
  DAT_00d1f620 = "LuauCageSplitData";
  DAT_00d1f628 = &DAT_00d1f5f8;
  DAT_00d1f630 = 0;
  DAT_00d1eec0 = &DAT_00d1f618;
  FUN_008b7508(&DAT_00d1f638);
  return;
}

