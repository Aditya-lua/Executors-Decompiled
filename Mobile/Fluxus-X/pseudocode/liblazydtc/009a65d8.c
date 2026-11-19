/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a65d8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

SSL_METHOD * TLSv1_method(void)

{
  return (SSL_METHOD *)&DAT_00c52888;
}

