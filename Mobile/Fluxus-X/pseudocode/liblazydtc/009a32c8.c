/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a32c8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_185(void)

{
  DAT_00d21858 = 0;
  DAT_00d21860 = 0;
  _DAT_00d21850 = 0xffff000008;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&DAT_00d21850,&PTR_LOOP_00c48880);
  return;
}

