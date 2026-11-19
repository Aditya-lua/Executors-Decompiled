/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851710
 */

void _INIT_101(void)

{
  if ((DAT_00d1e988 & 1) == 0) {
    DAT_00d1e988 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e980 = DAT_00d1e930;
  }
  return;
}

