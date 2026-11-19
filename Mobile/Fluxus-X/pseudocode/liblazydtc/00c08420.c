/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c08420
 */

/* std::__ndk1::__time_put::__time_put(char const*) */

void __thiscall std::__ndk1::__time_put::__time_put(__time_put *this,char *param_1)

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
  
  p_Var2 = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  *(__locale_t *)this = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
  FUN_00852d7c(&local_50,param_1);
                    /* try { // try from 00c08470 to 00c08487 has its CatchHandler @ 00c084d4 */
  FUN_00bfb964(&local_38,"time_put_byname failed to construct for ",&local_50);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00c08498 to 00c0849b has its CatchHandler @ 00c0849c */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00c08498 with catch @ 00c0849c */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
  if ((local_50 & 1) == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar3);
  }
  operator_delete(local_40,CONCAT71(uStack_4f,local_50) & 0xfffffffffffffffe);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

