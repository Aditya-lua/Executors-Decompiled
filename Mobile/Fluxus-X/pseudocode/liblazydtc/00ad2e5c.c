/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2e5c
 */

int EVP_PKEY_CTX_set_rsa_keygen_pubexp(EVP_PKEY_CTX *param_1,void *param_2)

{
  int iVar1;
  
  if ((((param_1 == (EVP_PKEY_CTX *)0x0) || (*(int **)(param_1 + 0x78) == (int *)0x0)) ||
      (iVar1 = **(int **)(param_1 + 0x78), iVar1 == 0x390)) || (iVar1 == 6)) {
    iVar1 = EVP_PKEY_CTX_ctrl(param_1,-1,4,0x1004,0,param_2);
    if ((0 < iVar1) && (*(long *)(param_1 + 0x20) != 0)) {
      BN_free(*(BIGNUM **)(param_1 + 0xa8));
      *(void **)(param_1 + 0xa8) = param_2;
    }
  }
  else {
    iVar1 = -1;
  }
  return iVar1;
}

