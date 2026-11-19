/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86434
 */

byte psa_can_do_cipher(void)

{
  return DAT_00d25b10 & 1;
}

