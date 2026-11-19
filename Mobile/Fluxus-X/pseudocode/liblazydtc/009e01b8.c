/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e01b8
 */

undefined8 tls_post_process_server_certificate(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  EVP_PKEY *pkey;
  long lVar4;
  undefined1 auStack_28 [8];
  
  if (*(int *)(param_1 + 0x28) == 8) {
    *(undefined4 *)(param_1 + 0x28) = 1;
  }
  iVar1 = ssl_verify_cert_chain(param_1,*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2c0));
  if (iVar1 < 1) {
    if (*(int *)(param_1 + 0x968) != 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x762,"tls_post_process_server_certificate");
      uVar2 = ssl_x509err2alert(*(undefined4 *)(param_1 + 0x9b8));
      uVar3 = 0x86;
      goto LAB_009e0294;
    }
  }
  else if (*(int *)(param_1 + 0x28) == 8) {
    return 3;
  }
  ERR_clear_error();
  uVar3 = OPENSSL_sk_value(*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2c0),0);
  pkey = (EVP_PKEY *)X509_get0_pubkey();
  if ((pkey == (EVP_PKEY *)0x0) || (iVar1 = EVP_PKEY_missing_parameters(pkey), iVar1 != 0)) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x771,"tls_post_process_server_certificate");
    uVar2 = 0x50;
    uVar3 = 0xef;
  }
  else {
    lVar4 = ssl_cert_lookup_by_pkey(pkey,auStack_28);
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x776,"tls_post_process_server_certificate");
      uVar2 = 0x2f;
      uVar3 = 0xf7;
    }
    else {
      if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
           (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) ||
         ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & *(uint *)(lVar4 + 4)) != 0)) {
        X509_free(*(X509 **)(*(long *)(param_1 + 0x918) + 0x2b8));
        X509_up_ref(uVar3);
        lVar4 = *(long *)(param_1 + 0x918);
        *(undefined8 *)(lVar4 + 0x2b8) = uVar3;
        *(undefined8 *)(lVar4 + 0x2c8) = *(undefined8 *)(param_1 + 0x9b8);
        if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
            (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) &&
           ((iVar1 != 0x10000 &&
            (uVar3 = ssl_handshake_hash(param_1,param_1 + 0x8a0,0x40,param_1 + 0x8e0),
            (int)uVar3 == 0)))) {
          return uVar3;
        }
        return 2;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x780,"tls_post_process_server_certificate");
      uVar2 = 0x2f;
      uVar3 = 0x17f;
    }
  }
LAB_009e0294:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

