/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf1c8
 */

SSL_SESSION * d2i_SSL_SESSION(SSL_SESSION **a,uchar **pp,long length)

{
  int iVar1;
  ASN1_VALUE *val;
  long lVar2;
  void *pvVar3;
  undefined8 uVar4;
  uint uVar5;
  undefined1 *puVar6;
  uchar *puVar7;
  SSL_SESSION *ses;
  uint *puVar8;
  int *piVar9;
  uchar *local_38;
  
  local_38 = *pp;
  val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_38,length,(ASN1_ITEM *)&DAT_00c573d8);
  if (val == (ASN1_VALUE *)0x0) {
    ses = (SSL_SESSION *)0x0;
    goto LAB_009bf33c;
  }
  if (((a == (SSL_SESSION **)0x0) || (ses = *a, ses == (SSL_SESSION *)0x0)) &&
     (ses = SSL_SESSION_new(), ses == (SSL_SESSION *)0x0)) goto LAB_009bf33c;
  if (*(int *)val == 1) {
    iVar1 = *(int *)(val + 4);
    if (((iVar1 >> 8 == 3) || (iVar1 >> 8 == 0xfe)) || (iVar1 == 0x100)) {
      ses->ssl_version = iVar1;
      *(undefined4 *)(ses[1].krb5_client_princ + 0x20) = *(undefined4 *)(val + 0xb8);
      if (**(int **)(val + 8) == 2) {
        puVar6 = *(undefined1 **)(*(int **)(val + 8) + 2);
        *(ulong *)(ses[1].krb5_client_princ + 0x18) = (ulong)CONCAT11(*puVar6,puVar6[1]) | 0x3000000
        ;
        lVar2 = ssl3_get_cipher_by_id();
        *(long *)(ses[1].krb5_client_princ + 0x10) = lVar2;
        if (lVar2 == 0) goto LAB_009bf33c;
        puVar8 = *(uint **)(val + 0x20);
        if (puVar8 == (uint *)0x0) {
LAB_009bf380:
          lVar2 = 0;
        }
        else {
          uVar5 = *puVar8;
          if (uVar5 == 0) goto LAB_009bf380;
          if (0x20 < uVar5) goto LAB_009bf33c;
          memcpy(ses + 1,*(void **)(puVar8 + 2),(long)(int)uVar5);
          lVar2 = (long)(int)*puVar8;
        }
        ses->tlsext_tick_lifetime_hint = lVar2;
        puVar8 = *(uint **)(val + 0x18);
        if (puVar8 == (uint *)0x0) {
LAB_009bf3b4:
          lVar2 = 0;
        }
        else {
          uVar5 = *puVar8;
          if (uVar5 == 0) goto LAB_009bf3b4;
          if (0x200 < uVar5) goto LAB_009bf33c;
          memcpy(ses->session_id + 8,*(void **)(puVar8 + 2),(long)(int)uVar5);
          lVar2 = (long)(int)*puVar8;
        }
        *(long *)ses->key_arg = lVar2;
        lVar2 = *(long *)(val + 0x30);
        if (lVar2 == 0) {
          lVar2 = time((time_t *)0x0);
        }
        *(long *)(ses[1].sid_ctx + 0x1c) = lVar2;
        lVar2 = 3;
        if (*(long *)(val + 0x38) != 0) {
          lVar2 = *(long *)(val + 0x38);
        }
        *(long *)(ses[1].sid_ctx + 0x14) = lVar2;
        ssl_session_calculate_timeout(ses);
        X509_free(*(X509 **)(ses[1].session_id + 0x18));
        *(undefined8 *)(ses[1].session_id + 0x18) = *(undefined8 *)(val + 0x40);
        puVar8 = *(uint **)(val + 0x48);
        *(undefined8 *)(val + 0x40) = 0;
        if (puVar8 == (uint *)0x0) {
LAB_009bf428:
          lVar2 = 0;
        }
        else {
          uVar5 = *puVar8;
          if (uVar5 == 0) goto LAB_009bf428;
          if (0x20 < uVar5) goto LAB_009bf33c;
          memcpy(ses[1].master_key + 0x14,*(void **)(puVar8 + 2),(long)(int)uVar5);
          lVar2 = (long)(int)*puVar8;
        }
        *(long *)(ses[1].master_key + 0xc) = lVar2;
        pvVar3 = *(void **)(ses[1].krb5_client_princ + 0x48);
        *(long *)(ses[1].sid_ctx + 4) = (long)*(int *)(val + 0x50);
        piVar9 = *(int **)(val + 0x58);
        CRYPTO_free(pvVar3);
        ses[1].krb5_client_princ[0x48] = '\0';
        ses[1].krb5_client_princ[0x49] = '\0';
        ses[1].krb5_client_princ[0x4a] = '\0';
        ses[1].krb5_client_princ[0x4b] = '\0';
        ses[1].krb5_client_princ[0x4c] = '\0';
        ses[1].krb5_client_princ[0x4d] = '\0';
        ses[1].krb5_client_princ[0x4e] = '\0';
        ses[1].krb5_client_princ[0x4f] = '\0';
        if (piVar9 != (int *)0x0) {
          lVar2 = CRYPTO_strndup(*(undefined8 *)(piVar9 + 2),(long)*piVar9,"ssl/ssl_asn1.c",0xdd);
          *(long *)(ses[1].krb5_client_princ + 0x48) = lVar2;
          if (lVar2 == 0) goto LAB_009bf33c;
        }
        piVar9 = *(int **)(val + 0x78);
        CRYPTO_free(*(void **)ses[1].session_id);
        ses[1].session_id[0] = '\0';
        ses[1].session_id[1] = '\0';
        ses[1].session_id[2] = '\0';
        ses[1].session_id[3] = '\0';
        ses[1].session_id[4] = '\0';
        ses[1].session_id[5] = '\0';
        ses[1].session_id[6] = '\0';
        ses[1].session_id[7] = '\0';
        if (piVar9 != (int *)0x0) {
          lVar2 = CRYPTO_strndup(*(undefined8 *)(piVar9 + 2),(long)*piVar9,"ssl/ssl_asn1.c",0xdd);
          *(long *)ses[1].session_id = lVar2;
          if (lVar2 == 0) goto LAB_009bf33c;
        }
        piVar9 = *(int **)(val + 0x80);
        CRYPTO_free(*(void **)(ses[1].session_id + 8));
        ses[1].session_id[8] = '\0';
        ses[1].session_id[9] = '\0';
        ses[1].session_id[10] = '\0';
        ses[1].session_id[0xb] = '\0';
        ses[1].session_id[0xc] = '\0';
        ses[1].session_id[0xd] = '\0';
        ses[1].session_id[0xe] = '\0';
        ses[1].session_id[0xf] = '\0';
        if (piVar9 != (int *)0x0) {
          lVar2 = CRYPTO_strndup(*(undefined8 *)(piVar9 + 2),(long)*piVar9,"ssl/ssl_asn1.c",0xdd);
          *(long *)(ses[1].session_id + 8) = lVar2;
          if (lVar2 == 0) goto LAB_009bf33c;
        }
        pvVar3 = *(void **)(ses[1].krb5_client_princ + 0x50);
        *(undefined8 *)(ses[1].krb5_client_princ + 0x60) = *(undefined8 *)(val + 0x60);
        *(undefined4 *)(ses[1].krb5_client_princ + 0x68) = *(undefined4 *)(val + 0x68);
        CRYPTO_free(pvVar3);
        piVar9 = *(int **)(val + 0x70);
        if (piVar9 == (int *)0x0) {
          puVar7 = ses[1].krb5_client_princ + 0x50;
        }
        else {
          puVar7 = (uchar *)(piVar9 + 2);
          *(undefined8 *)(ses[1].krb5_client_princ + 0x50) = *(undefined8 *)puVar7;
          *(long *)(ses[1].krb5_client_princ + 0x58) = (long)*piVar9;
        }
        puVar7[0] = '\0';
        puVar7[1] = '\0';
        puVar7[2] = '\0';
        puVar7[3] = '\0';
        puVar7[4] = '\0';
        puVar7[5] = '\0';
        puVar7[6] = '\0';
        puVar7[7] = '\0';
        piVar9 = *(int **)(val + 0x10);
        uVar5 = 0;
        if (piVar9 != (int *)0x0) {
          if (*piVar9 != 1) {
            ERR_new();
            ERR_set_debug("ssl/ssl_asn1.c",0x15d,"d2i_SSL_SESSION");
            uVar4 = 0x10f;
            goto LAB_009bf334;
          }
          uVar5 = (uint)**(byte **)(piVar9 + 2);
        }
        *(uint *)(ses[1].krb5_client_princ + 0xc) = uVar5;
        piVar9 = *(int **)(val + 0x88);
        CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x88));
        ses[1].krb5_client_princ[0x88] = '\0';
        ses[1].krb5_client_princ[0x89] = '\0';
        ses[1].krb5_client_princ[0x8a] = '\0';
        ses[1].krb5_client_princ[0x8b] = '\0';
        ses[1].krb5_client_princ[0x8c] = '\0';
        ses[1].krb5_client_princ[0x8d] = '\0';
        ses[1].krb5_client_princ[0x8e] = '\0';
        ses[1].krb5_client_princ[0x8f] = '\0';
        if (piVar9 == (int *)0x0) {
LAB_009bf5a4:
          pvVar3 = *(void **)(ses[1].krb5_client_princ + 0x70);
          *(int *)(ses[1].krb5_client_princ + 0xa0) = (int)*(undefined8 *)(val + 0x90);
          *(undefined4 *)(ses[1].krb5_client_princ + 0x6c) = *(undefined4 *)(val + 0x98);
          CRYPTO_free(pvVar3);
          piVar9 = *(int **)(val + 0xa0);
          lVar2 = 0;
          puVar7 = ses[1].krb5_client_princ + 0x70;
          if (piVar9 != (int *)0x0) {
            puVar7 = (uchar *)(piVar9 + 2);
            *(undefined8 *)(ses[1].krb5_client_princ + 0x70) = *(undefined8 *)puVar7;
            lVar2 = (long)*piVar9;
          }
          puVar7[0] = '\0';
          puVar7[1] = '\0';
          puVar7[2] = '\0';
          puVar7[3] = '\0';
          puVar7[4] = '\0';
          puVar7[5] = '\0';
          puVar7[6] = '\0';
          puVar7[7] = '\0';
          *(long *)(ses[1].krb5_client_princ + 0x78) = lVar2;
          pvVar3 = *(void **)(ses[1].krb5_client_princ + 0x90);
          ses[1].krb5_client_princ[0x80] = (uchar)*(undefined4 *)(val + 0xa8);
          CRYPTO_free(pvVar3);
          piVar9 = *(int **)(val + 0xb0);
          lVar2 = 0;
          puVar7 = ses[1].krb5_client_princ + 0x90;
          if (piVar9 != (int *)0x0) {
            puVar7 = (uchar *)(piVar9 + 2);
            *(undefined8 *)(ses[1].krb5_client_princ + 0x90) = *(undefined8 *)puVar7;
            lVar2 = (long)*piVar9;
          }
          puVar7[0] = '\0';
          puVar7[1] = '\0';
          puVar7[2] = '\0';
          puVar7[3] = '\0';
          puVar7[4] = '\0';
          puVar7[5] = '\0';
          puVar7[6] = '\0';
          puVar7[7] = '\0';
          *(long *)(ses[1].krb5_client_princ + 0x98) = lVar2;
          ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c573d8);
          if ((a != (SSL_SESSION **)0x0) && (*a == (SSL_SESSION *)0x0)) {
            *a = ses;
          }
          *pp = local_38;
          return ses;
        }
        lVar2 = CRYPTO_strndup(*(undefined8 *)(piVar9 + 2),(long)*piVar9,"ssl/ssl_asn1.c",0xdd);
        *(long *)(ses[1].krb5_client_princ + 0x88) = lVar2;
        if (lVar2 != 0) goto LAB_009bf5a4;
        goto LAB_009bf33c;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_asn1.c",0x11a,"d2i_SSL_SESSION");
      uVar4 = 0x89;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_asn1.c",0x111,"d2i_SSL_SESSION");
      uVar4 = 0x103;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_asn1.c",0x10a,"d2i_SSL_SESSION");
    uVar4 = 0xfe;
  }
LAB_009bf334:
  ERR_set_error(0x14,uVar4,0);
LAB_009bf33c:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c573d8);
  if ((a == (SSL_SESSION **)0x0) || (*a != ses)) {
    SSL_SESSION_free(ses);
  }
  return (SSL_SESSION *)0x0;
}

