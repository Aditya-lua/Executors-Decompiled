/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009843c0
 */

/* ix::network_to_host_short(unsigned short) */

ushort ix::network_to_host_short(ushort param_1)

{
  return param_1 >> 8 | param_1 << 8;
}

