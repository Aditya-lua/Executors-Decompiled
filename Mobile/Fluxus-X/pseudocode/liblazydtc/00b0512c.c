/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0512c
 */

int SXNET_add_id_ulong(SXNET **psx,ulong lzone,char *user,int userlen)

{
  int iVar1;
  ASN1_INTEGER *a;
  
  a = ASN1_INTEGER_new();
  if ((a == (ASN1_INTEGER *)0x0) || (iVar1 = ASN1_INTEGER_set(a,lzone), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_sxnet.c",0x90,"SXNET_add_id_ulong");
    ERR_set_error(0x22,0xc0100,0);
  }
  else {
    iVar1 = SXNET_add_id_INTEGER(psx,a,user,userlen);
    if (iVar1 != 0) {
      return 1;
    }
  }
  ASN1_INTEGER_free(a);
  return 0;
}

