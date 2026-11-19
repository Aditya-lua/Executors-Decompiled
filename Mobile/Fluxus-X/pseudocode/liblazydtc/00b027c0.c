/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b027c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int X509_PURPOSE_get_count(void)

{
  int iVar1;
  
  if (DAT_00d227e0 == 0) {
    return 9;
  }
  iVar1 = OPENSSL_sk_num();
  return iVar1 + 9;
}

