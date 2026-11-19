/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ca64
 */

void ossl_X509_PUBKEY_INTERNAL_free(ASN1_VALUE *param_1)

{
  ASN1_item_free(param_1,(ASN1_ITEM *)&DAT_00c826c0);
  return;
}

