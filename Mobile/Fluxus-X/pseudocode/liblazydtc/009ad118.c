/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad118
 */

long SSL_load_client_CA_file_ex(void *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  X509 *pXVar5;
  long lVar6;
  X509_NAME *pXVar7;
  X509 *local_38;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  local_38 = (X509 *)0x0;
  lVar2 = OPENSSL_LH_new(&LAB_009ad334,&LAB_009ad344);
  if ((bp == (BIO *)0x0) || (lVar2 == 0)) {
    ERR_new();
    uVar4 = 0x280;
LAB_009ad278:
    ERR_set_debug("ssl/ssl_cert.c",uVar4,"SSL_load_client_CA_file_ex");
    ERR_set_error(0x14,0xc0100,0);
LAB_009ad290:
    lVar3 = 0;
    pXVar7 = (X509_NAME *)0x0;
    uVar4 = 0;
LAB_009ad29c:
    X509_NAME_free(pXVar7);
    OPENSSL_sk_pop_free(lVar3,X509_NAME_free);
  }
  else {
    local_38 = (X509 *)X509_new_ex(param_2,param_3);
    if (local_38 == (X509 *)0x0) {
      ERR_new();
      uVar4 = 0x286;
      goto LAB_009ad278;
    }
    lVar3 = BIO_ctrl(bp,0x6c,3,param_1);
    if ((int)lVar3 < 1) goto LAB_009ad290;
    uVar4 = OSSL_LIB_CTX_set0_default(param_2);
    pXVar5 = PEM_read_bio_X509(bp,&local_38,(undefined1 *)0x0,(void *)0x0);
    if (pXVar5 != (X509 *)0x0) {
      pXVar7 = (X509_NAME *)0x0;
      lVar3 = 0;
      do {
        if ((lVar3 == 0) && (lVar3 = OPENSSL_sk_new_null(), lVar3 == 0)) {
          ERR_new();
          ERR_set_debug("ssl/ssl_cert.c",0x294,"SSL_load_client_CA_file_ex");
          ERR_set_error(0x14,0xc0100,0);
          goto LAB_009ad29c;
        }
        pXVar7 = X509_get_subject_name(local_38);
        if (pXVar7 == (X509_NAME *)0x0) {
          pXVar7 = (X509_NAME *)0x0;
          goto LAB_009ad29c;
        }
        pXVar7 = X509_NAME_dup(pXVar7);
        if (pXVar7 == (X509_NAME *)0x0) goto LAB_009ad29c;
        lVar6 = OPENSSL_LH_retrieve(lVar2,pXVar7);
        if (lVar6 == 0) {
          OPENSSL_LH_insert(lVar2,pXVar7);
          iVar1 = OPENSSL_sk_push(lVar3,pXVar7);
          if (iVar1 == 0) goto LAB_009ad29c;
        }
        else {
          X509_NAME_free(pXVar7);
          pXVar7 = (X509_NAME *)0x0;
        }
        pXVar5 = PEM_read_bio_X509(bp,&local_38,(undefined1 *)0x0,(void *)0x0);
      } while (pXVar5 != (X509 *)0x0);
      goto LAB_009ad2b8;
    }
  }
  lVar3 = 0;
LAB_009ad2b8:
  OSSL_LIB_CTX_set0_default(uVar4);
  BIO_free(bp);
  X509_free(local_38);
  OPENSSL_LH_free(lVar2);
  if (lVar3 != 0) {
    ERR_clear_error();
  }
  return lVar3;
}

