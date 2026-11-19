/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851950
 */

void _INIT_113(void)

{
  if ((DAT_00d1ea48 & 1) == 0) {
    DAT_00d1ea48 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea40 = DAT_00d1e930;
  }
  return;
}

