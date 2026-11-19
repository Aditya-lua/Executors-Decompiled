/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3c888
 */

bool FUN_00a3c888(void *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  
  iVar1 = CRYPTO_memcmp(param_1,param_2,param_3);
  return iVar1 == 0;
}

