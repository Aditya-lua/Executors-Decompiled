/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008073dc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_81(void)

{
  DAT_00d1af88 = 0x3f800000;
  uRam0000000000d1af70 = 0;
  _DAT_00d1af68 = 0;
  uRam0000000000d1af80 = 0;
  _DAT_00d1af78 = 0;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1af68,&PTR_LOOP_00c48880);
  FUN_008ddc70(&DAT_00d1b340);
  __cxa_atexit(&LAB_008ddcc8,&DAT_00d1b340,&PTR_LOOP_00c48880);
  return;
}

