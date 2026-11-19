/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e42c
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::tellg() */

undefined8 __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::tellg
          (basic_istream<char,std::__ndk1::char_traits<char>> *this)

{
  ios_base *this_00;
  undefined8 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(*(long *)this + -0x18);
  this_00 = (ios_base *)(this + lVar2);
  if (*(uint *)(this_00 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88));
      lVar2 = *(long *)(*(long *)this + -0x18);
      if (*(int *)(this + lVar2 + 0x20) != 0) goto LAB_0097e458;
    }
                    /* try { // try from 0097e494 to 0097e4a3 has its CatchHandler @ 0097e4b0 */
    uVar1 = (**(code **)(**(long **)(this + lVar2 + 0x28) + 0x20))
                      (*(long **)(this + lVar2 + 0x28),0,1,8);
  }
  else {
                    /* try { // try from 0097e454 to 0097e46f has its CatchHandler @ 0097e4b4 */
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
LAB_0097e458:
    uVar1 = 0;
  }
  return uVar1;
}

