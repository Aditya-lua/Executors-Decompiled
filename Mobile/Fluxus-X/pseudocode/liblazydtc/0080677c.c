/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080677c
 */

void _INIT_75(void)

{
  if ((DAT_00d1b2e8 & 1) == 0) {
    DAT_00d1b2e8 = 1;
    DAT_00d1b2e0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b2e0;
  }
  return;
}

