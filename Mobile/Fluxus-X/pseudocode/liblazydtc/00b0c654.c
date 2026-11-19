/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c654
 */

int i2d_re_X509_REQ_tbs(X509_REQ_INFO *param_1,uchar **param_2)

{
  int iVar1;
  
  if (param_1 == (X509_REQ_INFO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0x146,"i2d_re_X509_REQ_tbs");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  (param_1->enc).modified = 1;
  iVar1 = i2d_X509_REQ_INFO(param_1,param_2);
  return iVar1;
}

