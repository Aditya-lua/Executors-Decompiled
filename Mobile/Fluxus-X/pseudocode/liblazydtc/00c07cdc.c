/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c07cdc
 */

/* std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage
          (__time_get_storage<wchar_t> *this,basic_string_conflict *param_1)

{
  undefined **local_38 [2];
  __locale_t local_28;
  
  __time_get::__time_get((__time_get *)this,param_1);
  memset(this + 8,0,0x420);
                    /* try { // try from 00c07d0c to 00c07d1b has its CatchHandler @ 00c07d7c */
  ctype_byname<wchar_t>::ctype_byname((ctype_byname<wchar_t> *)local_38,param_1,1);
  local_38[0] = &PTR__ctype_byname_00cafb90;
                    /* try { // try from 00c07d28 to 00c07d33 has its CatchHandler @ 00c07d6c */
  init((ctype *)this);
  local_38[0] = &PTR__ctype_byname_00cad6a8;
                    /* try { // try from 00c07d48 to 00c07d4b has its CatchHandler @ 00c07d68 */
  freelocale(local_28);
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)local_38);
  return;
}

