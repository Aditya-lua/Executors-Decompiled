/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9604
 */

/* std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*, std::__ndk1::default_delete<cpr::CurlHolder>,
   std::__ndk1::allocator<cpr::CurlHolder> >::__get_deleter(std::type_info const&) const */

__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
* __thiscall
std::__ndk1::
__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
::__get_deleter(__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
                *this,type_info *param_1)

{
  __shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
  *p_Var1;
  
  p_Var1 = this + 0x18;
  if (*(char **)(param_1 + 8) != "NSt6__ndk114default_deleteIN3cpr10CurlHolderEEE") {
    p_Var1 = (__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
              *)0x0;
  }
  return p_Var1;
}

