/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c87c
 */

undefined8 X509_getm_notBefore(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}

