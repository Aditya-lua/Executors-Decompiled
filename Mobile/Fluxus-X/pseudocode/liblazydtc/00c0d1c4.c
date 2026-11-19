/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d1c4
 */

/* std::__ndk1::regex_error::~regex_error() */

void __thiscall std::__ndk1::regex_error::~regex_error(regex_error *this)

{
  ~regex_error(this);
  operator_delete(this,0x18);
  return;
}

