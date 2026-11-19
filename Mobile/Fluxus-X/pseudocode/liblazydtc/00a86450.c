/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86450
 */

int FUN_00a86450(void)

{
  int iVar1;
  SHA_CTX *c;
  
  c = (SHA_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = SHA1_Init(c);
  return iVar1;
}

