/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba1e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS12_SAFEBAG * PKCS12_SAFEBAG_new(void)

{
  PKCS12_SAFEBAG *pPVar1;
  
  pPVar1 = (PKCS12_SAFEBAG *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b130);
  return pPVar1;
}

