/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5320
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::unget() */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::unget
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  int *piVar4;
  uint uVar5;
  sentry local_24 [4];
  
  lVar3 = *(long *)(*(long *)this + -0x18);
  *(undefined8 *)(this + 8) = 0;
  uVar5 = *(uint *)(this + lVar3 + 0x20) & 0xfffffffd;
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar5);
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] == (sentry)0x1) {
    plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if (plVar2 != (long *)0x0) {
      if (plVar2[2] == plVar2[3]) {
                    /* try { // try from 00bd53c0 to 00bd53c7 has its CatchHandler @ 00bd5408 */
        iVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,0xffffffff);
      }
      else {
        piVar4 = (int *)(plVar2[3] + -4);
        iVar1 = *piVar4;
        plVar2[3] = (long)piVar4;
      }
      if (iVar1 != -1) goto LAB_00bd53d8;
    }
    uVar5 = uVar5 | 1;
  }
  else {
    uVar5 = uVar5 | 4;
  }
LAB_00bd53d8:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar5);
  return this;
}

