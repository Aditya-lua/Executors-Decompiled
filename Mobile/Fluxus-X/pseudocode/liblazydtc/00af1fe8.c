/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af1fe8
 */

int X509_load_cert_file_ex
              (long param_1,void *param_2,int param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  int iVar2;
  BIO_METHOD *type;
  BIO *bp;
  long lVar3;
  X509 *pXVar4;
  ulong uVar5;
  undefined8 uVar6;
  X509 *local_48;
  
  local_48 = (X509 *)0x0;
  type = BIO_s_file();
  bp = BIO_new(type);
  if ((bp == (BIO *)0x0) || (lVar3 = BIO_ctrl(bp,0x6c,3,param_2), (int)lVar3 < 1)) {
    ERR_new();
    ERR_set_debug("crypto/x509/by_file.c",100,"X509_load_cert_file_ex");
    uVar6 = 0x80002;
LAB_00af20a0:
    ERR_set_error(0xb,uVar6,0);
  }
  else {
    if (1 < param_3 - 1U) {
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0x69,"X509_load_cert_file_ex");
      uVar6 = 100;
      goto LAB_00af20a0;
    }
    local_48 = (X509 *)X509_new_ex(param_4,param_5);
    if (local_48 == (X509 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0x6e,"X509_load_cert_file_ex");
      uVar6 = 0xc0100;
      goto LAB_00af20a0;
    }
    if (param_3 == 2) {
      pXVar4 = d2i_X509_bio(bp,&local_48);
      if (pXVar4 != (X509 *)0x0) {
        iVar2 = X509_STORE_add_cert(*(X509_STORE **)(param_1 + 0x18),local_48);
        goto LAB_00af20ac;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0x8a,"X509_load_cert_file_ex");
      uVar6 = 0x8000d;
      goto LAB_00af20a0;
    }
    if (param_3 != 1) {
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0x93,"X509_load_cert_file_ex");
      uVar6 = 0x87;
      goto LAB_00af20a0;
    }
    ERR_set_mark();
    pXVar4 = PEM_read_bio_X509_AUX(bp,&local_48,(undefined1 *)0x0,&DAT_002ab32c);
    iVar2 = 0;
    while (pXVar4 != (X509 *)0x0) {
      ERR_clear_last_mark();
      iVar1 = X509_STORE_add_cert(*(X509_STORE **)(param_1 + 0x18),local_48);
      if (iVar1 == 0) goto LAB_00af20a8;
      iVar2 = iVar2 + 1;
      X509_free(local_48);
      local_48 = (X509 *)0x0;
      ERR_set_mark();
      pXVar4 = PEM_read_bio_X509_AUX(bp,&local_48,(undefined1 *)0x0,&DAT_002ab32c);
    }
    uVar5 = ERR_peek_last_error();
    if ((iVar2 != 0) &&
       ((((int)(uint)uVar5 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar5) == 0x6c)) {
      ERR_pop_to_mark();
      goto LAB_00af20ac;
    }
    ERR_clear_last_mark();
  }
LAB_00af20a8:
  iVar2 = 0;
LAB_00af20ac:
  X509_free(local_48);
  BIO_free(bp);
  return iVar2;
}

