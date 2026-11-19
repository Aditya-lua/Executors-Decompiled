/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe118
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::~codecvt() */

void __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::~codecvt(codecvt<wchar_t,char,mbstate_t> *this)

{
  ~codecvt(this);
  operator_delete(this,0x18);
  return;
}

