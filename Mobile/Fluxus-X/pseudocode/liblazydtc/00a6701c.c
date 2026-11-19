/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6701c
 */

int FUN_00a6701c(undefined8 param_1,void *param_2,size_t param_3)

{
  int iVar1;
  SHA512_CTX *c;
  
  c = (SHA512_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = SHA384_Update(c,param_2,param_3);
  return iVar1;
}

