/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b44c
 */

undefined8 mbedtls_poly1305_update(long param_1,void *param_2,ulong param_3)

{
  void *__dest;
  long lVar1;
  size_t __n;
  
  if (param_3 != 0) {
    lVar1 = *(long *)(param_1 + 0x48);
    if (lVar1 == 0) {
      __n = 0;
    }
    else {
      __n = 0x10 - lVar1;
      __dest = (void *)(param_1 + lVar1 + 0x34);
      if (param_3 < __n) {
        memcpy(__dest,param_2,param_3);
        *(ulong *)(param_1 + 0x48) = *(long *)(param_1 + 0x48) + param_3;
        return 0;
      }
      memcpy(__dest,param_2,__n);
      *(undefined8 *)(param_1 + 0x48) = 0;
      FUN_00b7b534(param_1,1,param_1 + 0x34,1);
      param_3 = param_3 - __n;
    }
    if (0xf < param_3) {
      FUN_00b7b534(param_1,param_3 >> 4,(long)param_2 + __n,1);
      __n = __n + (param_3 & 0xfffffffffffffff0);
      param_3 = param_3 & 0xf;
    }
    if (param_3 != 0) {
      *(ulong *)(param_1 + 0x48) = param_3;
      memcpy((void *)(param_1 + 0x34),(void *)((long)param_2 + __n),param_3);
    }
  }
  return 0;
}

