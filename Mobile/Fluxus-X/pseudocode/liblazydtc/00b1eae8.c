/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eae8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509 * X509_new(void)

{
  X509 *pXVar1;
  
  pXVar1 = (X509 *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82968);
  return pXVar1;
}

