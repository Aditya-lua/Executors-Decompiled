/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c855c
 */

bool ssl_ctx_srp_ctx_init_intern(long param_1)

{
  if (param_1 != 0) {
    memset((void *)(param_1 + 0x318),0,0x80);
    *(undefined4 *)(param_1 + 0x388) = 0x400;
  }
  return param_1 != 0;
}

