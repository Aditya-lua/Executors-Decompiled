/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bcbc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_EXTENSION * X509_EXTENSION_new(void)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = (X509_EXTENSION *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82368);
  return pXVar1;
}

