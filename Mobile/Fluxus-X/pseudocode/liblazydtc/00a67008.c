/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67008
 */

int FUN_00a67008(void)

{
  int iVar1;
  SHA512_CTX *c;
  
  c = (SHA512_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = SHA384_Init(c);
  return iVar1;
}

