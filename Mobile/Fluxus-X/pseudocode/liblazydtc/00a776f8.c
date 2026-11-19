/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a776f8
 */

int EVP_PKEY_CTX_ctrl_uint64
              (EVP_PKEY_CTX *param_1,int param_2,int param_3,int param_4,undefined8 param_5)

{
  int iVar1;
  undefined8 local_18;
  
  local_18 = param_5;
  iVar1 = EVP_PKEY_CTX_ctrl(param_1,param_2,param_3,param_4,0,&local_18);
  return iVar1;
}

