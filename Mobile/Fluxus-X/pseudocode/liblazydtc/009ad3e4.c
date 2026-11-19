/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad3e4
 */

int SSL_add_file_cert_subjects_to_stack(stack_st_X509_NAME *stackCAs,char *file)

{
  int iVar1;
  undefined8 uVar2;
  BIO_METHOD *type;
  BIO *bp;
  long lVar3;
  X509 *pXVar4;
  X509_NAME *pXVar5;
  X509 *local_38;
  
  local_38 = (X509 *)0x0;
  uVar2 = OPENSSL_sk_set_cmp_func(stackCAs,&DAT_009ad51c);
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x2cc,"SSL_add_file_cert_subjects_to_stack");
    ERR_set_error(0x14,0xc0100,0);
  }
  else {
    lVar3 = BIO_ctrl(bp,0x6c,3,file);
    if (0 < (int)lVar3) {
      do {
        while( true ) {
          pXVar4 = PEM_read_bio_X509(bp,&local_38,(undefined1 *)0x0,(void *)0x0);
          if (pXVar4 == (X509 *)0x0) {
            ERR_clear_error();
            iVar1 = 1;
            goto LAB_009ad4e8;
          }
          pXVar5 = X509_get_subject_name(local_38);
          if (pXVar5 == (X509_NAME *)0x0) goto LAB_009ad4d8;
          pXVar5 = X509_NAME_dup(pXVar5);
          iVar1 = 0;
          if (pXVar5 == (X509_NAME *)0x0) goto LAB_009ad4e8;
          iVar1 = OPENSSL_sk_find(stackCAs,pXVar5);
          if (iVar1 < 0) break;
          X509_NAME_free(pXVar5);
        }
        iVar1 = OPENSSL_sk_push(stackCAs,pXVar5);
      } while (iVar1 != 0);
      X509_NAME_free(pXVar5);
    }
  }
LAB_009ad4d8:
  iVar1 = 0;
LAB_009ad4e8:
  BIO_free(bp);
  X509_free(local_38);
  OPENSSL_sk_set_cmp_func(stackCAs,uVar2);
  return iVar1;
}

