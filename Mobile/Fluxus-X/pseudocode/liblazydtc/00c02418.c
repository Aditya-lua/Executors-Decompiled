/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02418
 */

void FUN_00c02418(undefined8 *param_1)

{
  if ((__locale_t)*param_1 != (__locale_t)0x0) {
                    /* try { // try from 00c0242c to 00c0242f has its CatchHandler @ 00c0243c */
    freelocale((__locale_t)*param_1);
  }
  return;
}

