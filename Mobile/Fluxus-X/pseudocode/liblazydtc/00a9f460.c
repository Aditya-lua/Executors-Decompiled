/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f460
 */

undefined8 OSSL_PARAM_get_utf8_string(long param_1,long *param_2,ulong param_3)

{
  undefined8 uVar1;
  void *__dest;
  ulong uVar2;
  
  uVar1 = 0;
  if (((param_1 != 0) && (param_2 != (long *)0x0)) && (uVar1 = 0, *(int *)(param_1 + 8) == 4)) {
    if (*(long *)(param_1 + 0x10) == 0) {
      uVar1 = 0;
    }
    else {
      __dest = (void *)*param_2;
      uVar2 = *(ulong *)(param_1 + 0x18);
      if (__dest == (void *)0x0) {
        param_3 = uVar2 + 1;
        __dest = CRYPTO_malloc((int)param_3,"crypto/params.c",0x463);
        if (__dest == (void *)0x0) {
          return 0;
        }
        *param_2 = (long)__dest;
      }
      uVar1 = 0;
      if (uVar2 <= param_3) {
        memcpy(__dest,*(void **)(param_1 + 0x10),uVar2);
        uVar2 = *(ulong *)(param_1 + 0x18);
        if (param_3 <= uVar2) {
          uVar2 = OPENSSL_strnlen(*(undefined8 *)(param_1 + 0x10));
        }
        uVar1 = 0;
        if (uVar2 < param_3) {
          uVar1 = 1;
          *(undefined1 *)(*param_2 + uVar2) = 0;
        }
      }
    }
  }
  return uVar1;
}

