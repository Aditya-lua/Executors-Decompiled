/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851920
 */

void _INIT_112(void)

{
  if ((DAT_00d1ea38 & 1) == 0) {
    DAT_00d1ea38 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea30 = DAT_00d1e930;
  }
  return;
}

