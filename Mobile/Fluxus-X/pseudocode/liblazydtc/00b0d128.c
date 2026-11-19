/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d128
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void X509_TRUST_cleanup(void)

{
  OPENSSL_sk_pop_free(DAT_00d227e8,&LAB_00b0d158);
  DAT_00d227e8 = 0;
  return;
}

