/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080684c
 */

void _INIT_79(void)

{
  if ((DAT_00d1b328 & 1) == 0) {
    DAT_00d1b328 = 1;
    DAT_00d1b320 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b320;
  }
  return;
}

