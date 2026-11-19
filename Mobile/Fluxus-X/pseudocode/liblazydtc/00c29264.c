/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29264
 */

/* operator new(unsigned long, std::align_val_t, std::nothrow_t const&) */

void * operator_new(void)

{
  void *pvVar1;
  
                    /* try { // try from 00c29270 to 00c29273 has its CatchHandler @ 00c29280 */
  pvVar1 = operator_new();
  return pvVar1;
}

