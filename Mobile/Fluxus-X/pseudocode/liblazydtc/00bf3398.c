/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf3398
 */

/* std::__ndk1::codecvt_byname<wchar_t, char, mbstate_t>::~codecvt_byname() */

void __thiscall
std::__ndk1::codecvt_byname<wchar_t,char,mbstate_t>::~codecvt_byname
          (codecvt_byname<wchar_t,char,mbstate_t> *this)

{
  ~codecvt_byname(this);
  operator_delete(this,0x18);
  return;
}

