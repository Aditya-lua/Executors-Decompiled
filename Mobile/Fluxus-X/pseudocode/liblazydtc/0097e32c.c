/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e32c
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::seekg(long long,
   std::__ndk1::ios_base::seekdir) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,undefined8 param_1,
          undefined4 param_3)

{
  ios_base *this_00;
  long extraout_x1;
  long lVar1;
  
                    /* try { // try from 0097e35c to 0097e35f has its CatchHandler @ 0097e3fc */
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) &
                  0xfffffffd);
  lVar1 = *(long *)(*(long *)this + -0x18);
  this_00 = (ios_base *)(this + lVar1);
  if (*(uint *)(this_00 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88));
      lVar1 = *(long *)(*(long *)this + -0x18);
      if (*(int *)(this + lVar1 + 0x20) != 0) {
        return this;
      }
    }
                    /* try { // try from 0097e3c0 to 0097e3cf has its CatchHandler @ 0097e3f4 */
    (**(code **)(**(long **)(this + lVar1 + 0x28) + 0x20))
              (*(long **)(this + lVar1 + 0x28),param_1,param_3,8);
    if (extraout_x1 == -1) {
                    /* try { // try from 0097e3ec to 0097e3ef has its CatchHandler @ 0097e3f8 */
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 4);
    }
  }
  else {
                    /* try { // try from 0097e378 to 0097e39b has its CatchHandler @ 0097e3f8 */
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
  }
  return this;
}

