/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d744
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::unexpected() */

undefined * std::unexpected(void)

{
  FUN_00c0d728(__cxa_unexpected_handler);
  return __cxa_terminate_handler;
}

