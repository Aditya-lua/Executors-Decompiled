/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc8f4
 */

void PKCS12_SAFEBAG_create_cert(void *param_1)

{
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_it();
  PKCS12_item_pack_safebag(param_1,it,0x9e,0x98);
  return;
}

