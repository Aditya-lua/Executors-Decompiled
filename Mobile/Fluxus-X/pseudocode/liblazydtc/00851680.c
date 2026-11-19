/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851680
 */

void _INIT_98(void)

{
  if ((DAT_00d1e958 & 1) == 0) {
    DAT_00d1e958 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e950 = DAT_00d1e930;
  }
  return;
}

