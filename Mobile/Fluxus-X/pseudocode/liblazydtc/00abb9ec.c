/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb9ec
 */

void * PKCS12_item_decrypt_d2i
                 (X509_ALGOR *algor,ASN1_ITEM *it,char *pass,int passlen,ASN1_OCTET_STRING *oct,
                 int zbuf)

{
  void *pvVar1;
  
  pvVar1 = (void *)PKCS12_item_decrypt_d2i_ex();
  return pvVar1;
}

