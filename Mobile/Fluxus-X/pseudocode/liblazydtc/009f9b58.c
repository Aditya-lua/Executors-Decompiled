/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9b58
 */

undefined8 ASYNC_WAIT_CTX_clear_fd(long *param_1,long param_2)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  long *ptr;
  
  plVar2 = (long *)*param_1;
  if (plVar2 != (long *)0x0) {
    plVar3 = (long *)0x0;
    ptr = plVar2;
    do {
      if ((*(int *)((long)ptr + 0x24) != 1) && (*ptr == param_2)) {
        if ((int)ptr[4] != 1) {
          *(undefined4 *)((long)ptr + 0x24) = 1;
          param_1[2] = param_1[2] + 1;
          return 1;
        }
        plVar1 = param_1;
        if (plVar2 != ptr) {
          plVar1 = plVar3 + 5;
        }
        *plVar1 = ptr[5];
        CRYPTO_free(ptr);
        param_1[1] = param_1[1] + -1;
        return 1;
      }
      plVar1 = ptr + 5;
      plVar3 = ptr;
      ptr = (long *)*plVar1;
    } while ((long *)*plVar1 != (long *)0x0);
  }
  return 0;
}

