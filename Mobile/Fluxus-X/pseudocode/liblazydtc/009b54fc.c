/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b54fc
 */

long SSL_CTX_ctrl(SSL_CTX *ctx,int cmd,long larg,void *parg)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  uint uVar6;
  stack_st_SSL_CIPHER *psVar7;
  ssl_session_st *psVar8;
  void **ppvVar9;
  
  if (ctx == (SSL_CTX *)0x0) {
    if ((cmd == 0x66) || (cmd == 0x62)) {
      iVar4 = tls1_set_sigalgs_list(0,parg,0);
    }
    else {
      if (cmd != 0x5c) {
        return 0;
      }
      iVar4 = tls1_set_groups_list(0,0,0);
    }
    return (long)iVar4;
  }
  uVar6 = (uint)larg;
  switch(cmd) {
  case 0x10:
    *(void **)(ctx->sid_ctx + 0x18) = parg;
    psVar8 = (ssl_session_st *)0x1;
    break;
  default:
                    /* WARNING: Could not recover jumptable at 0x009b5590. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar5 = (*(code *)ctx->cipher_list[4].stack.data)();
    return lVar5;
  case 0x14:
    lVar5 = OPENSSL_LH_num_items(ctx->session_cache_head);
    return lVar5;
  case 0x15:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_accept_renegotiate;
    break;
  case 0x16:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_miss;
    break;
  case 0x17:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_accept_good;
    break;
  case 0x18:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_timeout;
    break;
  case 0x19:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_hit;
    break;
  case 0x1a:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_cache_full;
    break;
  case 0x1b:
    psVar8 = (ssl_session_st *)(long)*(int *)((long)&ctx->app_verify_callback + 4);
    break;
  case 0x1c:
    psVar8 = (ssl_session_st *)(long)*(int *)&ctx->app_verify_arg;
    break;
  case 0x1d:
    psVar8 = (ssl_session_st *)(long)(ctx->stats).sess_cb_hit;
    break;
  case 0x1e:
    psVar8 = (ssl_session_st *)(long)ctx->references;
    break;
  case 0x1f:
    psVar8 = (ssl_session_st *)(long)*(int *)&ctx->app_verify_callback;
    break;
  case 0x21:
    uVar6 = *(uint *)&ctx->msg_callback | uVar6;
    psVar8 = (ssl_session_st *)(ulong)uVar6;
    *(uint *)&ctx->msg_callback = uVar6;
    break;
  case 0x28:
    psVar8 = (ssl_session_st *)(long)*(int *)(ctx->sid_ctx + 8);
    break;
  case 0x29:
    psVar8 = (ssl_session_st *)(long)*(int *)(ctx->sid_ctx + 8);
    *(uint *)(ctx->sid_ctx + 8) = uVar6;
    break;
  case 0x2a:
    if (-1 < larg) {
      psVar8 = ctx->session_cache_tail;
      ctx->session_cache_tail = (ssl_session_st *)larg;
      return (long)psVar8;
    }
    goto LAB_009b58bc;
  case 0x2b:
    psVar8 = ctx->session_cache_tail;
    break;
  case 0x2c:
    psVar8 = (ssl_session_st *)(ulong)*(uint *)&ctx->new_session_cb;
    *(uint *)&ctx->new_session_cb = uVar6;
    break;
  case 0x2d:
    psVar8 = (ssl_session_st *)(ulong)*(uint *)&ctx->new_session_cb;
    break;
  case 0x32:
    psVar8 = *(ssl_session_st **)&ctx->verify_mode;
    break;
  case 0x33:
    if (-1 < larg) {
      ctx->verify_mode = (int)larg;
      ctx->sid_ctx_length = (int)((ulong)larg >> 0x20);
      lVar5._0_4_ = ctx->verify_mode;
      lVar5._4_4_ = ctx->sid_ctx_length;
      return lVar5;
    }
LAB_009b58bc:
    psVar8 = (ssl_session_st *)0x0;
    break;
  case 0x34:
    if (0x3e00 < larg - 0x200U) {
      return 0;
    }
    ctx->tlsext_status_cb = (_func_3099 *)larg;
    if (ctx->tlsext_ticket_key_cb <= (ulong)larg) {
      return 1;
    }
    goto LAB_009b5884;
  case 0x4e:
    uVar6 = *(uint *)&ctx->msg_callback & (uVar6 ^ 0xffffffff);
    psVar8 = (ssl_session_st *)(ulong)uVar6;
    *(uint *)&ctx->msg_callback = uVar6;
    break;
  case 99:
    uVar6 = *(uint *)(*(long *)ctx->sid_ctx + 0x1c) | uVar6;
    psVar8 = (ssl_session_st *)(ulong)uVar6;
    *(uint *)(*(long *)ctx->sid_ctx + 0x1c) = uVar6;
    break;
  case 100:
    uVar6 = *(uint *)(*(long *)ctx->sid_ctx + 0x1c) & (uVar6 ^ 0xffffffff);
    psVar8 = (ssl_session_st *)(ulong)uVar6;
    *(uint *)(*(long *)ctx->sid_ctx + 0x1c) = uVar6;
    break;
  case 0x7b:
    uVar3 = *(uint *)&ctx->msg_callback_arg;
    uVar1 = uVar6 & 0xffffff00;
    uVar2 = uVar3 & 0xffffff00;
    if ((((uVar3 != 0) && (uVar6 == 0x100 || uVar1 == 0xfe00)) && (uVar3 != 0x100)) &&
       (uVar2 != 0xfe00)) {
      return 0;
    }
    if ((uVar6 != 0) && ((uVar3 == 0x100 || uVar2 == 0xfe00) && (uVar6 != 0x100 && uVar1 != 0xfe00))
       ) {
      return 0;
    }
    if ((uVar6 != 0x100 && uVar1 != 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00)) {
      if (((uVar6 != 0) && ((int)uVar6 < 0x300)) && (uVar3 == 0 || 0x2ff < (int)uVar3)) {
        return 0;
      }
    }
    psVar7 = ctx->cipher_list;
    ppvVar9 = (void **)((long)&ctx->msg_callback + 4);
    goto LAB_009b5850;
  case 0x7c:
    uVar3 = *(uint *)((long)&ctx->msg_callback + 4);
    uVar1 = uVar6 & 0xffffff00;
    uVar2 = uVar3 & 0xffffff00;
    if ((((uVar6 != 0) && (uVar3 == 0x100 || uVar2 == 0xfe00)) && (uVar6 != 0x100)) &&
       (uVar1 != 0xfe00)) {
      return 0;
    }
    if ((uVar3 != 0) && ((uVar6 == 0x100 || uVar1 == 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00))
       ) {
      return 0;
    }
    if ((((uVar6 != 0x100 && uVar1 != 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00)) &&
        (0x2ff < (int)uVar6 || uVar6 == 0)) && ((uVar3 != 0 && ((int)uVar3 < 0x300)))) {
      return 0;
    }
    psVar7 = ctx->cipher_list;
    ppvVar9 = &ctx->msg_callback_arg;
LAB_009b5850:
    iVar4 = ssl_set_version_bound((psVar7->stack).num,larg & 0xffffffff,ppvVar9);
    psVar8 = (ssl_session_st *)(ulong)(iVar4 != 0);
    break;
  case 0x7d:
    if (ctx->tlsext_status_cb <= (_func_3099 *)(larg + -1)) {
      return 0;
    }
LAB_009b5884:
    ctx->tlsext_ticket_key_cb = (_func_3098 *)larg;
    psVar8 = (ssl_session_st *)0x1;
    break;
  case 0x7e:
    psVar8 = (ssl_session_st *)0x0;
    if (larg - 1U < 0x20) {
      ctx->tlsext_status_arg = (void *)larg;
      psVar8 = (ssl_session_st *)0x1;
    }
    break;
  case 0x82:
    psVar8 = (ssl_session_st *)(long)*(int *)((long)&ctx->msg_callback + 4);
    break;
  case 0x83:
    psVar8 = (ssl_session_st *)(long)*(int *)&ctx->msg_callback_arg;
  }
  return (long)psVar8;
}

