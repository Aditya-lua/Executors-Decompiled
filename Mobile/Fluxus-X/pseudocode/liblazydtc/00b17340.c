/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17340
 */

undefined8
OSSL_HTTP_REQ_CTX_set_request_line
          (undefined4 *param_1,int param_2,char *param_3,long param_4,char *param_5)

{
  undefined *puVar1;
  undefined4 uVar2;
  int iVar3;
  BIO_METHOD *type;
  BIO *bio;
  
  if (param_1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0xaf,"OSSL_HTTP_REQ_CTX_set_request_line");
    uVar2 = 0xc0102;
LAB_00b17464:
    ERR_set_error(0x3d,uVar2,0);
  }
  else {
    BIO_free(*(BIO **)(param_1 + 0x16));
    type = BIO_s_mem();
    bio = BIO_new(type);
    *(BIO **)(param_1 + 0x16) = bio;
    if (bio == (BIO *)0x0) {
      return 0;
    }
    puVar1 = &DAT_002c8cc3;
    if (param_2 == 0) {
      puVar1 = &DAT_002d7152;
    }
    param_1[0x1a] = (uint)(param_2 != 0);
    iVar3 = BIO_printf(bio,"%s ",puVar1);
    if (iVar3 < 1) {
      return 0;
    }
    if (param_3 != (char *)0x0) {
      iVar3 = BIO_printf(*(BIO **)(param_1 + 0x16),"http://%s",param_3);
      if (iVar3 < 1) {
        return 0;
      }
      if ((param_4 != 0) && (iVar3 = BIO_printf(*(BIO **)(param_1 + 0x16),":%s",param_4), iVar3 < 1)
         ) {
        return 0;
      }
    }
    if (param_5 == (char *)0x0) {
      param_5 = "/";
    }
    else {
      iVar3 = strncmp(param_5,"http://",7);
      if (iVar3 == 0) {
        if (param_3 != (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/http/http_client.c",0xca,"OSSL_HTTP_REQ_CTX_set_request_line");
          uVar2 = 0x80106;
          goto LAB_00b17464;
        }
      }
      else if ((*param_5 != '/') && (iVar3 = BIO_printf(*(BIO **)(param_1 + 0x16),"/"), iVar3 < 1))
      {
        return 0;
      }
    }
    iVar3 = BIO_printf(*(BIO **)(param_1 + 0x16),"%s HTTP/1.0\r\n",param_5);
    if (0 < iVar3) {
      *(undefined8 *)(param_1 + 0x24) = 0;
      *param_1 = 0x1001;
      return 1;
    }
  }
  return 0;
}

