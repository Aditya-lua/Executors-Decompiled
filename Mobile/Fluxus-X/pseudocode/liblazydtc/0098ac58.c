/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ac58
 */

/* std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState> (*)(),
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState> (*)()>,
   std::__ndk1::shared_ptr<ix::ConnectionState> ()>::destroy_deallocate() */

void __thiscall
std::__ndk1::__function::
__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
::destroy_deallocate
          (__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
           *this)

{
  operator_delete(this);
  return;
}

