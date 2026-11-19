/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc828
 */

undefined8 PKCS12_SAFEBAG_get0_bag_obj(long param_1)

{
  return *(undefined8 *)(*(long *)(param_1 + 8) + 8);
}

