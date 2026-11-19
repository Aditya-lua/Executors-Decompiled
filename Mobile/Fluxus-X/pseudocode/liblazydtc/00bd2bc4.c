/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2bc4
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::xsputn(wchar_t const*,
   long) */

long __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::xsputn
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2)

{
  long lVar1;
  int iVar2;
  void *__dest;
  long lVar3;
  long lVar4;
  
  if (param_2 < 1) {
    lVar4 = 0;
  }
  else {
    lVar4 = 0;
    do {
      while( true ) {
        __dest = *(void **)(this + 0x30);
        if (*(void **)(this + 0x38) <= __dest) break;
        lVar3 = (long)*(void **)(this + 0x38) - (long)__dest >> 2;
        lVar1 = param_2 - lVar4;
        if (lVar3 <= param_2 - lVar4) {
          lVar1 = lVar3;
        }
        if (lVar1 != 0) {
          memmove(__dest,param_1,lVar1 * 4);
          __dest = *(void **)(this + 0x30);
        }
        param_1 = param_1 + lVar1;
        lVar4 = lVar1 + lVar4;
        *(void **)(this + 0x30) = (void *)((long)__dest + lVar1 * 4);
        if (param_2 <= lVar4) {
          return lVar4;
        }
      }
      iVar2 = (**(code **)(*(long *)this + 0x68))(this,*param_1);
      if (iVar2 == -1) {
        return lVar4;
      }
      param_1 = param_1 + 1;
      lVar4 = lVar4 + 1;
    } while (lVar4 < param_2);
  }
  return lVar4;
}

