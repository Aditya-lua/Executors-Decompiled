/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5ba8
 */

int SSL_set_cipher_list(SSL *s,char *str)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  
  lVar3 = ssl_create_cipher_list
                    (*(undefined8 *)&s[3].ex_data.dummy,
                     *(undefined8 *)&s[1].next_proto_negotiated_len,&s[1].initial_ctx,
                     &s[1].next_proto_negotiated,str,s[3].d1);
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
    ERR_set_debug("ssl/ssl_lib.c",0xaed,"SSL_set_cipher_list");
    ERR_set_error(0x14,0xb9,0);
  }
  return 0;
}

