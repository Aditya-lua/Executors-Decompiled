/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0bbc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

stack_st_SSL_COMP * SSL_COMP_get_compression_methods(void)

{
  CRYPTO_THREAD_run_once(&DAT_00d218c0,&LAB_009b1418);
  return DAT_00d218b8;
}

