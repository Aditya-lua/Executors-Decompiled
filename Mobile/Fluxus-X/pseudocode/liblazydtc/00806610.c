/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806610
 */

void _INIT_68(void)

{
  if ((DAT_00d1b278 & 1) == 0) {
    DAT_00d1b278 = 1;
    DAT_00d1b270 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b270;
  }
  return;
}

