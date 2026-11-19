/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4408
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::get() */

int __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int *piVar1;
  int iVar2;
  long *plVar3;
  uint uVar4;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] != (sentry)0x1) {
    return -1;
  }
  plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
  piVar1 = (int *)plVar3[3];
  if (piVar1 == (int *)plVar3[4]) {
                    /* try { // try from 00bd448c to 00bd448f has its CatchHandler @ 00bd44d0 */
    iVar2 = (**(code **)(*plVar3 + 0x50))();
  }
  else {
    iVar2 = *piVar1;
    plVar3[3] = (long)(piVar1 + 1);
  }
  if (iVar2 == -1) {
    uVar4 = 6;
  }
  else {
    uVar4 = 0;
    *(undefined8 *)(this + 8) = 1;
  }
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar4);
  return iVar2;
}

