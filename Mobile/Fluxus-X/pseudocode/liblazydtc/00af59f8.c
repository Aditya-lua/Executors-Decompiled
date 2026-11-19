/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af59f8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void X509V3_EXT_cleanup(void)

{
  OPENSSL_sk_pop_free(DAT_00d227d8,&LAB_00af5a28);
  DAT_00d227d8 = 0;
  return;
}

