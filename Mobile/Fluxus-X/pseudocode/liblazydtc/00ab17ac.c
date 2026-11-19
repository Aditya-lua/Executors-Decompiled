/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab17ac
 */

OCSP_CERTID * OCSP_CERTID_dup(OCSP_CERTID *id)

{
  ASN1_ITEM *it;
  OCSP_CERTID *pOVar1;
  
  it = (ASN1_ITEM *)OCSP_CERTID_it();
  pOVar1 = ASN1_item_dup(it,id);
  return pOVar1;
}

