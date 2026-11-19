/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf3390
 */

/* std::__ndk1::codecvt_byname<wchar_t, char, mbstate_t>::~codecvt_byname() */

void __thiscall
std::__ndk1::codecvt_byname<wchar_t,char,mbstate_t>::~codecvt_byname
          (codecvt_byname<wchar_t,char,mbstate_t> *this)

{
  codecvt<wchar_t,char,mbstate_t>::~codecvt((codecvt<wchar_t,char,mbstate_t> *)this);
  return;
}

