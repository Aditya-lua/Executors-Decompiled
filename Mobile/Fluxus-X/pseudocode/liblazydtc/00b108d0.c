/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b108d0
 */

undefined8 X509_STORE_CTX_get_check_policy(long param_1)

{
  return *(undefined8 *)(param_1 + 0x70);
}

