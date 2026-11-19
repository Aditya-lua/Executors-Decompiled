/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac14c4
 */

int PKCS7_add_attribute(PKCS7_SIGNER_INFO *p7si,int nid,int atrtype,void *value)

{
  int iVar1;
  
  iVar1 = FUN_00ac13c0(&p7si->unauth_attr,nid,atrtype);
  return iVar1;
}

