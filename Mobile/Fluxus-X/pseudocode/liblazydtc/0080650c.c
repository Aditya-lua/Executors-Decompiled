/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080650c
 */

void _INIT_63(void)

{
  if ((DAT_00d1b228 & 1) == 0) {
    DAT_00d1b228 = 1;
    DAT_00d1b220 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b220;
  }
  return;
}

