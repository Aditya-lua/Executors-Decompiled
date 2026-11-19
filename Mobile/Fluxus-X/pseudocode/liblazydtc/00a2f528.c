/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f528
 */

undefined8 ossl_ec_key_get0_propq(long param_1)

{
  return *(undefined8 *)(param_1 + 0x60);
}

