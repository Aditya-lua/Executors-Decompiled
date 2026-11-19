/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc0c8
 */

/* std::__ndk1::collate_byname<wchar_t>::~collate_byname() */

void __thiscall std::__ndk1::collate_byname<wchar_t>::~collate_byname(collate_byname<wchar_t> *this)

{
  ~collate_byname(this);
  operator_delete(this,0x18);
  return;
}

