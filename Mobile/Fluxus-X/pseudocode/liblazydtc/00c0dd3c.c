/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dd3c
 */

/* std::overflow_error::~overflow_error() */

void __thiscall std::overflow_error::~overflow_error(overflow_error *this)

{
  underflow_error::~underflow_error((underflow_error *)this);
  operator_delete(this,0x10);
  return;
}

