/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9dfe8
 */

void OSSL_PARAM_set_all_unmodified(long *param_1)

{
  long lVar1;
  
  if (param_1 != (long *)0x0) {
    lVar1 = *param_1;
    while (lVar1 != 0) {
      lVar1 = param_1[5];
      param_1[4] = -1;
      param_1 = param_1 + 5;
    }
  }
  return;
}

