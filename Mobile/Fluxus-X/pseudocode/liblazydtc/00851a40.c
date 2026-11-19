/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851a40
 */

void _INIT_118(void)

{
  if ((DAT_00d1ea98 & 1) == 0) {
    DAT_00d1ea98 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea90 = DAT_00d1e930;
  }
  return;
}

