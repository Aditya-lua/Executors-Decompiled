/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc924
 */

void PKCS12_SAFEBAG_create_crl(void *param_1)

{
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_CRL_it();
  PKCS12_item_pack_safebag(param_1,it,0xa0,0x99);
  return;
}

