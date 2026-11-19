/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0bc0
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::unget() */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::unget
          (basic_istream<char,std::__ndk1::char_traits<char>> *this)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  uint uVar4;
  sentry local_24 [4];
  
  lVar3 = *(long *)(*(long *)this + -0x18);
  *(undefined8 *)(this + 8) = 0;
  uVar4 = *(uint *)(this + lVar3 + 0x20) & 0xfffffffd;
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar4);
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] != (sentry)0x1) {
    uVar4 = uVar4 | 4;
    goto LAB_00bd0c6c;
  }
  plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
  if (plVar2 != (long *)0x0) {
    if (plVar2[2] != plVar2[3]) {
      plVar2[3] = plVar2[3] + -1;
      goto LAB_00bd0c6c;
    }
                    /* try { // try from 00bd0c58 to 00bd0c5f has its CatchHandler @ 00bd0c9c */
    iVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,0xffffffff);
    if (iVar1 != -1) goto LAB_00bd0c6c;
  }
  uVar4 = uVar4 | 1;
LAB_00bd0c6c:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar4);
  return this;
}

