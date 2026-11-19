/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805ec0
 */

void _INIT_32(void)

{
  if ((DAT_00d1b038 & 1) == 0) {
    DAT_00d1b038 = 1;
    DAT_00d1b030 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b030;
  }
  return;
}

