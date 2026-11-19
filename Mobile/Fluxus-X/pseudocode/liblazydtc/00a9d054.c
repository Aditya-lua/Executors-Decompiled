/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d054
 */

void WPACKET_cleanup(long param_1)

{
  undefined8 *ptr;
  void *pvVar1;
  
  ptr = *(void **)(param_1 + 0x28);
  while (ptr != (void *)0x0) {
    pvVar1 = (void *)*ptr;
    CRYPTO_free(ptr);
    ptr = pvVar1;
  }
  *(undefined8 *)(param_1 + 0x28) = 0;
  return;
}

