/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe9fc
 */

/* std::__ndk1::codecvt<char16_t, char, mbstate_t>::do_out(mbstate_t&, char16_t const*, char16_t
   const*, char16_t const*&, char*, char*, char*&) const */

void __thiscall
std::__ndk1::codecvt<char16_t,char,mbstate_t>::do_out
          (codecvt<char16_t,char,mbstate_t> *this,mbstate_t *param_1,wchar16 *param_2,
          wchar16 *param_3,wchar16 **param_4,char *param_5,char *param_6,char **param_7)

{
  char *local_30;
  wchar16 *pwStack_28;
  
  FUN_00bfea60(param_2,param_3,&pwStack_28,param_5,param_6,&local_30,0x10ffff,0);
  *param_4 = pwStack_28;
  *param_7 = local_30;
  return;
}

