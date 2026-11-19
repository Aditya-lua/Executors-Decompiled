/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a989c0
 */

int FUN_00a989c0(void)

{
  int iVar1;
  MD4_CTX *c;
  
  c = (MD4_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = MD4_Init(c);
  return iVar1;
}

