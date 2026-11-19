/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbac4
 */

/* std::__ndk1::system_error::~system_error() */

void __thiscall std::__ndk1::system_error::~system_error(system_error *this)

{
  ~system_error(this);
  operator_delete(this,0x20);
  return;
}

