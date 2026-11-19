/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0ab4
 */

void EVP_PKEY_asn1_set_set_priv_key(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xf8) = param_2;
  return;
}

