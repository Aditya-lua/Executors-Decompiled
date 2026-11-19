/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b880d4
 */

undefined4
psa_hash_compute(uint param_1,void *param_2,size_t param_3,void *param_4,size_t param_5,
                undefined8 *param_6)

{
  undefined4 uVar1;
  void *__dest;
  void *__src;
  size_t __n;
  
  *param_6 = 0;
  if ((param_1 & 0x7f000000) != 0x2000000) {
    return 0xffffff79;
  }
  if (param_3 == 0) {
    __dest = (void *)0x0;
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) goto LAB_00b881cc;
    memcpy(__dest,param_2,param_3);
  }
  if (param_5 == 0) {
    __src = (void *)0x0;
    param_4 = (void *)0x0;
    __n = 0;
  }
  else {
    __src = calloc(param_5,1);
    __n = param_5;
    if (__src == (void *)0x0) {
LAB_00b881cc:
      free(__dest);
      return 0xffffff73;
    }
  }
  uVar1 = mbedtls_psa_hash_compute(param_1,__dest,param_3,__src,param_5,param_6);
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_4 == (void *)0x0) {
      uVar1 = 0xffffff69;
    }
    else {
      if (__n != 0) {
        memcpy(param_4,__src,__n);
      }
      free(__src);
    }
  }
  return uVar1;
}

