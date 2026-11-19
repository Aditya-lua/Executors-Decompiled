/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79d20
 */

int EVP_PKEY_CTX_set_dsa_paramgen_md(EVP_PKEY_CTX *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,0x74,2,0x1003,0,param_2);
  return iVar1;
}

