/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6348c
 */

int EVP_PKEY_derive_init(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_derive_init_ex((int)ctx,0);
  return iVar1;
}

