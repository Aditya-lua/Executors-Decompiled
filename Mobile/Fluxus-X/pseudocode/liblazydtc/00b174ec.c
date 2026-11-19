/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b174ec
 */

bool OSSL_HTTP_REQ_CTX_add1_header(long param_1,char *param_2,char *param_3)

{
  undefined4 uVar1;
  int iVar2;
  
  if ((param_1 == 0) || (param_2 == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0xe0,"OSSL_HTTP_REQ_CTX_add1_header");
    uVar1 = 0xc0102;
  }
  else {
    if (*(BIO **)(param_1 + 0x58) != (BIO *)0x0) {
      iVar2 = BIO_puts(*(BIO **)(param_1 + 0x58),param_2);
      if (iVar2 < 1) {
        return false;
      }
      if (param_3 != (char *)0x0) {
        iVar2 = BIO_write(*(BIO **)(param_1 + 0x58),&DAT_002d4f75,2);
        if (iVar2 != 2) {
          return false;
        }
        iVar2 = BIO_puts(*(BIO **)(param_1 + 0x58),param_3);
        if (iVar2 < 1) {
          return false;
        }
      }
      iVar2 = BIO_write(*(BIO **)(param_1 + 0x58),&DAT_002b917a,2);
      return iVar2 == 2;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0xe4,"OSSL_HTTP_REQ_CTX_add1_header");
    uVar1 = 0xc0101;
  }
  ERR_set_error(0x3d,uVar1,0);
  return false;
}

