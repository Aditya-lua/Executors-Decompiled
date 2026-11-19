/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66ed0
 */

int FUN_00a66ed0(void)

{
  int iVar1;
  SHA256_CTX *c;
  
  c = (SHA256_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = SHA256_Init(c);
  return iVar1;
}

