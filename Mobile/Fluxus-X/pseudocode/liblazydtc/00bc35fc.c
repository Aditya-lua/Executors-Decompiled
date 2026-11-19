/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc35fc
 */

/* std::runtime_error::runtime_error(std::runtime_error const&) */

void __thiscall std::runtime_error::runtime_error(runtime_error *this,runtime_error *param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 8);
  *(undefined ***)this = &PTR__underflow_error_00cb0570;
  *(long *)(this + 8) = lVar1;
  FUN_00c2bcb0(1,lVar1 + -8);
  return;
}

