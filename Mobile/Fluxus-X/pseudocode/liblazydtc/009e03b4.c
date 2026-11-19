/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e03b4
 */

ulong tls_prepare_client_certificate(SSL *param_1,int param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  uint uVar4;
  code *pcVar5;
  long lVar6;
  EVP_PKEY *local_30;
  X509 *local_28;
  
  local_30 = (EVP_PKEY *)0x0;
  local_28 = (X509 *)0x0;
  if (param_2 != 4) {
    if (param_2 != 3) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xdaa,"tls_prepare_client_certificate");
      uVar3 = 0xc0103;
LAB_009e04a8:
      ossl_statem_fatal(param_1,0x50,uVar3,0);
      return 0;
    }
    pcVar5 = *(code **)((param_1[3].d1)->rcvd_cookie + 0xb4);
    if (pcVar5 != (code *)0x0) {
      iVar1 = (*pcVar5)(param_1,*(undefined8 *)((param_1[3].d1)->rcvd_cookie + 0xbc));
      if (iVar1 < 0) {
        param_1->rwstate = 4;
        return 3;
      }
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xd6e,"tls_prepare_client_certificate");
        uVar3 = 0xea;
        goto LAB_009e04a8;
      }
      param_1->rwstate = 1;
    }
    iVar1 = tls_choose_sigalg(param_1,0);
    if (((iVar1 != 0) && (param_1[1].enc_read_ctx != (EVP_CIPHER_CTX *)0x0)) &&
       (((*(uint *)((param_1[3].d1)->cookie + 0x18) & 0x30001) == 0 ||
        (iVar1 = tls1_check_chain(param_1,0,0,0,0xfffffffe), iVar1 != 0)))) goto LAB_009e0614;
  }
  lVar6 = *(long *)&param_1[3].ex_data.dummy;
  if (*(long *)(lVar6 + 0x200) == 0) {
LAB_009e04c0:
    if (*(code **)(lVar6 + 200) != (code *)0x0) {
      iVar1 = (**(code **)(lVar6 + 200))(param_1,&local_28,&local_30);
      goto joined_r0x009e04e0;
    }
    iVar1 = 0;
  }
  else {
    iVar1 = tls_engine_load_ssl_client_cert(param_1,&local_28,&local_30);
    if (iVar1 == 0) {
      lVar6 = *(long *)&param_1[3].ex_data.dummy;
      goto LAB_009e04c0;
    }
joined_r0x009e04e0:
    if (iVar1 < 0) {
      param_1->rwstate = 4;
      return 4;
    }
  }
  param_1->rwstate = 1;
  if (((iVar1 == 1) && (local_30 != (EVP_PKEY *)0x0)) && (local_28 != (X509 *)0x0)) {
    iVar1 = SSL_use_certificate(param_1,local_28);
    if ((iVar1 == 0) || (iVar1 = SSL_use_PrivateKey(param_1,local_30), iVar1 == 0)) {
LAB_009e0570:
      iVar1 = 0;
    }
    else {
      iVar1 = 1;
    }
  }
  else if (iVar1 == 1) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xd8f,"tls_prepare_client_certificate");
    ERR_set_error(0x14,0x6a,0);
    goto LAB_009e0570;
  }
  X509_free(local_28);
  EVP_PKEY_free(local_30);
  if (((iVar1 == 0) || (iVar1 = tls_choose_sigalg(param_1,0), iVar1 == 0)) ||
     ((param_1[1].enc_read_ctx == (EVP_CIPHER_CTX *)0x0 ||
      (((*(uint *)((param_1[3].d1)->cookie + 0x18) & 0x30001) != 0 &&
       (iVar1 = tls1_check_chain(param_1,0,0,0,0xfffffffe), iVar1 == 0)))))) {
    if (param_1->version == 0x300) {
      param_1[1].quiet_shutdown = 0;
      ssl3_send_alert(param_1,1,0x29);
      return 2;
    }
    param_1[1].quiet_shutdown = 2;
    uVar2 = ssl3_digest_cached_records(param_1,0);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
LAB_009e0614:
  uVar4 = 1;
  if (*(int *)&param_1[4].enc_write_ctx != 4) {
    uVar4 = 2;
  }
  return (ulong)uVar4;
}

