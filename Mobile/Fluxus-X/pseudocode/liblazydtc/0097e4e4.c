/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e4e4
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::read(char*, long) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::read
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  ios_base *this_00;
  basic_istream<char,std::__ndk1::char_traits<char>> *this_01;
  long lVar1;
  uint uVar2;
  
  *(undefined8 *)(this + 8) = 0;
  lVar1 = *(long *)(*(long *)this + -0x18);
  this_00 = (ios_base *)(this + lVar1);
  if (*(uint *)(this_00 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88));
      lVar1 = *(long *)(*(long *)this + -0x18);
      this_01 = this + lVar1;
      uVar2 = *(uint *)(this_01 + 0x20);
      if (uVar2 != 0) goto LAB_0097e530;
    }
    lVar1 = (**(code **)(**(long **)(this + lVar1 + 0x28) + 0x40))
                      (*(long **)(this + lVar1 + 0x28),param_1,param_2);
    *(long *)(this + 8) = lVar1;
    if (lVar1 != param_2) {
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 6);
    }
  }
  else {
                    /* try { // try from 0097e51c to 0097e5ab has its CatchHandler @ 0097e5b0 */
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
    this_01 = this + *(long *)(*(long *)this + -0x18);
    uVar2 = *(uint *)(this_01 + 0x20);
LAB_0097e530:
    ios_base::clear((ios_base *)this_01,uVar2 | 4);
  }
  return this;
}

