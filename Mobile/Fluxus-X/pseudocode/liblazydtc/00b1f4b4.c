/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f4b4
 */

undefined8 X509_get0_trust_objects(long param_1)

{
  if (*(undefined8 **)(param_1 + 0x150) == (undefined8 *)0x0) {
    return 0;
  }
  return **(undefined8 **)(param_1 + 0x150);
}

