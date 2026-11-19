/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5aec
 */

int SSL_CTX_set_cipher_list(SSL_CTX *param_1,char *str)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  
  lVar3 = ssl_create_cipher_list
                    (param_1,param_1->sessions,&param_1->cipher_list_by_id,&param_1->cert_store,str,
                     *(undefined8 *)param_1->sid_ctx);
  if (lVar3 != 0) {
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      iVar5 = 0;
      iVar1 = 0;
      do {
        lVar4 = OPENSSL_sk_value(lVar3,iVar1);
        iVar1 = iVar1 + 1;
        if (*(int *)(lVar4 + 0x2c) < 0x304) {
          iVar5 = iVar5 + 1;
        }
        iVar2 = OPENSSL_sk_num(lVar3);
      } while (iVar1 < iVar2);
      if (iVar5 != 0) {
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xadb,"SSL_CTX_set_cipher_list");
    ERR_set_error(0x14,0xb9,0);
  }
  return 0;
}

