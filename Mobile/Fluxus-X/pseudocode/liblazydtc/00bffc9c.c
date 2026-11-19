/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffc9c
 */

/* std::__ndk1::codecvt<char32_t, char8_t, mbstate_t>::do_unshift(mbstate_t&, char8_t*, char8_t*,
   char8_t*&) const */

undefined8 __thiscall
std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::do_unshift
          (codecvt<char32_t,char8_t,mbstate_t> *this,mbstate_t *param_1,uchar *param_2,
          uchar *param_3,uchar **param_4)

{
  *param_4 = param_2;
  return 3;
}

