/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff89c
 */

/* std::__ndk1::codecvt<char32_t, char, mbstate_t>::do_unshift(mbstate_t&, char*, char*, char*&)
   const */

undefined8 __thiscall
std::__ndk1::codecvt<char32_t,char,mbstate_t>::do_unshift
          (codecvt<char32_t,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4)

{
  *param_4 = param_2;
  return 3;
}

