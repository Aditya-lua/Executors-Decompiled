/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b108a0
 */

undefined8 X509_STORE_CTX_get_get_issuer(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

