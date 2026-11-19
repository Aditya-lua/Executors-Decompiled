/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc81c
 */

undefined8 PKCS12_SAFEBAG_get0_bag_type(long param_1)

{
  return **(undefined8 **)(param_1 + 8);
}

