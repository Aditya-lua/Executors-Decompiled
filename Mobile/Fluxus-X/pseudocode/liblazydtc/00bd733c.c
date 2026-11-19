/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd733c
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::tellp() */

undefined1  [16] __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::tellp
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  undefined1 auVar1 [16];
  
  if (((byte)this[*(long *)(*(long *)this + -0x18) + 0x20] & 5) == 0) {
    auVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x20))
                       (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,1,0x10);
    return auVar1;
  }
  return ZEXT816(0xffffffffffffffff) << 0x40;
}

