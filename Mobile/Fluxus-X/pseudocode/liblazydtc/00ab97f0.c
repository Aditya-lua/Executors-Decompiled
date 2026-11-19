/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab97f0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_SIG * X509_SIG_new(void)

{
  X509_SIG *pXVar1;
  
  pXVar1 = (X509_SIG *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7af80);
  return pXVar1;
}

