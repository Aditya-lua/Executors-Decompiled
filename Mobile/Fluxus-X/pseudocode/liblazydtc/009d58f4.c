/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d58f4
 */

undefined8 tls_parse_stoc_psk(long param_1,long *param_2)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  long lVar4;
  SSL_SESSION *ses;
  undefined8 uVar5;
  undefined8 uVar6;
  SSL_SESSION *ses_00;
  undefined1 *puVar7;
  
  if (1 < (ulong)param_2[1]) {
    puVar7 = (undefined1 *)*param_2;
    lVar4 = param_2[1] - 2;
    uVar2 = *puVar7;
    uVar3 = puVar7[1];
    *param_2 = (long)(puVar7 + 2);
    param_2[1] = lVar4;
    if (lVar4 == 0) {
      uVar1 = (uint)CONCAT11(uVar2,uVar3);
      if (uVar1 < *(uint *)(param_1 + 0xb50)) {
        ses = *(SSL_SESSION **)(param_1 + 0x920);
        if (uVar1 == 0) {
          if ((*(uint *)(param_1 + 0xb50) == 2) || (ses == (SSL_SESSION *)0x0)) {
            *(undefined4 *)(param_1 + 0x4d0) = 1;
            SSL_SESSION_free(ses);
            *(undefined8 *)(param_1 + 0x920) = 0;
            return 1;
          }
        }
        else if (ses == (SSL_SESSION *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_clnt.c",0x7a6,"tls_parse_stoc_psk");
          uVar5 = 0x50;
          uVar6 = 0xc0103;
          goto LAB_009d5954;
        }
        if ((*(uint *)(param_1 + 0x84) | 4) == 7) {
          ses_00 = *(SSL_SESSION **)(param_1 + 0x918);
          if ((*(int *)(ses_00[1].krb5_client_princ + 0x6c) == 0) &&
             (*(int *)(ses[1].krb5_client_princ + 0x6c) != 0)) goto LAB_009d5a6c;
        }
        else {
          ses_00 = *(SSL_SESSION **)(param_1 + 0x918);
        }
        uVar5 = *(undefined8 *)(ses->master_key + 0x2c);
        *(undefined8 *)(param_1 + 0x57c) = *(undefined8 *)ses->session_id;
        *(undefined8 *)(param_1 + 0x574) = uVar5;
        uVar5 = *(undefined8 *)(ses->master_key + 0x1c);
        *(undefined8 *)(param_1 + 0x56c) = *(undefined8 *)(ses->master_key + 0x24);
        *(undefined8 *)(param_1 + 0x564) = uVar5;
        uVar5 = *(undefined8 *)(ses->master_key + 0xc);
        *(undefined8 *)(param_1 + 0x55c) = *(undefined8 *)(ses->master_key + 0x14);
        *(undefined8 *)(param_1 + 0x554) = uVar5;
        uVar5 = *(undefined8 *)&ses->master_key_length;
        *(undefined8 *)(param_1 + 0x54c) = *(undefined8 *)(ses->master_key + 4);
        *(undefined8 *)(param_1 + 0x544) = uVar5;
LAB_009d5a6c:
        SSL_SESSION_free(ses_00);
        *(undefined8 *)(param_1 + 0x918) = *(undefined8 *)(param_1 + 0x920);
        *(undefined8 *)(param_1 + 0x920) = 0;
        *(undefined4 *)(param_1 + 0x4d0) = 1;
        if (uVar1 == 0) {
          return 1;
        }
        *(undefined4 *)(param_1 + 0xb34) = 0;
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x794,"tls_parse_stoc_psk");
      uVar5 = 0x2f;
      uVar6 = 0x72;
      goto LAB_009d5954;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_clnt.c",0x78f,"tls_parse_stoc_psk");
  uVar5 = 0x32;
  uVar6 = 0x9f;
LAB_009d5954:
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

