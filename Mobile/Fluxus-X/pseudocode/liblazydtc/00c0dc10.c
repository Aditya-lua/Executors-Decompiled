/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dc10
 */

/* std::runtime_error::~runtime_error() */

void __thiscall std::runtime_error::~runtime_error(runtime_error *this)

{
  underflow_error::~underflow_error((underflow_error *)this);
  operator_delete(this,0x10);
  return;
}

