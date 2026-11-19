/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f95cc
 */

/* std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*, std::__ndk1::default_delete<cpr::CurlHolder>,
   std::__ndk1::allocator<cpr::CurlHolder> >::__on_zero_shared() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
::__on_zero_shared(__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>
                   *this)

{
  CurlHolder *this_00;
  
  this_00 = *(CurlHolder **)(this + 0x18);
  if (this_00 == (CurlHolder *)0x0) {
    return;
  }
  cpr::CurlHolder::~CurlHolder(this_00);
  operator_delete(this_00);
  return;
}

