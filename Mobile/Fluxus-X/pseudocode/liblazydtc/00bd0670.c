/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0670
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::ignore(long, int) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::ignore
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,long param_1,int param_2)

{
  byte *pbVar1;
  uint uVar2;
  long *plVar3;
  long lVar4;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] != (sentry)0x1) {
    return this;
  }
  if (param_1 == 0x7fffffffffffffff) {
    do {
      plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      pbVar1 = (byte *)plVar3[3];
      if (pbVar1 == (byte *)plVar3[4]) {
                    /* try { // try from 00bd0700 to 00bd0703 has its CatchHandler @ 00bd07e0 */
        uVar2 = (**(code **)(*plVar3 + 0x50))();
        if (uVar2 == 0xffffffff) goto LAB_00bd07a4;
      }
      else {
        plVar3[3] = (long)(pbVar1 + 1);
        uVar2 = (uint)*pbVar1;
      }
      if (*(long *)(this + 8) != 0x7fffffffffffffff) {
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
      }
    } while (uVar2 != param_2);
  }
  else {
    lVar4 = *(long *)(this + 8);
    if (lVar4 < param_1) {
      do {
        plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
        pbVar1 = (byte *)plVar3[3];
        if (pbVar1 == (byte *)plVar3[4]) {
                    /* try { // try from 00bd077c to 00bd077f has its CatchHandler @ 00bd07dc */
          uVar2 = (**(code **)(*plVar3 + 0x50))();
          if (uVar2 == 0xffffffff) goto LAB_00bd07a4;
          lVar4 = *(long *)(this + 8);
          if (lVar4 != 0x7fffffffffffffff) goto LAB_00bd0748;
          lVar4 = *(long *)(this + 8);
        }
        else {
          plVar3[3] = (long)(pbVar1 + 1);
          uVar2 = (uint)*pbVar1;
LAB_00bd0748:
          lVar4 = lVar4 + 1;
          *(long *)(this + 8) = lVar4;
        }
      } while (uVar2 != param_2 && lVar4 < param_1);
    }
  }
  uVar2 = 0;
LAB_00bd07a8:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar2);
  return this;
LAB_00bd07a4:
  uVar2 = 2;
  goto LAB_00bd07a8;
}

