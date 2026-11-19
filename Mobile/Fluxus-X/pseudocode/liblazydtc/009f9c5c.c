/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9c5c
 */

void async_wait_ctx_reset_counts(undefined8 *param_1)

{
  void *pvVar1;
  void *ptr;
  undefined8 *puVar2;
  
  param_1[1] = 0;
  param_1[2] = 0;
  if ((void *)*param_1 != (void *)0x0) {
    pvVar1 = (void *)0x0;
    ptr = (void *)*param_1;
    do {
      while (*(int *)((long)ptr + 0x24) != 0) {
        if (pvVar1 == (void *)0x0) {
          *param_1 = *(undefined8 *)((long)ptr + 0x28);
          CRYPTO_free(ptr);
          puVar2 = param_1;
        }
        else {
          *(undefined8 *)((long)pvVar1 + 0x28) = *(undefined8 *)((long)ptr + 0x28);
          CRYPTO_free(ptr);
          puVar2 = (undefined8 *)((long)pvVar1 + 0x28);
        }
        ptr = (void *)*puVar2;
        if (ptr == (void *)0x0) {
          return;
        }
      }
      if (*(int *)((long)ptr + 0x20) != 0) {
        *(undefined4 *)((long)ptr + 0x20) = 0;
      }
      puVar2 = (undefined8 *)((long)ptr + 0x28);
      pvVar1 = ptr;
      ptr = (void *)*puVar2;
    } while ((void *)*puVar2 != (void *)0x0);
  }
  return;
}

