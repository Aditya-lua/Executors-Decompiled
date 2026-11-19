/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda1e4
 */

/* std::__ndk1::collate<wchar_t>::~collate() */

void __thiscall std::__ndk1::collate<wchar_t>::~collate(collate<wchar_t> *this)

{
  ~collate(this);
  operator_delete(this,0x10);
  return;
}

