/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4fea4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ENGINE_load_builtin_engines(void)

{
  OPENSSL_init_crypto(0x7600,0);
  return;
}

