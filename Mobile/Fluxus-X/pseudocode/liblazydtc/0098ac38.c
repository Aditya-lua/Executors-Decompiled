/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ac38
 */

/* std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState> (*)(),
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState> (*)()>,
   std::__ndk1::shared_ptr<ix::ConnectionState>
   ()>::__clone(std::__ndk1::__function::__base<std::__ndk1::shared_ptr<ix::ConnectionState> ()>*)
   const */

void __thiscall
std::__ndk1::__function::
__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
::__clone(__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>
          *this,__base *param_1)

{
  *(undefined ***)param_1 = &PTR_LAB_00c52108;
  *(undefined8 *)(param_1 + 8) = *(undefined8 *)(this + 8);
  return;
}

