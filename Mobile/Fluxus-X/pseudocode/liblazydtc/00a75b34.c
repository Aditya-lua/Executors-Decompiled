/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75b34
 */

long EVP_PKEY_meth_get_count(void)

{
  int iVar1;
  
  if (DAT_00d21b48 == 0) {
    return 10;
  }
  iVar1 = OPENSSL_sk_num();
  return (long)iVar1 + 10;
}

