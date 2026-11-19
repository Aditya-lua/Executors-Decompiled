/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbabc
 */

/* std::__ndk1::system_error::~system_error() */

void __thiscall std::__ndk1::system_error::~system_error(system_error *this)

{
  underflow_error::~underflow_error((underflow_error *)this);
  return;
}

