/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2098
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::tellp() */

undefined1  [16] __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::tellp
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this)

{
  undefined1 auVar1 [16];
  
  if (((byte)this[*(long *)(*(long *)this + -0x18) + 0x20] & 5) == 0) {
    auVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x20))
                       (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,1,0x10);
    return auVar1;
  }
  return ZEXT816(0xffffffffffffffff) << 0x40;
}

