/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851650
 */

void _INIT_97(void)

{
  if ((DAT_00d1e948 & 1) == 0) {
    DAT_00d1e948 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e940 = DAT_00d1e930;
  }
  return;
}

