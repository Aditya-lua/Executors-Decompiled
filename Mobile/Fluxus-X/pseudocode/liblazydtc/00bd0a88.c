/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0a88
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::putback(char) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::putback
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char param_1)

{
  int iVar1;
  long *plVar2;
  char *pcVar3;
  long lVar4;
  uint uVar5;
  sentry local_14 [4];
  
  lVar4 = *(long *)(*(long *)this + -0x18);
  *(undefined8 *)(this + 8) = 0;
  uVar5 = *(uint *)(this + lVar4 + 0x20) & 0xfffffffd;
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar5);
  sentry::sentry(local_14,(basic_istream *)this,true);
  if (local_14[0] != (sentry)0x1) {
    uVar5 = uVar5 | 4;
    goto LAB_00bd0b40;
  }
  plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
  if (plVar2 != (long *)0x0) {
    if ((plVar2[2] != plVar2[3]) && (pcVar3 = (char *)(plVar2[3] + -1), *pcVar3 == param_1)) {
      plVar2[3] = (long)pcVar3;
      goto LAB_00bd0b40;
    }
                    /* try { // try from 00bd0b2c to 00bd0b33 has its CatchHandler @ 00bd0b70 */
    iVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,param_1);
    if (iVar1 != -1) goto LAB_00bd0b40;
  }
  uVar5 = uVar5 | 1;
LAB_00bd0b40:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar5);
  return this;
}

