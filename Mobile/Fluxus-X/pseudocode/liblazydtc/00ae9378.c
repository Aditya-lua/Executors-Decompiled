/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9378
 */

void OPENSSL_sk_sort(int *param_1)

{
  if (((param_1 != (int *)0x0) && (param_1[4] == 0)) &&
     (*(__compar_fn_t *)(param_1 + 6) != (__compar_fn_t)0x0)) {
    if (1 < *param_1) {
      qsort(*(void **)(param_1 + 2),(long)*param_1,8,*(__compar_fn_t *)(param_1 + 6));
    }
    param_1[4] = 1;
  }
  return;
}

