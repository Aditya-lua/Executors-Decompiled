/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c5f0
 */

undefined8 X509_REQ_get_subject_name(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}

