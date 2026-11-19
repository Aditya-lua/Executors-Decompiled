/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008065dc
 */

void _INIT_67(void)

{
  if ((DAT_00d1b268 & 1) == 0) {
    DAT_00d1b268 = 1;
    DAT_00d1b260 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b260;
  }
  return;
}

