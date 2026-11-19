/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c420
 */

int X509_REQ_add_extensions(X509_REQ *req,stack_st_X509_EXTENSION *exts)

{
  int iVar1;
  
  iVar1 = X509_REQ_add_extensions_nid(req,exts,0xac);
  return iVar1;
}

