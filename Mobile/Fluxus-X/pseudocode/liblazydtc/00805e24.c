/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805e24
 */

void _INIT_29(void)

{
  if ((DAT_00d1b008 & 1) == 0) {
    DAT_00d1b008 = 1;
    DAT_00d1b000 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b000;
  }
  return;
}

