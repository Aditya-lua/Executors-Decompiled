/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafddc
 */

undefined8 OCSP_resp_get0_certs(long param_1)

{
  return *(undefined8 *)(param_1 + 0x48);
}

