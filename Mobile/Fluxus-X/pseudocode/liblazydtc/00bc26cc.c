/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc26cc
 */

/* std::nested_exception::~nested_exception() */

void __thiscall std::nested_exception::~nested_exception(nested_exception *this)

{
  *(undefined ***)this = &PTR__nested_exception_00cac788;
  exception_ptr::~exception_ptr((exception_ptr *)(this + 8));
  return;
}

