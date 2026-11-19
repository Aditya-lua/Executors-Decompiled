/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14808
 */

int X509_VERIFY_PARAM_get_count(void)

{
  int iVar1;
  
  if (DAT_00d227f0 == 0) {
    return 5;
  }
  iVar1 = OPENSSL_sk_num();
  return iVar1 + 5;
}

