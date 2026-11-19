/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2664
 */

/* std::nested_exception::nested_exception() */

void __thiscall std::nested_exception::nested_exception(nested_exception *this)

{
  undefined8 uVar1;
  
  *(undefined ***)this = &PTR__nested_exception_00cac788;
  uVar1 = __cxa_current_primary_exception();
  *(undefined8 *)(this + 8) = uVar1;
  return;
}

