/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dfb04
 */

undefined8 tls_process_new_session_ticket(long param_1,long *param_2)

{
  uint num;
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  int iVar7;
  int iVar8;
  long lVar9;
  time_t tVar10;
  void *__dest;
  undefined8 uVar11;
  undefined8 uVar12;
  byte *pbVar13;
  int *piVar14;
  undefined1 *puVar15;
  byte *pbVar16;
  ulong uVar17;
  ulong uVar18;
  long *plVar19;
  uint uVar20;
  EVP_MD *type;
  ulong uVar21;
  undefined1 *local_78;
  ulong uStack_70;
  void *local_68;
  
  local_68 = (void *)0x0;
  uVar17 = param_2[1];
  uVar21 = uVar17 - 4;
  if (uVar17 < 4) {
LAB_009dfc60:
    ERR_new();
    uVar11 = 0x9a8;
LAB_009dfc78:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar11,"tls_process_new_session_ticket");
    uVar11 = 0x32;
    uVar12 = 0x9f;
LAB_009dfc84:
    ossl_statem_fatal(param_1,uVar11,uVar12,0);
  }
  else {
    pbVar16 = (byte *)*param_2;
    pbVar13 = pbVar16 + 4;
    bVar1 = *pbVar16;
    bVar2 = pbVar16[1];
    bVar3 = pbVar16[2];
    bVar4 = pbVar16[3];
    *param_2 = (long)pbVar13;
    param_2[1] = uVar21;
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar7 = **(int **)(param_1 + 8), 0x303 < iVar7)) && (iVar7 != 0x10000)) {
      if (3 < uVar21) {
        uVar20 = *(uint *)(pbVar16 + 4);
        *param_2 = (long)(pbVar16 + 8);
        param_2[1] = uVar17 - 8;
        if (uVar17 - 8 != 0) {
          uVar18 = (ulong)pbVar16[8];
          uVar21 = (uVar17 - 9) - uVar18;
          if (uVar18 <= uVar17 - 9) {
            pbVar16 = pbVar16 + 9;
            uVar20 = (uVar20 & 0xff00ff00) >> 8 | (uVar20 & 0xff00ff) << 8;
            uVar20 = uVar20 >> 0x10 | uVar20 << 0x10;
            pbVar13 = pbVar16 + uVar18;
            *param_2 = (long)pbVar13;
            param_2[1] = uVar21;
            uVar17 = uVar21 - 2;
            if (1 < uVar21) goto LAB_009dfbe4;
          }
        }
      }
      goto LAB_009dfc60;
    }
    uVar20 = 0;
    uVar18 = 0;
    pbVar16 = (byte *)0x0;
    uVar17 = uVar17 - 6;
    if (uVar21 < 2) goto LAB_009dfc60;
LAB_009dfbe4:
    bVar5 = *pbVar13;
    bVar6 = pbVar13[1];
    *param_2 = (long)(pbVar13 + 2);
    param_2[1] = uVar17;
    piVar14 = *(int **)(param_1 + 8);
    num = (uint)CONCAT11(bVar5,bVar6);
    uVar21 = (ulong)num;
    if ((((*(uint *)(*(long *)(piVar14 + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar7 = *piVar14, 0x303 < iVar7)) && (iVar7 != 0x10000)) {
      if ((num == 0) || (uVar17 < uVar21)) goto LAB_009dfc60;
LAB_009dfc40:
      if ((iVar7 < 0x304) || (iVar7 == 0x10000)) goto LAB_009dfcd8;
      lVar9 = *(long *)(param_1 + 0x918);
LAB_009dfcec:
      plVar19 = (long *)(param_1 + 0x918);
      lVar9 = ssl_session_dup(lVar9,0);
      if (lVar9 != 0) {
        if ((((ulong)(*(SSL_CTX **)(param_1 + 0xb88))->new_session_cb & 1) != 0) &&
           ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0 ||
             (iVar7 = **(int **)(param_1 + 8), iVar7 < 0x304)) || (iVar7 == 0x10000)))) {
          SSL_CTX_remove_session(*(SSL_CTX **)(param_1 + 0xb88),(SSL_SESSION *)*plVar19);
        }
        SSL_SESSION_free((SSL_SESSION *)*plVar19);
        *plVar19 = lVar9;
        goto LAB_009dfd40;
      }
      ERR_new();
      uVar11 = 0x9c4;
LAB_009dfdf8:
      ERR_set_debug("ssl/statem/statem_clnt.c",uVar11,"tls_process_new_session_ticket");
      uVar11 = 0x50;
      uVar12 = 0xc0100;
      goto LAB_009dfc84;
    }
    if (uVar17 != uVar21) goto LAB_009dfc60;
    if (num == 0) {
      return 3;
    }
    if ((*(uint *)(*(long *)(piVar14 + 0x30) + 0x60) >> 3 & 1) == 0) {
      iVar7 = *piVar14;
      goto LAB_009dfc40;
    }
