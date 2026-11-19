/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe78c
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_encoding() const */

ulong __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_encoding(codecvt<wchar_t,char,mbstate_t> *this)

{
  int iVar1;
  __locale_t p_Var2;
  ulong uVar3;
  size_t sVar4;
  
                    /* try { // try from 00bfe7a8 to 00bfe7ab has its CatchHandler @ 00bfe84c */
  p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe7b4 to 00bfe7c3 has its CatchHandler @ 00bfe838 */
  iVar1 = mbtowc((wchar_t *)0x0,(char *)0x0,4);
  if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe7cc to 00bfe7d3 has its CatchHandler @ 00bfe834 */
    uselocale(p_Var2);
  }
  if (iVar1 == 0) {
    if (*(__locale_t *)(this + 0x10) == (__locale_t)0x0) {
      uVar3 = 1;
    }
    else {
                    /* try { // try from 00bfe7e8 to 00bfe7eb has its CatchHandler @ 00bfe84c */
      p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe7f4 to 00bfe7f7 has its CatchHandler @ 00bfe830 */
      sVar4 = __ctype_get_mb_cur_max();
      if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe800 to 00bfe807 has its CatchHandler @ 00bfe82c */
        uselocale(p_Var2);
      }
      uVar3 = (ulong)(sVar4 == 1);
    }
  }
  else {
    uVar3 = 0xffffffff;
  }
  return uVar3;
}

