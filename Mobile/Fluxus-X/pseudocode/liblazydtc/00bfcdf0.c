/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcdf0
 */

/* std::__ndk1::ctype<char>::do_tolower(char*, char const*) const */

char * __thiscall
std::__ndk1::ctype<char>::do_tolower(ctype<char> *this,char *param_1,char *param_2)

{
  int iVar1;
  char cVar2;
  int iVar3;
  
  for (; param_1 != param_2; param_1 = param_1 + 1) {
    cVar2 = *param_1;
    iVar3 = (int)cVar2;
    if (-1 < iVar3) {
      if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bfce70 to 00bfce7b has its CatchHandler @ 00bfcea8 */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
      cVar2 = *param_1;
      if (0xe5 < (iVar3 - 0x5bU & 0xff)) {
        cVar2 = *param_1 + ' ';
      }
    }
    *param_1 = cVar2;
  }
  return param_1;
}

