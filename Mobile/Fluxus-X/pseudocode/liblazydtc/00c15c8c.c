/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c15c8c
 */

void FUN_00c15c8c(undefined8 *param_1,undefined8 *param_2)

{
  void *__dest;
  size_t __n;
  undefined8 *__src;
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)param_1[1];
  if (puVar1 == (undefined8 *)param_1[2]) {
    __src = (undefined8 *)*param_1;
    __n = (long)puVar1 - (long)__src;
    if (__src == param_1 + 3) {
      __dest = malloc(__n * 2);
      if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (puVar1 != __src) {
        memmove(__dest,__src,__n);
      }
      *param_1 = __dest;
    }
    else {
      __dest = realloc(__src,__n * 2);
      *param_1 = __dest;
      if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    puVar1 = (undefined8 *)((long)__dest + __n);
    param_1[2] = (void *)((long)__dest + ((long)__n >> 2) * 8);
  }
  *puVar1 = *param_2;
  param_1[1] = puVar1 + 1;
  return;
}

