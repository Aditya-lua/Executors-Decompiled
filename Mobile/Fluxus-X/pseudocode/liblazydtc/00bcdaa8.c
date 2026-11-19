/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdaa8
 */

/* std::__ndk1::ios_base::failure::~failure() */

void __thiscall std::__ndk1::ios_base::failure::~failure(failure *this)

{
  system_error::~system_error((system_error *)this);
  return;
}

