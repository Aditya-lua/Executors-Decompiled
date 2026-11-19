/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd31c4
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_streambuf<wchar_t,
   std::__ndk1::char_traits<wchar_t> >*) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator>>
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1)

{
  int *piVar1;
  int iVar2;
  long *plVar3;
  uint uVar4;
  uint uVar5;
  sentry local_34 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_34,(basic_istream *)this,true);
  if (local_34[0] != (sentry)0x1) {
    return this;
  }
  if (param_1 != (basic_streambuf *)0x0) {
LAB_00bd3234:
    plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if ((int *)plVar3[3] == (int *)plVar3[4]) {
                    /* try { // try from 00bd325c to 00bd32bf has its CatchHandler @ 00bd331c */
      iVar2 = (**(code **)(*plVar3 + 0x48))();
    }
    else {
      iVar2 = *(int *)plVar3[3];
    }
    if (iVar2 == -1) {
      uVar4 = 2;
      goto LAB_00bd32d8;
    }
    piVar1 = *(int **)(param_1 + 0x30);
    if (piVar1 == *(int **)(param_1 + 0x38)) {
      iVar2 = (**(code **)(*(long *)param_1 + 0x68))(param_1);
      if (iVar2 == -1) goto LAB_00bd32d4;
    }
    else {
      *piVar1 = iVar2;
      *(int **)(param_1 + 0x30) = piVar1 + 1;
    }
    if (*(long *)(this + 8) != 0x7fffffffffffffff) {
      *(long *)(this + 8) = *(long *)(this + 8) + 1;
    }
    plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if (plVar3[3] == plVar3[4]) {
      (**(code **)(*plVar3 + 0x50))();
    }
    else {
      plVar3[3] = plVar3[3] + 4;
    }
    goto LAB_00bd3234;
  }
  uVar5 = 4;
LAB_00bd32e8:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar5);
  return this;
LAB_00bd32d4:
  uVar4 = 0;
LAB_00bd32d8:
  uVar5 = uVar4 | 4;
  if (*(long *)(this + 8) != 0) {
    uVar5 = uVar4;
  }
  goto LAB_00bd32e8;
}

