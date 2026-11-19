/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6638
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

SSL_METHOD * DTLSv1_client_method(void)

{
  return (SSL_METHOD *)&DAT_00c53768;
}

