/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e748
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_REQ_INFO * X509_REQ_INFO_new(void)

{
  X509_REQ_INFO *pXVar1;
  
  pXVar1 = (X509_REQ_INFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82748);
  return pXVar1;
}

