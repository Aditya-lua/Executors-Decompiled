/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0934
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::readsome(char*, long) */

undefined8 __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::readsome
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  uint uVar3;
  sentry local_14 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_14,(basic_istream *)this,true);
  if (local_14[0] == (sentry)0x1) {
    plVar1 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if ((ulong)plVar1[3] < (ulong)plVar1[4]) {
      lVar2 = plVar1[4] - plVar1[3];
    }
    else {
                    /* try { // try from 00bd09a8 to 00bd09f7 has its CatchHandler @ 00bd0a38 */
      lVar2 = (**(code **)(*plVar1 + 0x38))();
    }
    if (lVar2 == -1) {
      uVar3 = 2;
    }
    else if (lVar2 == 0) {
      uVar3 = 0;
    }
    else {
      if (lVar2 <= param_2) {
        param_2 = lVar2;
      }
      lVar2 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x40))
                        (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28),param_1,param_2)
      ;
      *(long *)(this + 8) = lVar2;
      uVar3 = 0;
      if (lVar2 != param_2) {
        uVar3 = 6;
      }
    }
  }
  else {
    uVar3 = 4;
  }
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar3);
  return *(undefined8 *)(this + 8);
}

