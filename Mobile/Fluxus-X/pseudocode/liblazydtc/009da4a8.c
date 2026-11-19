/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da4a8
 */

void ossl_statem_set_hello_verify_done(long param_1)

{
  *(undefined4 *)(param_1 + 0x48) = 0;
  *(undefined4 *)(param_1 + 100) = 1;
  *(undefined4 *)(param_1 + 0x5c) = 0x14;
  return;
}

