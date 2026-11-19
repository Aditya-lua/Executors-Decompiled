/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd004
 */

/* std::__ndk1::ctype_byname<char>::ctype_byname(char const*, unsigned long) */

void __thiscall
std::__ndk1::ctype_byname<char>::ctype_byname(ctype_byname<char> *this,char *param_1,ulong param_2)

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
  
  this[0x18] = (ctype_byname<char>)0x0;
  *(ulong *)(this + 8) = param_2 - 1;
  *(undefined **)(this + 0x10) = &DAT_0078a8e8;
  *(undefined ***)this = &PTR__ctype_byname_00cad640;
                    /* try { // try from 00bfd044 to 00bfd04f has its CatchHandler @ 00bfd0e8 */
  p_Var2 = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  *(__locale_t *)(this + 0x20) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfd06c to 00bfd077 has its CatchHandler @ 00bfd0e4 */
  FUN_00852d7c(&local_50,param_1);
                    /* try { // try from 00bfd078 to 00bfd08f has its CatchHandler @ 00bfd0c4 */
  FUN_00bfb964(&local_38,"ctype_byname<char>::ctype_byname failed to construct for ",&local_50);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfd0a0 to 00bfd0a3 has its CatchHandler @ 00bfd0a4 */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfd0a0 with catch @ 00bfd0a4 */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  if ((local_50 & 1) != 0) {
    operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
  }
  ctype<char>::~ctype((ctype<char> *)this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

