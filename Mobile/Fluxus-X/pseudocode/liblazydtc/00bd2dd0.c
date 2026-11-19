/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2dd0
 */

/* virtual thunk to std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::~basic_istream() */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_istream
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  long lVar1;
  
  lVar1 = *(long *)(*(long *)this + -0x18);
  ios_base::~ios_base((ios_base *)(this + lVar1 + 0x10));
  operator_delete(this + lVar1,0xa8);
  return;
}

