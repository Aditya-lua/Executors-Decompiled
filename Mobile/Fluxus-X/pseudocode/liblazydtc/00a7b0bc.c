/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b0bc
 */

int EVP_PKEY_CTX_set_ec_paramgen_curve_nid(EVP_PKEY_CTX *param_1,int param_2)

{
  int iVar1;
  
  iVar1 = param_2;
  if (param_2 != 0x494) {
    iVar1 = 0x198;
  }
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,iVar1,6,0x1001,param_2,(void *)0x0);
  return iVar1;
}

