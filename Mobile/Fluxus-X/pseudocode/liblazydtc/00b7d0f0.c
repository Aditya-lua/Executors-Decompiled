/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d0f0
 */

void mbedtls_asn1_free_named_data_list(undefined8 *param_1)

{
  void *__ptr;
  
  __ptr = (void *)*param_1;
  while (__ptr != (void *)0x0) {
    *param_1 = *(undefined8 *)((long)__ptr + 0x30);
    free(*(void **)((long)__ptr + 0x10));
    free(*(void **)((long)__ptr + 0x28));
    free(__ptr);
    __ptr = (void *)*param_1;
  }
  return;
}