LAB_009dfcd8:
    lVar9 = *(long *)(param_1 + 0x918);
    if (*(long *)(lVar9 + 0x250) != 0) goto LAB_009dfcec;
LAB_009dfd40:
    plVar19 = (long *)(param_1 + 0x918);
    tVar10 = time((time_t *)0x0);
    lVar9 = *plVar19;
    *(time_t *)(lVar9 + 0x2e0) = tVar10;
    ssl_session_calculate_timeout(lVar9);
    CRYPTO_free(*(void **)(*plVar19 + 0x338));
    lVar9 = *plVar19;
    *(undefined8 *)(lVar9 + 0x340) = 0;
    *(undefined8 *)(lVar9 + 0x338) = 0;
    __dest = CRYPTO_malloc(num,"ssl/statem/statem_clnt.c",0x9dd);
    *(void **)(*plVar19 + 0x338) = __dest;
    if (__dest == (void *)0x0) {
      ERR_new();
      uVar11 = 0x9df;
      goto LAB_009dfdf8;
    }
    if ((ulong)param_2[1] < uVar21) {
      ERR_new();
      uVar11 = 0x9e3;
      goto LAB_009dfc78;
    }
    memcpy(__dest,(void *)*param_2,uVar21);
    *param_2 = *param_2 + uVar21;
    param_2[1] = param_2[1] - uVar21;
    lVar9 = *(long *)(param_1 + 0x918);
    *(ulong *)(lVar9 + 0x348) =
         (ulong)bVar1 << 0x18 | (ulong)bVar2 << 0x10 | (ulong)bVar3 << 8 | (ulong)bVar4;
    *(uint *)(lVar9 + 0x350) = uVar20;
    *(ulong *)(lVar9 + 0x340) = uVar21;
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
        (iVar7 = **(int **)(param_1 + 8), iVar7 < 0x304)) || (iVar7 == 0x10000)) {
LAB_009dfee0:
      type = (EVP_MD *)
             EVP_MD_fetch(**(undefined8 **)(param_1 + 0x9a8),"SHA2-256",
                          (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
      if (type == (EVP_MD *)0x0) {
        ossl_statem_send_fatal(param_1,0x50);
        goto LAB_009dfc94;
      }
      iVar7 = EVP_Digest(*(void **)(*plVar19 + 0x338),uVar21,(uchar *)(*plVar19 + 600),
                         (uint *)&local_78,type,(ENGINE *)0x0);
      if (iVar7 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xa17,"tls_process_new_session_ticket");
        ossl_statem_fatal(param_1,0x50,0x80006,0);
        goto LAB_009dfc94;
      }
      EVP_MD_free(type);
      lVar9 = *(long *)(param_1 + 0x918);
      *(ulong *)(lVar9 + 0x250) = (ulong)local_78 & 0xffffffff;
      *(undefined4 *)(lVar9 + 0x2b0) = 0;
      if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) {
        return 3;
      }
      iVar7 = **(int **)(param_1 + 8);
      if (iVar7 < 0x304) {
        return 3;
      }
      if (iVar7 == 0x10000) {
        return 3;
      }
      uVar11 = ssl_handshake_md(param_1);
      iVar7 = EVP_MD_get_size();
      if (-1 < iVar7) {
        iVar8 = tls13_hkdf_expand(param_1,uVar11,param_1 + 0x604,"resumption",10,pbVar16,uVar18,
                                  *(long *)(param_1 + 0x918) + 0x50,(long)iVar7,1);
        if (iVar8 != 0) {
          *(long *)(*(long *)(param_1 + 0x918) + 8) = (long)iVar7;
          CRYPTO_free(local_68);
          ssl_update_cache(param_1,1);
          return 1;
        }
        goto LAB_009dfc90;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xa28,"tls_process_new_session_ticket");
      uVar12 = 0xc0103;
      uVar11 = 0x50;
      goto LAB_009dfc84;
    }
    if ((ulong)param_2[1] < 2) {
LAB_009dfffc:
      ERR_new();
      uVar11 = 0x9f0;
      goto LAB_009dfc78;
    }
    puVar15 = (undefined1 *)*param_2;
    uVar17 = (ulong)CONCAT11(*puVar15,puVar15[1]);
    if (param_2[1] - 2U != uVar17) goto LAB_009dfffc;
    local_78 = puVar15 + 2;
    *param_2 = (long)(local_78 + uVar17);
    param_2[1] = 0;
    uStack_70 = uVar17;
    iVar7 = tls_collect_extensions(param_1,&local_78,0x2000,&local_68,0,1);
    if ((iVar7 != 0) &&
       (iVar7 = tls_parse_all_extensions(param_1,0x2000,local_68,0,0,1), iVar7 != 0))
    goto LAB_009dfee0;
  }
LAB_009dfc90:
  type = (EVP_MD *)0x0;
LAB_009dfc94:
  EVP_MD_free(type);
  CRYPTO_free(local_68);
  return 0;
}

