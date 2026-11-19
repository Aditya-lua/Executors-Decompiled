/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cde8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int X509_TRUST_get_count(void)

{
  int iVar1;
  
  if (DAT_00d227e8 == 0) {
    return 8;
  }
  iVar1 = OPENSSL_sk_num();
  return iVar1 + 8;
}

