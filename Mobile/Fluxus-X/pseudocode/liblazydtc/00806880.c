/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806880
 */

void _INIT_80(void)

{
  if ((DAT_00d1b338 & 1) == 0) {
    DAT_00d1b338 = 1;
    DAT_00d1b330 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b330;
  }
  return;
}

