/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c084f8
 */

/* std::__ndk1::__time_put::__time_put(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall std::__ndk1::__time_put::__time_put(__time_put *this,basic_string_conflict *param_1)

{
  char *pcVar1;
  __locale_t p_Var2;
  undefined8 uVar3;
  basic_string_conflict *pbVar4;
  basic_string_conflict *__locale;
  byte local_38;
  undefined7 uStack_37;
  char *local_28;
  
  __locale = *(basic_string_conflict **)(param_1 + 0x10);
  pbVar4 = (basic_string_conflict *)0x0;
  if (((byte)*param_1 & 1) == 0) {
    __locale = param_1 + 1;
  }
  p_Var2 = newlocale(0x1fbf,(char *)__locale,(__locale_t)0x0);
  *(__locale_t *)this = p_Var2;
  if (p_Var2 != (__locale_t)0x0) {
    return;
  }
  operator+((__ndk1 *)"time_put_byname failed to construct for ",(char *)param_1,pbVar4);
  pcVar1 = local_28;
  if ((local_38 & 1) == 0) {
    pcVar1 = (char *)&uStack_37;
  }
                    /* try { // try from 00c08574 to 00c08577 has its CatchHandler @ 00c08578 */
  uVar3 = __throw_runtime_error(pcVar1);
                    /* catch() { ... } // from try @ 00c08574 with catch @ 00c08578 */
  if ((local_38 & 1) != 0) {
    operator_delete(local_28,CONCAT71(uStack_37,local_38) & 0xfffffffffffffffe);
  }
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar3);
}

