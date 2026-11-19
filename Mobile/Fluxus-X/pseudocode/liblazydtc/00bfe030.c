/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe030
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::codecvt(char const*, unsigned long) */

void __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt
          (codecvt<wchar_t,char,mbstate_t> *this,char *param_1,ulong param_2)

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
  
  *(undefined ***)this = &PTR__codecvt_00cad730;
  *(ulong *)(this + 8) = param_2 - 1;
                    /* try { // try from 00bfe060 to 00bfe06b has its CatchHandler @ 00bfe104 */
  p_Var2 = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  *(__locale_t *)(this + 0x10) = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
                    /* try { // try from 00bfe088 to 00bfe093 has its CatchHandler @ 00bfe100 */
  FUN_00852d7c(&local_50,param_1);
                    /* try { // try from 00bfe094 to 00bfe0ab has its CatchHandler @ 00bfe0e0 */
  FUN_00bfb964(&local_38,
               "codecvt_byname<wchar_t, char, mbstate_t>::codecvt_byname failed to construct for ",
               &local_50);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00bfe0bc to 00bfe0bf has its CatchHandler @ 00bfe0c0 */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00bfe0bc with catch @ 00bfe0c0 */
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

