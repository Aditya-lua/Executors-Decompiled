/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffd54
 */

/* std::__ndk1::__codecvt_utf8<wchar_t>::do_in(mbstate_t&, char const*, char const*, char const*&,
   wchar_t*, wchar_t*, wchar_t*&) const */

void __thiscall
std::__ndk1::__codecvt_utf8<wchar_t>::do_in
          (__codecvt_utf8<wchar_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar_t *param_5,wchar_t *param_6,wchar_t **param_7)

{
  wchar_t *local_30;
  char *pcStack_28;
  
  FUN_00bff66c(param_2,param_3,&pcStack_28,param_5,param_6,&local_30,*(undefined8 *)(this + 0x18),
               *(undefined4 *)(this + 0x20));
  *param_4 = pcStack_28;
  *param_7 = local_30;
  return;
}

