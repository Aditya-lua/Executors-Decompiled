/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afde70
 */

undefined8 NAMING_AUTHORITY_get0_authorityURL(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

