/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a664
 */

undefined8 FUN_0084a664(long param_1,uint param_2)

{
  if (((param_2 & 0xf8) == 0x30) || ((param_2 & 0xfe) == 0x38)) {
    if ((param_2 & 0xff) - 0x31 < 9) {
      if (*(uint *)(param_1 + 0x1c) < (param_2 & 0xff) - 0x30) {
                    /* WARNING: Subroutine does not return */
        FUN_00845964();
      }
      FUN_008459b0();
      return 1;
    }
  }
  return 0;
}

