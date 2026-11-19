/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851740
 */

void _INIT_102(void)

{
  if ((DAT_00d1e998 & 1) == 0) {
    DAT_00d1e998 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e990 = DAT_00d1e930;
  }
  return;
}

