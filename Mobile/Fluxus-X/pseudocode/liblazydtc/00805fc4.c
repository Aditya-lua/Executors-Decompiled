/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805fc4
 */

void _INIT_37(void)

{
  if ((DAT_00d1b088 & 1) == 0) {
    DAT_00d1b088 = 1;
    DAT_00d1b080 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b080;
  }
  return;
}

