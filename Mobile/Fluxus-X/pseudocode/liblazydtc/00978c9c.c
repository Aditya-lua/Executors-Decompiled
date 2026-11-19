/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978c9c
 */

/* virtual thunk to std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::~basic_ostream() */

void __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  
  lVar1 = *(long *)(*(long *)this + -0x18);
  ios_base::~ios_base((ios_base *)(this + lVar1 + 8));
  operator_delete(this + lVar1);
  return;
}

