/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b94d8
 */

void SSL_set_post_handshake_auth(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0xbac) = param_2;
  return;
}

