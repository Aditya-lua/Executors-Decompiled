/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ba50
 */

undefined8 X509_STORE_get_check_issued(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}

