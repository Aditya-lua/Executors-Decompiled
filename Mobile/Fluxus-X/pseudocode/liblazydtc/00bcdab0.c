/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdab0
 */

/* std::__ndk1::ios_base::failure::~failure() */

void __thiscall std::__ndk1::ios_base::failure::~failure(failure *this)

{
  ~failure(this);
  operator_delete(this,0x20);
  return;
}

