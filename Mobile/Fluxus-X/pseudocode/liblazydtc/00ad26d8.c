/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad26d8
 */

int EVP_PKEY_CTX_set_rsa_oaep_md(EVP_PKEY_CTX *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_is_a(param_1,&DAT_002db996);
  if (iVar1 == 0) {
    return -1;
  }
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,6,0x600,0x1009,0,param_2);
  return iVar1;
}

