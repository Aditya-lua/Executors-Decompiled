/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c07620
 */

/* std::__ndk1::__time_get_storage<char>::__time_get_storage(char const*) */

void __thiscall
std::__ndk1::__time_get_storage<char>::__time_get_storage
          (__time_get_storage<char> *this,char *param_1)

{
  undefined **local_58 [2];
  void *local_48;
  char local_40;
  __locale_t local_38;
  
  __time_get::__time_get((__time_get *)this,param_1);
  memset(this + 8,0,0x420);
                    /* try { // try from 00c07654 to 00c07663 has its CatchHandler @ 00c076f0 */
  ctype_byname<char>::ctype_byname((ctype_byname<char> *)local_58,param_1,1);
  local_58[0] = &PTR__ctype_byname_00cafb10;
                    /* try { // try from 00c07670 to 00c0767b has its CatchHandler @ 00c076e0 */
  init((ctype *)this);
  local_58[0] = &PTR__ctype_byname_00cad640;
                    /* try { // try from 00c07690 to 00c07693 has its CatchHandler @ 00c076dc */
  freelocale(local_38);
  local_58[0] = &PTR__ctype_00cad5d8;
  if ((local_48 != (void *)0x0) && (local_40 == '\x01')) {
    operator_delete__(local_48);
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)local_58);
  return;
}

