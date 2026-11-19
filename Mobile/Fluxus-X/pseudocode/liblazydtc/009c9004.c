/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9004
 */

void SSL_CTX_set_srp_username_callback(undefined8 param_1,undefined8 param_2)

{
  ssl3_ctx_callback_ctrl(param_1,0x4b,param_2);
  return;
}

