/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b662b8
 */

ulong ossl_cipher_fillblock(long param_1,long *param_2,long param_3,long *param_4,ulong *param_5)

{
  size_t __n;
  ulong uVar1;
  
  uVar1 = param_3 - *param_2;
  __n = *param_5;
  if (uVar1 <= *param_5) {
    __n = uVar1;
  }
  memcpy((void *)(param_1 + *param_2),(void *)*param_4,__n);
  *param_4 = *param_4 + __n;
  *param_5 = *param_5 - __n;
  *param_2 = *param_2 + __n;
  return *param_5 & -param_3;
}

