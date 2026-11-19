/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2b08
 */

undefined8 SSL_get_signature_type_nid(long param_1,undefined4 *param_2)

{
  if (*(long *)(param_1 + 0x380) == 0) {
    return 0;
  }
  *param_2 = *(undefined4 *)(*(long *)(param_1 + 0x380) + 0x14);
  return 1;
}

