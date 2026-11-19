/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc25dc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::uncaught_exceptions() */

void std::uncaught_exceptions(void)

{
  __cxa_uncaught_exceptions();
  return;
}

