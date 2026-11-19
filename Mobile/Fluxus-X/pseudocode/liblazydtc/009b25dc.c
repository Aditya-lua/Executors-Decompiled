/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b25dc
 */

int SSL_CTX_set_generate_session_id(SSL_CTX *param_1,GEN_SESSION_CB param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1[1].sid_ctx + 0x10));
  if (iVar1 != 0) {
    uVar2 = *(undefined8 *)(param_1[1].sid_ctx + 0x10);
    *(GEN_SESSION_CB *)param_1->tlsext_tick_key_name = param_2;
    CRYPTO_THREAD_unlock(uVar2);
  }
  return (uint)(iVar1 != 0);
}

