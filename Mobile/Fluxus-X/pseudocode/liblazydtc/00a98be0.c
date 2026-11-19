/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98be0
 */

int FUN_00a98be0(undefined8 param_1,void *param_2,size_t param_3)

{
  int iVar1;
  RIPEMD160_CTX *c;
  
  c = (RIPEMD160_CTX *)EVP_MD_CTX_get0_md_data();
  iVar1 = RIPEMD160_Update(c,param_2,param_3);
  return iVar1;
}

