/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c2d8
 */

int X509_REQ_get_attr_by_NID(X509_REQ *req,int nid,int lastpos)

{
  int iVar1;
  
  iVar1 = X509at_get_attr_by_NID((stack_st_X509_ATTRIBUTE *)req[1].signature,nid,lastpos);
  return iVar1;
}

