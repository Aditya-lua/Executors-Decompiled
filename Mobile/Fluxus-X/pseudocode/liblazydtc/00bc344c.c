/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc344c
 */

/* std::logic_error::logic_error(std::logic_error const&) */

void __thiscall std::logic_error::logic_error(logic_error *this,logic_error *param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 8);
  *(undefined ***)this = &PTR__domain_error_00cb0548;
  *(long *)(this + 8) = lVar1;
  FUN_00c2bcb0(1,lVar1 + -8);
  return;
}

