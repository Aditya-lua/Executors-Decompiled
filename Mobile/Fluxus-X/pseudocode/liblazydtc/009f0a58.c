/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0a58
 */

void EVP_PKEY_asn1_set_private
               (EVP_PKEY_ASN1_METHOD *ameth,priv_decode *priv_decode,priv_encode *priv_encode,
               priv_print *priv_print)

{
  *(priv_decode **)(ameth + 0x40) = priv_decode;
  *(priv_encode **)(ameth + 0x48) = priv_encode;
  *(priv_print **)(ameth + 0x50) = priv_print;
  return;
}

