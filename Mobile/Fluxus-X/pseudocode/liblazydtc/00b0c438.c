/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c438
 */

X509_ATTRIBUTE * X509_REQ_delete_attr(X509_REQ *req,int loc)

{
  X509_ATTRIBUTE *pXVar1;
  
  if (req == (X509_REQ *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0xdd,"X509_REQ_delete_attr");
    ERR_set_error(0xb,0xc0102,0);
    pXVar1 = (X509_ATTRIBUTE *)0x0;
  }
  else {
    pXVar1 = X509at_delete_attr((stack_st_X509_ATTRIBUTE *)req[1].signature,loc);
    if (pXVar1 != (X509_ATTRIBUTE *)0x0) {
      *(undefined4 *)&req->signature = 1;
    }
  }
  return pXVar1;
}

