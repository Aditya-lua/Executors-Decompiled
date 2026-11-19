/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdf88
 */

void PKCS7_free(PKCS7 *a)

{
  if (a == (PKCS7 *)0x0) {
    return;
  }
  CRYPTO_free((void *)a[1].length);
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b7a0);
  return;
}

