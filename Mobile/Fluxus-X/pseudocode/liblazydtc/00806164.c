/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806164
 */

void _INIT_45(void)

{
  if ((DAT_00d1b108 & 1) == 0) {
    DAT_00d1b108 = 1;
    DAT_00d1b100 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b100;
  }
  return;
}

