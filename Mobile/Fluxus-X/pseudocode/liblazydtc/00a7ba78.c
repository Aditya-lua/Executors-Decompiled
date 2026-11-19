/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ba78
 */

int EVP_PKEY_sign_init(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  
  iVar1 = FUN_00a7ba84((int)ctx,0x10,0);
  return iVar1;
}

