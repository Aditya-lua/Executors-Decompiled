/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0a64
 */

void EVP_PKEY_asn1_set_param
               (EVP_PKEY_ASN1_METHOD *ameth,param_decode *param_decode,param_encode *param_encode,
               param_missing *param_missing,param_copy *param_copy,param_cmp *param_cmp,
               param_print *param_print)

{
  *(param_decode **)(ameth + 0x70) = param_decode;
  *(param_encode **)(ameth + 0x78) = param_encode;
  *(param_missing **)(ameth + 0x80) = param_missing;
  *(param_copy **)(ameth + 0x88) = param_copy;
  *(param_cmp **)(ameth + 0x90) = param_cmp;
  *(param_print **)(ameth + 0x98) = param_print;
  return;
}

