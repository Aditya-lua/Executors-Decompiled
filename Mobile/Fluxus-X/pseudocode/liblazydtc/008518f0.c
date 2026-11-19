/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008518f0
 */

void _INIT_111(void)

{
  if ((DAT_00d1ea28 & 1) == 0) {
    DAT_00d1ea28 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea20 = DAT_00d1e930;
  }
  return;
}

