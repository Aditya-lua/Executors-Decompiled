/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02b7c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void X509_PURPOSE_cleanup(void)

{
  OPENSSL_sk_pop_free(DAT_00d227e0,FUN_00b02bac);
  DAT_00d227e0 = 0;
  return;
}

