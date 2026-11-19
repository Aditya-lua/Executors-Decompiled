/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56e88
 */

int EVP_PKEY_CTX_set_dh_kdf_type(EVP_PKEY_CTX *param_1,int param_2)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,0x398,0x800,0x1006,param_2,(void *)0x0);
  return iVar1;
}

