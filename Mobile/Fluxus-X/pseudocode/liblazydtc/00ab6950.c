/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab6950
 */

int PEM_do_header(EVP_CIPHER_INFO *cipher,uchar *data,long *len,undefined1 *callback,void *u)

{
  int iVar1;
  EVP_MD *md;
  EVP_CIPHER_CTX *ctx;
  undefined8 uVar2;
  EVP_CIPHER *type;
  uchar auStack_490 [1024];
  uchar auStack_90 [64];
  int local_44;
  
  local_44 = (int)*len;
  if (0x7fffffff < *len) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x1ac,"PEM_do_header");
    uVar2 = 0x80;
LAB_00ab69a4:
    ERR_set_error(9,uVar2,0);
    return 0;
  }
  if (cipher->cipher == (EVP_CIPHER *)0x0) {
    return 1;
  }
  if (callback == (undefined1 *)0x0) {
    iVar1 = PEM_def_callback((char *)auStack_490,0x400,0,u);
  }
  else {
    iVar1 = (*(code *)callback)();
  }
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x1b8,"PEM_do_header");
    uVar2 = 0x68;
    goto LAB_00ab69a4;
  }
  type = cipher->cipher;
  md = EVP_md5();
  iVar1 = EVP_BytesToKey(type,md,cipher->iv,auStack_490,iVar1,1,auStack_90,(uchar *)0x0);
  if (iVar1 == 0) {
    return 0;
  }
  ctx = EVP_CIPHER_CTX_new();
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
    return 0;
  }
  iVar1 = EVP_DecryptInit_ex(ctx,cipher->cipher,(ENGINE *)0x0,auStack_90,cipher->iv);
  if ((iVar1 != 0) && (iVar1 = EVP_DecryptUpdate(ctx,data,&local_44,data,local_44), iVar1 != 0)) {
    *len = (long)local_44;
    iVar1 = EVP_DecryptFinal_ex(ctx,data + local_44,&local_44);
    if (iVar1 != 0) {
      *len = *len + (long)local_44;
      goto LAB_00ab6b00;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/pem/pem_lib.c",0x1d3,"PEM_do_header");
  ERR_set_error(9,0x65,0);
  iVar1 = 0;
LAB_00ab6b00:
  EVP_CIPHER_CTX_free(ctx);
  OPENSSL_cleanse(auStack_490,0x400);
  OPENSSL_cleanse(auStack_90,0x40);
  return iVar1;
}

