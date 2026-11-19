/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c57c
 */

int X509_REQ_add1_attr_by_txt(X509_REQ *req,char *attrname,int type,uchar *bytes,int len)

{
  int iVar1;
  stack_st_X509_ATTRIBUTE *psVar2;
  
  if (req == (X509_REQ *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0x115,"X509_REQ_add1_attr_by_txt");
    ERR_set_error(0xb,0xc0102,0);
    iVar1 = 0;
  }
  else {
    psVar2 = X509at_add1_attr_by_txt
                       ((stack_st_X509_ATTRIBUTE **)&req[1].signature,attrname,type,bytes,len);
    iVar1 = 0;
    if (psVar2 != (stack_st_X509_ATTRIBUTE *)0x0) {
      iVar1 = 1;
      *(undefined4 *)&req->signature = 1;
    }
  }
  return iVar1;
}

