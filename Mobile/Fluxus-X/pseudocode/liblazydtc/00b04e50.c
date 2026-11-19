/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04e50
 */

int SXNET_add_id_asc(SXNET **psx,char *zone,char *user,int userlen)

{
  int iVar1;
  ASN1_INTEGER *izone;
  
  izone = s2i_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,zone);
  if (izone == (ASN1_INTEGER *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_sxnet.c",0x7d,"SXNET_add_id_asc");
    ERR_set_error(0x22,0x83,0);
  }
  else {
    iVar1 = SXNET_add_id_INTEGER(psx,izone,user,userlen);
    if (iVar1 != 0) {
      return 1;
    }
    ASN1_INTEGER_free(izone);
  }
  return 0;
}

