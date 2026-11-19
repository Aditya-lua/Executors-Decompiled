/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d8e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::set_unexpected(void (*)()) */

void std::set_unexpected(_func_void *param_1)

{
  _func_void *p_Var1;
  
  p_Var1 = (_func_void *)&LAB_00c0d8c8;
  if (param_1 != (_func_void *)0x0) {
    p_Var1 = param_1;
  }
  FUN_00c2bc80(p_Var1,&__cxa_unexpected_handler);
  return;
}

