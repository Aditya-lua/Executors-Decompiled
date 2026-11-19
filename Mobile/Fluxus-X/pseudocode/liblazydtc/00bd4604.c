/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4604
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::get(wchar_t*, long,
   wchar_t) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2,wchar_t param_3)

{
  long lVar1;
  wchar_t wVar2;
  long *plVar3;
  uint uVar4;
  long lVar5;
  uint uVar6;
  wchar_t *pwVar7;
  sentry local_34 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_34,(basic_istream *)this,true);
  if (local_34[0] == (sentry)0x1) {
    if (param_2 < 1) {
      uVar4 = 4;
    }
    else {
      lVar5 = *(long *)(this + 8);
      if (lVar5 < param_2 + -1) {
        do {
          plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
          if ((wchar_t *)plVar3[3] == (wchar_t *)plVar3[4]) {
                    /* try { // try from 00bd46c0 to 00bd46c3 has its CatchHandler @ 00bd4798 */
            wVar2 = (**(code **)(*plVar3 + 0x48))();
          }
          else {
            wVar2 = *(wchar_t *)plVar3[3];
          }
          if (wVar2 == L'\xffffffff') {
            lVar5 = *(long *)(this + 8);
            uVar6 = 2;
            goto LAB_00bd473c;
          }
          lVar5 = *(long *)(this + 8);
          if (wVar2 == param_3) {
            uVar6 = 0;
            goto LAB_00bd473c;
          }
          pwVar7 = param_1 + 1;
          *param_1 = wVar2;
          lVar1 = 0x7fffffffffffffff;
          if (lVar5 != 0x7fffffffffffffff) {
            *(long *)(this + 8) = lVar5 + 1;
            lVar1 = lVar5 + 1;
          }
          lVar5 = lVar1;
          plVar3 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
          if (plVar3[3] == plVar3[4]) {
                    /* try { // try from 00bd4700 to 00bd4703 has its CatchHandler @ 00bd4790 */
            (**(code **)(*plVar3 + 0x50))();
            lVar5 = *(long *)(this + 8);
          }
          else {
            plVar3[3] = plVar3[3] + 4;
          }
          param_1 = pwVar7;
        } while (lVar5 < param_2 + -1);
        uVar6 = 0;
      }
      else {
        uVar6 = 0;
      }
LAB_00bd473c:
      uVar4 = uVar6 | 4;
      if (lVar5 != 0) {
        uVar4 = uVar6;
      }
      *param_1 = L'\0';
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar4)
    ;
  }
  if (0 < param_2) {
    *param_1 = L'\0';
  }
  return this;
}

