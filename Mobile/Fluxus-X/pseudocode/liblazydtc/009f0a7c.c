/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0a7c
 */

void EVP_PKEY_asn1_set_ctrl(EVP_PKEY_ASN1_METHOD *ameth,pkey_ctrl *pkey_ctrl)

{
  *(pkey_ctrl **)(ameth + 0xb0) = pkey_ctrl;
  return;
}

