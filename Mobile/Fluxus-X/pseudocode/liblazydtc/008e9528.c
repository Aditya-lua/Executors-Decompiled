/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9528
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::xsputn(char const*, long) */

long __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::xsputn
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  size_t __n;
  int iVar1;
  void *__dest;
  size_t sVar2;
  long lVar3;
  
  lVar3 = 0;
  if (0 < param_2) {
    do {
      while( true ) {
        __dest = *(void **)(this + 0x30);
        if (*(void **)(this + 0x38) <= __dest) break;
        sVar2 = (long)*(void **)(this + 0x38) - (long)__dest;
        __n = param_2 - lVar3;
        if ((long)sVar2 <= param_2 - lVar3) {
          __n = sVar2;
        }
        if (__n != 0) {
          memcpy(__dest,param_1,__n);
          __dest = *(void **)(this + 0x30);
        }
        param_1 = param_1 + __n;
        lVar3 = __n + lVar3;
        *(size_t *)(this + 0x30) = (long)__dest + __n;
        if (param_2 <= lVar3) {
          return lVar3;
        }
      }
      iVar1 = (**(code **)(*(long *)this + 0x68))(this,*param_1);
      if (iVar1 == -1) {
        return lVar3;
      }
      param_1 = param_1 + 1;
      lVar3 = lVar3 + 1;
    } while (lVar3 < param_2);
  }
  return lVar3;
}

