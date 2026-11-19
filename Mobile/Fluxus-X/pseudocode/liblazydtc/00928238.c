/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00928238
 */

size_t FUN_00928238(void *param_1,ulong param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  size_t __n;
  
  if (param_2 == 0) {
    __n = 0xfffffffffffffffe;
  }
  else {
    lVar1 = *(long *)(param_4 + 0xa0);
    __n = *(long *)(param_4 + 0xa8) - lVar1;
    if (param_2 <= __n) {
      __n = param_2;
    }
    if (__n != 0) {
      memcpy(param_1,(void *)(param_4 + lVar1 + 0xb0),__n);
      lVar1 = *(long *)(param_4 + 0xa0);
    }
    *(size_t *)(param_4 + 0xa0) = lVar1 + __n;
  }
  return __n;
}

