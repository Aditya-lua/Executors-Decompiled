/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2448
 */

/* virtual thunk to std::__ndk1::basic_iostream<char, std::__ndk1::char_traits<char>
   >::~basic_iostream() */

void __thiscall
std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::~basic_iostream
          (basic_iostream<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  
  lVar1 = *(long *)(*(long *)this + -0x18);
  ios_base::~ios_base((ios_base *)(this + lVar1 + 0x18));
  operator_delete(this + lVar1,0xb0);
  return;
}

