/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fa8c
 */

bool FUN_0090fa8c(undefined8 *param_1)

{
  int iVar1;
  
  iVar1 = pthread_join(*(pthread_t *)*param_1,(void **)0x0);
  (*(code *)PTR_free_00cc4678)(*param_1);
  *param_1 = 0;
  return iVar1 == 0;
}

