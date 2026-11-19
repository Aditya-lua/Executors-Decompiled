/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56140
 */

int EVP_PKEY_decrypt_init(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  
  iVar1 = FUN_00a55a38((int)ctx,0x400,0);
  return iVar1;
}

