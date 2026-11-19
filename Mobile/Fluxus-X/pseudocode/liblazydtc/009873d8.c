/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009873d8
 */

/* std::__ndk1::__shared_ptr_pointer<addrinfo*, void (*)(addrinfo*),
   std::__ndk1::allocator<addrinfo> >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>::
__on_zero_shared(__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>
                 *this)

{
                    /* try { // try from 009873e4 to 009873eb has its CatchHandler @ 009873f4 */
  (**(code **)(this + 0x20))(*(undefined8 *)(this + 0x18));
  return;
}

