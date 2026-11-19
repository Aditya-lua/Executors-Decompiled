/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c5c
 */

void EVP_PKEY_meth_set_digestsign(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xd0) = param_2;
  return;
}

