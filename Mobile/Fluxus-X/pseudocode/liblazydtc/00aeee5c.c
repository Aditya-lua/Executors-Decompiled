/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee5c
 */

int UI_method_set_ex_data(long param_1,int param_2,void *param_3)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)(param_1 + 0x48),param_2,param_3);
  return iVar1;
}

