/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1110
 */

int OCSP_check_nonce(OCSP_REQUEST *req,OCSP_BASICRESP *bs)

{
  uint uVar1;
  uint loc;
  int iVar2;
  X509_EXTENSION *ne;
  X509_EXTENSION *ne_00;
  ASN1_OCTET_STRING *a;
  ASN1_OCTET_STRING *b;
  
  uVar1 = X509v3_get_ext_by_NID((stack_st_X509_EXTENSION *)req[1].optionalSignature,0x16e,-1);
  loc = X509v3_get_ext_by_NID((stack_st_X509_EXTENSION *)bs[1].signatureAlgorithm,0x16e,-1);
  if ((int)(loc & uVar1) < 0) {
    uVar1 = 2;
  }
  else if (((int)uVar1 < 0) || (-1 < (int)loc)) {
    if (((int)uVar1 < 0) && (-1 < (int)loc)) {
      uVar1 = 3;
    }
    else {
      ne = X509v3_get_ext((stack_st_X509_EXTENSION *)req[1].optionalSignature,uVar1);
      ne_00 = X509v3_get_ext((stack_st_X509_EXTENSION *)bs[1].signatureAlgorithm,loc);
      a = X509_EXTENSION_get_data(ne);
      b = X509_EXTENSION_get_data(ne_00);
      iVar2 = ASN1_OCTET_STRING_cmp(a,b);
      uVar1 = (uint)(iVar2 == 0);
    }
  }
  else {
    uVar1 = 0xffffffff;
  }
  return uVar1;
}

