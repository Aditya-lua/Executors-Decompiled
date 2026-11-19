/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008518c0
 */

void _INIT_110(void)

{
  if ((DAT_00d1ea18 & 1) == 0) {
    DAT_00d1ea18 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea10 = DAT_00d1e930;
  }
  return;
}

