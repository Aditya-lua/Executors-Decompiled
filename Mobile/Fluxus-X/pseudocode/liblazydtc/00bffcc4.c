/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffcc4
 */

/* std::__ndk1::codecvt<char32_t, char8_t, mbstate_t>::do_length(mbstate_t&, char8_t const*, char8_t
   const*, unsigned long) const */

void __thiscall
std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::do_length
          (codecvt<char32_t,char8_t,mbstate_t> *this,mbstate_t *param_1,uchar *param_2,
          uchar *param_3,ulong param_4)

{
  FUN_00bff8e0(param_2,param_3,param_4,0x10ffff,0);
  return;
}

