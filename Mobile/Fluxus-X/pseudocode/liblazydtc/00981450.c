/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00981450
 */

/* std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,
   std::__ndk1::allocator<ix::ConnectionState> >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>::
__on_zero_shared(__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>
                 *this)

{
                    /* WARNING: Could not recover jumptable at 0x00981458. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)**(undefined8 **)(this + 0x20))();
  return;
}

