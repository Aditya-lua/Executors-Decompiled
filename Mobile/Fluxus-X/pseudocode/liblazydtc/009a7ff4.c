/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7ff4
 */

undefined * ssl3_get_cipher(uint param_1)

{
  undefined *puVar1;
  
  puVar1 = &DAT_00cc4fc0 + (0xa6 - (ulong)param_1) * 0x50;
  if (0xa6 < param_1) {
    puVar1 = (undefined *)0x0;
  }
  return puVar1;
}

