/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afdea4
 */

undefined8 NAMING_AUTHORITY_get0_authorityText(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

