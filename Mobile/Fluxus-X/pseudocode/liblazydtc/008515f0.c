/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008515f0
 */

void _INIT_95(void)

{
  if ((DAT_00d1e928 & 1) == 0) {
    DAT_00d1e928 = 1;
    DAT_00d1e924 = DAT_00d1e930 + 1;
    DAT_00d1e930 = DAT_00d1e924;
  }
  return;
}

