/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b360c0
 */

int i2b_PVK_bio_ex(BIO *param_1,undefined8 param_2,int param_3,code *param_4,void *param_5,
                  undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  int iVar2;
  uchar *ptr;
  EVP_CIPHER_CTX *ctx;
  EVP_CIPHER *cipher;
  undefined8 uVar3;
  uchar uVar4;
  int iVar5;
  uchar *puVar6;
  int local_488;
  uchar auStack_484 [5];
  undefined8 local_47f;
  undefined2 local_477;
  undefined1 local_475;
  char acStack_470 [1024];
  uchar *local_70 [2];
  
  local_70[0] = (uchar *)0x0;
  iVar1 = FUN_00b36458(0,param_2,0);
  if (iVar1 < 0) {
    return -1;
  }
  iVar5 = 0x28;
  if (param_3 == 0) {
    iVar5 = 0x18;
  }
  iVar5 = iVar1 + iVar5;
  ptr = CRYPTO_malloc(iVar5,"crypto/pem/pvkfmt.c",0x3fe);
  local_70[0] = ptr;
  if (ptr == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x400,"i2b_PVK");
    uVar3 = 0xc0100;
    goto LAB_00b36414;
  }
  ctx = EVP_CIPHER_CTX_new();
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
LAB_00b36270:
    cipher = (EVP_CIPHER *)0x0;
LAB_00b3638c:
    iVar5 = -1;
    puVar6 = (uchar *)0x0;
  }
  else {
    ptr[0] = '\x1e';
    ptr[1] = 0xf1;
    ptr[2] = 0xb5;
    ptr[3] = 0xb0;
    ptr[4] = '\0';
    ptr[5] = '\0';
    ptr[6] = '\0';
    ptr[7] = '\0';
    iVar2 = EVP_PKEY_get_id(param_2);
    ptr[0x10] = (param_3 != 0) << 4;
    ptr[0x15] = (uchar)((uint)iVar1 >> 8);
    ptr[0xc] = param_3 != 0;
    ptr[0x16] = (uchar)((uint)iVar1 >> 0x10);
    puVar6 = ptr + 0x18;
    uVar4 = '\x01';
    if (iVar2 != 6) {
      uVar4 = '\x02';
    }
    ptr[9] = '\0';
    ptr[10] = '\0';
    ptr[0xb] = '\0';
    ptr[0xd] = '\0';
    ptr[0xe] = '\0';
    ptr[0xf] = '\0';
    ptr[0x11] = '\0';
    ptr[0x12] = '\0';
    ptr[0x13] = '\0';
    ptr[0x14] = (uchar)iVar1;
    ptr[0x17] = (uchar)((uint)iVar1 >> 0x18);
    ptr[8] = uVar4;
    local_70[0] = puVar6;
    if (param_3 != 0) {
      iVar2 = RAND_bytes_ex(param_6,puVar6,0x10,0);
      if (iVar2 < 1) goto LAB_00b36270;
      local_70[0] = ptr + 0x28;
      FUN_00b36458(local_70,param_2,0);
      if (param_4 == (code *)0x0) {
        iVar2 = PEM_def_callback(acStack_470,0x400,1,param_5);
      }
      else {
        iVar2 = (*param_4)();
      }
      if (iVar2 < 1) {
        ERR_new();
        ERR_set_debug("crypto/pem/pvkfmt.c",0x427,"i2b_PVK");
        ERR_set_error(9,0x68,0);
      }
      else {
        iVar2 = FUN_00b36a9c(auStack_484,puVar6,0x10,acStack_470,iVar2,param_6,param_7);
        if (iVar2 != 0) {
          cipher = (EVP_CIPHER *)EVP_CIPHER_fetch(param_6,&DAT_002c750a,param_7);
          if (cipher != (EVP_CIPHER *)0x0) {
            if (param_3 == 1) {
              local_475 = 0;
              local_477 = 0;
              local_47f = 0;
            }
            local_70[0] = ptr + 0x30;
            iVar2 = EVP_EncryptInit_ex(ctx,cipher,(ENGINE *)0x0,auStack_484,(uchar *)0x0);
            if (iVar2 != 0) {
              OPENSSL_cleanse(auStack_484,0x14);
              iVar1 = EVP_EncryptUpdate(ctx,local_70[0],&local_488,local_70[0],iVar1 + -8);
              if ((iVar1 != 0) &&
                 (iVar1 = EVP_EncryptFinal_ex(ctx,local_70[0] + local_488,&local_488), iVar1 != 0))
              goto LAB_00b36260;
            }
          }
          goto LAB_00b3638c;
        }
      }
      cipher = (EVP_CIPHER *)0x0;
      goto LAB_00b3638c;
    }
    FUN_00b36458(local_70,param_2,0);
    cipher = (EVP_CIPHER *)0x0;
LAB_00b36260:
    puVar6 = ptr;
  }
  EVP_CIPHER_CTX_free(ctx);
  EVP_CIPHER_free(cipher);
  if (puVar6 == (uchar *)0x0) {
    CRYPTO_free(ptr);
  }
  if (iVar5 < 0) {
    return -1;
  }
  iVar1 = BIO_write(param_1,puVar6,iVar5);
  CRYPTO_free(puVar6);
  if (iVar1 == iVar5) {
    return iVar5;
  }
  ERR_new();
  ERR_set_debug("crypto/pem/pvkfmt.c",0x45c,"i2b_PVK_bio_ex");
  uVar3 = 0x76;
LAB_00b36414:
  ERR_set_error(9,uVar3,0);
  return -1;
}

