/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafdd4
 */

undefined8 OCSP_resp_get0_produced_at(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

