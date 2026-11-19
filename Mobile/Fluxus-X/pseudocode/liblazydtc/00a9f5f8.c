/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f5f8
 */

undefined8 OSSL_PARAM_set_utf8_string(long param_1,char *param_2)

{
  size_t __n;
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0x20) = 0;
    if (param_2 == (char *)0x0) {
      uVar1 = 0;
    }
    else {
      __n = strlen(param_2);
      *(size_t *)(param_1 + 0x20) = __n;
      if (*(void **)(param_1 + 0x10) != (void *)0x0) {
        if (*(int *)(param_1 + 8) != 4) {
          return 0;
        }
        if (*(ulong *)(param_1 + 0x18) < __n) {
          return 0;
        }
        memcpy(*(void **)(param_1 + 0x10),param_2,__n);
        if (__n < *(ulong *)(param_1 + 0x18)) {
          *(undefined1 *)(*(long *)(param_1 + 0x10) + __n) = 0;
        }
      }
      uVar1 = 1;
    }
  }
  return uVar1;
}

