/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2a90
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::xsgetn(wchar_t*, long)
    */

long __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::xsgetn
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2)

{
  long lVar1;
  wchar_t wVar2;
  void *__src;
  long lVar3;
  long lVar4;
  wchar_t *pwVar5;
  
  if (param_2 < 1) {
    lVar4 = 0;
  }
  else {
    lVar4 = 0;
    do {
      __src = *(void **)(this + 0x18);
      if (__src < *(void **)(this + 0x20)) {
        lVar3 = (long)*(void **)(this + 0x20) - (long)__src >> 2;
        lVar1 = param_2 - lVar4;
        if (lVar3 <= param_2 - lVar4) {
          lVar1 = lVar3;
        }
        lVar3 = lVar1;
        if (0x7ffffffe < lVar1) {
          lVar3 = 0x7fffffff;
        }
        if (lVar1 != 0) {
          memmove(param_1,__src,lVar3 << 2);
          __src = *(void **)(this + 0x18);
        }
        pwVar5 = param_1 + lVar3;
        *(long *)(this + 0x18) = (long)__src + ((lVar3 << 0x20) >> 0x1e);
      }
      else {
        wVar2 = (**(code **)(*(long *)this + 0x50))(this);
        if (wVar2 == L'\xffffffff') {
          return lVar4;
        }
        lVar3 = 1;
        pwVar5 = param_1 + 1;
        *param_1 = wVar2;
      }
      lVar4 = lVar3 + lVar4;
      param_1 = pwVar5;
    } while (lVar4 < param_2);
  }
  return lVar4;
}

