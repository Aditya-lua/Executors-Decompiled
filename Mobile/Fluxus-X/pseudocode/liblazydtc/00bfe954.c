/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe954
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_max_length() const */

ulong __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_max_length(codecvt<wchar_t,char,mbstate_t> *this)

{
  __locale_t __dataset;
  size_t sVar1;
  
  if (*(__locale_t *)(this + 0x10) == (__locale_t)0x0) {
    sVar1 = 1;
  }
  else {
                    /* try { // try from 00bfe970 to 00bfe973 has its CatchHandler @ 00bfe9c8 */
    __dataset = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe97c to 00bfe97f has its CatchHandler @ 00bfe9b4 */
    sVar1 = __ctype_get_mb_cur_max();
    if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00bfe988 to 00bfe98f has its CatchHandler @ 00bfe9b0 */
      uselocale(__dataset);
    }
  }
  return sVar1 & 0xffffffff;
}

