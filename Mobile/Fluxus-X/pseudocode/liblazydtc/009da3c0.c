/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da3c0
 */

undefined4 ossl_statem_get_in_handshake(long param_1)

{
  return *(undefined4 *)(param_1 + 0x6c);
}

