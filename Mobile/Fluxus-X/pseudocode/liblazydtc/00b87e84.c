/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87e84
 */

undefined4 psa_hash_finish(int *param_1,void *param_2,size_t param_3,undefined8 *param_4)

{
  undefined4 uVar1;
  void *__src;
  int iVar2;
  size_t __n;
  
  if (param_3 == 0) {
    __n = 0;
    __src = (void *)0x0;
    param_2 = (void *)0x0;
  }
  else {
    __src = calloc(param_3,1);
    __n = param_3;
    if (__src == (void *)0x0) {
      return 0xffffff73;
    }
  }
  *param_4 = 0;
  iVar2 = *param_1;
  uVar1 = 0xffffff77;
  if (iVar2 != 0) {
    if (iVar2 == 1) {
      uVar1 = mbedtls_psa_hash_finish(param_1 + 2,__src,param_3,param_4);
      iVar2 = *param_1;
    }
    if (iVar2 != 0) {
      if (iVar2 == 1) {
        mbedtls_psa_hash_abort(param_1 + 2);
      }
      *param_1 = 0;
    }
  }
  if (__src != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      uVar1 = 0xffffff69;
    }
    else {
      if (__n != 0) {
        memcpy(param_2,__src,__n);
      }
      free(__src);
    }
  }
  return uVar1;
}

