/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0acc
 */

void ossl_sha3_reset(void *param_1)

{
  memset(param_1,0,200);
  *(undefined8 *)((long)param_1 + 0xd8) = 0;
  return;
}

