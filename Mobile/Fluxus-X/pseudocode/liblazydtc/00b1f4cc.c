/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f4cc
 */

undefined8 X509_get0_reject_objects(long param_1)

{
  if (*(long *)(param_1 + 0x150) == 0) {
    return 0;
  }
  return *(undefined8 *)(*(long *)(param_1 + 0x150) + 8);
}

