/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc25b8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::uncaught_exception() */

bool std::uncaught_exception(void)

{
  int iVar1;
  
  iVar1 = __cxa_uncaught_exceptions();
  return 0 < iVar1;
}

