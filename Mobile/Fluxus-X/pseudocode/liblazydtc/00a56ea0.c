/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56ea0
 */

int EVP_PKEY_CTX_get_dh_kdf_type(EVP_PKEY_CTX *param_1)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,0x398,0x800,0x1006,-2,(void *)0x0);
  return iVar1;
}

