/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806678
 */

void _INIT_70(void)

{
  if ((DAT_00d1b298 & 1) == 0) {
    DAT_00d1b298 = 1;
    DAT_00d1b290 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b290;
  }
  return;
}

