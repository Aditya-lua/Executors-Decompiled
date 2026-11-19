/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77274
 */

int EVP_PKEY_CTX_get1_id(EVP_PKEY_CTX *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,-1,-1,0x10,0,param_2);
  return iVar1;
}

