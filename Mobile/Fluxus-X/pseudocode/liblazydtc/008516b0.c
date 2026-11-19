/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008516b0
 */

void _INIT_99(void)

{
  if ((DAT_00d1e968 & 1) == 0) {
    DAT_00d1e968 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e960 = DAT_00d1e930;
  }
  return;
}

