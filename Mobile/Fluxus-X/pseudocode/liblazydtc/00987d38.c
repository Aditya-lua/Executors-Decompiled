/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987d38
 */

/* std::__ndk1::function<std::__ndk1::shared_ptr<ix::ConnectionState> ()>::~function() */

void __thiscall
std::__ndk1::function<std::__ndk1::shared_ptr<ix::ConnectionState>()>::~function
          (function<std::__ndk1::shared_ptr<ix::ConnectionState>()> *this)

{
  function<std::__ndk1::shared_ptr<ix::ConnectionState>()> *pfVar1;
  
  pfVar1 = *(function<std::__ndk1::shared_ptr<ix::ConnectionState>()> **)(this + 0x20);
  if (this == pfVar1) {
                    /* WARNING: Could not recover jumptable at 0x00987d60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)pfVar1 + 0x20))();
    return;
  }
  if (pfVar1 == (function<std::__ndk1::shared_ptr<ix::ConnectionState>()> *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00987d54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)pfVar1 + 0x28))();
  return;
}

