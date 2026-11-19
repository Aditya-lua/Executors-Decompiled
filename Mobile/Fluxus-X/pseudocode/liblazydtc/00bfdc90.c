/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdc90
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_widen(char) const */

wint_t __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_widen(ctype_byname<wchar_t> *this,char param_1)

{
  wint_t wVar1;
  __locale_t __dataset;
  
  __dataset = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfdcb8 to 00bfdcbf has its CatchHandler @ 00bfdcec */
  wVar1 = btowc((uint)(byte)param_1);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00bfdcc8 to 00bfdccf has its CatchHandler @ 00bfdce8 */
    uselocale(__dataset);
  }
  return wVar1;
}

