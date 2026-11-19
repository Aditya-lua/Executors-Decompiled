/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805d88
 */

void _INIT_26(void)

{
  if ((DAT_00d1afd8 & 1) == 0) {
    DAT_00d1afd8 = 1;
    DAT_00d1afd0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1afd0;
  }
  return;
}

