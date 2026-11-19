/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dd6c
 */

/* std::underflow_error::~underflow_error() */

void __thiscall std::underflow_error::~underflow_error(underflow_error *this)

{
  ~underflow_error(this);
  operator_delete(this,0x10);
  return;
}

