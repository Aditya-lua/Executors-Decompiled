/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851bf0
 */

void _INIT_127(void)

{
  if ((DAT_00d1eb28 & 1) == 0) {
    DAT_00d1eb28 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb20 = DAT_00d1e930;
  }
  return;
}

