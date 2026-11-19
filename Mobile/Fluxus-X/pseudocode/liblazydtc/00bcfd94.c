/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcfd94
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::get() */

uint __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get
          (basic_istream<char,std::__ndk1::char_traits<char>> *this)

{
  byte *pbVar1;
  long *plVar2;
  uint uVar3;
  uint uVar4;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] != (sentry)0x1) {
    return 0xffffffff;
  }
  plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
  pbVar1 = (byte *)plVar2[3];
  if (pbVar1 == (byte *)plVar2[4]) {
                    /* try { // try from 00bcfe08 to 00bcfe0b has its CatchHandler @ 00bcfe5c */
    uVar4 = (**(code **)(*plVar2 + 0x50))();
    if (uVar4 == 0xffffffff) {
      uVar3 = 6;
      goto LAB_00bcfe24;
    }
  }
  else {
    plVar2[3] = (long)(pbVar1 + 1);
    uVar4 = (uint)*pbVar1;
  }
  uVar3 = 0;
  *(undefined8 *)(this + 8) = 1;
LAB_00bcfe24:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar3);
  return uVar4;
}

