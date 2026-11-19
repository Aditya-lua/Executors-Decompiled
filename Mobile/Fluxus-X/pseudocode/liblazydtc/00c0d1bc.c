/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d1bc
 */

/* std::__ndk1::regex_error::~regex_error() */

void __thiscall std::__ndk1::regex_error::~regex_error(regex_error *this)

{
  underflow_error::~underflow_error((underflow_error *)this);
  return;
}

