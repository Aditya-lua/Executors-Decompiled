/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ac5c
 */

/* std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState> (*)(),
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState> (*)()>,
   std::__ndk1::shared_ptr<ix::ConnectionState> ()>::TEMPNAMEPLACEHOLDERVALUE() */

void __thiscall
std::__ndk1::__function::
__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
::operator()(__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
             *this)

{
                    /* WARNING: Could not recover jumptable at 0x0098ac60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(this + 8))();
  return;
}

