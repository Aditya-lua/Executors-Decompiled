/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbb2c
 */

int SSL_use_PrivateKey_ASN1(int pk,SSL *ssl,uchar *d,long len)

{
  int iVar1;
  EVP_PKEY *pkey;
  undefined8 *puVar2;
  uchar *local_28;
  
  puVar2 = *(undefined8 **)&ssl[3].ex_data.dummy;
  local_28 = d;
  pkey = (EVP_PKEY *)d2i_PrivateKey_ex(pk,0,&local_28,len,*puVar2,puVar2[0x88]);
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0xca,"SSL_use_PrivateKey_ASN1");
    ERR_set_error(0x14,0x8000d,0);
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_009bb8c0(ssl[3].d1,pkey);
    EVP_PKEY_free(pkey);
  }
  return iVar1;
}

