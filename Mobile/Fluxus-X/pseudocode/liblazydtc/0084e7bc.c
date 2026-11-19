/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e7bc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_93(void)

{
  DAT_00d1e648 = 0x3f800000;
  uRam0000000000d1e630 = 0;
  _DAT_00d1e628 = 0;
  uRam0000000000d1e640 = 0;
  _DAT_00d1e638 = 0;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1e628,&PTR_LOOP_00c48880);
  __cxa_atexit(std::__ndk1::mutex::~mutex,&DAT_00d1e650,&PTR_LOOP_00c48880);
  DAT_00d1e680 = 0;
  DAT_00d1e678 = 0;
  DAT_00d1e690 = 0;
  DAT_00d1e688 = 0;
  DAT_00d1e698 = 0x3f800000;
  __cxa_atexit(FUN_0083f7cc,&DAT_00d1e678,&PTR_LOOP_00c48880);
  return;
}

