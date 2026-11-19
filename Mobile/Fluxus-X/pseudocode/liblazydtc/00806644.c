/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806644
 */

void _INIT_69(void)

{
  if ((DAT_00d1b288 & 1) == 0) {
    DAT_00d1b288 = 1;
    DAT_00d1b280 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b280;
  }
  return;
}

