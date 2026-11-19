/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8858
 */

undefined8 SSL_client_hello_get0_random(long param_1,long *param_2)

{
  if (*(long *)(param_1 + 0xb58) == 0) {
    return 0;
  }
  if (param_2 != (long *)0x0) {
    *param_2 = *(long *)(param_1 + 0xb58) + 8;
  }
  return 0x20;
}

