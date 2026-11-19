/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc0e8
 */

/* std::__ndk1::future_error::~future_error() */

void __thiscall std::__ndk1::future_error::~future_error(future_error *this)

{
  ~future_error(this);
  operator_delete(this,0x20);
  return;
}

