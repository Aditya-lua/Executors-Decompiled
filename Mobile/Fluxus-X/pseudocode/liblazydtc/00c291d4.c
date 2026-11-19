/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c291d4
 */

/* operator new(unsigned long, std::nothrow_t const&) */

void * operator_new(ulong param_1,nothrow_t *param_2)

{
  void *pvVar1;
  
                    /* try { // try from 00c291e0 to 00c291e3 has its CatchHandler @ 00c291f0 */
  pvVar1 = operator_new(param_1);
  return pvVar1;
}

