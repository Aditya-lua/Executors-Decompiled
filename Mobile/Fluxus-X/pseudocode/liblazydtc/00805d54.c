/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805d54
 */

void _INIT_25(void)

{
  if ((DAT_00d1afc8 & 1) == 0) {
    DAT_00d1afc8 = 1;
    DAT_00d1afc0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1afc0;
  }
  return;
}

