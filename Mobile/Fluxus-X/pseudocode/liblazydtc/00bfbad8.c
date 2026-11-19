/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfbad8
 */

/* std::__ndk1::collate_byname<char>::~collate_byname() */

void __thiscall std::__ndk1::collate_byname<char>::~collate_byname(collate_byname<char> *this)

{
  ~collate_byname(this);
  operator_delete(this,0x18);
  return;
}

