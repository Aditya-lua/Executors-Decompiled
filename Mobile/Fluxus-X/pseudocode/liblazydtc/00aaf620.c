/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf620
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void OBJ_sigid_free(void)

{
  OPENSSL_sk_pop_free(DAT_00d22190,&LAB_00aaf660);
  DAT_00d22190 = 0;
  OPENSSL_sk_free(DAT_00d22198);
  DAT_00d22198 = 0;
  return;
}

