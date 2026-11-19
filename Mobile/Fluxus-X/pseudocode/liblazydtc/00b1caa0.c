/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1caa0
 */

void X509_PUBKEY_free(X509_PUBKEY *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c82640);
  return;
}

