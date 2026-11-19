/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b020
 */

int ECDH_compute_key(void *out,size_t outlen,EC_POINT *pub_key,EC_KEY *ecdh,KDF *KDF)

{
  int iVar1;
  
  iVar1 = ECDH_compute_key(out,outlen,pub_key,ecdh,KDF);
  return iVar1;
}

