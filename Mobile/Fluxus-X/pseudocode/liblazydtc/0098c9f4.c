/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098c9f4
 */

/* std::__ndk1::function<void (unsigned long, bool)>::~function() */

void __thiscall
std::__ndk1::function<void(unsigned_long,bool)>::~function(function<void(unsigned_long,bool)> *this)

{
  function<void(unsigned_long,bool)> *pfVar1;
  
  pfVar1 = *(function<void(unsigned_long,bool)> **)(this + 0x20);
  if (this == pfVar1) {
                    /* WARNING: Could not recover jumptable at 0x0098ca1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)pfVar1 + 0x20))();
    return;
  }
  if (pfVar1 == (function<void(unsigned_long,bool)> *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0098ca10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)pfVar1 + 0x28))();
  return;
}

