/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fa48
 */

void FUN_0090fa48(pthread_t *param_1)

{
  if (param_1 == (pthread_t *)0x0) {
    return;
  }
  pthread_detach(*param_1);
  (*(code *)PTR_free_00cc4678)(param_1);
  return;
}

