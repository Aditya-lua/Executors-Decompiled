/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abbb88
 */

bool PKCS12_mac_present(long param_1)

{
  return *(long *)(param_1 + 8) != 0;
}

