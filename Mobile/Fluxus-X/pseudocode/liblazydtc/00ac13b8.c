/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac13b8
 */

int PKCS7_add_signed_attribute(PKCS7_SIGNER_INFO *p7si,int nid,int type,void *data)

{
  int iVar1;
  
  iVar1 = FUN_00ac13c0(&p7si->auth_attr,nid,type);
  return iVar1;
}

