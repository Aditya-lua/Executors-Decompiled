/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4a8c
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::getline(wchar_t*, long,
   wchar_t) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::getline
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2,wchar_t param_3)

{
  wchar_t wVar1;
  long *plVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  wchar_t *pwVar7;
  sentry local_54 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_54,(basic_istream *)this,true);
  if (local_54[0] != (sentry)0x1) {
LAB_00bd4bec:
    uVar3 = 0;
    uVar4 = 0;
joined_r0x00bd4c54:
    if (0 < param_2) {
      *param_1 = L'\0';
      uVar4 = uVar3;
    }
    uVar3 = uVar4 | 4;
    if (*(long *)(this + 8) != 0) {
      uVar3 = uVar4;
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar3)
    ;
    return this;
  }
LAB_00bd4b00:
  plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
  if ((wchar_t *)plVar2[3] == (wchar_t *)plVar2[4]) {
                    /* try { // try from 00bd4b28 to 00bd4b2b has its CatchHandler @ 00bd4c68 */
    wVar1 = (**(code **)(*plVar2 + 0x48))();
  }
  else {
    wVar1 = *(wchar_t *)plVar2[3];
  }
  if (wVar1 == L'\xffffffff') {
    uVar3 = 2;
    uVar4 = 2;
    goto joined_r0x00bd4c54;
  }
  if (wVar1 == param_3) {
    plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if (plVar2[3] == plVar2[4]) {
                    /* try { // try from 00bd4bd8 to 00bd4bdb has its CatchHandler @ 00bd4c5c */
      (**(code **)(*plVar2 + 0x50))();
    }
    else {
      plVar2[3] = plVar2[3] + 4;
    }
    if (*(long *)(this + 8) == 0x7fffffffffffffff) goto LAB_00bd4bec;
    uVar3 = 0;
    uVar4 = 0;
    *(long *)(this + 8) = *(long *)(this + 8) + 1;
  }
  else {
    lVar5 = *(long *)(this + 8);
    if (lVar5 < param_2 + -1) {
      lVar6 = *(long *)this;
      pwVar7 = param_1 + 1;
      *param_1 = wVar1;
      plVar2 = *(long **)(this + *(long *)(lVar6 + -0x18) + 0x28);
      param_1 = pwVar7;
      if (plVar2[3] == plVar2[4]) goto code_r0x00bd4b68;
      plVar2[3] = plVar2[3] + 4;
      goto LAB_00bd4af4;
    }
    uVar3 = 4;
    uVar4 = 4;
  }
  goto joined_r0x00bd4c54;
code_r0x00bd4b68:
                    /* try { // try from 00bd4b70 to 00bd4b73 has its CatchHandler @ 00bd4c60 */
  (**(code **)(*plVar2 + 0x50))();
  lVar5 = *(long *)(this + 8);
  if (lVar5 != 0x7fffffffffffffff) {
LAB_00bd4af4:
    *(long *)(this + 8) = lVar5 + 1;
  }
  goto LAB_00bd4b00;
}

