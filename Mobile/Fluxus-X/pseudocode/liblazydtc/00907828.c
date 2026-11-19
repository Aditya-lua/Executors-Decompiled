/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907828
 */

undefined8 FUN_00907828(long *param_1)

{
  while( true ) {
    if (param_1 == (long *)0x0) {
      return 0;
    }
    if ((*(uint *)(*param_1 + 8) >> 1 & 1) != 0) break;
    if ((*(uint *)(*param_1 + 8) & 1) != 0) {
      return 0;
    }
    param_1 = (long *)param_1[1];
  }
  return 1;
}

