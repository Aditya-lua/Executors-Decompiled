/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10834
 */

undefined8 X509_STORE_CTX_get0_cert(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

