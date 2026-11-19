/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c34c
 */

int EVP_PKEY_verify_recover_init(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  
  iVar1 = FUN_00a7ba84((int)ctx,0x40,0);
  return iVar1;
}

