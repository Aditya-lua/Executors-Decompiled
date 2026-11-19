/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008828f0
 */

void FUN_008828f0(long *param_1)

{
  if (*param_1 != 0) {
                    /* try { // try from 00882908 to 0088290f has its CatchHandler @ 00882920 */
    FUN_00882ec8(param_1);
  }
  operator_delete((void *)param_1[3]);
  return;
}

