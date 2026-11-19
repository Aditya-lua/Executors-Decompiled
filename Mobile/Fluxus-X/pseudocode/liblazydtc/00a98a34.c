/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98a34
 */

int FUN_00a98a34(void)

{
  int iVar1;
  MD5_CTX *c;
  
  c = (MD5_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = MD5_Init(c);
  return iVar1;
}

