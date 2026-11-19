/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e7dc
 */

undefined8 X509_REQ_get0_distinguishing_id(long param_1)

{
  return *(undefined8 *)(param_1 + 0x60);
}

