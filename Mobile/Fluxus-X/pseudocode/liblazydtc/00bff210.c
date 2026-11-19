/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff210
 */

/* std::__ndk1::codecvt<char16_t, char8_t, mbstate_t>::do_out(mbstate_t&, char16_t const*, char16_t
   const*, char16_t const*&, char8_t*, char8_t*, char8_t*&) const */

void __thiscall
std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::do_out
          (codecvt<char16_t,char8_t,mbstate_t> *this,mbstate_t *param_1,wchar16 *param_2,
          wchar16 *param_3,wchar16 **param_4,uchar *param_5,uchar *param_6,uchar **param_7)

{
  uchar *local_30;
  wchar16 *pwStack_28;
  
  FUN_00bfea60(param_2,param_3,&pwStack_28,param_5,param_6,&local_30,0x10ffff,0);
  *param_4 = pwStack_28;
  *param_7 = local_30;
  return;
}

