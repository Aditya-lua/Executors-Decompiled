/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f534
 */

bool OSSL_PARAM_get_octet_string(long param_1,long *param_2,ulong param_3,ulong *param_4)

{
  ulong uVar1;
  bool bVar2;
  void *__dest;
  ulong __n;
  
  bVar2 = false;
  if (((param_1 != 0) && (param_2 != (long *)0x0 || param_4 != (ulong *)0x0)) &&
     (bVar2 = false, *(int *)(param_1 + 8) == 5)) {
    __n = *(ulong *)(param_1 + 0x18);
    uVar1 = __n;
    if (__n == 0) {
      uVar1 = 1;
    }
    if (param_4 != (ulong *)0x0) {
      *param_4 = __n;
    }
    bVar2 = *(long *)(param_1 + 0x10) != 0;
    if ((param_2 != (long *)0x0) && (*(long *)(param_1 + 0x10) != 0)) {
      __dest = (void *)*param_2;
      if (__dest == (void *)0x0) {
        __dest = CRYPTO_malloc((int)uVar1,"crypto/params.c",0x463);
        if (__dest == (void *)0x0) {
          return false;
        }
        *param_2 = (long)__dest;
        param_3 = uVar1;
      }
      bVar2 = false;
      if (__n <= param_3) {
        memcpy(__dest,*(void **)(param_1 + 0x10),__n);
        bVar2 = true;
      }
    }
  }
  return bVar2;
}

