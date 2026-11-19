/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6ac4
 */

void ssl_update_cache(long param_1,uint param_2)

{
  uint uVar1;
  int iVar2;
  SSL_CTX *pSVar3;
  time_t tm;
  SSL_SESSION *c;
  long lVar4;
  
  c = *(SSL_SESSION **)(param_1 + 0x918);
  if ((c->tlsext_tick_lifetime_hint != 0) && (*(int *)(c[1].session_id + 0x10) == 0)) {
    if ((*(int *)(param_1 + 0x38) == 0) ||
       ((*(long *)(c[1].master_key + 0xc) != 0 || ((*(byte *)(param_1 + 0x968) & 1) == 0)))) {
      pSVar3 = *(SSL_CTX **)(param_1 + 0xb88);
      uVar1 = *(uint *)&pSVar3->new_session_cb;
      if (((uVar1 & param_2) != 0) &&
         ((*(int *)(param_1 + 0x4d0) == 0 ||
          ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0 &&
            (iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2)) && (iVar2 != 0x10000)))))) {
        if (((uVar1 >> 9 & 1) == 0) &&
           ((((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0 ||
               (*(int *)(param_1 + 0x38) == 0)) ||
              ((iVar2 = **(int **)(param_1 + 8), iVar2 < 0x304 || (iVar2 == 0x10000)))) ||
             ((*(int *)(param_1 + 0x1d40) != 0 && ((*(byte *)(param_1 + 0x9eb) & 1) == 0)))) ||
            ((lVar4._0_4_ = (pSVar3->stats).sess_connect,
             lVar4._4_4_ = (pSVar3->stats).sess_connect_renegotiate, lVar4 != 0 ||
             ((*(byte *)(param_1 + 0x9e9) >> 6 & 1) != 0)))))) {
          SSL_CTX_add_session(pSVar3,c);
          pSVar3 = *(SSL_CTX **)(param_1 + 0xb88);
        }
        if (pSVar3->get_session_cb != (_func_3089 *)0x0) {
          SSL_SESSION_up_ref(*(undefined8 *)(param_1 + 0x918));
          iVar2 = (**(code **)(*(long *)(param_1 + 0xb88) + 0x60))
                            (param_1,*(undefined8 *)(param_1 + 0x918));
          if (iVar2 == 0) {
            SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x918));
          }
        }
      }
      if (((uVar1 >> 7 & 1) == 0) && ((uVar1 & param_2) == param_2)) {
        pSVar3 = *(SSL_CTX **)(param_1 + 0xb88);
        lVar4 = 0x8c;
        if ((param_2 & 1) != 0) {
          lVar4 = 0x80;
        }
        if ((~*(uint *)(pSVar3->sid_ctx + lVar4 + -0x158) & 0xff) == 0) {
          tm = time((time_t *)0x0);
          SSL_CTX_flush_sessions(pSVar3,tm);
          return;
        }
      }
    }
  }
  return;
}

