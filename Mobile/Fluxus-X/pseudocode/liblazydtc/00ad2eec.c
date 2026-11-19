/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2eec
 */

int EVP_PKEY_CTX_set1_rsa_keygen_pubexp(EVP_PKEY_CTX *param_1,BIGNUM *param_2)

{
  int iVar1;
  
  if ((*(long *)(param_1 + 0x20) == 0) && (param_2 = BN_dup(param_2), param_2 == (BIGNUM *)0x0)) {
    iVar1 = 0;
  }
  else {
    iVar1 = EVP_PKEY_CTX_ctrl(param_1,6,4,0x1004,0,param_2);
    if ((iVar1 < 1) && (*(long *)(param_1 + 0x20) == 0)) {
      BN_free(param_2);
    }
  }
  return iVar1;
}

