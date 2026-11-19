/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806338
 */

void _INIT_54(void)

{
  if ((DAT_00d1b198 & 1) == 0) {
    DAT_00d1b198 = 1;
    DAT_00d1b190 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b190;
  }
  return;
}

