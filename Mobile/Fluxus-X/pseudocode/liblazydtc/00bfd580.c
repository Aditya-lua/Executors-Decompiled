/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd580
 */

/* std::__ndk1::ctype_byname<wchar_t>::ctype_byname(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long) */

void __thiscall
std::__ndk1::ctype_byname<wchar_t>::ctype_byname
          (ctype_byname<wchar_t> *this,basic_string_conflict *param_1,ulong param_2)

{
  char *pcVar1;
  __locale_t p_Var2;
  undefined8 uVar3;
  basic_string_conflict *pbVar4;
  basic_string_conflict *__locale;
  byte local_38;
  undefined7 uStack_37;
  char *local_28;
  
  *(undefined ***)this = &PTR__ctype_byname_00cad6a8;
  *(ulong *)(this + 8) = param_2 - 1;
  __locale = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    __locale = param_1 + 1;
  }
                    /* try { // try from 00bfd5c0 to 00bfd5cb has its CatchHandler @ 00bfd638 */
  pbVar4 = (basic_string_conflict *)0x0;
  p_Var2 = newlocale(0x1fbf,(char *)__locale,(__locale_t)0x0);
  *(__locale_t *)(this + 0x10) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfd5e8 to 00bfd5ff has its CatchHandler @ 00bfd634 */
  operator+((__ndk1 *)"ctype_byname<wchar_t>::ctype_byname failed to construct for ",(char *)param_1
            ,pbVar4);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfd610 to 00bfd613 has its CatchHandler @ 00bfd614 */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfd610 with catch @ 00bfd614 */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

