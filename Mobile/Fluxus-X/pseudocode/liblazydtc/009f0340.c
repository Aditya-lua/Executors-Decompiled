/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0340
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int EVP_PKEY_asn1_get_count(void)

{
  int iVar1;
  
  if (DAT_00d218e0 == 0) {
    return 0x10;
  }
  iVar1 = OPENSSL_sk_num();
  return iVar1 + 0x10;
}

