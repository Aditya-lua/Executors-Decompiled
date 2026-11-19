/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fe50
 */

void OPENSSL_LH_flush(long *param_1)

{
  void *ptr;
  uint uVar1;
  long *plVar2;
  ulong uVar3;
  void *pvVar4;
  
  if (param_1 != (long *)0x0) {
    uVar1 = *(uint *)(param_1 + 3);
    if (uVar1 != 0) {
      uVar3 = 0;
      do {
        plVar2 = (long *)(*param_1 + uVar3 * 8);
        ptr = (void *)*plVar2;
        if ((void *)*plVar2 != (void *)0x0) {
          do {
            pvVar4 = *(void **)((long)ptr + 8);
            CRYPTO_free(ptr);
            ptr = pvVar4;
          } while (pvVar4 != (void *)0x0);
          uVar1 = *(uint *)(param_1 + 3);
          plVar2 = (long *)(*param_1 + uVar3 * 8);
        }
        uVar3 = uVar3 + 1;
        *plVar2 = 0;
      } while (uVar3 < uVar1);
    }
    param_1[7] = 0;
  }
  return;
}

