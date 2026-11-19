/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4880
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::get(std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >&, wchar_t) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1,
          wchar_t param_2)

{
  uint uVar1;
  wchar_t *pwVar2;
  wchar_t wVar3;
  int iVar4;
  long *plVar5;
  uint uVar6;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] == (sentry)0x1) {
    while( true ) {
      plVar5 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      if ((wchar_t *)plVar5[3] == (wchar_t *)plVar5[4]) {
                    /* try { // try from 00bd4918 to 00bd491f has its CatchHandler @ 00bd49d4 */
        wVar3 = (**(code **)(*plVar5 + 0x48))();
      }
      else {
        wVar3 = *(wchar_t *)plVar5[3];
      }
      if (wVar3 == L'\xffffffff') {
        uVar6 = 2;
        goto LAB_00bd4994;
      }
      if (wVar3 == param_2) break;
      pwVar2 = *(wchar_t **)(param_1 + 0x30);
      if (pwVar2 == *(wchar_t **)(param_1 + 0x38)) {
                    /* try { // try from 00bd4950 to 00bd4983 has its CatchHandler @ 00bd49d8 */
        iVar4 = (**(code **)(*(long *)param_1 + 0x68))(param_1);
        if (iVar4 == -1) break;
      }
      else {
        *pwVar2 = wVar3;
        *(wchar_t **)(param_1 + 0x30) = pwVar2 + 1;
      }
      if (*(long *)(this + 8) != 0x7fffffffffffffff) {
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
      }
      plVar5 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      if (plVar5[3] == plVar5[4]) {
        (**(code **)(*plVar5 + 0x50))();
      }
      else {
        plVar5[3] = plVar5[3] + 4;
      }
    }
    uVar6 = 0;
LAB_00bd4994:
    uVar1 = uVar6 | 4;
    if (*(long *)(this + 8) != 0) {
      uVar1 = uVar6;
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar1)
    ;
  }
  return this;
}

