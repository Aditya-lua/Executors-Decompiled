/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b0dc
 */

int EVP_PKEY_CTX_set_ec_param_enc(EVP_PKEY_CTX *param_1,int param_2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,0x198,6,0x1002,param_2,(void *)0x0);
  return iVar1;
}

