/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d950
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::set_new_handler(void (*)()) */

void std::set_new_handler(_func_void *param_1)

{
  FUN_00c2bc80(param_1,&__cxa_new_handler);
  return;
}

