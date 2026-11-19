/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c07888
 */

/* std::__ndk1::__time_get_storage<char>::__time_get_storage(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::__time_get_storage<char>::__time_get_storage
          (__time_get_storage<char> *this,basic_string_conflict *param_1)

{
  undefined **local_58 [2];
  void *local_48;
  char local_40;
  __locale_t local_38;
  
  __time_get::__time_get((__time_get *)this,param_1);
  memset(this + 8,0,0x420);
                    /* try { // try from 00c078bc to 00c078cb has its CatchHandler @ 00c07958 */
  ctype_byname<char>::ctype_byname((ctype_byname<char> *)local_58,param_1,1);
  local_58[0] = &PTR__ctype_byname_00cafb10;
                    /* try { // try from 00c078d8 to 00c078e3 has its CatchHandler @ 00c07948 */
  init((ctype *)this);
  local_58[0] = &PTR__ctype_byname_00cad640;
                    /* try { // try from 00c078f8 to 00c078fb has its CatchHandler @ 00c07944 */
  freelocale(local_38);
  local_58[0] = &PTR__ctype_00cad5d8;
  if ((local_48 != (void *)0x0) && (local_40 == '\x01')) {
    operator_delete__(local_48);
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)local_58);
  return;
}

