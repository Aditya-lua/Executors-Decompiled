/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c884
 */

undefined8 X509_getm_notAfter(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

