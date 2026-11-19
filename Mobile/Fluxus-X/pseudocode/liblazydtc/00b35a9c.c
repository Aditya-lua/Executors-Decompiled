/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35a9c
 */

undefined8
FUN_00b35a9c(BIO *param_1,code *param_2,void *param_3,undefined8 param_4,undefined8 param_5,
            undefined8 param_6,undefined8 param_7)

{
  uchar *out;
  int iVar1;
  int iVar2;
  uchar *data;
  EVP_CIPHER_CTX *ctx;
  uchar *ptr;
  undefined8 uVar3;
  EVP_CIPHER *cipher;
  uchar *in;
  uint local_4b0;
  uint uStack_4ac;
  uchar *local_4a8;
  uchar auStack_4a0 [24];
  int local_488;
  char acStack_484 [1024];
  uchar auStack_84 [5];
  undefined8 local_7f;
  undefined2 local_77;
  undefined1 local_75;
  uchar *local_70 [2];
  
  iVar1 = BIO_read(param_1,auStack_4a0,0x18);
  if (iVar1 != 0x18) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x3a0,"do_PVK_key_bio");
    uVar3 = 0x7c;
LAB_00b35c50:
    ERR_set_error(9,uVar3,0);
    return 0;
  }
  local_4a8 = auStack_4a0;
  iVar1 = ossl_do_PVK_header(&local_4a8,0x18,0,&uStack_4ac,&local_4b0);
  if (iVar1 == 0) {
    return 0;
  }
  iVar1 = uStack_4ac + local_4b0;
  data = CRYPTO_malloc(iVar1,"crypto/pem/pvkfmt.c",0x3a8);
  if (data == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x3aa,"do_PVK_key_bio");
    uVar3 = 0xc0100;
    goto LAB_00b35c50;
  }
  local_4a8 = data;
  iVar2 = BIO_read(param_1,data,iVar1);
  if (iVar2 != iVar1) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x3af,"do_PVK_key_bio");
    ERR_set_error(9,0x7c,0);
    uVar3 = 0;
    goto LAB_00b35df8;
  }
  local_70[0] = data;
  ctx = EVP_CIPHER_CTX_new();
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x344,"do_PVK_body_key");
    ERR_set_error(9,0xc0100,0);
    ptr = (uchar *)0x0;
    uVar3 = 0;
    cipher = (EVP_CIPHER *)0x0;
  }
  else if (uStack_4ac == 0) {
    ptr = (uchar *)0x0;
    cipher = (EVP_CIPHER *)0x0;
LAB_00b35d28:
    uVar3 = FUN_00b34d84(local_70,local_4b0,param_4,param_5);
  }
  else {
    if (param_2 == (code *)0x0) {
      iVar2 = PEM_def_callback(acStack_484,0x400,0,param_3);
      if (-1 < iVar2) goto LAB_00b35b98;
LAB_00b35d50:
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x354,"do_PVK_body_key");
      ERR_set_error(9,0x68,0);
      ptr = (uchar *)0x0;
LAB_00b35db8:
      cipher = (EVP_CIPHER *)0x0;
    }
    else {
      iVar2 = (*param_2)();
      if (iVar2 < 0) goto LAB_00b35d50;
LAB_00b35b98:
      ptr = CRYPTO_malloc(local_4b0 + 8,"crypto/pem/pvkfmt.c",0x357);
      if (ptr == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pem/pvkfmt.c",0x359,"do_PVK_body_key");
        ERR_set_error(9,0xc0100,0);
        goto LAB_00b35db8;
      }
      iVar2 = FUN_00b36a9c(auStack_84,data,(ulong)uStack_4ac,acStack_484,iVar2,param_6,param_7);
      if (iVar2 == 0) goto LAB_00b35db8;
      in = data + uStack_4ac + 8;
      *(undefined8 *)ptr = *(undefined8 *)(data + uStack_4ac);
      local_70[0] = in;
      if (local_4b0 < 8) {
        ERR_new();
        ERR_set_debug("crypto/pem/pvkfmt.c",0x364,"do_PVK_body_key");
        ERR_set_error(9,0x7d,0);
        goto LAB_00b35db8;
      }
      cipher = (EVP_CIPHER *)EVP_CIPHER_fetch(param_6,&DAT_002c750a,param_7);
      if ((cipher != (EVP_CIPHER *)0x0) &&
         (iVar2 = EVP_DecryptInit_ex(ctx,cipher,(ENGINE *)0x0,auStack_84,(uchar *)0x0), iVar2 != 0))
      {
        out = ptr + 8;
        iVar2 = EVP_DecryptUpdate(ctx,out,&local_488,in,local_4b0 - 8);
        if ((iVar2 != 0) &&
           (iVar2 = EVP_DecryptFinal_ex(ctx,out + local_488,&local_488), iVar2 != 0)) {
          if ((*(int *)(ptr + 8) == 0x32415352) || (*(int *)(ptr + 8) == 0x32535344)) {
LAB_00b35eb4:
            local_70[0] = ptr;
            goto LAB_00b35d28;
          }
          local_75 = 0;
          local_77 = 0;
          local_7f = 0;
          iVar2 = EVP_DecryptInit_ex(ctx,cipher,(ENGINE *)0x0,auStack_84,(uchar *)0x0);
          if ((iVar2 != 0) &&
             ((iVar2 = EVP_DecryptUpdate(ctx,out,&local_488,in,local_4b0 - 8), iVar2 != 0 &&
              (iVar2 = EVP_DecryptFinal_ex(ctx,out + local_488,&local_488), iVar2 != 0)))) {
            if ((*(int *)(ptr + 8) == 0x32415352) || (*(int *)(ptr + 8) == 0x32535344))
            goto LAB_00b35eb4;
            ERR_new();
            ERR_set_debug("crypto/pem/pvkfmt.c",0x37d,"do_PVK_body_key");
            ERR_set_error(9,0x65,0);
          }
        }
      }
    }
    uVar3 = 0;
  }
  EVP_CIPHER_CTX_free(ctx);
  EVP_CIPHER_free(cipher);
  if (ptr != (uchar *)0x0) {
    OPENSSL_cleanse(auStack_84,0x14);
    CRYPTO_free(ptr);
  }
LAB_00b35df8:
  CRYPTO_clear_free(data,(long)iVar1,"crypto/pem/pvkfmt.c",0x3b5);
  return uVar3;
}

