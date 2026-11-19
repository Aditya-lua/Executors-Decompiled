/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805e58
 */

void _INIT_30(void)

{
  if ((DAT_00d1b018 & 1) == 0) {
    DAT_00d1b018 = 1;
    DAT_00d1b010 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b010;
  }
  return;
}

