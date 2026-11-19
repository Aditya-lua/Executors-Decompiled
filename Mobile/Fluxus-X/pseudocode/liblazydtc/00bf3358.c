/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf3358
 */

/* std::__ndk1::codecvt_byname<char, char, mbstate_t>::~codecvt_byname() */

void __thiscall
std::__ndk1::codecvt_byname<char,char,mbstate_t>::~codecvt_byname
          (codecvt_byname<char,char,mbstate_t> *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  return;
}

