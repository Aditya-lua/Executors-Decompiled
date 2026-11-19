/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806200
 */

void _INIT_48(void)

{
  if ((DAT_00d1b138 & 1) == 0) {
    DAT_00d1b138 = 1;
    DAT_00d1b130 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b130;
  }
  return;
}

