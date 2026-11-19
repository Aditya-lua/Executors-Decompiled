/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eaac
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_CINF * X509_CINF_new(void)

{
  X509_CINF *pXVar1;
  
  pXVar1 = (X509_CINF *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82930);
  return pXVar1;
}

