/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e784
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_REQ * X509_REQ_new(void)

{
  X509_REQ *pXVar1;
  
  pXVar1 = (X509_REQ *)ASN1_item_new((ASN1_ITEM *)&DAT_00c827b0);
  return pXVar1;
}

