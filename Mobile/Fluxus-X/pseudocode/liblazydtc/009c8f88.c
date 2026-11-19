/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8f88
 */

void SSL_CTX_set_srp_password(undefined8 param_1,undefined8 param_2)

{
  ssl3_ctx_ctrl(param_1,0x51,0,param_2);
  return;
}

