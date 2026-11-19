/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c44840
 */

void * operator_new__(void)

{
  void *pvVar1;
  
  pvVar1 = operator_new__();
  return pvVar1;
}

