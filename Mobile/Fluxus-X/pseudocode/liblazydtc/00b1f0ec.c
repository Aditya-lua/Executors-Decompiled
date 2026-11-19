/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f0ec
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_VAL * X509_VAL_new(void)

{
  X509_VAL *pXVar1;
  
  pXVar1 = (X509_VAL *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82bd8);
  return pXVar1;
}

