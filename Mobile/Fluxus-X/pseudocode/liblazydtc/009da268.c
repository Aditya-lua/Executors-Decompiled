/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da268
 */

void ossl_statem_clear(long param_1)

{
  *(undefined4 *)(param_1 + 0x48) = 0;
  *(undefined4 *)(param_1 + 0x5c) = 0;
  *(undefined4 *)(param_1 + 100) = 1;
  *(undefined4 *)(param_1 + 0x74) = 0;
  return;
}

