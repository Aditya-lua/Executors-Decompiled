/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ac64
 */

/* std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState> (*)(),
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState> (*)()>,
   std::__ndk1::shared_ptr<ix::ConnectionState> ()>::target(std::type_info const&) const */

__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
* __thiscall
std::__ndk1::__function::
__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
::target(__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
         *this,type_info *param_1)

{
  __func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
  *p_Var1;
  
  p_Var1 = this + 8;
  if (*(char **)(param_1 + 8) != "PFNSt6__ndk110shared_ptrIN2ix15ConnectionStateEEEvE") {
    p_Var1 = (__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
              *)0x0;
  }
  return p_Var1;
}

