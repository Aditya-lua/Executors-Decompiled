/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35370
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

stack_st_SSL_COMP * SSL_COMP_get_compression_methods(void)

{
  stack_st_SSL_COMP *psVar1;
  
  psVar1 = SSL_COMP_get_compression_methods();
  return psVar1;
}

