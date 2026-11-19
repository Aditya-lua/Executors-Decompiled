/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00e38
 */

undefined8 FUN_00a00e38(long param_1)

{
  BUF_MEM *a;
  undefined8 uVar1;
  undefined8 *ptr;
  
  uVar1 = 0;
  if (param_1 != 0) {
    ptr = *(undefined8 **)(param_1 + 0x40);
    if (((*(int *)(param_1 + 0x2c) != 0) && (ptr != (undefined8 *)0x0)) &&
       (*(int *)(param_1 + 0x28) != 0)) {
      a = (BUF_MEM *)*ptr;
      if ((*(byte *)(param_1 + 0x31) >> 1 & 1) != 0) {
        a->data = (char *)0x0;
      }
      BUF_MEM_free(a);
    }
    CRYPTO_free((void *)ptr[1]);
    CRYPTO_free(ptr);
    uVar1 = 1;
  }
  return uVar1;
}

