/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfbfb8
 */

/* std::__ndk1::collate_byname<wchar_t>::collate_byname(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long) */

void __thiscall
std::__ndk1::collate_byname<wchar_t>::collate_byname
          (collate_byname<wchar_t> *this,basic_string_conflict *param_1,ulong param_2)

{
  char *pcVar1;
  __locale_t p_Var2;
  undefined8 uVar3;
  basic_string_conflict *pbVar4;
  basic_string_conflict *__locale;
  byte local_38;
  undefined7 uStack_37;
  char *local_28;
  
  *(undefined ***)this = &PTR__collate_byname_00cad598;
  *(ulong *)(this + 8) = param_2 - 1;
  __locale = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    __locale = param_1 + 1;
  }
                    /* try { // try from 00bfbff8 to 00bfc003 has its CatchHandler @ 00bfc070 */
  pbVar4 = (basic_string_conflict *)0x0;
  p_Var2 = newlocale(0x1fbf,(char *)__locale,(__locale_t)0x0);
  *(__locale_t *)(this + 0x10) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfc020 to 00bfc037 has its CatchHandler @ 00bfc06c */
  operator+((__ndk1 *)
            "collate_byname<wchar_t>::collate_byname(size_t refs) failed to construct for ",
            (char *)param_1,pbVar4);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfc048 to 00bfc04b has its CatchHandler @ 00bfc04c */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfc048 with catch @ 00bfc04c */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

