/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008065a8
 */

void _INIT_66(void)

{
  if ((DAT_00d1b258 & 1) == 0) {
    DAT_00d1b258 = 1;
    DAT_00d1b250 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b250;
  }
  return;
}

