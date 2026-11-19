/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da280
 */

void ossl_statem_set_renegotiate(long param_1)

{
  *(undefined8 *)(param_1 + 0x60) = 0x100000013;
  return;
}

