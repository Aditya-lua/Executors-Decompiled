/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0a48
 */

void EVP_PKEY_asn1_set_public
               (EVP_PKEY_ASN1_METHOD *ameth,pub_decode *pub_decode,pub_encode *pub_encode,
               pub_cmp *pub_cmp,pub_print *pub_print,pkey_size *pkey_size,pkey_bits *pkey_bits)

{
  *(pub_decode **)(ameth + 0x20) = pub_decode;
  *(pub_encode **)(ameth + 0x28) = pub_encode;
  *(pub_cmp **)(ameth + 0x30) = pub_cmp;
  *(pub_print **)(ameth + 0x38) = pub_print;
  *(pkey_size **)(ameth + 0x58) = pkey_size;
  *(pkey_bits **)(ameth + 0x60) = pkey_bits;
  return;
}

