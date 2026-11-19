/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16a50
 */

void d2i_X509_PUBKEY_bio(BIO *param_1,void **param_2)

{
  ASN1_d2i_bio(X509_PUBKEY_new,d2i_X509_PUBKEY,param_1,param_2);
  return;
}

