/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e2a4
 */

int EVP_CIPHER_param_to_asn1(EVP_CIPHER_CTX *c,ASN1_TYPE *type)

{
  int iVar1;
  
  iVar1 = evp_cipher_param_to_asn1_ex((int)c,type,0);
  return iVar1;
}

