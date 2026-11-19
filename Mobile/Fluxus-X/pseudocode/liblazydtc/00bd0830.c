/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0830
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::peek() */

uint __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::peek
          (basic_istream<char,std::__ndk1::char_traits<char>> *this)

{
  long *plVar1;
  uint uVar2;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] == (sentry)0x1) {
    plVar1 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if ((byte *)plVar1[3] == (byte *)plVar1[4]) {
                    /* try { // try from 00bd089c to 00bd089f has its CatchHandler @ 00bd08e0 */
      uVar2 = (**(code **)(*plVar1 + 0x48))();
    }
    else {
      uVar2 = (uint)*(byte *)plVar1[3];
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) |
                    (uint)(uVar2 == 0xffffffff) << 1);
  }
  else {
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

