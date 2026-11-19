/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f95a8
 */

/* std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*, std::__ndk1::default_delete<cpr::CurlHolder>,
   std::__ndk1::allocator<cpr::CurlHolder> >::~__shared_ptr_pointer() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
::~__shared_ptr_pointer
          (__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
           *this)

{
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

