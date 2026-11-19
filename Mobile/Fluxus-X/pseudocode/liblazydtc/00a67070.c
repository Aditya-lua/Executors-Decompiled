/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67070
 */

int FUN_00a67070(void)

{
  int iVar1;
  SHA512_CTX *c;
  
  c = (SHA512_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = SHA512_Init(c);
  return iVar1;
}

