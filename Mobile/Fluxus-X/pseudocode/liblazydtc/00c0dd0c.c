/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dd0c
 */

/* std::range_error::~range_error() */

void __thiscall std::range_error::~range_error(range_error *this)

{
  underflow_error::~underflow_error((underflow_error *)this);
  operator_delete(this,0x10);
  return;
}

