/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69de4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void EVP_PBE_cleanup(void)

{
  OPENSSL_sk_pop_free(DAT_00d21b40,&LAB_00a69e14);
  DAT_00d21b40 = 0;
  return;
}

