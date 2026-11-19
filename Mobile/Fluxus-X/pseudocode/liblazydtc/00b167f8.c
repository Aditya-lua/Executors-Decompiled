/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b167f8
 */

int X509_CRL_digest(X509_CRL *data,EVP_MD *type,uchar *md,uint *len)

{
  int iVar1;
  undefined8 uVar2;
  ASN1_INTEGER *pAVar3;
  
  if (type == (EVP_MD *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x236,"X509_CRL_digest");
    ERR_set_error(0xb,0xc0102,0);
    iVar1 = 0;
  }
  else {
    iVar1 = EVP_MD_is_a(type,&DAT_002d142e);
    if ((iVar1 == 0) || (((ulong)data[1].sig_alg & 0x10010000000000) != 0x10000000000)) {
      uVar2 = X509_CRL_it();
      iVar1 = ossl_asn1_item_digest_ex(uVar2,type,data,md,len,data[1].meth_data,data[2].crl);
      return iVar1;
    }
    if (len != (uint *)0x0) {
      *len = 0x14;
    }
    iVar1 = 1;
    *(undefined4 *)(md + 0x10) = *(undefined4 *)(data[1].sha1_hash + 8);
    pAVar3 = data[1].base_crl_number;
    *(undefined8 *)(md + 8) = *(undefined8 *)data[1].sha1_hash;
    *(ASN1_INTEGER **)md = pAVar3;
  }
  return iVar1;
}

