/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b897fc
 */

undefined4
psa_sign_hash(undefined4 param_1,undefined4 param_2,void *param_3,size_t param_4,void *param_5,
             size_t param_6,undefined8 param_7)

{
  undefined4 uVar1;
  void *__dest;
  void *__src;
  size_t __n;
  
  if (param_4 == 0) {
    __dest = (void *)0x0;
  }
  else {
    __dest = calloc(param_4,1);
    if (__dest == (void *)0x0) goto LAB_00b898e8;
    memcpy(__dest,param_3,param_4);
  }
  if (param_6 == 0) {
    __src = (void *)0x0;
    param_5 = (void *)0x0;
    __n = 0;
  }
  else {
    __src = calloc(param_6,1);
    __n = param_6;
    if (__src == (void *)0x0) {
LAB_00b898e8:
      free(__dest);
      return 0xffffff73;
    }
  }
  uVar1 = FUN_00b890b4(param_1,0,param_2,__dest,param_4,__src,param_6,param_7);
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_5 == (void *)0x0) {
      uVar1 = 0xffffff69;
    }
    else {
      if (__n != 0) {
        memcpy(param_5,__src,__n);
      }
      free(__src);
    }
  }
  return uVar1;
}

