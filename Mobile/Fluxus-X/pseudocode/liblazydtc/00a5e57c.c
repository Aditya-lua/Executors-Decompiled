/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e57c
 */

int EVP_CIPHER_asn1_to_param(EVP_CIPHER_CTX *c,ASN1_TYPE *type)

{
  int iVar1;
  
  iVar1 = evp_cipher_asn1_to_param_ex((int)c,type,0);
  return iVar1;
}

