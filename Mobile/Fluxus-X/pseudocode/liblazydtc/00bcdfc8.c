/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdfc8
 */

/* std::__ndk1::ios_base::~ios_base() */

void __thiscall std::__ndk1::ios_base::~ios_base(ios_base *this)

{
  ~ios_base(this);
  operator_delete(this,0x88);
  return;
}

