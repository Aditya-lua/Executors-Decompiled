/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14474
 */

undefined8 X509_VERIFY_PARAM_get_time(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

