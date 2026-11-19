/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c44830
 */

void * operator_new(void)

{
  void *pvVar1;
  
  pvVar1 = operator_new();
  return pvVar1;
}

