/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29294
 */

/* operator new[](unsigned long, std::align_val_t, std::nothrow_t const&) */

void * operator_new__(void)

{
  void *pvVar1;
  
                    /* try { // try from 00c292a0 to 00c292a3 has its CatchHandler @ 00c292b0 */
  pvVar1 = operator_new__();
  return pvVar1;
}

