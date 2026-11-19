/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a989d4
 */

int FUN_00a989d4(undefined8 param_1,void *param_2,size_t param_3)

{
  int iVar1;
  MD4_CTX *c;
  
  c = (MD4_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = MD4_Update(c,param_2,param_3);
  return iVar1;
}

