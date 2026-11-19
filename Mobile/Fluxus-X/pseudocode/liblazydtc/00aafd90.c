/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafd90
 */

undefined8 OCSP_resp_get0_signature(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

