/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab11e0
 */

int OCSP_copy_nonce(OCSP_BASICRESP *resp,OCSP_REQUEST *req)

{
  int loc;
  uint uVar1;
  X509_EXTENSION *ex;
  stack_st_X509_EXTENSION *psVar2;
  
  loc = X509v3_get_ext_by_NID((stack_st_X509_EXTENSION *)req[1].optionalSignature,0x16e,-1);
  if (loc < 0) {
    uVar1 = 2;
  }
  else {
    ex = X509v3_get_ext((stack_st_X509_EXTENSION *)req[1].optionalSignature,loc);
    psVar2 = X509v3_add_ext((stack_st_X509_EXTENSION **)&resp[1].signatureAlgorithm,ex,-1);
    uVar1 = (uint)(psVar2 != (stack_st_X509_EXTENSION *)0x0);
  }
  return uVar1;
}

