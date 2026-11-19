/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acf1c
 */

undefined8 SSL_get0_peer_CA_list(long param_1)

{
  return *(undefined8 *)(param_1 + 0x308);
}

