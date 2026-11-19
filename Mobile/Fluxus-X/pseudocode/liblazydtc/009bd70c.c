/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd70c
 */

undefined8 ssl_generate_session_id(SSL *param_1,long param_2)

{
  uchar *id;
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  size_t __n;
  code *pcVar4;
  uint local_34;
  
  iVar1 = param_1->version;
  if (iVar1 < 0xfefd) {
    if ((4 < iVar1 - 0x300U) && (iVar1 != 0x100)) goto LAB_009bd83c;
  }
  else if ((iVar1 != 0xfeff) && (iVar1 != 0xfefd)) {
LAB_009bd83c:
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x177,"ssl_generate_session_id");
    uVar2 = 0x103;
    goto LAB_009bd8f4;
  }
  *(undefined8 *)(param_2 + 0x250) = 0x20;
  if (*(int *)&param_1[3].next_proto_negotiated_len != 0) {
    *(undefined8 *)(param_2 + 0x250) = 0;
    return 1;
  }
  uVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)&param_1[10].next_proto_negotiated_len);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(*(long *)&param_1[4].mac_flags + 0x3c8));
  if (iVar1 == 0) {
    CRYPTO_THREAD_unlock(*(undefined8 *)&param_1[10].next_proto_negotiated_len);
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x195,"ssl_generate_session_id");
    uVar2 = 0x115;
  }
  else {
    pcVar4 = *(code **)(param_1[3].sid_ctx + 0x1c);
    if (pcVar4 == (code *)0x0) {
      pcVar3 = *(code **)(*(long *)&param_1[4].mac_flags + 0x1b0);
      pcVar4 = FUN_009bd920;
      if (pcVar3 != (code *)0x0) {
        pcVar4 = pcVar3;
      }
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)&param_1[4].mac_flags + 0x3c8));
    CRYPTO_THREAD_unlock(*(undefined8 *)&param_1[10].next_proto_negotiated_len);
    __n = *(size_t *)(param_2 + 0x250);
    id = (uchar *)(param_2 + 600);
    memset(id,0,__n);
    local_34 = (uint)__n;
    iVar1 = (*pcVar4)(param_1,id,&local_34);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x1a4,"ssl_generate_session_id");
      uVar2 = 0x12d;
    }
    else if ((local_34 == 0) || (*(ulong *)(param_2 + 0x250) < (ulong)local_34)) {
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x1ae,"ssl_generate_session_id");
      uVar2 = 0x12f;
    }
    else {
      *(ulong *)(param_2 + 0x250) = (ulong)local_34;
      iVar1 = SSL_has_matching_session_id(param_1,id,local_34);
      if (iVar1 == 0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x1b5,"ssl_generate_session_id");
      uVar2 = 0x12e;
    }
  }
LAB_009bd8f4:
  ossl_statem_fatal(param_1,0x50,uVar2,0);
  return 0;
}

