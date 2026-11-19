/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806304
 */

void _INIT_53(void)

{
  if ((DAT_00d1b188 & 1) == 0) {
    DAT_00d1b188 = 1;
    DAT_00d1b180 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b180;
  }
  return;
}

