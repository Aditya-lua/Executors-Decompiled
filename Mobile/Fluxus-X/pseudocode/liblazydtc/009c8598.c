/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8598
 */

bool SSL_CTX_SRP_CTX_init(long param_1)

{
  if (param_1 != 0) {
    memset((void *)(param_1 + 0x318),0,0x80);
    *(undefined4 *)(param_1 + 0x388) = 0x400;
  }
  return param_1 != 0;
}

