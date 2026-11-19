/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb78c
 */

int SSL_use_certificate_ASN1(SSL *ssl,uchar *d,int len)

{
  undefined4 uVar1;
  int iVar2;
  X509 *pXVar3;
  undefined8 *puVar4;
  X509 *local_30;
  uchar *local_28;
  
  puVar4 = *(undefined8 **)&ssl[3].ex_data.dummy;
  local_28 = d;
  local_30 = (X509 *)X509_new_ex(*puVar4,puVar4[0x88]);
  if (local_30 == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x67,"SSL_use_certificate_ASN1");
    uVar1 = 0xc0100;
  }
  else {
    pXVar3 = d2i_X509(&local_30,&local_28,(long)len);
    if (pXVar3 != (X509 *)0x0) {
      iVar2 = SSL_use_certificate(ssl,local_30);
      X509_free(local_30);
      return iVar2;
    }
    X509_free(local_30);
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x6d,"SSL_use_certificate_ASN1");
    uVar1 = 0x8000d;
  }
  ERR_set_error(0x14,uVar1,0);
  return 0;
}

