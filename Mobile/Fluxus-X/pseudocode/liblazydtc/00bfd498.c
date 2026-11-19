/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd498
 */

/* std::__ndk1::ctype_byname<wchar_t>::ctype_byname(char const*, unsigned long) */

void __thiscall
std::__ndk1::ctype_byname<wchar_t>::ctype_byname
          (ctype_byname<wchar_t> *this,char *param_1,ulong param_2)

{
  char *pcVar1;
  __locale_t p_Var2;
  undefined8 uVar3;
  byte local_50;
  undefined7 uStack_4f;
  void *local_40;
  byte local_38;
  undefined7 uStack_37;
  char *local_28;
  
  *(undefined ***)this = &PTR__ctype_byname_00cad6a8;
  *(ulong *)(this + 8) = param_2 - 1;
                    /* try { // try from 00bfd4c8 to 00bfd4d3 has its CatchHandler @ 00bfd56c */
  p_Var2 = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  *(__locale_t *)(this + 0x10) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfd4f0 to 00bfd4fb has its CatchHandler @ 00bfd568 */
  FUN_00852d7c(&local_50,param_1);
                    /* try { // try from 00bfd4fc to 00bfd513 has its CatchHandler @ 00bfd548 */
  FUN_00bfb964(&local_38,"ctype_byname<wchar_t>::ctype_byname failed to construct for ",&local_50);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfd524 to 00bfd527 has its CatchHandler @ 00bfd528 */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfd524 with catch @ 00bfd528 */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  if ((local_50 & 1) != 0) {
    operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
  }
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

