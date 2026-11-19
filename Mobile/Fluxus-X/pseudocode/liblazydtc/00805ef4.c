/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805ef4
 */

void _INIT_33(void)

{
  if ((DAT_00d1b048 & 1) == 0) {
    DAT_00d1b048 = 1;
    DAT_00d1b040 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b040;
  }
  return;
}

