/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda064
 */

/* std::__ndk1::collate<char>::~collate() */

void __thiscall std::__ndk1::collate<char>::~collate(collate<char> *this)

{
  ~collate(this);
  operator_delete(this,0x10);
  return;
}

