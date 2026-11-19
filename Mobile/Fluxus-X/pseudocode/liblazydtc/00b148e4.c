/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b148e4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void X509_VERIFY_PARAM_table_cleanup(void)

{
  OPENSSL_sk_pop_free(DAT_00d227f0,X509_VERIFY_PARAM_free);
  DAT_00d227f0 = 0;
  return;
}

