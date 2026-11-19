/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b114
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_REVOKED * X509_REVOKED_new(void)

{
  X509_REVOKED *pXVar1;
  
  pXVar1 = (X509_REVOKED *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82058);
  return pXVar1;
}

