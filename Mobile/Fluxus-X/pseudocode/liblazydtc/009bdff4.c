/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bdff4
 */

undefined8 ssl_get_prev_session(int *param_1,long param_2)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  time_t tVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  size_t __n;
  SSL_SESSION *local_28;
  
  local_28 = (SSL_SESSION *)0x0;
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar5 = **(int **)(param_1 + 2), 0x303 < iVar5)) && (iVar5 != 0x10000)) {
    param_1[0x2a6] = 1;
    iVar5 = tls_parse_extension(param_1,0x12,0x80,*(undefined8 *)(param_2 + 0x288),0,0);
    if ((iVar5 == 0) ||
       (iVar5 = tls_parse_extension(param_1,0x19,0x80,*(undefined8 *)(param_2 + 0x288),0,0),
       iVar5 == 0)) {
      return 0xffffffff;
    }
    local_28 = *(SSL_SESSION **)(param_1 + 0x246);
    bVar4 = false;
joined_r0x009be118:
    if (((local_28 != (SSL_SESSION *)0x0) && (local_28->ssl_version == *param_1)) &&
       ((__n = *(size_t *)(local_28[1].master_key + 0xc), __n == *(size_t *)(param_1 + 0x23c) &&
        (iVar5 = memcmp(local_28[1].master_key + 0x14,param_1 + 0x23e,__n), iVar5 == 0)))) {
      if ((__n == 0) && ((param_1[0x25a] & 1U) != 0)) {
        ERR_new();
        ERR_set_debug("ssl/ssl_sess.c",0x29a,"ssl_get_prev_session");
        uVar8 = 0x50;
        uVar9 = 0x115;
LAB_009be1f0:
        ossl_statem_fatal(param_1,uVar8,uVar9,0);
        goto LAB_009be0ec;
      }
      tVar7 = time((time_t *)0x0);
      if ((*(int *)(local_28[1].krb5_client_princ + 8) == 0) &&
         (*(long *)local_28[1].krb5_client_princ < tVar7)) {
        piVar1 = (int *)(*(long *)(param_1 + 0x2e2) + 0x94);
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = *piVar1 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (bVar4) {
          bVar4 = true;
          FUN_009be2fc(*(undefined8 *)(param_1 + 0x2e2),local_28,1);
        }
      }
      else {
        if ((local_28[1].krb5_client_princ[0xa0] & 1) != 0) {
          if (((uint)*(undefined8 *)(param_1 + 0x2a) >> 9 & 1) != 0) goto LAB_009be26c;
          ERR_new();
          ERR_set_debug("ssl/ssl_sess.c",0x2ac,"ssl_get_prev_session");
          uVar8 = 0x2f;
          uVar9 = 0x68;
          goto LAB_009be1f0;
        }
        if (((uint)*(undefined8 *)(param_1 + 0x2a) >> 9 & 1) == 0) {
LAB_009be26c:
          if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0) ||
              (iVar5 = **(int **)(param_1 + 2), iVar5 < 0x304)) || (iVar5 == 0x10000)) {
            SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x246));
            *(SSL_SESSION **)(param_1 + 0x246) = local_28;
          }
          piVar1 = (int *)(*(long *)(param_1 + 0x2e2) + 0x9c);
          do {
            cVar2 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar4) {
              *piVar1 = *piVar1 + 1;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          *(undefined8 *)(param_1 + 0x26e) = *(undefined8 *)(*(long *)(param_1 + 0x246) + 0x2c8);
          return 1;
        }
      }
    }
    uVar8 = 0;
  }
  else {
    uVar6 = tls_get_ticket_from_client(param_1,param_2,&local_28);
    if (uVar6 - 2 < 2) {
      if (*(long *)(param_2 + 0x28) == 0) goto LAB_009be120;
      local_28 = (SSL_SESSION *)lookup_sess_in_cache(param_1,param_2 + 0x30);
      bVar4 = true;
      goto joined_r0x009be118;
    }
    if (1 < uVar6) {
LAB_009be120:
      bVar4 = false;
      goto joined_r0x009be118;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x26b,"ssl_get_prev_session");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    bVar4 = false;
LAB_009be0ec:
    uVar8 = 0xffffffff;
  }
  if (local_28 != (SSL_SESSION *)0x0) {
    SSL_SESSION_free(local_28);
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar5 = **(int **)(param_1 + 2), 0x303 < iVar5)) && (iVar5 != 0x10000)) {
      param_1[0x246] = 0;
      param_1[0x247] = 0;
    }
    if (!bVar4) {
      param_1[0x2a6] = 1;
    }
  }
  return uVar8;
}

