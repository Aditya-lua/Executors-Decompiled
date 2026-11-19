/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffc38
 */

/* std::__ndk1::codecvt<char32_t, char8_t, mbstate_t>::do_in(mbstate_t&, char8_t const*, char8_t
   const*, char8_t const*&, char32_t*, char32_t*, char32_t*&) const */

void __thiscall
std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::do_in
          (codecvt<char32_t,char8_t,mbstate_t> *this,mbstate_t *param_1,uchar *param_2,
          uchar *param_3,uchar **param_4,wchar32 *param_5,wchar32 *param_6,wchar32 **param_7)

{
  wchar32 *local_30;
  uchar *puStack_28;
  
  FUN_00bff66c(param_2,param_3,&puStack_28,param_5,param_6,&local_30,0x10ffff,0);
  *param_4 = puStack_28;
  *param_7 = local_30;
  return;
}

