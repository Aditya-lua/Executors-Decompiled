/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d63dc
 */

void custom_exts_free(long *param_1)

{
  void *ptr;
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  
  ptr = (void *)*param_1;
  uVar1 = param_1[1];
  if (uVar1 != 0) {
    uVar2 = 0;
    puVar3 = (undefined8 *)((long)ptr + 0x30);
    do {
      if ((undefined1 *)puVar3[-4] == &LAB_009d63b4) {
        CRYPTO_free((void *)puVar3[-2]);
        CRYPTO_free((void *)*puVar3);
        uVar1 = param_1[1];
      }
      uVar2 = uVar2 + 1;
      puVar3 = puVar3 + 7;
    } while (uVar2 < uVar1);
    ptr = (void *)*param_1;
  }
  CRYPTO_free(ptr);
  *param_1 = 0;
  param_1[1] = 0;
  return;
}

