/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ba40
 */

undefined8 X509_STORE_get_get_issuer(long param_1)

{
  return *(undefined8 *)(param_1 + 0x30);
}

