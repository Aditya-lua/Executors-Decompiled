/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db1f4
 */

bool ossl_statem_export_allowed(long param_1)

{
  if (*(long *)(param_1 + 0x478) == 0) {
    return false;
  }
  return *(int *)(param_1 + 0x5c) != 0x24;
}

