/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc26e4
 */

/* std::nested_exception::~nested_exception() */

void __thiscall std::nested_exception::~nested_exception(nested_exception *this)

{
  ~nested_exception(this);
  operator_delete(this,0x10);
  return;
}

