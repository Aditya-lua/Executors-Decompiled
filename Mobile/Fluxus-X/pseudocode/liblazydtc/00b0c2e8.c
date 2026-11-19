/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c2e8
 */

int X509_REQ_add_extensions_nid(X509_REQ *req,stack_st_X509_EXTENSION *exts,int nid)

{
  int iVar1;
  ASN1_ITEM *it;
  stack_st_X509_ATTRIBUTE *psVar2;
  uchar *local_28;
  
  local_28 = (uchar *)0x0;
  it = (ASN1_ITEM *)X509_EXTENSIONS_it();
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)exts,&local_28,it);
  if (iVar1 < 1) {
    return 0;
  }
  if (req == (X509_REQ *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0x106,"X509_REQ_add1_attr_by_NID");
    ERR_set_error(0xb,0xc0102,0);
  }
  else {
    psVar2 = X509at_add1_attr_by_NID
                       ((stack_st_X509_ATTRIBUTE **)&req[1].signature,nid,0x10,local_28,iVar1);
    if (psVar2 != (stack_st_X509_ATTRIBUTE *)0x0) {
      iVar1 = 1;
      *(undefined4 *)&req->signature = 1;
      goto LAB_00b0c38c;
    }
  }
  iVar1 = 0;
LAB_00b0c38c:
  CRYPTO_free(local_28);
  return iVar1;
}

