/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851d10
 */

void _INIT_133(void)

{
  if ((DAT_00d1eb88 & 1) == 0) {
    DAT_00d1eb88 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb80 = DAT_00d1e930;
  }
  return;
}

