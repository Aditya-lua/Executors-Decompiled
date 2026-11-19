/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4328
 */

undefined8 ssl3_output_cert_chain(long param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  X509_STORE_CTX *ctx;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  X509 *x509;
  X509_STORE *store;
  
  iVar1 = WPACKET_start_sub_packet_len__(param_2,3);
  if (iVar1 == 0) {
    ERR_new();
    uVar4 = 0x3fe;
  }
  else {
    if ((param_3 != (undefined8 *)0x0) && (x509 = (X509 *)*param_3, x509 != (X509 *)0x0)) {
      lVar7 = param_3[2];
      if (lVar7 == 0) {
        puVar6 = *(undefined8 **)(param_1 + 0x9a8);
        lVar7 = puVar6[0x22];
        if ((lVar7 != 0) || ((*(uint *)(param_1 + 0x9f0) >> 3 & 1) != 0)) goto LAB_009e436c;
        store = *(X509_STORE **)(*(long *)(param_1 + 0x898) + 0x1c8);
        if ((store == (X509_STORE *)0x0) &&
           (store = (X509_STORE *)puVar6[5], store == (X509_STORE *)0x0)) {
          lVar7 = 0;
          goto LAB_009e436c;
        }
        ctx = (X509_STORE_CTX *)X509_STORE_CTX_new_ex(*puVar6,puVar6[0x88]);
        if (ctx == (X509_STORE_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x3bd,"ssl_add_cert_chain");
          iVar1 = 0xc0100;
          goto LAB_009e4544;
        }
        iVar1 = X509_STORE_CTX_init(ctx,store,x509,(stack_st_X509 *)0x0);
        if (iVar1 == 0) {
          X509_STORE_CTX_free(ctx);
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x3c2,"ssl_add_cert_chain");
          iVar1 = 0x8000b;
          goto LAB_009e4544;
        }
        X509_verify_cert(ctx);
        ERR_clear_error();
        uVar4 = X509_STORE_CTX_get0_chain(ctx);
        iVar1 = ssl_security_cert_chain(param_1,uVar4,0,0);
        if (iVar1 == 1) {
          iVar1 = OPENSSL_sk_num(uVar4);
          if (0 < iVar1) {
            iVar2 = 0;
            do {
              uVar5 = OPENSSL_sk_value(uVar4,iVar2);
              iVar3 = FUN_009e61e8(param_1,param_2,uVar5,iVar2);
              if (iVar3 == 0) {
                X509_STORE_CTX_free(ctx);
                return 0;
              }
              iVar2 = iVar2 + 1;
            } while (iVar2 < iVar1);
          }
          X509_STORE_CTX_free(ctx);
          goto LAB_009e4504;
        }
        X509_STORE_CTX_free(ctx);
        ERR_new();
        uVar4 = 0x3d8;
      }
      else {
LAB_009e436c:
        iVar1 = ssl_security_cert_chain(param_1,lVar7,x509,0);
        if (iVar1 == 1) {
          iVar1 = FUN_009e61e8(param_1,param_2,x509,0);
          if (iVar1 == 0) {
            return 0;
          }
          iVar1 = 1;
          while( true ) {
            iVar2 = OPENSSL_sk_num(lVar7);
            if (iVar2 <= iVar1 + -1) break;
            uVar4 = OPENSSL_sk_value(lVar7,iVar1 + -1);
            iVar2 = FUN_009e61e8(param_1,param_2,uVar4,iVar1);
            iVar1 = iVar1 + 1;
            if (iVar2 == 0) {
              return 0;
            }
          }
          goto LAB_009e4504;
        }
        ERR_new();
        uVar4 = 0x3e9;
      }
      ERR_set_debug("ssl/statem/statem_lib.c",uVar4,"ssl_add_cert_chain");
      goto LAB_009e4544;
    }
LAB_009e4504:
    iVar1 = WPACKET_close(param_2);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar4 = 0x406;
  }
  ERR_set_debug("ssl/statem/statem_lib.c",uVar4,"ssl3_output_cert_chain");
  iVar1 = 0xc0103;
LAB_009e4544:
  ossl_statem_fatal(param_1,0x50,iVar1,0);
  return 0;
}

