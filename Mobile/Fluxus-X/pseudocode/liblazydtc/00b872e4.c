/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b872e4
 */

undefined8 psa_crypto_local_output_free(undefined8 *param_1)

{
  undefined8 uVar1;
  void *__src;
  undefined8 *puVar2;
  
  puVar2 = param_1 + 1;
  __src = (void *)*puVar2;
  if (__src == (void *)0x0) {
    uVar1 = 0;
    param_1[2] = 0;
  }
  else if ((void *)*param_1 == (void *)0x0) {
    uVar1 = 0xffffff69;
  }
  else {
    if (param_1[2] != 0) {
      memcpy((void *)*param_1,__src,param_1[2]);
      __src = (void *)*puVar2;
    }
    free(__src);
    uVar1 = 0;
    *puVar2 = 0;
    param_1[2] = 0;
  }
  return uVar1;
}

