/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff8c4
 */

/* std::__ndk1::codecvt<char32_t, char, mbstate_t>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

void __thiscall
std::__ndk1::codecvt<char32_t,char,mbstate_t>::do_length
          (codecvt<char32_t,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  FUN_00bff8e0(param_2,param_3,param_4,0x10ffff,0);
  return;
}

