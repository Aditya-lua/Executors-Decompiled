/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb87c
 */

/* std::__ndk1::collate_byname<char>::collate_byname(char const*, unsigned long) */

void __thiscall
std::__ndk1::collate_byname<char>::collate_byname
          (collate_byname<char> *this,char *param_1,ulong param_2)

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
  
  *(undefined ***)this = &PTR__collate_byname_00cad558;
  *(ulong *)(this + 8) = param_2 - 1;
                    /* try { // try from 00bfb8ac to 00bfb8b7 has its CatchHandler @ 00bfb950 */
  p_Var2 = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  *(__locale_t *)(this + 0x10) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfb8d4 to 00bfb8df has its CatchHandler @ 00bfb94c */
  FUN_00852d7c(&local_50,param_1);
                    /* try { // try from 00bfb8e0 to 00bfb8f7 has its CatchHandler @ 00bfb92c */
  FUN_00bfb964(&local_38,"collate_byname<char>::collate_byname failed to construct for ",&local_50);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfb908 to 00bfb90b has its CatchHandler @ 00bfb90c */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfb908 with catch @ 00bfb90c */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  if ((local_50 & 1) != 0) {
    operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

