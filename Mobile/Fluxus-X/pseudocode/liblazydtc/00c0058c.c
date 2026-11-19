/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0058c
 */

/* std::__ndk1::__codecvt_utf16<wchar_t, false>::do_unshift(mbstate_t&, char*, char*, char*&) const
    */

undefined8 __thiscall
std::__ndk1::__codecvt_utf16<wchar_t,false>::do_unshift
          (__codecvt_utf16<wchar_t,false> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4)

{
  *param_4 = param_2;
  return 3;
}

