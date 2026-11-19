/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fac00
 */

void BIO_ADDR_clear(void *param_1)

{
  memset(param_1,0,0x70);
  return;
}

