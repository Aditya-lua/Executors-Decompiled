/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a8fac
 */

undefined8 SSL_CTX_set_tlsext_ticket_key_evp_cb(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x248) = param_2;
  return 1;
}

