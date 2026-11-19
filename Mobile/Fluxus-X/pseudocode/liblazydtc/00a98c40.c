/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98c40
 */

int FUN_00a98c40(void)

{
  int iVar1;
  WHIRLPOOL_CTX *c;
  
  c = (WHIRLPOOL_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = WHIRLPOOL_Init(c);
  return iVar1;
}

