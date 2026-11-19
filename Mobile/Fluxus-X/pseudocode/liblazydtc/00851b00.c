/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851b00
 */

void _INIT_122(void)

{
  if ((DAT_00d1ead8 & 1) == 0) {
    DAT_00d1ead8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ead0 = DAT_00d1e930;
  }
  return;
}

