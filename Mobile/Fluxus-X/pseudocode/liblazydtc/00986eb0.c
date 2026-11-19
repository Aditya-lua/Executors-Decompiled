/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986eb0
 */

/* ix::DNSLookup::resolveUnCancellable(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()>
   const&) */

void ix::DNSLookup::resolveUnCancellable(basic_string_conflict *param_1,function *param_2)

{
  basic_string_conflict *pbVar1;
  undefined8 *puVar2;
  long in_x2;
  undefined8 *in_x8;
  
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "no error",8);
  if (*(long **)(in_x2 + 0x20) == (long *)0x0) {
    puVar2 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar2 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar2,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
  pbVar1 = (basic_string_conflict *)(**(code **)(**(long **)(in_x2 + 0x20) + 0x30))();
  if (((ulong)pbVar1 & 1) == 0) {
    getAddrInfo(pbVar1,(int)param_1 + 0x10,(basic_string_conflict *)(ulong)*(uint *)(param_1 + 0x28)
               );
    return;
  }
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "cancellation requested",0x16);
  *in_x8 = 0;
  in_x8[1] = 0;
  return;
}

