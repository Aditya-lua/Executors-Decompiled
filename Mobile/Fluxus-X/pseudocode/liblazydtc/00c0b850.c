/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0b850
 */

void FUN_00c0b850(undefined8 *param_1)

{
  if ((__locale_t)*param_1 != (__locale_t)0x0) {
                    /* try { // try from 00c0b864 to 00c0b867 has its CatchHandler @ 00c0b874 */
    uselocale((__locale_t)*param_1);
  }
  return;
}

