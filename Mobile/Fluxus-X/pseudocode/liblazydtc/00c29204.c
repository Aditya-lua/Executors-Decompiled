/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29204
 */

/* operator new[](unsigned long, std::nothrow_t const&) */

void * operator_new__(ulong param_1,nothrow_t *param_2)

{
  void *pvVar1;
  
                    /* try { // try from 00c29210 to 00c29213 has its CatchHandler @ 00c29220 */
  pvVar1 = operator_new__(param_1);
  return pvVar1;
}

