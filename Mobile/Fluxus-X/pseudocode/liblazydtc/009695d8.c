/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009695d8
 */

void FUN_009695d8(void)

{
  if (DAT_00d20180 == '\x01') {
    (**(code **)(PTR_DAT_00cc4d08 + 0x28))();
    DAT_00d20180 = '\0';
  }
  return;
}

