/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcef44
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*)
    */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  undefined1 *puVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  uint uVar5;
  sentry local_34 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_34,(basic_istream *)this,true);
  if (local_34[0] != (sentry)0x1) {
    return this;
  }
  if (param_1 != (basic_streambuf *)0x0) {
LAB_00bcefb4:
    plVar4 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if ((byte *)plVar4[3] == (byte *)plVar4[4]) {
                    /* try { // try from 00bcefdc to 00bcf043 has its CatchHandler @ 00bcf0a0 */
      uVar2 = (**(code **)(*plVar4 + 0x48))();
      if (uVar2 == 0xffffffff) {
        uVar2 = 2;
        goto LAB_00bcf05c;
      }
    }
    else {
      uVar2 = (uint)*(byte *)plVar4[3];
    }
    puVar1 = *(undefined1 **)(param_1 + 0x30);
    if (puVar1 == *(undefined1 **)(param_1 + 0x38)) {
      iVar3 = (**(code **)(*(long *)param_1 + 0x68))(param_1,uVar2 & 0xff);
      if (iVar3 == -1) goto LAB_00bcf058;
    }
    else {
      *(undefined1 **)(param_1 + 0x30) = puVar1 + 1;
      *puVar1 = (char)uVar2;
    }
    if (*(long *)(this + 8) != 0x7fffffffffffffff) {
      *(long *)(this + 8) = *(long *)(this + 8) + 1;
    }
    plVar4 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if (plVar4[3] == plVar4[4]) {
      (**(code **)(*plVar4 + 0x50))();
    }
    else {
      plVar4[3] = plVar4[3] + 1;
    }
    goto LAB_00bcefb4;
  }
  uVar5 = 4;
LAB_00bcf06c:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar5);
  return this;
LAB_00bcf058:
  uVar2 = 0;
LAB_00bcf05c:
  uVar5 = uVar2 | 4;
  if (*(long *)(this + 8) != 0) {
    uVar5 = uVar2;
  }
  goto LAB_00bcf06c;
}

