/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9620
 */

/* std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*, std::__ndk1::default_delete<cpr::CurlHolder>,
   std::__ndk1::allocator<cpr::CurlHolder> >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
::__on_zero_shared_weak
          (__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
           *this)

{
  operator_delete(this);
  return;
}

