/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad24f0
 */

int EVP_PKEY_CTX_get_rsa_padding(EVP_PKEY_CTX *param_1,void *param_2)

{
  int iVar1;
  
  if ((((param_1 == (EVP_PKEY_CTX *)0x0) || (*(int **)(param_1 + 0x78) == (int *)0x0)) ||
      (iVar1 = **(int **)(param_1 + 0x78), iVar1 == 0x390)) || (iVar1 == 6)) {
    iVar1 = EVP_PKEY_CTX_ctrl(param_1,-1,-1,0x1006,0,param_2);
    return iVar1;
  }
  return -1;
}

