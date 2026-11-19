/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a108ac
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ASN1_STRING_TABLE_cleanup(void)

{
  long lVar1;
  
  lVar1 = DAT_00d21958;
  if (DAT_00d21958 == 0) {
    return;
  }
  DAT_00d21958 = 0;
  OPENSSL_sk_pop_free(lVar1,&LAB_00a108cc);
  return;
}

