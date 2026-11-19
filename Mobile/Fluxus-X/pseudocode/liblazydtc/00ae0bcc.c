/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0bcc
 */

undefined8 ossl_sha3_update(long param_1,void *param_2,size_t param_3)

{
  void *__dest;
  ulong __n;
  long lVar1;
  ulong uVar2;
  size_t __n_00;
  
  if (param_3 != 0) {
    lVar1 = *(long *)(param_1 + 0xd8);
    uVar2 = *(ulong *)(param_1 + 200);
    if (lVar1 != 0) {
      __n_00 = uVar2 - lVar1;
      __dest = (void *)(param_1 + lVar1 + 0xe0);
      if (param_3 < __n_00) {
        memcpy(__dest,param_2,param_3);
        *(size_t *)(param_1 + 0xd8) = *(long *)(param_1 + 0xd8) + param_3;
        return 1;
      }
      memcpy(__dest,param_2,__n_00);
      param_2 = (void *)((long)param_2 + __n_00);
      param_3 = param_3 - __n_00;
      SHA3_absorb(param_1,param_1 + 0xe0,uVar2,uVar2);
      *(undefined8 *)(param_1 + 0xd8) = 0;
    }
    __n = param_3;
    if (uVar2 <= param_3) {
      __n = SHA3_absorb(param_1,param_2,param_3,uVar2);
    }
    if (__n != 0) {
      memcpy((void *)(param_1 + 0xe0),(void *)((long)param_2 + (param_3 - __n)),__n);
      *(ulong *)(param_1 + 0xd8) = __n;
    }
  }
  return 1;
}

