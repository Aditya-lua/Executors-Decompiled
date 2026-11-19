/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2618
 */

int SSL_set_generate_session_id(SSL *param_1,GEN_SESSION_CB param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)&param_1[10].next_proto_negotiated_len);
  if (iVar1 != 0) {
    uVar2 = *(undefined8 *)&param_1[10].next_proto_negotiated_len;
    *(GEN_SESSION_CB *)(param_1[3].sid_ctx + 0x1c) = param_2;
    CRYPTO_THREAD_unlock(uVar2);
  }
  return (uint)(iVar1 != 0);
}

