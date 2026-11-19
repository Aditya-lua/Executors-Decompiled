/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10888
 */

undefined8 X509_STORE_CTX_get_verify_cb(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}

